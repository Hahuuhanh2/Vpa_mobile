package dl;

import al.g0;
import al.i1;
import ek.i;
import el.b;
import ik.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kk.c;
import kk.e;

/* compiled from: StateFlow.kt */
public final class z<T> extends el.a<a0> implements r<T>, e {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20049e = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d  reason: collision with root package name */
    public int f20050d;

    @e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    /* compiled from: StateFlow.kt */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public z f20051a;

        /* renamed from: b  reason: collision with root package name */
        public f f20052b;

        /* renamed from: c  reason: collision with root package name */
        public a0 f20053c;

        /* renamed from: d  reason: collision with root package name */
        public i1 f20054d;

        /* renamed from: e  reason: collision with root package name */
        public Object f20055e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f20056f;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ z<T> f20057n;

        /* renamed from: o  reason: collision with root package name */
        public int f20058o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(z<T> zVar, d<? super a> dVar) {
            super(dVar);
            this.f20057n = zVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f20056f = obj;
            this.f20058o |= Integer.MIN_VALUE;
            return this.f20057n.a((f) null, this);
        }
    }

    public z(Object obj) {
        this._state = obj;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [ik.f$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7 A[Catch:{ all -> 0x005f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c8 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dd A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00df A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e3 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dl.f<? super T> r18, ik.d<?> r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            boolean r3 = r2 instanceof dl.z.a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            dl.z$a r3 = (dl.z.a) r3
            int r4 = r3.f20058o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f20058o = r4
            goto L_0x001e
        L_0x0019:
            dl.z$a r3 = new dl.z$a
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f20056f
            jk.a r4 = jk.a.COROUTINE_SUSPENDED
            int r5 = r3.f20058o
            r6 = 1
            r7 = 2
            r8 = 3
            r9 = 0
            if (r5 == 0) goto L_0x0062
            if (r5 == r6) goto L_0x0055
            if (r5 == r7) goto L_0x0046
            if (r5 != r8) goto L_0x003e
            java.lang.Object r0 = r3.f20055e
            al.i1 r5 = r3.f20054d
            dl.a0 r10 = r3.f20053c
            dl.f r11 = r3.f20052b
            dl.z r12 = r3.f20051a
            p3.l0.Q0(r2)     // Catch:{ all -> 0x005f }
            goto L_0x0092
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0046:
            java.lang.Object r0 = r3.f20055e
            al.i1 r5 = r3.f20054d
            dl.a0 r10 = r3.f20053c
            dl.f r11 = r3.f20052b
            dl.z r12 = r3.f20051a
            p3.l0.Q0(r2)     // Catch:{ all -> 0x005f }
            goto L_0x00c9
        L_0x0055:
            dl.a0 r10 = r3.f20053c
            dl.f r0 = r3.f20052b
            dl.z r12 = r3.f20051a
            p3.l0.Q0(r2)     // Catch:{ all -> 0x005f }
            goto L_0x0083
        L_0x005f:
            r0 = move-exception
            goto L_0x011f
        L_0x0062:
            p3.l0.Q0(r2)
            el.b r2 = r17.c()
            dl.a0 r2 = (dl.a0) r2
            boolean r5 = r0 instanceof dl.c0     // Catch:{ all -> 0x0121 }
            if (r5 == 0) goto L_0x0081
            r5 = r0
            dl.c0 r5 = (dl.c0) r5     // Catch:{ all -> 0x0121 }
            r3.f20051a = r1     // Catch:{ all -> 0x0121 }
            r3.f20052b = r0     // Catch:{ all -> 0x0121 }
            r3.f20053c = r2     // Catch:{ all -> 0x0121 }
            r3.f20058o = r6     // Catch:{ all -> 0x0121 }
            ek.i r5 = r5.a(r3)     // Catch:{ all -> 0x0121 }
            if (r5 != r4) goto L_0x0081
            return r4
        L_0x0081:
            r12 = r1
            r10 = r2
        L_0x0083:
            ik.f r2 = r3.getContext()     // Catch:{ all -> 0x005f }
            al.i1$b r5 = al.i1.b.f19045a     // Catch:{ all -> 0x005f }
            ik.f$b r2 = r2.get(r5)     // Catch:{ all -> 0x005f }
            r5 = r2
            al.i1 r5 = (al.i1) r5     // Catch:{ all -> 0x005f }
            r11 = r0
            r0 = r9
        L_0x0092:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f20049e     // Catch:{ all -> 0x005f }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ all -> 0x005f }
            if (r5 == 0) goto L_0x00a6
            boolean r13 = r5.isActive()     // Catch:{ all -> 0x005f }
            if (r13 == 0) goto L_0x00a1
            goto L_0x00a6
        L_0x00a1:
            java.util.concurrent.CancellationException r0 = r5.getCancellationException()     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x00a6:
            if (r0 == 0) goto L_0x00ae
            boolean r13 = sk.j.a(r0, r2)     // Catch:{ all -> 0x005f }
            if (r13 != 0) goto L_0x00c9
        L_0x00ae:
            u9.b r0 = al.g0.f19020c     // Catch:{ all -> 0x005f }
            if (r2 != r0) goto L_0x00b4
            r0 = r9
            goto L_0x00b5
        L_0x00b4:
            r0 = r2
        L_0x00b5:
            r3.f20051a = r12     // Catch:{ all -> 0x005f }
            r3.f20052b = r11     // Catch:{ all -> 0x005f }
            r3.f20053c = r10     // Catch:{ all -> 0x005f }
            r3.f20054d = r5     // Catch:{ all -> 0x005f }
            r3.f20055e = r2     // Catch:{ all -> 0x005f }
            r3.f20058o = r7     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r11.e(r0, r3)     // Catch:{ all -> 0x005f }
            if (r0 != r4) goto L_0x00c8
            return r4
        L_0x00c8:
            r0 = r2
        L_0x00c9:
            r10.getClass()     // Catch:{ all -> 0x005f }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = dl.a0.f19955a     // Catch:{ all -> 0x005f }
            u9.b r13 = m9.b.f13207s     // Catch:{ all -> 0x005f }
            java.lang.Object r14 = r2.getAndSet(r10, r13)     // Catch:{ all -> 0x005f }
            sk.j.c(r14)     // Catch:{ all -> 0x005f }
            u9.b r15 = m9.b.f13208t     // Catch:{ all -> 0x005f }
            r16 = 0
            if (r14 != r15) goto L_0x00df
            r14 = r6
            goto L_0x00e1
        L_0x00df:
            r14 = r16
        L_0x00e1:
            if (r14 != 0) goto L_0x0092
            r3.f20051a = r12     // Catch:{ all -> 0x005f }
            r3.f20052b = r11     // Catch:{ all -> 0x005f }
            r3.f20053c = r10     // Catch:{ all -> 0x005f }
            r3.f20054d = r5     // Catch:{ all -> 0x005f }
            r3.f20055e = r0     // Catch:{ all -> 0x005f }
            r3.f20058o = r8     // Catch:{ all -> 0x005f }
            al.l r14 = new al.l     // Catch:{ all -> 0x005f }
            ik.d r15 = al.g0.b0(r3)     // Catch:{ all -> 0x005f }
            r14.<init>(r6, r15)     // Catch:{ all -> 0x005f }
            r14.t()     // Catch:{ all -> 0x005f }
        L_0x00fb:
            boolean r15 = r2.compareAndSet(r10, r13, r14)     // Catch:{ all -> 0x005f }
            if (r15 == 0) goto L_0x0104
            r16 = r6
            goto L_0x010a
        L_0x0104:
            java.lang.Object r15 = r2.get(r10)     // Catch:{ all -> 0x005f }
            if (r15 == r13) goto L_0x00fb
        L_0x010a:
            if (r16 != 0) goto L_0x0111
            ek.i r2 = ek.i.f20112a     // Catch:{ all -> 0x005f }
            r14.resumeWith(r2)     // Catch:{ all -> 0x005f }
        L_0x0111:
            java.lang.Object r2 = r14.s()     // Catch:{ all -> 0x005f }
            jk.a r13 = jk.a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x005f }
            if (r2 != r13) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            ek.i r2 = ek.i.f20112a     // Catch:{ all -> 0x005f }
        L_0x011c:
            if (r2 != r4) goto L_0x0092
            return r4
        L_0x011f:
            r2 = r10
            goto L_0x0123
        L_0x0121:
            r0 = move-exception
            r12 = r1
        L_0x0123:
            r12.g(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.z.a(dl.f, ik.d):java.lang.Object");
    }

    public final boolean b(T t10) {
        setValue(t10);
        return true;
    }

    public final b d() {
        return new a0();
    }

    public final Object e(T t10, d<? super i> dVar) {
        setValue(t10);
        return i.f20112a;
    }

    public final b[] f() {
        return new a0[2];
    }

    public final T h() {
        T t10 = g0.f19020c;
        T t11 = f20049e.get(this);
        if (t11 == t10) {
            return null;
        }
        return t11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r1 = (dl.a0[]) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r1 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r3 = r1.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r4 >= r3) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r5 = r1[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r5 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        r6 = dl.a0.f19955a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r7 = r6.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r7 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r8 = m9.b.f13208t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (r7 != r8) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        r9 = m9.b.f13207s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r7 != r9) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r10 = dl.a0.f19955a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r10.compareAndSet(r5, r7, r8) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0053, code lost:
        if (r10.get(r5) == r7) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        if (r7 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0059, code lost:
        r8 = dl.a0.f19955a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
        if (r8.compareAndSet(r5, r7, r9) == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0061, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        if (r8.get(r5) == r7) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006a, code lost:
        if (r8 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006c, code lost:
        ((al.l) r7).resumeWith(ek.i.f20112a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0076, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1 = r12.f20050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0079, code lost:
        if (r1 != r13) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007b, code lost:
        r12.f20050d = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007e, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r13 = r12.f20115a;
        r3 = ek.i.f20112a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0084, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0085, code lost:
        r11 = r1;
        r1 = r13;
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setValue(T r13) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0004
            u9.b r13 = al.g0.f19020c
        L_0x0004:
            monitor-enter(r12)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f20049e     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = r0.get(r12)     // Catch:{ all -> 0x0092 }
            r2 = 0
            boolean r1 = sk.j.a(r1, r13)     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0015
            monitor-exit(r12)
            goto L_0x0091
        L_0x0015:
            r0.set(r12, r13)     // Catch:{ all -> 0x0092 }
            int r13 = r12.f20050d     // Catch:{ all -> 0x0092 }
            r0 = r13 & 1
            if (r0 != 0) goto L_0x008c
            r0 = 1
            int r13 = r13 + r0
            r12.f20050d = r13     // Catch:{ all -> 0x0092 }
            S[] r1 = r12.f20115a     // Catch:{ all -> 0x0092 }
            ek.i r3 = ek.i.f20112a     // Catch:{ all -> 0x0092 }
            monitor-exit(r12)
        L_0x0027:
            dl.a0[] r1 = (dl.a0[]) r1
            if (r1 == 0) goto L_0x0076
            int r3 = r1.length
            r4 = r2
        L_0x002d:
            if (r4 >= r3) goto L_0x0076
            r5 = r1[r4]
            if (r5 == 0) goto L_0x0073
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = dl.a0.f19955a
        L_0x0035:
            java.lang.Object r7 = r6.get(r5)
            if (r7 != 0) goto L_0x003c
            goto L_0x0073
        L_0x003c:
            u9.b r8 = m9.b.f13208t
            if (r7 != r8) goto L_0x0041
            goto L_0x0073
        L_0x0041:
            u9.b r9 = m9.b.f13207s
            if (r7 != r9) goto L_0x0059
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = dl.a0.f19955a
        L_0x0047:
            boolean r9 = r10.compareAndSet(r5, r7, r8)
            if (r9 == 0) goto L_0x004f
            r7 = r0
            goto L_0x0056
        L_0x004f:
            java.lang.Object r9 = r10.get(r5)
            if (r9 == r7) goto L_0x0047
            r7 = r2
        L_0x0056:
            if (r7 == 0) goto L_0x0035
            goto L_0x0073
        L_0x0059:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = dl.a0.f19955a
        L_0x005b:
            boolean r10 = r8.compareAndSet(r5, r7, r9)
            if (r10 == 0) goto L_0x0063
            r8 = r0
            goto L_0x006a
        L_0x0063:
            java.lang.Object r10 = r8.get(r5)
            if (r10 == r7) goto L_0x005b
            r8 = r2
        L_0x006a:
            if (r8 == 0) goto L_0x0035
            al.l r7 = (al.l) r7
            ek.i r5 = ek.i.f20112a
            r7.resumeWith(r5)
        L_0x0073:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x0076:
            monitor-enter(r12)
            int r1 = r12.f20050d     // Catch:{ all -> 0x0089 }
            if (r1 != r13) goto L_0x0080
            int r13 = r13 + r0
            r12.f20050d = r13     // Catch:{ all -> 0x0089 }
            monitor-exit(r12)
            goto L_0x0091
        L_0x0080:
            S[] r13 = r12.f20115a     // Catch:{ all -> 0x0089 }
            ek.i r3 = ek.i.f20112a     // Catch:{ all -> 0x0089 }
            monitor-exit(r12)
            r11 = r1
            r1 = r13
            r13 = r11
            goto L_0x0027
        L_0x0089:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        L_0x008c:
            int r13 = r13 + 2
            r12.f20050d = r13     // Catch:{ all -> 0x0092 }
            monitor-exit(r12)
        L_0x0091:
            return
        L_0x0092:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.z.setValue(java.lang.Object):void");
    }
}
