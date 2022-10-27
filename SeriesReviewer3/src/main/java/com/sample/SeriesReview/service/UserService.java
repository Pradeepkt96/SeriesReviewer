package com.sample.SeriesReview.service;

import com.sample.SeriesReview.model.User;
import com.sample.SeriesReview.DAO.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired private UserDao repo;
    public List<User> listall()
    {
       return (List<User>) repo.findAll();
    }

    public String saveUser(User user) {
        repo.save(user);
        return "User registered successfully!";
    }

    public Optional<User> find(Integer id) {

        return repo.findById(id);
    }

}
