package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzga  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzga extends zzcx {
    private final zzfz zza;

    private zzga(zzfz zzfz) {
        this.zza = zzfz;
    }

    public static zzga zzc(zzfz zzfz) {
        return new zzga(zzfz);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zzga) && ((zzga) obj).zza == this.zza) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzga.class, this.zza});
    }

    public final String toString() {
        return b0.s("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    public final boolean zza() {
        return this.zza != zzfz.zzc;
    }

    public final zzfz zzb() {
        return this.zza;
    }
}
