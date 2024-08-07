package v;

import androidx.camera.core.impl.DeferrableSurface;
import c0.p0;
import i0.a;
import i0.f;
import i0.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v1 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x1 f15902a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f15903b;

    public /* synthetic */ v1(x1 x1Var, ArrayList arrayList) {
        this.f15902a = x1Var;
        this.f15903b = arrayList;
    }

    public final v8.a apply(Object obj) {
        x1 x1Var = this.f15902a;
        List list = this.f15903b;
        List list2 = (List) obj;
        x1Var.getClass();
        x1Var.toString();
        p0.a("SyncCaptureSessionBase");
        if (list2.contains((Object) null)) {
            return new i.a(new DeferrableSurface.SurfaceClosedException((DeferrableSurface) list.get(list2.indexOf((Object) null)), "Surface closed"));
        }
        if (list2.isEmpty()) {
            return new i.a(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return f.c(list2);
    }
}
