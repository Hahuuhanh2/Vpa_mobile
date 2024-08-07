package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaht  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaht implements zzaej {
    private final String zza = "phone";
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private zzafy zzh;

    private zzaht(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        j.c("phone");
        j.c(str2);
        this.zzb = str2;
        j.c(str3);
        this.zzc = str3;
        this.zze = str4;
        this.zzd = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    public static zzaht zzb(String str, String str2, String str3, String str4, String str5, String str6) {
        j.c(str3);
        return new zzaht("phone", str, str2, str3, str4, str5, str6);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.zzb);
        jSONObject.put("mfaEnrollmentId", this.zzc);
        this.zza.getClass();
        jSONObject.put("mfaProvider", 1);
        if (this.zze != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zze);
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("recaptchaToken", this.zzf);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject2.put("playIntegrityToken", this.zzg);
            }
            zzafy zzafy = this.zzh;
            if (zzafy != null) {
                jSONObject2.put("autoRetrievalInfo", zzafy.zza());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final void zzd(zzafy zzafy) {
        this.zzh = zzafy;
    }
}
