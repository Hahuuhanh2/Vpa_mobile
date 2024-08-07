package j$.util.stream;

import j$.util.Spliterator;

final class N extends C0428d {

    /* renamed from: j  reason: collision with root package name */
    private final H f18660j;

    N(H h10, C0501v0 v0Var, Spliterator spliterator) {
        super(v0Var, spliterator);
        this.f18660j = h10;
    }

    N(N n10, Spliterator spliterator) {
        super((C0428d) n10, spliterator);
        this.f18660j = n10.f18660j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[LOOP:2: B:21:0x0046->B:24:0x0051, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0020 A[LOOP:0: B:4:0x0020->B:7:0x002b, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r5 = this;
            j$.util.stream.v0 r0 = r5.f18784a
            j$.util.stream.H r1 = r5.f18660j
            j$.util.function.K0 r1 = r1.f18627d
            java.lang.Object r1 = r1.get()
            j$.util.stream.B3 r1 = (j$.util.stream.B3) r1
            j$.util.Spliterator r2 = r5.f18785b
            r0.u1(r2, r1)
            java.lang.Object r0 = r1.get()
            j$.util.stream.H r1 = r5.f18660j
            boolean r1 = r1.f18624a
            r2 = 0
            if (r1 != 0) goto L_0x002e
            if (r0 == 0) goto L_0x002d
            java.util.concurrent.atomic.AtomicReference r1 = r5.f18772h
        L_0x0020:
            boolean r3 = r1.compareAndSet(r2, r0)
            if (r3 == 0) goto L_0x0027
            goto L_0x002d
        L_0x0027:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L_0x0020
        L_0x002d:
            return r2
        L_0x002e:
            if (r0 == 0) goto L_0x0058
            r1 = r5
        L_0x0031:
            if (r1 == 0) goto L_0x0041
            j$.util.stream.f r3 = r1.c()
            if (r3 == 0) goto L_0x003f
            j$.util.stream.f r4 = r3.f18787d
            if (r4 == r1) goto L_0x003f
            r1 = 0
            goto L_0x0042
        L_0x003f:
            r1 = r3
            goto L_0x0031
        L_0x0041:
            r1 = 1
        L_0x0042:
            if (r1 == 0) goto L_0x0054
            java.util.concurrent.atomic.AtomicReference r1 = r5.f18772h
        L_0x0046:
            boolean r3 = r1.compareAndSet(r2, r0)
            if (r3 == 0) goto L_0x004d
            goto L_0x0057
        L_0x004d:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L_0x0046
            goto L_0x0057
        L_0x0054:
            r5.h()
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.N.a():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final C0437f d(Spliterator spliterator) {
        return new N(this, spliterator);
    }

    /* access modifiers changed from: protected */
    public final Object i() {
        return this.f18660j.f18625b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[LOOP:2: B:19:0x0037->B:22:0x0042, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCompletion(java.util.concurrent.CountedCompleter r7) {
        /*
            r6 = this;
            j$.util.stream.H r0 = r6.f18660j
            boolean r0 = r0.f18624a
            if (r0 == 0) goto L_0x0051
            j$.util.stream.f r0 = r6.f18787d
            j$.util.stream.N r0 = (j$.util.stream.N) r0
            r1 = 0
            r2 = r1
        L_0x000c:
            if (r0 == r2) goto L_0x0051
            java.lang.Object r2 = r0.b()
            if (r2 == 0) goto L_0x0049
            j$.util.stream.H r3 = r6.f18660j
            j$.util.function.Predicate r3 = r3.f18626c
            boolean r3 = r3.test(r2)
            if (r3 == 0) goto L_0x0049
            r6.e(r2)
            r0 = r6
        L_0x0022:
            if (r0 == 0) goto L_0x0032
            j$.util.stream.f r3 = r0.c()
            if (r3 == 0) goto L_0x0030
            j$.util.stream.f r4 = r3.f18787d
            if (r4 == r0) goto L_0x0030
            r0 = 0
            goto L_0x0033
        L_0x0030:
            r0 = r3
            goto L_0x0022
        L_0x0032:
            r0 = 1
        L_0x0033:
            if (r0 == 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicReference r0 = r6.f18772h
        L_0x0037:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x003e
            goto L_0x0051
        L_0x003e:
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L_0x0037
            goto L_0x0051
        L_0x0045:
            r6.h()
            goto L_0x0051
        L_0x0049:
            j$.util.stream.f r2 = r6.f18788e
            j$.util.stream.N r2 = (j$.util.stream.N) r2
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x000c
        L_0x0051:
            super.onCompletion(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.N.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
