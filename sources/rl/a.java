package rl;

/* compiled from: ChronoField */
public enum a implements g {
    NANO_OF_SECOND("NanoOfSecond", r4, r9, k.c(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r4, r13, k.c(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r4, r9, k.c(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r4, r13, k.c(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r4, r9, k.c(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r4, r13, k.c(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r4, r18, k.c(0, 59)),
    SECOND_OF_DAY("SecondOfDay", r4, r13, k.c(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r4, r23, k.c(0, 59)),
    HOUR_OF_AMPM("HourOfAmPm", r4, r5, k.c(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r4, r5, k.c(1, 12)),
    HOUR_OF_DAY("HourOfDay", r4, r5, k.c(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r4, r5, k.c(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r21, r13, k.c(0, 1)),
    DAY_OF_WEEK("DayOfWeek", r4, r11, k.c(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r4, r11, k.c(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r4, r11, k.c(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r4, r29, k.d(28, 31)),
    DAY_OF_YEAR("DayOfYear", r4, r31, k.d(365, 366)),
    EPOCH_DAY("EpochDay", r4, r35, k.c(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r4, r29, k.d(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r4, r31, k.c(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r4, r31, k.c(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", r4, r5, k.c(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r4, r5, k.d(999999999, 1000000000)),
    YEAR("Year", r4, r5, k.c(-999999999, 999999999)),
    ERA("Era", b.ERAS, r5, k.c(0, 1)),
    INSTANT_SECONDS("InstantSeconds", r4, r5, k.c(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", r4, r5, k.c(-64800, 64800));
    

    /* renamed from: a  reason: collision with root package name */
    public final String f22812a;

    /* renamed from: b  reason: collision with root package name */
    public final j f22813b;

    /* renamed from: c  reason: collision with root package name */
    public final j f22814c;

    /* renamed from: d  reason: collision with root package name */
    public final k f22815d;

    /* access modifiers changed from: public */
    a(String str, b bVar, b bVar2, k kVar) {
        this.f22812a = str;
        this.f22813b = bVar;
        this.f22814c = bVar2;
        this.f22815d = kVar;
    }

    public final k b(e eVar) {
        return eVar.m(this);
    }

    public final boolean c(e eVar) {
        return eVar.n(this);
    }

    public final <R extends d> R i(R r10, long j10) {
        return r10.b(j10, this);
    }

    public final boolean isDateBased() {
        if (ordinal() < DAY_OF_WEEK.ordinal() || ordinal() > ERA.ordinal()) {
            return false;
        }
        return true;
    }

    public final boolean isTimeBased() {
        if (ordinal() < DAY_OF_WEEK.ordinal()) {
            return true;
        }
        return false;
    }

    public final long j(e eVar) {
        return eVar.c(this);
    }

    public final int k(long j10) {
        return this.f22815d.a(j10, this);
    }

    public final void m(long j10) {
        this.f22815d.b(j10, this);
    }

    public final k range() {
        return this.f22815d;
    }

    public final String toString() {
        return this.f22812a;
    }
}
