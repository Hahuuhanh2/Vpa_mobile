package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class zzqb {
    private static zzqb zza;

    private zzqb() {
    }

    public static synchronized zzqb zza() {
        zzqb zzqb;
        synchronized (zzqb.class) {
            if (zza == null) {
                zza = new zzqb();
            }
            zzqb = zza;
        }
        return zzqb;
    }

    public static void zzb() {
        zzqa.zza();
    }
}