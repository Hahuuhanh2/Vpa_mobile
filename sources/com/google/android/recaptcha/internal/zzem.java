package com.google.android.recaptcha.internal;

import java.util.HashMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzem {
    private final zzel zza;
    private final HashMap zzb;
    private final zzed zzc;
    private final zzcb zzd;

    public zzem(zzed zzed, zzcb zzcb, zzbu zzbu) {
        this.zzc = zzed;
        this.zzd = zzcb;
        zzel zzel = new zzel();
        this.zza = zzel;
        HashMap hashMap = new HashMap();
        this.zzb = hashMap;
        zzel.zzd(173, hashMap);
    }

    public final zzel zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza.zzc();
        this.zza.zzd(173, this.zzb);
    }

    public final zzcb zzc() {
        return this.zzd;
    }

    public final zzed zzd() {
        return this.zzc;
    }

    public final void zze(int i10, Object obj) {
        this.zzb.put(Integer.valueOf(i10 - 2), obj);
    }
}
