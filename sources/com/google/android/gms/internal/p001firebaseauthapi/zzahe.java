package com.google.android.gms.internal.p001firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahe {
    private String zza;
    private String zzb;
    private String zzc;
    private Long zzd;
    private Long zze;

    public static zzahe zza(String str) {
        try {
            zzahe zzahe = new zzahe();
            JSONObject jSONObject = new JSONObject(str);
            zzahe.zza = jSONObject.optString("iss");
            zzahe.zzb = jSONObject.optString("aud");
            zzahe.zzc = jSONObject.optString("sub");
            zzahe.zzd = Long.valueOf(jSONObject.optLong("iat"));
            zzahe.zze = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzahe;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                "Failed to read JwtToken from JSONObject. ".concat(e10.toString());
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(e10.toString()));
        }
    }

    public final Long zzb() {
        return this.zze;
    }

    public final Long zzc() {
        return this.zzd;
    }
}
