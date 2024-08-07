package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

abstract class w3 {

    /* renamed from: a  reason: collision with root package name */
    protected final Spliterator f18929a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f18930b;

    /* renamed from: c  reason: collision with root package name */
    private final long f18931c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f18932d;

    w3(Spliterator spliterator, long j10, long j11) {
        this.f18929a = spliterator;
        long j12 = 0;
        int i10 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
        this.f18930b = i10 < 0;
        this.f18931c = i10 >= 0 ? j11 : j12;
        this.f18932d = new AtomicLong(i10 >= 0 ? j10 + j11 : j10);
    }

    w3(Spliterator spliterator, w3 w3Var) {
        this.f18929a = spliterator;
        this.f18930b = w3Var.f18930b;
        this.f18932d = w3Var.f18932d;
        this.f18931c = w3Var.f18931c;
    }

    public final int characteristics() {
        return this.f18929a.characteristics() & -16465;
    }

    public final long estimateSize() {
        return this.f18929a.estimateSize();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long q(long r10) {
        /*
            r9 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicLong r0 = r9.f18932d
            long r0 = r0.get()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0013
            boolean r0 = r9.f18930b
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r10 = r2
        L_0x0012:
            return r10
        L_0x0013:
            long r4 = java.lang.Math.min(r0, r10)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0025
            java.util.concurrent.atomic.AtomicLong r6 = r9.f18932d
            long r7 = r0 - r4
            boolean r6 = r6.compareAndSet(r0, r7)
            if (r6 == 0) goto L_0x0000
        L_0x0025:
            boolean r6 = r9.f18930b
            if (r6 == 0) goto L_0x002f
            long r10 = r10 - r4
            long r10 = java.lang.Math.max(r10, r2)
            return r10
        L_0x002f:
            long r10 = r9.f18931c
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x003c
            long r0 = r0 - r10
            long r4 = r4 - r0
            long r10 = java.lang.Math.max(r4, r2)
            return r10
        L_0x003c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.w3.q(long):long");
    }

    /* access modifiers changed from: protected */
    public abstract Spliterator r(Spliterator spliterator);

    /* access modifiers changed from: protected */
    public final int s() {
        if (this.f18932d.get() > 0) {
            return 2;
        }
        return this.f18930b ? 3 : 1;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.f18932d.get() == 0 || (trySplit = this.f18929a.trySplit()) == null) {
            return null;
        }
        return r(trySplit);
    }
}
