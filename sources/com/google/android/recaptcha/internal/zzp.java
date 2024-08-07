package com.google.android.recaptcha.internal;

import al.g0;
import ek.e;
import ek.i;
import ik.d;
import j7.a;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzp implements zzaa {
    private final zzdc zza;
    private final zzbl zzb;
    private boolean zzc = true;

    public zzp(zzdc zzdc, zzbl zzbl) {
        this.zza = zzdc;
        this.zzb = zzbl;
    }

    public final int zza() {
        return 25;
    }

    public final zzdc zzb() {
        return this.zza;
    }

    public final Object zzc(String str, d dVar) {
        zzbl zzbl = this.zzb;
        zzdf zzb2 = zzab.zzb(this, str);
        String zza2 = zzbl.zza();
        zzb2.zza();
        zzrj zzf = zzrm.zzf();
        zzrk zzf2 = zzrl.zzf();
        zzf2.zzv(zza2);
        zzf.zzd(a.c0(zzf2.zzj()));
        return zzab.zza(this, (zzrm) zzf.zzj());
    }

    public final Object zzd(zzps zzps, d dVar) {
        zzdf zzc2 = zzab.zzc(this);
        if (zzps.zzJ().length() == 0) {
            this.zzc = false;
            zzc2.zzb(new zzbj(zzbh.zzb, zzbg.zzac, (String) null));
            return i.f20112a;
        }
        this.zzb.zzb(g0.e0(new e("_GRECAPTCHA_KC", zzps.zzJ())));
        zzc2.zza();
        return i.f20112a;
    }

    public final void zze(zzqf zzqf) {
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
