package com.google.android.gms.internal.p001firebaseauthapi;

import a7.a;
import com.google.firebase.auth.EmailAuthCredential;
import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzage  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzage implements zzaej {
    private static final String zza = "zzage";
    private static final a zzb = new a(zza, new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzage(EmailAuthCredential emailAuthCredential, String str, String str2) {
        String str3 = emailAuthCredential.f7465a;
        j.c(str3);
        this.zzc = str3;
        String str4 = emailAuthCredential.f7467c;
        j.c(str4);
        this.zzd = str4;
        this.zze = str;
        this.zzf = str2;
    }

    public final String zza() {
        aa.a aVar;
        String str;
        String str2 = this.zzd;
        int i10 = aa.a.f119c;
        j.c(str2);
        String str3 = null;
        try {
            aVar = new aa.a(str2);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        if (aVar != null) {
            str = aVar.f120a;
        } else {
            str = null;
        }
        if (aVar != null) {
            str3 = aVar.f121b;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzain.zzd(jSONObject, "captchaResp", str5);
        } else {
            zzain.zzc(jSONObject);
        }
        return jSONObject.toString();
    }
}
