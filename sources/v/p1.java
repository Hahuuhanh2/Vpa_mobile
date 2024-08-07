package v;

import androidx.camera.core.impl.j;
import c0.p0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r1 f15800b;

    public /* synthetic */ p1(r1 r1Var, int i10) {
        this.f15799a = i10;
        this.f15800b = r1Var;
    }

    public final void run() {
        switch (this.f15799a) {
            case 0:
                r1 r1Var = this.f15800b;
                r1Var.getClass();
                p0.a("ProcessingCaptureSession");
                r1Var.f15817a.d();
                return;
            default:
                j.a(this.f15800b.f15821e);
                return;
        }
    }
}
