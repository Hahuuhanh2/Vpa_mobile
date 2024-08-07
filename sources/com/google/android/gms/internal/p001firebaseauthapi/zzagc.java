package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzagc implements zzaek {
    private static final String zza = "zzagc";
    private String zzb;
    private String zzc;
    private zzahz zzd = new zzahz((List) null);
    private List zze;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("authUri", (String) null);
            jSONObject.optBoolean("registered", false);
            this.zzc = jSONObject.optString("providerId", (String) null);
            jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.zzd = new zzahz((List) null);
            } else {
                this.zzd = new zzahz(1, zzain.zzb(jSONObject.optJSONArray("allProviders")));
            }
            this.zze = zzain.zzb(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public final List zzb() {
        return this.zze;
    }
}
