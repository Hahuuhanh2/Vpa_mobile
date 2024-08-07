package okhttp3.internal.http2;

import android.support.v4.media.a;
import fk.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import ll.f;
import ll.j;
import ll.w;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Huffman;
import u9.b;

/* compiled from: Hpack.kt */
public final class Hpack {

    /* renamed from: a  reason: collision with root package name */
    public static final Hpack f22379a = new Hpack();

    /* renamed from: b  reason: collision with root package name */
    public static final Header[] f22380b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<j, Integer> f22381c;

    /* compiled from: Hpack.kt */
    public static final class Reader {

        /* renamed from: a  reason: collision with root package name */
        public final int f22382a = 4096;

        /* renamed from: b  reason: collision with root package name */
        public int f22383b = 4096;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f22384c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final w f22385d;

        /* renamed from: e  reason: collision with root package name */
        public Header[] f22386e;

        /* renamed from: f  reason: collision with root package name */
        public int f22387f;

        /* renamed from: g  reason: collision with root package name */
        public int f22388g;

        /* renamed from: h  reason: collision with root package name */
        public int f22389h;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.f22385d = new w(continuationSource);
            this.f22386e = new Header[8];
            this.f22387f = 7;
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f22386e.length;
                while (true) {
                    length--;
                    i11 = this.f22387f;
                    if (length < i11 || i10 <= 0) {
                        Header[] headerArr = this.f22386e;
                        System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.f22388g);
                        this.f22387f += i12;
                    } else {
                        Header header = this.f22386e[length];
                        sk.j.c(header);
                        int i13 = header.f22378c;
                        i10 -= i13;
                        this.f22389h -= i13;
                        this.f22388g--;
                        i12++;
                    }
                }
                Header[] headerArr2 = this.f22386e;
                System.arraycopy(headerArr2, i11 + 1, headerArr2, i11 + 1 + i12, this.f22388g);
                this.f22387f += i12;
            }
            return i12;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ll.j b(int r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 < 0) goto L_0x0010
                okhttp3.internal.http2.Hpack r1 = okhttp3.internal.http2.Hpack.f22379a
                r1.getClass()
                okhttp3.internal.http2.Header[] r1 = okhttp3.internal.http2.Hpack.f22380b
                int r1 = r1.length
                int r1 = r1 - r0
                if (r5 > r1) goto L_0x0010
                r1 = r0
                goto L_0x0011
            L_0x0010:
                r1 = 0
            L_0x0011:
                if (r1 == 0) goto L_0x001f
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.f22379a
                r0.getClass()
                okhttp3.internal.http2.Header[] r0 = okhttp3.internal.http2.Hpack.f22380b
                r5 = r0[r5]
                ll.j r5 = r5.f22376a
                goto L_0x003b
            L_0x001f:
                okhttp3.internal.http2.Hpack r1 = okhttp3.internal.http2.Hpack.f22379a
                r1.getClass()
                okhttp3.internal.http2.Header[] r1 = okhttp3.internal.http2.Hpack.f22380b
                int r1 = r1.length
                int r1 = r5 - r1
                int r2 = r4.f22387f
                int r2 = r2 + r0
                int r2 = r2 + r1
                if (r2 < 0) goto L_0x003c
                okhttp3.internal.http2.Header[] r1 = r4.f22386e
                int r3 = r1.length
                if (r2 >= r3) goto L_0x003c
                r5 = r1[r2]
                sk.j.c(r5)
                ll.j r5 = r5.f22376a
            L_0x003b:
                return r5
            L_0x003c:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Header index too large "
                java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
                int r5 = r5 + r0
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Reader.b(int):ll.j");
        }

        public final void c(Header header) {
            this.f22384c.add(header);
            int i10 = header.f22378c;
            int i11 = this.f22383b;
            if (i10 > i11) {
                h.q0(this.f22386e, (b) null);
                this.f22387f = this.f22386e.length - 1;
                this.f22388g = 0;
                this.f22389h = 0;
                return;
            }
            a((this.f22389h + i10) - i11);
            int i12 = this.f22388g + 1;
            Header[] headerArr = this.f22386e;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length * 2)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f22387f = this.f22386e.length - 1;
                this.f22386e = headerArr2;
            }
            int i13 = this.f22387f;
            this.f22387f = i13 - 1;
            this.f22386e[i13] = header;
            this.f22388g++;
            this.f22389h += i10;
        }

        public final j d() {
            boolean z10;
            byte readByte = this.f22385d.readByte();
            byte[] bArr = Util.f22171a;
            byte b10 = readByte & 255;
            byte b11 = 0;
            if ((b10 & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            long e10 = (long) e(b10, 127);
            if (!z10) {
                return this.f22385d.n(e10);
            }
            f fVar = new f();
            Huffman huffman = Huffman.f22520a;
            w wVar = this.f22385d;
            huffman.getClass();
            sk.j.f(wVar, "source");
            Huffman.Node node = Huffman.f22523d;
            int i10 = 0;
            for (long j10 = 0; j10 < e10; j10++) {
                byte readByte2 = wVar.readByte();
                byte[] bArr2 = Util.f22171a;
                b11 = (b11 << 8) | (readByte2 & 255);
                i10 += 8;
                while (i10 >= 8) {
                    int i11 = i10 - 8;
                    Huffman.Node[] nodeArr = node.f22524a;
                    sk.j.c(nodeArr);
                    node = nodeArr[(b11 >>> i11) & 255];
                    sk.j.c(node);
                    if (node.f22524a == null) {
                        fVar.g0(node.f22525b);
                        i10 -= node.f22526c;
                        node = Huffman.f22523d;
                    } else {
                        i10 = i11;
                    }
                }
            }
            while (i10 > 0) {
                Huffman.Node[] nodeArr2 = node.f22524a;
                sk.j.c(nodeArr2);
                Huffman.Node node2 = nodeArr2[(b11 << (8 - i10)) & 255];
                sk.j.c(node2);
                if (node2.f22524a != null || node2.f22526c > i10) {
                    break;
                }
                fVar.g0(node2.f22525b);
                i10 -= node2.f22526c;
                node = Huffman.f22523d;
            }
            return fVar.N();
        }

        public final int e(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                byte readByte = this.f22385d.readByte();
                byte[] bArr = Util.f22171a;
                byte b10 = readByte & 255;
                if ((b10 & 128) == 0) {
                    return i11 + (b10 << i13);
                }
                i11 += (b10 & Byte.MAX_VALUE) << i13;
                i13 += 7;
            }
        }
    }

    /* compiled from: Hpack.kt */
    public static final class Writer {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f22390a = true;

        /* renamed from: b  reason: collision with root package name */
        public final f f22391b;

        /* renamed from: c  reason: collision with root package name */
        public int f22392c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f22393d;

        /* renamed from: e  reason: collision with root package name */
        public int f22394e;

        /* renamed from: f  reason: collision with root package name */
        public Header[] f22395f;

        /* renamed from: g  reason: collision with root package name */
        public int f22396g;

        /* renamed from: h  reason: collision with root package name */
        public int f22397h;

        /* renamed from: i  reason: collision with root package name */
        public int f22398i;

        public Writer(f fVar) {
            this.f22391b = fVar;
            this.f22392c = Integer.MAX_VALUE;
            this.f22394e = 4096;
            this.f22395f = new Header[8];
            this.f22396g = 7;
        }

        public final void a(int i10) {
            int i11;
            if (i10 > 0) {
                int length = this.f22395f.length - 1;
                int i12 = 0;
                while (true) {
                    i11 = this.f22396g;
                    if (length < i11 || i10 <= 0) {
                        Header[] headerArr = this.f22395f;
                        int i13 = i11 + 1;
                        System.arraycopy(headerArr, i13, headerArr, i13 + i12, this.f22397h);
                        Header[] headerArr2 = this.f22395f;
                        int i14 = this.f22396g + 1;
                        Arrays.fill(headerArr2, i14, i14 + i12, (Object) null);
                        this.f22396g += i12;
                    } else {
                        Header header = this.f22395f[length];
                        sk.j.c(header);
                        i10 -= header.f22378c;
                        int i15 = this.f22398i;
                        Header header2 = this.f22395f[length];
                        sk.j.c(header2);
                        this.f22398i = i15 - header2.f22378c;
                        this.f22397h--;
                        i12++;
                        length--;
                    }
                }
                Header[] headerArr3 = this.f22395f;
                int i132 = i11 + 1;
                System.arraycopy(headerArr3, i132, headerArr3, i132 + i12, this.f22397h);
                Header[] headerArr22 = this.f22395f;
                int i142 = this.f22396g + 1;
                Arrays.fill(headerArr22, i142, i142 + i12, (Object) null);
                this.f22396g += i12;
            }
        }

        public final void b(Header header) {
            int i10 = header.f22378c;
            int i11 = this.f22394e;
            if (i10 > i11) {
                h.q0(this.f22395f, (b) null);
                this.f22396g = this.f22395f.length - 1;
                this.f22397h = 0;
                this.f22398i = 0;
                return;
            }
            a((this.f22398i + i10) - i11);
            int i12 = this.f22397h + 1;
            Header[] headerArr = this.f22395f;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length * 2)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f22396g = this.f22395f.length - 1;
                this.f22395f = headerArr2;
            }
            int i13 = this.f22396g;
            this.f22396g = i13 - 1;
            this.f22395f[i13] = header;
            this.f22397h++;
            this.f22398i += i10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(ll.j r11) {
            /*
                r10 = this;
                java.lang.String r0 = "data"
                sk.j.f(r11, r0)
                boolean r0 = r10.f22390a
                r1 = 127(0x7f, float:1.78E-43)
                r2 = 0
                if (r0 == 0) goto L_0x0091
                okhttp3.internal.http2.Huffman r0 = okhttp3.internal.http2.Huffman.f22520a
                r0.getClass()
                int r0 = r11.i()
                r3 = 0
                r5 = r2
                r6 = r3
            L_0x0019:
                if (r5 >= r0) goto L_0x002c
                byte r8 = r11.m(r5)
                byte[] r9 = okhttp3.internal.Util.f22171a
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte[] r9 = okhttp3.internal.http2.Huffman.f22522c
                byte r8 = r9[r8]
                long r8 = (long) r8
                long r6 = r6 + r8
                int r5 = r5 + 1
                goto L_0x0019
            L_0x002c:
                r0 = 7
                long r8 = (long) r0
                long r6 = r6 + r8
                r0 = 3
                long r5 = r6 >> r0
                int r0 = (int) r5
                int r5 = r11.i()
                if (r0 >= r5) goto L_0x0091
                ll.f r0 = new ll.f
                r0.<init>()
                okhttp3.internal.http2.Huffman r5 = okhttp3.internal.http2.Huffman.f22520a
                r5.getClass()
                int r5 = r11.i()
                r6 = r3
                r3 = r2
            L_0x0049:
                if (r2 >= r5) goto L_0x006f
                byte r4 = r11.m(r2)
                byte[] r8 = okhttp3.internal.Util.f22171a
                r4 = r4 & 255(0xff, float:3.57E-43)
                int[] r8 = okhttp3.internal.http2.Huffman.f22521b
                r8 = r8[r4]
                byte[] r9 = okhttp3.internal.http2.Huffman.f22522c
                byte r4 = r9[r4]
                long r6 = r6 << r4
                long r8 = (long) r8
                long r6 = r6 | r8
                int r3 = r3 + r4
            L_0x005f:
                r4 = 8
                if (r3 < r4) goto L_0x006c
                int r3 = r3 + -8
                long r8 = r6 >> r3
                int r4 = (int) r8
                r0.g0(r4)
                goto L_0x005f
            L_0x006c:
                int r2 = r2 + 1
                goto L_0x0049
            L_0x006f:
                if (r3 <= 0) goto L_0x007e
                int r11 = 8 - r3
                long r4 = r6 << r11
                r6 = 255(0xff, double:1.26E-321)
                long r2 = r6 >>> r3
                long r2 = r2 | r4
                int r11 = (int) r2
                r0.g0(r11)
            L_0x007e:
                ll.j r11 = r0.N()
                int r0 = r11.i()
                r2 = 128(0x80, float:1.794E-43)
                r10.e(r0, r1, r2)
                ll.f r0 = r10.f22391b
                r0.e0(r11)
                goto L_0x009d
            L_0x0091:
                int r0 = r11.i()
                r10.e(r0, r1, r2)
                ll.f r0 = r10.f22391b
                r0.e0(r11)
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.c(ll.j):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(java.util.ArrayList r14) {
            /*
                r13 = this;
                boolean r0 = r13.f22393d
                r1 = 0
                if (r0 == 0) goto L_0x001e
                int r0 = r13.f22392c
                int r2 = r13.f22394e
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0012
                r13.e(r0, r4, r3)
            L_0x0012:
                r13.f22393d = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.f22392c = r0
                int r0 = r13.f22394e
                r13.e(r0, r4, r3)
            L_0x001e:
                int r0 = r14.size()
                r2 = r1
            L_0x0023:
                if (r2 >= r0) goto L_0x0111
                java.lang.Object r3 = r14.get(r2)
                okhttp3.internal.http2.Header r3 = (okhttp3.internal.http2.Header) r3
                ll.j r4 = r3.f22376a
                ll.j r4 = r4.p()
                ll.j r5 = r3.f22377b
                okhttp3.internal.http2.Hpack r6 = okhttp3.internal.http2.Hpack.f22379a
                r6.getClass()
                java.util.Map<ll.j, java.lang.Integer> r6 = okhttp3.internal.http2.Hpack.f22381c
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                r8 = 1
                if (r6 == 0) goto L_0x0077
                int r6 = r6.intValue()
                int r6 = r6 + r8
                r9 = 2
                if (r9 > r6) goto L_0x0052
                r9 = 8
                if (r6 >= r9) goto L_0x0052
                r9 = r8
                goto L_0x0053
            L_0x0052:
                r9 = r1
            L_0x0053:
                if (r9 == 0) goto L_0x0074
                okhttp3.internal.http2.Header[] r9 = okhttp3.internal.http2.Hpack.f22380b
                int r10 = r6 + -1
                r10 = r9[r10]
                ll.j r10 = r10.f22377b
                boolean r10 = sk.j.a(r10, r5)
                if (r10 == 0) goto L_0x0064
                goto L_0x0078
            L_0x0064:
                r9 = r9[r6]
                ll.j r9 = r9.f22377b
                boolean r9 = sk.j.a(r9, r5)
                if (r9 == 0) goto L_0x0074
                int r9 = r6 + 1
                r12 = r9
                r9 = r6
                r6 = r12
                goto L_0x0079
            L_0x0074:
                r9 = r6
                r6 = r7
                goto L_0x0079
            L_0x0077:
                r6 = r7
            L_0x0078:
                r9 = r6
            L_0x0079:
                if (r6 != r7) goto L_0x00c0
                int r10 = r13.f22396g
                int r10 = r10 + r8
                okhttp3.internal.http2.Header[] r8 = r13.f22395f
                int r8 = r8.length
            L_0x0081:
                if (r10 >= r8) goto L_0x00c0
                okhttp3.internal.http2.Header[] r11 = r13.f22395f
                r11 = r11[r10]
                sk.j.c(r11)
                ll.j r11 = r11.f22376a
                boolean r11 = sk.j.a(r11, r4)
                if (r11 == 0) goto L_0x00bd
                okhttp3.internal.http2.Header[] r11 = r13.f22395f
                r11 = r11[r10]
                sk.j.c(r11)
                ll.j r11 = r11.f22377b
                boolean r11 = sk.j.a(r11, r5)
                if (r11 == 0) goto L_0x00ae
                int r6 = r13.f22396g
                int r10 = r10 - r6
                okhttp3.internal.http2.Hpack r6 = okhttp3.internal.http2.Hpack.f22379a
                r6.getClass()
                okhttp3.internal.http2.Header[] r6 = okhttp3.internal.http2.Hpack.f22380b
                int r6 = r6.length
                int r6 = r6 + r10
                goto L_0x00c0
            L_0x00ae:
                if (r9 != r7) goto L_0x00bd
                int r9 = r13.f22396g
                int r9 = r10 - r9
                okhttp3.internal.http2.Hpack r11 = okhttp3.internal.http2.Hpack.f22379a
                r11.getClass()
                okhttp3.internal.http2.Header[] r11 = okhttp3.internal.http2.Hpack.f22380b
                int r11 = r11.length
                int r9 = r9 + r11
            L_0x00bd:
                int r10 = r10 + 1
                goto L_0x0081
            L_0x00c0:
                if (r6 == r7) goto L_0x00ca
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.e(r6, r3, r4)
                goto L_0x010d
            L_0x00ca:
                r6 = 64
                if (r9 != r7) goto L_0x00dd
                ll.f r7 = r13.f22391b
                r7.g0(r6)
                r13.c(r4)
                r13.c(r5)
                r13.b(r3)
                goto L_0x010d
            L_0x00dd:
                ll.j r7 = okhttp3.internal.http2.Header.f22370d
                r4.getClass()
                java.lang.String r8 = "prefix"
                sk.j.f(r7, r8)
                int r8 = r7.i()
                boolean r7 = r4.o(r7, r8)
                if (r7 == 0) goto L_0x0102
                ll.j r7 = okhttp3.internal.http2.Header.f22375i
                boolean r4 = sk.j.a(r7, r4)
                if (r4 != 0) goto L_0x0102
                r3 = 15
                r13.e(r9, r3, r1)
                r13.c(r5)
                goto L_0x010d
            L_0x0102:
                r4 = 63
                r13.e(r9, r4, r6)
                r13.c(r5)
                r13.b(r3)
            L_0x010d:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x0111:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.d(java.util.ArrayList):void");
        }

        public final void e(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f22391b.g0(i10 | i12);
                return;
            }
            this.f22391b.g0(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f22391b.g0(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f22391b.g0(i13);
        }
    }

    static {
        Header header = new Header(Header.f22375i, "");
        j jVar = Header.f22372f;
        j jVar2 = Header.f22373g;
        j jVar3 = Header.f22374h;
        j jVar4 = Header.f22371e;
        Header[] headerArr = {header, new Header(jVar, "GET"), new Header(jVar, "POST"), new Header(jVar2, "/"), new Header(jVar2, "/index.html"), new Header(jVar3, "http"), new Header(jVar3, "https"), new Header(jVar4, "200"), new Header(jVar4, "204"), new Header(jVar4, "206"), new Header(jVar4, "304"), new Header(jVar4, "400"), new Header(jVar4, "404"), new Header(jVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f22380b = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Header[] headerArr2 = f22380b;
            if (!linkedHashMap.containsKey(headerArr2[i10].f22376a)) {
                linkedHashMap.put(headerArr2[i10].f22376a, Integer.valueOf(i10));
            }
        }
        Map<j, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        sk.j.e(unmodifiableMap, "unmodifiableMap(result)");
        f22381c = unmodifiableMap;
    }

    private Hpack() {
    }

    public static void a(j jVar) {
        boolean z10;
        sk.j.f(jVar, "name");
        int i10 = jVar.i();
        int i11 = 0;
        while (i11 < i10) {
            byte m10 = jVar.m(i11);
            if (65 > m10 || m10 >= 91) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                i11++;
            } else {
                StringBuilder q10 = a.q("PROTOCOL_ERROR response malformed: mixed case name: ");
                q10.append(jVar.q());
                throw new IOException(q10.toString());
            }
        }
    }
}
