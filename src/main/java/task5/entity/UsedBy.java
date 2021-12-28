package task5.entity;

public final class UsedBy extends Status {
    public UsedBy(User user) {
        String userFirstName = user.getFirstName();
        String userLastName = user.getLastName();
        this.status = "Used by: " + userFirstName + " " + userLastName;
    }

    public String getStatus() {
        return status;
    }
}
