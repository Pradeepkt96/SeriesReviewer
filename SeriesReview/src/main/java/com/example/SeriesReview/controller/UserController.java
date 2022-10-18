package com.example.SeriesReview.controller;

import com.example.SeriesReview.exception.ResourceNotFoundException;
import com.example.SeriesReview.repository.UserRepository;
import com.example.SeriesReview.web.SeriesEntity;
import com.example.SeriesReview.web.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

//    @PostMapping("/addUser")
//    public UserEntity createUser(@RequestBody SeriesEntity user)
//            throws ResourceNotFoundException {
//        return userRepository.save(user);
//    }
}
