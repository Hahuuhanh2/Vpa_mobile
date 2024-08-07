package kb;

import c6.g;
import dk.a;
import vb.h;

/* compiled from: FirebasePerformanceModule_ProvidesConfigResolverFactory */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12453a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12454b;

    public /* synthetic */ b(a aVar, int i10) {
        this.f12453a = i10;
        this.f12454b = aVar;
    }

    public final za.b a() {
        switch (this.f12453a) {
            case 1:
                za.b<h> bVar = this.f12454b.f12451c;
                j7.a.s(bVar);
                return bVar;
            default:
                za.b<g> bVar2 = this.f12454b.f12452d;
                j7.a.s(bVar2);
                return bVar2;
        }
    }

    public final Object get() {
        switch (this.f12453a) {
            case 0:
                this.f12454b.getClass();
                jb.a e10 = jb.a.e();
                j7.a.s(e10);
                return e10;
            case 1:
                return a();
            default:
                return a();
        }
    }
}
