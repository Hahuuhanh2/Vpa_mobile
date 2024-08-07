package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzdn {
    public static final zzoy zza(zzbt zzbt, zzbt zzbt2) {
        zzox zzf = zzoy.zzf();
        zzf.zzp(zznr.zzb(zzbt.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzf.zzq(zznp.zza(zzbt.zza(timeUnit)));
        zzf.zzd(zznr.zzb(zzbt2.zzb()));
        zzf.zze(zznp.zza(zzbt2.zza(timeUnit)));
        return (zzoy) zzf.zzj();
    }
}
