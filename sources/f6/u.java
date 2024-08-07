package f6;

import c6.b;
import c6.c;
import c6.e;
import c6.f;
import f6.h;
import java.util.HashMap;
import kh.h;

/* compiled from: TransportImpl */
public final class u<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final s f10024a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10025b;

    /* renamed from: c  reason: collision with root package name */
    public final b f10026c;

    /* renamed from: d  reason: collision with root package name */
    public final e<T, byte[]> f10027d;

    /* renamed from: e  reason: collision with root package name */
    public final v f10028e;

    public u(s sVar, String str, b bVar, e<T, byte[]> eVar, v vVar) {
        this.f10024a = sVar;
        this.f10025b = str;
        this.f10026c = bVar;
        this.f10027d = eVar;
        this.f10028e = vVar;
    }

    public final void a(c<T> cVar) {
        b(cVar, new h(6));
    }

    public final void b(c<T> cVar, c6.h hVar) {
        v vVar = this.f10028e;
        s sVar = this.f10024a;
        if (sVar == null) {
            throw new NullPointerException("Null transportContext");
        } else if (cVar != null) {
            String str = this.f10025b;
            if (str != null) {
                e<T, byte[]> eVar = this.f10027d;
                if (eVar != null) {
                    b bVar = this.f10026c;
                    if (bVar != null) {
                        i iVar = new i(sVar, str, cVar, eVar, bVar);
                        w wVar = (w) vVar;
                        k6.c cVar2 = wVar.f10032c;
                        j e10 = iVar.f9997a.e(iVar.f9999c.c());
                        h.a aVar = new h.a();
                        aVar.f9996f = new HashMap();
                        aVar.f9994d = Long.valueOf(wVar.f10030a.a());
                        aVar.f9995e = Long.valueOf(wVar.f10031b.a());
                        aVar.d(iVar.f9998b);
                        aVar.c(new m(iVar.f10001e, iVar.f10000d.apply(iVar.f9999c.b())));
                        aVar.f9992b = iVar.f9999c.a();
                        cVar2.a(hVar, aVar.b(), e10);
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        } else {
            throw new NullPointerException("Null event");
        }
    }
}
