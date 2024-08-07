package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: SidecarAdapter.kt */
public final class r extends k implements l<SidecarDisplayFeature, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final r f3699a = new r();

    public r() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        boolean z10;
        j.f(sidecarDisplayFeature, "$this$require");
        if (sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
