package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzagm implements zzagg {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    public zzagm(String str, String str2, String str3, String str4, String str5) {
        j.c(str);
        this.zza = str;
        j.c(str2);
        this.zzb = str2;
        j.c(str3);
        this.zzc = str3;
        j.c(str4);
        this.zzd = str4;
        this.zze = str5;
    }

    public static zzagm zzc(String str, String str2, String str3, String str4, String str5) {
        return new zzagm(str, str2, str3, str4, str5);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("displayName", this.zzb);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(this.zzc)) {
            jSONObject2.put("sessionInfo", this.zzc);
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject2.put("verificationCode", this.zzd);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        if (!TextUtils.isEmpty(this.zze)) {
            jSONObject.put("tenantId", this.zze);
        }
        return jSONObject.toString();
    }

    public final /* synthetic */ zzagg zzb(String str) {
        this.zza = str;
        return this;
    }
}
