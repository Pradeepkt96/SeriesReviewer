package com.example.SeriesReview;

import com.example.SeriesReview.DAO.SeriesReviewRepository;
import com.example.SeriesReview.web.SeriesEntity;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@SpringBootTest
public class SeriesReviewTest {
    @MockBean
    private SeriesReviewRepository repository;

    public void getSeriesReviewerById() {
        when(repository.findAll()).thenReturn((List<SeriesEntity>) Stream.of(new SeriesEntity("Strager Things","2018","DRAMA",true)));
    }
}