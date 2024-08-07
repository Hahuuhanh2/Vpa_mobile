package zk;

import p3.l0;
import sk.j;
import vk.k;
import yk.l;

/* compiled from: Duration.kt */
public final class a implements Comparable<a> {

    /* renamed from: b  reason: collision with root package name */
    public static final long f23783b = l0.G(4611686018427387903L);

    /* renamed from: c  reason: collision with root package name */
    public static final long f23784c = l0.G(-4611686018427387903L);

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f23785d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f23786a;

    static {
        int i10 = b.f23787a;
    }

    public /* synthetic */ a(long j10) {
        this.f23786a = j10;
    }

    public static final long b(long j10, long j11) {
        long j12 = (long) 1000000;
        long j13 = j11 / j12;
        long j14 = j10 + j13;
        if (!new k(-4611686018426L, 4611686018426L).m(j14)) {
            return l0.G(l0.w(j14));
        }
        long j15 = ((j14 * j12) + (j11 - (j13 * j12))) << 1;
        int i10 = b.f23787a;
        return j15;
    }

    public static final void c(StringBuilder sb2, int i10, int i11, int i12, String str) {
        boolean z10;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String Y0 = l.Y0(String.valueOf(i11), i12);
            int i13 = -1;
            int length = Y0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (Y0.charAt(length) != '0') {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (i15 < 3) {
                sb2.append(Y0, 0, i15);
            } else {
                sb2.append(Y0, 0, ((i15 + 2) / 3) * 3);
            }
        }
        sb2.append(str);
    }

    public static int i(long j10, long j11) {
        long j12 = j10 ^ j11;
        boolean z10 = false;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            if (i10 < 0) {
                return -1;
            }
            return i10 == 0 ? 0 : 1;
        }
        int i11 = (((int) j10) & 1) - (((int) j11) & 1);
        if (j10 < 0) {
            z10 = true;
        }
        return z10 ? -i11 : i11;
    }

    public static final boolean j(long j10) {
        if (j10 == f23783b || j10 == f23784c) {
            return true;
        }
        return false;
    }

    public static final long k(long j10, c cVar) {
        c cVar2;
        j.f(cVar, "unit");
        if (j10 == f23783b) {
            return Long.MAX_VALUE;
        }
        if (j10 == f23784c) {
            return Long.MIN_VALUE;
        }
        boolean z10 = true;
        long j11 = j10 >> 1;
        if ((((int) j10) & 1) != 0) {
            z10 = false;
        }
        if (z10) {
            cVar2 = c.NANOSECONDS;
        } else {
            cVar2 = c.MILLISECONDS;
        }
        j.f(cVar2, "sourceUnit");
        return cVar.f23795a.convert(j11, cVar2.f23795a);
    }

    public final int compareTo(Object obj) {
        return i(this.f23786a, ((a) obj).f23786a);
    }

    public final boolean equals(Object obj) {
        long j10 = this.f23786a;
        if ((obj instanceof a) && j10 == ((a) obj).f23786a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f23786a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i14;
        boolean z16;
        long j10;
        long j11 = this.f23786a;
        int i15 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
        if (i15 == 0) {
            return "0s";
        }
        if (j11 == f23783b) {
            return "Infinity";
        }
        if (j11 == f23784c) {
            return "-Infinity";
        }
        if (i15 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (i15 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j11 = ((long) (((int) j11) & 1)) + ((-(j11 >> 1)) << 1);
            int i16 = b.f23787a;
        }
        long k10 = k(j11, c.DAYS);
        if (j(j11)) {
            i10 = 0;
        } else {
            i10 = (int) (k(j11, c.HOURS) % ((long) 24));
        }
        if (j(j11)) {
            i11 = 0;
        } else {
            i11 = (int) (k(j11, c.MINUTES) % ((long) 60));
        }
        if (j(j11)) {
            i12 = 0;
        } else {
            i12 = (int) (k(j11, c.SECONDS) % ((long) 60));
        }
        if (j(j11)) {
            i13 = 0;
        } else {
            if ((((int) j11) & 1) == 1) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                j10 = ((j11 >> 1) % ((long) 1000)) * ((long) 1000000);
            } else {
                j10 = (j11 >> 1) % ((long) 1000000000);
            }
            i13 = (int) j10;
        }
        if (k10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i10 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i11 != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (i12 == 0 && i13 == 0) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z12) {
            sb2.append(k10);
            sb2.append('d');
            i14 = 1;
        } else {
            i14 = 0;
        }
        if (z13 || (z12 && (z14 || z15))) {
            int i17 = i14 + 1;
            if (i14 > 0) {
                sb2.append(' ');
            }
            sb2.append(i10);
            sb2.append('h');
            i14 = i17;
        }
        if (z14 || (z15 && (z13 || z12))) {
            int i18 = i14 + 1;
            if (i14 > 0) {
                sb2.append(' ');
            }
            sb2.append(i11);
            sb2.append('m');
            i14 = i18;
        }
        if (z15) {
            int i19 = i14 + 1;
            if (i14 > 0) {
                sb2.append(' ');
            }
            if (i12 != 0 || z12 || z13 || z14) {
                c(sb2, i12, i13, 9, "s");
            } else if (i13 >= 1000000) {
                c(sb2, i13 / 1000000, i13 % 1000000, 6, "ms");
            } else if (i13 >= 1000) {
                c(sb2, i13 / 1000, i13 % 1000, 3, "us");
            } else {
                sb2.append(i13);
                sb2.append("ns");
            }
            i14 = i19;
        }
        if (z10 && i14 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
