package hc;

import androidx.fragment.app.o;
import com.google.gson.internal.bind.b;
import com.google.gson.stream.MalformedJsonException;
import f0.b0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: JsonReader */
public class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Reader f10711a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10712b = false;

    /* renamed from: c  reason: collision with root package name */
    public final char[] f10713c = new char[1024];

    /* renamed from: d  reason: collision with root package name */
    public int f10714d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f10715e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f10716f = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f10717n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f10718o = 0;

    /* renamed from: p  reason: collision with root package name */
    public long f10719p;

    /* renamed from: q  reason: collision with root package name */
    public int f10720q;

    /* renamed from: r  reason: collision with root package name */
    public String f10721r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f10722s;

    /* renamed from: t  reason: collision with root package name */
    public int f10723t;

    /* renamed from: u  reason: collision with root package name */
    public String[] f10724u;

    /* renamed from: v  reason: collision with root package name */
    public int[] f10725v;

    /* renamed from: hc.a$a  reason: collision with other inner class name */
    /* compiled from: JsonReader */
    public class C0117a extends o {
        public final void J(a aVar) {
            if (aVar instanceof b) {
                b bVar = (b) aVar;
                bVar.A0(5);
                Map.Entry entry = (Map.Entry) ((Iterator) bVar.F0()).next();
                bVar.P0(entry.getValue());
                bVar.P0(new bc.o((String) entry.getKey()));
                return;
            }
            int i10 = aVar.f10718o;
            if (i10 == 0) {
                i10 = aVar.q();
            }
            if (i10 == 13) {
                aVar.f10718o = 9;
            } else if (i10 == 12) {
                aVar.f10718o = 8;
            } else if (i10 == 14) {
                aVar.f10718o = 10;
            } else {
                StringBuilder q10 = android.support.v4.media.a.q("Expected a name but was ");
                q10.append(b0.F(aVar.k0()));
                q10.append(aVar.N());
                throw new IllegalStateException(q10.toString());
            }
        }
    }

    static {
        o.f2694a = new C0117a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f10722s = iArr;
        this.f10723t = 0 + 1;
        iArr[0] = 6;
        this.f10724u = new String[32];
        this.f10725v = new int[32];
        Objects.requireNonNull(reader, "in == null");
        Reader reader2 = reader;
        this.f10711a = reader;
    }

    public final String B(boolean z10) {
        StringBuilder p10 = android.support.v4.media.a.p('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f10723t;
            if (i10 >= i11) {
                return p10.toString();
            }
            int i12 = this.f10722s[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f10725v[i10];
                if (z10 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                p10.append('[');
                p10.append(i13);
                p10.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                p10.append('.');
                String str = this.f10724u[i10];
                if (str != null) {
                    p10.append(str);
                }
            }
            i10++;
        }
    }

    public String E() {
        return B(true);
    }

    public boolean K() {
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 2 || i10 == 4 || i10 == 17) {
            return false;
        }
        return true;
    }

    public final boolean L(char c10) {
        if (c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (!(c10 == '/' || c10 == '=')) {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        i();
        return false;
    }

    public final String N() {
        StringBuilder u10 = b0.u(" at line ", this.f10716f + 1, " column ", (this.f10714d - this.f10717n) + 1, " path ");
        u10.append(z());
        return u10.toString();
    }

    public boolean R() {
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 5) {
            this.f10718o = 0;
            int[] iArr = this.f10725v;
            int i11 = this.f10723t - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f10718o = 0;
            int[] iArr2 = this.f10725v;
            int i12 = this.f10723t - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            StringBuilder q10 = android.support.v4.media.a.q("Expected a boolean but was ");
            q10.append(b0.F(k0()));
            q10.append(N());
            throw new IllegalStateException(q10.toString());
        }
    }

    public double S() {
        char c10;
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            this.f10718o = 0;
            int[] iArr = this.f10725v;
            int i11 = this.f10723t - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f10719p;
        }
        if (i10 == 16) {
            this.f10721r = new String(this.f10713c, this.f10714d, this.f10720q);
            this.f10714d += this.f10720q;
        } else if (i10 == 8 || i10 == 9) {
            if (i10 == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.f10721r = e0(c10);
        } else if (i10 == 10) {
            this.f10721r = j0();
        } else if (i10 != 11) {
            StringBuilder q10 = android.support.v4.media.a.q("Expected a double but was ");
            q10.append(b0.F(k0()));
            q10.append(N());
            throw new IllegalStateException(q10.toString());
        }
        this.f10718o = 11;
        double parseDouble = Double.parseDouble(this.f10721r);
        if (this.f10712b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f10721r = null;
            this.f10718o = 0;
            int[] iArr2 = this.f10725v;
            int i12 = this.f10723t - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + N());
    }

    public int U() {
        char c10;
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            long j10 = this.f10719p;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f10718o = 0;
                int[] iArr = this.f10725v;
                int i12 = this.f10723t - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            StringBuilder q10 = android.support.v4.media.a.q("Expected an int but was ");
            q10.append(this.f10719p);
            q10.append(N());
            throw new NumberFormatException(q10.toString());
        }
        if (i10 == 16) {
            this.f10721r = new String(this.f10713c, this.f10714d, this.f10720q);
            this.f10714d += this.f10720q;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                this.f10721r = j0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f10721r = e0(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.f10721r);
                this.f10718o = 0;
                int[] iArr2 = this.f10725v;
                int i13 = this.f10723t - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder q11 = android.support.v4.media.a.q("Expected an int but was ");
            q11.append(b0.F(k0()));
            q11.append(N());
            throw new IllegalStateException(q11.toString());
        }
        this.f10718o = 11;
        double parseDouble = Double.parseDouble(this.f10721r);
        int i14 = (int) parseDouble;
        if (((double) i14) == parseDouble) {
            this.f10721r = null;
            this.f10718o = 0;
            int[] iArr3 = this.f10725v;
            int i15 = this.f10723t - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        StringBuilder q12 = android.support.v4.media.a.q("Expected an int but was ");
        q12.append(this.f10721r);
        q12.append(N());
        throw new NumberFormatException(q12.toString());
    }

    public long W() {
        char c10;
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            this.f10718o = 0;
            int[] iArr = this.f10725v;
            int i11 = this.f10723t - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f10719p;
        }
        if (i10 == 16) {
            this.f10721r = new String(this.f10713c, this.f10714d, this.f10720q);
            this.f10714d += this.f10720q;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                this.f10721r = j0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f10721r = e0(c10);
            }
            try {
                long parseLong = Long.parseLong(this.f10721r);
                this.f10718o = 0;
                int[] iArr2 = this.f10725v;
                int i12 = this.f10723t - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder q10 = android.support.v4.media.a.q("Expected a long but was ");
            q10.append(b0.F(k0()));
            q10.append(N());
            throw new IllegalStateException(q10.toString());
        }
        this.f10718o = 11;
        double parseDouble = Double.parseDouble(this.f10721r);
        long j10 = (long) parseDouble;
        if (((double) j10) == parseDouble) {
            this.f10721r = null;
            this.f10718o = 0;
            int[] iArr3 = this.f10725v;
            int i13 = this.f10723t - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        StringBuilder q11 = android.support.v4.media.a.q("Expected a long but was ");
        q11.append(this.f10721r);
        q11.append(N());
        throw new NumberFormatException(q11.toString());
    }

    public String a0() {
        String str;
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 14) {
            str = j0();
        } else if (i10 == 12) {
            str = e0('\'');
        } else if (i10 == 13) {
            str = e0('\"');
        } else {
            StringBuilder q10 = android.support.v4.media.a.q("Expected a name but was ");
            q10.append(b0.F(k0()));
            q10.append(N());
            throw new IllegalStateException(q10.toString());
        }
        this.f10718o = 0;
        this.f10724u[this.f10723t - 1] = str;
        return str;
    }

    public final int c0(boolean z10) {
        char[] cArr = this.f10713c;
        int i10 = this.f10714d;
        int i11 = this.f10715e;
        while (true) {
            boolean z11 = true;
            if (i10 == i11) {
                this.f10714d = i10;
                if (x(1)) {
                    i10 = this.f10714d;
                    i11 = this.f10715e;
                } else if (!z10) {
                    return -1;
                } else {
                    StringBuilder q10 = android.support.v4.media.a.q("End of input");
                    q10.append(N());
                    throw new EOFException(q10.toString());
                }
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == 10) {
                this.f10716f++;
                this.f10717n = i12;
            } else if (!(c10 == ' ' || c10 == 13 || c10 == 9)) {
                if (c10 == '/') {
                    this.f10714d = i12;
                    if (i12 == i11) {
                        this.f10714d = i12 - 1;
                        boolean x10 = x(2);
                        this.f10714d++;
                        if (!x10) {
                            return c10;
                        }
                    }
                    i();
                    int i13 = this.f10714d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f10714d = i13 + 1;
                        while (true) {
                            int i14 = 0;
                            if (this.f10714d + 2 > this.f10715e && !x(2)) {
                                z11 = false;
                                break;
                            }
                            char[] cArr2 = this.f10713c;
                            int i15 = this.f10714d;
                            if (cArr2[i15] != 10) {
                                while (i14 < 2) {
                                    if (this.f10713c[this.f10714d + i14] == "*/".charAt(i14)) {
                                        i14++;
                                    }
                                }
                                break;
                            }
                            this.f10716f++;
                            this.f10717n = i15 + 1;
                            this.f10714d++;
                        }
                        if (z11) {
                            i10 = this.f10714d + 2;
                            i11 = this.f10715e;
                        } else {
                            w0("Unterminated comment");
                            throw null;
                        }
                    } else if (c11 != '/') {
                        return c10;
                    } else {
                        this.f10714d = i13 + 1;
                        s0();
                        i10 = this.f10714d;
                        i11 = this.f10715e;
                    }
                } else if (c10 == '#') {
                    this.f10714d = i12;
                    i();
                    s0();
                    i10 = this.f10714d;
                    i11 = this.f10715e;
                } else {
                    this.f10714d = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }

    public void close() {
        this.f10718o = 0;
        this.f10722s[0] = 8;
        this.f10723t = 1;
        this.f10711a.close();
    }

    public void d() {
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 3) {
            l0(1);
            this.f10725v[this.f10723t - 1] = 0;
            this.f10718o = 0;
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Expected BEGIN_ARRAY but was ");
        q10.append(b0.F(k0()));
        q10.append(N());
        throw new IllegalStateException(q10.toString());
    }

    public void d0() {
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 7) {
            this.f10718o = 0;
            int[] iArr = this.f10725v;
            int i11 = this.f10723t - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Expected null but was ");
        q10.append(b0.F(k0()));
        q10.append(N());
        throw new IllegalStateException(q10.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r2 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r5 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r2.append(r0, r3, r5 - r3);
        r10.f10714d = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e0(char r11) {
        /*
            r10 = this;
            char[] r0 = r10.f10713c
            r1 = 0
            r2 = r1
        L_0x0004:
            int r3 = r10.f10714d
            int r4 = r10.f10715e
        L_0x0008:
            r5 = r3
        L_0x0009:
            r6 = 16
            r7 = 1
            if (r5 >= r4) goto L_0x005c
            int r8 = r5 + 1
            char r5 = r0[r5]
            if (r5 != r11) goto L_0x0028
            r10.f10714d = r8
            int r8 = r8 - r3
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0020
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r3, r8)
            return r11
        L_0x0020:
            r2.append(r0, r3, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L_0x0028:
            r9 = 92
            if (r5 != r9) goto L_0x004f
            r10.f10714d = r8
            int r8 = r8 - r3
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0040
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r4.<init>(r2)
            r2 = r4
        L_0x0040:
            r2.append(r0, r3, r8)
            char r3 = r10.n0()
            r2.append(r3)
            int r3 = r10.f10714d
            int r4 = r10.f10715e
            goto L_0x0008
        L_0x004f:
            r6 = 10
            if (r5 != r6) goto L_0x005a
            int r5 = r10.f10716f
            int r5 = r5 + r7
            r10.f10716f = r5
            r10.f10717n = r8
        L_0x005a:
            r5 = r8
            goto L_0x0009
        L_0x005c:
            if (r2 != 0) goto L_0x006c
            int r2 = r5 - r3
            int r2 = r2 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r4.<init>(r2)
            r2 = r4
        L_0x006c:
            int r4 = r5 - r3
            r2.append(r0, r3, r4)
            r10.f10714d = r5
            boolean r3 = r10.x(r7)
            if (r3 == 0) goto L_0x007a
            goto L_0x0004
        L_0x007a:
            java.lang.String r11 = "Unterminated string"
            r10.w0(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.a.e0(char):java.lang.String");
    }

    public String g0() {
        String str;
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 10) {
            str = j0();
        } else if (i10 == 8) {
            str = e0('\'');
        } else if (i10 == 9) {
            str = e0('\"');
        } else if (i10 == 11) {
            str = this.f10721r;
            this.f10721r = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f10719p);
        } else if (i10 == 16) {
            str = new String(this.f10713c, this.f10714d, this.f10720q);
            this.f10714d += this.f10720q;
        } else {
            StringBuilder q10 = android.support.v4.media.a.q("Expected a string but was ");
            q10.append(b0.F(k0()));
            q10.append(N());
            throw new IllegalStateException(q10.toString());
        }
        this.f10718o = 0;
        int[] iArr = this.f10725v;
        int i11 = this.f10723t - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public void h() {
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 1) {
            l0(3);
            this.f10718o = 0;
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Expected BEGIN_OBJECT but was ");
        q10.append(b0.F(k0()));
        q10.append(N());
        throw new IllegalStateException(q10.toString());
    }

    public final void i() {
        if (!this.f10712b) {
            w0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String j0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r0
        L_0x0003:
            int r3 = r6.f10714d
            int r4 = r3 + r2
            int r5 = r6.f10715e
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f10713c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.i()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f10713c
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.x(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f10713c
            int r4 = r6.f10714d
            r1.append(r3, r4, r2)
            int r3 = r6.f10714d
            int r3 = r3 + r2
            r6.f10714d = r3
            r2 = 1
            boolean r2 = r6.x(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f10713c
            int r3 = r6.f10714d
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f10713c
            int r3 = r6.f10714d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f10714d
            int r2 = r2 + r0
            r6.f10714d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.a.j0():java.lang.String");
    }

    public int k0() {
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void l0(int i10) {
        int i11 = this.f10723t;
        int[] iArr = this.f10722s;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f10722s = Arrays.copyOf(iArr, i12);
            this.f10725v = Arrays.copyOf(this.f10725v, i12);
            this.f10724u = (String[]) Arrays.copyOf(this.f10724u, i12);
        }
        int[] iArr2 = this.f10722s;
        int i13 = this.f10723t;
        this.f10723t = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char n0() {
        int i10;
        int i11;
        if (this.f10714d != this.f10715e || x(1)) {
            char[] cArr = this.f10713c;
            int i12 = this.f10714d;
            int i13 = i12 + 1;
            this.f10714d = i13;
            char c10 = cArr[i12];
            if (c10 == 10) {
                this.f10716f++;
                this.f10717n = i13;
            } else if (!(c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\')) {
                if (c10 == 'b') {
                    return 8;
                }
                if (c10 == 'f') {
                    return 12;
                }
                if (c10 == 'n') {
                    return 10;
                }
                if (c10 == 'r') {
                    return 13;
                }
                if (c10 == 't') {
                    return 9;
                }
                if (c10 != 'u') {
                    w0("Invalid escape sequence");
                    throw null;
                } else if (i13 + 4 <= this.f10715e || x(4)) {
                    char c11 = 0;
                    int i14 = this.f10714d;
                    int i15 = i14 + 4;
                    while (i14 < i15) {
                        char c12 = this.f10713c[i14];
                        char c13 = (char) (c11 << 4);
                        if (c12 < '0' || c12 > '9') {
                            if (c12 >= 'a' && c12 <= 'f') {
                                i11 = c12 - 'a';
                            } else if (c12 < 'A' || c12 > 'F') {
                                StringBuilder q10 = android.support.v4.media.a.q("\\u");
                                q10.append(new String(this.f10713c, this.f10714d, 4));
                                throw new NumberFormatException(q10.toString());
                            } else {
                                i11 = c12 - 'A';
                            }
                            i10 = i11 + 10;
                        } else {
                            i10 = c12 - '0';
                        }
                        c11 = (char) (i10 + c13);
                        i14++;
                    }
                    this.f10714d += 4;
                    return c11;
                } else {
                    w0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c10;
        }
        w0("Unterminated escape sequence");
        throw null;
    }

    public final void o0(char c10) {
        char[] cArr = this.f10713c;
        do {
            int i10 = this.f10714d;
            int i11 = this.f10715e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f10714d = i12;
                    return;
                } else if (c11 == '\\') {
                    this.f10714d = i12;
                    n0();
                    i10 = this.f10714d;
                    i11 = this.f10715e;
                } else {
                    if (c11 == 10) {
                        this.f10716f++;
                        this.f10717n = i12;
                    }
                    i10 = i12;
                }
            }
            this.f10714d = i10;
        } while (x(1));
        w0("Unterminated string");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0211, code lost:
        if (L(r1) != false) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0213, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0214, code lost:
        if (r5 != 2) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0216, code lost:
        if (r15 == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x021c, code lost:
        if (r8 != Long.MIN_VALUE) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x021e, code lost:
        if (r12 == 0) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0222, code lost:
        if (r8 != 0) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0224, code lost:
        if (r12 != 0) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0226, code lost:
        if (r12 == 0) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0229, code lost:
        r8 = -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x022a, code lost:
        r0.f10719p = r8;
        r0.f10714d += r7;
        r7 = 15;
        r0.f10718o = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0236, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0237, code lost:
        if (r5 == r1) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x023a, code lost:
        if (r5 == 4) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x023d, code lost:
        if (r5 != 7) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x023f, code lost:
        r0.f10720q = r7;
        r7 = 16;
        r0.f10718o = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0181 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int q() {
        /*
            r18 = this;
            r0 = r18
            int[] r1 = r0.f10722s
            int r2 = r0.f10723t
            int r3 = r2 + -1
            r3 = r1[r3]
            r6 = 6
            r8 = 3
            r10 = 0
            r11 = 4
            r12 = 2
            r13 = 1
            r14 = 10
            r15 = 39
            r5 = 93
            r4 = 59
            r7 = 44
            r9 = 5
            if (r3 != r13) goto L_0x0023
            int r2 = r2 - r13
            r1[r2] = r12
        L_0x0020:
            r10 = 7
            goto L_0x00c0
        L_0x0023:
            if (r3 != r12) goto L_0x003c
            int r1 = r0.c0(r13)
            if (r1 == r7) goto L_0x0020
            if (r1 == r4) goto L_0x0038
            if (r1 != r5) goto L_0x0032
            r0.f10718o = r11
            return r11
        L_0x0032:
            java.lang.String r1 = "Unterminated array"
            r0.w0(r1)
            throw r10
        L_0x0038:
            r18.i()
            goto L_0x0020
        L_0x003c:
            r12 = 125(0x7d, float:1.75E-43)
            if (r3 == r8) goto L_0x02c7
            if (r3 != r9) goto L_0x0044
            goto L_0x02c7
        L_0x0044:
            if (r3 != r11) goto L_0x0078
            int r2 = r2 - r13
            r1[r2] = r9
            int r1 = r0.c0(r13)
            r2 = 58
            if (r1 == r2) goto L_0x0020
            r2 = 61
            if (r1 != r2) goto L_0x0072
            r18.i()
            int r1 = r0.f10714d
            int r2 = r0.f10715e
            if (r1 < r2) goto L_0x0064
            boolean r1 = r0.x(r13)
            if (r1 == 0) goto L_0x0020
        L_0x0064:
            char[] r1 = r0.f10713c
            int r2 = r0.f10714d
            char r1 = r1[r2]
            r12 = 62
            if (r1 != r12) goto L_0x0020
            int r2 = r2 + r13
            r0.f10714d = r2
            goto L_0x0020
        L_0x0072:
            java.lang.String r1 = "Expected ':'"
            r0.w0(r1)
            throw r10
        L_0x0078:
            if (r3 != r6) goto L_0x00c2
            boolean r1 = r0.f10712b
            if (r1 == 0) goto L_0x00b8
            r0.c0(r13)
            int r1 = r0.f10714d
            int r1 = r1 - r13
            r0.f10714d = r1
            int r1 = r1 + r9
            int r2 = r0.f10715e
            if (r1 <= r2) goto L_0x0092
            boolean r1 = r0.x(r9)
            if (r1 != 0) goto L_0x0092
            goto L_0x00b8
        L_0x0092:
            int r1 = r0.f10714d
            char[] r2 = r0.f10713c
            char r10 = r2[r1]
            r11 = 41
            if (r10 != r11) goto L_0x00b8
            int r10 = r1 + 1
            char r10 = r2[r10]
            if (r10 != r5) goto L_0x00b8
            int r10 = r1 + 2
            char r10 = r2[r10]
            if (r10 != r12) goto L_0x00b8
            int r10 = r1 + 3
            char r10 = r2[r10]
            if (r10 != r15) goto L_0x00b8
            int r10 = r1 + 4
            char r2 = r2[r10]
            if (r2 == r14) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            int r1 = r1 + r9
            r0.f10714d = r1
        L_0x00b8:
            int[] r1 = r0.f10722s
            int r2 = r0.f10723t
            int r2 = r2 - r13
            r10 = 7
            r1[r2] = r10
        L_0x00c0:
            r1 = 0
            goto L_0x00e0
        L_0x00c2:
            r10 = 7
            if (r3 != r10) goto L_0x00db
            r1 = 0
            int r2 = r0.c0(r1)
            r10 = -1
            if (r2 != r10) goto L_0x00d2
            r1 = 17
            r0.f10718o = r1
            return r1
        L_0x00d2:
            r18.i()
            int r2 = r0.f10714d
            int r2 = r2 - r13
            r0.f10714d = r2
            goto L_0x00e0
        L_0x00db:
            r1 = 0
            r2 = 8
            if (r3 == r2) goto L_0x02bf
        L_0x00e0:
            int r2 = r0.c0(r13)
            r10 = 34
            if (r2 == r10) goto L_0x02ba
            if (r2 == r15) goto L_0x02b2
            if (r2 == r7) goto L_0x0298
            if (r2 == r4) goto L_0x0298
            r4 = 91
            if (r2 == r4) goto L_0x0294
            if (r2 == r5) goto L_0x028d
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L_0x0289
            int r2 = r0.f10714d
            int r2 = r2 - r13
            r0.f10714d = r2
            char[] r3 = r0.f10713c
            char r2 = r3[r2]
            r3 = 116(0x74, float:1.63E-43)
            if (r2 == r3) goto L_0x0127
            r3 = 84
            if (r2 != r3) goto L_0x010a
            goto L_0x0127
        L_0x010a:
            r3 = 102(0x66, float:1.43E-43)
            if (r2 == r3) goto L_0x0121
            r3 = 70
            if (r2 != r3) goto L_0x0113
            goto L_0x0121
        L_0x0113:
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 == r3) goto L_0x011b
            r3 = 78
            if (r2 != r3) goto L_0x0176
        L_0x011b:
            java.lang.String r2 = "null"
            java.lang.String r3 = "NULL"
            r4 = 7
            goto L_0x012c
        L_0x0121:
            java.lang.String r2 = "false"
            java.lang.String r3 = "FALSE"
            r4 = r6
            goto L_0x012c
        L_0x0127:
            java.lang.String r2 = "true"
            java.lang.String r3 = "TRUE"
            r4 = r9
        L_0x012c:
            int r5 = r2.length()
            r7 = r13
        L_0x0131:
            if (r7 >= r5) goto L_0x015a
            int r10 = r0.f10714d
            int r10 = r10 + r7
            int r11 = r0.f10715e
            if (r10 < r11) goto L_0x0143
            int r10 = r7 + 1
            boolean r10 = r0.x(r10)
            if (r10 != 0) goto L_0x0143
            goto L_0x0176
        L_0x0143:
            char[] r10 = r0.f10713c
            int r11 = r0.f10714d
            int r11 = r11 + r7
            char r10 = r10[r11]
            char r11 = r2.charAt(r7)
            if (r10 == r11) goto L_0x0157
            char r11 = r3.charAt(r7)
            if (r10 == r11) goto L_0x0157
            goto L_0x0176
        L_0x0157:
            int r7 = r7 + 1
            goto L_0x0131
        L_0x015a:
            int r2 = r0.f10714d
            int r2 = r2 + r5
            int r3 = r0.f10715e
            if (r2 < r3) goto L_0x0169
            int r2 = r5 + 1
            boolean r2 = r0.x(r2)
            if (r2 == 0) goto L_0x0178
        L_0x0169:
            char[] r2 = r0.f10713c
            int r3 = r0.f10714d
            int r3 = r3 + r5
            char r2 = r2[r3]
            boolean r2 = r0.L(r2)
            if (r2 == 0) goto L_0x0178
        L_0x0176:
            r4 = r1
            goto L_0x017f
        L_0x0178:
            int r2 = r0.f10714d
            int r2 = r2 + r5
            r0.f10714d = r2
            r0.f10718o = r4
        L_0x017f:
            if (r4 == 0) goto L_0x0182
            return r4
        L_0x0182:
            char[] r2 = r0.f10713c
            int r3 = r0.f10714d
            int r4 = r0.f10715e
            r10 = 0
            r5 = r1
            r7 = r5
            r12 = r7
            r8 = r10
            r15 = r13
        L_0x018f:
            int r1 = r3 + r7
            if (r1 != r4) goto L_0x01a8
            int r1 = r2.length
            if (r7 != r1) goto L_0x0198
            goto L_0x026a
        L_0x0198:
            int r1 = r7 + 1
            boolean r1 = r0.x(r1)
            if (r1 != 0) goto L_0x01a2
            goto L_0x0213
        L_0x01a2:
            int r1 = r0.f10714d
            int r3 = r0.f10715e
            r4 = r3
            r3 = r1
        L_0x01a8:
            int r1 = r3 + r7
            char r1 = r2[r1]
            r14 = 43
            if (r1 == r14) goto L_0x025e
            r14 = 69
            if (r1 == r14) goto L_0x0255
            r14 = 101(0x65, float:1.42E-43)
            if (r1 == r14) goto L_0x0255
            r14 = 45
            if (r1 == r14) goto L_0x024b
            r14 = 46
            if (r1 == r14) goto L_0x0246
            r14 = 48
            if (r1 < r14) goto L_0x020d
            r14 = 57
            if (r1 <= r14) goto L_0x01c9
            goto L_0x020d
        L_0x01c9:
            if (r5 == r13) goto L_0x0207
            if (r5 != 0) goto L_0x01ce
            goto L_0x0207
        L_0x01ce:
            r14 = 2
            if (r5 != r14) goto L_0x01f9
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 != 0) goto L_0x01d7
            goto L_0x026a
        L_0x01d7:
            r16 = 10
            long r16 = r16 * r8
            int r1 = r1 + -48
            long r13 = (long) r1
            long r16 = r16 - r13
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x01f2
            if (r1 != 0) goto L_0x01f0
            int r1 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x01f0
            goto L_0x01f2
        L_0x01f0:
            r1 = 0
            goto L_0x01f3
        L_0x01f2:
            r1 = 1
        L_0x01f3:
            r1 = r1 & r15
            r15 = r1
            r8 = r16
            goto L_0x0263
        L_0x01f9:
            r1 = 3
            if (r5 != r1) goto L_0x01ff
            r5 = 4
            goto L_0x0263
        L_0x01ff:
            r1 = 5
            if (r5 == r1) goto L_0x0204
            if (r5 != r6) goto L_0x0263
        L_0x0204:
            r5 = 7
            goto L_0x0263
        L_0x0207:
            int r1 = r1 + -48
            int r1 = -r1
            long r8 = (long) r1
            r5 = 2
            goto L_0x0263
        L_0x020d:
            boolean r1 = r0.L(r1)
            if (r1 != 0) goto L_0x026a
        L_0x0213:
            r1 = 2
            if (r5 != r1) goto L_0x0237
            if (r15 == 0) goto L_0x0236
            r1 = -9223372036854775808
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0220
            if (r12 == 0) goto L_0x0236
        L_0x0220:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0226
            if (r12 != 0) goto L_0x0236
        L_0x0226:
            if (r12 == 0) goto L_0x0229
            goto L_0x022a
        L_0x0229:
            long r8 = -r8
        L_0x022a:
            r0.f10719p = r8
            int r1 = r0.f10714d
            int r1 = r1 + r7
            r0.f10714d = r1
            r7 = 15
            r0.f10718o = r7
            goto L_0x026b
        L_0x0236:
            r1 = 2
        L_0x0237:
            if (r5 == r1) goto L_0x023f
            r1 = 4
            if (r5 == r1) goto L_0x023f
            r1 = 7
            if (r5 != r1) goto L_0x026a
        L_0x023f:
            r0.f10720q = r7
            r7 = 16
            r0.f10718o = r7
            goto L_0x026b
        L_0x0246:
            r1 = 2
            if (r5 != r1) goto L_0x026a
            r1 = 3
            goto L_0x0262
        L_0x024b:
            r1 = 2
            if (r5 != 0) goto L_0x0251
            r5 = 1
            r12 = 1
            goto L_0x0263
        L_0x0251:
            r13 = 5
            if (r5 != r13) goto L_0x026a
            goto L_0x0261
        L_0x0255:
            r1 = 2
            r13 = 5
            if (r5 == r1) goto L_0x025c
            r1 = 4
            if (r5 != r1) goto L_0x026a
        L_0x025c:
            r5 = r13
            goto L_0x0263
        L_0x025e:
            r13 = 5
            if (r5 != r13) goto L_0x026a
        L_0x0261:
            r1 = r6
        L_0x0262:
            r5 = r1
        L_0x0263:
            int r7 = r7 + 1
            r13 = 1
            r14 = 10
            goto L_0x018f
        L_0x026a:
            r7 = 0
        L_0x026b:
            if (r7 == 0) goto L_0x026e
            return r7
        L_0x026e:
            char[] r1 = r0.f10713c
            int r2 = r0.f10714d
            char r1 = r1[r2]
            boolean r1 = r0.L(r1)
            if (r1 == 0) goto L_0x0282
            r18.i()
            r1 = 10
            r0.f10718o = r1
            return r1
        L_0x0282:
            java.lang.String r1 = "Expected value"
            r0.w0(r1)
            r1 = 0
            throw r1
        L_0x0289:
            r1 = r13
            r0.f10718o = r1
            return r1
        L_0x028d:
            r1 = r13
            if (r3 != r1) goto L_0x0299
            r2 = 4
            r0.f10718o = r2
            return r2
        L_0x0294:
            r2 = r8
            r0.f10718o = r2
            return r2
        L_0x0298:
            r1 = r13
        L_0x0299:
            if (r3 == r1) goto L_0x02a6
            r2 = 2
            if (r3 != r2) goto L_0x029f
            goto L_0x02a6
        L_0x029f:
            java.lang.String r1 = "Unexpected value"
            r0.w0(r1)
            r1 = 0
            throw r1
        L_0x02a6:
            r18.i()
            int r2 = r0.f10714d
            int r2 = r2 - r1
            r0.f10714d = r2
            r1 = 7
            r0.f10718o = r1
            return r1
        L_0x02b2:
            r18.i()
            r1 = 8
            r0.f10718o = r1
            return r1
        L_0x02ba:
            r1 = 9
            r0.f10718o = r1
            return r1
        L_0x02bf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02c7:
            r5 = r13
            int r2 = r2 - r5
            r6 = 4
            r1[r2] = r6
            r1 = 5
            if (r3 != r1) goto L_0x02e9
            int r1 = r0.c0(r5)
            if (r1 == r7) goto L_0x02e7
            if (r1 == r4) goto L_0x02e4
            if (r1 != r12) goto L_0x02dd
            r1 = 2
            r0.f10718o = r1
            return r1
        L_0x02dd:
            java.lang.String r1 = "Unterminated object"
            r0.w0(r1)
            r1 = 0
            throw r1
        L_0x02e4:
            r18.i()
        L_0x02e7:
            r1 = 1
            goto L_0x02ea
        L_0x02e9:
            r1 = r5
        L_0x02ea:
            int r2 = r0.c0(r1)
            r4 = 34
            if (r2 == r4) goto L_0x0325
            if (r2 == r15) goto L_0x031d
            java.lang.String r4 = "Expected name"
            if (r2 == r12) goto L_0x0311
            r18.i()
            int r3 = r0.f10714d
            int r3 = r3 - r1
            r0.f10714d = r3
            char r1 = (char) r2
            boolean r1 = r0.L(r1)
            if (r1 == 0) goto L_0x030c
            r1 = 14
            r0.f10718o = r1
            return r1
        L_0x030c:
            r0.w0(r4)
            r1 = 0
            throw r1
        L_0x0311:
            r1 = 0
            r2 = 5
            if (r3 == r2) goto L_0x0319
            r2 = 2
            r0.f10718o = r2
            return r2
        L_0x0319:
            r0.w0(r4)
            throw r1
        L_0x031d:
            r18.i()
            r1 = 12
            r0.f10718o = r1
            return r1
        L_0x0325:
            r1 = 13
            r0.f10718o = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.a.q():int");
    }

    public void s() {
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 4) {
            int i11 = this.f10723t - 1;
            this.f10723t = i11;
            int[] iArr = this.f10725v;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f10718o = 0;
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Expected END_ARRAY but was ");
        q10.append(b0.F(k0()));
        q10.append(N());
        throw new IllegalStateException(q10.toString());
    }

    public final void s0() {
        char c10;
        do {
            if (this.f10714d < this.f10715e || x(1)) {
                char[] cArr = this.f10713c;
                int i10 = this.f10714d;
                int i11 = i10 + 1;
                this.f10714d = i11;
                c10 = cArr[i10];
                if (c10 == 10) {
                    this.f10716f++;
                    this.f10717n = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f10714d
            int r2 = r1 + r0
            int r3 = r4.f10715e
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f10713c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.i()
        L_0x004b:
            int r1 = r4.f10714d
            int r1 = r1 + r0
            r4.f10714d = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f10714d = r1
            r0 = 1
            boolean r0 = r4.x(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.a.t0():void");
    }

    public String toString() {
        return getClass().getSimpleName() + N();
    }

    public void v() {
        int i10 = this.f10718o;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 2) {
            int i11 = this.f10723t - 1;
            this.f10723t = i11;
            this.f10724u[i11] = null;
            int[] iArr = this.f10725v;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f10718o = 0;
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Expected END_OBJECT but was ");
        q10.append(b0.F(k0()));
        q10.append(N());
        throw new IllegalStateException(q10.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        r7.f10718o = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v0() {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r7.f10718o
            if (r2 != 0) goto L_0x000a
            int r2 = r7.q()
        L_0x000a:
            r3 = 34
            r4 = 39
            java.lang.String r5 = "<skipped>"
            r6 = 1
            switch(r2) {
                case 1: goto L_0x006d;
                case 2: goto L_0x005d;
                case 3: goto L_0x0059;
                case 4: goto L_0x0051;
                case 5: goto L_0x0014;
                case 6: goto L_0x0014;
                case 7: goto L_0x0014;
                case 8: goto L_0x004d;
                case 9: goto L_0x0049;
                case 10: goto L_0x0045;
                case 11: goto L_0x0014;
                case 12: goto L_0x0038;
                case 13: goto L_0x002b;
                case 14: goto L_0x001e;
                case 15: goto L_0x0014;
                case 16: goto L_0x0016;
                case 17: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0073
        L_0x0015:
            return
        L_0x0016:
            int r2 = r7.f10714d
            int r3 = r7.f10720q
            int r2 = r2 + r3
            r7.f10714d = r2
            goto L_0x0073
        L_0x001e:
            r7.t0()
            if (r1 != 0) goto L_0x0073
            java.lang.String[] r2 = r7.f10724u
            int r3 = r7.f10723t
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0073
        L_0x002b:
            r7.o0(r3)
            if (r1 != 0) goto L_0x0073
            java.lang.String[] r2 = r7.f10724u
            int r3 = r7.f10723t
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0073
        L_0x0038:
            r7.o0(r4)
            if (r1 != 0) goto L_0x0073
            java.lang.String[] r2 = r7.f10724u
            int r3 = r7.f10723t
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0073
        L_0x0045:
            r7.t0()
            goto L_0x0073
        L_0x0049:
            r7.o0(r3)
            goto L_0x0073
        L_0x004d:
            r7.o0(r4)
            goto L_0x0073
        L_0x0051:
            int r2 = r7.f10723t
            int r2 = r2 - r6
            r7.f10723t = r2
        L_0x0056:
            int r1 = r1 + -1
            goto L_0x0073
        L_0x0059:
            r7.l0(r6)
            goto L_0x0071
        L_0x005d:
            if (r1 != 0) goto L_0x0067
            java.lang.String[] r2 = r7.f10724u
            int r3 = r7.f10723t
            int r3 = r3 - r6
            r4 = 0
            r2[r3] = r4
        L_0x0067:
            int r2 = r7.f10723t
            int r2 = r2 - r6
            r7.f10723t = r2
            goto L_0x0056
        L_0x006d:
            r2 = 3
            r7.l0(r2)
        L_0x0071:
            int r1 = r1 + 1
        L_0x0073:
            r7.f10718o = r0
            if (r1 > 0) goto L_0x0002
            int[] r0 = r7.f10725v
            int r1 = r7.f10723t
            int r1 = r1 - r6
            r2 = r0[r1]
            int r2 = r2 + r6
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.a.v0():void");
    }

    public final void w0(String str) {
        StringBuilder q10 = android.support.v4.media.a.q(str);
        q10.append(N());
        throw new MalformedJsonException(q10.toString());
    }

    public final boolean x(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f10713c;
        int i13 = this.f10717n;
        int i14 = this.f10714d;
        this.f10717n = i13 - i14;
        int i15 = this.f10715e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f10715e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f10715e = 0;
        }
        this.f10714d = 0;
        do {
            Reader reader = this.f10711a;
            int i17 = this.f10715e;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f10715e + read;
            this.f10715e = i11;
            if (this.f10716f == 0 && (i12 = this.f10717n) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f10714d++;
                this.f10717n = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    public String z() {
        return B(false);
    }
}
