package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: SidecarAdapter.kt */
public final class o extends k implements l<SidecarDisplayFeature, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final o f3696a = new o();

    public o() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        j.f(sidecarDisplayFeature, "$this$require");
        boolean z10 = true;
        if (!(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2)) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}