package task5.entity;

public final class ComingSoon extends Status {
    {
        status = "Coming soon";
    }

    @Override
    public String getStatus() {
        return status;
    }
}
