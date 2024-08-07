package rl;

/* compiled from: ChronoUnit */
public enum b implements j {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f22830a;

    /* access modifiers changed from: public */
    b(String str) {
        this.f22830a = str;
    }

    public final <R extends d> R b(R r10, long j10) {
        return r10.j(j10, this);
    }

    public final boolean isDateBased() {
        if (compareTo(DAYS) < 0 || this == FOREVER) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f22830a;
    }
}
