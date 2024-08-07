package pa;

import a.a;
import org.json.JSONObject;
import pa.c;

/* compiled from: SettingsV3JsonTransform */
public final class j implements f {
    public final c a(a aVar, JSONObject jSONObject) {
        c.b bVar;
        long j10;
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.optInt("settings_version", 0);
        int optInt = jSONObject2.optInt("cache_duration", 3600);
        double optDouble = jSONObject2.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject2.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject2.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject2.has("session")) {
            bVar = new c.b(jSONObject2.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            bVar = new c.b(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        c.b bVar2 = bVar;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("features");
        c.a aVar2 = new c.a(jSONObject3.optBoolean("collect_reports", true), jSONObject3.optBoolean("collect_anrs", false), jSONObject3.optBoolean("collect_build_ids", false));
        long j11 = (long) optInt;
        if (jSONObject2.has("expires_at")) {
            j10 = jSONObject2.optLong("expires_at");
        } else {
            aVar.getClass();
            j10 = (j11 * 1000) + System.currentTimeMillis();
        }
        return new c(j10, bVar2, aVar2, optDouble, optDouble2, optInt2);
    }
}
