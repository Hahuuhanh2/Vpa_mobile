package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class zzahs implements zzaek {
    private static final String zza = "zzahs";

    /* renamed from: zzb */
    public zzahs zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                zzahw zzahw = new zzahw();
                zzahw.zzd(str);
                return zzahw;
            } else if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                zzahy zzahy = new zzahy();
                zzahy.zzg(str);
                return zzahy;
            } else {
                throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
            }
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public String zzc() {
        return null;
    }
}
