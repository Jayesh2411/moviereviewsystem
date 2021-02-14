package moviereviewsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieReviewSystemServiceImpl implements MovieReviewSystemService {

    private final Memory memory;

    public MovieReviewSystemServiceImpl() {
        this.memory = new Memory();
    }

    public Memory getMemory() {
        return this.memory;
    }

    @Override
    public void addMovie(String movieName, int year, String genre) {
        movieName = movieName.trim();
        List<Genre> genreList = new ArrayList<>();
        String[] genres = genre.trim().split(" & ");
        for (String s :
                genres) {
            genreList.add(new Genre(s.trim()));
        }

        Movie movie = new Movie(movieName, year, genreList);
        memory.addMovie(movie);
        memory.putMovieNameMap(movieName, movie);
    }

    @Override
    public void addUser(String userName) {
        userName = userName.trim();
        User user = null;
        if (memory.getUserNameMap().containsKey(userName)) {
            user = memory.getUserNameMap().get(userName);
        }
        if (user == null) {
            user = new User(userName);
        }
        memory.addUser(user);
        memory.putUserNameMap(userName, user);
    }

    @Override
    public void addReview(String userName, String movieName, int rating) throws Exception {
        User user = null;
        Movie movie = null;
        userName = userName.trim();
        movieName = movieName.trim();
        if (memory.getUserNameMap().containsKey(userName)) {
            user = memory.getUserNameMap().get(userName);
        }
        if (memory.getMovieNameMap().containsKey(movieName)) {
            movie = memory.getMovieNameMap().get(movieName);
        }
        if (user == null) {
            throw new Exception("User not found");
        }
        if (movie == null) {
            throw new Exception("Movie not found");
        }
        user.incrementReviewsDone();
        Review review = null;
        if (user.getReviewsDone() >= 3) {
            user.setUserLevel(Levels.CRITIC);
            review = new Review(user, movie, rating * 2);
        } else {
            review = new Review(user, movie, rating);
        }

        memory.addReviewList(review);


    }

    @Override
    public void listNumberOfMoviesByTotalReviewByCriticInAGenre(int i, String genre) {

        Collections.sort(memory.getMovieList(), (o1, o2) -> {
            if (o1.getRating() > o2.getRating()) {
                return 1;
            }
            return 0;
        });

        for (Movie movie : memory.getMovieList()
        ) {
            if (i == 0) {
                break;
            }
            for (Genre g : movie.getGenres()
            ) {
                if (g.getGenreName().equalsIgnoreCase(genre)) {
                    --i;
                    System.out.println(movie.getMovieName());
                }
            }
        }
    }

    @Override
    public double getAverageReviews(String movie) {
        int reviewAvg = 0;
        double count = 0;
        for (Review
                review : memory.getReviewList()) {
            if (review.getMovie().getMovieName().equalsIgnoreCase(movie)) {
                reviewAvg += review.getRating();
                count++;
            }
        }
        return reviewAvg / count;
    }

    @Override
    public double getAverageReviews(int i) {
        int reviewAvg = 0;
        double count = 0;
        for (Review
                review : memory.getReviewList()) {
            if (review.getMovie().getDate() == i) {
                reviewAvg += review.getRating();
                count++;
            }
        }
        return reviewAvg / count;
    }
}
