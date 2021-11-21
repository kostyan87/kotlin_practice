package task5.entity;

public record Author(String firstName, String lastName) {

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
