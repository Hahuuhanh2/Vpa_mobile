package i1;

import android.app.Application;
import i1.e;

/* compiled from: ActivityRecreator */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Application f10928a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.a f10929b;

    public c(Application application, e.a aVar) {
        this.f10928a = application;
        this.f10929b = aVar;
    }

    public final void run() {
        this.f10928a.unregisterActivityLifecycleCallbacks(this.f10929b);
    }
}
