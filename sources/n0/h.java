package n0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import c0.d1;
import v1.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f13332a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f13333b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Surface f13334c;

    public /* synthetic */ h(j jVar, SurfaceTexture surfaceTexture, Surface surface) {
        this.f13332a = jVar;
        this.f13333b = surfaceTexture;
        this.f13334c = surface;
    }

    public final void accept(Object obj) {
        j jVar = this.f13332a;
        SurfaceTexture surfaceTexture = this.f13333b;
        Surface surface = this.f13334c;
        d1.c cVar = (d1.c) obj;
        jVar.getClass();
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        surface.release();
        jVar.f13346i--;
        jVar.e();
    }
}
