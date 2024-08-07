package x3;

import androidx.work.c;
import n0.l;
import o3.o;
import sk.j;
import v.v;

/* compiled from: WorkSpec.kt */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f17019a;

    /* renamed from: b  reason: collision with root package name */
    public o f17020b;

    /* renamed from: c  reason: collision with root package name */
    public String f17021c;

    /* renamed from: d  reason: collision with root package name */
    public String f17022d;

    /* renamed from: e  reason: collision with root package name */
    public c f17023e;

    /* renamed from: f  reason: collision with root package name */
    public c f17024f;

    /* renamed from: g  reason: collision with root package name */
    public long f17025g;

    /* renamed from: h  reason: collision with root package name */
    public long f17026h;

    /* renamed from: i  reason: collision with root package name */
    public long f17027i;

    /* renamed from: j  reason: collision with root package name */
    public o3.c f17028j;

    /* renamed from: k  reason: collision with root package name */
    public int f17029k;

    /* renamed from: l  reason: collision with root package name */
    public int f17030l;

    /* renamed from: m  reason: collision with root package name */
    public long f17031m;

    /* renamed from: n  reason: collision with root package name */
    public long f17032n;

    /* renamed from: o  reason: collision with root package name */
    public long f17033o;

    /* renamed from: p  reason: collision with root package name */
    public long f17034p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f17035q;

    /* renamed from: r  reason: collision with root package name */
    public int f17036r;

    /* renamed from: s  reason: collision with root package name */
    public int f17037s;

    /* renamed from: t  reason: collision with root package name */
    public final int f17038t;

    /* renamed from: u  reason: collision with root package name */
    public long f17039u;

    /* renamed from: v  reason: collision with root package name */
    public int f17040v;

    /* renamed from: w  reason: collision with root package name */
    public final int f17041w;

    /* compiled from: WorkSpec.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f17042a;

        /* renamed from: b  reason: collision with root package name */
        public o f17043b;

        public a(o oVar, String str) {
            j.f(str, "id");
            this.f17042a = str;
            this.f17043b = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return j.a(this.f17042a, aVar.f17042a) && this.f17043b == aVar.f17043b;
        }

        public final int hashCode() {
            return this.f17043b.hashCode() + (this.f17042a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("IdAndState(id=");
            q10.append(this.f17042a);
            q10.append(", state=");
            q10.append(this.f17043b);
            q10.append(')');
            return q10.toString();
        }
    }

    static {
        j.e(o3.j.b("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public s(String str, o oVar, String str2, String str3, c cVar, c cVar2, long j10, long j11, long j12, o3.c cVar3, int i10, int i11, long j13, long j14, long j15, long j16, boolean z10, int i12, int i13, int i14, long j17, int i15, int i16) {
        c cVar4 = cVar;
        c cVar5 = cVar2;
        o3.c cVar6 = cVar3;
        int i17 = i11;
        int i18 = i12;
        j.f(str, "id");
        j.f(oVar, "state");
        j.f(str2, "workerClassName");
        j.f(str3, "inputMergerClassName");
        j.f(cVar4, "input");
        j.f(cVar5, "output");
        j.f(cVar6, "constraints");
        l.o(i17, "backoffPolicy");
        l.o(i18, "outOfQuotaPolicy");
        this.f17019a = str;
        this.f17020b = oVar;
        this.f17021c = str2;
        this.f17022d = str3;
        this.f17023e = cVar4;
        this.f17024f = cVar5;
        this.f17025g = j10;
        this.f17026h = j11;
        this.f17027i = j12;
        this.f17028j = cVar6;
        this.f17029k = i10;
        this.f17030l = i17;
        this.f17031m = j13;
        this.f17032n = j14;
        this.f17033o = j15;
        this.f17034p = j16;
        this.f17035q = z10;
        this.f17036r = i18;
        this.f17037s = i13;
        this.f17038t = i14;
        this.f17039u = j17;
        this.f17040v = i15;
        this.f17041w = i16;
    }

    public final long a() {
        boolean z10;
        long j10;
        boolean z11;
        boolean z12;
        long j11;
        if (this.f17020b != o.ENQUEUED || this.f17029k <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i10 = this.f17029k;
        int i11 = this.f17030l;
        long j12 = this.f17031m;
        long j13 = this.f17032n;
        int i12 = this.f17037s;
        boolean c10 = c();
        long j14 = this.f17025g;
        long j15 = this.f17027i;
        long j16 = this.f17026h;
        long j17 = j15;
        long j18 = this.f17039u;
        l.o(i11, "backoffPolicy");
        long j19 = Long.MAX_VALUE;
        if (j18 == Long.MAX_VALUE || !c10) {
            if (z10) {
                if (i11 == 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    j11 = ((long) i10) * j12;
                } else {
                    j11 = (long) Math.scalb((float) j12, i10 - 1);
                }
                if (j11 > 18000000) {
                    j11 = 18000000;
                }
                j19 = j13 + j11;
            } else if (c10) {
                if (i12 == 0) {
                    j10 = j13 + j14;
                } else {
                    j10 = j13 + j16;
                }
                j19 = j10;
                if (j17 != j16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && i12 == 0) {
                    j19 = (j16 - j17) + j19;
                }
            } else if (j13 != -1) {
                j19 = j13 + j14;
            }
            return j19;
        } else if (i12 == 0) {
            return j18;
        } else {
            long j20 = j13 + 900000;
            if (j18 < j20) {
                return j20;
            }
            return j18;
        }
    }

    public final boolean b() {
        return !j.a(o3.c.f13665i, this.f17028j);
    }

    public final boolean c() {
        if (this.f17026h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return j.a(this.f17019a, sVar.f17019a) && this.f17020b == sVar.f17020b && j.a(this.f17021c, sVar.f17021c) && j.a(this.f17022d, sVar.f17022d) && j.a(this.f17023e, sVar.f17023e) && j.a(this.f17024f, sVar.f17024f) && this.f17025g == sVar.f17025g && this.f17026h == sVar.f17026h && this.f17027i == sVar.f17027i && j.a(this.f17028j, sVar.f17028j) && this.f17029k == sVar.f17029k && this.f17030l == sVar.f17030l && this.f17031m == sVar.f17031m && this.f17032n == sVar.f17032n && this.f17033o == sVar.f17033o && this.f17034p == sVar.f17034p && this.f17035q == sVar.f17035q && this.f17036r == sVar.f17036r && this.f17037s == sVar.f17037s && this.f17038t == sVar.f17038t && this.f17039u == sVar.f17039u && this.f17040v == sVar.f17040v && this.f17041w == sVar.f17041w;
    }

    public final int hashCode() {
        int hashCode = this.f17020b.hashCode();
        int f10 = l.f(this.f17022d, l.f(this.f17021c, (hashCode + (this.f17019a.hashCode() * 31)) * 31, 31), 31);
        int hashCode2 = this.f17024f.hashCode();
        long j10 = this.f17025g;
        long j11 = this.f17026h;
        long j12 = this.f17027i;
        int hashCode3 = this.f17028j.hashCode();
        int g2 = v.g(this.f17030l);
        long j13 = this.f17031m;
        long j14 = this.f17032n;
        long j15 = this.f17033o;
        long j16 = this.f17034p;
        int hashCode4 = (((((((((g2 + ((((hashCode3 + ((((((((hashCode2 + ((this.f17023e.hashCode() + f10) * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f17029k) * 31)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31;
        boolean z10 = this.f17035q;
        if (z10) {
            z10 = true;
        }
        int g10 = v.g(this.f17036r);
        long j17 = this.f17039u;
        return ((((((((((g10 + ((hashCode4 + (z10 ? 1 : 0)) * 31)) * 31) + this.f17037s) * 31) + this.f17038t) * 31) + ((int) ((j17 >>> 32) ^ j17))) * 31) + this.f17040v) * 31) + this.f17041w;
    }

    public final String toString() {
        return l.k(android.support.v4.media.a.q("{WorkSpec: "), this.f17019a, '}');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ s(java.lang.String r36, o3.o r37, java.lang.String r38, java.lang.String r39, androidx.work.c r40, androidx.work.c r41, long r42, long r44, long r46, o3.c r48, int r49, int r50, long r51, long r53, long r55, long r57, boolean r59, int r60, int r61, long r62, int r64, int r65, int r66) {
        /*
            r35 = this;
            r0 = r66
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            o3.o r1 = o3.o.ENQUEUED
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r37
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0018
            java.lang.Class<androidx.work.OverwritingInputMerger> r1 = androidx.work.OverwritingInputMerger.class
            java.lang.String r1 = r1.getName()
            r6 = r1
            goto L_0x001a
        L_0x0018:
            r6 = r39
        L_0x001a:
            r1 = r0 & 16
            java.lang.String r2 = "EMPTY"
            if (r1 == 0) goto L_0x0027
            androidx.work.c r1 = androidx.work.c.f3753b
            sk.j.e(r1, r2)
            r7 = r1
            goto L_0x0029
        L_0x0027:
            r7 = r40
        L_0x0029:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0034
            androidx.work.c r1 = androidx.work.c.f3753b
            sk.j.e(r1, r2)
            r8 = r1
            goto L_0x0036
        L_0x0034:
            r8 = r41
        L_0x0036:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003d
            r9 = 0
            goto L_0x003f
        L_0x003d:
            r9 = r42
        L_0x003f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0046
            r11 = 0
            goto L_0x0048
        L_0x0046:
            r11 = r44
        L_0x0048:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004f
            r13 = 0
            goto L_0x0051
        L_0x004f:
            r13 = r46
        L_0x0051:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0059
            o3.c r1 = o3.c.f13665i
            r15 = r1
            goto L_0x005b
        L_0x0059:
            r15 = r48
        L_0x005b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x0063
            r16 = r5
            goto L_0x0065
        L_0x0063:
            r16 = r49
        L_0x0065:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r17 = 1
            if (r1 == 0) goto L_0x006e
            r1 = r17
            goto L_0x0070
        L_0x006e:
            r1 = r50
        L_0x0070:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0079
            r2 = 30000(0x7530, double:1.4822E-319)
            r18 = r2
            goto L_0x007b
        L_0x0079:
            r18 = r51
        L_0x007b:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            r20 = -1
            if (r2 == 0) goto L_0x0084
            r22 = r20
            goto L_0x0086
        L_0x0084:
            r22 = r53
        L_0x0086:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x008d
            r24 = 0
            goto L_0x008f
        L_0x008d:
            r24 = r55
        L_0x008f:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0098
            r26 = r20
            goto L_0x009a
        L_0x0098:
            r26 = r57
        L_0x009a:
            r2 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00a2
            r28 = r5
            goto L_0x00a4
        L_0x00a2:
            r28 = r59
        L_0x00a4:
            r2 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00ac
            r29 = r17
            goto L_0x00ae
        L_0x00ac:
            r29 = r60
        L_0x00ae:
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00b6
            r30 = r5
            goto L_0x00b8
        L_0x00b6:
            r30 = r61
        L_0x00b8:
            r31 = 0
            r2 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00c7
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r32 = r2
            goto L_0x00c9
        L_0x00c7:
            r32 = r62
        L_0x00c9:
            r2 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00d1
            r34 = r5
            goto L_0x00d3
        L_0x00d1:
            r34 = r64
        L_0x00d3:
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00db
            r0 = -256(0xffffffffffffff00, float:NaN)
            goto L_0x00dd
        L_0x00db:
            r0 = r65
        L_0x00dd:
            r2 = r35
            r3 = r36
            r5 = r38
            r17 = r1
            r20 = r22
            r22 = r24
            r24 = r26
            r26 = r28
            r27 = r29
            r28 = r30
            r29 = r31
            r30 = r32
            r32 = r34
            r33 = r0
            r2.<init>((java.lang.String) r3, (o3.o) r4, (java.lang.String) r5, (java.lang.String) r6, (androidx.work.c) r7, (androidx.work.c) r8, (long) r9, (long) r11, (long) r13, (o3.c) r15, (int) r16, (int) r17, (long) r18, (long) r20, (long) r22, (long) r24, (boolean) r26, (int) r27, (int) r28, (int) r29, (long) r30, (int) r32, (int) r33)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.s.<init>(java.lang.String, o3.o, java.lang.String, java.lang.String, androidx.work.c, androidx.work.c, long, long, long, o3.c, int, int, long, long, long, long, boolean, int, int, long, int, int, int):void");
    }
}
