package dl;

import al.l;
import el.a;
import el.b;
import ik.d;

/* compiled from: SharedFlow.kt */
public final class x extends b<v<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f20047a = -1;

    /* renamed from: b  reason: collision with root package name */
    public l f20048b;

    public final boolean a(a aVar) {
        v vVar = (v) aVar;
        if (this.f20047a >= 0) {
            return false;
        }
        long j10 = vVar.f20032o;
        if (j10 < vVar.f20033p) {
            vVar.f20033p = j10;
        }
        this.f20047a = j10;
        return true;
    }

    public final d[] b(a aVar) {
        long j10 = this.f20047a;
        this.f20047a = -1;
        this.f20048b = null;
        return ((v) aVar).t(j10);
    }
}
