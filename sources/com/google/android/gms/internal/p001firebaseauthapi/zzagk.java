package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzagk implements zzagg {
    private final String zza = "phone";
    private String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    private zzagk(String str, String str2, String str3, String str4, String str5, String str6) {
        j.c("phone");
        j.c(str2);
        this.zzb = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzc = str5;
        this.zzf = str6;
    }

    public static zzagk zzc(String str, String str2, String str3, String str4, String str5) {
        j.c(str3);
        j.c(str2);
        return new zzagk("phone", str, str2, str3, str4, str5);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zzb);
        jSONObject.put("mfaProvider", 1);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.zzd;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        String str4 = this.zzf;
        if (str4 != null) {
            jSONObject.put("tenantId", str4);
        }
        return jSONObject.toString();
    }

    public final /* synthetic */ zzagg zzb(String str) {
        this.zzb = str;
        return this;
    }
}
