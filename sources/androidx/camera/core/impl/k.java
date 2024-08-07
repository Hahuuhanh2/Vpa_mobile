package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.impl.u;
import java.util.List;
import v8.a;

/* compiled from: ForwardingCameraControl */
public class k implements CameraControlInternal {

    /* renamed from: b  reason: collision with root package name */
    public final CameraControlInternal f1378b;

    public k(CameraControlInternal cameraControlInternal) {
        this.f1378b = cameraControlInternal;
    }

    public final void a(i iVar) {
        this.f1378b.a(iVar);
    }

    public final Rect b() {
        return this.f1378b.b();
    }

    public final void c(int i10) {
        this.f1378b.c(i10);
    }

    public final void d(u.b bVar) {
        this.f1378b.d(bVar);
    }

    public a e(int i10, int i11, List list) {
        return this.f1378b.e(i10, i11, list);
    }

    public a<Void> f(boolean z10) {
        return this.f1378b.f(z10);
    }

    public final i g() {
        return this.f1378b.g();
    }

    public final void h() {
        this.f1378b.h();
    }
}
