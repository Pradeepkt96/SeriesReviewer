package com.example.SeriesReview.DAO;

import com.example.SeriesReview.web.SeriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesReviewRepository extends JpaRepository<SeriesEntity, Long> {
}