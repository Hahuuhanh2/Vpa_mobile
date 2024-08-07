package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzhr extends zzcx {
    private final zzhq zza;

    private zzhr(zzhq zzhq) {
        this.zza = zzhq;
    }

    public static zzhr zzc() {
        return new zzhr(zzhq.zzc);
    }

    public static zzhr zzd(zzhq zzhq) {
        return new zzhr(zzhq);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zzhr) && ((zzhr) obj).zza == this.zza) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzhr.class, this.zza});
    }

    public final String toString() {
        return b0.s("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    public final boolean zza() {
        return this.zza != zzhq.zzc;
    }

    public final zzhq zzb() {
        return this.zza;
    }
}
