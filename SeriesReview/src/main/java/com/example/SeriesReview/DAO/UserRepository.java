package com.example.SeriesReview.DAO;

import com.example.SeriesReview.web.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
//    UserEntity findByUsername(String username);
//
//    @Query(value = "SELECT users.* FROM users WHERE  user_id > 1  ORDER BY user_id ASC", nativeQuery = true)
//    List<UserEntity> findAll(String );
}