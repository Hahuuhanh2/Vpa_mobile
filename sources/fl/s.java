package fl;

import al.t1;
import fl.s;
import ik.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: ConcurrentLinkedList.kt */
public abstract class s<S extends s<S>> extends c<S> implements t1 {

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20260d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers");

    /* renamed from: c  reason: collision with root package name */
    public final long f20261c;
    private volatile int cleanedAndPointers;

    public s(long j10, S s10, int i10) {
        super(s10);
        this.f20261c = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    public final boolean c() {
        boolean z10;
        if (f20260d.get(this) == f()) {
            if (b() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        boolean z10;
        if (f20260d.addAndGet(this, -65536) == f()) {
            if (b() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i10, f fVar);

    public final void h() {
        if (f20260d.incrementAndGet(this) == f()) {
            d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f20260d
        L_0x0002:
            int r1 = r0.get(r5)
            int r2 = r5.f()
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x001c
            fl.c r2 = r5.b()
            if (r2 != 0) goto L_0x0016
            r2 = r3
            goto L_0x0017
        L_0x0016:
            r2 = r4
        L_0x0017:
            if (r2 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = r4
            goto L_0x001d
        L_0x001c:
            r2 = r3
        L_0x001d:
            if (r2 != 0) goto L_0x0021
            r3 = r4
            goto L_0x002a
        L_0x0021:
            r2 = 65536(0x10000, float:9.18355E-41)
            int r2 = r2 + r1
            boolean r1 = r0.compareAndSet(r5, r1, r2)
            if (r1 == 0) goto L_0x0002
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.s.i():boolean");
    }
}
