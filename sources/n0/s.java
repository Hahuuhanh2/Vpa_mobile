package n0;

import androidx.camera.core.impl.DeferrableSurface;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13380a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DeferrableSurface f13381b;

    public /* synthetic */ s(DeferrableSurface deferrableSurface, int i10) {
        this.f13380a = i10;
        this.f13381b = deferrableSurface;
    }

    public final void run() {
        switch (this.f13380a) {
            case 0:
                this.f13381b.a();
                return;
            default:
                this.f13381b.b();
                return;
        }
    }
}
