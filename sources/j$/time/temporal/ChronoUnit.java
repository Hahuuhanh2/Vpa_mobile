package j$.time.temporal;

public enum ChronoUnit implements q {
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
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f18244a;

    private ChronoUnit(String str) {
        this.f18244a = str;
    }

    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.i(temporal2, this);
    }

    public final boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public final boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    public final Temporal m(Temporal temporal, long j10) {
        return temporal.d(j10, this);
    }

    public final String toString() {
        return this.f18244a;
    }
}
