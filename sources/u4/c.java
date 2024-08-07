package u4;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s4.e;
import u4.q;

/* compiled from: ActiveResources */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15094a = false;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f15095b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<q<?>> f15096c = new ReferenceQueue<>();

    /* renamed from: d  reason: collision with root package name */
    public q.a f15097d;

    /* compiled from: ActiveResources */
    public static final class a extends WeakReference<q<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final e f15098a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15099b;

        /* renamed from: c  reason: collision with root package name */
        public u<?> f15100c;

        public a(e eVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z10) {
            super(qVar, referenceQueue);
            u<Z> uVar;
            j7.a.r(eVar);
            this.f15098a = eVar;
            if (!qVar.f15236a || !z10) {
                uVar = null;
            } else {
                uVar = qVar.f15238c;
                j7.a.r(uVar);
            }
            this.f15100c = uVar;
            this.f15099b = qVar.f15236a;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a());
        newSingleThreadExecutor.execute(new b(this));
    }

    public final synchronized void a(e eVar, q<?> qVar) {
        a aVar = (a) this.f15095b.put(eVar, new a(eVar, qVar, this.f15096c, this.f15094a));
        if (aVar != null) {
            aVar.f15100c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        synchronized (this) {
            this.f15095b.remove(aVar.f15098a);
            if (aVar.f15099b) {
                u<?> uVar = aVar.f15100c;
                if (uVar != null) {
                    this.f15097d.a(aVar.f15098a, new q(uVar, true, false, aVar.f15098a, this.f15097d));
                }
            }
        }
    }
}
