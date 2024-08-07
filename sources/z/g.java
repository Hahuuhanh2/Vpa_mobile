package z;

import androidx.camera.core.impl.DeferrableSurface;
import c0.p0;
import java.util.List;
import y.e0;
import y.i;
import y.z;

/* compiled from: ForceCloseDeferrableSurface */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17748a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17749b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17750c;

    public g(d dVar, d dVar2) {
        this.f17748a = dVar2.a(e0.class);
        this.f17749b = dVar.a(z.class);
        this.f17750c = dVar.a(i.class);
    }

    public final void a(List<DeferrableSurface> list) {
        boolean z10;
        if (this.f17748a || this.f17749b || this.f17750c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && list != null) {
            for (DeferrableSurface a10 : list) {
                a10.a();
            }
            p0.a("ForceCloseDeferrableSurface");
        }
    }
}
