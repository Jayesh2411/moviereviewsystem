package moviereviewsystem;

public interface MovieReviewSystemService {
    void addMovie(String movieName, int year, String genre);

    void addUser(String userName);

    void addReview(String userName, String movieName, int rating) throws Exception;


    void listNumberOfMoviesByTotalReviewByCriticInAGenre(int i, String drama);

    double getAverageReviews(String don);

    double getAverageReviews(int i);
}
