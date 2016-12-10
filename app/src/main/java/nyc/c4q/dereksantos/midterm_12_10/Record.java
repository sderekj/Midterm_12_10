package nyc.c4q.dereksantos.midterm_12_10;

public class Record {

    private String liked;
    private String username;
    private String profileBackground;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;

    public String getProfileBackground() {
        return profileBackground;
    }

    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLiked() {
        return liked;
    }

    public void setLiked(String liked) {
        this.liked = liked;
    }
}
