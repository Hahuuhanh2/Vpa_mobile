package com.google.android.gms.internal.p001firebaseauthapi;

import h7.i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahq implements zzaek {
    private static final String zza = "zzahq";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private long zzf;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = i.a(jSONObject.optString("idToken", (String) null));
            this.zzc = i.a(jSONObject.optString("displayName", (String) null));
            this.zzd = i.a(jSONObject.optString("email", (String) null));
            this.zze = i.a(jSONObject.optString("refreshToken", (String) null));
            this.zzf = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zze;
    }
}
