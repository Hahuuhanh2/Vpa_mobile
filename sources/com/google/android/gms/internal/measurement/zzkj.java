package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public final class zzkj<K, V> {
    public static <K, V> int zza(zzkm<K, V> zzkm, K k10, V v2) {
        return zziy.zza(zzkm.zza, 1, k10) + zziy.zza(zzkm.zzc, 2, v2);
    }

    public static <K, V> void zza(zzio zzio, zzkm<K, V> zzkm, K k10, V v2) {
        zziy.zza(zzio, zzkm.zza, 1, k10);
        zziy.zza(zzio, zzkm.zzc, 2, v2);
    }
}
