package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.util.Arrays;
import v.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzfp extends zzcx {
    private final int zza;
    private final zzfn zzb;

    public /* synthetic */ zzfp(int i10, zzfn zzfn, zzfo zzfo) {
        this.zza = i10;
        this.zzb = zzfn;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfp)) {
            return false;
        }
        zzfp zzfp = (zzfp) obj;
        if (zzfp.zza == this.zza && zzfp.zzb == this.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzfp.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return v.e(b0.w("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    public final boolean zza() {
        return this.zzb != zzfn.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzfn zzc() {
        return this.zzb;
    }
}
