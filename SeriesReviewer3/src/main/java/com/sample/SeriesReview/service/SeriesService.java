package com.sample.SeriesReview.service;


import com.sample.SeriesReview.model.Series;
import com.sample.SeriesReview.DAO.SeriesDao;
import com.sample.SeriesReview.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeriesService {

    @Autowired
    private SeriesDao repo;


    public List<Series> getSeries() {

        return repo.findAll();
    }

    public String save(Series seriesInfo) {

        repo.save(seriesInfo);
        return "series added ";

    }
    public Optional<Series> findSeries(Integer id) {

        return repo.findById(id);
    }

    public List<Series> listAll() {return (List<Series>) repo.findAll();
    }
}
