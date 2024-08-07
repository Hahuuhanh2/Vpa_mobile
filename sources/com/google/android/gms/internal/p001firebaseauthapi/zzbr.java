package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzbr implements zzbs {
    public final /* synthetic */ zzon zza;
    public final /* synthetic */ zzng zzb;

    public zzbr(zzon zzon, zzng zzng) {
        this.zza = zzon;
        this.zzb = zzng;
    }

    public final zzbo zza(Class cls) {
        try {
            return new zzco(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final zzbo zzb() {
        zzon zzon = this.zza;
        return new zzco(zzon, this.zzb, zzon.zzi());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return this.zzb.getClass();
    }

    public final Set zze() {
        return this.zza.zzl();
    }
}
