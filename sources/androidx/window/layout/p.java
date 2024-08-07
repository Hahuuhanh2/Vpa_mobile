package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: SidecarAdapter.kt */
public final class p extends k implements l<SidecarDisplayFeature, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final p f3697a = new p();

    public p() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        boolean z10;
        j.f(sidecarDisplayFeature, "$this$require");
        if (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
