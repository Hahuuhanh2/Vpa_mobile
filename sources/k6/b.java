package k6;

import dk.a;
import g6.e;
import java.util.concurrent.Executor;
import l6.n;
import m6.d;

/* compiled from: DefaultScheduler_Factory */
public final class b implements h6.b<a> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Executor> f12039a;

    /* renamed from: b  reason: collision with root package name */
    public final a<e> f12040b;

    /* renamed from: c  reason: collision with root package name */
    public final a<n> f12041c;

    /* renamed from: d  reason: collision with root package name */
    public final a<d> f12042d;

    /* renamed from: e  reason: collision with root package name */
    public final a<n6.a> f12043e;

    public b(a aVar, a aVar2, e eVar, a aVar3, a aVar4) {
        this.f12039a = aVar;
        this.f12040b = aVar2;
        this.f12041c = eVar;
        this.f12042d = aVar3;
        this.f12043e = aVar4;
    }

    public final Object get() {
        return new a(this.f12039a.get(), this.f12040b.get(), this.f12041c.get(), this.f12042d.get(), this.f12043e.get());
    }
}
