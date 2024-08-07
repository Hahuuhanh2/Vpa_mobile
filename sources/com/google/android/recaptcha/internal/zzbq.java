package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzbq {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i10, long j10) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i10);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzbp();
        }
        zzbp zzbp = (zzbp) obj;
        zzbp.zzg(zzbp.zzb() + 1);
        zzbp.zzf(zzbp.zzd() + j10);
        zzbp.zze(Math.max(j10, zzbp.zzc()));
        concurrentHashMap.put(valueOf, zzbp);
    }
}
