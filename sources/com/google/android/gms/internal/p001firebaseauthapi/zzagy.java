package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzagy implements zzaek {
    private static final String zza = "zzagy";
    private List zzb;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        zzb(str);
        return this;
    }

    public final zzagy zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.zzb.add(optJSONArray.getString(i10));
                }
            }
            return this;
        } catch (JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public final List zzc() {
        return this.zzb;
    }
}
