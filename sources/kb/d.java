package kb;

import ab.c;
import com.google.firebase.perf.session.SessionManager;
import dk.a;

/* compiled from: FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory */
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12457a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12458b;

    public /* synthetic */ d(a aVar, int i10) {
        this.f12457a = i10;
        this.f12458b = aVar;
    }

    public final Object get() {
        switch (this.f12457a) {
            case 0:
                c cVar = this.f12458b.f12450b;
                j7.a.s(cVar);
                return cVar;
            default:
                this.f12458b.getClass();
                SessionManager instance = SessionManager.getInstance();
                j7.a.s(instance);
                return instance;
        }
    }
}
