package androidx.lifecycle;

import al.g0;
import androidx.lifecycle.i;
import ik.f;
import java.util.concurrent.CancellationException;
import r2.j;

/* compiled from: Lifecycle.kt */
public final class l extends j implements n {

    /* renamed from: a  reason: collision with root package name */
    public final i f2780a;

    /* renamed from: b  reason: collision with root package name */
    public final f f2781b;

    public l(i iVar, f fVar) {
        sk.j.f(fVar, "coroutineContext");
        this.f2780a = iVar;
        this.f2781b = fVar;
        if (iVar.b() == i.b.DESTROYED) {
            g0.x(fVar, (CancellationException) null);
        }
    }

    public final i a() {
        return this.f2780a;
    }

    public final void q(r2.l lVar, i.a aVar) {
        if (this.f2780a.b().compareTo(i.b.DESTROYED) <= 0) {
            this.f2780a.c(this);
            g0.x(this.f2781b, (CancellationException) null);
        }
    }

    public final f s() {
        return this.f2781b;
    }
}
