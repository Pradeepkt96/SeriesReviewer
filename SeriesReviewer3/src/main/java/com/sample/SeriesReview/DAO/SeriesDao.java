package com.sample.SeriesReview.DAO;

import com.sample.SeriesReview.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesDao extends JpaRepository<Series,Integer> {
}
