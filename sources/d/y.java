package d;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import ek.i;
import fk.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import rk.l;
import sk.j;

/* compiled from: OnBackPressedDispatcher.kt */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f8460a;

    /* renamed from: b  reason: collision with root package name */
    public final v1.a<Boolean> f8461b;

    /* renamed from: c  reason: collision with root package name */
    public final g<r> f8462c;

    /* renamed from: d  reason: collision with root package name */
    public r f8463d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedCallback f8464e;

    /* renamed from: f  reason: collision with root package name */
    public OnBackInvokedDispatcher f8465f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8466g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8467h;

    /* compiled from: OnBackPressedDispatcher.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8468a = new a();

        public final OnBackInvokedCallback a(rk.a<i> aVar) {
            j.f(aVar, "onBackInvoked");
            return new x(aVar, 0);
        }

        public final void b(Object obj, int i10, Object obj2) {
            j.f(obj, "dispatcher");
            j.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public final void c(Object obj, Object obj2) {
            j.f(obj, "dispatcher");
            j.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8469a = new b();

        /* compiled from: OnBackPressedDispatcher.kt */
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ l<b, i> f8470a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ l<b, i> f8471b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ rk.a<i> f8472c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ rk.a<i> f8473d;

            public a(l<? super b, i> lVar, l<? super b, i> lVar2, rk.a<i> aVar, rk.a<i> aVar2) {
                this.f8470a = lVar;
                this.f8471b = lVar2;
                this.f8472c = aVar;
                this.f8473d = aVar2;
            }

            public final void onBackCancelled() {
                this.f8473d.invoke();
            }

            public final void onBackInvoked() {
                this.f8472c.invoke();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                j.f(backEvent, "backEvent");
                this.f8471b.invoke(new b(backEvent));
            }

            public final void onBackStarted(BackEvent backEvent) {
                j.f(backEvent, "backEvent");
                this.f8470a.invoke(new b(backEvent));
            }
        }

        public final OnBackInvokedCallback a(l<? super b, i> lVar, l<? super b, i> lVar2, rk.a<i> aVar, rk.a<i> aVar2) {
            j.f(lVar, "onBackStarted");
            j.f(lVar2, "onBackProgressed");
            j.f(aVar, "onBackInvoked");
            j.f(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    public final class c implements n, c {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.lifecycle.i f8474a;

        /* renamed from: b  reason: collision with root package name */
        public final r f8475b;

        /* renamed from: c  reason: collision with root package name */
        public d f8476c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ y f8477d;

        public c(y yVar, androidx.lifecycle.i iVar, r rVar) {
            j.f(rVar, "onBackPressedCallback");
            this.f8477d = yVar;
            this.f8474a = iVar;
            this.f8475b = rVar;
            iVar.a(this);
        }

        public final void cancel() {
            this.f8474a.c(this);
            r rVar = this.f8475b;
            rVar.getClass();
            rVar.f8451b.remove(this);
            d dVar = this.f8476c;
            if (dVar != null) {
                dVar.cancel();
            }
            this.f8476c = null;
        }

        public final void q(r2.l lVar, i.a aVar) {
            if (aVar == i.a.ON_START) {
                y yVar = this.f8477d;
                r rVar = this.f8475b;
                yVar.getClass();
                j.f(rVar, "onBackPressedCallback");
                yVar.f8462c.addLast(rVar);
                d dVar = new d(rVar);
                rVar.f8451b.add(dVar);
                yVar.d();
                rVar.f8452c = new z(yVar);
                this.f8476c = dVar;
            } else if (aVar == i.a.ON_STOP) {
                d dVar2 = this.f8476c;
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else if (aVar == i.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    public final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final r f8478a;

        public d(r rVar) {
            this.f8478a = rVar;
        }

        public final void cancel() {
            y.this.f8462c.remove(this.f8478a);
            if (j.a(y.this.f8463d, this.f8478a)) {
                this.f8478a.getClass();
                y.this.f8463d = null;
            }
            r rVar = this.f8478a;
            rVar.getClass();
            rVar.f8451b.remove(this);
            rk.a<ek.i> aVar = this.f8478a.f8452c;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f8478a.f8452c = null;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    public /* synthetic */ class e extends sk.i implements rk.a<ek.i> {
        public e(y yVar) {
            super(0, (Object) yVar, y.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V");
        }

        public final Object invoke() {
            ((y) this.f22917b).d();
            return ek.i.f20112a;
        }
    }

    public y(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f8460a = runnable;
        this.f8461b = null;
        this.f8462c = new g<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                onBackInvokedCallback = b.f8469a.a(new s(this), new t(this), new u(this), new v(this));
            } else {
                onBackInvokedCallback = a.f8468a.a(new w(this));
            }
            this.f8464e = onBackInvokedCallback;
        }
    }

    public final void a(r2.l lVar, r rVar) {
        j.f(lVar, "owner");
        j.f(rVar, "onBackPressedCallback");
        o B = lVar.B();
        if (B.f2785d != i.b.DESTROYED) {
            rVar.f8451b.add(new c(this, B, rVar));
            d();
            rVar.f8452c = new e(this);
        }
    }

    public final void b() {
        r rVar;
        g<r> gVar = this.f8462c;
        ListIterator<r> listIterator = gVar.listIterator(gVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                rVar = null;
                break;
            }
            rVar = listIterator.previous();
            if (rVar.f8450a) {
                break;
            }
        }
        r rVar2 = rVar;
        this.f8463d = null;
        if (rVar2 != null) {
            rVar2.a();
            return;
        }
        Runnable runnable = this.f8460a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f8465f;
        OnBackInvokedCallback onBackInvokedCallback = this.f8464e;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z10 && !this.f8466g) {
                a.f8468a.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f8466g = true;
            } else if (!z10 && this.f8466g) {
                a.f8468a.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f8466g = false;
            }
        }
    }

    public final void d() {
        boolean z10 = this.f8467h;
        g<r> gVar = this.f8462c;
        boolean z11 = false;
        if (!(gVar instanceof Collection) || !gVar.isEmpty()) {
            Iterator<T> it = gVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((r) it.next()).f8450a) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f8467h = z11;
        if (z11 != z10) {
            v1.a<Boolean> aVar = this.f8461b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                c(z11);
            }
        }
    }

    public y() {
        this((Runnable) null);
    }
}
