package com.sample.SeriesReview.controller;

import com.sample.SeriesReview.model.ReviewBody;
import com.sample.SeriesReview.model.ReviewEntity;
import com.sample.SeriesReview.model.Series;
import com.sample.SeriesReview.model.User;
import com.sample.SeriesReview.DAO.ReviewDao;
import com.sample.SeriesReview.service.SeriesService;
import com.sample.SeriesReview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class ReviewController {

    @Autowired
    public ReviewDao review;

    @Autowired
    private SeriesService seriesService;

    @Autowired
    private UserService userService;

    @PostMapping("/addReview")
    public String addReview(@RequestBody ReviewBody reviewBody) {
        String tempName = reviewBody.getCreatedBy();
        Integer tempSId = reviewBody.getSeriesId();
        List<User> usersInfoList = userService.listall();
        List<Series> seriesInfoList = seriesService.listAll();
        Integer tempUserid = 0;
        Integer tempSerId = 0;
        ReviewEntity entity = new ReviewEntity();

        for (Series s : seriesInfoList) {

            if (tempSId==s.getSerId()) {
                tempSerId = s.getSerId();
                entity.setSeriesId(tempSerId);
                entity.setAvailability(s.getAvailability());
                entity.setCategory(s.getCategory());
                entity.setName(s.getName());
                entity.setRYear(s.getYear());
                break;
            }
        }

        for (User u : usersInfoList) {

            if (tempName.equals(u.getUserName())) {
                tempUserid = u.getUserid();
                entity.setUserId(tempUserid);
                break;
            }
        }

        entity.setCreatedDate(reviewBody.getCreatedDate());
        entity.setModifiedDate(reviewBody.getModifiedDate());
        entity.setScore(reviewBody.getScore());
        entity.setSeriesId(reviewBody.getSeriesId());

        review.save(entity);

        return "review added successfully";
    }

    @RequestMapping(value = "/topInYear/{year}/{score}", method = RequestMethod.GET)
    public List<ReviewEntity> topInYear(@PathVariable String year, @PathVariable Integer score)
    {
            Integer scoreValue = score;
            List<ReviewEntity> reviewList = review.findAll();
            List<ReviewEntity> yearList = new ArrayList<>();
            List<ReviewEntity> reviewYearList =new ArrayList<>();
//        System.out.println("yearList"+reviewList);
            for (ReviewEntity RE : reviewList) {
                  if (year.toLowerCase().equals(RE.getRYear().toLowerCase())) {
//                      System.out.println("hello"+RE);
                      yearList.add(RE);
                  }
            }

            reviewYearList = yearList.stream()
                .sorted((o1, o2) -> o1.getScore()- o2.getScore()).collect(Collectors.toList());
//            System.out.println("sortedlist"+reviewSortedList);
            return reviewYearList;
    }

    @RequestMapping(value = "/topInGenre/{genre}/{score}", method = RequestMethod.GET)
    public List<ReviewEntity> topInGenre(@PathVariable String genre, @PathVariable Integer score)
    {
            Integer scoreValue = score.intValue();
            List<ReviewEntity> reviewList = review.findAll();
            List<ReviewEntity> genreList = new ArrayList<>();
            List<ReviewEntity> reviewGenreList =new ArrayList<>();
            for (ReviewEntity RE : reviewList) {
                if (genre.equals(RE.getCategory())) {
                    genreList.add(RE);
                }
            }
        reviewGenreList = genreList.stream()
                .sorted((o1, o2) -> o1.getScore()- o2.getScore()).collect(Collectors.toList());
            return reviewGenreList;
    }
}