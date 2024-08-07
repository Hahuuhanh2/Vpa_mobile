package o3;

/* compiled from: WorkInfo.kt */
public enum o {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean b() {
        if (this == SUCCEEDED || this == FAILED || this == CANCELLED) {
            return true;
        }
        return false;
    }
}
