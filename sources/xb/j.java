package xb;

import c0.q0;
import c6.a;
import c6.d;
import c6.g;
import za.b;

/* compiled from: EventGDTLogger.kt */
public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final b<g> f17217a;

    public j(b<g> bVar) {
        this.f17217a = bVar;
    }

    public final void a(r rVar) {
        sk.j.f(rVar, "sessionEvent");
        this.f17217a.get().a("FIREBASE_APPQUALITY_SESSION", new c6.b("json"), new q0(this, 16)).a(new a(rVar, d.DEFAULT));
    }
}
