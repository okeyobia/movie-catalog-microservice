package com.okey.moviecatalogservice.model;

public class MovieCatalog {
    private String title;
    private String desc;
    private int rating;

    public MovieCatalog(String title, String desc, int rating) {
        this.title = title;
        this.desc = desc;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
