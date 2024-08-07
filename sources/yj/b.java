package yj;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import p3.l0;
import rj.d;
import rj.f;

/* compiled from: ObservableDoFinally */
public final class b<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    public final tj.a f23573b;

    /* compiled from: ObservableDoFinally */
    public static final class a<T> extends wj.a<T> implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final f<? super T> f23574a;

        /* renamed from: b  reason: collision with root package name */
        public final tj.a f23575b;

        /* renamed from: c  reason: collision with root package name */
        public sj.b f23576c;

        /* renamed from: d  reason: collision with root package name */
        public ak.a<T> f23577d;

        public a(f<? super T> fVar, tj.a aVar) {
            this.f23574a = fVar;
            this.f23575b = aVar;
        }

        public final void a() {
            this.f23574a.a();
            e();
        }

        public final void b() {
            this.f23576c.b();
            e();
        }

        public final void c(sj.b bVar) {
            sj.b bVar2 = this.f23576c;
            boolean z10 = false;
            if (bVar == null) {
                bk.a.a(new NullPointerException("next is null"));
            } else if (bVar2 != null) {
                bVar.b();
                bk.a.a(new ProtocolViolationException());
            } else {
                z10 = true;
            }
            if (z10) {
                this.f23576c = bVar;
                if (bVar instanceof ak.a) {
                    this.f23577d = (ak.a) bVar;
                }
                this.f23574a.c(this);
            }
        }

        public final void d(T t10) {
            this.f23574a.d(t10);
        }

        public final void e() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f23575b.run();
                } catch (Throwable th2) {
                    l0.P0(th2);
                    bk.a.a(th2);
                }
            }
        }

        public final void onError(Throwable th2) {
            this.f23574a.onError(th2);
            e();
        }
    }

    public b(c cVar, r0.f fVar) {
        super(cVar);
        this.f23573b = fVar;
    }

    public final void e(f<? super T> fVar) {
        ((d) this.f23572a).b(new a(fVar, this.f23573b));
    }
}
