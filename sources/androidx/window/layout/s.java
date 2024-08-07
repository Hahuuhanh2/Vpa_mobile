package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import androidx.window.layout.SidecarCompat;
import sk.j;

/* compiled from: SidecarCompat.kt */
public final class s implements ComponentCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SidecarCompat f3700a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f3701b;

    public s(SidecarCompat sidecarCompat, Activity activity) {
        this.f3700a = sidecarCompat;
        this.f3701b = activity;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        j.f(configuration, "newConfig");
        SidecarCompat sidecarCompat = this.f3700a;
        SidecarCompat.b bVar = sidecarCompat.f3655e;
        if (bVar != null) {
            Activity activity = this.f3701b;
            bVar.a(activity, sidecarCompat.h(activity));
        }
    }

    public final void onLowMemory() {
    }
}
