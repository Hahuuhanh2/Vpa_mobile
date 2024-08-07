package com.google.android.recaptcha.internal;

import al.g0;
import android.support.v4.media.a;
import yk.l;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzbp implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String X0 = l.X0(String.valueOf(this.zzb / ((long) this.zza)), 10);
        String X02 = l.X0(String.valueOf(this.zzc), 10);
        String X03 = l.X0(String.valueOf(this.zzb), 10);
        String X04 = l.X0(String.valueOf(this.zza), 5);
        StringBuilder r10 = a.r("avgExecutionTime: ", X0, " us| maxExecutionTime: ", X02, " us| totalTime: ");
        r10.append(X03);
        r10.append(" us| #Usages: ");
        r10.append(X04);
        return r10.toString();
    }

    /* renamed from: zza */
    public final int compareTo(zzbp zzbp) {
        return g0.H(Long.valueOf(this.zzb), Long.valueOf(zzbp.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
