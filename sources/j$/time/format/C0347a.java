package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.j;
import j$.time.temporal.n;
import j$.time.temporal.p;

/* renamed from: j$.time.format.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0347a implements p {
    public final Object h(j jVar) {
        int i10 = w.f18197j;
        ZoneId zoneId = (ZoneId) jVar.K(n.l());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
