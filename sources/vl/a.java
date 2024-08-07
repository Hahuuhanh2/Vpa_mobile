package vl;

import io.reactivex.rxjava3.exceptions.CompositeException;
import p3.l0;
import retrofit2.adapter.rxjava3.HttpException;
import rj.d;
import rj.f;
import sj.b;
import ul.y;

/* compiled from: BodyObservable */
public final class a<T> extends d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d<y<T>> f23350a;

    /* renamed from: vl.a$a  reason: collision with other inner class name */
    /* compiled from: BodyObservable */
    public static class C0313a<R> implements f<y<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final f<? super R> f23351a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f23352b;

        public C0313a(f<? super R> fVar) {
            this.f23351a = fVar;
        }

        public final void a() {
            if (!this.f23352b) {
                this.f23351a.a();
            }
        }

        /* renamed from: b */
        public final void d(y<R> yVar) {
            if (yVar.f23246a.i()) {
                this.f23351a.d(yVar.f23247b);
                return;
            }
            this.f23352b = true;
            HttpException httpException = new HttpException(yVar);
            try {
                this.f23351a.onError(httpException);
            } catch (Throwable th2) {
                l0.P0(th2);
                bk.a.a(new CompositeException(httpException, th2));
            }
        }

        public final void c(b bVar) {
            this.f23351a.c(bVar);
        }

        public final void onError(Throwable th2) {
            if (!this.f23352b) {
                this.f23351a.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th2);
            bk.a.a(assertionError);
        }
    }

    public a(d<y<T>> dVar) {
        this.f23350a = dVar;
    }

    public final void e(f<? super T> fVar) {
        this.f23350a.b(new C0313a(fVar));
    }
}
