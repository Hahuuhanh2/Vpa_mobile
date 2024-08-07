package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;
import v.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzey  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzey extends zzcx {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzew zzd;

    public /* synthetic */ zzey(int i10, int i11, int i12, zzew zzew, zzex zzex) {
        this.zza = i10;
        this.zzd = zzew;
    }

    public static zzev zzc() {
        return new zzev((zzeu) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzey)) {
            return false;
        }
        zzey zzey = (zzey) obj;
        if (zzey.zza == this.zza && zzey.zzd == this.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzey.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(12);
        sb2.append("-byte IV, ");
        sb2.append(16);
        sb2.append("-byte tag, and ");
        return v.e(sb2, this.zza, "-byte key)");
    }

    public final boolean zza() {
        return this.zzd != zzew.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzew zzd() {
        return this.zzd;
    }
}
