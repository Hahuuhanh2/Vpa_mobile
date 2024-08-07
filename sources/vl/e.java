package vl;

import io.reactivex.rxjava3.exceptions.CompositeException;
import p3.l0;
import rj.d;
import rj.f;
import sj.b;
import ul.y;

/* compiled from: ResultObservable */
public final class e<T> extends d<d> {

    /* renamed from: a  reason: collision with root package name */
    public final d<y<T>> f23364a;

    /* compiled from: ResultObservable */
    public static class a<R> implements f<y<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final f<? super d> f23365a;

        public a(f<? super d> fVar) {
            this.f23365a = fVar;
        }

        public final void a() {
            this.f23365a.a();
        }

        public final void c(b bVar) {
            this.f23365a.c(bVar);
        }

        public final void d(Object obj) {
            y yVar = (y) obj;
            f<? super d> fVar = this.f23365a;
            if (yVar != null) {
                fVar.d(new d(0, yVar, (Object) null));
                return;
            }
            throw new NullPointerException("response == null");
        }

        public final void onError(Throwable th2) {
            try {
                f<? super d> fVar = this.f23365a;
                if (th2 != null) {
                    fVar.d(new d(0, (Object) null, th2));
                    this.f23365a.a();
                    return;
                }
                throw new NullPointerException("error == null");
            } catch (Throwable th3) {
                l0.P0(th3);
                bk.a.a(new CompositeException(th, th3));
            }
        }
    }

    public e(d<y<T>> dVar) {
        this.f23364a = dVar;
    }

    public final void e(f<? super d> fVar) {
        this.f23364a.b(new a(fVar));
    }
}
