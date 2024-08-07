package n0;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import d.h;
import f0.r;
import i0.a;
import i0.f;
import i0.i;
import n0.u;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f13382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u.a f13383b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13384c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Size f13385d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Rect f13386e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f13387f;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ boolean f13388n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ r f13389o;

    public /* synthetic */ t(u uVar, u.a aVar, int i10, Size size, Rect rect, int i11, boolean z10, r rVar) {
        this.f13382a = uVar;
        this.f13383b = aVar;
        this.f13384c = i10;
        this.f13385d = size;
        this.f13386e = rect;
        this.f13387f = i11;
        this.f13388n = z10;
        this.f13389o = rVar;
    }

    public final v8.a apply(Object obj) {
        u uVar = this.f13382a;
        u.a aVar = this.f13383b;
        int i10 = this.f13384c;
        Size size = this.f13385d;
        Rect rect = this.f13386e;
        int i11 = this.f13387f;
        boolean z10 = this.f13388n;
        r rVar = this.f13389o;
        Surface surface = (Surface) obj;
        uVar.getClass();
        surface.getClass();
        try {
            aVar.e();
            v vVar = new v(surface, i10, uVar.f13395f.d(), size, rect, i11, z10, rVar);
            b.d dVar = vVar.f13416q;
            dVar.f17803b.b(new h(aVar, 11), j7.a.x());
            uVar.f13398i = vVar;
            return f.c(vVar);
        } catch (DeferrableSurface.SurfaceClosedException e10) {
            return new i.a(e10);
        }
    }
}
