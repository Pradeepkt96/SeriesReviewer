package com.example.SeriesReview;

import com.example.SeriesReview.DAO.SeriesReviewRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@SpringBootTest
class SeriesReviewApplicationTests {
	@Autowired
	private SeriesReviewRepository repository;

//	@Test
//	void contextLoads() {
//		when(repository.findAll().thenReturn(Stream)
//	}

}
