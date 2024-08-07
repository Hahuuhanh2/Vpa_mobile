package dc;

import ca.f;
import ca.s;
import java.util.LinkedHashMap;
import l4.c0;
import lc.a;
import lc.b;
import m4.c;

/* compiled from: ConstructorConstructor */
public final class d implements q, f, c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f8893a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final d f8894b = new d();

    public Object b(c cVar, float f10) {
        boolean z10 = true;
        if (cVar.K() != 1) {
            z10 = false;
        }
        if (z10) {
            cVar.d();
        }
        float z11 = (float) cVar.z();
        float z12 = (float) cVar.z();
        while (cVar.v()) {
            cVar.S();
        }
        if (z10) {
            cVar.i();
        }
        return new o4.c((z11 / 100.0f) * f10, (z12 / 100.0f) * f10);
    }

    public Object k(s sVar) {
        return new b((Object) (a) sVar.a(a.class), 0);
    }

    public Object p() {
        return new LinkedHashMap();
    }
}
