package com.example.recycleview;

public class Movie {
        String photo;
        String title;
        float rating;
        String description;
        String about;

    public Movie(String photo, String title, float rating, String description, String about){
        this.photo = photo;
        this.title = title;
        this.rating = rating;
        this.description = description;
        this.about = about;
    }

    public String getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public float getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public String getAbout() {
        return about;
    }
}


