package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaih  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaih implements zzaej {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    public zzaih(String str, String str2, String str3, String str4) {
        j.c(str);
        this.zza = str;
        j.c(str2);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zza);
        jSONObject.put("password", this.zzb);
        jSONObject.put("returnSecureToken", true);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            zzain.zzd(jSONObject, "captchaResponse", str2);
        } else {
            zzain.zzc(jSONObject);
        }
        return jSONObject.toString();
    }
}
