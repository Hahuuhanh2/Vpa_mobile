package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import h7.i;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaii  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaii implements zzaek {
    private static final String zza = "zzaii";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private List zzi;
    private String zzj;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = i.a(jSONObject.optString("localId", (String) null));
            this.zzc = i.a(jSONObject.optString("email", (String) null));
            this.zzd = i.a(jSONObject.optString("displayName", (String) null));
            this.zze = i.a(jSONObject.optString("idToken", (String) null));
            this.zzf = i.a(jSONObject.optString("photoUrl", (String) null));
            this.zzg = i.a(jSONObject.optString("refreshToken", (String) null));
            this.zzh = jSONObject.optLong("expiresIn", 0);
            this.zzi = zzahf.zzg(jSONObject.optJSONArray("mfaInfo"));
            this.zzj = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzj;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        if (!TextUtils.isEmpty(this.zzj)) {
            return true;
        }
        return false;
    }
}
