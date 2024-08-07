package com.google.android.gms.internal.p001firebaseauthapi;

import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahy extends zzahs {
    private static final String zza = "zzahy";
    private String zzb;
    private String zzc;
    private int zzd;
    private String zze;
    private int zzf;
    private long zzg;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        zzg(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzahs zzb(String str) {
        zzg(str);
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final int zze() {
        return this.zzd;
    }

    public final long zzf() {
        return this.zzg;
    }

    public final zzahy zzg(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("totpSessionInfo");
            if (optJSONObject != null) {
                this.zzc = zzac.zza(optJSONObject.optString("sharedSecretKey"));
                this.zzd = optJSONObject.optInt("verificationCodeLength");
                this.zze = zzac.zza(optJSONObject.optString("hashingAlgorithm"));
                this.zzf = optJSONObject.optInt("periodSec");
                this.zzb = zzac.zza(optJSONObject.optString("sessionInfo"));
                try {
                    zzamt zzb2 = zzano.zzb(optJSONObject.optString("finalizeEnrollmentTime"));
                    zzano.zza(zzb2);
                    this.zzg = zzb2.zzb();
                } catch (ParseException unused) {
                }
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public final String zzh() {
        return this.zze;
    }

    public final String zzi() {
        return this.zzc;
    }
}
