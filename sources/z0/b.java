package z0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import z0.a;

/* compiled from: CallbackToFutureAdapter */
public final class b {

    /* compiled from: CallbackToFutureAdapter */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public Object f17798a;

        /* renamed from: b  reason: collision with root package name */
        public d<T> f17799b;

        /* renamed from: c  reason: collision with root package name */
        public c<Void> f17800c = new c<>();

        /* renamed from: d  reason: collision with root package name */
        public boolean f17801d;

        public final boolean a(T t10) {
            boolean z10 = true;
            this.f17801d = true;
            d<T> dVar = this.f17799b;
            if (dVar == null || !dVar.f17803b.p(t10)) {
                z10 = false;
            }
            if (z10) {
                this.f17798a = null;
                this.f17799b = null;
                this.f17800c = null;
            }
            return z10;
        }

        public final boolean b(Throwable th2) {
            boolean z10 = true;
            this.f17801d = true;
            d<T> dVar = this.f17799b;
            if (dVar == null || !dVar.f17803b.q(th2)) {
                z10 = false;
            }
            if (z10) {
                this.f17798a = null;
                this.f17799b = null;
                this.f17800c = null;
            }
            return z10;
        }

        public final void finalize() {
            c<Void> cVar;
            d<T> dVar = this.f17799b;
            if (dVar != null && !dVar.isDone()) {
                StringBuilder q10 = android.support.v4.media.a.q("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                q10.append(this.f17798a);
                dVar.f17803b.q(new C0243b(q10.toString()));
            }
            if (!this.f17801d && (cVar = this.f17800c) != null) {
                cVar.p(null);
            }
        }
    }

    /* renamed from: z0.b$b  reason: collision with other inner class name */
    /* compiled from: CallbackToFutureAdapter */
    public static final class C0243b extends Throwable {
        public C0243b(String str) {
            super(str);
        }

        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: CallbackToFutureAdapter */
    public interface c<T> {
        String e(a aVar);
    }

    /* compiled from: CallbackToFutureAdapter */
    public static final class d<T> implements v8.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<a<T>> f17802a;

        /* renamed from: b  reason: collision with root package name */
        public final a f17803b = new a();

        /* compiled from: CallbackToFutureAdapter */
        public class a extends a<T> {
            public a() {
            }

            public final String n() {
                a aVar = d.this.f17802a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                StringBuilder q10 = android.support.v4.media.a.q("tag=[");
                q10.append(aVar.f17798a);
                q10.append("]");
                return q10.toString();
            }
        }

        public d(a<T> aVar) {
            this.f17802a = new WeakReference<>(aVar);
        }

        public final void b(Runnable runnable, Executor executor) {
            this.f17803b.b(runnable, executor);
        }

        public final boolean cancel(boolean z10) {
            a aVar = this.f17802a.get();
            boolean cancel = this.f17803b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.f17798a = null;
                aVar.f17799b = null;
                aVar.f17800c.p(null);
            }
            return cancel;
        }

        public final T get() {
            return this.f17803b.get();
        }

        public final boolean isCancelled() {
            return this.f17803b.f17778a instanceof a.b;
        }

        public final boolean isDone() {
            return this.f17803b.isDone();
        }

        public final String toString() {
            return this.f17803b.toString();
        }

        public final T get(long j10, TimeUnit timeUnit) {
            return this.f17803b.get(j10, timeUnit);
        }
    }

    public static d a(c cVar) {
        a aVar = new a();
        d<T> dVar = new d<>(aVar);
        aVar.f17799b = dVar;
        aVar.f17798a = cVar.getClass();
        try {
            String e10 = cVar.e(aVar);
            if (e10 != null) {
                aVar.f17798a = e10;
            }
        } catch (Exception e11) {
            dVar.f17803b.q(e11);
        }
        return dVar;
    }
}
