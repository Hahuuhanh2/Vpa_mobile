package q;

import android.hardware.camera2.CameraDevice;
import androidx.profileinstaller.b;
import androidx.profileinstaller.c;
import w.u;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14180a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f14181b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14182c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f14183d;

    public /* synthetic */ e(Object obj, int i10, int i11, Object obj2) {
        this.f14180a = i11;
        this.f14182c = obj;
        this.f14181b = i10;
        this.f14183d = obj2;
    }

    public /* synthetic */ e(u.b bVar, CameraDevice cameraDevice, int i10) {
        this.f14180a = 1;
        this.f14182c = bVar;
        this.f14183d = cameraDevice;
        this.f14181b = i10;
    }

    public final void run() {
        switch (this.f14180a) {
            case 0:
                CharSequence charSequence = (CharSequence) this.f14183d;
                n nVar = ((j) this.f14182c).f14194e0;
                if (nVar.f14225e == null) {
                    nVar.f14225e = new m();
                }
                nVar.f14225e.a(charSequence);
                return;
            case 1:
                int i10 = this.f14181b;
                ((u.b) this.f14182c).f16254a.onError((CameraDevice) this.f14183d, i10);
                return;
            case 2:
                ((b) this.f14182c).f2915c.b(this.f14181b, this.f14183d);
                return;
            default:
                ((c.C0027c) this.f14182c).b(this.f14181b, this.f14183d);
                return;
        }
    }
}
