package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzbq implements zzbs {
    public final /* synthetic */ zzng zza;

    public zzbq(zzng zzng) {
        this.zza = zzng;
    }

    public final zzbo zza(Class cls) {
        try {
            return new zzbp(this.zza, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final zzbo zzb() {
        zzng zzng = this.zza;
        return new zzbp(zzng, zzng.zzi());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return null;
    }

    public final Set zze() {
        return this.zza.zzl();
    }
}