package e0;

import al.g0;
import android.content.Intent;
import androidx.camera.view.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import c0.d1;
import c0.p0;
import g0.m;
import i0.f;
import v1.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8989a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8990b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.f8989a = i10;
        this.f8990b = obj;
    }

    public final void accept(Object obj) {
        boolean z10;
        boolean z11 = false;
        switch (this.f8989a) {
            case 0:
                e0 e0Var = (e0) this.f8990b;
                w wVar = (w) obj;
                e0Var.getClass();
                m.a();
                if (wVar.f9057g.size() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g0.E("Cannot handle multi-image capture.", z10);
                if (e0Var.f8996a == null) {
                    z11 = true;
                }
                g0.E("Already has an existing request.", z11);
                e0Var.f8996a = wVar;
                v8.a<Void> aVar = wVar.f9058h;
                aVar.b(new f.b(aVar, new d0(e0Var, wVar)), j7.a.x());
                return;
            case 1:
                c.a aVar2 = (c.a) this.f8990b;
                d1.c cVar = (d1.c) obj;
                p0.a("SurfaceViewImpl");
                if (aVar2 != null) {
                    ((r0.f) aVar2).a();
                    return;
                }
                return;
            case 2:
                Intent intent = (Intent) obj;
                ((FragmentActivity) this.f8990b).B.a();
                return;
            default:
                FragmentManager fragmentManager = (FragmentManager) this.f8990b;
                Integer num = (Integer) obj;
                if (fragmentManager.L() && num.intValue() == 80) {
                    fragmentManager.l(false);
                    return;
                }
                return;
        }
    }
}
