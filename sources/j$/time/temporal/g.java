package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.C0337d;
import j$.time.chrono.C0338e;
import j$.time.chrono.v;
import j$.time.e;

enum g implements o {
    ;
    
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f18257a = null;

    static {
        f18257a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static boolean U(j jVar) {
        return ((C0337d) C0338e.s(jVar)).equals(v.f18100d);
    }

    static void W(j jVar) {
        if (!((C0337d) C0338e.s(jVar)).equals(v.f18100d)) {
            throw new e("Resolve requires IsoChronology");
        }
    }

    static s X(LocalDate localDate) {
        return s.j(1, (long) c0(b0(localDate)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.v())) == false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int Y(j$.time.LocalDate r5) {
        /*
            j$.time.DayOfWeek r0 = r5.getDayOfWeek()
            int r0 = r0.ordinal()
            int r1 = r5.X()
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
            if (r1 >= r0) goto L_0x003f
            r0 = 180(0xb4, float:2.52E-43)
            j$.time.LocalDate r5 = r5.p0(r0)
            r0 = -1
            j$.time.LocalDate r5 = r5.l0(r0)
            int r5 = b0(r5)
            int r5 = c0(r5)
            long r0 = (long) r5
            r2 = 1
            j$.time.temporal.s r5 = j$.time.temporal.s.j(r2, r0)
            long r0 = r5.d()
            int r5 = (int) r0
            goto L_0x005b
        L_0x003f:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L_0x0059
            if (r0 == r3) goto L_0x0055
            r3 = -2
            if (r0 != r3) goto L_0x0053
            boolean r5 = r5.v()
            if (r5 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r5 = 0
            goto L_0x0056
        L_0x0055:
            r5 = r2
        L_0x0056:
            if (r5 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r2 = r1
        L_0x005a:
            r5 = r2
        L_0x005b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.temporal.g.Y(j$.time.LocalDate):int");
    }

    /* access modifiers changed from: private */
    public static int b0(LocalDate localDate) {
        int year = localDate.getYear();
        int X = localDate.X();
        if (X <= 3) {
            return X - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (X < 363) {
            return year;
        }
        return ((X - 363) - (localDate.v() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
    }

    /* access modifiers changed from: private */
    public static int c0(int i10) {
        LocalDate f02 = LocalDate.f0(i10, 1, 1);
        if (f02.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (f02.getDayOfWeek() != DayOfWeek.WEDNESDAY || !f02.v()) ? 52 : 53;
        }
        return 53;
    }

    public final boolean isDateBased() {
        return true;
    }

    public final boolean isTimeBased() {
        return false;
    }

    public s n(j jVar) {
        return o();
    }
}
