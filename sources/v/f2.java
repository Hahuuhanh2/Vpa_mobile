package v;

import androidx.camera.core.CameraControl;
import g0.m;
import h0.g;
import java.util.concurrent.Executor;
import r2.p;
import w.t;
import z.e;
import z0.b;

/* compiled from: TorchControl */
public final class f2 {

    /* renamed from: a  reason: collision with root package name */
    public final o f15676a;

    /* renamed from: b  reason: collision with root package name */
    public final p<Integer> f15677b = new p<>(0);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15678c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f15679d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15680e;

    /* renamed from: f  reason: collision with root package name */
    public b.a<Void> f15681f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15682g;

    public f2(o oVar, t tVar, g gVar) {
        this.f15676a = oVar;
        this.f15679d = gVar;
        this.f15678c = e.a(new b0(tVar, 1));
        oVar.i(new d2(this));
    }

    public static void b(p pVar, Integer num) {
        if (m.b()) {
            pVar.j(num);
        } else {
            pVar.k(num);
        }
    }

    public final void a(b.a<Void> aVar, boolean z10) {
        if (!this.f15678c) {
            if (aVar != null) {
                aVar.b(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f15680e) {
            b(this.f15677b, 0);
            if (aVar != null) {
                aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
            }
        } else {
            this.f15682g = z10;
            this.f15676a.k(z10);
            b(this.f15677b, Integer.valueOf(z10 ? 1 : 0));
            b.a<Void> aVar2 = this.f15681f;
            if (aVar2 != null) {
                aVar2.b(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.f15681f = aVar;
        }
    }
}
