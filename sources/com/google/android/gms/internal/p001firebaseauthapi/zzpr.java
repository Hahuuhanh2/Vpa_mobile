package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.util.Arrays;
import v.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzpr extends zzqs {
    private final int zza;
    private final int zzb;
    private final zzpp zzc;

    public /* synthetic */ zzpr(int i10, int i11, zzpp zzpp, zzpq zzpq) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzpp;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpr)) {
            return false;
        }
        zzpr zzpr = (zzpr) obj;
        if (zzpr.zza == this.zza && zzpr.zzd() == zzd() && zzpr.zzc == this.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzpr.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        StringBuilder w9 = b0.w("AES-CMAC Parameters (variant: ", String.valueOf(this.zzc), ", ");
        w9.append(this.zzb);
        w9.append("-byte tags, and ");
        return v.e(w9, this.zza, "-byte key)");
    }

    public final boolean zza() {
        return this.zzc != zzpp.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzpp zzpp = this.zzc;
        if (zzpp == zzpp.zzd) {
            return this.zzb;
        }
        if (zzpp == zzpp.zza || zzpp == zzpp.zzb || zzpp == zzpp.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzpp zze() {
        return this.zzc;
    }
}
