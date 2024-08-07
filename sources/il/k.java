package il;

import android.support.v4.media.a;
import fl.s;
import ik.f;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: Semaphore.kt */
public final class k extends s<k> {

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReferenceArray f20681e = new AtomicReferenceArray(j.f20680f);

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
    }

    public final int f() {
        return j.f20680f;
    }

    public final void g(int i10, f fVar) {
        this.f20681e.set(i10, j.f20679e);
        h();
    }

    public final String toString() {
        StringBuilder q10 = a.q("SemaphoreSegment[id=");
        q10.append(this.f20261c);
        q10.append(", hashCode=");
        q10.append(hashCode());
        q10.append(']');
        return q10.toString();
    }
}
