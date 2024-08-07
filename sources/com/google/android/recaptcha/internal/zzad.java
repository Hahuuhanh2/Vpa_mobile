package com.google.android.recaptcha.internal;

import android.os.Build;
import ek.i;
import ik.d;
import j7.a;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzad implements zzaa {
    private final zzdc zza;

    public zzad(zzdc zzdc) {
        this.zza = zzdc;
    }

    public final int zza() {
        return 10;
    }

    public final zzdc zzb() {
        return this.zza;
    }

    public final Object zzc(String str, d dVar) {
        zzdf zzb = zzab.zzb(this, str);
        int i10 = Build.VERSION.SDK_INT;
        zzb.zza();
        zzrj zzf = zzrm.zzf();
        zzrk zzf2 = zzrl.zzf();
        zzf2.zzv(String.valueOf(i10));
        zzf.zzd(a.c0(zzf2.zzj()));
        return zzab.zza(this, (zzrm) zzf.zzj());
    }

    public final Object zzd(zzps zzps, d dVar) {
        zzab.zzc(this).zza();
        return i.f20112a;
    }

    public final void zze(zzqf zzqf) {
    }

    public final boolean zzf() {
        return true;
    }
}
