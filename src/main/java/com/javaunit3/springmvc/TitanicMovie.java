package com.javaunit3.springmvc;

public class TitanicMovie implements Movie {
    public String getTitle() {
        return "Titanic";
    }

    public String getMaturityRating() {
        return "PG-13";
    }

    public String getGenre() {
        return "Romance";
    }
}
