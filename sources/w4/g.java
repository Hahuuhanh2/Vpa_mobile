package w4;

import o5.i;
import s4.e;
import u4.m;
import u4.u;
import w4.h;

/* compiled from: LruResourceCache */
public final class g extends i<e, u<?>> implements h {

    /* renamed from: d  reason: collision with root package name */
    public h.a f16473d;

    public g(long j10) {
        super(j10);
    }

    public final int b(Object obj) {
        u uVar = (u) obj;
        if (uVar == null) {
            return 1;
        }
        return uVar.g();
    }

    public final void c(Object obj, Object obj2) {
        e eVar = (e) obj;
        u uVar = (u) obj2;
        h.a aVar = this.f16473d;
        if (aVar != null && uVar != null) {
            ((m) aVar).f15181e.a(uVar, true);
        }
    }
}
