package j$.time.temporal;

import j$.time.a;

enum h implements q {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f18260a;

    private h(String str) {
        this.f18260a = str;
    }

    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.i(temporal2, this);
        }
        int i10 = b.f18256a[ordinal()];
        if (i10 == 1) {
            o oVar = i.f18263c;
            return a.h(temporal2.h(oVar), temporal.h(oVar));
        } else if (i10 == 2) {
            return temporal.i(temporal2, ChronoUnit.MONTHS) / 3;
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    public final boolean isDateBased() {
        return true;
    }

    public final boolean isTimeBased() {
        return false;
    }

    public final Temporal m(Temporal temporal, long j10) {
        int i10 = b.f18256a[ordinal()];
        if (i10 == 1) {
            o oVar = i.f18263c;
            return temporal.c(a.d((long) temporal.m(oVar), j10), oVar);
        } else if (i10 == 2) {
            return temporal.d(j10 / 256, ChronoUnit.YEARS).d((j10 % 256) * 3, ChronoUnit.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    public final String toString() {
        return this.f18260a;
    }
}
