package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzagj implements zzaek {
    private static final String zza = "zzagj";
    private String zzb;
    private String zzc;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("idToken", (String) null);
            this.zzc = jSONObject.optString("refreshToken", (String) null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }
}
