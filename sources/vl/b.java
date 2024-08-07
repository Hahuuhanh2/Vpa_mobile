package vl;

import io.reactivex.rxjava3.exceptions.CompositeException;
import p3.l0;
import rj.d;
import rj.f;
import ul.q;
import ul.y;

/* compiled from: CallEnqueueObservable */
public final class b<T> extends d<y<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final ul.b<T> f23353a;

    /* compiled from: CallEnqueueObservable */
    public static final class a<T> implements sj.b, ul.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final ul.b<?> f23354a;

        /* renamed from: b  reason: collision with root package name */
        public final f<? super y<T>> f23355b;

        /* renamed from: c  reason: collision with root package name */
        public volatile boolean f23356c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f23357d = false;

        public a(ul.b<?> bVar, f<? super y<T>> fVar) {
            this.f23354a = bVar;
            this.f23355b = fVar;
        }

        public final void a(ul.b<T> bVar, y<T> yVar) {
            if (!this.f23356c) {
                try {
                    this.f23355b.d(yVar);
                    if (!this.f23356c) {
                        this.f23357d = true;
                        this.f23355b.a();
                    }
                } catch (Throwable th2) {
                    l0.P0(th2);
                    bk.a.a(new CompositeException(th, th2));
                }
            }
        }

        public final void b() {
            this.f23356c = true;
            this.f23354a.cancel();
        }

        public final void c(ul.b<T> bVar, Throwable th2) {
            if (!bVar.h()) {
                try {
                    this.f23355b.onError(th2);
                } catch (Throwable th3) {
                    l0.P0(th3);
                    bk.a.a(new CompositeException(th2, th3));
                }
            }
        }
    }

    public b(q qVar) {
        this.f23353a = qVar;
    }

    public final void e(f<? super y<T>> fVar) {
        ul.b<T> clone = this.f23353a.clone();
        a aVar = new a(clone, fVar);
        fVar.c(aVar);
        if (!aVar.f23356c) {
            clone.k0(aVar);
        }
    }
}
