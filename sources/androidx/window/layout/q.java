package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: SidecarAdapter.kt */
public final class q extends k implements l<SidecarDisplayFeature, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final q f3698a = new q();

    public q() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        j.f(sidecarDisplayFeature, "$this$require");
        boolean z10 = true;
        if (!(sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0)) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
