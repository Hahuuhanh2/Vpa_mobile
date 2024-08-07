package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.util.Arrays;
import v.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zziw extends zzje {
    private final int zza;
    private final zziu zzb;

    public /* synthetic */ zziw(int i10, zziu zziu, zziv zziv) {
        this.zza = i10;
        this.zzb = zziu;
    }

    public static zzit zzc() {
        return new zzit((zzis) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziw)) {
            return false;
        }
        zziw zziw = (zziw) obj;
        if (zziw.zza == this.zza && zziw.zzb == this.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zziw.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return v.e(b0.w("AesSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    public final boolean zza() {
        return this.zzb != zziu.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zziu zzd() {
        return this.zzb;
    }
}
