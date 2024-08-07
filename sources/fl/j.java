package fl;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
public class j<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20245a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur");
    private volatile Object _cur = new k(8, false);

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d A[LOOP:1: B:8:0x001d->B:11:0x0028, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(E r6) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f20245a
        L_0x0002:
            java.lang.Object r1 = r0.get(r5)
            fl.k r1 = (fl.k) r1
            int r2 = r1.a(r6)
            r3 = 1
            if (r2 == 0) goto L_0x002b
            if (r2 == r3) goto L_0x0017
            r1 = 2
            if (r2 == r1) goto L_0x0015
            goto L_0x0002
        L_0x0015:
            r6 = 0
            return r6
        L_0x0017:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f20245a
            fl.k r4 = r1.c()
        L_0x001d:
            boolean r3 = r2.compareAndSet(r5, r1, r4)
            if (r3 == 0) goto L_0x0024
            goto L_0x0002
        L_0x0024:
            java.lang.Object r3 = r2.get(r5)
            if (r3 == r1) goto L_0x001d
            goto L_0x0002
        L_0x002b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.j.a(java.lang.Object):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015 A[LOOP:1: B:5:0x0015->B:8:0x0020, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f20245a
        L_0x0002:
            java.lang.Object r1 = r0.get(r5)
            fl.k r1 = (fl.k) r1
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x000f
            return
        L_0x000f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f20245a
            fl.k r3 = r1.c()
        L_0x0015:
            boolean r4 = r2.compareAndSet(r5, r1, r3)
            if (r4 == 0) goto L_0x001c
            goto L_0x0002
        L_0x001c:
            java.lang.Object r4 = r2.get(r5)
            if (r4 == r1) goto L_0x0015
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.j.b():void");
    }

    public final int c() {
        k kVar = (k) f20245a.get(this);
        kVar.getClass();
        long j10 = k.f20247f.get(kVar);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017 A[LOOP:1: B:5:0x0017->B:8:0x0022, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final E d() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f20245a
        L_0x0002:
            java.lang.Object r1 = r0.get(r5)
            fl.k r1 = (fl.k) r1
            java.lang.Object r2 = r1.d()
            u9.b r3 = fl.k.f20248g
            if (r2 == r3) goto L_0x0011
            return r2
        L_0x0011:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f20245a
            fl.k r3 = r1.c()
        L_0x0017:
            boolean r4 = r2.compareAndSet(r5, r1, r3)
            if (r4 == 0) goto L_0x001e
            goto L_0x0002
        L_0x001e:
            java.lang.Object r4 = r2.get(r5)
            if (r4 == r1) goto L_0x0017
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.j.d():java.lang.Object");
    }
}
