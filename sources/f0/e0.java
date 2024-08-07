package f0;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import i0.f;
import v8.a;

/* compiled from: ImmediateSurface */
public final class e0 extends DeferrableSurface {

    /* renamed from: o  reason: collision with root package name */
    public final Surface f9531o;

    public e0(Surface surface, Size size, int i10) {
        super(i10, size);
        this.f9531o = surface;
    }

    public final a<Surface> g() {
        return f.c(this.f9531o);
    }

    public e0(Surface surface) {
        this.f9531o = surface;
    }
}
