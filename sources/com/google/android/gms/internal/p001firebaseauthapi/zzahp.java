package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahp implements zzaej {
    private String zza;
    private String zzb;
    private final String zzc;
    private String zzd;

    public zzahp(String str) {
        this.zzc = str;
    }

    public zzahp(String str, String str2, String str3, String str4, String str5) {
        j.c(str);
        this.zza = str;
        j.c(str2);
        this.zzb = str2;
        this.zzc = str4;
        this.zzd = str5;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            zzain.zzd(jSONObject, "captchaResponse", str4);
        } else {
            zzain.zzc(jSONObject);
        }
        return jSONObject.toString();
    }
}
