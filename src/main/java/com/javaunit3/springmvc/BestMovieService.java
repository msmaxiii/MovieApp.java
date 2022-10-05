package com.javaunit3.springmvc;
@Component
public class BestMovieService() {
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    private Movie movie;
    public Movie getBestMovie(){
        return movie;
    }

    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }
}


