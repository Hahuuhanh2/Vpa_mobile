package pl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import nl.j;
import ol.f;
import ol.h;
import org.threeten.bp.DateTimeException;
import p3.l0;
import pl.b;
import rl.c;
import rl.e;
import rl.g;

/* compiled from: DateTimeFormatter */
public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f22661h;

    /* renamed from: a  reason: collision with root package name */
    public final b.c f22662a;

    /* renamed from: b  reason: collision with root package name */
    public final Locale f22663b;

    /* renamed from: c  reason: collision with root package name */
    public final g f22664c;

    /* renamed from: d  reason: collision with root package name */
    public final h f22665d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<g> f22666e;

    /* renamed from: f  reason: collision with root package name */
    public final f f22667f;

    /* renamed from: g  reason: collision with root package name */
    public final j f22668g;

    static {
        b bVar = new b();
        rl.a aVar = rl.a.YEAR;
        bVar.h(aVar, 4, 10, 5);
        bVar.c('-');
        rl.a aVar2 = rl.a.MONTH_OF_YEAR;
        bVar.g(aVar2, 2);
        bVar.c('-');
        rl.a aVar3 = rl.a.DAY_OF_MONTH;
        bVar.g(aVar3, 2);
        h hVar = h.STRICT;
        a l10 = bVar.l(hVar);
        h hVar2 = h.f22637a;
        a b10 = l10.b(hVar2);
        b bVar2 = new b();
        b.i iVar = b.i.INSENSITIVE;
        bVar2.b(iVar);
        bVar2.a(b10);
        b.h hVar3 = b.h.f22689d;
        bVar2.b(hVar3);
        bVar2.l(hVar).b(hVar2);
        b bVar3 = new b();
        bVar3.b(iVar);
        bVar3.a(b10);
        bVar3.j();
        bVar3.b(hVar3);
        bVar3.l(hVar).b(hVar2);
        b bVar4 = new b();
        rl.a aVar4 = rl.a.HOUR_OF_DAY;
        bVar4.g(aVar4, 2);
        bVar4.c(':');
        rl.a aVar5 = rl.a.MINUTE_OF_HOUR;
        bVar4.g(aVar5, 2);
        bVar4.j();
        bVar4.c(':');
        rl.a aVar6 = rl.a.SECOND_OF_MINUTE;
        bVar4.g(aVar6, 2);
        bVar4.j();
        bVar4.b(new b.e(rl.a.NANO_OF_SECOND));
        a l11 = bVar4.l(hVar);
        b bVar5 = new b();
        bVar5.b(iVar);
        bVar5.a(l11);
        bVar5.b(hVar3);
        bVar5.l(hVar);
        b bVar6 = new b();
        bVar6.b(iVar);
        bVar6.a(l11);
        bVar6.j();
        bVar6.b(hVar3);
        bVar6.l(hVar);
        b bVar7 = new b();
        bVar7.b(iVar);
        bVar7.a(b10);
        bVar7.c('T');
        bVar7.a(l11);
        a b11 = bVar7.l(hVar).b(hVar2);
        b bVar8 = new b();
        bVar8.b(iVar);
        bVar8.a(b11);
        bVar8.b(hVar3);
        a b12 = bVar8.l(hVar).b(hVar2);
        b bVar9 = new b();
        bVar9.a(b12);
        bVar9.j();
        bVar9.c('[');
        b.i iVar2 = b.i.SENSITIVE;
        bVar9.b(iVar2);
        bVar9.b(new b.l());
        bVar9.c(']');
        bVar9.l(hVar).b(hVar2);
        b bVar10 = new b();
        bVar10.a(b11);
        bVar10.j();
        bVar10.b(hVar3);
        bVar10.j();
        bVar10.c('[');
        bVar10.b(iVar2);
        bVar10.b(new b.l());
        bVar10.c(']');
        bVar10.l(hVar).b(hVar2);
        b bVar11 = new b();
        bVar11.b(iVar);
        bVar11.h(aVar, 4, 10, 5);
        bVar11.c('-');
        bVar11.g(rl.a.DAY_OF_YEAR, 3);
        bVar11.j();
        bVar11.b(hVar3);
        bVar11.l(hVar).b(hVar2);
        b bVar12 = new b();
        bVar12.b(iVar);
        int i10 = c.f22831a;
        bVar12.h(c.a.f22834c, 4, 10, 5);
        bVar12.d("-W");
        bVar12.g(c.a.f22833b, 2);
        bVar12.c('-');
        rl.a aVar7 = rl.a.DAY_OF_WEEK;
        bVar12.g(aVar7, 1);
        bVar12.j();
        bVar12.b(hVar3);
        bVar12.l(hVar).b(hVar2);
        b bVar13 = new b();
        bVar13.b(iVar);
        bVar13.b(new b.f());
        f22661h = bVar13.l(hVar);
        b bVar14 = new b();
        bVar14.b(iVar);
        bVar14.g(aVar, 4);
        bVar14.g(aVar2, 2);
        bVar14.g(aVar3, 2);
        bVar14.j();
        bVar14.b(new b.h("Z", "+HHMMss"));
        bVar14.l(hVar).b(hVar2);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        b bVar15 = new b();
        bVar15.b(iVar);
        bVar15.b(b.i.LENIENT);
        bVar15.j();
        bVar15.e(aVar7, hashMap);
        bVar15.d(", ");
        bVar15.i();
        bVar15.h(aVar3, 1, 2, 4);
        bVar15.c(' ');
        bVar15.e(aVar2, hashMap2);
        bVar15.c(' ');
        bVar15.g(aVar, 4);
        bVar15.c(' ');
        bVar15.g(aVar4, 2);
        bVar15.c(':');
        bVar15.g(aVar5, 2);
        bVar15.j();
        bVar15.c(':');
        bVar15.g(aVar6, 2);
        bVar15.i();
        bVar15.c(' ');
        bVar15.b(new b.h("GMT", "+HHMM"));
        bVar15.l(h.SMART).b(hVar2);
    }

    public a(b.c cVar, Locale locale, g gVar, h hVar, Set<g> set, f fVar, j jVar) {
        l0.y0(cVar, "printerParser");
        this.f22662a = cVar;
        l0.y0(locale, "locale");
        this.f22663b = locale;
        l0.y0(gVar, "decimalStyle");
        this.f22664c = gVar;
        l0.y0(hVar, "resolverStyle");
        this.f22665d = hVar;
        this.f22666e = set;
        this.f22667f = fVar;
        this.f22668g = jVar;
    }

    public final String a(e eVar) {
        StringBuilder sb2 = new StringBuilder(32);
        l0.y0(eVar, "temporal");
        try {
            this.f22662a.b(new e(eVar, this), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new DateTimeException(e10.getMessage(), e10);
        }
    }

    public final a b(h hVar) {
        if (l0.M(this.f22667f, hVar)) {
            return this;
        }
        return new a(this.f22662a, this.f22663b, this.f22664c, this.f22665d, this.f22666e, hVar, this.f22668g);
    }

    public final String toString() {
        String cVar = this.f22662a.toString();
        if (cVar.startsWith("[")) {
            return cVar;
        }
        return cVar.substring(1, cVar.length() - 1);
    }
}
