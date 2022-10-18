package com.example.SeriesReview.controller;

//import com.example.SeriesReview.DAO.SeriesReviewService;
import com.example.SeriesReview.exception.ResourceNotFoundException;
import com.example.SeriesReview.repository.SeriesReviewRepository;
import com.example.SeriesReview.repository.UserRepository;
import com.example.SeriesReview.web.SeriesEntity;
import com.example.SeriesReview.web.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesReviewController {
@Autowired
    private SeriesReviewRepository reviewRepository;

     @GetMapping("{sid}")
    public ResponseEntity<SeriesEntity> getSeriesReviewerById(@PathVariable  long sid)
            throws ResourceNotFoundException {
         SeriesEntity review = reviewRepository.findById(sid)
                 .orElseThrow(()-> new ResourceNotFoundException("User not exists with id"+ sid));
       return ResponseEntity.ok(review);
    }

    @PostMapping("/addSeries")
    public SeriesEntity createSeriesReview(@RequestBody SeriesEntity reviewer)
            throws ResourceNotFoundException {
       return reviewRepository.save(reviewer);
    }
}
