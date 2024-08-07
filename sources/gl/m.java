package gl;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: WorkQueue.kt */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20498b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20499c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20500d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20501e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<g> f20502a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        Class<m> cls = m.class;
        f20498b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f20499c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f20500d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f20501e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final g a(g gVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20499c;
        if (atomicIntegerFieldUpdater.get(this) - f20500d.get(this) == 127) {
            return gVar;
        }
        boolean z10 = true;
        if (gVar.f20486b.c() != 1) {
            z10 = false;
        }
        if (z10) {
            f20501e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & 127;
        while (this.f20502a.get(i10) != null) {
            Thread.yield();
        }
        this.f20502a.lazySet(i10, gVar);
        f20499c.incrementAndGet(this);
        return null;
    }

    public final g b() {
        g andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20500d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f20499c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f20502a.getAndSet(i11, (Object) null)) != null) {
                boolean z10 = true;
                if (andSet.f20486b.c() != 1) {
                    z10 = false;
                }
                if (z10) {
                    f20501e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final g c(int i10, boolean z10) {
        boolean z11;
        int i11 = i10 & 127;
        g gVar = this.f20502a.get(i11);
        if (gVar != null) {
            boolean z12 = false;
            if (gVar.f20486b.c() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 == z10) {
                AtomicReferenceArray<g> atomicReferenceArray = this.f20502a;
                while (true) {
                    if (!atomicReferenceArray.compareAndSet(i11, gVar, (Object) null)) {
                        if (atomicReferenceArray.get(i11) != gVar) {
                            break;
                        }
                    } else {
                        z12 = true;
                        break;
                    }
                }
                if (z12) {
                    if (z10) {
                        f20501e.decrementAndGet(this);
                    }
                    return gVar;
                }
            }
        }
        return null;
    }
}
