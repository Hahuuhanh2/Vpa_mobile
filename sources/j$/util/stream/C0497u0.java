package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.u0  reason: case insensitive filesystem */
final class C0497u0 extends C0428d {

    /* renamed from: j  reason: collision with root package name */
    private final C0493t0 f18904j;

    C0497u0(C0493t0 t0Var, C0501v0 v0Var, Spliterator spliterator) {
        super(v0Var, spliterator);
        this.f18904j = t0Var;
    }

    C0497u0(C0497u0 u0Var, Spliterator spliterator) {
        super((C0428d) u0Var, spliterator);
        this.f18904j = u0Var.f18904j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0026 A[LOOP:0: B:5:0x0026->B:8:0x0031, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r4 = this;
            j$.util.stream.v0 r0 = r4.f18784a
            j$.util.stream.t0 r1 = r4.f18904j
            j$.util.function.K0 r1 = r1.f18896b
            java.lang.Object r1 = r1.get()
            j$.util.stream.r0 r1 = (j$.util.stream.C0485r0) r1
            j$.util.Spliterator r2 = r4.f18785b
            r0.u1(r2, r1)
            boolean r0 = r1.f18883b
            j$.util.stream.t0 r1 = r4.f18904j
            j$.util.stream.s0 r1 = r1.f18895a
            boolean r1 = r1.f18890b
            r2 = 0
            if (r0 != r1) goto L_0x0033
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x0033
            java.util.concurrent.atomic.AtomicReference r1 = r4.f18772h
        L_0x0026:
            boolean r3 = r1.compareAndSet(r2, r0)
            if (r3 == 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L_0x0026
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C0497u0.a():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final C0437f d(Spliterator spliterator) {
        return new C0497u0(this, spliterator);
    }

    /* access modifiers changed from: protected */
    public final Object i() {
        return Boolean.valueOf(!this.f18904j.f18895a.f18890b);
    }
}
