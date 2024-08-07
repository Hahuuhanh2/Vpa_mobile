package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zze;
import h7.i;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaie  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaie implements zzaek {
    private static final String zza = "zzaie";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private boolean zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private List zzs;
    private String zzt;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = i.a(jSONObject.optString("idToken", (String) null));
            this.zzd = i.a(jSONObject.optString("refreshToken", (String) null));
            this.zze = jSONObject.optLong("expiresIn", 0);
            this.zzf = i.a(jSONObject.optString("localId", (String) null));
            this.zzg = i.a(jSONObject.optString("email", (String) null));
            this.zzh = i.a(jSONObject.optString("displayName", (String) null));
            this.zzi = i.a(jSONObject.optString("photoUrl", (String) null));
            this.zzj = i.a(jSONObject.optString("providerId", (String) null));
            this.zzk = i.a(jSONObject.optString("rawUserInfo", (String) null));
            this.zzl = jSONObject.optBoolean("isNewUser", false);
            this.zzm = jSONObject.optString("oauthAccessToken", (String) null);
            this.zzn = jSONObject.optString("oauthIdToken", (String) null);
            this.zzp = i.a(jSONObject.optString("errorMessage", (String) null));
            this.zzq = i.a(jSONObject.optString("pendingToken", (String) null));
            this.zzr = i.a(jSONObject.optString("tenantId", (String) null));
            this.zzs = zzahf.zzg(jSONObject.optJSONArray("mfaInfo"));
            this.zzt = i.a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.zzo = i.a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final zze zzc() {
        if (TextUtils.isEmpty(this.zzm) && TextUtils.isEmpty(this.zzn)) {
            return null;
        }
        String str = this.zzj;
        String str2 = this.zzn;
        String str3 = this.zzm;
        String str4 = this.zzq;
        String str5 = this.zzo;
        j.d("Must specify a non-empty providerId", str);
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new zze(str, str2, str3, (zzaic) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String zzg() {
        return this.zzt;
    }

    public final String zzh() {
        return this.zzj;
    }

    public final String zzi() {
        return this.zzk;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zzr;
    }

    public final List zzl() {
        return this.zzs;
    }

    public final boolean zzm() {
        if (!TextUtils.isEmpty(this.zzt)) {
            return true;
        }
        return false;
    }

    public final boolean zzn() {
        return this.zzb;
    }

    public final boolean zzo() {
        return this.zzl;
    }

    public final boolean zzp() {
        if (this.zzb || !TextUtils.isEmpty(this.zzp)) {
            return true;
        }
        return false;
    }
}
