package ul;

import al.k;
import al.l;
import p3.l0;
import retrofit2.HttpException;
import sk.j;

/* compiled from: KotlinExtensions.kt */
public final class m implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f23125a;

    public m(l lVar) {
        this.f23125a = lVar;
    }

    public final void a(b<Object> bVar, y<Object> yVar) {
        j.g(bVar, "call");
        j.g(yVar, "response");
        if (yVar.f23246a.i()) {
            this.f23125a.resumeWith(yVar.f23247b);
        } else {
            this.f23125a.resumeWith(l0.A(new HttpException(yVar)));
        }
    }

    public final void c(b<Object> bVar, Throwable th2) {
        j.g(bVar, "call");
        j.g(th2, "t");
        this.f23125a.resumeWith(l0.A(th2));
    }
}
