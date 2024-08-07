package com.google.android.recaptcha.internal;

import android.os.Build;
import ek.i;
import fk.h;
import ik.d;
import j7.a;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzn implements zzaa {
    private final zzdc zza;

    public zzn(zzdc zzdc) {
        this.zza = zzdc;
    }

    private static final zzrl zzg(String str) {
        zzrk zzf = zzrl.zzf();
        zzf.zzv(str);
        return (zzrl) zzf.zzj();
    }

    public final int zza() {
        return 11;
    }

    public final zzdc zzb() {
        return this.zza;
    }

    public final Object zzc(String str, d dVar) {
        zzdf zzb = zzab.zzb(this, str);
        zzrj zzf = zzrm.zzf();
        zzf.zzd(a.d0(zzg(Build.MANUFACTURER), zzg(Build.MODEL), zzg(Build.DEVICE), zzg(Build.HARDWARE), zzg(Build.FINGERPRINT), zzg(Build.PRODUCT), zzg(Build.BOARD), zzg(Build.BRAND), zzg(h.t0(Build.SUPPORTED_ABIS, ",", "[", "]", 56))));
        zzb.zza();
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
