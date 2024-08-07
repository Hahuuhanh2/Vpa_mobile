package j$.time.temporal;

public enum a implements o {
    NANO_OF_SECOND("NanoOfSecond", s.j(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", s.j(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", s.j(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", s.j(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", s.j(0, 999)),
    MILLI_OF_DAY("MilliOfDay", s.j(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", s.j(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", s.j(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", s.j(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", s.j(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", s.j(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", s.j(1, 12)),
    HOUR_OF_DAY("HourOfDay", s.j(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", s.j(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", s.j(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", s.j(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", s.j(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", s.j(1, 7)),
    DAY_OF_MONTH("DayOfMonth", s.l(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", s.l(365, 366)),
    EPOCH_DAY("EpochDay", s.j(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", s.l(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", s.j(1, 53)),
    PROLEPTIC_MONTH("ProlepticMonth", s.j(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", s.l(999999999, 1000000000)),
    YEAR("Year", s.j(-999999999, 999999999), 0),
    ERA("Era", s.j(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", s.j(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", s.j(-64800, 64800));
    

    /* renamed from: a  reason: collision with root package name */
    private final String f18254a;

    /* renamed from: b  reason: collision with root package name */
    private final s f18255b;

    private a(String str, s sVar) {
        this.f18254a = str;
        this.f18255b = sVar;
    }

    private a(String str, s sVar, int i10) {
        this.f18254a = str;
        this.f18255b = sVar;
    }

    public final long K(j jVar) {
        return jVar.h(this);
    }

    public final Temporal R(Temporal temporal, long j10) {
        return temporal.c(j10, this);
    }

    public final int U(long j10) {
        return this.f18255b.a(j10, this);
    }

    public final void V(long j10) {
        this.f18255b.b(j10, this);
    }

    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public final boolean m(j jVar) {
        return jVar.e(this);
    }

    public final s n(j jVar) {
        return jVar.o(this);
    }

    public final s o() {
        return this.f18255b;
    }

    public final String toString() {
        return this.f18254a;
    }
}
