package com.kajal.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Builder
@NoArgsConstructor
@Entity
@Table(name = "micro_users")
public class User {
    @Id
    @Column(name = "ID")
    private String user_Id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "ABOUT")
    private String about;
    @Transient
    private List<Rating> Ratings=new ArrayList<>();

    public User(String user_Id, String name, String email, String about, List<Rating> ratings) {
        this.user_Id = user_Id;
        this.name = name;
        this.email = email;
        this.about = about;
        Ratings = ratings;
    }

    public String getUser_Id() {
        return user_Id;
    }

    public void setUserId(String user_Id) {
        this.user_Id = user_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Rating> getRatings() {
        return Ratings;
    }

    public void setRatings(List<Rating> ratings) {
        Ratings = ratings;
    }
}
