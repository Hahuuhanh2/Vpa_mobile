package j$.time.temporal;

import j$.time.a;
import j$.time.b;
import j$.time.chrono.C0338e;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.o;
import j$.time.e;
import j$.time.format.F;
import java.util.HashMap;

final class t implements o {

    /* renamed from: f  reason: collision with root package name */
    private static final s f18279f = s.j(1, 7);

    /* renamed from: g  reason: collision with root package name */
    private static final s f18280g = s.k(0, 4, 6);

    /* renamed from: h  reason: collision with root package name */
    private static final s f18281h = s.k(0, 52, 54);

    /* renamed from: i  reason: collision with root package name */
    private static final s f18282i = s.l(52, 53);

    /* renamed from: a  reason: collision with root package name */
    private final String f18283a;

    /* renamed from: b  reason: collision with root package name */
    private final WeekFields f18284b;

    /* renamed from: c  reason: collision with root package name */
    private final q f18285c;

    /* renamed from: d  reason: collision with root package name */
    private final q f18286d;

    /* renamed from: e  reason: collision with root package name */
    private final s f18287e;

    private t(String str, WeekFields weekFields, q qVar, q qVar2, s sVar) {
        this.f18283a = str;
        this.f18284b = weekFields;
        this.f18285c = qVar;
        this.f18286d = qVar2;
        this.f18287e = sVar;
    }

    private static int a(int i10, int i11) {
        return ((i11 - 1) + (i10 + 7)) / 7;
    }

    private int b(j jVar) {
        return n.h(jVar.m(a.DAY_OF_WEEK) - this.f18284b.getFirstDayOfWeek().getValue()) + 1;
    }

    private int c(j jVar) {
        int b10 = b(jVar);
        int m10 = jVar.m(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int m11 = jVar.m(aVar);
        int q10 = q(m11, b10);
        int a10 = a(q10, m11);
        if (a10 == 0) {
            return m10 - 1;
        }
        return a10 >= a(q10, this.f18284b.e() + ((int) jVar.o(aVar).d())) ? m10 + 1 : m10;
    }

    private long d(j jVar) {
        int b10 = b(jVar);
        int m10 = jVar.m(a.DAY_OF_MONTH);
        return (long) a(q(m10, b10), m10);
    }

    private int e(j jVar) {
        int b10 = b(jVar);
        a aVar = a.DAY_OF_YEAR;
        int m10 = jVar.m(aVar);
        int q10 = q(m10, b10);
        int a10 = a(q10, m10);
        if (a10 == 0) {
            return e(C0338e.s(jVar).G(jVar).g((long) m10, ChronoUnit.DAYS));
        }
        if (a10 <= 50) {
            return a10;
        }
        int a11 = a(q10, this.f18284b.e() + ((int) jVar.o(aVar).d()));
        return a10 >= a11 ? (a10 - a11) + 1 : a10;
    }

    private long f(j jVar) {
        int b10 = b(jVar);
        int m10 = jVar.m(a.DAY_OF_YEAR);
        return (long) a(q(m10, b10), m10);
    }

    static t g(WeekFields weekFields) {
        return new t("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, f18279f);
    }

    private ChronoLocalDate h(o oVar, int i10, int i11, int i12) {
        ChronoLocalDate O = oVar.O(i10, 1, 1);
        int q10 = q(1, b(O));
        int i13 = i12 - 1;
        return O.d((long) (((Math.min(i11, a(q10, this.f18284b.e() + O.Q()) - 1) - 1) * 7) + i13 + (-q10)), ChronoUnit.DAYS);
    }

    static t i(WeekFields weekFields) {
        return new t("WeekBasedYear", weekFields, i.f18264d, ChronoUnit.FOREVER, a.YEAR.o());
    }

    static t j(WeekFields weekFields) {
        return new t("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, f18280g);
    }

    static t k(WeekFields weekFields) {
        return new t("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, i.f18264d, f18282i);
    }

    private s l(j jVar, a aVar) {
        int q10 = q(jVar.m(aVar), b(jVar));
        s o10 = jVar.o(aVar);
        return s.j((long) a(q10, (int) o10.e()), (long) a(q10, (int) o10.d()));
    }

    private s p(j jVar) {
        a aVar = a.DAY_OF_YEAR;
        if (!jVar.e(aVar)) {
            return f18281h;
        }
        int b10 = b(jVar);
        int m10 = jVar.m(aVar);
        int q10 = q(m10, b10);
        int a10 = a(q10, m10);
        if (a10 == 0) {
            return p(C0338e.s(jVar).G(jVar).g((long) (m10 + 7), ChronoUnit.DAYS));
        }
        int d10 = (int) jVar.o(aVar).d();
        int a11 = a(q10, this.f18284b.e() + d10);
        return a10 >= a11 ? p(C0338e.s(jVar).G(jVar).d((long) ((d10 - m10) + 1 + 7), ChronoUnit.DAYS)) : s.j(1, (long) (a11 - 1));
    }

    private int q(int i10, int i11) {
        int h10 = n.h(i10 - i11);
        return h10 + 1 > this.f18284b.e() ? 7 - h10 : -h10;
    }

    public final long K(j jVar) {
        int i10;
        q qVar = this.f18286d;
        if (qVar == ChronoUnit.WEEKS) {
            i10 = b(jVar);
        } else if (qVar == ChronoUnit.MONTHS) {
            return d(jVar);
        } else {
            if (qVar == ChronoUnit.YEARS) {
                return f(jVar);
            }
            if (qVar == WeekFields.f18246h) {
                i10 = e(jVar);
            } else if (qVar == ChronoUnit.FOREVER) {
                i10 = c(jVar);
            } else {
                StringBuilder b10 = b.b("unreachable, rangeUnit: ");
                b10.append(this.f18286d);
                b10.append(", this: ");
                b10.append(this);
                throw new IllegalStateException(b10.toString());
            }
        }
        return (long) i10;
    }

    public final Temporal R(Temporal temporal, long j10) {
        int a10 = this.f18287e.a(j10, this);
        int m10 = temporal.m(this);
        if (a10 == m10) {
            return temporal;
        }
        if (this.f18286d != ChronoUnit.FOREVER) {
            return temporal.d((long) (a10 - m10), this.f18285c);
        }
        int m11 = temporal.m(this.f18284b.f18249c);
        return h(C0338e.s(temporal), (int) j10, temporal.m(this.f18284b.f18251e), m11);
    }

    public final boolean isDateBased() {
        return true;
    }

    public final boolean isTimeBased() {
        return false;
    }

    public final boolean m(j jVar) {
        a aVar;
        if (!jVar.e(a.DAY_OF_WEEK)) {
            return false;
        }
        q qVar = this.f18286d;
        if (qVar == ChronoUnit.WEEKS) {
            return true;
        }
        if (qVar == ChronoUnit.MONTHS) {
            aVar = a.DAY_OF_MONTH;
        } else if (qVar == ChronoUnit.YEARS || qVar == WeekFields.f18246h) {
            aVar = a.DAY_OF_YEAR;
        } else if (qVar != ChronoUnit.FOREVER) {
            return false;
        } else {
            aVar = a.YEAR;
        }
        return jVar.e(aVar);
    }

    public final s n(j jVar) {
        q qVar = this.f18286d;
        if (qVar == ChronoUnit.WEEKS) {
            return this.f18287e;
        }
        if (qVar == ChronoUnit.MONTHS) {
            return l(jVar, a.DAY_OF_MONTH);
        }
        if (qVar == ChronoUnit.YEARS) {
            return l(jVar, a.DAY_OF_YEAR);
        }
        if (qVar == WeekFields.f18246h) {
            return p(jVar);
        }
        if (qVar == ChronoUnit.FOREVER) {
            return a.YEAR.o();
        }
        StringBuilder b10 = b.b("unreachable, rangeUnit: ");
        b10.append(this.f18286d);
        b10.append(", this: ");
        b10.append(this);
        throw new IllegalStateException(b10.toString());
    }

    public final s o() {
        return this.f18287e;
    }

    public final j t(HashMap hashMap, j jVar, F f10) {
        ChronoLocalDate chronoLocalDate;
        ChronoLocalDate chronoLocalDate2;
        ChronoLocalDate chronoLocalDate3;
        HashMap hashMap2 = hashMap;
        F f11 = f10;
        long longValue = ((Long) hashMap2.get(this)).longValue();
        int c10 = a.c(longValue);
        q qVar = this.f18286d;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        if (qVar == chronoUnit) {
            hashMap2.remove(this);
            hashMap2.put(a.DAY_OF_WEEK, Long.valueOf((long) (n.h((this.f18287e.a(longValue, this) - 1) + (this.f18284b.getFirstDayOfWeek().getValue() - 1)) + 1)));
        } else {
            a aVar = a.DAY_OF_WEEK;
            if (hashMap2.containsKey(aVar)) {
                int h10 = n.h(aVar.U(((Long) hashMap2.get(aVar)).longValue()) - this.f18284b.getFirstDayOfWeek().getValue()) + 1;
                o s10 = C0338e.s(jVar);
                a aVar2 = a.YEAR;
                if (hashMap2.containsKey(aVar2)) {
                    int U = aVar2.U(((Long) hashMap2.get(aVar2)).longValue());
                    q qVar2 = this.f18286d;
                    ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
                    if (qVar2 == chronoUnit2) {
                        a aVar3 = a.MONTH_OF_YEAR;
                        if (hashMap2.containsKey(aVar3)) {
                            long longValue2 = ((Long) hashMap2.get(aVar3)).longValue();
                            long j10 = (long) c10;
                            if (f11 == F.LENIENT) {
                                ChronoLocalDate d10 = s10.O(U, 1, 1).d(a.h(longValue2, 1), chronoUnit2);
                                chronoLocalDate3 = d10.d(a.d(a.f(a.h(j10, d(d10)), (long) 7), (long) (h10 - b(d10))), ChronoUnit.DAYS);
                            } else {
                                ChronoLocalDate O = s10.O(U, aVar3.U(longValue2), 1);
                                ChronoLocalDate d11 = O.d((long) ((((int) (((long) this.f18287e.a(j10, this)) - d(O))) * 7) + (h10 - b(O))), ChronoUnit.DAYS);
                                if (f11 != F.STRICT || d11.h(aVar3) == longValue2) {
                                    chronoLocalDate3 = d11;
                                } else {
                                    throw new e("Strict mode rejected resolved date as it is in a different month");
                                }
                            }
                            hashMap2.remove(this);
                            hashMap2.remove(aVar2);
                            hashMap2.remove(aVar3);
                            hashMap2.remove(aVar);
                            return chronoLocalDate3;
                        }
                    }
                    if (this.f18286d == ChronoUnit.YEARS) {
                        long j11 = (long) c10;
                        ChronoLocalDate O2 = s10.O(U, 1, 1);
                        if (f11 == F.LENIENT) {
                            chronoLocalDate2 = O2.d(a.d(a.f(a.h(j11, f(O2)), (long) 7), (long) (h10 - b(O2))), ChronoUnit.DAYS);
                        } else {
                            ChronoLocalDate d12 = O2.d((long) ((((int) (((long) this.f18287e.a(j11, this)) - f(O2))) * 7) + (h10 - b(O2))), ChronoUnit.DAYS);
                            if (f11 != F.STRICT || d12.h(aVar2) == ((long) U)) {
                                chronoLocalDate2 = d12;
                            } else {
                                throw new e("Strict mode rejected resolved date as it is in a different year");
                            }
                        }
                        hashMap2.remove(this);
                        hashMap2.remove(aVar2);
                        hashMap2.remove(aVar);
                        return chronoLocalDate2;
                    }
                } else {
                    q qVar3 = this.f18286d;
                    if ((qVar3 == WeekFields.f18246h || qVar3 == ChronoUnit.FOREVER) && hashMap2.containsKey(this.f18284b.f18252f) && hashMap2.containsKey(this.f18284b.f18251e)) {
                        int a10 = ((t) this.f18284b.f18252f).f18287e.a(((Long) hashMap2.get(this.f18284b.f18252f)).longValue(), this.f18284b.f18252f);
                        if (f11 == F.LENIENT) {
                            chronoLocalDate = h(s10, a10, 1, h10).d(a.h(((Long) hashMap2.get(this.f18284b.f18251e)).longValue(), 1), chronoUnit);
                        } else {
                            ChronoLocalDate h11 = h(s10, a10, ((t) this.f18284b.f18251e).f18287e.a(((Long) hashMap2.get(this.f18284b.f18251e)).longValue(), this.f18284b.f18251e), h10);
                            if (f11 != F.STRICT || c(h11) == a10) {
                                chronoLocalDate = h11;
                            } else {
                                throw new e("Strict mode rejected resolved date as it is in a different week-based-year");
                            }
                        }
                        hashMap2.remove(this);
                        hashMap2.remove(this.f18284b.f18252f);
                        hashMap2.remove(this.f18284b.f18251e);
                        hashMap2.remove(aVar);
                        return chronoLocalDate;
                    }
                }
            }
        }
        return null;
    }

    public final String toString() {
        return this.f18283a + "[" + this.f18284b.toString() + "]";
    }
}
