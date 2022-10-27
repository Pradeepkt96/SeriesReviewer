package com.sample.SeriesReview.model;

import javax.persistence.*;

@Entity
@Table(name = "Review_Info")
public class ReviewEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;
    @Column(name = "createdDate")
    private String createdDate;
    @Column(name = "modifiedDate")
    private String modifiedDate;
    @Column(name = "score")
    private Integer score;
    @Column(name = "SerID")
    private Integer seriesId;
    @Column(name = "UID")
    private Integer userId;
    @Column(name = "RYear")
    private String RYear;

    @Column(name = "name")
    private String name;

    @Column(name = "availability")
    private String availability;

    @Column(name = "category")
    private String category;

    public ReviewEntity() {

    }

    public ReviewEntity(String createdDate, String modifiedDate, Integer score, Integer seriesId, Integer userId, String RYear, String name, String availability, String category) {
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.score = score;
        this.seriesId = seriesId;
        this.userId = userId;
        this.RYear = RYear;
        this.name = name;
        this.availability = availability;
        this.category = category;
    }

    public String getRYear() {
        return RYear;
    }

    public void setRYear(String RYear) {
        this.RYear = RYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ReviewEntity{" +
                "createdDate='" + createdDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", score=" + score +
                ", seriesId=" + seriesId +
                ", userId=" + userId +
                ", Year='" + RYear + '\'' +
                '}';
    }
}
