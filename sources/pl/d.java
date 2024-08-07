package pl;

import nl.j;
import ol.a;
import ol.f;
import ql.b;
import rl.e;
import rl.g;
import rl.h;
import rl.i;
import rl.k;

/* compiled from: DateTimePrintContext */
public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f22702a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f22703b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f22704c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j f22705d;

    public d(a aVar, e eVar, f fVar, j jVar) {
        this.f22702a = aVar;
        this.f22703b = eVar;
        this.f22704c = fVar;
        this.f22705d = jVar;
    }

    public final long c(g gVar) {
        if (this.f22702a == null || !gVar.isDateBased()) {
            return this.f22703b.c(gVar);
        }
        return ((nl.e) this.f22702a).c(gVar);
    }

    public final k m(g gVar) {
        if (this.f22702a == null || !gVar.isDateBased()) {
            return this.f22703b.m(gVar);
        }
        return this.f22702a.m(gVar);
    }

    public final boolean n(g gVar) {
        if (this.f22702a == null || !gVar.isDateBased()) {
            return this.f22703b.n(gVar);
        }
        return this.f22702a.n(gVar);
    }

    public final <R> R o(i<R> iVar) {
        if (iVar == h.f22840b) {
            return this.f22704c;
        }
        if (iVar == h.f22839a) {
            return this.f22705d;
        }
        if (iVar == h.f22841c) {
            return this.f22703b.o(iVar);
        }
        return iVar.a(this);
    }
}
