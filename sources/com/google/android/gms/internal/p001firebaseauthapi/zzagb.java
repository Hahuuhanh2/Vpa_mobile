package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzagb implements zzaej {
    private final String zza;
    private final String zzb = "http://localhost";
    private final String zzc;

    public zzagb(String str, String str2) {
        j.c(str);
        this.zza = str;
        this.zzc = str2;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.zza);
        jSONObject.put("continueUri", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
