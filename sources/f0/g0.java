package f0;

import f0.j0;
import f0.r;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.p;
import r2.q;

/* compiled from: LiveDataObservable */
public final class g0<T> implements j0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final p<b<T>> f9533a = new p<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f9534b = new HashMap();

    /* compiled from: LiveDataObservable */
    public static final class a<T> implements q<b<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicBoolean f9535a = new AtomicBoolean(true);

        /* renamed from: b  reason: collision with root package name */
        public final j0.a<? super T> f9536b;

        /* renamed from: c  reason: collision with root package name */
        public final Executor f9537c;

        public a(Executor executor, androidx.camera.view.a aVar) {
            this.f9537c = executor;
            this.f9536b = aVar;
        }

        public final void b(Object obj) {
            this.f9537c.execute(new androidx.appcompat.app.p(15, this, (b) obj));
        }
    }

    /* compiled from: LiveDataObservable */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f9538a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f9539b = null;

        public b(r.a aVar) {
            this.f9538a = aVar;
        }

        public final String toString() {
            boolean z10;
            String str;
            StringBuilder q10 = android.support.v4.media.a.q("[Result: <");
            if (this.f9539b == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                StringBuilder q11 = android.support.v4.media.a.q("Value: ");
                q11.append(this.f9538a);
                str = q11.toString();
            } else {
                StringBuilder q12 = android.support.v4.media.a.q("Error: ");
                q12.append(this.f9539b);
                str = q12.toString();
            }
            return android.support.v4.media.a.o(q10, str, ">]");
        }
    }
}
