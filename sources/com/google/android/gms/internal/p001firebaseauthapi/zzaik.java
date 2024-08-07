package com.google.android.gms.internal.p001firebaseauthapi;

import h7.i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaik  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaik implements zzaek {
    private static final String zza = "zzaik";
    private String zzb;
    private String zzc;
    private long zzd;
    private String zze;
    private boolean zzf;
    private String zzg;
    private String zzh;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = i.a(jSONObject.optString("idToken", (String) null));
            this.zzc = i.a(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0);
            this.zze = i.a(jSONObject.optString("localId", (String) null));
            this.zzf = jSONObject.optBoolean("isNewUser", false);
            this.zzg = i.a(jSONObject.optString("temporaryProof", (String) null));
            this.zzh = i.a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzf;
    }
}
