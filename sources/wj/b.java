package wj;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import p3.l0;
import rj.f;
import tj.a;

/* compiled from: DisposableLambdaObserver */
public final class b<T> implements f<T>, sj.b {

    /* renamed from: a  reason: collision with root package name */
    public final f<? super T> f23431a;

    /* renamed from: b  reason: collision with root package name */
    public final tj.b<? super sj.b> f23432b;

    /* renamed from: c  reason: collision with root package name */
    public final a f23433c;

    /* renamed from: d  reason: collision with root package name */
    public sj.b f23434d;

    public b(f<? super T> fVar, tj.b<? super sj.b> bVar, a aVar) {
        this.f23431a = fVar;
        this.f23432b = bVar;
        this.f23433c = aVar;
    }

    public final void a() {
        sj.b bVar = this.f23434d;
        uj.a aVar = uj.a.f23082a;
        if (bVar != aVar) {
            this.f23434d = aVar;
            this.f23431a.a();
        }
    }

    public final void b() {
        sj.b bVar = this.f23434d;
        uj.a aVar = uj.a.f23082a;
        if (bVar != aVar) {
            this.f23434d = aVar;
            try {
                this.f23433c.run();
            } catch (Throwable th2) {
                l0.P0(th2);
                bk.a.a(th2);
            }
            bVar.b();
        }
    }

    public final void c(sj.b bVar) {
        try {
            this.f23432b.accept(bVar);
            sj.b bVar2 = this.f23434d;
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
                this.f23434d = bVar;
                this.f23431a.c(this);
            }
        } catch (Throwable th2) {
            l0.P0(th2);
            bVar.b();
            this.f23434d = uj.a.f23082a;
            f<? super T> fVar = this.f23431a;
            fVar.c(uj.b.INSTANCE);
            fVar.onError(th2);
        }
    }

    public final void d(T t10) {
        this.f23431a.d(t10);
    }

    public final void onError(Throwable th2) {
        sj.b bVar = this.f23434d;
        uj.a aVar = uj.a.f23082a;
        if (bVar != aVar) {
            this.f23434d = aVar;
            this.f23431a.onError(th2);
            return;
        }
        bk.a.a(th2);
    }
}
