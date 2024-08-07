package el;

import al.d0;
import fk.u;
import ik.d;
import java.util.concurrent.atomic.AtomicInteger;
import kk.c;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import rk.q;

@e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {54, 76, 79}, m = "invokeSuspend")
/* compiled from: Combine.kt */
public final class f extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public cl.e f20128a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f20129b;

    /* renamed from: c  reason: collision with root package name */
    public int f20130c;

    /* renamed from: d  reason: collision with root package name */
    public int f20131d;

    /* renamed from: e  reason: collision with root package name */
    public int f20132e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f20133f;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ dl.e<Object>[] f20134n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ rk.a<Object[]> f20135o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ q<dl.f<Object>, Object[], d<? super ek.i>, Object> f20136p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ dl.f<Object> f20137q;

    @e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {31}, m = "invokeSuspend")
    /* compiled from: Combine.kt */
    public static final class a extends i implements p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f20138a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ dl.e<Object>[] f20139b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f20140c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f20141d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ cl.e<u<Object>> f20142e;

        /* renamed from: el.f$a$a  reason: collision with other inner class name */
        /* compiled from: Combine.kt */
        public static final class C0280a<T> implements dl.f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ cl.e<u<Object>> f20143a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f20144b;

            @e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {32, 33}, m = "emit")
            /* renamed from: el.f$a$a$a  reason: collision with other inner class name */
            /* compiled from: Combine.kt */
            public static final class C0281a extends c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f20145a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ C0280a<T> f20146b;

                /* renamed from: c  reason: collision with root package name */
                public int f20147c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0281a(C0280a<? super T> aVar, d<? super C0281a> dVar) {
                    super(dVar);
                    this.f20146b = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f20145a = obj;
                    this.f20147c |= Integer.MIN_VALUE;
                    return this.f20146b.e(null, this);
                }
            }

            public C0280a(cl.e<u<Object>> eVar, int i10) {
                this.f20143a = eVar;
                this.f20144b = i10;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce  */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x00dc  */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x00e0 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object e(T r7, ik.d<? super ek.i> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof el.f.a.C0280a.C0281a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    el.f$a$a$a r0 = (el.f.a.C0280a.C0281a) r0
                    int r1 = r0.f20147c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f20147c = r1
                    goto L_0x0018
                L_0x0013:
                    el.f$a$a$a r0 = new el.f$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f20145a
                    jk.a r1 = jk.a.COROUTINE_SUSPENDED
                    int r2 = r0.f20147c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0037
                    if (r2 == r4) goto L_0x0033
                    if (r2 != r3) goto L_0x002b
                    p3.l0.Q0(r8)
                    goto L_0x00e1
                L_0x002b:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0033:
                    p3.l0.Q0(r8)
                    goto L_0x004c
                L_0x0037:
                    p3.l0.Q0(r8)
                    cl.e<fk.u<java.lang.Object>> r8 = r6.f20143a
                    fk.u r2 = new fk.u
                    int r5 = r6.f20144b
                    r2.<init>(r5, r7)
                    r0.f20147c = r4
                    java.lang.Object r7 = r8.e(r2, r0)
                    if (r7 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    r0.f20147c = r3
                    ik.f r7 = r0.getContext()
                    al.g0.O(r7)
                    ik.d r8 = al.g0.b0(r0)
                    boolean r0 = r8 instanceof fl.f
                    r2 = 0
                    if (r0 == 0) goto L_0x0061
                    fl.f r8 = (fl.f) r8
                    goto L_0x0062
                L_0x0061:
                    r8 = r2
                L_0x0062:
                    if (r8 != 0) goto L_0x0068
                    ek.i r7 = ek.i.f20112a
                    goto L_0x00d7
                L_0x0068:
                    al.a0 r0 = r8.f20228d
                    boolean r0 = r0.W(r7)
                    if (r0 == 0) goto L_0x007c
                    ek.i r0 = ek.i.f20112a
                    r8.f20230f = r0
                    r8.f19082c = r4
                    al.a0 r0 = r8.f20228d
                    r0.U(r7, r8)
                    goto L_0x00d6
                L_0x007c:
                    al.g2 r0 = new al.g2
                    r0.<init>()
                    ik.f r7 = r7.plus(r0)
                    ek.i r3 = ek.i.f20112a
                    r8.f20230f = r3
                    r8.f19082c = r4
                    al.a0 r5 = r8.f20228d
                    r5.U(r7, r8)
                    boolean r7 = r0.f19037b
                    if (r7 == 0) goto L_0x00d6
                    al.x0 r7 = al.a2.a()
                    fk.g<al.p0<?>> r0 = r7.f19105e
                    if (r0 == 0) goto L_0x00a1
                    boolean r0 = r0.isEmpty()
                    goto L_0x00a2
                L_0x00a1:
                    r0 = r4
                L_0x00a2:
                    r5 = 0
                    if (r0 == 0) goto L_0x00a6
                    goto L_0x00c8
                L_0x00a6:
                    boolean r0 = r7.e0()
                    if (r0 == 0) goto L_0x00b4
                    r8.f20230f = r3
                    r8.f19082c = r4
                    r7.c0(r8)
                    goto L_0x00c9
                L_0x00b4:
                    r7.d0(r4)
                    r8.run()     // Catch:{ all -> 0x00c1 }
                L_0x00ba:
                    boolean r0 = r7.j0()     // Catch:{ all -> 0x00c1 }
                    if (r0 != 0) goto L_0x00ba
                    goto L_0x00c5
                L_0x00c1:
                    r0 = move-exception
                    r8.g(r0, r2)     // Catch:{ all -> 0x00d1 }
                L_0x00c5:
                    r7.a0(r4)
                L_0x00c8:
                    r4 = r5
                L_0x00c9:
                    if (r4 == 0) goto L_0x00ce
                    jk.a r7 = jk.a.COROUTINE_SUSPENDED
                    goto L_0x00d7
                L_0x00ce:
                    ek.i r7 = ek.i.f20112a
                    goto L_0x00d7
                L_0x00d1:
                    r8 = move-exception
                    r7.a0(r4)
                    throw r8
                L_0x00d6:
                    r7 = r1
                L_0x00d7:
                    jk.a r8 = jk.a.COROUTINE_SUSPENDED
                    if (r7 != r8) goto L_0x00dc
                    goto L_0x00de
                L_0x00dc:
                    ek.i r7 = ek.i.f20112a
                L_0x00de:
                    if (r7 != r1) goto L_0x00e1
                    return r1
                L_0x00e1:
                    ek.i r7 = ek.i.f20112a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: el.f.a.C0280a.e(java.lang.Object, ik.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(dl.e<Object>[] eVarArr, int i10, AtomicInteger atomicInteger, cl.e<u<Object>> eVar, d<? super a> dVar) {
            super(2, dVar);
            this.f20139b = eVarArr;
            this.f20140c = i10;
            this.f20141d = atomicInteger;
            this.f20142e = eVar;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f20139b, this.f20140c, this.f20141d, this.f20142e, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f20138a;
            if (i10 == 0) {
                l0.Q0(obj);
                dl.e<Object>[] eVarArr = this.f20139b;
                int i11 = this.f20140c;
                dl.e<Object> eVar = eVarArr[i11];
                C0280a aVar2 = new C0280a(this.f20142e, i11);
                this.f20138a = 1;
                if (eVar.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Throwable th2) {
                    if (this.f20141d.decrementAndGet() == 0) {
                        this.f20142e.c((Throwable) null);
                    }
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.f20141d.decrementAndGet() == 0) {
                this.f20142e.c((Throwable) null);
            }
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d dVar, rk.a aVar, q qVar, dl.f fVar, dl.e[] eVarArr) {
        super(2, dVar);
        this.f20134n = eVarArr;
        this.f20135o = aVar;
        this.f20136p = qVar;
        this.f20137q = fVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        d<?> dVar2 = dVar;
        f fVar = new f(dVar2, this.f20135o, this.f20136p, this.f20137q, this.f20134n);
        fVar.f20133f = obj;
        return fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5 A[LOOP:1: B:29:0x00b5->B:38:0x00d6, LOOP_START, PHI: r8 r12 
      PHI: (r8v1 int) = (r8v0 int), (r8v2 int) binds: [B:26:0x00b0, B:38:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v3 fk.u) = (r12v2 fk.u), (r12v16 fk.u) binds: [B:26:0x00b0, B:38:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f20132e
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 3
            r7 = 0
            if (r2 == 0) goto L_0x0054
            if (r2 == r5) goto L_0x003d
            if (r2 == r3) goto L_0x002c
            if (r2 != r6) goto L_0x0024
            int r2 = r0.f20131d
            int r8 = r0.f20130c
            byte[] r9 = r0.f20129b
            cl.e r10 = r0.f20128a
            java.lang.Object r11 = r0.f20133f
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            p3.l0.Q0(r20)
            r14 = r7
            goto L_0x003b
        L_0x0024:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002c:
            int r2 = r0.f20131d
            int r8 = r0.f20130c
            byte[] r9 = r0.f20129b
            cl.e r10 = r0.f20128a
            java.lang.Object r11 = r0.f20133f
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            p3.l0.Q0(r20)
        L_0x003b:
            r7 = r0
            goto L_0x0093
        L_0x003d:
            int r2 = r0.f20131d
            int r8 = r0.f20130c
            byte[] r9 = r0.f20129b
            cl.e r10 = r0.f20128a
            java.lang.Object r11 = r0.f20133f
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            p3.l0.Q0(r20)
            r12 = r20
            cl.i r12 = (cl.i) r12
            java.lang.Object r12 = r12.f19256a
            r7 = r0
            goto L_0x00a8
        L_0x0054:
            p3.l0.Q0(r20)
            java.lang.Object r2 = r0.f20133f
            al.d0 r2 = (al.d0) r2
            dl.e<java.lang.Object>[] r8 = r0.f20134n
            int r8 = r8.length
            if (r8 != 0) goto L_0x0063
            ek.i r1 = ek.i.f20112a
            return r1
        L_0x0063:
            java.lang.Object[] r11 = new java.lang.Object[r8]
            u9.b r9 = al.g0.f19021d
            fk.h.q0(r11, r9)
            r9 = 6
            cl.a r10 = cl.h.a(r8, r7, r9)
            java.util.concurrent.atomic.AtomicInteger r9 = new java.util.concurrent.atomic.AtomicInteger
            r9.<init>(r8)
            r15 = r7
        L_0x0075:
            if (r15 >= r8) goto L_0x008f
            el.f$a r14 = new el.f$a
            dl.e<java.lang.Object>[] r13 = r0.f20134n
            r17 = 0
            r12 = r14
            r7 = r14
            r14 = r15
            r18 = r15
            r15 = r9
            r16 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            p3.l0.j0(r2, r4, r7, r6)
            int r15 = r18 + 1
            r7 = 0
            goto L_0x0075
        L_0x008f:
            byte[] r9 = new byte[r8]
            r7 = r0
            r2 = 0
        L_0x0093:
            int r2 = r2 + r5
            byte r2 = (byte) r2
            r7.f20133f = r11
            r7.f20128a = r10
            r7.f20129b = r9
            r7.f20130c = r8
            r7.f20131d = r2
            r7.f20132e = r5
            java.lang.Object r12 = r10.a(r7)
            if (r12 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            boolean r13 = r12 instanceof cl.i.b
            if (r13 != 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r12 = r4
        L_0x00ae:
            fk.u r12 = (fk.u) r12
            if (r12 != 0) goto L_0x00b5
            ek.i r1 = ek.i.f20112a
            return r1
        L_0x00b5:
            int r13 = r12.f20216a
            r14 = r11[r13]
            T r12 = r12.f20217b
            r11[r13] = r12
            u9.b r12 = al.g0.f19021d
            if (r14 != r12) goto L_0x00c3
            int r8 = r8 + -1
        L_0x00c3:
            byte r12 = r9[r13]
            if (r12 == r2) goto L_0x00d8
            byte r12 = (byte) r2
            r9[r13] = r12
            java.lang.Object r12 = r10.b()
            boolean r13 = r12 instanceof cl.i.b
            if (r13 != 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r12 = r4
        L_0x00d4:
            fk.u r12 = (fk.u) r12
            if (r12 != 0) goto L_0x00b5
        L_0x00d8:
            if (r8 != 0) goto L_0x0117
            rk.a<java.lang.Object[]> r12 = r7.f20135o
            java.lang.Object r12 = r12.invoke()
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            if (r12 != 0) goto L_0x00fb
            rk.q<dl.f<java.lang.Object>, java.lang.Object[], ik.d<? super ek.i>, java.lang.Object> r12 = r7.f20136p
            dl.f<java.lang.Object> r13 = r7.f20137q
            r7.f20133f = r11
            r7.f20128a = r10
            r7.f20129b = r9
            r7.f20130c = r8
            r7.f20131d = r2
            r7.f20132e = r3
            java.lang.Object r12 = r12.d(r13, r11, r7)
            if (r12 != r1) goto L_0x0093
            return r1
        L_0x00fb:
            int r13 = r11.length
            r14 = 0
            fk.h.m0(r14, r14, r13, r11, r12)
            rk.q<dl.f<java.lang.Object>, java.lang.Object[], ik.d<? super ek.i>, java.lang.Object> r13 = r7.f20136p
            dl.f<java.lang.Object> r15 = r7.f20137q
            r7.f20133f = r11
            r7.f20128a = r10
            r7.f20129b = r9
            r7.f20130c = r8
            r7.f20131d = r2
            r7.f20132e = r6
            java.lang.Object r12 = r13.d(r15, r12, r7)
            if (r12 != r1) goto L_0x0093
            return r1
        L_0x0117:
            r14 = 0
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: el.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
