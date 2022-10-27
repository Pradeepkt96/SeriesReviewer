package com.sample.SeriesReview.controller;

import com.sample.SeriesReview.model.User;
import com.sample.SeriesReview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired private UserService usr;


    @GetMapping("/Users")
    public List<User> showUsersList()
    {
       return usr.listall();

    }

    @PostMapping("/addUser")
    public String add(@RequestBody User user) {
        return usr.saveUser(user);

    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Integer id)
    {
        return usr.find(id);
    }
}