package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import java.util.Arrays;
import v.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzdn extends zzcx {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzdl zze;
    private final zzdk zzf;

    public /* synthetic */ zzdn(int i10, int i11, int i12, int i13, zzdl zzdl, zzdk zzdk, zzdm zzdm) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzdl;
        this.zzf = zzdk;
    }

    public static zzdj zzf() {
        return new zzdj((zzdi) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdn)) {
            return false;
        }
        zzdn zzdn = (zzdn) obj;
        if (zzdn.zza == this.zza && zzdn.zzb == this.zzb && zzdn.zzc == this.zzc && zzdn.zzd == this.zzd && zzdn.zze == this.zze && zzdn.zzf == this.zzf) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzdn.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        StringBuilder r10 = a.r("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.zze), ", hashType: ", String.valueOf(this.zzf), ", ");
        r10.append(this.zzc);
        r10.append("-byte IV, and ");
        r10.append(this.zzd);
        r10.append("-byte tags, and ");
        r10.append(this.zza);
        r10.append("-byte AES key, and ");
        return v.e(r10, this.zzb, "-byte HMAC key)");
    }

    public final boolean zza() {
        return this.zze != zzdl.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzdk zzg() {
        return this.zzf;
    }

    public final zzdl zzh() {
        return this.zze;
    }
}
