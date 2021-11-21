package task5.entity;

public record UsedBy(String status, User user) implements Status {
    public UsedBy(User user) {
        this("Used by", user);
    }

    public String getStatus() {
        return status + " " + user.getFirstName() + " " + user.getLastName();
    }
}
