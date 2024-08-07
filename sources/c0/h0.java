package c0;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.v;
import c0.t0;
import e0.i0;
import e0.x;
import java.util.Objects;
import v8.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h0 implements u.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4277a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4278b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v f4279c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f1 f4280d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f4281e;

    public /* synthetic */ h0(f1 f1Var, String str, Object obj, v vVar, int i10) {
        this.f4277a = i10;
        this.f4280d = f1Var;
        this.f4278b = str;
        this.f4281e = obj;
        this.f4279c = vVar;
    }

    public final void a() {
        switch (this.f4277a) {
            case 0:
                j0 j0Var = (j0) this.f4280d;
                String str = this.f4278b;
                m mVar = (m) this.f4281e;
                v vVar = this.f4279c;
                if (j0Var.k(str)) {
                    e0.h0 h0Var = j0Var.f4296t;
                    h0Var.getClass();
                    g0.m.a();
                    h0Var.f9010f = true;
                    x xVar = h0Var.f9008d;
                    if (xVar != null) {
                        g0.m.a();
                        if (!xVar.f9062d.isDone()) {
                            ImageCaptureException imageCaptureException = new ImageCaptureException("The request is aborted silently and retried.", (Throwable) null);
                            g0.m.a();
                            xVar.f9065g = true;
                            a<Void> aVar = xVar.f9066h;
                            Objects.requireNonNull(aVar);
                            aVar.cancel(true);
                            xVar.f9063e.b(imageCaptureException);
                            xVar.f9064f.a(null);
                            i0.a aVar2 = xVar.f9060b;
                            i0 i0Var = xVar.f9059a;
                            e0.h0 h0Var2 = (e0.h0) aVar2;
                            h0Var2.getClass();
                            g0.m.a();
                            p0.a("TakePictureManager");
                            h0Var2.f9005a.addFirst(i0Var);
                            h0Var2.c();
                        }
                    }
                    j0Var.C(true);
                    u.b D = j0Var.D(str, mVar, vVar);
                    j0Var.f4294r = D;
                    j0Var.B(D.c());
                    j0Var.o();
                    e0.h0 h0Var3 = j0Var.f4296t;
                    h0Var3.getClass();
                    g0.m.a();
                    h0Var3.f9010f = false;
                    h0Var3.c();
                    return;
                }
                j0Var.C(false);
                return;
            default:
                t0 t0Var = (t0) this.f4280d;
                String str2 = this.f4278b;
                s sVar = (s) this.f4281e;
                v vVar2 = this.f4279c;
                t0.b bVar = t0.f4334t;
                if (t0Var.k(str2)) {
                    t0Var.B(t0Var.D(str2, sVar, vVar2).c());
                    t0Var.o();
                    return;
                }
                return;
        }
    }
}
