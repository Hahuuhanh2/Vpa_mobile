package wj;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import p3.l0;
import rj.f;
import sj.b;
import tj.a;
import vj.a;

/* compiled from: LambdaObserver */
public final class c<T> extends AtomicReference<b> implements f<T>, b {

    /* renamed from: a  reason: collision with root package name */
    public final tj.b<? super T> f23435a;

    /* renamed from: b  reason: collision with root package name */
    public final tj.b<? super Throwable> f23436b;

    /* renamed from: c  reason: collision with root package name */
    public final a f23437c;

    /* renamed from: d  reason: collision with root package name */
    public final tj.b<? super b> f23438d;

    public c(tj.b bVar) {
        a.c cVar = vj.a.f23327c;
        a.C0312a aVar = vj.a.f23325a;
        a.b bVar2 = vj.a.f23326b;
        this.f23435a = bVar;
        this.f23436b = cVar;
        this.f23437c = aVar;
        this.f23438d = bVar2;
    }

    public final void a() {
        boolean z10;
        Object obj = get();
        uj.a aVar = uj.a.f23082a;
        if (obj == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            lazySet(aVar);
            try {
                this.f23437c.run();
            } catch (Throwable th2) {
                l0.P0(th2);
                bk.a.a(th2);
            }
        }
    }

    public final void b() {
        uj.a.c(this);
    }

    public final void c(b bVar) {
        if (uj.a.i(this, bVar)) {
            try {
                this.f23438d.accept(this);
            } catch (Throwable th2) {
                l0.P0(th2);
                bVar.b();
                onError(th2);
            }
        }
    }

    public final void d(T t10) {
        boolean z10;
        if (get() == uj.a.f23082a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            try {
                this.f23435a.accept(t10);
            } catch (Throwable th2) {
                l0.P0(th2);
                ((b) get()).b();
                onError(th2);
            }
        }
    }

    public final void onError(Throwable th2) {
        boolean z10;
        Object obj = get();
        uj.a aVar = uj.a.f23082a;
        if (obj == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            lazySet(aVar);
            try {
                this.f23436b.accept(th2);
            } catch (Throwable th3) {
                l0.P0(th3);
                bk.a.a(new CompositeException(th2, th3));
            }
        } else {
            bk.a.a(th2);
        }
    }
}
