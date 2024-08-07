package kb;

import com.google.firebase.perf.config.RemoteConfigManager;
import dk.a;
import m9.d;

/* compiled from: FirebasePerformanceModule_ProvidesFirebaseAppFactory */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12455a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12456b;

    public /* synthetic */ c(a aVar, int i10) {
        this.f12455a = i10;
        this.f12456b = aVar;
    }

    public final Object get() {
        switch (this.f12455a) {
            case 0:
                d dVar = this.f12456b.f12449a;
                j7.a.s(dVar);
                return dVar;
            default:
                this.f12456b.getClass();
                RemoteConfigManager instance = RemoteConfigManager.getInstance();
                j7.a.s(instance);
                return instance;
        }
    }
}
