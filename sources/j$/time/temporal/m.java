package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.o;
import j$.time.k;

public final /* synthetic */ class m implements k, p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18267a;

    public /* synthetic */ m(int i10) {
        this.f18267a = i10;
    }

    public final Object h(j jVar) {
        switch (this.f18267a) {
            case 1:
                return (ZoneId) jVar.K(n.f18268a);
            case 2:
                return (o) jVar.K(n.f18269b);
            case 3:
                return (q) jVar.K(n.f18270c);
            case 4:
                a aVar = a.OFFSET_SECONDS;
                if (jVar.e(aVar)) {
                    return ZoneOffset.e0(jVar.m(aVar));
                }
                return null;
            case 5:
                ZoneId zoneId = (ZoneId) jVar.K(n.f18268a);
                return zoneId != null ? zoneId : (ZoneId) jVar.K(n.f18271d);
            case 6:
                a aVar2 = a.EPOCH_DAY;
                if (jVar.e(aVar2)) {
                    return LocalDate.h0(jVar.h(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (jVar.e(aVar3)) {
                    return k.c0(jVar.h(aVar3));
                }
                return null;
        }
    }

    public final Temporal t(Temporal temporal) {
        a aVar = a.DAY_OF_MONTH;
        return temporal.c(temporal.o(aVar).d(), aVar);
    }
}
