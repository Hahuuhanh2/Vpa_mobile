package ll;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SegmentPool.kt */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final x f20925a = new x(new byte[0], 0, 0, false, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f20926b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<x>[] f20927c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f20926b = highestOneBit;
        AtomicReference<x>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f20927c = atomicReferenceArr;
    }

    public static final void a(x xVar) {
        boolean z10;
        AtomicReference<x> atomicReference;
        x xVar2;
        x andSet;
        int i10;
        if (xVar.f20923f == null && xVar.f20924g == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!xVar.f20921d && (andSet = atomicReference.getAndSet(xVar2)) != (xVar2 = f20925a)) {
            if (andSet != null) {
                i10 = andSet.f20920c;
            } else {
                i10 = 0;
            }
            if (i10 >= 65536) {
                atomicReference.set(andSet);
                return;
            }
            xVar.f20923f = andSet;
            xVar.f20919b = 0;
            xVar.f20920c = i10 + 8192;
            (atomicReference = f20927c[(int) (Thread.currentThread().getId() & (((long) f20926b) - 1))]).set(xVar);
        }
    }

    public static final x b() {
        AtomicReference<x> atomicReference = f20927c[(int) (Thread.currentThread().getId() & (((long) f20926b) - 1))];
        x xVar = f20925a;
        x andSet = atomicReference.getAndSet(xVar);
        if (andSet == xVar) {
            return new x();
        }
        if (andSet == null) {
            atomicReference.set((Object) null);
            return new x();
        }
        atomicReference.set(andSet.f20923f);
        andSet.f20923f = null;
        andSet.f20920c = 0;
        return andSet;
    }
}
