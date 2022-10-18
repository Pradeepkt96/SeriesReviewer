package com.example.SeriesReview.repository;

import com.example.SeriesReview.web.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
