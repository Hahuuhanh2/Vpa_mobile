package ll;

import f0.b0;
import fk.h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import n0.l;
import sk.j;

/* compiled from: Buffer.kt */
public final class f implements i, h, Cloneable, ByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public x f20877a;

    /* renamed from: b  reason: collision with root package name */
    public long f20878b;

    /* compiled from: Buffer.kt */
    public static final class a implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public f f20879a;

        public final void close() {
            boolean z10;
            if (this.f20879a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f20879a = null;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    public final boolean A() {
        if (this.f20878b == 0) {
            return true;
        }
        return false;
    }

    public final void A0(int i10) {
        boolean z10;
        String str;
        if (i10 < 128) {
            g0(i10);
        } else if (i10 < 2048) {
            x d02 = d0(2);
            byte[] bArr = d02.f20918a;
            int i11 = d02.f20920c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            d02.f20920c = i11 + 2;
            this.f20878b += 2;
        } else {
            int i12 = 0;
            if (55296 > i10 || i10 >= 57344) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                g0(63);
            } else if (i10 < 65536) {
                x d03 = d0(3);
                byte[] bArr2 = d03.f20918a;
                int i13 = d03.f20920c;
                bArr2[i13] = (byte) ((i10 >> 12) | 224);
                bArr2[i13 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                bArr2[i13 + 2] = (byte) ((i10 & 63) | 128);
                d03.f20920c = i13 + 3;
                this.f20878b += 3;
            } else if (i10 <= 1114111) {
                x d04 = d0(4);
                byte[] bArr3 = d04.f20918a;
                int i14 = d04.f20920c;
                bArr3[i14] = (byte) ((i10 >> 18) | 240);
                bArr3[i14 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                bArr3[i14 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                bArr3[i14 + 3] = (byte) ((i10 & 63) | 128);
                d04.f20920c = i14 + 4;
                this.f20878b += 4;
            } else {
                StringBuilder q10 = android.support.v4.media.a.q("Unexpected code point: 0x");
                int i15 = b.f20859a;
                if (i10 != 0) {
                    char[] cArr = m9.b.D;
                    char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
                    while (i12 < 8 && cArr2[i12] == '0') {
                        i12++;
                    }
                    if (i12 < 0) {
                        StringBuilder u10 = b0.u("startIndex: ", i12, ", endIndex: ", 8, ", size: ");
                        u10.append(8);
                        throw new IndexOutOfBoundsException(u10.toString());
                    } else if (i12 <= 8) {
                        str = new String(cArr2, i12, 8 - i12);
                    } else {
                        throw new IllegalArgumentException(b0.p("startIndex: ", i12, " > endIndex: ", 8));
                    }
                } else {
                    str = "0";
                }
                q10.append(str);
                throw new IllegalArgumentException(q10.toString());
            }
        }
    }

    public final byte B(long j10) {
        b.b(this.f20878b, j10, 1);
        x xVar = this.f20877a;
        if (xVar != null) {
            long j11 = this.f20878b;
            if (j11 - j10 < j10) {
                while (j11 > j10) {
                    xVar = xVar.f20924g;
                    j.c(xVar);
                    j11 -= (long) (xVar.f20920c - xVar.f20919b);
                }
                return xVar.f20918a[(int) ((((long) xVar.f20919b) + j10) - j11)];
            }
            long j12 = 0;
            while (true) {
                int i10 = xVar.f20920c;
                int i11 = xVar.f20919b;
                long j13 = ((long) (i10 - i11)) + j12;
                if (j13 > j10) {
                    return xVar.f20918a[(int) ((((long) i11) + j10) - j12)];
                }
                xVar = xVar.f20923f;
                j.c(xVar);
                j12 = j13;
            }
        } else {
            j.c((Object) null);
            throw null;
        }
    }

    public final long E(byte b10, long j10, long j11) {
        x xVar;
        long j12 = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (z10) {
            long j13 = this.f20878b;
            if (j11 > j13) {
                j11 = j13;
            }
            if (!(j10 == j11 || (xVar = this.f20877a) == null)) {
                if (j13 - j10 < j10) {
                    while (j13 > j10) {
                        xVar = xVar.f20924g;
                        j.c(xVar);
                        j13 -= (long) (xVar.f20920c - xVar.f20919b);
                    }
                    while (j13 < j11) {
                        byte[] bArr = xVar.f20918a;
                        int min = (int) Math.min((long) xVar.f20920c, (((long) xVar.f20919b) + j11) - j13);
                        for (int i10 = (int) ((((long) xVar.f20919b) + j10) - j13); i10 < min; i10++) {
                            if (bArr[i10] == b10) {
                                return ((long) (i10 - xVar.f20919b)) + j13;
                            }
                        }
                        j13 += (long) (xVar.f20920c - xVar.f20919b);
                        xVar = xVar.f20923f;
                        j.c(xVar);
                        j10 = j13;
                    }
                } else {
                    while (true) {
                        long j14 = ((long) (xVar.f20920c - xVar.f20919b)) + j12;
                        if (j14 > j10) {
                            break;
                        }
                        xVar = xVar.f20923f;
                        j.c(xVar);
                        j12 = j14;
                    }
                    while (j12 < j11) {
                        byte[] bArr2 = xVar.f20918a;
                        int min2 = (int) Math.min((long) xVar.f20920c, (((long) xVar.f20919b) + j11) - j12);
                        for (int i11 = (int) ((((long) xVar.f20919b) + j10) - j12); i11 < min2; i11++) {
                            if (bArr2[i11] == b10) {
                                return ((long) (i11 - xVar.f20919b)) + j12;
                            }
                        }
                        j12 += (long) (xVar.f20920c - xVar.f20919b);
                        xVar = xVar.f20923f;
                        j.c(xVar);
                        j10 = j12;
                    }
                }
            }
            return -1;
        }
        StringBuilder q10 = android.support.v4.media.a.q("size=");
        q10.append(this.f20878b);
        q10.append(" fromIndex=");
        q10.append(j10);
        q10.append(" toIndex=");
        q10.append(j11);
        throw new IllegalArgumentException(q10.toString().toString());
    }

    public final long E0(c0 c0Var) {
        j.f(c0Var, "source");
        long j10 = 0;
        while (true) {
            long J0 = c0Var.J0(this, 8192);
            if (J0 == -1) {
                return j10;
            }
            j10 += J0;
        }
    }

    public final String F(long j10) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long E = E((byte) 10, 0, j11);
            if (E != -1) {
                return ml.a.a(this, E);
            }
            if (j11 < this.f20878b && B(j11 - 1) == 13 && B(j11) == 10) {
                return ml.a.a(this, j11);
            }
            f fVar = new f();
            z(0, Math.min((long) 32, this.f20878b), fVar);
            StringBuilder q10 = android.support.v4.media.a.q("\\n not found: limit=");
            q10.append(Math.min(this.f20878b, j10));
            q10.append(" content=");
            q10.append(fVar.N().j());
            q10.append(8230);
            throw new EOFException(q10.toString());
        }
        throw new IllegalArgumentException(l.i("limit < 0: ", j10).toString());
    }

    public final long G(f fVar) {
        long j10 = this.f20878b;
        if (j10 > 0) {
            fVar.Q(this, j10);
        }
        return j10;
    }

    public final void G0(long j10) {
        if (this.f20878b < j10) {
            throw new EOFException();
        }
    }

    public final long J0(f fVar, long j10) {
        boolean z10;
        j.f(fVar, "sink");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j11 = this.f20878b;
            if (j11 == 0) {
                return -1;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            fVar.Q(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(l.i("byteCount < 0: ", j10).toString());
    }

    public final long K(long j10, j jVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        j.f(jVar, "targetBytes");
        long j11 = 0;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            x xVar = this.f20877a;
            if (xVar == null) {
                return -1;
            }
            long j12 = this.f20878b;
            if (j12 - j10 < j10) {
                while (j12 > j10) {
                    xVar = xVar.f20924g;
                    j.c(xVar);
                    j12 -= (long) (xVar.f20920c - xVar.f20919b);
                }
                byte[] bArr = jVar.f20883a;
                if (bArr.length == 2) {
                    byte b10 = bArr[0];
                    byte b11 = bArr[1];
                    while (j12 < this.f20878b) {
                        byte[] bArr2 = xVar.f20918a;
                        i13 = (int) ((((long) xVar.f20919b) + j10) - j12);
                        int i14 = xVar.f20920c;
                        while (i13 < i14) {
                            byte b12 = bArr2[i13];
                            if (b12 == b10 || b12 == b11) {
                                i12 = xVar.f20919b;
                            } else {
                                i13++;
                            }
                        }
                        j12 += (long) (xVar.f20920c - xVar.f20919b);
                        xVar = xVar.f20923f;
                        j.c(xVar);
                        j10 = j12;
                    }
                    return -1;
                }
                while (j12 < this.f20878b) {
                    byte[] bArr3 = xVar.f20918a;
                    int i15 = (int) ((((long) xVar.f20919b) + j10) - j12);
                    int i16 = xVar.f20920c;
                    while (i13 < i16) {
                        byte b13 = bArr3[i13];
                        int length = bArr.length;
                        int i17 = 0;
                        while (i17 < length) {
                            if (b13 == bArr[i17]) {
                                i12 = xVar.f20919b;
                            } else {
                                i17++;
                            }
                        }
                        i15 = i13 + 1;
                    }
                    j12 += (long) (xVar.f20920c - xVar.f20919b);
                    xVar = xVar.f20923f;
                    j.c(xVar);
                    j10 = j12;
                }
                return -1;
                return ((long) (i13 - i12)) + j12;
            }
            while (true) {
                long j13 = ((long) (xVar.f20920c - xVar.f20919b)) + j11;
                if (j13 > j10) {
                    break;
                }
                xVar = xVar.f20923f;
                j.c(xVar);
                j11 = j13;
            }
            byte[] bArr4 = jVar.f20883a;
            if (bArr4.length == 2) {
                byte b14 = bArr4[0];
                byte b15 = bArr4[1];
                while (j11 < this.f20878b) {
                    byte[] bArr5 = xVar.f20918a;
                    i11 = (int) ((((long) xVar.f20919b) + j10) - j11);
                    int i18 = xVar.f20920c;
                    while (i11 < i18) {
                        byte b16 = bArr5[i11];
                        if (b16 == b14 || b16 == b15) {
                            i10 = xVar.f20919b;
                        } else {
                            i11++;
                        }
                    }
                    j11 += (long) (xVar.f20920c - xVar.f20919b);
                    xVar = xVar.f20923f;
                    j.c(xVar);
                    j10 = j11;
                }
                return -1;
            }
            while (j11 < this.f20878b) {
                byte[] bArr6 = xVar.f20918a;
                int i19 = (int) ((((long) xVar.f20919b) + j10) - j11);
                int i20 = xVar.f20920c;
                while (i11 < i20) {
                    byte b17 = bArr6[i11];
                    int length2 = bArr4.length;
                    int i21 = 0;
                    while (i21 < length2) {
                        if (b17 == bArr4[i21]) {
                            i10 = xVar.f20919b;
                        } else {
                            i21++;
                        }
                    }
                    i19 = i11 + 1;
                }
                j11 += (long) (xVar.f20920c - xVar.f20919b);
                xVar = xVar.f20923f;
                j.c(xVar);
                j10 = j11;
            }
            return -1;
            return ((long) (i11 - i10)) + j11;
        }
        throw new IllegalArgumentException(l.i("fromIndex < 0: ", j10).toString());
    }

    public final /* bridge */ /* synthetic */ h K0(long j10) {
        j0(j10);
        return this;
    }

    public final byte[] L(long j10) {
        boolean z10;
        if (j10 < 0 || j10 > 2147483647L) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(l.i("byteCount: ", j10).toString());
        } else if (this.f20878b >= j10) {
            byte[] bArr = new byte[((int) j10)];
            R(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        if (r8 != r9) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        r14.f20877a = r6.a();
        ll.y.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        r6.f20919b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r1 != false) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0072 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long M0() {
        /*
            r14 = this;
            long r0 = r14.f20878b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a4
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            ll.x r6 = r14.f20877a
            sk.j.c(r6)
            byte[] r7 = r6.f20918a
            int r8 = r6.f20919b
            int r9 = r6.f20920c
        L_0x0016:
            if (r8 >= r9) goto L_0x0089
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0025
            r11 = 57
            if (r10 > r11) goto L_0x0025
            int r11 = r10 + -48
            goto L_0x003c
        L_0x0025:
            r11 = 97
            if (r10 < r11) goto L_0x0030
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x0030
            int r11 = r10 + -97
            goto L_0x003a
        L_0x0030:
            r11 = 65
            if (r10 < r11) goto L_0x006e
            r11 = 70
            if (r10 > r11) goto L_0x006e
            int r11 = r10 + -65
        L_0x003a:
            int r11 = r11 + 10
        L_0x003c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x004c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0016
        L_0x004c:
            ll.f r0 = new ll.f
            r0.<init>()
            r0.l0(r4)
            r0.g0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            java.lang.String r0 = r0.U()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006e:
            if (r0 == 0) goto L_0x0072
            r1 = 1
            goto L_0x0089
        L_0x0072:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            java.lang.String r2 = ll.b.c(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0089:
            if (r8 != r9) goto L_0x0095
            ll.x r7 = r6.a()
            r14.f20877a = r7
            ll.y.a(r6)
            goto L_0x0097
        L_0x0095:
            r6.f20919b = r8
        L_0x0097:
            if (r1 != 0) goto L_0x009d
            ll.x r6 = r14.f20877a
            if (r6 != 0) goto L_0x000b
        L_0x009d:
            long r1 = r14.f20878b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f20878b = r1
            return r4
        L_0x00a4:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.f.M0():long");
    }

    public final j N() {
        return n(this.f20878b);
    }

    public final /* bridge */ /* synthetic */ h O(String str) {
        w0(str);
        return this;
    }

    public final InputStream O0() {
        return new b(this);
    }

    public final void Q(f fVar, long j10) {
        boolean z10;
        boolean z11;
        int i10;
        x xVar;
        boolean z12;
        x xVar2;
        int i11;
        j.f(fVar, "source");
        if (fVar != this) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b.b(fVar.f20878b, 0, j10);
            while (j10 > 0) {
                x xVar3 = fVar.f20877a;
                j.c(xVar3);
                int i12 = xVar3.f20920c;
                x xVar4 = fVar.f20877a;
                j.c(xVar4);
                if (j10 < ((long) (i12 - xVar4.f20919b))) {
                    x xVar5 = this.f20877a;
                    if (xVar5 != null) {
                        xVar = xVar5.f20924g;
                    } else {
                        xVar = null;
                    }
                    if (xVar != null && xVar.f20922e) {
                        long j11 = ((long) xVar.f20920c) + j10;
                        if (xVar.f20921d) {
                            i11 = 0;
                        } else {
                            i11 = xVar.f20919b;
                        }
                        if (j11 - ((long) i11) <= 8192) {
                            x xVar6 = fVar.f20877a;
                            j.c(xVar6);
                            xVar6.d(xVar, (int) j10);
                            fVar.f20878b -= j10;
                            this.f20878b += j10;
                            return;
                        }
                    }
                    x xVar7 = fVar.f20877a;
                    j.c(xVar7);
                    int i13 = (int) j10;
                    if (i13 <= 0 || i13 > xVar7.f20920c - xVar7.f20919b) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        if (i13 >= 1024) {
                            xVar2 = xVar7.c();
                        } else {
                            xVar2 = y.b();
                            byte[] bArr = xVar7.f20918a;
                            byte[] bArr2 = xVar2.f20918a;
                            int i14 = xVar7.f20919b;
                            h.n0(bArr, 0, bArr2, i14, i14 + i13);
                        }
                        xVar2.f20920c = xVar2.f20919b + i13;
                        xVar7.f20919b += i13;
                        x xVar8 = xVar7.f20924g;
                        j.c(xVar8);
                        xVar8.b(xVar2);
                        fVar.f20877a = xVar2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                x xVar9 = fVar.f20877a;
                j.c(xVar9);
                long j12 = (long) (xVar9.f20920c - xVar9.f20919b);
                fVar.f20877a = xVar9.a();
                x xVar10 = this.f20877a;
                if (xVar10 == null) {
                    this.f20877a = xVar9;
                    xVar9.f20924g = xVar9;
                    xVar9.f20923f = xVar9;
                } else {
                    x xVar11 = xVar10.f20924g;
                    j.c(xVar11);
                    xVar11.b(xVar9);
                    x xVar12 = xVar9.f20924g;
                    if (xVar12 != xVar9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        j.c(xVar12);
                        if (xVar12.f20922e) {
                            int i15 = xVar9.f20920c - xVar9.f20919b;
                            x xVar13 = xVar9.f20924g;
                            j.c(xVar13);
                            int i16 = 8192 - xVar13.f20920c;
                            x xVar14 = xVar9.f20924g;
                            j.c(xVar14);
                            if (xVar14.f20921d) {
                                i10 = 0;
                            } else {
                                x xVar15 = xVar9.f20924g;
                                j.c(xVar15);
                                i10 = xVar15.f20919b;
                            }
                            if (i15 <= i16 + i10) {
                                x xVar16 = xVar9.f20924g;
                                j.c(xVar16);
                                xVar9.d(xVar16, i15);
                                xVar9.a();
                                y.a(xVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                fVar.f20878b -= j12;
                this.f20878b += j12;
                j10 -= j12;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final void R(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public final String S(long j10, Charset charset) {
        boolean z10;
        j.f(charset, "charset");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0 || j10 > 2147483647L) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(l.i("byteCount: ", j10).toString());
        } else if (this.f20878b < j10) {
            throw new EOFException();
        } else if (i10 == 0) {
            return "";
        } else {
            x xVar = this.f20877a;
            j.c(xVar);
            int i11 = xVar.f20919b;
            if (((long) i11) + j10 > ((long) xVar.f20920c)) {
                return new String(L(j10), charset);
            }
            int i12 = (int) j10;
            String str = new String(xVar.f20918a, i11, i12, charset);
            int i13 = xVar.f20919b + i12;
            xVar.f20919b = i13;
            this.f20878b -= j10;
            if (i13 == xVar.f20920c) {
                this.f20877a = xVar.a();
                y.a(xVar);
            }
            return str;
        }
    }

    public final long T(j jVar) {
        j.f(jVar, "targetBytes");
        return K(0, jVar);
    }

    public final String U() {
        return S(this.f20878b, yk.a.f23582b);
    }

    public final String V(Charset charset) {
        return S(this.f20878b, charset);
    }

    public final String W(long j10) {
        return S(j10, yk.a.f23582b);
    }

    public final /* bridge */ /* synthetic */ h Y(j jVar) {
        e0(jVar);
        return this;
    }

    public final void Z(f fVar, long j10) {
        j.f(fVar, "sink");
        long j11 = this.f20878b;
        if (j11 >= j10) {
            fVar.Q(this, j10);
        } else {
            fVar.Q(this, j11);
            throw new EOFException();
        }
    }

    public final f a() {
        return this;
    }

    public final int a0() {
        byte b10;
        int i10;
        byte b11;
        if (this.f20878b != 0) {
            byte B = B(0);
            boolean z10 = false;
            if ((B & 128) == 0) {
                b11 = B & Byte.MAX_VALUE;
                b10 = 0;
                i10 = 1;
            } else if ((B & 224) == 192) {
                b11 = B & 31;
                i10 = 2;
                b10 = 128;
            } else if ((B & 240) == 224) {
                b11 = B & 15;
                i10 = 3;
                b10 = 2048;
            } else if ((B & 248) == 240) {
                b11 = B & 7;
                i10 = 4;
                b10 = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j10 = (long) i10;
            if (this.f20878b >= j10) {
                int i11 = 1;
                while (i11 < i10) {
                    long j11 = (long) i11;
                    byte B2 = B(j11);
                    if ((B2 & 192) == 128) {
                        b11 = (b11 << 6) | (B2 & 63);
                        i11++;
                    } else {
                        skip(j11);
                        return 65533;
                    }
                }
                skip(j10);
                if (b11 > 1114111) {
                    return 65533;
                }
                if (55296 <= b11 && b11 < 57344) {
                    z10 = true;
                }
                if (!z10 && b11 >= b10) {
                    return b11;
                }
                return 65533;
            }
            StringBuilder l10 = l.l("size < ", i10, ": ");
            l10.append(this.f20878b);
            l10.append(" (to read code point prefixed 0x");
            l10.append(b.c(B));
            l10.append(')');
            throw new EOFException(l10.toString());
        }
        throw new EOFException();
    }

    public final /* bridge */ /* synthetic */ h b0(long j10) {
        l0(j10);
        return this;
    }

    public final j c0(int i10) {
        if (i10 == 0) {
            return j.f20882d;
        }
        b.b(this.f20878b, 0, (long) i10);
        x xVar = this.f20877a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            j.c(xVar);
            int i14 = xVar.f20920c;
            int i15 = xVar.f20919b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                xVar = xVar.f20923f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[(i13 * 2)];
        x xVar2 = this.f20877a;
        int i16 = 0;
        while (i11 < i10) {
            j.c(xVar2);
            bArr[i16] = xVar2.f20918a;
            i11 += xVar2.f20920c - xVar2.f20919b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = xVar2.f20919b;
            xVar2.f20921d = true;
            i16++;
            xVar2 = xVar2.f20923f;
        }
        return new z(bArr, iArr);
    }

    public final void close() {
    }

    public final x d0(int i10) {
        boolean z10 = true;
        if (i10 < 1 || i10 > 8192) {
            z10 = false;
        }
        if (z10) {
            x xVar = this.f20877a;
            if (xVar == null) {
                x b10 = y.b();
                this.f20877a = b10;
                b10.f20924g = b10;
                b10.f20923f = b10;
                return b10;
            }
            x xVar2 = xVar.f20924g;
            j.c(xVar2);
            if (xVar2.f20920c + i10 <= 8192 && xVar2.f20922e) {
                return xVar2;
            }
            x b11 = y.b();
            xVar2.b(b11);
            return b11;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void e0(j jVar) {
        j.f(jVar, "byteString");
        jVar.s(this, jVar.i());
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = r3
            goto L_0x0078
        L_0x000b:
            boolean r4 = r1 instanceof ll.f
            if (r4 != 0) goto L_0x0011
            goto L_0x0078
        L_0x0011:
            long r4 = r0.f20878b
            ll.f r1 = (ll.f) r1
            long r6 = r1.f20878b
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x001c
            goto L_0x0078
        L_0x001c:
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0023
            goto L_0x0008
        L_0x0023:
            ll.x r4 = r0.f20877a
            sk.j.c(r4)
            ll.x r1 = r1.f20877a
            sk.j.c(r1)
            int r5 = r4.f20919b
            int r8 = r1.f20919b
            r9 = r6
        L_0x0032:
            long r11 = r0.f20878b
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0008
            int r11 = r4.f20920c
            int r11 = r11 - r5
            int r12 = r1.f20920c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x0044:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0060
            byte[] r15 = r4.f20918a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f20918a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x0044
        L_0x0060:
            int r13 = r4.f20920c
            if (r5 != r13) goto L_0x006b
            ll.x r4 = r4.f20923f
            sk.j.c(r4)
            int r5 = r4.f20919b
        L_0x006b:
            int r13 = r1.f20920c
            if (r8 != r13) goto L_0x0076
            ll.x r1 = r1.f20923f
            sk.j.c(r1)
            int r8 = r1.f20919b
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0032
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.f.equals(java.lang.Object):boolean");
    }

    public final d0 f() {
        return d0.f20871d;
    }

    public final void flush() {
    }

    public final void g0(int i10) {
        x d02 = d0(1);
        byte[] bArr = d02.f20918a;
        int i11 = d02.f20920c;
        d02.f20920c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f20878b++;
    }

    public final int hashCode() {
        x xVar = this.f20877a;
        if (xVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = xVar.f20920c;
            for (int i12 = xVar.f20919b; i12 < i11; i12++) {
                i10 = (i10 * 31) + xVar.f20918a[i12];
            }
            xVar = xVar.f20923f;
            j.c(xVar);
        } while (xVar != this.f20877a);
        return i10;
    }

    public final boolean i0(long j10) {
        if (this.f20878b >= j10) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        return true;
    }

    public final f j0(long j10) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            g0(48);
        } else {
            boolean z10 = false;
            int i11 = 1;
            if (i10 < 0) {
                j10 = -j10;
                if (j10 < 0) {
                    w0("-9223372036854775808");
                } else {
                    z10 = true;
                }
            }
            if (j10 < 100000000) {
                if (j10 < 10000) {
                    if (j10 < 100) {
                        if (j10 >= 10) {
                            i11 = 2;
                        }
                    } else if (j10 < 1000) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                } else if (j10 < 1000000) {
                    if (j10 < 100000) {
                        i11 = 5;
                    } else {
                        i11 = 6;
                    }
                } else if (j10 < 10000000) {
                    i11 = 7;
                } else {
                    i11 = 8;
                }
            } else if (j10 < 1000000000000L) {
                if (j10 < 10000000000L) {
                    if (j10 < 1000000000) {
                        i11 = 9;
                    } else {
                        i11 = 10;
                    }
                } else if (j10 < 100000000000L) {
                    i11 = 11;
                } else {
                    i11 = 12;
                }
            } else if (j10 < 1000000000000000L) {
                if (j10 < 10000000000000L) {
                    i11 = 13;
                } else if (j10 < 100000000000000L) {
                    i11 = 14;
                } else {
                    i11 = 15;
                }
            } else if (j10 < 100000000000000000L) {
                if (j10 < 10000000000000000L) {
                    i11 = 16;
                } else {
                    i11 = 17;
                }
            } else if (j10 < 1000000000000000000L) {
                i11 = 18;
            } else {
                i11 = 19;
            }
            if (z10) {
                i11++;
            }
            x d02 = d0(i11);
            byte[] bArr = d02.f20918a;
            int i12 = d02.f20920c + i11;
            while (j10 != 0) {
                long j11 = (long) 10;
                i12--;
                bArr[i12] = ml.a.f21571a[(int) (j10 % j11)];
                j10 /= j11;
            }
            if (z10) {
                bArr[i12 - 1] = 45;
            }
            d02.f20920c += i11;
            this.f20878b += (long) i11;
        }
        return this;
    }

    public final f l0(long j10) {
        if (j10 == 0) {
            g0(48);
        } else {
            long j11 = (j10 >>> 1) | j10;
            long j12 = j11 | (j11 >>> 2);
            long j13 = j12 | (j12 >>> 4);
            long j14 = j13 | (j13 >>> 8);
            long j15 = j14 | (j14 >>> 16);
            long j16 = j15 | (j15 >>> 32);
            long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
            long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
            long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
            long j20 = j19 + (j19 >>> 8);
            long j21 = j20 + (j20 >>> 16);
            int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            x d02 = d0(i10);
            byte[] bArr = d02.f20918a;
            int i11 = d02.f20920c;
            for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
                bArr[i12] = ml.a.f21571a[(int) (15 & j10)];
                j10 >>>= 4;
            }
            d02.f20920c += i10;
            this.f20878b += (long) i10;
        }
        return this;
    }

    public final j n(long j10) {
        boolean z10;
        if (j10 < 0 || j10 > 2147483647L) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(l.i("byteCount: ", j10).toString());
        } else if (this.f20878b < j10) {
            throw new EOFException();
        } else if (j10 < 4096) {
            return new j(L(j10));
        } else {
            j c02 = c0((int) j10);
            skip(j10);
            return c02;
        }
    }

    public final void o0(int i10) {
        x d02 = d0(4);
        byte[] bArr = d02.f20918a;
        int i11 = d02.f20920c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        d02.f20920c = i14 + 1;
        this.f20878b += 4;
    }

    public final String p0() {
        return F(Long.MAX_VALUE);
    }

    public final void q() {
        skip(this.f20878b);
    }

    public final int read(ByteBuffer byteBuffer) {
        j.f(byteBuffer, "sink");
        x xVar = this.f20877a;
        if (xVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), xVar.f20920c - xVar.f20919b);
        byteBuffer.put(xVar.f20918a, xVar.f20919b, min);
        int i10 = xVar.f20919b + min;
        xVar.f20919b = i10;
        this.f20878b -= (long) min;
        if (i10 == xVar.f20920c) {
            this.f20877a = xVar.a();
            y.a(xVar);
        }
        return min;
    }

    public final byte readByte() {
        if (this.f20878b != 0) {
            x xVar = this.f20877a;
            j.c(xVar);
            int i10 = xVar.f20919b;
            int i11 = xVar.f20920c;
            int i12 = i10 + 1;
            byte b10 = xVar.f20918a[i10];
            this.f20878b--;
            if (i12 == i11) {
                this.f20877a = xVar.a();
                y.a(xVar);
            } else {
                xVar.f20919b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    public final int readInt() {
        if (this.f20878b >= 4) {
            x xVar = this.f20877a;
            j.c(xVar);
            int i10 = xVar.f20919b;
            int i11 = xVar.f20920c;
            if (((long) (i11 - i10)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = xVar.f20918a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i14 = i13 + 1;
            byte b11 = b10 | ((bArr[i13] & 255) << 8);
            int i15 = i14 + 1;
            byte b12 = b11 | (bArr[i14] & 255);
            this.f20878b -= 4;
            if (i15 == i11) {
                this.f20877a = xVar.a();
                y.a(xVar);
            } else {
                xVar.f20919b = i15;
            }
            return b12;
        }
        throw new EOFException();
    }

    public final short readShort() {
        if (this.f20878b >= 2) {
            x xVar = this.f20877a;
            j.c(xVar);
            int i10 = xVar.f20919b;
            int i11 = xVar.f20920c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = xVar.f20918a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            this.f20878b -= 2;
            if (i13 == i11) {
                this.f20877a = xVar.a();
                y.a(xVar);
            } else {
                xVar.f20919b = i13;
            }
            return (short) b10;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public final f clone() {
        f fVar = new f();
        if (this.f20878b != 0) {
            x xVar = this.f20877a;
            j.c(xVar);
            x c10 = xVar.c();
            fVar.f20877a = c10;
            c10.f20924g = c10;
            c10.f20923f = c10;
            for (x xVar2 = xVar.f20923f; xVar2 != xVar; xVar2 = xVar2.f20923f) {
                x xVar3 = c10.f20924g;
                j.c(xVar3);
                j.c(xVar2);
                xVar3.b(xVar2.c());
            }
            fVar.f20878b = this.f20878b;
        }
        return fVar;
    }

    public final void s0(int i10) {
        x d02 = d0(2);
        byte[] bArr = d02.f20918a;
        int i11 = d02.f20920c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        d02.f20920c = i12 + 1;
        this.f20878b += 2;
    }

    public final void skip(long j10) {
        while (j10 > 0) {
            x xVar = this.f20877a;
            if (xVar != null) {
                int min = (int) Math.min(j10, (long) (xVar.f20920c - xVar.f20919b));
                long j11 = (long) min;
                this.f20878b -= j11;
                j10 -= j11;
                int i10 = xVar.f20919b + min;
                xVar.f20919b = i10;
                if (i10 == xVar.f20920c) {
                    this.f20877a = xVar.a();
                    y.a(xVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final f t0(String str, int i10, int i11, Charset charset) {
        boolean z10;
        boolean z11;
        j.f(str, "string");
        boolean z12 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 > str.length()) {
                    z12 = false;
                }
                if (!z12) {
                    StringBuilder l10 = l.l("endIndex > string.length: ", i11, " > ");
                    l10.append(str.length());
                    throw new IllegalArgumentException(l10.toString().toString());
                } else if (j.a(charset, yk.a.f23582b)) {
                    v0(i10, i11, str);
                    return this;
                } else {
                    String substring = str.substring(i10, i11);
                    j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    j.e(bytes, "this as java.lang.String).getBytes(charset)");
                    write(bytes, 0, bytes.length);
                    return this;
                }
            } else {
                throw new IllegalArgumentException(b0.p("endIndex < beginIndex: ", i11, " < ", i10).toString());
            }
        } else {
            throw new IllegalArgumentException(android.support.v4.media.a.m("beginIndex < 0: ", i10).toString());
        }
    }

    public final String toString() {
        boolean z10;
        long j10 = this.f20878b;
        if (j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return c0((int) j10).toString();
        }
        StringBuilder q10 = android.support.v4.media.a.q("size > Int.MAX_VALUE: ");
        q10.append(this.f20878b);
        throw new IllegalStateException(q10.toString().toString());
    }

    public final int u0(s sVar) {
        j.f(sVar, "options");
        int b10 = ml.a.b(this, sVar, false);
        if (b10 == -1) {
            return -1;
        }
        skip((long) sVar.f20901a[b10].i());
        return b10;
    }

    public final void v0(int i10, int i11, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        char c10;
        boolean z13;
        char charAt;
        j.f(str, "string");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= str.length()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    while (i10 < i11) {
                        char charAt2 = str.charAt(i10);
                        if (charAt2 < 128) {
                            x d02 = d0(1);
                            byte[] bArr = d02.f20918a;
                            int i12 = d02.f20920c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt2;
                            while (true) {
                                i10 = i13;
                                if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                                    int i14 = d02.f20920c;
                                    int i15 = (i12 + i10) - i14;
                                    d02.f20920c = i14 + i15;
                                    this.f20878b += (long) i15;
                                } else {
                                    i13 = i10 + 1;
                                    bArr[i10 + i12] = (byte) charAt;
                                }
                            }
                            int i142 = d02.f20920c;
                            int i152 = (i12 + i10) - i142;
                            d02.f20920c = i142 + i152;
                            this.f20878b += (long) i152;
                        } else {
                            if (charAt2 < 2048) {
                                x d03 = d0(2);
                                byte[] bArr2 = d03.f20918a;
                                int i16 = d03.f20920c;
                                bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                                d03.f20920c = i16 + 2;
                                this.f20878b += 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                x d04 = d0(3);
                                byte[] bArr3 = d04.f20918a;
                                int i17 = d04.f20920c;
                                bArr3[i17] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                                d04.f20920c = i17 + 3;
                                this.f20878b += 3;
                            } else {
                                int i18 = i10 + 1;
                                if (i18 < i11) {
                                    c10 = str.charAt(i18);
                                } else {
                                    c10 = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 > c10 || c10 >= 57344) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (z13) {
                                        int i19 = (((charAt2 & 1023) << 10) | (c10 & 1023)) + 0;
                                        x d05 = d0(4);
                                        byte[] bArr4 = d05.f20918a;
                                        int i20 = d05.f20920c;
                                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                                        d05.f20920c = i20 + 4;
                                        this.f20878b += 4;
                                        i10 += 2;
                                    }
                                }
                                g0(63);
                                i10 = i18;
                            }
                            i10++;
                        }
                    }
                    return;
                }
                StringBuilder l10 = l.l("endIndex > string.length: ", i11, " > ");
                l10.append(str.length());
                throw new IllegalArgumentException(l10.toString().toString());
            }
            throw new IllegalArgumentException(b0.p("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        throw new IllegalArgumentException(android.support.v4.media.a.m("beginIndex < 0: ", i10).toString());
    }

    public final void w0(String str) {
        j.f(str, "string");
        v0(0, str.length(), str);
    }

    public final /* bridge */ /* synthetic */ h writeByte(int i10) {
        g0(i10);
        return this;
    }

    public final /* bridge */ /* synthetic */ h writeInt(int i10) {
        o0(i10);
        return this;
    }

    public final /* bridge */ /* synthetic */ h writeShort(int i10) {
        s0(i10);
        return this;
    }

    public final long x() {
        long j10 = this.f20878b;
        if (j10 == 0) {
            return 0;
        }
        x xVar = this.f20877a;
        j.c(xVar);
        x xVar2 = xVar.f20924g;
        j.c(xVar2);
        int i10 = xVar2.f20920c;
        if (i10 < 8192 && xVar2.f20922e) {
            j10 -= (long) (i10 - xVar2.f20919b);
        }
        return j10;
    }

    public final void z(long j10, long j11, f fVar) {
        j.f(fVar, "out");
        b.b(this.f20878b, j10, j11);
        if (j11 != 0) {
            fVar.f20878b += j11;
            x xVar = this.f20877a;
            while (true) {
                j.c(xVar);
                long j12 = (long) (xVar.f20920c - xVar.f20919b);
                if (j10 < j12) {
                    break;
                }
                j10 -= j12;
                xVar = xVar.f20923f;
            }
            while (j11 > 0) {
                j.c(xVar);
                x c10 = xVar.c();
                int i10 = c10.f20919b + ((int) j10);
                c10.f20919b = i10;
                c10.f20920c = Math.min(i10 + ((int) j11), c10.f20920c);
                x xVar2 = fVar.f20877a;
                if (xVar2 == null) {
                    c10.f20924g = c10;
                    c10.f20923f = c10;
                    fVar.f20877a = c10;
                } else {
                    x xVar3 = xVar2.f20924g;
                    j.c(xVar3);
                    xVar3.b(c10);
                }
                j11 -= (long) (c10.f20920c - c10.f20919b);
                xVar = xVar.f20923f;
                j10 = 0;
            }
        }
    }

    /* compiled from: Buffer.kt */
    public static final class b extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f20880a;

        public b(f fVar) {
            this.f20880a = fVar;
        }

        public final int available() {
            return (int) Math.min(this.f20880a.f20878b, (long) Integer.MAX_VALUE);
        }

        public final void close() {
        }

        public final int read() {
            f fVar = this.f20880a;
            if (fVar.f20878b > 0) {
                return fVar.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return this.f20880a + ".inputStream()";
        }

        public final int read(byte[] bArr, int i10, int i11) {
            j.f(bArr, "sink");
            return this.f20880a.read(bArr, i10, i11);
        }
    }

    public final int write(ByteBuffer byteBuffer) {
        j.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            x d02 = d0(1);
            int min = Math.min(i10, 8192 - d02.f20920c);
            byteBuffer.get(d02.f20918a, d02.f20920c, min);
            i10 -= min;
            d02.f20920c += min;
        }
        this.f20878b += (long) remaining;
        return remaining;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        j.f(bArr, "sink");
        b.b((long) bArr.length, (long) i10, (long) i11);
        x xVar = this.f20877a;
        if (xVar == null) {
            return -1;
        }
        int min = Math.min(i11, xVar.f20920c - xVar.f20919b);
        byte[] bArr2 = xVar.f20918a;
        int i12 = xVar.f20919b;
        h.n0(bArr2, i10, bArr, i12, i12 + min);
        int i13 = xVar.f20919b + min;
        xVar.f20919b = i13;
        this.f20878b -= (long) min;
        if (i13 == xVar.f20920c) {
            this.f20877a = xVar.a();
            y.a(xVar);
        }
        return min;
    }

    public final void write(byte[] bArr) {
        j.f(bArr, "source");
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        j.f(bArr, "source");
        long j10 = (long) i11;
        b.b((long) bArr.length, (long) i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            x d02 = d0(1);
            int min = Math.min(i12 - i10, 8192 - d02.f20920c);
            int i13 = i10 + min;
            h.n0(bArr, d02.f20920c, d02.f20918a, i10, i13);
            d02.f20920c += min;
            i10 = i13;
        }
        this.f20878b += j10;
    }
}
