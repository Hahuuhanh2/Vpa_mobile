package pl;

import java.util.Locale;
import java.util.Map;
import pl.i;
import rl.g;

/* compiled from: DateTimeFormatterBuilder */
public final class c extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i.b f22701b;

    public c(i.b bVar) {
        this.f22701b = bVar;
    }

    public final String a(g gVar, long j10, j jVar, Locale locale) {
        Map map = this.f22701b.f22722a.get(jVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j10));
        }
        return null;
    }
}
