package task5.entity;

public record ComingSoon(String status) implements Status {
    public ComingSoon {
        status = "Coming soon";
    }

    @Override
    public String getStatus() {
        return null;
    }
}
