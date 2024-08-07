package vl;

import io.reactivex.rxjava3.exceptions.CompositeException;
import p3.l0;
import rj.d;
import rj.f;
import ul.b;
import ul.q;
import ul.y;

/* compiled from: CallExecuteObservable */
public final class c<T> extends d<y<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final b<T> f23358a;

    /* compiled from: CallExecuteObservable */
    public static final class a implements sj.b {

        /* renamed from: a  reason: collision with root package name */
        public final b<?> f23359a;

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f23360b;

        public a(b<?> bVar) {
            this.f23359a = bVar;
        }

        public final void b() {
            this.f23360b = true;
            this.f23359a.cancel();
        }
    }

    public c(q qVar) {
        this.f23358a = qVar;
    }

    public final void e(f<? super y<T>> fVar) {
        boolean z10;
        b<T> clone = this.f23358a.clone();
        a aVar = new a(clone);
        fVar.c(aVar);
        if (!aVar.f23360b) {
            try {
                y<T> d10 = clone.d();
                if (!aVar.f23360b) {
                    fVar.d(d10);
                }
                if (!aVar.f23360b) {
                    try {
                        fVar.a();
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
                l0.P0(th);
                if (z10) {
                    bk.a.a(th);
                } else if (!aVar.f23360b) {
                    try {
                        fVar.onError(th);
                    } catch (Throwable th4) {
                        l0.P0(th4);
                        bk.a.a(new CompositeException(th, th4));
                    }
                }
            }
        }
    }
}
