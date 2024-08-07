package com.google.android.gms.internal.p001firebaseauthapi;

import h7.i;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaho  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaho implements zzaek {
    private static final String zza = "zzaho";
    private String zzb;
    private String zzc;
    private Boolean zzd;
    private String zze;
    private String zzf;
    private zzahh zzg;
    private String zzh;
    private String zzi;
    private long zzj;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = i.a(jSONObject.optString("email", (String) null));
            this.zzc = i.a(jSONObject.optString("passwordHash", (String) null));
            this.zzd = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.zze = i.a(jSONObject.optString("displayName", (String) null));
            this.zzf = i.a(jSONObject.optString("photoUrl", (String) null));
            this.zzg = zzahh.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzh = i.a(jSONObject.optString("idToken", (String) null));
            this.zzi = i.a(jSONObject.optString("refreshToken", (String) null));
            this.zzj = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zzj;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzi;
    }

    public final List zzf() {
        zzahh zzahh = this.zzg;
        if (zzahh != null) {
            return zzahh.zzc();
        }
        return null;
    }
}
