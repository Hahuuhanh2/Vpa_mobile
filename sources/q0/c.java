package q0;

import al.g0;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.i;
import androidx.lifecycle.q;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import r2.k;
import r2.l;

/* compiled from: LifecycleCameraRepository */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14269a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f14270b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f14271c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<l> f14272d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public d0.a f14273e;

    /* compiled from: LifecycleCameraRepository */
    public static abstract class a {
        public abstract CameraUseCaseAdapter.a a();

        public abstract l b();
    }

    /* compiled from: LifecycleCameraRepository */
    public static class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public final c f14274a;

        /* renamed from: b  reason: collision with root package name */
        public final l f14275b;

        public b(l lVar, c cVar) {
            this.f14275b = lVar;
            this.f14274a = cVar;
        }

        @q(i.a.ON_DESTROY)
        public void onDestroy(l lVar) {
            c cVar = this.f14274a;
            synchronized (cVar.f14269a) {
                b b10 = cVar.b(lVar);
                if (b10 != null) {
                    cVar.f(lVar);
                    for (a remove : (Set) cVar.f14271c.get(b10)) {
                        cVar.f14270b.remove(remove);
                    }
                    cVar.f14271c.remove(b10);
                    b10.f14275b.B().c(b10);
                }
            }
        }

        @q(i.a.ON_START)
        public void onStart(l lVar) {
            this.f14274a.e(lVar);
        }

        @q(i.a.ON_STOP)
        public void onStop(l lVar) {
            this.f14274a.f(lVar);
        }
    }

    public final void a(b bVar, List list, List list2, d0.a aVar) {
        boolean z10;
        l lVar;
        synchronized (this.f14269a) {
            boolean z11 = true;
            if (!list2.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.z(z10);
            this.f14273e = aVar;
            synchronized (bVar.f14265a) {
                lVar = bVar.f14266b;
            }
            Set<a> set = (Set) this.f14271c.get(b(lVar));
            d0.a aVar2 = this.f14273e;
            if (aVar2 == null || ((a0.a) aVar2).f8e != 2) {
                for (a aVar3 : set) {
                    b bVar2 = (b) this.f14270b.get(aVar3);
                    bVar2.getClass();
                    if (!bVar2.equals(bVar)) {
                        if (!bVar2.d().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
            }
            try {
                CameraUseCaseAdapter cameraUseCaseAdapter = bVar.f14267c;
                synchronized (cameraUseCaseAdapter.f1443r) {
                    cameraUseCaseAdapter.f1440o = null;
                }
                CameraUseCaseAdapter cameraUseCaseAdapter2 = bVar.f14267c;
                synchronized (cameraUseCaseAdapter2.f1443r) {
                    cameraUseCaseAdapter2.f1441p = list;
                }
                bVar.b(list2);
                if (lVar.B().f2785d.compareTo(i.b.STARTED) < 0) {
                    z11 = false;
                }
                if (z11) {
                    e(lVar);
                }
            } catch (CameraUseCaseAdapter.CameraException e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
    }

    public final b b(l lVar) {
        synchronized (this.f14269a) {
            for (b bVar : this.f14271c.keySet()) {
                if (lVar.equals(bVar.f14275b)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    public final boolean c(l lVar) {
        synchronized (this.f14269a) {
            b b10 = b(lVar);
            if (b10 == null) {
                return false;
            }
            for (a aVar : (Set) this.f14271c.get(b10)) {
                b bVar = (b) this.f14270b.get(aVar);
                bVar.getClass();
                if (!bVar.d().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void d(b bVar) {
        l lVar;
        Set set;
        synchronized (this.f14269a) {
            synchronized (bVar.f14265a) {
                lVar = bVar.f14266b;
            }
            a aVar = new a(lVar, bVar.f14267c.f1436d);
            b b10 = b(lVar);
            if (b10 != null) {
                set = (Set) this.f14271c.get(b10);
            } else {
                set = new HashSet();
            }
            set.add(aVar);
            this.f14270b.put(aVar, bVar);
            if (b10 == null) {
                b bVar2 = new b(lVar, this);
                this.f14271c.put(bVar2, set);
                lVar.B().a(bVar2);
            }
        }
    }

    public final void e(l lVar) {
        synchronized (this.f14269a) {
            if (c(lVar)) {
                if (this.f14272d.isEmpty()) {
                    this.f14272d.push(lVar);
                } else {
                    d0.a aVar = this.f14273e;
                    if (aVar == null || ((a0.a) aVar).f8e != 2) {
                        l peek = this.f14272d.peek();
                        if (!lVar.equals(peek)) {
                            g(peek);
                            this.f14272d.remove(lVar);
                            this.f14272d.push(lVar);
                        }
                    }
                }
                h(lVar);
            }
        }
    }

    public final void f(l lVar) {
        synchronized (this.f14269a) {
            this.f14272d.remove(lVar);
            g(lVar);
            if (!this.f14272d.isEmpty()) {
                h(this.f14272d.peek());
            }
        }
    }

    public final void g(l lVar) {
        synchronized (this.f14269a) {
            b b10 = b(lVar);
            if (b10 != null) {
                for (a aVar : (Set) this.f14271c.get(b10)) {
                    b bVar = (b) this.f14270b.get(aVar);
                    bVar.getClass();
                    synchronized (bVar.f14265a) {
                        if (!bVar.f14268d) {
                            bVar.onStop(bVar.f14266b);
                            bVar.f14268d = true;
                        }
                    }
                }
            }
        }
    }

    public final void h(l lVar) {
        synchronized (this.f14269a) {
            for (a aVar : (Set) this.f14271c.get(b(lVar))) {
                b bVar = (b) this.f14270b.get(aVar);
                bVar.getClass();
                if (!bVar.d().isEmpty()) {
                    bVar.o();
                }
            }
        }
    }
}
