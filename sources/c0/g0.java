package c0;

import androidx.camera.core.b;
import androidx.camera.core.c;
import androidx.camera.core.d;
import androidx.camera.core.f;
import d.h;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g0 implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4269a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4270b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.f4269a = i10;
        this.f4270b = obj;
    }

    public final void a(d dVar) {
        b.a aVar;
        switch (this.f4269a) {
            case 0:
                c cVar = ((c.b) this.f4270b).f1286d.get();
                if (cVar != null) {
                    cVar.A.execute(new h(cVar, 7));
                    return;
                }
                return;
            default:
                f fVar = (f) this.f4270b;
                synchronized (fVar.f1301a) {
                    int i10 = fVar.f1302b - 1;
                    fVar.f1302b = i10;
                    if (fVar.f1303c && i10 == 0) {
                        fVar.close();
                    }
                    aVar = fVar.f1306f;
                }
                if (aVar != null) {
                    aVar.a(dVar);
                    return;
                }
                return;
        }
    }
}
