package v;

import androidx.camera.core.impl.c;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.x;
import u.a;
import z.h;

/* compiled from: ImageCaptureOptionUnpacker */
public final class l1 extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final l1 f15734c = new l1(new h());

    /* renamed from: b  reason: collision with root package name */
    public final h f15735b;

    public l1(h hVar) {
        this.f15735b = hVar;
    }

    public final void a(x<?> xVar, g.a aVar) {
        super.a(xVar, aVar);
        if (xVar instanceof m) {
            m mVar = (m) xVar;
            a.C0199a aVar2 = new a.C0199a();
            c cVar = m.F;
            if (((r) mVar.b()).c(cVar)) {
                h hVar = this.f15735b;
                int intValue = ((Integer) ((r) mVar.b()).a(cVar)).intValue();
                hVar.getClass();
                h.a(intValue, aVar2);
            }
            aVar.c(new a(r.K(aVar2.f15025a)));
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
