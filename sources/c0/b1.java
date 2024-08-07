package c0;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import v8.a;

/* compiled from: SurfaceRequest */
public final class b1 extends DeferrableSurface {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ d1 f4192o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1(d1 d1Var, Size size) {
        super(34, size);
        this.f4192o = d1Var;
    }

    public final a<Surface> g() {
        return this.f4192o.f4216d;
    }
}
