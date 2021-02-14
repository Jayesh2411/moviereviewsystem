package moviereviewsystem;

import java.util.List;

public class Movie {

    private String movieName;
    private int date;
    private List<Genre> genres;

    private int rating;

    public Movie(String movieName, int date, List<Genre> genres) {
        this.movieName = movieName;
        this.date = date;
        this.genres = genres;
        this.rating = 0;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}
