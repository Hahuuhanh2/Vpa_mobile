package q4;

import android.graphics.Bitmap;
import android.util.Log;
import f5.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import q4.a;

/* compiled from: StandardGifDecoder */
public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f14344a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f14345b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    public final a.C0183a f14346c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f14347d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f14348e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f14349f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f14350g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f14351h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f14352i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f14353j;

    /* renamed from: k  reason: collision with root package name */
    public int f14354k;

    /* renamed from: l  reason: collision with root package name */
    public c f14355l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f14356m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14357n;

    /* renamed from: o  reason: collision with root package name */
    public int f14358o;

    /* renamed from: p  reason: collision with root package name */
    public int f14359p;

    /* renamed from: q  reason: collision with root package name */
    public int f14360q;

    /* renamed from: r  reason: collision with root package name */
    public int f14361r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f14362s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f14363t = Bitmap.Config.ARGB_8888;

    public e(b bVar, c cVar, ByteBuffer byteBuffer, int i10) {
        byte[] bArr;
        int[] iArr;
        this.f14346c = bVar;
        this.f14355l = new c();
        synchronized (this) {
            if (i10 > 0) {
                int highestOneBit = Integer.highestOneBit(i10);
                this.f14358o = 0;
                this.f14355l = cVar;
                this.f14354k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f14347d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f14347d.order(ByteOrder.LITTLE_ENDIAN);
                this.f14357n = false;
                Iterator it = cVar.f14333e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((b) it.next()).f14324g == 3) {
                            this.f14357n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f14359p = highestOneBit;
                int i11 = cVar.f14334f;
                this.f14361r = i11 / highestOneBit;
                int i12 = cVar.f14335g;
                this.f14360q = i12 / highestOneBit;
                int i13 = i11 * i12;
                v4.b bVar2 = ((b) this.f14346c).f9924b;
                if (bVar2 == null) {
                    bArr = new byte[i13];
                } else {
                    bArr = (byte[]) bVar2.c(i13, byte[].class);
                }
                this.f14352i = bArr;
                a.C0183a aVar = this.f14346c;
                int i14 = this.f14361r * this.f14360q;
                v4.b bVar3 = ((b) aVar).f9924b;
                if (bVar3 == null) {
                    iArr = new int[i14];
                } else {
                    iArr = (int[]) bVar3.c(i14, int[].class);
                }
                this.f14353j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        }
    }

    public final ByteBuffer a() {
        return this.f14347d;
    }

    public final synchronized Bitmap b() {
        b bVar;
        byte[] bArr;
        if (this.f14355l.f14331c <= 0 || this.f14354k < 0) {
            if (Log.isLoggable("e", 3)) {
                int i10 = this.f14355l.f14331c;
            }
            this.f14358o = 1;
        }
        int i11 = this.f14358o;
        if (i11 != 1) {
            if (i11 != 2) {
                this.f14358o = 0;
                if (this.f14348e == null) {
                    v4.b bVar2 = ((b) this.f14346c).f9924b;
                    if (bVar2 == null) {
                        bArr = new byte[255];
                    } else {
                        bArr = (byte[]) bVar2.c(255, byte[].class);
                    }
                    this.f14348e = bArr;
                }
                b bVar3 = (b) this.f14355l.f14333e.get(this.f14354k);
                int i12 = this.f14354k - 1;
                if (i12 >= 0) {
                    bVar = (b) this.f14355l.f14333e.get(i12);
                } else {
                    bVar = null;
                }
                int[] iArr = bVar3.f14328k;
                if (iArr == null) {
                    iArr = this.f14355l.f14329a;
                }
                this.f14344a = iArr;
                if (iArr == null) {
                    Log.isLoggable("e", 3);
                    this.f14358o = 1;
                    return null;
                }
                if (bVar3.f14323f) {
                    System.arraycopy(iArr, 0, this.f14345b, 0, iArr.length);
                    int[] iArr2 = this.f14345b;
                    this.f14344a = iArr2;
                    iArr2[bVar3.f14325h] = 0;
                    if (bVar3.f14324g == 2 && this.f14354k == 0) {
                        this.f14362s = Boolean.TRUE;
                    }
                }
                return j(bVar3, bVar);
            }
        }
        Log.isLoggable("e", 3);
        return null;
    }

    public final void c() {
        this.f14354k = (this.f14354k + 1) % this.f14355l.f14331c;
    }

    public final void clear() {
        v4.b bVar;
        v4.b bVar2;
        v4.b bVar3;
        this.f14355l = null;
        byte[] bArr = this.f14352i;
        if (!(bArr == null || (bVar3 = ((b) this.f14346c).f9924b) == null)) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f14353j;
        if (!(iArr == null || (bVar2 = ((b) this.f14346c).f9924b) == null)) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f14356m;
        if (bitmap != null) {
            ((b) this.f14346c).f9923a.d(bitmap);
        }
        this.f14356m = null;
        this.f14347d = null;
        this.f14362s = null;
        byte[] bArr2 = this.f14348e;
        if (bArr2 != null && (bVar = ((b) this.f14346c).f9924b) != null) {
            bVar.put(bArr2);
        }
    }

    public final int d() {
        return this.f14355l.f14331c;
    }

    public final int e() {
        int i10;
        c cVar = this.f14355l;
        int i11 = cVar.f14331c;
        if (i11 <= 0 || (i10 = this.f14354k) < 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= i11) {
            return -1;
        }
        return ((b) cVar.f14333e.get(i10)).f14326i;
    }

    public final int f() {
        return this.f14354k;
    }

    public final int g() {
        return (this.f14353j.length * 4) + this.f14347d.limit() + this.f14352i.length;
    }

    public final Bitmap h() {
        Bitmap.Config config;
        Boolean bool = this.f14362s;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f14363t;
        }
        a.C0183a aVar = this.f14346c;
        Bitmap c10 = ((b) aVar).f9923a.c(this.f14361r, this.f14360q, config);
        c10.setHasAlpha(true);
        return c10;
    }

    public final void i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f14363t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f14338j == r1.f14325h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v31, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap j(q4.b r36, q4.b r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f14353j
            r11 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f14356m
            if (r3 == 0) goto L_0x0018
            q4.a$a r4 = r0.f14346c
            f5.b r4 = (f5.b) r4
            v4.c r4 = r4.f9923a
            r4.d(r3)
        L_0x0018:
            r3 = 0
            r0.f14356m = r3
            java.util.Arrays.fill(r10, r11)
        L_0x001e:
            r12 = 3
            if (r2 == 0) goto L_0x002c
            int r3 = r2.f14324g
            if (r3 != r12) goto L_0x002c
            android.graphics.Bitmap r3 = r0.f14356m
            if (r3 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r11)
        L_0x002c:
            r13 = 2
            if (r2 == 0) goto L_0x007e
            int r3 = r2.f14324g
            if (r3 <= 0) goto L_0x007e
            if (r3 != r13) goto L_0x006c
            boolean r3 = r1.f14323f
            if (r3 != 0) goto L_0x0047
            q4.c r3 = r0.f14355l
            int r4 = r3.f14339k
            int[] r5 = r1.f14328k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f14338j
            int r5 = r1.f14325h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = r11
        L_0x0048:
            int r3 = r2.f14321d
            int r5 = r0.f14359p
            int r3 = r3 / r5
            int r6 = r2.f14319b
            int r6 = r6 / r5
            int r7 = r2.f14320c
            int r7 = r7 / r5
            int r2 = r2.f14318a
            int r2 = r2 / r5
            int r5 = r0.f14361r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005c:
            if (r6 >= r3) goto L_0x007e
            int r2 = r6 + r7
            r5 = r6
        L_0x0061:
            if (r5 >= r2) goto L_0x0068
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0061
        L_0x0068:
            int r2 = r0.f14361r
            int r6 = r6 + r2
            goto L_0x005c
        L_0x006c:
            if (r3 != r12) goto L_0x007e
            android.graphics.Bitmap r2 = r0.f14356m
            if (r2 == 0) goto L_0x007e
            r4 = 0
            int r8 = r0.f14361r
            r6 = 0
            r7 = 0
            int r9 = r0.f14360q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x007e:
            java.nio.ByteBuffer r2 = r0.f14347d
            int r3 = r1.f14327j
            r2.position(r3)
            int r2 = r1.f14320c
            int r3 = r1.f14321d
            int r2 = r2 * r3
            byte[] r3 = r0.f14352i
            if (r3 == 0) goto L_0x0091
            int r3 = r3.length
            if (r3 >= r2) goto L_0x00a6
        L_0x0091:
            q4.a$a r3 = r0.f14346c
            f5.b r3 = (f5.b) r3
            v4.b r3 = r3.f9924b
            if (r3 != 0) goto L_0x009c
            byte[] r3 = new byte[r2]
            goto L_0x00a4
        L_0x009c:
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Object r3 = r3.c(r2, r4)
            byte[] r3 = (byte[]) r3
        L_0x00a4:
            r0.f14352i = r3
        L_0x00a6:
            byte[] r3 = r0.f14352i
            short[] r4 = r0.f14349f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00b2
            short[] r4 = new short[r5]
            r0.f14349f = r4
        L_0x00b2:
            short[] r4 = r0.f14349f
            byte[] r6 = r0.f14350g
            if (r6 != 0) goto L_0x00bc
            byte[] r6 = new byte[r5]
            r0.f14350g = r6
        L_0x00bc:
            byte[] r6 = r0.f14350g
            byte[] r7 = r0.f14351h
            if (r7 != 0) goto L_0x00c8
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f14351h = r7
        L_0x00c8:
            byte[] r7 = r0.f14351h
            java.nio.ByteBuffer r8 = r0.f14347d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r14 = r9 << r8
            int r15 = r14 + 1
            int r16 = r14 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r13 = -1
            int r17 = r17 + -1
            r5 = r11
        L_0x00e0:
            if (r5 >= r14) goto L_0x00eb
            r4[r5] = r11
            byte r13 = (byte) r5
            r6[r5] = r13
            int r5 = r5 + 1
            r13 = -1
            goto L_0x00e0
        L_0x00eb:
            byte[] r5 = r0.f14348e
            r12 = r0
            r26 = r8
            r9 = r11
            r20 = r9
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r27 = r24
            r29 = r27
            r25 = r16
            r28 = r17
            r13 = -1
        L_0x0104:
            r30 = 8
            if (r9 >= r2) goto L_0x0201
            if (r21 != 0) goto L_0x0144
            java.nio.ByteBuffer r11 = r0.f14347d
            byte r11 = r11.get()
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 > 0) goto L_0x011d
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
            goto L_0x0135
        L_0x011d:
            r31 = r8
            java.nio.ByteBuffer r8 = r12.f14347d
            r32 = r9
            byte[] r9 = r12.f14348e
            r33 = r13
            int r13 = r8.remaining()
            int r13 = java.lang.Math.min(r11, r13)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r13)
        L_0x0135:
            if (r11 > 0) goto L_0x013f
            r8 = 3
            r12.f14358o = r8
            r11 = r20
            r10 = 0
            goto L_0x0206
        L_0x013f:
            r21 = r11
            r22 = 0
            goto L_0x014c
        L_0x0144:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
        L_0x014c:
            byte r8 = r5[r22]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r23
            int r24 = r24 + r8
            int r23 = r23 + 8
            r8 = 1
            int r22 = r22 + 1
            r8 = -1
            int r21 = r21 + -1
            r10 = r23
            r11 = r25
            r8 = r26
            r9 = r32
            r13 = r33
            r23 = r5
            r5 = r27
        L_0x016a:
            if (r10 < r8) goto L_0x01ed
            r25 = r12
            r12 = r24 & r28
            int r24 = r24 >> r8
            int r10 = r10 - r8
            if (r12 != r14) goto L_0x0186
            r26 = r10
            r11 = r16
            r28 = r17
            r12 = r25
            r8 = r31
            r13 = -1
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01e7
        L_0x0186:
            if (r12 != r15) goto L_0x0190
            r27 = r5
            r12 = r25
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01f2
        L_0x0190:
            r26 = r10
            r10 = -1
            if (r13 != r10) goto L_0x01a3
            byte r5 = r6[r12]
            r3[r20] = r5
            int r20 = r20 + 1
            int r9 = r9 + 1
            r5 = r12
            r13 = r5
            r10 = r26
            r12 = r0
            goto L_0x016a
        L_0x01a3:
            if (r12 < r11) goto L_0x01ac
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r13
            goto L_0x01ad
        L_0x01ac:
            r5 = r12
        L_0x01ad:
            if (r5 < r14) goto L_0x01b8
            byte r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01ad
        L_0x01b8:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r3[r20] = r10
        L_0x01bf:
            r19 = 1
            int r20 = r20 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L_0x01ce
            int r29 = r29 + -1
            byte r25 = r7[r29]
            r3[r20] = r25
            goto L_0x01bf
        L_0x01ce:
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r5) goto L_0x01e5
            short r13 = (short) r13
            r4[r11] = r13
            r6[r11] = r10
            int r11 = r11 + 1
            r10 = r11 & r28
            if (r10 != 0) goto L_0x01e5
            if (r11 >= r5) goto L_0x01e5
            int r8 = r8 + 1
            int r28 = r28 + r11
        L_0x01e5:
            r13 = r12
            r12 = r0
        L_0x01e7:
            r5 = r25
            r10 = r26
            goto L_0x016a
        L_0x01ed:
            r27 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r12 = r0
        L_0x01f2:
            r26 = r8
            r25 = r11
            r5 = r23
            r8 = r31
            r11 = 0
            r23 = r10
            r10 = r34
            goto L_0x0104
        L_0x0201:
            r34 = r10
            r10 = r11
            r11 = r20
        L_0x0206:
            java.util.Arrays.fill(r3, r11, r2, r10)
            boolean r2 = r1.f14322e
            if (r2 != 0) goto L_0x0280
            int r2 = r0.f14359p
            r3 = 1
            if (r2 == r3) goto L_0x0214
            goto L_0x0280
        L_0x0214:
            int[] r2 = r0.f14353j
            int r3 = r1.f14321d
            int r4 = r1.f14319b
            int r5 = r1.f14320c
            int r6 = r1.f14318a
            int r7 = r0.f14354k
            if (r7 != 0) goto L_0x0224
            r7 = 1
            goto L_0x0225
        L_0x0224:
            r7 = r10
        L_0x0225:
            int r8 = r0.f14361r
            byte[] r9 = r0.f14352i
            int[] r11 = r0.f14344a
            r13 = r10
            r12 = -1
        L_0x022d:
            if (r13 >= r3) goto L_0x0262
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L_0x023a
            r10 = r14
        L_0x023a:
            int r14 = r1.f14320c
            int r14 = r14 * r13
        L_0x023d:
            if (r15 >= r10) goto L_0x025a
            r16 = r3
            byte r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x0251
            r4 = r11[r4]
            if (r4 == 0) goto L_0x0250
            r2[r15] = r4
            goto L_0x0251
        L_0x0250:
            r12 = r3
        L_0x0251:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x023d
        L_0x025a:
            r16 = r3
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L_0x022d
        L_0x0262:
            java.lang.Boolean r2 = r0.f14362s
            if (r2 == 0) goto L_0x026c
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0275
        L_0x026c:
            java.lang.Boolean r2 = r0.f14362s
            if (r2 != 0) goto L_0x0277
            if (r7 == 0) goto L_0x0277
            r2 = -1
            if (r12 == r2) goto L_0x0277
        L_0x0275:
            r11 = 1
            goto L_0x0278
        L_0x0277:
            r11 = 0
        L_0x0278:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f14362s = r2
            goto L_0x040b
        L_0x0280:
            int[] r2 = r0.f14353j
            int r3 = r1.f14321d
            int r4 = r0.f14359p
            int r3 = r3 / r4
            int r5 = r1.f14319b
            int r5 = r5 / r4
            int r6 = r1.f14320c
            int r6 = r6 / r4
            int r7 = r1.f14318a
            int r7 = r7 / r4
            int r8 = r0.f14354k
            if (r8 != 0) goto L_0x0296
            r10 = 1
            goto L_0x0297
        L_0x0296:
            r10 = 0
        L_0x0297:
            int r8 = r0.f14361r
            int r9 = r0.f14360q
            byte[] r11 = r0.f14352i
            int[] r12 = r0.f14344a
            java.lang.Boolean r13 = r0.f14362s
            r14 = r13
            r17 = r30
            r13 = 0
            r15 = 0
            r16 = 1
        L_0x02a8:
            if (r13 >= r3) goto L_0x03f7
            r37 = r14
            boolean r14 = r1.f14322e
            if (r14 == 0) goto L_0x02d7
            if (r15 < r3) goto L_0x02d2
            int r14 = r16 + 1
            r20 = r3
            r3 = 2
            if (r14 == r3) goto L_0x02cd
            r3 = 3
            if (r14 == r3) goto L_0x02c6
            r3 = 4
            r16 = r14
            if (r14 == r3) goto L_0x02c2
            goto L_0x02d4
        L_0x02c2:
            r15 = 1
            r17 = 2
            goto L_0x02d4
        L_0x02c6:
            r3 = 4
            r17 = r3
            r16 = r14
            r15 = 2
            goto L_0x02d4
        L_0x02cd:
            r3 = 4
            r15 = r3
            r16 = r14
            goto L_0x02d4
        L_0x02d2:
            r20 = r3
        L_0x02d4:
            int r3 = r15 + r17
            goto L_0x02db
        L_0x02d7:
            r20 = r3
            r3 = r15
            r15 = r13
        L_0x02db:
            int r15 = r15 + r5
            r14 = 1
            if (r4 != r14) goto L_0x02e1
            r14 = 1
            goto L_0x02e2
        L_0x02e1:
            r14 = 0
        L_0x02e2:
            if (r15 >= r9) goto L_0x03d7
            int r15 = r15 * r8
            int r18 = r15 + r7
            r21 = r3
            int r3 = r18 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02ef
            r3 = r15
        L_0x02ef:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r1.f14320c
            int r15 = r15 * r5
            if (r14 == 0) goto L_0x0318
            r14 = r37
            r5 = r18
        L_0x02fc:
            r23 = r6
            if (r5 >= r3) goto L_0x03d0
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x030b
            r2[r5] = r6
            goto L_0x0312
        L_0x030b:
            if (r10 == 0) goto L_0x0312
            if (r14 != 0) goto L_0x0312
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r14 = r6
        L_0x0312:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02fc
        L_0x0318:
            r23 = r6
            int r5 = r3 - r18
            int r5 = r5 * r4
            int r5 = r5 + r15
            r14 = r37
            r6 = r18
        L_0x0322:
            if (r6 >= r3) goto L_0x03d0
            r18 = r3
            int r3 = r1.f14320c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0337:
            int r8 = r0.f14359p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x036c
            byte[] r8 = r0.f14352i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x036e
            if (r7 >= r5) goto L_0x036e
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f14344a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0367
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0367:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x0337
        L_0x036c:
            r32 = r9
        L_0x036e:
            int r3 = r3 + r15
            r7 = r3
        L_0x0370:
            int r8 = r0.f14359p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x03a1
            byte[] r8 = r0.f14352i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x03a1
            if (r7 >= r5) goto L_0x03a1
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f14344a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x039e
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x039e:
            int r7 = r7 + 1
            goto L_0x0370
        L_0x03a1:
            if (r28 != 0) goto L_0x03a5
            r3 = 0
            goto L_0x03b7
        L_0x03a5:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03b7:
            if (r3 == 0) goto L_0x03bc
            r2[r6] = r3
            goto L_0x03c3
        L_0x03bc:
            if (r10 == 0) goto L_0x03c3
            if (r14 != 0) goto L_0x03c3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r14 = r3
        L_0x03c3:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r18
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x0322
        L_0x03d0:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03e5
        L_0x03d7:
            r21 = r3
            r22 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r14 = r37
        L_0x03e5:
            int r13 = r13 + 1
            r3 = r20
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x02a8
        L_0x03f7:
            r37 = r14
            java.lang.Boolean r2 = r0.f14362s
            if (r2 != 0) goto L_0x040b
            if (r37 != 0) goto L_0x0401
            r11 = 0
            goto L_0x0405
        L_0x0401:
            boolean r11 = r37.booleanValue()
        L_0x0405:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f14362s = r2
        L_0x040b:
            boolean r2 = r0.f14357n
            if (r2 == 0) goto L_0x042f
            int r1 = r1.f14324g
            if (r1 == 0) goto L_0x0416
            r2 = 1
            if (r1 != r2) goto L_0x042f
        L_0x0416:
            android.graphics.Bitmap r1 = r0.f14356m
            if (r1 != 0) goto L_0x0420
            android.graphics.Bitmap r1 = r35.h()
            r0.f14356m = r1
        L_0x0420:
            android.graphics.Bitmap r1 = r0.f14356m
            r3 = 0
            int r7 = r0.f14361r
            r5 = 0
            r6 = 0
            int r8 = r0.f14360q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x042f:
            android.graphics.Bitmap r9 = r35.h()
            r3 = 0
            int r7 = r0.f14361r
            r5 = 0
            r6 = 0
            int r8 = r0.f14360q
            r1 = r9
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.e.j(q4.b, q4.b):android.graphics.Bitmap");
    }
}
