package w6;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e  reason: collision with root package name */
    public static final b f16541e = new b();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f16542a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f16543b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f16544c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f16545d = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public interface a {
        void a(boolean z10);
    }

    public static void b(Application application) {
        b bVar = f16541e;
        synchronized (bVar) {
            if (!bVar.f16545d) {
                application.registerActivityLifecycleCallbacks(bVar);
                application.registerComponentCallbacks(bVar);
                bVar.f16545d = true;
            }
        }
    }

    public final void a(a aVar) {
        synchronized (f16541e) {
            this.f16544c.add(aVar);
        }
    }

    public final void c(boolean z10) {
        synchronized (f16541e) {
            Iterator it = this.f16544c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(z10);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f16543b;
        boolean compareAndSet = this.f16542a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f16543b;
        boolean compareAndSet = this.f16542a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f16542a.compareAndSet(false, true)) {
            this.f16543b.set(true);
            c(true);
        }
    }
}
