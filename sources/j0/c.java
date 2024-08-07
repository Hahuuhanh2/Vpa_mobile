package j0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import c0.d1;
import v1.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Surface f11452a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f11453b;

    public /* synthetic */ c(Surface surface, SurfaceTexture surfaceTexture) {
        this.f11452a = surface;
        this.f11453b = surfaceTexture;
    }

    public final void accept(Object obj) {
        Surface surface = this.f11452a;
        SurfaceTexture surfaceTexture = this.f11453b;
        d1.c cVar = (d1.c) obj;
        surface.release();
        surfaceTexture.release();
    }
}
