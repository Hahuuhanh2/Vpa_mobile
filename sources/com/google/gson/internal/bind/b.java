package com.google.gson.internal.bind;

import bc.j;
import bc.l;
import bc.m;
import bc.n;
import bc.o;
import com.google.gson.stream.MalformedJsonException;
import dc.p;
import f0.b0;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import v.v;

/* compiled from: JsonTreeReader */
public final class b extends hc.a {
    public static final a A = new a();
    public static final Object B = new Object();

    /* renamed from: w  reason: collision with root package name */
    public Object[] f7821w = new Object[32];

    /* renamed from: x  reason: collision with root package name */
    public int f7822x = 0;

    /* renamed from: y  reason: collision with root package name */
    public String[] f7823y = new String[32];

    /* renamed from: z  reason: collision with root package name */
    public int[] f7824z = new int[32];

    /* compiled from: JsonTreeReader */
    public class a extends Reader {
        public final void close() {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b(l lVar) {
        super(A);
        P0(lVar);
    }

    private String B(boolean z10) {
        StringBuilder p10 = android.support.v4.media.a.p('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f7822x;
            if (i10 >= i11) {
                return p10.toString();
            }
            Object[] objArr = this.f7821w;
            Object obj = objArr[i10];
            if (obj instanceof j) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f7824z[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    p10.append('[');
                    p10.append(i12);
                    p10.append(']');
                }
            } else if ((obj instanceof n) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                p10.append('.');
                String str = this.f7823y[i10];
                if (str != null) {
                    p10.append(str);
                }
            }
            i10++;
        }
    }

    private String N() {
        StringBuilder q10 = android.support.v4.media.a.q(" at path ");
        q10.append(B(false));
        return q10.toString();
    }

    public final void A0(int i10) {
        if (k0() != i10) {
            StringBuilder q10 = android.support.v4.media.a.q("Expected ");
            q10.append(b0.F(i10));
            q10.append(" but was ");
            q10.append(b0.F(k0()));
            q10.append(N());
            throw new IllegalStateException(q10.toString());
        }
    }

    public final String B0(boolean z10) {
        String str;
        A0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) F0()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.f7823y;
        int i10 = this.f7822x - 1;
        if (z10) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i10] = str;
        P0(entry.getValue());
        return str2;
    }

    public final String E() {
        return B(true);
    }

    public final Object F0() {
        return this.f7821w[this.f7822x - 1];
    }

    public final boolean K() {
        int k02 = k0();
        if (k02 == 4 || k02 == 2 || k02 == 10) {
            return false;
        }
        return true;
    }

    public final Object N0() {
        Object[] objArr = this.f7821w;
        int i10 = this.f7822x - 1;
        this.f7822x = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void P0(Object obj) {
        int i10 = this.f7822x;
        Object[] objArr = this.f7821w;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f7821w = Arrays.copyOf(objArr, i11);
            this.f7824z = Arrays.copyOf(this.f7824z, i11);
            this.f7823y = (String[]) Arrays.copyOf(this.f7823y, i11);
        }
        Object[] objArr2 = this.f7821w;
        int i12 = this.f7822x;
        this.f7822x = i12 + 1;
        objArr2[i12] = obj;
    }

    public final boolean R() {
        A0(8);
        boolean m10 = ((o) N0()).m();
        int i10 = this.f7822x;
        if (i10 > 0) {
            int[] iArr = this.f7824z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m10;
    }

    public final double S() {
        double d10;
        int k02 = k0();
        if (k02 == 7 || k02 == 6) {
            o oVar = (o) F0();
            if (oVar.f4162a instanceof Number) {
                d10 = oVar.n().doubleValue();
            } else {
                d10 = Double.parseDouble(oVar.l());
            }
            if (this.f10712b || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
                N0();
                int i10 = this.f7822x;
                if (i10 > 0) {
                    int[] iArr = this.f7824z;
                    int i11 = i10 - 1;
                    iArr[i11] = iArr[i11] + 1;
                }
                return d10;
            }
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d10);
        }
        StringBuilder q10 = android.support.v4.media.a.q("Expected ");
        q10.append(b0.F(7));
        q10.append(" but was ");
        q10.append(b0.F(k02));
        q10.append(N());
        throw new IllegalStateException(q10.toString());
    }

    public final int U() {
        int i10;
        int k02 = k0();
        if (k02 == 7 || k02 == 6) {
            o oVar = (o) F0();
            if (oVar.f4162a instanceof Number) {
                i10 = oVar.n().intValue();
            } else {
                i10 = Integer.parseInt(oVar.l());
            }
            N0();
            int i11 = this.f7822x;
            if (i11 > 0) {
                int[] iArr = this.f7824z;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
            return i10;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Expected ");
        q10.append(b0.F(7));
        q10.append(" but was ");
        q10.append(b0.F(k02));
        q10.append(N());
        throw new IllegalStateException(q10.toString());
    }

    public final long W() {
        long j10;
        int k02 = k0();
        if (k02 == 7 || k02 == 6) {
            o oVar = (o) F0();
            if (oVar.f4162a instanceof Number) {
                j10 = oVar.n().longValue();
            } else {
                j10 = Long.parseLong(oVar.l());
            }
            N0();
            int i10 = this.f7822x;
            if (i10 > 0) {
                int[] iArr = this.f7824z;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return j10;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Expected ");
        q10.append(b0.F(7));
        q10.append(" but was ");
        q10.append(b0.F(k02));
        q10.append(N());
        throw new IllegalStateException(q10.toString());
    }

    public final String a0() {
        return B0(false);
    }

    public final void close() {
        this.f7821w = new Object[]{B};
        this.f7822x = 1;
    }

    public final void d() {
        A0(1);
        P0(((j) F0()).iterator());
        this.f7824z[this.f7822x - 1] = 0;
    }

    public final void d0() {
        A0(9);
        N0();
        int i10 = this.f7822x;
        if (i10 > 0) {
            int[] iArr = this.f7824z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final String g0() {
        int k02 = k0();
        if (k02 == 6 || k02 == 7) {
            String l10 = ((o) N0()).l();
            int i10 = this.f7822x;
            if (i10 > 0) {
                int[] iArr = this.f7824z;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return l10;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Expected ");
        q10.append(b0.F(6));
        q10.append(" but was ");
        q10.append(b0.F(k02));
        q10.append(N());
        throw new IllegalStateException(q10.toString());
    }

    public final void h() {
        A0(3);
        P0(new p.b.a((p.b) ((n) F0()).f4161a.entrySet()));
    }

    public final int k0() {
        if (this.f7822x == 0) {
            return 10;
        }
        Object F0 = F0();
        if (F0 instanceof Iterator) {
            boolean z10 = this.f7821w[this.f7822x - 2] instanceof n;
            Iterator it = (Iterator) F0;
            if (it.hasNext()) {
                if (z10) {
                    return 5;
                }
                P0(it.next());
                return k0();
            } else if (z10) {
                return 4;
            } else {
                return 2;
            }
        } else if (F0 instanceof n) {
            return 3;
        } else {
            if (F0 instanceof j) {
                return 1;
            }
            if (F0 instanceof o) {
                Serializable serializable = ((o) F0).f4162a;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (F0 instanceof m) {
                return 9;
            } else {
                if (F0 == B) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                StringBuilder q10 = android.support.v4.media.a.q("Custom JsonElement subclass ");
                q10.append(F0.getClass().getName());
                q10.append(" is not supported");
                throw new MalformedJsonException(q10.toString());
            }
        }
    }

    public final void s() {
        A0(2);
        N0();
        N0();
        int i10 = this.f7822x;
        if (i10 > 0) {
            int[] iArr = this.f7824z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final String toString() {
        return b.class.getSimpleName() + N();
    }

    public final void v() {
        A0(4);
        this.f7823y[this.f7822x - 1] = null;
        N0();
        N0();
        int i10 = this.f7822x;
        if (i10 > 0) {
            int[] iArr = this.f7824z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final void v0() {
        int g2 = v.g(k0());
        if (g2 == 1) {
            s();
        } else if (g2 == 9) {
        } else {
            if (g2 == 3) {
                v();
            } else if (g2 != 4) {
                N0();
                int i10 = this.f7822x;
                if (i10 > 0) {
                    int[] iArr = this.f7824z;
                    int i11 = i10 - 1;
                    iArr[i11] = iArr[i11] + 1;
                }
            } else {
                B0(true);
            }
        }
    }

    public final String z() {
        return B(false);
    }
}
