package com.sample.SeriesReview.controller;


import com.sample.SeriesReview.model.Series;
import com.sample.SeriesReview.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SeriesController {

 @Autowired
 private SeriesService service;


    @GetMapping("/series")
    public List<Series> getSeries()
    {
        return service.getSeries();
    }

    @PostMapping("/addSeries")
    public String addSeries(@RequestBody Series seriesInfo)
    {
        return service.save(seriesInfo);
    }

    @GetMapping("/series/{id}")
    public Optional<Series> getUser(@PathVariable Integer id)
    {
        return service.findSeries(id);
    }
}
