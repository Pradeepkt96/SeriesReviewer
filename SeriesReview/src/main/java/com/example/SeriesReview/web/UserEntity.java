package com.example.SeriesReview.web;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "USER_INFO")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UId;

    private String firstName;

    private String lastName;

    private String password;

    private String dateOfBirth;

    public UserEntity(String firstName, String lastName, String password, String dateOfBirth, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.userName = userName;
    }

//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "user_series",
//            joinColumns = @JoinColumn(name = "UId",referencedColumnName = "user_id") ,
//            inverseJoinColumns = @JoinColumn(name="SerId",referencedColumnName = "id")
//    )
//    private Set<UserEntity> user =new HashSet<>();

    private String userName;

    public String getFirstName () {    return firstName;    }

    public void setFirstName (String firstName) {    this.firstName = firstName;   }

    public String getLastName ()  {   return lastName;   }

    public void setLastName (String lastName)  {   this.lastName = lastName;  }

    public String getPassword () {  return password;   }

    public void setPassword (String password)  {   this.password = password;   }

    public String getDateOfBirth () {   return dateOfBirth;  }

    public void setDateOfBirth (String dateOfBirth)  {   this.dateOfBirth = dateOfBirth;  }

    public String getUserName () {   return userName;  }

    public void setUserName (String userName) {   this.userName = userName;  }

    @Override
    public String toString()
    {
        return "UserEntity [firstName = "+firstName+", lastName = "+lastName+
                ", password = "+password+", dateOfBirth = "+dateOfBirth+", userName = "+userName+"]";
    }
}