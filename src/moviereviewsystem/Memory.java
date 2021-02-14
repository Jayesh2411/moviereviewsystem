package moviereviewsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Memory {

    private final List<Movie> movieList = new ArrayList<>();
    private final Map<String, Movie> movieNameMap = new HashMap<>();
    private final Map<String, User> userNameMap = new HashMap<>();
    private final List<User> userList = new ArrayList<>();
    private final List<Review> reviewList = new ArrayList<>();

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void addReviewList(Review review) {
        this.reviewList.add(review);
    }

    public Map<String, Movie> getMovieNameMap() {
        return movieNameMap;
    }

    public void putMovieNameMap(String name, Movie movie) {
        this.movieNameMap.put(name, movie);
    }

    public Map<String, User> getUserNameMap() {
        return userNameMap;
    }

    public void putUserNameMap(String name, User user) {
        this.userNameMap.put(name, user);
    }


    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addMovie(Movie movie) {
        this.movieList.add(movie);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addUser(User user) {
        this.userList.add(user);
    }
}
