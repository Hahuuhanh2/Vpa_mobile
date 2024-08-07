package f6;

import dk.a;
import h6.b;
import l6.j;
import l6.l;
import m6.e;
import m6.o;
import m6.s;
import o6.b;
import o6.c;

/* compiled from: TransportRuntime_Factory */
public final class y implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10034a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10035b;

    /* renamed from: c  reason: collision with root package name */
    public final a f10036c;

    /* renamed from: d  reason: collision with root package name */
    public final a f10037d;

    /* renamed from: e  reason: collision with root package name */
    public final a f10038e;

    /* renamed from: f  reason: collision with root package name */
    public final a f10039f;

    public /* synthetic */ y(b bVar, a aVar, a aVar2, int i10) {
        o6.b bVar2 = b.a.f13758a;
        c cVar = c.a.f13759a;
        this.f10034a = i10;
        this.f10035b = bVar2;
        this.f10036c = cVar;
        this.f10037d = bVar;
        this.f10038e = aVar;
        this.f10039f = aVar2;
    }

    public final Object get() {
        switch (this.f10034a) {
            case 0:
                return new w((o6.a) this.f10035b.get(), (o6.a) this.f10036c.get(), (k6.c) this.f10037d.get(), (j) this.f10038e.get(), (l) this.f10039f.get());
            default:
                Object obj = this.f10037d.get();
                return new o((o6.a) this.f10035b.get(), (o6.a) this.f10036c.get(), (e) obj, (s) this.f10038e.get(), this.f10039f);
        }
    }
}
