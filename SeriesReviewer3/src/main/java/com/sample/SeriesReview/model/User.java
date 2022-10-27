package com.sample.SeriesReview.model;
import javax.persistence.*;

@Entity
@Table(name = "Users_Info")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer userid;
    @Column(name = "userName")
    private String userName;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "password")
    private String password;
    @Column(name = "dob")
    private String dateOfBirth;

    public User() {
    }

    public User(String userName, String firstName, String lastName, String password, String dateOfBirth ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.userName = userName;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public String getPassword ()
    {
        return password;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    public String getDateOfBirth ()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth (String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName ()
    {
        return userName;
    }

    public void setUserName (String userName)
    {
        this.userName = userName;
    }

    @Override
    public String toString()
    {
        return "User [firstName = "+firstName+", lastName = "+lastName+", password = "+password+", dob = "+dateOfBirth+", userName = "+userName+"]";
    }
}