package com.sample.SeriesReview.DAO;

import com.sample.SeriesReview.model.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewDao extends JpaRepository<ReviewEntity,Long> {
}
