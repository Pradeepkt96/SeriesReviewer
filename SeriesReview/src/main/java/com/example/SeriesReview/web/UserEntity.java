package com.example.SeriesReview.web;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class UserEntity {
    private String firstName;

    private String lastName;

    private String password;

    private String dob;

    private String userName;

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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
        return "ClassPojo [firstName = "+firstName+", lastName = "+lastName+", password = "+password+
                ", dateOfBirth = "+dob+", userName = "+userName+"]";
    }
}
