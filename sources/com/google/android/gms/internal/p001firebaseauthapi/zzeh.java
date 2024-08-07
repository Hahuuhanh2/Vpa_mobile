package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.util.Arrays;
import v.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzeh extends zzcx {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzef zzd;

    public /* synthetic */ zzeh(int i10, int i11, int i12, zzef zzef, zzeg zzeg) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzef;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzeh)) {
            return false;
        }
        zzeh zzeh = (zzeh) obj;
        if (zzeh.zza == this.zza && zzeh.zzb == this.zzb && zzeh.zzd == this.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzeh.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        StringBuilder w9 = b0.w("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        w9.append(this.zzb);
        w9.append("-byte IV, ");
        w9.append(16);
        w9.append("-byte tag, and ");
        return v.e(w9, this.zza, "-byte key)");
    }

    public final boolean zza() {
        return this.zzd != zzef.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzef zzd() {
        return this.zzd;
    }
}
