package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import ek.i;
import ik.d;
import j7.a;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzm implements zzaa {
    private final zzdc zza;
    private final ContentResolver zzb;

    public zzm(zzdc zzdc, ContentResolver contentResolver) {
        this.zza = zzdc;
        this.zzb = contentResolver;
    }

    public final int zza() {
        return 17;
    }

    public final zzdc zzb() {
        return this.zza;
    }

    public final Object zzc(String str, d dVar) {
        ContentResolver contentResolver = this.zzb;
        zzdf zzb2 = zzab.zzb(this, str);
        String zza2 = zzau.zza(contentResolver);
        zzb2.zza();
        zzrj zzf = zzrm.zzf();
        zzrk zzf2 = zzrl.zzf();
        zzf2.zzv(zza2);
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
