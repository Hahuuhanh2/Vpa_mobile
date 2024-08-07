package wb;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ConfigContainer */
public final class d {

    /* renamed from: g  reason: collision with root package name */
    public static final Date f16764g = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f16765a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f16766b;

    /* renamed from: c  reason: collision with root package name */
    public Date f16767c;

    /* renamed from: d  reason: collision with root package name */
    public JSONArray f16768d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f16769e;

    /* renamed from: f  reason: collision with root package name */
    public long f16770f;

    public d(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        this.f16766b = jSONObject;
        this.f16767c = date;
        this.f16768d = jSONArray;
        this.f16769e = jSONObject2;
        this.f16770f = j10;
        this.f16765a = jSONObject3;
    }

    public static d a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new d(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return this.f16765a.toString().equals(((d) obj).toString());
    }

    public final int hashCode() {
        return this.f16765a.hashCode();
    }

    public final String toString() {
        return this.f16765a.toString();
    }
}
