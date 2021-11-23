package task5.entity;

public final class Available extends Status {
    {
        status = "Available";
    }

    @Override
    public String getStatus() {
        return status;
    }
}
