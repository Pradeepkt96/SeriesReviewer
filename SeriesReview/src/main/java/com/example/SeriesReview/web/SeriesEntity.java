package com.example.SeriesReview.web;

import javax.persistence.*;
@Entity
@Table(name = "SERIES")
public class SeriesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SerId;

    @Column(name = "title")
    private String title;

    @Column(name = "yor")
    private String yor;

    @Column(name = "category")
    private String category;

    @Column(name = "availability")
    private Boolean availability;

    public Long getSerId() {
        return SerId;
    }

    public void setSerId(Long serId) {
        SerId = serId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYor() {
        return yor;
    }

    public void setYor(String yor) {
        this.yor = yor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "SeriesEntity [SerId=" + SerId + ", title=" + title +
                ", Year of Release=" + yor + ", category=" + category + ", available=" + availability + "]";
    }
}
