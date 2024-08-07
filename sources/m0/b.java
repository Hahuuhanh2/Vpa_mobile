package m0;

import androidx.camera.core.d;
import java.util.ArrayDeque;
import v.g0;

/* compiled from: ZslRingBuffer */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<d> f13042a = new ArrayDeque<>(3);

    /* renamed from: b  reason: collision with root package name */
    public final Object f13043b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final g0 f13044c;

    public b(g0 g0Var) {
        this.f13044c = g0Var;
    }

    public final void a(d dVar) {
        d dVar2;
        synchronized (this.f13043b) {
            try {
                if (this.f13042a.size() >= 3) {
                    synchronized (this.f13043b) {
                        dVar2 = this.f13042a.removeLast();
                    }
                } else {
                    dVar2 = null;
                }
                this.f13042a.addFirst(dVar);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (this.f13044c != null && dVar2 != null) {
            dVar2.close();
        }
    }
}
