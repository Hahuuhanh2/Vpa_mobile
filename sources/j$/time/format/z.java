package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.o;
import j$.time.temporal.j;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.s;

final class z implements j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChronoLocalDate f18210a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j f18211b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o f18212c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ZoneId f18213d;

    z(ChronoLocalDate chronoLocalDate, j jVar, o oVar, ZoneId zoneId) {
        this.f18210a = chronoLocalDate;
        this.f18211b = jVar;
        this.f18212c = oVar;
        this.f18213d = zoneId;
    }

    public final Object K(p pVar) {
        return pVar == n.e() ? this.f18212c : pVar == n.l() ? this.f18213d : pVar == n.j() ? this.f18211b.K(pVar) : pVar.h(this);
    }

    public final boolean e(j$.time.temporal.o oVar) {
        return (this.f18210a == null || !oVar.isDateBased()) ? this.f18211b.e(oVar) : this.f18210a.e(oVar);
    }

    public final long h(j$.time.temporal.o oVar) {
        return ((this.f18210a == null || !oVar.isDateBased()) ? this.f18211b : this.f18210a).h(oVar);
    }

    public final /* synthetic */ int m(j$.time.temporal.o oVar) {
        return n.a(this, oVar);
    }

    public final s o(j$.time.temporal.o oVar) {
        return ((this.f18210a == null || !oVar.isDateBased()) ? this.f18211b : this.f18210a).o(oVar);
    }
}
