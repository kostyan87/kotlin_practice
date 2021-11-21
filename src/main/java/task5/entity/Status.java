package task5.entity;

public sealed interface Status permits Available, UsedBy, ComingSoon, Restoration {
    String getStatus();
}

