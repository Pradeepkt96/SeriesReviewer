package com.example.SeriesReview.controller;

//import com.example.SeriesReview.DAO.ReviewRepository;
import com.example.SeriesReview.exception.ResourceNotFoundException;
import com.example.SeriesReview.DAO.SeriesReviewRepository;
import com.example.SeriesReview.DAO.UserRepository;
//import com.example.SeriesReview.web.ReviewBody;
//import com.example.SeriesReview.web.ReviewEntity;
import com.example.SeriesReview.web.UserEntity;
import com.example.SeriesReview.web.SeriesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesReviewController {
    @Autowired
    private SeriesReviewRepository seriesRepository;

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private ReviewRepository reviewRepository;

    @GetMapping("{sid}")
    public ResponseEntity<SeriesEntity> getSeriesReviewerById(@PathVariable  long sid)
            throws ResourceNotFoundException {
         SeriesEntity review = seriesRepository.findById(sid)
                 .orElseThrow(()-> new ResourceNotFoundException("User not exists with id"+ sid));
       return ResponseEntity.ok(review);
    }

    @PostMapping("/addSeries")
    public SeriesEntity createSeriesReview(@RequestBody SeriesEntity series)
            throws ResourceNotFoundException {
       return seriesRepository.save(series);
    }

    @PostMapping("/addUser")
    public UserEntity createUser(@RequestBody UserEntity user)
            throws ResourceNotFoundException {
        return userRepository.save(user);
    }

//    @PostMapping("/addReview")
//    public ReviewEntity createReview(@RequestBody ReviewEntity review)
//            throws ResourceNotFoundException {
//        List<ReviewEntity> reviewer = reviewRepository.findAll();
//    }
}