package m4;

import android.support.v4.media.a;
import f0.b0;
import java.io.EOFException;
import ll.f;
import ll.i;
import ll.j;
import ll.w;
import m4.c;

/* compiled from: JsonUtf8Reader */
public final class d extends c {

    /* renamed from: s  reason: collision with root package name */
    public static final j f13126s = j.a.b("'\\");

    /* renamed from: t  reason: collision with root package name */
    public static final j f13127t = j.a.b("\"\\");

    /* renamed from: u  reason: collision with root package name */
    public static final j f13128u = j.a.b("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: f  reason: collision with root package name */
    public final i f13129f;

    /* renamed from: n  reason: collision with root package name */
    public final f f13130n;

    /* renamed from: o  reason: collision with root package name */
    public int f13131o = 0;

    /* renamed from: p  reason: collision with root package name */
    public long f13132p;

    /* renamed from: q  reason: collision with root package name */
    public int f13133q;

    /* renamed from: r  reason: collision with root package name */
    public String f13134r;

    static {
        j jVar = j.f20882d;
        j.a.b("\n\r");
        j.a.b("*/");
    }

    public d(w wVar) {
        this.f13129f = wVar;
        this.f13130n = wVar.f20915b;
        L(6);
    }

    public final int B() {
        String str;
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 == 16) {
            long j10 = this.f13132p;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f13131o = 0;
                int[] iArr = this.f13123d;
                int i12 = this.f13120a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            StringBuilder q10 = a.q("Expected an int but was ");
            q10.append(this.f13132p);
            q10.append(" at path ");
            q10.append(s());
            throw new a(q10.toString());
        }
        if (i10 == 17) {
            this.f13134r = this.f13130n.W((long) this.f13133q);
        } else if (i10 == 9 || i10 == 8) {
            if (i10 == 9) {
                str = j0(f13127t);
            } else {
                str = j0(f13126s);
            }
            this.f13134r = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f13131o = 0;
                int[] iArr2 = this.f13123d;
                int i13 = this.f13120a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            StringBuilder q11 = a.q("Expected an int but was ");
            q11.append(b0.I(K()));
            q11.append(" at path ");
            q11.append(s());
            throw new a(q11.toString());
        }
        this.f13131o = 11;
        try {
            double parseDouble = Double.parseDouble(this.f13134r);
            int i14 = (int) parseDouble;
            if (((double) i14) == parseDouble) {
                this.f13134r = null;
                this.f13131o = 0;
                int[] iArr3 = this.f13123d;
                int i15 = this.f13120a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            StringBuilder q12 = a.q("Expected an int but was ");
            q12.append(this.f13134r);
            q12.append(" at path ");
            q12.append(s());
            throw new a(q12.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder q13 = a.q("Expected an int but was ");
            q13.append(this.f13134r);
            q13.append(" at path ");
            q13.append(s());
            throw new a(q13.toString());
        }
    }

    public final String E() {
        String str;
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 == 10) {
            str = k0();
        } else if (i10 == 9) {
            str = j0(f13127t);
        } else if (i10 == 8) {
            str = j0(f13126s);
        } else if (i10 == 11) {
            str = this.f13134r;
            this.f13134r = null;
        } else if (i10 == 16) {
            str = Long.toString(this.f13132p);
        } else if (i10 == 17) {
            str = this.f13130n.W((long) this.f13133q);
        } else {
            StringBuilder q10 = a.q("Expected a string but was ");
            q10.append(b0.I(K()));
            q10.append(" at path ");
            q10.append(s());
            throw new a(q10.toString());
        }
        this.f13131o = 0;
        int[] iArr = this.f13123d;
        int i11 = this.f13120a - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public final int K() {
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final int N(c.a aVar) {
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return c0(this.f13134r, aVar);
        }
        int u02 = this.f13129f.u0(aVar.f13125b);
        if (u02 != -1) {
            this.f13131o = 0;
            this.f13122c[this.f13120a - 1] = aVar.f13124a[u02];
            return u02;
        }
        String str = this.f13122c[this.f13120a - 1];
        String e02 = e0();
        int c02 = c0(e02, aVar);
        if (c02 == -1) {
            this.f13131o = 15;
            this.f13134r = e02;
            this.f13122c[this.f13120a - 1] = str;
        }
        return c02;
    }

    public final void R() {
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 == 14) {
            long T = this.f13129f.T(f13128u);
            f fVar = this.f13130n;
            if (T == -1) {
                T = fVar.f20878b;
            }
            fVar.skip(T);
        } else if (i10 == 13) {
            n0(f13127t);
        } else if (i10 == 12) {
            n0(f13126s);
        } else if (i10 != 15) {
            StringBuilder q10 = a.q("Expected a name but was ");
            q10.append(b0.I(K()));
            q10.append(" at path ");
            q10.append(s());
            throw new a(q10.toString());
        }
        this.f13131o = 0;
        this.f13122c[this.f13120a - 1] = "null";
    }

    public final void S() {
        int i10 = 0;
        do {
            int i11 = this.f13131o;
            if (i11 == 0) {
                i11 = a0();
            }
            if (i11 == 3) {
                L(1);
            } else if (i11 == 1) {
                L(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 >= 0) {
                        this.f13120a--;
                    } else {
                        StringBuilder q10 = a.q("Expected a value but was ");
                        q10.append(b0.I(K()));
                        q10.append(" at path ");
                        q10.append(s());
                        throw new a(q10.toString());
                    }
                } else if (i11 == 2) {
                    i10--;
                    if (i10 >= 0) {
                        this.f13120a--;
                    } else {
                        StringBuilder q11 = a.q("Expected a value but was ");
                        q11.append(b0.I(K()));
                        q11.append(" at path ");
                        q11.append(s());
                        throw new a(q11.toString());
                    }
                } else if (i11 == 14 || i11 == 10) {
                    long T = this.f13129f.T(f13128u);
                    f fVar = this.f13130n;
                    if (T == -1) {
                        T = fVar.f20878b;
                    }
                    fVar.skip(T);
                } else if (i11 == 9 || i11 == 13) {
                    n0(f13127t);
                } else if (i11 == 8 || i11 == 12) {
                    n0(f13126s);
                } else if (i11 == 17) {
                    this.f13130n.skip((long) this.f13133q);
                } else if (i11 == 18) {
                    StringBuilder q12 = a.q("Expected a value but was ");
                    q12.append(b0.I(K()));
                    q12.append(" at path ");
                    q12.append(s());
                    throw new a(q12.toString());
                }
                this.f13131o = 0;
            }
            i10++;
            this.f13131o = 0;
        } while (i10 != 0);
        int[] iArr = this.f13123d;
        int i12 = this.f13120a;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f13122c[i12 - 1] = "null";
    }

    public final void W() {
        U("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01a7, code lost:
        if (d0(r9) != false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01a9, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01aa, code lost:
        if (r2 != r7) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ac, code lost:
        if (r3 == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01b2, code lost:
        if (r4 != Long.MIN_VALUE) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b4, code lost:
        if (r6 == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01ba, code lost:
        if (r4 != 0) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01bc, code lost:
        if (r6 != false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01be, code lost:
        if (r6 == false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01c1, code lost:
        r4 = -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c2, code lost:
        r0.f13132p = r4;
        r0.f13130n.skip((long) r1);
        r9 = 16;
        r0.f13131o = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01cf, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01d1, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01d2, code lost:
        if (r2 == r3) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d5, code lost:
        if (r2 == 4) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01d8, code lost:
        if (r2 != 7) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01da, code lost:
        r0.f13133q = r1;
        r9 = 17;
        r0.f13131o = 17;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0123 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a0() {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.f13121b
            int r2 = r0.f13120a
            int r3 = r2 + -1
            r3 = r1[r3]
            r5 = 6
            r6 = 7
            r7 = 1
            r8 = 3
            r9 = 0
            r10 = 5
            r11 = 2
            r12 = 0
            r14 = 93
            r15 = 59
            r4 = 44
            r13 = 4
            if (r3 != r7) goto L_0x001f
            int r2 = r2 - r7
            r1[r2] = r11
            goto L_0x007f
        L_0x001f:
            if (r3 != r11) goto L_0x003d
            int r1 = r0.g0(r7)
            ll.f r2 = r0.f13130n
            r2.readByte()
            if (r1 == r4) goto L_0x007f
            if (r1 == r15) goto L_0x0039
            if (r1 != r14) goto L_0x0033
            r0.f13131o = r13
            return r13
        L_0x0033:
            java.lang.String r1 = "Unterminated array"
            r0.U(r1)
            throw r12
        L_0x0039:
            r16.W()
            throw r12
        L_0x003d:
            if (r3 == r8) goto L_0x026c
            if (r3 != r10) goto L_0x0043
            goto L_0x026c
        L_0x0043:
            if (r3 != r13) goto L_0x0063
            int r2 = r2 - r7
            r1[r2] = r10
            int r1 = r0.g0(r7)
            ll.f r2 = r0.f13130n
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x007f
            r2 = 61
            if (r1 == r2) goto L_0x005f
            java.lang.String r1 = "Expected ':'"
            r0.U(r1)
            throw r12
        L_0x005f:
            r16.W()
            throw r12
        L_0x0063:
            if (r3 != r5) goto L_0x0069
            int r2 = r2 - r7
            r1[r2] = r6
            goto L_0x007f
        L_0x0069:
            if (r3 != r6) goto L_0x007b
            int r1 = r0.g0(r9)
            r2 = -1
            if (r1 != r2) goto L_0x0077
            r1 = 18
            r0.f13131o = r1
            return r1
        L_0x0077:
            r16.W()
            throw r12
        L_0x007b:
            r1 = 8
            if (r3 == r1) goto L_0x0264
        L_0x007f:
            int r1 = r0.g0(r7)
            r2 = 34
            if (r1 == r2) goto L_0x025a
            r2 = 39
            if (r1 == r2) goto L_0x0255
            if (r1 == r4) goto L_0x0243
            if (r1 == r15) goto L_0x0243
            r2 = 91
            if (r1 == r2) goto L_0x023b
            if (r1 == r14) goto L_0x0230
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0228
            ll.f r1 = r0.f13130n
            r2 = 0
            byte r1 = r1.B(r2)
            r4 = 116(0x74, float:1.63E-43)
            if (r1 == r4) goto L_0x00cb
            r4 = 84
            if (r1 != r4) goto L_0x00aa
            goto L_0x00cb
        L_0x00aa:
            r4 = 102(0x66, float:1.43E-43)
            if (r1 == r4) goto L_0x00c5
            r4 = 70
            if (r1 != r4) goto L_0x00b3
            goto L_0x00c5
        L_0x00b3:
            r4 = 110(0x6e, float:1.54E-43)
            if (r1 == r4) goto L_0x00bf
            r4 = 78
            if (r1 != r4) goto L_0x00bc
            goto L_0x00bf
        L_0x00bc:
            r14 = r9
            goto L_0x0121
        L_0x00bf:
            java.lang.String r1 = "null"
            java.lang.String r4 = "NULL"
            r14 = r6
            goto L_0x00d0
        L_0x00c5:
            java.lang.String r1 = "false"
            java.lang.String r4 = "FALSE"
            r14 = r5
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r1 = "true"
            java.lang.String r4 = "TRUE"
            r14 = r10
        L_0x00d0:
            int r15 = r1.length()
            r9 = r7
        L_0x00d5:
            if (r9 >= r15) goto L_0x00ff
            ll.i r12 = r0.f13129f
            int r6 = r9 + 1
            long r2 = (long) r6
            boolean r2 = r12.i0(r2)
            if (r2 != 0) goto L_0x00e3
            goto L_0x0117
        L_0x00e3:
            ll.f r2 = r0.f13130n
            r3 = r6
            long r5 = (long) r9
            byte r2 = r2.B(r5)
            char r5 = r1.charAt(r9)
            if (r2 == r5) goto L_0x00f8
            char r5 = r4.charAt(r9)
            if (r2 == r5) goto L_0x00f8
            goto L_0x0117
        L_0x00f8:
            r9 = r3
            r2 = 0
            r5 = 6
            r6 = 7
            r12 = 0
            goto L_0x00d5
        L_0x00ff:
            ll.i r1 = r0.f13129f
            int r2 = r15 + 1
            long r2 = (long) r2
            boolean r1 = r1.i0(r2)
            if (r1 == 0) goto L_0x0119
            ll.f r1 = r0.f13130n
            long r2 = (long) r15
            byte r1 = r1.B(r2)
            boolean r1 = r0.d0(r1)
            if (r1 == 0) goto L_0x0119
        L_0x0117:
            r14 = 0
            goto L_0x0121
        L_0x0119:
            ll.f r1 = r0.f13130n
            long r2 = (long) r15
            r1.skip(r2)
            r0.f13131o = r14
        L_0x0121:
            if (r14 == 0) goto L_0x0124
            return r14
        L_0x0124:
            r3 = r7
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = 0
        L_0x012a:
            ll.i r9 = r0.f13129f
            int r14 = r1 + 1
            long r12 = (long) r14
            boolean r9 = r9.i0(r12)
            if (r9 != 0) goto L_0x0138
            r7 = r11
            goto L_0x01aa
        L_0x0138:
            ll.f r9 = r0.f13130n
            long r12 = (long) r1
            byte r9 = r9.B(r12)
            r12 = 43
            if (r9 == r12) goto L_0x01fe
            r12 = 69
            if (r9 == r12) goto L_0x01f4
            r12 = 101(0x65, float:1.42E-43)
            if (r9 == r12) goto L_0x01f4
            r12 = 45
            if (r9 == r12) goto L_0x01e8
            r12 = 46
            if (r9 == r12) goto L_0x01e1
            r12 = 48
            if (r9 < r12) goto L_0x01a3
            r12 = 57
            if (r9 <= r12) goto L_0x015c
            goto L_0x01a3
        L_0x015c:
            if (r2 == r7) goto L_0x0199
            if (r2 != 0) goto L_0x0161
            goto L_0x0199
        L_0x0161:
            if (r2 != r11) goto L_0x018a
            r12 = 0
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x016b
            goto L_0x020a
        L_0x016b:
            r12 = 10
            long r12 = r12 * r4
            int r9 = r9 + -48
            long r10 = (long) r9
            long r12 = r12 - r10
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x0184
            if (r1 != 0) goto L_0x0182
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r1 = 0
            goto L_0x0185
        L_0x0184:
            r1 = r7
        L_0x0185:
            r1 = r1 & r3
            r3 = r1
            r4 = r12
            r15 = 6
            goto L_0x01a0
        L_0x018a:
            if (r2 != r8) goto L_0x0191
            r2 = 4
            r9 = 7
            r15 = 6
            goto L_0x0204
        L_0x0191:
            r1 = 5
            r15 = 6
            if (r2 == r1) goto L_0x0197
            if (r2 != r15) goto L_0x01a0
        L_0x0197:
            r2 = 7
            goto L_0x01a0
        L_0x0199:
            r15 = 6
            int r9 = r9 + -48
            int r1 = -r9
            long r1 = (long) r1
            r4 = r1
            r2 = 2
        L_0x01a0:
            r9 = 7
            goto L_0x0204
        L_0x01a3:
            boolean r7 = r0.d0(r9)
            if (r7 != 0) goto L_0x020a
            r7 = 2
        L_0x01aa:
            if (r2 != r7) goto L_0x01d1
            if (r3 == 0) goto L_0x01cf
            r7 = -9223372036854775808
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x01b6
            if (r6 == 0) goto L_0x01cf
        L_0x01b6:
            r7 = 0
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x01be
            if (r6 != 0) goto L_0x01cf
        L_0x01be:
            if (r6 == 0) goto L_0x01c1
            goto L_0x01c2
        L_0x01c1:
            long r4 = -r4
        L_0x01c2:
            r0.f13132p = r4
            ll.f r2 = r0.f13130n
            long r3 = (long) r1
            r2.skip(r3)
            r9 = 16
            r0.f13131o = r9
            goto L_0x020b
        L_0x01cf:
            r3 = 2
            goto L_0x01d2
        L_0x01d1:
            r3 = r7
        L_0x01d2:
            if (r2 == r3) goto L_0x01da
            r3 = 4
            if (r2 == r3) goto L_0x01da
            r9 = 7
            if (r2 != r9) goto L_0x020a
        L_0x01da:
            r0.f13133q = r1
            r9 = 17
            r0.f13131o = r9
            goto L_0x020b
        L_0x01e1:
            r1 = r11
            r9 = 7
            r15 = 6
            if (r2 != r1) goto L_0x020a
            r1 = r8
            goto L_0x0203
        L_0x01e8:
            r1 = r11
            r9 = 7
            r15 = 6
            if (r2 != 0) goto L_0x01f0
            r2 = r7
            r6 = r2
            goto L_0x0204
        L_0x01f0:
            r10 = 5
            if (r2 != r10) goto L_0x020a
            goto L_0x0202
        L_0x01f4:
            r1 = r11
            r9 = 7
            r15 = 6
            if (r2 == r1) goto L_0x01fc
            r1 = 4
            if (r2 != r1) goto L_0x020a
        L_0x01fc:
            r2 = r10
            goto L_0x0204
        L_0x01fe:
            r9 = 7
            r15 = 6
            if (r2 != r10) goto L_0x020a
        L_0x0202:
            r1 = r15
        L_0x0203:
            r2 = r1
        L_0x0204:
            r1 = r14
            r10 = 5
            r11 = 2
            r13 = 4
            goto L_0x012a
        L_0x020a:
            r9 = 0
        L_0x020b:
            if (r9 == 0) goto L_0x020e
            return r9
        L_0x020e:
            ll.f r1 = r0.f13130n
            r2 = 0
            byte r1 = r1.B(r2)
            boolean r1 = r0.d0(r1)
            if (r1 != 0) goto L_0x0223
            java.lang.String r1 = "Expected value"
            r0.U(r1)
            r1 = 0
            throw r1
        L_0x0223:
            r1 = 0
            r16.W()
            throw r1
        L_0x0228:
            ll.f r1 = r0.f13130n
            r1.readByte()
            r0.f13131o = r7
            return r7
        L_0x0230:
            if (r3 != r7) goto L_0x0243
            ll.f r1 = r0.f13130n
            r1.readByte()
            r1 = 4
            r0.f13131o = r1
            return r1
        L_0x023b:
            ll.f r1 = r0.f13130n
            r1.readByte()
            r0.f13131o = r8
            return r8
        L_0x0243:
            if (r3 == r7) goto L_0x0250
            r1 = 2
            if (r3 != r1) goto L_0x0249
            goto L_0x0250
        L_0x0249:
            java.lang.String r1 = "Unexpected value"
            r0.U(r1)
            r1 = 0
            throw r1
        L_0x0250:
            r1 = 0
            r16.W()
            throw r1
        L_0x0255:
            r1 = r12
            r16.W()
            throw r1
        L_0x025a:
            ll.f r1 = r0.f13130n
            r1.readByte()
            r1 = 9
            r0.f13131o = r1
            return r1
        L_0x0264:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x026c:
            int r2 = r2 - r7
            r5 = 4
            r1[r2] = r5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 5
            if (r3 != r2) goto L_0x0294
            int r2 = r0.g0(r7)
            ll.f r5 = r0.f13130n
            r5.readByte()
            if (r2 == r4) goto L_0x0294
            if (r2 == r15) goto L_0x028f
            if (r2 != r1) goto L_0x0288
            r1 = 2
            r0.f13131o = r1
            return r1
        L_0x0288:
            java.lang.String r1 = "Unterminated object"
            r0.U(r1)
            r1 = 0
            throw r1
        L_0x028f:
            r1 = 0
            r16.W()
            throw r1
        L_0x0294:
            int r2 = r0.g0(r7)
            r4 = 34
            if (r2 == r4) goto L_0x02c4
            r4 = 39
            if (r2 == r4) goto L_0x02ba
            if (r2 != r1) goto L_0x02b5
            r1 = 5
            if (r3 == r1) goto L_0x02ae
            ll.f r1 = r0.f13130n
            r1.readByte()
            r1 = 2
            r0.f13131o = r1
            return r1
        L_0x02ae:
            java.lang.String r1 = "Expected name"
            r0.U(r1)
            r1 = 0
            throw r1
        L_0x02b5:
            r1 = 0
            r16.W()
            throw r1
        L_0x02ba:
            r1 = 0
            ll.f r2 = r0.f13130n
            r2.readByte()
            r16.W()
            throw r1
        L_0x02c4:
            ll.f r1 = r0.f13130n
            r1.readByte()
            r1 = 13
            r0.f13131o = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.d.a0():int");
    }

    public final int c0(String str, c.a aVar) {
        int length = aVar.f13124a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f13124a[i10])) {
                this.f13131o = 0;
                this.f13122c[this.f13120a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final void close() {
        this.f13131o = 0;
        this.f13121b[0] = 8;
        this.f13120a = 1;
        this.f13130n.q();
        this.f13129f.close();
    }

    public final void d() {
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 == 3) {
            L(1);
            this.f13123d[this.f13120a - 1] = 0;
            this.f13131o = 0;
            return;
        }
        StringBuilder q10 = a.q("Expected BEGIN_ARRAY but was ");
        q10.append(b0.I(K()));
        q10.append(" at path ");
        q10.append(s());
        throw new a(q10.toString());
    }

    public final boolean d0(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (!(i10 == 47 || i10 == 61)) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        W();
        throw null;
    }

    public final String e0() {
        String str;
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 == 14) {
            str = k0();
        } else if (i10 == 13) {
            str = j0(f13127t);
        } else if (i10 == 12) {
            str = j0(f13126s);
        } else if (i10 == 15) {
            str = this.f13134r;
        } else {
            StringBuilder q10 = a.q("Expected a name but was ");
            q10.append(b0.I(K()));
            q10.append(" at path ");
            q10.append(s());
            throw new a(q10.toString());
        }
        this.f13131o = 0;
        this.f13122c[this.f13120a - 1] = str;
        return str;
    }

    public final int g0(boolean z10) {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (this.f13129f.i0((long) i11)) {
                byte B = this.f13130n.B((long) i10);
                if (B == 10 || B == 32 || B == 13 || B == 9) {
                    i10 = i11;
                } else {
                    this.f13130n.skip((long) (i11 - 1));
                    if (B == 47) {
                        if (!this.f13129f.i0(2)) {
                            return B;
                        }
                        W();
                        throw null;
                    } else if (B != 35) {
                        return B;
                    } else {
                        W();
                        throw null;
                    }
                }
            } else if (!z10) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final void h() {
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 == 1) {
            L(3);
            this.f13131o = 0;
            return;
        }
        StringBuilder q10 = a.q("Expected BEGIN_OBJECT but was ");
        q10.append(b0.I(K()));
        q10.append(" at path ");
        q10.append(s());
        throw new a(q10.toString());
    }

    public final void i() {
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 == 4) {
            int i11 = this.f13120a - 1;
            this.f13120a = i11;
            int[] iArr = this.f13123d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f13131o = 0;
            return;
        }
        StringBuilder q10 = a.q("Expected END_ARRAY but was ");
        q10.append(b0.I(K()));
        q10.append(" at path ");
        q10.append(s());
        throw new a(q10.toString());
    }

    public final String j0(j jVar) {
        StringBuilder sb2 = null;
        while (true) {
            long T = this.f13129f.T(jVar);
            if (T == -1) {
                U("Unterminated string");
                throw null;
            } else if (this.f13130n.B(T) == 92) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f13130n.W(T));
                this.f13130n.readByte();
                sb2.append(l0());
            } else if (sb2 == null) {
                String W = this.f13130n.W(T);
                this.f13130n.readByte();
                return W;
            } else {
                sb2.append(this.f13130n.W(T));
                this.f13130n.readByte();
                return sb2.toString();
            }
        }
    }

    public final String k0() {
        long T = this.f13129f.T(f13128u);
        if (T != -1) {
            return this.f13130n.W(T);
        }
        return this.f13130n.U();
    }

    public final char l0() {
        int i10;
        int i11;
        if (this.f13129f.i0(1)) {
            byte readByte = this.f13130n.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                StringBuilder q10 = a.q("Invalid escape sequence: \\");
                q10.append((char) readByte);
                U(q10.toString());
                throw null;
            } else if (this.f13129f.i0(4)) {
                char c10 = 0;
                for (int i12 = 0; i12 < 4; i12++) {
                    byte B = this.f13130n.B((long) i12);
                    char c11 = (char) (c10 << 4);
                    if (B < 48 || B > 57) {
                        if (B >= 97 && B <= 102) {
                            i11 = B - 97;
                        } else if (B < 65 || B > 70) {
                            StringBuilder q11 = a.q("\\u");
                            q11.append(this.f13130n.W(4));
                            U(q11.toString());
                            throw null;
                        } else {
                            i11 = B - 65;
                        }
                        i10 = i11 + 10;
                    } else {
                        i10 = B - 48;
                    }
                    c10 = (char) (i10 + c11);
                }
                this.f13130n.skip(4);
                return c10;
            } else {
                StringBuilder q12 = a.q("Unterminated escape sequence at path ");
                q12.append(s());
                throw new EOFException(q12.toString());
            }
        } else {
            U("Unterminated escape sequence");
            throw null;
        }
    }

    public final void n0(j jVar) {
        while (true) {
            long T = this.f13129f.T(jVar);
            if (T == -1) {
                U("Unterminated string");
                throw null;
            } else if (this.f13130n.B(T) == 92) {
                this.f13130n.skip(T + 1);
                l0();
            } else {
                this.f13130n.skip(T + 1);
                return;
            }
        }
    }

    public final void q() {
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 == 2) {
            int i11 = this.f13120a - 1;
            this.f13120a = i11;
            this.f13122c[i11] = null;
            int[] iArr = this.f13123d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f13131o = 0;
            return;
        }
        StringBuilder q10 = a.q("Expected END_OBJECT but was ");
        q10.append(b0.I(K()));
        q10.append(" at path ");
        q10.append(s());
        throw new a(q10.toString());
    }

    public final String toString() {
        StringBuilder q10 = a.q("JsonReader(");
        q10.append(this.f13129f);
        q10.append(")");
        return q10.toString();
    }

    public final boolean v() {
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 == 2 || i10 == 4 || i10 == 18) {
            return false;
        }
        return true;
    }

    public final boolean x() {
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 == 5) {
            this.f13131o = 0;
            int[] iArr = this.f13123d;
            int i11 = this.f13120a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f13131o = 0;
            int[] iArr2 = this.f13123d;
            int i12 = this.f13120a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            StringBuilder q10 = a.q("Expected a boolean but was ");
            q10.append(b0.I(K()));
            q10.append(" at path ");
            q10.append(s());
            throw new a(q10.toString());
        }
    }

    public final double z() {
        int i10 = this.f13131o;
        if (i10 == 0) {
            i10 = a0();
        }
        if (i10 == 16) {
            this.f13131o = 0;
            int[] iArr = this.f13123d;
            int i11 = this.f13120a - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f13132p;
        }
        if (i10 == 17) {
            this.f13134r = this.f13130n.W((long) this.f13133q);
        } else if (i10 == 9) {
            this.f13134r = j0(f13127t);
        } else if (i10 == 8) {
            this.f13134r = j0(f13126s);
        } else if (i10 == 10) {
            this.f13134r = k0();
        } else if (i10 != 11) {
            StringBuilder q10 = a.q("Expected a double but was ");
            q10.append(b0.I(K()));
            q10.append(" at path ");
            q10.append(s());
            throw new a(q10.toString());
        }
        this.f13131o = 11;
        try {
            double parseDouble = Double.parseDouble(this.f13134r);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + s());
            }
            this.f13134r = null;
            this.f13131o = 0;
            int[] iArr2 = this.f13123d;
            int i12 = this.f13120a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder q11 = a.q("Expected a double but was ");
            q11.append(this.f13134r);
            q11.append(" at path ");
            q11.append(s());
            throw new a(q11.toString());
        }
    }
}
