package vb;

import android.os.Bundle;
import h7.b;
import java.util.Map;
import org.json.JSONObject;
import p9.a;
import wb.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x2.g f16153a;

    public /* synthetic */ g(x2.g gVar) {
        this.f16153a = gVar;
    }

    public final void a(String str, d dVar) {
        JSONObject optJSONObject;
        x2.g gVar = this.f16153a;
        a aVar = (a) ((za.b) gVar.f16904b).get();
        if (aVar != null) {
            JSONObject jSONObject = dVar.f16769e;
            if (jSONObject.length() >= 1) {
                JSONObject jSONObject2 = dVar.f16766b;
                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (((Map) gVar.f16905c)) {
                            if (!optString.equals(((Map) gVar.f16905c).get(str))) {
                                ((Map) gVar.f16905c).put(str, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", jSONObject2.optString(str));
                                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                aVar.c("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", optString);
                                aVar.c("fp", "_fpc", bundle2);
                            }
                        }
                    }
                }
            }
        }
    }
}
