package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.i;
import r2.l;
import sk.j;

/* compiled from: ServiceLifecycleDispatcher.kt */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final o f2740a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2741b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public a f2742c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final o f2743a;

        /* renamed from: b  reason: collision with root package name */
        public final i.a f2744b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2745c;

        public a(o oVar, i.a aVar) {
            j.f(oVar, "registry");
            j.f(aVar, "event");
            this.f2743a = oVar;
            this.f2744b = aVar;
        }

        public final void run() {
            if (!this.f2745c) {
                this.f2743a.f(this.f2744b);
                this.f2745c = true;
            }
        }
    }

    public b0(l lVar) {
        j.f(lVar, "provider");
        this.f2740a = new o(lVar);
    }

    public final void a(i.a aVar) {
        a aVar2 = this.f2742c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f2740a, aVar);
        this.f2742c = aVar3;
        this.f2741b.postAtFrontOfQueue(aVar3);
    }
}
