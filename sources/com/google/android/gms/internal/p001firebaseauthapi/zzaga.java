package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import f0.b0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaga  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaga implements zzaek {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzaga";
    private String zzb;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        zzb(str);
        return this;
    }

    public final zzaga zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e10) {
            e10.getMessage();
            throw new zzaca(b0.s("Failed to parse error for string [", str, "]"), e10);
        }
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        if (!TextUtils.isEmpty(this.zzb)) {
            return true;
        }
        return false;
    }
}
