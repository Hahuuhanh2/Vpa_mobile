package com.google.android.gms.internal.p001firebaseauthapi;

import h7.i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahm implements zzaek {
    private static final String zza = "zzahm";
    private String zzb;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        try {
            this.zzb = i.a(new JSONObject(str).optString("sessionInfo", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
