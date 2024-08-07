package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzagl implements zzagi {
    private final String zza = "phone";
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    public zzagl(String str, String str2, String str3, String str4, String str5) {
        j.c("phone");
        j.c(str2);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
    }

    public static zzagl zzb(String str, String str2, String str3, String str4) {
        j.c(str3);
        j.c(str2);
        return new zzagl("phone", str, str2, str3, str4);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaProvider", 1);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzc;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zzb);
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
