package task5.entity;

import java.util.Objects;

public abstract class Status {
    protected String status;

    public abstract String getStatus();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status1 = (Status) o;
        return Objects.equals(status, status1.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }
}

