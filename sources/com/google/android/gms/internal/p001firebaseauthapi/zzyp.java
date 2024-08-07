package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzyp implements zzyu {
    private final zzzd zza;

    public /* synthetic */ zzyp(zzzd zzzd, zzyo zzyo) {
        this.zza = zzzd;
    }

    public final Object zza(String str) {
        for (Provider zza2 : zzyv.zzb("GmsCore_OpenSSL", "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, zza2);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, (Provider) null);
    }
}
