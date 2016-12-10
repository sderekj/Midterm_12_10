package nyc.c4q.dereksantos.midterm_12_10;

public class User {
    private String username;
    private String location;
    private String verified;
    private String userId;
    private String avatarUrl;
    private String[] vanityUrls;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String[] getVanityUrls() {
        return vanityUrls;
    }

    public void setVanityUrls(String[] vanityUrls) {
        this.vanityUrls = vanityUrls;
    }
}
