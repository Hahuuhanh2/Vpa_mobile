package pl;

import java.util.Locale;
import nl.d;
import nl.j;
import nl.k;
import ol.f;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.zone.ZoneRulesException;
import p3.l0;
import rl.a;
import rl.g;
import rl.h;

/* compiled from: DateTimePrintContext */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public rl.e f22706a;

    /* renamed from: b  reason: collision with root package name */
    public Locale f22707b;

    /* renamed from: c  reason: collision with root package name */
    public g f22708c;

    /* renamed from: d  reason: collision with root package name */
    public int f22709d;

    public e(rl.e eVar, a aVar) {
        f fVar;
        j jVar;
        f fVar2 = aVar.f22667f;
        j jVar2 = aVar.f22668g;
        if (!(fVar2 == null && jVar2 == null)) {
            f fVar3 = (f) eVar.o(h.f22840b);
            j jVar3 = (j) eVar.o(h.f22839a);
            nl.e eVar2 = null;
            fVar2 = l0.M(fVar3, fVar2) ? null : fVar2;
            jVar2 = l0.M(jVar3, jVar2) ? null : jVar2;
            if (!(fVar2 == null && jVar2 == null)) {
                if (fVar2 != null) {
                    fVar = fVar2;
                } else {
                    fVar = fVar3;
                }
                jVar3 = jVar2 != null ? jVar2 : jVar3;
                if (jVar2 != null) {
                    if (eVar.n(a.INSTANT_SECONDS)) {
                        eVar = (fVar == null ? ol.h.f22637a : fVar).q(d.t(eVar), jVar2);
                    } else {
                        try {
                            sl.f s10 = jVar2.s();
                            if (s10.d()) {
                                jVar = s10.a(d.f21749c);
                                k kVar = (k) eVar.o(h.f22843e);
                                if ((jVar instanceof k) && kVar != null && !jVar.equals(kVar)) {
                                    throw new DateTimeException("Invalid override zone for temporal: " + jVar2 + " " + eVar);
                                }
                            }
                        } catch (ZoneRulesException unused) {
                        }
                        jVar = jVar2;
                        k kVar2 = (k) eVar.o(h.f22843e);
                        throw new DateTimeException("Invalid override zone for temporal: " + jVar2 + " " + eVar);
                    }
                }
                if (fVar2 != null) {
                    if (eVar.n(a.EPOCH_DAY)) {
                        eVar2 = fVar.c(eVar);
                    } else if (!(fVar2 == ol.h.f22637a && fVar3 == null)) {
                        a[] values = a.values();
                        int length = values.length;
                        int i10 = 0;
                        while (i10 < length) {
                            a aVar2 = values[i10];
                            if (!aVar2.isDateBased() || !eVar.n(aVar2)) {
                                i10++;
                            } else {
                                throw new DateTimeException("Invalid override chronology for temporal: " + fVar2 + " " + eVar);
                            }
                        }
                    }
                }
                eVar = new d(eVar2, eVar, fVar, jVar3);
            }
        }
        this.f22706a = eVar;
        this.f22707b = aVar.f22663b;
        this.f22708c = aVar.f22664c;
    }

    public final Long a(g gVar) {
        try {
            return Long.valueOf(this.f22706a.c(gVar));
        } catch (DateTimeException e10) {
            if (this.f22709d > 0) {
                return null;
            }
            throw e10;
        }
    }

    public final String toString() {
        return this.f22706a.toString();
    }
}
