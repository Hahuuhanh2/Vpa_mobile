package nl;

import android.support.v4.media.a;
import j$.util.concurrent.ConcurrentHashMap;
import n0.l;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import rl.d;
import rl.e;
import rl.f;
import rl.g;
import rl.h;
import rl.i;
import sl.f;
import v.v;

/* compiled from: ZoneOffset */
public final class k extends j implements e, f, Comparable<k> {

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap f21774d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap f21775e = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: f  reason: collision with root package name */
    public static final k f21776f = w(0);

    /* renamed from: n  reason: collision with root package name */
    public static final k f21777n = w(-64800);

    /* renamed from: o  reason: collision with root package name */
    public static final k f21778o = w(64800);

    /* renamed from: b  reason: collision with root package name */
    public final int f21779b;

    /* renamed from: c  reason: collision with root package name */
    public final transient String f21780c;

    public k(int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        this.f21779b = i10;
        if (i10 == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder();
            int i11 = abs / 3600;
            int i12 = (abs / 60) % 60;
            if (i10 < 0) {
                str2 = "-";
            } else {
                str2 = "+";
            }
            sb2.append(str2);
            if (i11 < 10) {
                str3 = "0";
            } else {
                str3 = "";
            }
            sb2.append(str3);
            sb2.append(i11);
            String str5 = ":0";
            if (i12 < 10) {
                str4 = str5;
            } else {
                str4 = ":";
            }
            sb2.append(str4);
            sb2.append(i12);
            int i13 = abs % 60;
            if (i13 != 0) {
                sb2.append(i13 >= 10 ? ":" : str5);
                sb2.append(i13);
            }
            str = sb2.toString();
        }
        this.f21780c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static nl.k u(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            p3.l0.y0(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = f21775e
            java.lang.Object r0 = r0.get(r7)
            nl.k r0 = (nl.k) r0
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0063
            r1 = 3
            if (r0 == r1) goto L_0x007f
            r4 = 5
            if (r0 == r4) goto L_0x0059
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x0050
            r5 = 7
            if (r0 == r5) goto L_0x0043
            r1 = 9
            if (r0 != r1) goto L_0x0037
            int r0 = x(r7, r2, r3)
            int r1 = x(r7, r6, r2)
            int r2 = x(r7, r5, r2)
            goto L_0x0085
        L_0x0037:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = f0.b0.r(r1, r7)
            r0.<init>(r7)
            throw r0
        L_0x0043:
            int r0 = x(r7, r2, r3)
            int r1 = x(r7, r1, r3)
            int r2 = x(r7, r4, r3)
            goto L_0x0085
        L_0x0050:
            int r0 = x(r7, r2, r3)
            int r1 = x(r7, r6, r2)
            goto L_0x0061
        L_0x0059:
            int r0 = x(r7, r2, r3)
            int r1 = x(r7, r1, r3)
        L_0x0061:
            r2 = r3
            goto L_0x0085
        L_0x0063:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x007f:
            int r0 = x(r7, r2, r3)
            r1 = r3
            r2 = r1
        L_0x0085:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x009e
            if (r3 != r5) goto L_0x0092
            goto L_0x009e
        L_0x0092:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = f0.b0.r(r1, r7)
            r0.<init>(r7)
            throw r0
        L_0x009e:
            if (r3 != r5) goto L_0x00a8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            nl.k r7 = v(r7, r0, r1)
            return r7
        L_0x00a8:
            nl.k r7 = v(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.k.u(java.lang.String):nl.k");
    }

    public static k v(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new DateTimeException(v.d("Zone offset hours not in valid range: value ", i10, " is not in the range -18 to 18"));
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i11) > 59) {
            StringBuilder q10 = a.q("Zone offset minutes not in valid range: abs(value) ");
            q10.append(Math.abs(i11));
            q10.append(" is not in the range 0 to 59");
            throw new DateTimeException(q10.toString());
        } else if (Math.abs(i12) > 59) {
            StringBuilder q11 = a.q("Zone offset seconds not in valid range: abs(value) ");
            q11.append(Math.abs(i12));
            q11.append(" is not in the range 0 to 59");
            throw new DateTimeException(q11.toString());
        } else if (Math.abs(i10) != 18 || (Math.abs(i11) <= 0 && Math.abs(i12) <= 0)) {
            return w((i11 * 60) + (i10 * 3600) + i12);
        } else {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static k w(int i10) {
        if (Math.abs(i10) > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i10 % 900 != 0) {
            return new k(i10);
        } else {
            Integer valueOf = Integer.valueOf(i10);
            ConcurrentHashMap concurrentHashMap = f21774d;
            k kVar = (k) concurrentHashMap.get(valueOf);
            if (kVar != null) {
                return kVar;
            }
            concurrentHashMap.putIfAbsent(valueOf, new k(i10));
            k kVar2 = (k) concurrentHashMap.get(valueOf);
            f21775e.putIfAbsent(kVar2.f21780c, kVar2);
            return kVar2;
        }
    }

    public static int x(CharSequence charSequence, int i10, boolean z10) {
        if (!z10 || charSequence.charAt(i10 - 1) == ':') {
            char charAt = charSequence.charAt(i10);
            char charAt2 = charSequence.charAt(i10 + 1);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
                throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + charSequence);
            }
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + charSequence);
    }

    public final long c(g gVar) {
        if (gVar == rl.a.OFFSET_SECONDS) {
            return (long) this.f21779b;
        }
        if (!(gVar instanceof rl.a)) {
            return gVar.j(this);
        }
        throw new DateTimeException(l.j("Unsupported field: ", gVar));
    }

    public final int compareTo(Object obj) {
        return ((k) obj).f21779b - this.f21779b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        if (this.f21779b == ((k) obj).f21779b) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f21780c;
    }

    public final int hashCode() {
        return this.f21779b;
    }

    public final d i(d dVar) {
        return dVar.b((long) this.f21779b, rl.a.OFFSET_SECONDS);
    }

    public final int k(g gVar) {
        if (gVar == rl.a.OFFSET_SECONDS) {
            return this.f21779b;
        }
        if (!(gVar instanceof rl.a)) {
            return m(gVar).a(c(gVar), gVar);
        }
        throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
    }

    public final rl.k m(g gVar) {
        if (gVar == rl.a.OFFSET_SECONDS) {
            return gVar.range();
        }
        if (!(gVar instanceof rl.a)) {
            return gVar.b(this);
        }
        throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
    }

    public final boolean n(g gVar) {
        if (gVar instanceof rl.a) {
            if (gVar == rl.a.OFFSET_SECONDS) {
                return true;
            }
            return false;
        } else if (gVar == null || !gVar.c(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final <R> R o(i<R> iVar) {
        if (iVar == h.f22843e || iVar == h.f22842d) {
            return this;
        }
        if (iVar == h.f22844f || iVar == h.f22845g || iVar == h.f22841c || iVar == h.f22840b || iVar == h.f22839a) {
            return null;
        }
        return iVar.a(this);
    }

    public final sl.f s() {
        return new f.a(this);
    }

    public final String toString() {
        return this.f21780c;
    }
}
