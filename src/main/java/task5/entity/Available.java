package task5.entity;

public record Available(String status) implements Status {
    public Available {
        status = "Available";
    }

    @Override
    public String getStatus() {
        return status;
    }
}
