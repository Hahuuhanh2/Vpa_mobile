package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzyt implements zzyu {
    private final zzzd zza;

    public /* synthetic */ zzyt(zzzd zzzd, zzys zzys) {
        this.zza = zzzd;
    }

    public final Object zza(String str) {
        Exception exc = null;
        for (Provider zza2 : zzyv.zzb("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt")) {
            try {
                return this.zza.zza(str, zza2);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
