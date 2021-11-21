package task5.entity;

public final class UsedBy implements Status {
    private final String userFirstName;
    private final String userLastName;

    public UsedBy(User user) {
        this.userFirstName = user.getFirstName();
        this.userLastName = user.getLastName();
    }

    public String getStatus() {
        return "Used by: " + userFirstName + " " + userLastName;
    }
}
