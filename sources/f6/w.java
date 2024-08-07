package f6;

import android.content.Context;
import c6.b;
import d.h;
import f6.j;
import java.util.Collections;
import java.util.Set;
import k6.c;
import l6.j;
import l6.l;
import o6.a;

/* compiled from: TransportRuntime */
public final class w implements v {

    /* renamed from: e  reason: collision with root package name */
    public static volatile k f10029e;

    /* renamed from: a  reason: collision with root package name */
    public final a f10030a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10031b;

    /* renamed from: c  reason: collision with root package name */
    public final c f10032c;

    /* renamed from: d  reason: collision with root package name */
    public final j f10033d;

    public w(a aVar, a aVar2, c cVar, j jVar, l lVar) {
        this.f10030a = aVar;
        this.f10031b = aVar2;
        this.f10032c = cVar;
        this.f10033d = jVar;
        lVar.f12761a.execute(new h(lVar, 20));
    }

    public static w a() {
        k kVar = f10029e;
        if (kVar != null) {
            return kVar.f10014n.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f10029e == null) {
            synchronized (w.class) {
                if (f10029e == null) {
                    context.getClass();
                    Class<Context> cls = Context.class;
                    f10029e = new k(context);
                }
            }
        }
    }

    public final t c(d6.a aVar) {
        Set<T> set;
        if (aVar instanceof l) {
            aVar.getClass();
            set = Collections.unmodifiableSet(d6.a.f8751d);
        } else {
            set = Collections.singleton(new b("proto"));
        }
        j.a a10 = s.a();
        aVar.getClass();
        a10.b("cct");
        a10.f10006b = aVar.b();
        return new t(set, a10.a(), this);
    }
}
