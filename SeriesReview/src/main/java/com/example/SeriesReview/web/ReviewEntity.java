//package com.example.SeriesReview.web;
//
//import javax.persistence.*;
//import java.time.Instant;
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//import java.time.format.DateTimeFormatter;
//
//@Entity
//@Table(name = "REVIEW_INFO")
//public class ReviewEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long reviewId;
//
//    @Column(name = "score")
//    private Integer score;
//    @Column(name = "createdDate")
//    private Long createdDate;
//
//    @OneToOne
//    private UserEntity user;
//
//    @ManyToOne
//    private SeriesEntity series;
//
//    public Long getReviewId() {  return reviewId;    }
//
//    public void setReviewId(Long reviewId) {    this.reviewId = reviewId;  }
//
//    public Integer getScore() {     return score;  }
//
//    public void setScore(Integer score) {    this.score = score;  }
//
//    public ReviewEntity() {
//    }
//
//    public ReviewEntity(Integer score, Long createdDate, UserEntity user, SeriesEntity series) {
//        this.score = score;
//        this.createdDate = createdDate;
//        this.user = user;
//        this.series = series;
//    }
//
//    public Long getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Long createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public UserEntity getUser() {
//        return user;
//    }
//
//    public void setUser(UserEntity user) {
//        this.user = user;
//    }
//
//    public SeriesEntity getSeries() {
//        return series;
//    }
//
//    public void setSeries(SeriesEntity series) {
//        this.series = series;
//    }
//
//    public String getDateTimeString(){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
//        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.ofEpochMilli(getCreatedDate()), ZoneId.systemDefault());
//        return ldt.format(formatter);
//    }
//
//    @Override
//    public String toString() {
//        return "ReviewEntity [createdDate=" + createdDate + "createdBy" + user + "score=" + score +
//                 ", series=" + series +  "]";
//    }
//}