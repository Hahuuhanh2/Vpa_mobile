package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzme  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzme implements zzlt {
    private final zzln zza;

    public zzme(zzln zzln) {
        this.zza = zzln;
    }

    public final byte[] zza(byte[] bArr, zzlu zzlu) {
        byte[] zza2 = zzzm.zza(zzlu.zza().zzc(), bArr);
        byte[] zzb = zzyf.zzb(bArr, zzlu.zzb().zzc());
        byte[] zze = zzmb.zze(zzmb.zzc);
        zzln zzln = this.zza;
        return zzln.zzb((byte[]) null, zza2, "eae_prk", zzb, "shared_secret", zze, zzln.zza());
    }

    public final byte[] zzb() {
        if (Arrays.equals(this.zza.zzc(), zzmb.zzg)) {
            return zzmb.zzc;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
