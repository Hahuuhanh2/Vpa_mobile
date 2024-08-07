package ol;

import java.io.Serializable;
import nl.e;
import nl.g;
import ol.a;
import p3.l0;
import rl.b;
import rl.d;
import rl.j;
import rl.k;

/* compiled from: ChronoLocalDateTimeImpl */
public final class c<D extends a> extends b<D> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final D f22632a;

    /* renamed from: b  reason: collision with root package name */
    public final g f22633b;

    public c(D d10, g gVar) {
        l0.y0(d10, "date");
        l0.y0(gVar, "time");
        this.f22632a = d10;
        this.f22633b = gVar;
    }

    /* renamed from: A */
    public final c<D> u(long j10, j jVar) {
        long j11 = j10;
        j jVar2 = jVar;
        if (!(jVar2 instanceof b)) {
            return this.f22632a.t().j(jVar2.b(this, j11));
        }
        switch (((b) jVar2).ordinal()) {
            case 0:
                return B(this.f22632a, 0, 0, 0, j10);
            case 1:
                c E = E(this.f22632a.j(j11 / 86400000000L, b.DAYS), this.f22633b);
                return E.B(E.f22632a, 0, 0, 0, (j11 % 86400000000L) * 1000);
            case 2:
                c E2 = E(this.f22632a.j(j11 / 86400000, b.DAYS), this.f22633b);
                return E2.B(E2.f22632a, 0, 0, 0, (j11 % 86400000) * 1000000);
            case 3:
                return B(this.f22632a, 0, 0, j10, 0);
            case 4:
                return B(this.f22632a, 0, j10, 0, 0);
            case 5:
                return B(this.f22632a, j10, 0, 0, 0);
            case 6:
                c E3 = E(this.f22632a.j(j11 / 256, b.DAYS), this.f22633b);
                return E3.B(E3.f22632a, (j11 % 256) * 12, 0, 0, 0);
            default:
                return E(this.f22632a.j(j11, jVar2), this.f22633b);
        }
    }

    public final c<D> B(D d10, long j10, long j11, long j12, long j13) {
        g gVar;
        D d11 = d10;
        if ((j10 | j11 | j12 | j13) == 0) {
            return E(d11, this.f22633b);
        }
        long j14 = j11 / 1440;
        long j15 = j10 / 24;
        long j16 = (j11 % 1440) * 60000000000L;
        long j17 = ((j10 % 24) * 3600000000000L) + j16 + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long D = this.f22633b.D();
        long j18 = j17 + D;
        long T = l0.T(j18, 86400000000000L) + j15 + j14 + (j12 / 86400) + (j13 / 86400000000000L);
        long j19 = ((j18 % 86400000000000L) + 86400000000000L) % 86400000000000L;
        if (j19 == D) {
            gVar = this.f22633b;
        } else {
            gVar = g.w(j19);
        }
        return E(d11.j(T, b.DAYS), gVar);
    }

    /* renamed from: C */
    public final c y(long j10, rl.g gVar) {
        if (!(gVar instanceof rl.a)) {
            return this.f22632a.t().j(gVar.i(this, j10));
        }
        if (gVar.isTimeBased()) {
            return E(this.f22632a, this.f22633b.b(j10, gVar));
        }
        return E(this.f22632a.b(j10, gVar), this.f22633b);
    }

    /* renamed from: D */
    public final c z(e eVar) {
        return E(eVar, this.f22633b);
    }

    public final c<D> E(d dVar, g gVar) {
        D d10 = this.f22632a;
        if (d10 == dVar && this.f22633b == gVar) {
            return this;
        }
        return new c<>(d10.t().i(dVar), gVar);
    }

    public final long c(rl.g gVar) {
        if (!(gVar instanceof rl.a)) {
            return gVar.j(this);
        }
        if (gVar.isTimeBased()) {
            return this.f22633b.c(gVar);
        }
        return ((e) this.f22632a).c(gVar);
    }

    public final int k(rl.g gVar) {
        if (!(gVar instanceof rl.a)) {
            return m(gVar).a(c(gVar), gVar);
        }
        if (gVar.isTimeBased()) {
            return this.f22633b.k(gVar);
        }
        return this.f22632a.k(gVar);
    }

    public final k m(rl.g gVar) {
        if (!(gVar instanceof rl.a)) {
            return gVar.b(this);
        }
        if (gVar.isTimeBased()) {
            return this.f22633b.m(gVar);
        }
        return this.f22632a.m(gVar);
    }

    public final boolean n(rl.g gVar) {
        if (gVar instanceof rl.a) {
            if (gVar.isDateBased() || gVar.isTimeBased()) {
                return true;
            }
            return false;
        } else if (gVar == null || !gVar.c(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final D w() {
        return this.f22632a;
    }

    public final g x() {
        return this.f22633b;
    }
}
