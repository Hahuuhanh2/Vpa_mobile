package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaij  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaij implements zzaej {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaij() {
    }

    public static zzaij zzb(String str, String str2, boolean z10) {
        zzaij zzaij = new zzaij();
        j.c(str);
        zzaij.zzb = str;
        j.c(str2);
        zzaij.zzc = str2;
        zzaij.zzf = z10;
        return zzaij;
    }

    public static zzaij zzc(String str, String str2, boolean z10) {
        zzaij zzaij = new zzaij();
        j.c(str);
        zzaij.zza = str;
        j.c(str2);
        zzaij.zzd = str2;
        zzaij.zzf = z10;
        return zzaij;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zzd(String str) {
        this.zze = str;
    }
}
