package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzow  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzow {
    private final Class zza;
    private final zzzo zzb;

    public /* synthetic */ zzow(Class cls, zzzo zzzo, zzov zzov) {
        this.zza = cls;
        this.zzb = zzzo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzow)) {
            return false;
        }
        zzow zzow = (zzow) obj;
        if (!zzow.zza.equals(this.zza) || !zzow.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return b0.s(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
