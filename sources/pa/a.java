package pa;

import org.json.JSONObject;
import pa.c;

/* compiled from: DefaultSettingsJsonTransform */
public final class a implements f {
    public static c b(a.a aVar) {
        c.b bVar = new c.b(8);
        c.a aVar2 = new c.a(true, false, false);
        aVar.getClass();
        return new c(System.currentTimeMillis() + ((long) 3600000), bVar, aVar2, 10.0d, 1.2d, 60);
    }

    public final c a(a.a aVar, JSONObject jSONObject) {
        return b(aVar);
    }
}
