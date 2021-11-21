package task5.entity;

public record Restoration(String status) implements Status {
    public Restoration {
        status = "Restoration";
    }

    @Override
    public String getStatus() {
        return null;
    }
}
