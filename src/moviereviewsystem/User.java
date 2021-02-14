package moviereviewsystem;

public class User {

    private String userName;
    private Levels userLevel = Levels.VIEWER;
    private int reviewsDone = 1;

    public User(String userName, Levels userLevel) {
        this.userName = userName;
        this.userLevel = userLevel;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Levels getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Levels userLevel) {
        this.userLevel = userLevel;
    }

    public int getReviewsDone() {
        return this.reviewsDone;
    }

    public void incrementReviewsDone() {
        this.reviewsDone += 1;
    }
}
