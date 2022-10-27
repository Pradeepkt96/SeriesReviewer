package com.sample.SeriesReview.DAO;

import com.sample.SeriesReview.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserDao extends JpaRepository<User, Integer> {
}
