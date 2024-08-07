package ul;

import al.k;
import al.l;
import p3.l0;
import sk.j;

/* compiled from: KotlinExtensions.kt */
public final class o implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f23127a;

    public o(l lVar) {
        this.f23127a = lVar;
    }

    public final void a(b<Object> bVar, y<Object> yVar) {
        j.g(bVar, "call");
        j.g(yVar, "response");
        this.f23127a.resumeWith(yVar);
    }

    public final void c(b<Object> bVar, Throwable th2) {
        j.g(bVar, "call");
        j.g(th2, "t");
        this.f23127a.resumeWith(l0.A(th2));
    }
}
