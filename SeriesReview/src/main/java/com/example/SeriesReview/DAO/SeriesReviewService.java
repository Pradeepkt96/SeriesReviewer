//package com.example.SeriesReview.DAO;
//
//import com.example.SeriesReview.exception.ResourceNotFoundException;
//import com.example.SeriesReview.repository.SeriesReviewRepository;
//import com.example.SeriesReview.web.SeriesEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class SeriesReviewService {
//@Autowired
//    SeriesReviewRepository reviewRepository;
//    private static Optional<SeriesEntity> reviewer;
//    public SeriesEntity getSeriesReviewerById(Long sid) throws ResourceNotFoundException
//    {
//        Optional<SeriesEntity> reviewer = reviewRepository.findById(sid);
//
//        if(reviewer.isPresent()) {
//            return reviewer.get();
//        } else {
//            throw new ResourceNotFoundException("Series Data not found");
//        }
//    }
//
//    public SeriesEntity createSeriesReview(SeriesEntity review) throws ResourceNotFoundException
//    {
//        reviewer = reviewRepository.findById(review.getSerId());
//
//        if(reviewer.isPresent())
//        {
//            SeriesEntity newReview = reviewer.get();
//            newReview.setSerId(review.getSerId());
//            newReview.setName(review.getName());
//            newReview.setYear(review.getYear());
//            newReview.setCategory(review.getCategory());
//            newReview.setAvailability(review.getAvailability());
//
//            newReview = reviewRepository.save(newReview);
//
//            return newReview;
//        } else {
//            review = reviewRepository.save(review);
//            return review;
//        }
//    }
//}
