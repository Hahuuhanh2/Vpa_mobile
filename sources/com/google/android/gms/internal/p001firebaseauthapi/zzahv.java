package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahv implements zzahr {
    private final String zza;
    private final String zzb = "phone";
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private zzafy zzg;

    private zzahv(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        j.c(str);
        this.zza = str;
        j.c("phone");
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }

    public static zzahv zzb(String str, String str2, String str3, String str4, String str5, String str6) {
        j.c(str2);
        return new zzahv(str, "phone", str2, str3, str4, str5, (String) null);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaProvider", 1);
        if (this.zzc != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zzc);
            if (!TextUtils.isEmpty(this.zze)) {
                jSONObject2.put("recaptchaToken", this.zze);
            }
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("playIntegrityToken", this.zzf);
            }
            zzafy zzafy = this.zzg;
            if (zzafy != null) {
                jSONObject2.put("autoRetrievalInfo", zzafy.zza());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final void zzd(zzafy zzafy) {
        this.zzg = zzafy;
    }
}
