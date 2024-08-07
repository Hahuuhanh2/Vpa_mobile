package v;

import android.hardware.camera2.CameraDevice;
import i0.c;
import w.a;

/* compiled from: Camera2CameraImpl */
public final class t implements c<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a1 f15837a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f15838b;

    public t(u uVar, a1 a1Var) {
        this.f15838b = uVar;
        this.f15837a = a1Var;
    }

    public final void a(Throwable th2) {
    }

    public final void onSuccess(Object obj) {
        CameraDevice cameraDevice;
        Void voidR = (Void) obj;
        this.f15838b.f15876u.remove(this.f15837a);
        int g2 = v.g(this.f15838b.f15867e);
        if (g2 != 5) {
            if (g2 != 6) {
                if (g2 != 7) {
                    return;
                }
            } else if (this.f15838b.f15874s == 0) {
                return;
            }
        }
        if (this.f15838b.x() && (cameraDevice = this.f15838b.f15873r) != null) {
            a.a(cameraDevice);
            this.f15838b.f15873r = null;
        }
    }
}
