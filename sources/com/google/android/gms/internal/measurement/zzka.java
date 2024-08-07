package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
abstract class zzka {
    private static final zzka zza = new zzjz();
    private static final zzka zzb = new zzkb();

    private zzka() {
    }

    public static zzka zza() {
        return zza;
    }

    public static zzka zzb() {
        return zzb;
    }

    public abstract <L> List<L> zza(Object obj, long j10);

    public abstract <L> void zza(Object obj, Object obj2, long j10);

    public abstract void zzb(Object obj, long j10);
}