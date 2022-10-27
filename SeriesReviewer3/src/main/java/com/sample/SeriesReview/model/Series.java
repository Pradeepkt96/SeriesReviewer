package com.sample.SeriesReview.model;
import javax.persistence.*;

@Entity
@Table(name = "Series_Info")
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SerId;

    @Column(name = "yor")
    private String year;
    @Column(name = "title")
    private String name;
    @Column(name = "availability")
    private String availability;
    @Column(name = "category")
    private String category;

    public Series() {
    }

    public Series(String year, String name, String availability, String category) {
        this.year = year;
        this.name = name;
        this.availability = availability;
        this.category = category;
    }

    public Integer getSerId() {
        return SerId;
    }

    public void setSerId(Integer serId) {
        SerId = serId;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAvailability ()
    {
        return availability;
    }

    public void setAvailability (String availability)
    {
        this.availability = availability;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    @Override
    public String toString()
    {
        return "Series [year = "+year+", name = "+name+", availability = "+availability+", category = "+category+"]";
    }
}
