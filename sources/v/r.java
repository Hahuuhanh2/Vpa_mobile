package v;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.w;
import androidx.camera.core.impl.x;
import androidx.camera.view.c;
import androidx.camera.view.f;
import c0.d1;
import c0.p0;
import i0.m;
import java.util.ArrayList;
import java.util.Arrays;
import v8.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15810a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15811b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15812c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f15813d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f15814e;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15810a = i10;
        this.f15811b = obj;
        this.f15812c = obj2;
        this.f15813d = obj3;
        this.f15814e = obj4;
    }

    public final void run() {
        switch (this.f15810a) {
            case 0:
                u uVar = (u) this.f15811b;
                String str = (String) this.f15812c;
                u uVar2 = (u) this.f15813d;
                x xVar = (x) this.f15814e;
                uVar.getClass();
                uVar.s("Use case " + str + " ACTIVE");
                w wVar = uVar.f15863a;
                w.a aVar = (w.a) wVar.f1410a.get(str);
                if (aVar == null) {
                    aVar = new w.a(uVar2, xVar);
                    wVar.f1410a.put(str, aVar);
                }
                aVar.f1414d = true;
                uVar.f15863a.f(str, uVar2, xVar);
                uVar.K();
                return;
            case 1:
                u uVar3 = (u) this.f15811b;
                y0 y0Var = (y0) this.f15812c;
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f15813d;
                uVar3.f15880y.remove(y0Var);
                a B = uVar3.B(y0Var);
                deferrableSurface.a();
                new m(new ArrayList(Arrays.asList(new a[]{B, deferrableSurface.d()})), false, j7.a.x()).b((Runnable) this.f15814e, j7.a.x());
                return;
            default:
                f fVar = (f) this.f15811b;
                Surface surface = (Surface) this.f15812c;
                a aVar2 = (a) this.f15813d;
                d1 d1Var = (d1) this.f15814e;
                fVar.getClass();
                p0.a("TextureViewImpl");
                c.a aVar3 = fVar.f1519l;
                if (aVar3 != null) {
                    ((r0.f) aVar3).a();
                    fVar.f1519l = null;
                }
                surface.release();
                if (fVar.f1514g == aVar2) {
                    fVar.f1514g = null;
                }
                if (fVar.f1515h == d1Var) {
                    fVar.f1515h = null;
                    return;
                }
                return;
        }
    }
}
