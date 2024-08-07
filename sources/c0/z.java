package c0;

import androidx.camera.core.impl.l;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.x;
import f0.e0;
import g0.m;
import p0.a;
import p0.e;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class z implements u.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4375a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4376b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v f4377c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f1 f4378d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x f4379e;

    public /* synthetic */ z(f1 f1Var, String str, x xVar, v vVar, int i10) {
        this.f4375a = i10;
        this.f4378d = f1Var;
        this.f4376b = str;
        this.f4379e = xVar;
        this.f4377c = vVar;
    }

    public final void a() {
        switch (this.f4375a) {
            case 0:
                b0 b0Var = (b0) this.f4378d;
                String str = this.f4376b;
                l lVar = (l) this.f4379e;
                v vVar = this.f4377c;
                b0Var.getClass();
                m.a();
                e0 e0Var = b0Var.f4189r;
                if (e0Var != null) {
                    e0Var.a();
                    b0Var.f4189r = null;
                }
                b0Var.f4185n.c();
                if (b0Var.k(str)) {
                    b0Var.B(b0Var.C(str, lVar, vVar).c());
                    b0Var.o();
                    return;
                }
                return;
            default:
                a aVar = (a) this.f4378d;
                String str2 = this.f4376b;
                x xVar = this.f4379e;
                v vVar2 = this.f4377c;
                aVar.C();
                if (aVar.k(str2)) {
                    aVar.B(aVar.D(str2, xVar, vVar2));
                    aVar.o();
                    e eVar = aVar.f13884o;
                    eVar.getClass();
                    m.a();
                    for (f1 d10 : eVar.f13891a) {
                        eVar.d(d10);
                    }
                    return;
                }
                return;
        }
    }
}
