package moviereviewsystem;

public class Review {

    int rating;
    private User user;
    private Movie movie;

    public Review(User user, Movie movie, int rating) {
        this.user = user;
        this.movie = movie;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

}
