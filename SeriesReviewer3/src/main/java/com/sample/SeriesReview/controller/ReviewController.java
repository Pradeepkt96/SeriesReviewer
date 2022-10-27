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

import java.util.List;

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
    public ReviewEntity topInYear(@PathVariable String year, @PathVariable Integer score) {
        {
            Integer scoreValue = score;
            List<ReviewEntity> reviewList = review.findAll();
            for (ReviewEntity RE : reviewList) {

                if (year.equals(RE.getRYear()) && scoreValue == RE.getScore()) {
                    return RE;
                }
            }
            return null;
        }
    }

    @RequestMapping(value = "/topInGenre/{genre}/{score}", method = RequestMethod.GET)
    public ReviewEntity topInGenre(@PathVariable String genre, @PathVariable Integer score) {
        {
            Integer scoreValue = score.intValue();
            List<ReviewEntity> reviewList = review.findAll();
            for (ReviewEntity reviewEntity : reviewList) {

                if (genre.equals(reviewEntity.getCategory()) && scoreValue == reviewEntity.getScore().intValue()) {
                    return reviewEntity;
                }
            }
            return null;
        }
    }
}