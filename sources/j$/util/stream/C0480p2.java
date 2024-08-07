package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* renamed from: j$.util.stream.p2  reason: case insensitive filesystem */
final class C0480p2 extends C0428d {

    /* renamed from: j  reason: collision with root package name */
    private final C0423c f18859j;

    /* renamed from: k  reason: collision with root package name */
    private final IntFunction f18860k;

    /* renamed from: l  reason: collision with root package name */
    private final long f18861l;

    /* renamed from: m  reason: collision with root package name */
    private final long f18862m;

    /* renamed from: n  reason: collision with root package name */
    private long f18863n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f18864o;

    C0480p2(C0423c cVar, C0423c cVar2, Spliterator spliterator, IntFunction intFunction, long j10, long j11) {
        super((C0501v0) cVar2, spliterator);
        this.f18859j = cVar;
        this.f18860k = intFunction;
        this.f18861l = j10;
        this.f18862m = j11;
    }

    C0480p2(C0480p2 p2Var, Spliterator spliterator) {
        super((C0428d) p2Var, spliterator);
        this.f18859j = p2Var.f18859j;
        this.f18860k = p2Var.f18860k;
        this.f18861l = p2Var.f18861l;
        this.f18862m = p2Var.f18862m;
    }

    private long j(long j10) {
        if (this.f18864o) {
            return this.f18863n;
        }
        C0480p2 p2Var = (C0480p2) this.f18787d;
        C0480p2 p2Var2 = (C0480p2) this.f18788e;
        if (p2Var == null || p2Var2 == null) {
            return this.f18863n;
        }
        long j11 = p2Var.j(j10);
        return j11 >= j10 ? j11 : j11 + p2Var2.j(j10);
    }

    /* access modifiers changed from: protected */
    public final Object a() {
        long j10 = -1;
        if (c() == null) {
            if (T2.SIZED.K(this.f18859j.f18761j)) {
                j10 = this.f18859j.Y0(this.f18785b);
            }
            C0517z0 p12 = this.f18859j.p1(j10, this.f18860k);
            C0440f2 I1 = this.f18859j.I1(this.f18784a.e1(), p12);
            C0501v0 v0Var = this.f18784a;
            v0Var.U0(this.f18785b, v0Var.v1(I1));
            return p12.build();
        }
        C0501v0 v0Var2 = this.f18784a;
        C0517z0 p13 = v0Var2.p1(-1, this.f18860k);
        v0Var2.u1(this.f18785b, p13);
        E0 build = p13.build();
        this.f18863n = build.count();
        this.f18864o = true;
        this.f18785b = null;
        return build;
    }

    /* access modifiers changed from: protected */
    public final C0437f d(Spliterator spliterator) {
        return new C0480p2(this, spliterator);
    }

    /* access modifiers changed from: protected */
    public final void g() {
        this.f18773i = true;
        if (this.f18864o) {
            e(i());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Y0 i() {
        return C0501v0.X0(this.f18859j.B1());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCompletion(java.util.concurrent.CountedCompleter r15) {
        /*
            r14 = this;
            j$.util.stream.f r0 = r14.f18787d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            r4 = 0
            if (r3 != 0) goto L_0x0090
            j$.util.stream.p2 r0 = (j$.util.stream.C0480p2) r0
            long r6 = r0.f18863n
            j$.util.stream.f r0 = r14.f18788e
            j$.util.stream.p2 r0 = (j$.util.stream.C0480p2) r0
            long r8 = r0.f18863n
            long r6 = r6 + r8
            r14.f18863n = r6
            boolean r0 = r14.f18773i
            if (r0 == 0) goto L_0x0021
            r14.f18863n = r4
            goto L_0x0027
        L_0x0021:
            long r6 = r14.f18863n
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
        L_0x0027:
            j$.util.stream.Y0 r0 = r14.i()
        L_0x002b:
            r6 = r0
            goto L_0x0061
        L_0x002d:
            j$.util.stream.f r0 = r14.f18787d
            j$.util.stream.p2 r0 = (j$.util.stream.C0480p2) r0
            long r6 = r0.f18863n
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0042
            j$.util.stream.f r0 = r14.f18788e
            j$.util.stream.p2 r0 = (j$.util.stream.C0480p2) r0
            java.lang.Object r0 = r0.b()
            j$.util.stream.E0 r0 = (j$.util.stream.E0) r0
            goto L_0x002b
        L_0x0042:
            j$.util.stream.c r0 = r14.f18859j
            int r0 = r0.B1()
            j$.util.stream.f r3 = r14.f18787d
            j$.util.stream.p2 r3 = (j$.util.stream.C0480p2) r3
            java.lang.Object r3 = r3.b()
            j$.util.stream.E0 r3 = (j$.util.stream.E0) r3
            j$.util.stream.f r6 = r14.f18788e
            j$.util.stream.p2 r6 = (j$.util.stream.C0480p2) r6
            java.lang.Object r6 = r6.b()
            j$.util.stream.E0 r6 = (j$.util.stream.E0) r6
            j$.util.stream.G0 r0 = j$.util.stream.C0501v0.S0(r0, r3, r6)
            goto L_0x002b
        L_0x0061:
            j$.util.stream.f r0 = r14.c()
            if (r0 != 0) goto L_0x0069
            r0 = r1
            goto L_0x006a
        L_0x0069:
            r0 = r2
        L_0x006a:
            if (r0 == 0) goto L_0x008b
            long r7 = r14.f18862m
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0080
            long r7 = r6.count()
            long r9 = r14.f18861l
            long r11 = r14.f18862m
            long r9 = r9 + r11
            long r7 = java.lang.Math.min(r7, r9)
            goto L_0x0082
        L_0x0080:
            long r7 = r14.f18863n
        L_0x0082:
            r9 = r7
            long r7 = r14.f18861l
            j$.util.function.IntFunction r11 = r14.f18860k
            j$.util.stream.E0 r6 = r6.q(r7, r9, r11)
        L_0x008b:
            r14.e(r6)
            r14.f18864o = r1
        L_0x0090:
            long r6 = r14.f18862m
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00e8
            j$.util.stream.f r0 = r14.c()
            if (r0 != 0) goto L_0x009e
            r0 = r1
            goto L_0x009f
        L_0x009e:
            r0 = r2
        L_0x009f:
            if (r0 != 0) goto L_0x00e8
            long r3 = r14.f18861l
            long r5 = r14.f18862m
            long r3 = r3 + r5
            boolean r0 = r14.f18864o
            if (r0 == 0) goto L_0x00ad
            long r5 = r14.f18863n
            goto L_0x00b1
        L_0x00ad:
            long r5 = r14.j(r3)
        L_0x00b1:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00b6
            goto L_0x00e3
        L_0x00b6:
            j$.util.stream.f r0 = r14.c()
            j$.util.stream.p2 r0 = (j$.util.stream.C0480p2) r0
            r7 = r14
        L_0x00bd:
            if (r0 == 0) goto L_0x00dd
            j$.util.stream.f r8 = r0.f18788e
            if (r7 != r8) goto L_0x00d3
            j$.util.stream.f r7 = r0.f18787d
            j$.util.stream.p2 r7 = (j$.util.stream.C0480p2) r7
            if (r7 == 0) goto L_0x00d3
            long r7 = r7.j(r3)
            long r5 = r5 + r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x00d3
            goto L_0x00e3
        L_0x00d3:
            j$.util.stream.f r7 = r0.c()
            j$.util.stream.p2 r7 = (j$.util.stream.C0480p2) r7
            r13 = r7
            r7 = r0
            r0 = r13
            goto L_0x00bd
        L_0x00dd:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r1 = r2
        L_0x00e3:
            if (r1 == 0) goto L_0x00e8
            r14.h()
        L_0x00e8:
            super.onCompletion(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C0480p2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
