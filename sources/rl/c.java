package rl;

import nl.e;
import ol.f;
import ol.h;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import p3.l0;

/* compiled from: IsoFields */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f22831a = 0;

    /* compiled from: IsoFields */
    public enum a implements g {
        ;
        

        /* renamed from: d  reason: collision with root package name */
        public static final int[] f22835d = null;

        /* 'enum' modifier removed */
        /* renamed from: rl.c$a$a  reason: collision with other inner class name */
        /* compiled from: IsoFields */
        public final class C0306a extends a {
            public C0306a() {
                super("DAY_OF_QUARTER", 0);
            }

            public final k b(e eVar) {
                if (eVar.n(this)) {
                    long c10 = eVar.c(a.f22832a);
                    if (c10 == 1) {
                        long c11 = eVar.c(a.YEAR);
                        h.f22637a.getClass();
                        if (h.isLeapYear(c11)) {
                            return k.c(1, 91);
                        }
                        return k.c(1, 90);
                    } else if (c10 == 2) {
                        return k.c(1, 91);
                    } else {
                        if (c10 == 3 || c10 == 4) {
                            return k.c(1, 92);
                        }
                        return range();
                    }
                } else {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
            }

            public final boolean c(e eVar) {
                if (!eVar.n(a.DAY_OF_YEAR) || !eVar.n(a.MONTH_OF_YEAR) || !eVar.n(a.YEAR) || !f.n(eVar).equals(h.f22637a)) {
                    return false;
                }
                return true;
            }

            public final <R extends d> R i(R r10, long j10) {
                long j11 = j(r10);
                range().b(j10, this);
                a aVar = a.DAY_OF_YEAR;
                return r10.b((j10 - j11) + r10.c(aVar), aVar);
            }

            public final long j(e eVar) {
                int i10;
                if (eVar.n(this)) {
                    int k10 = eVar.k(a.DAY_OF_YEAR);
                    int k11 = eVar.k(a.MONTH_OF_YEAR);
                    long c10 = eVar.c(a.YEAR);
                    int[] iArr = a.f22835d;
                    int i11 = (k11 - 1) / 3;
                    h.f22637a.getClass();
                    if (h.isLeapYear(c10)) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    return (long) (k10 - iArr[i11 + i10]);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            public final k range() {
                return k.d(90, 92);
            }

            public final String toString() {
                return "DayOfQuarter";
            }
        }

        /* 'enum' modifier removed */
        /* compiled from: IsoFields */
        public final class b extends a {
            public b() {
                super("QUARTER_OF_YEAR", 1);
            }

            public final k b(e eVar) {
                return range();
            }

            public final boolean c(e eVar) {
                if (!eVar.n(a.MONTH_OF_YEAR) || !f.n(eVar).equals(h.f22637a)) {
                    return false;
                }
                return true;
            }

            public final <R extends d> R i(R r10, long j10) {
                long j11 = j(r10);
                range().b(j10, this);
                a aVar = a.MONTH_OF_YEAR;
                return r10.b(((j10 - j11) * 3) + r10.c(aVar), aVar);
            }

            public final long j(e eVar) {
                if (eVar.n(this)) {
                    return (eVar.c(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            public final k range() {
                return k.c(1, 4);
            }

            public final String toString() {
                return "QuarterOfYear";
            }
        }

        /* 'enum' modifier removed */
        /* renamed from: rl.c$a$c  reason: collision with other inner class name */
        /* compiled from: IsoFields */
        public final class C0307c extends a {
            public C0307c() {
                super("WEEK_OF_WEEK_BASED_YEAR", 2);
            }

            public final k b(e eVar) {
                if (eVar.n(this)) {
                    return k.c(1, (long) a.n(a.m(e.B(eVar))));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            public final boolean c(e eVar) {
                if (!eVar.n(a.EPOCH_DAY) || !f.n(eVar).equals(h.f22637a)) {
                    return false;
                }
                return true;
            }

            public final <R extends d> R i(R r10, long j10) {
                range().b(j10, this);
                return r10.j(l0.D0(j10, j(r10)), b.WEEKS);
            }

            public final long j(e eVar) {
                if (eVar.n(this)) {
                    return (long) a.k(e.B(eVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            public final k range() {
                return k.d(52, 53);
            }

            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        /* 'enum' modifier removed */
        /* compiled from: IsoFields */
        public final class d extends a {
            public d() {
                super("WEEK_BASED_YEAR", 3);
            }

            public final k b(e eVar) {
                return a.YEAR.f22815d;
            }

            public final boolean c(e eVar) {
                if (!eVar.n(a.EPOCH_DAY) || !f.n(eVar).equals(h.f22637a)) {
                    return false;
                }
                return true;
            }

            public final <R extends d> R i(R r10, long j10) {
                if (c(r10)) {
                    int a10 = a.YEAR.f22815d.a(j10, a.f22834c);
                    e B = e.B(r10);
                    a aVar = a.DAY_OF_WEEK;
                    int k10 = B.k(aVar);
                    int k11 = a.k(B);
                    if (k11 == 53 && a.n(a10) == 52) {
                        k11 = 52;
                    }
                    e F = e.F(a10, 1, 4);
                    return r10.q(F.I((long) (((k11 - 1) * 7) + (k10 - F.k(aVar)))));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            public final long j(e eVar) {
                if (eVar.n(this)) {
                    return (long) a.m(e.B(eVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            public final k range() {
                return a.YEAR.f22815d;
            }

            public final String toString() {
                return "WeekBasedYear";
            }
        }

        /* access modifiers changed from: public */
        static {
            f22835d = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        /* access modifiers changed from: public */
        a() {
            throw null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
            if (r5 == false) goto L_0x0058;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int k(nl.e r5) {
            /*
                nl.b r0 = r5.D()
                int r0 = r0.ordinal()
                int r1 = r5.E()
                r2 = 1
                int r1 = r1 - r2
                int r0 = 3 - r0
                int r0 = r0 + r1
                int r3 = r0 / 7
                int r3 = r3 * 7
                int r0 = r0 - r3
                r3 = -3
                int r0 = r0 + r3
                if (r0 >= r3) goto L_0x001c
                int r0 = r0 + 7
            L_0x001c:
                if (r1 >= r0) goto L_0x003d
                r0 = 180(0xb4, float:2.52E-43)
                nl.e r5 = r5.P(r0)
                r0 = -1
                nl.e r5 = r5.K(r0)
                int r5 = m(r5)
                int r5 = n(r5)
                long r0 = (long) r5
                r2 = 1
                rl.k r5 = rl.k.c(r2, r0)
                long r0 = r5.f22849d
                int r5 = (int) r0
                goto L_0x0059
            L_0x003d:
                int r1 = r1 - r0
                int r1 = r1 / 7
                int r1 = r1 + r2
                r4 = 53
                if (r1 != r4) goto L_0x0057
                if (r0 == r3) goto L_0x0053
                r3 = -2
                if (r0 != r3) goto L_0x0051
                boolean r5 = r5.isLeapYear()
                if (r5 == 0) goto L_0x0051
                goto L_0x0053
            L_0x0051:
                r5 = 0
                goto L_0x0054
            L_0x0053:
                r5 = r2
            L_0x0054:
                if (r5 != 0) goto L_0x0057
                goto L_0x0058
            L_0x0057:
                r2 = r1
            L_0x0058:
                r5 = r2
            L_0x0059:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: rl.c.a.k(nl.e):int");
        }

        public static int m(e eVar) {
            int i10 = eVar.f21754a;
            int E = eVar.E();
            if (E <= 3) {
                if (E - eVar.D().ordinal() < -2) {
                    return i10 - 1;
                }
                return i10;
            } else if (E < 363) {
                return i10;
            } else {
                if (((E - 363) - (eVar.isLeapYear() ? 1 : 0)) - eVar.D().ordinal() >= 0) {
                    return i10 + 1;
                }
                return i10;
            }
        }

        public static int n(int i10) {
            e F = e.F(i10, 1, 1);
            if (F.D() == nl.b.THURSDAY) {
                return 53;
            }
            if (F.D() != nl.b.WEDNESDAY || !F.isLeapYear()) {
                return 52;
            }
            return 53;
        }

        public final boolean isDateBased() {
            return true;
        }

        public final boolean isTimeBased() {
            return false;
        }
    }

    /* compiled from: IsoFields */
    public enum b implements j {
        ;
        

        /* renamed from: a  reason: collision with root package name */
        public final String f22838a;

        /* access modifiers changed from: public */
        b(String str) {
            this.f22838a = str;
        }

        public final <R extends d> R b(R r10, long j10) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                int i10 = c.f22831a;
                a.d dVar = a.f22834c;
                return r10.b(l0.A0((long) r10.k(dVar), j10), dVar);
            } else if (ordinal == 1) {
                return r10.j(j10 / 256, b.YEARS).j((j10 % 256) * 3, b.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public final boolean isDateBased() {
            return true;
        }

        public final String toString() {
            return this.f22838a;
        }
    }

    static {
        b[] bVarArr = b.f22837b;
    }
}
