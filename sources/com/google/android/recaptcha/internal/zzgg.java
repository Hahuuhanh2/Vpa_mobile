package com.google.android.recaptcha.internal;

import fk.p;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzgg implements zzge {
    private final zzgf zza;

    public zzgg(zzgf zzgf, zzgd zzgd) {
        this.zza = zzgf;
    }

    private final zzrg zzb(String str, List list) {
        if (str.length() != 0) {
            try {
                zzgc zzgc = new zzgc(this.zza.zza(p.a1(list)), 255, zzgc.zza);
                StringBuilder sb2 = new StringBuilder(str.length());
                for (int i10 = 0; i10 < str.length(); i10++) {
                    sb2.append((char) (str.charAt(i10) ^ ((int) zzgc.zza())));
                }
                return zzrg.zzg(zzhz.zzh().zzj(sb2.toString()));
            } catch (Exception e10) {
                throw new zzby(3, 18, e10);
            }
        } else {
            throw new zzby(3, 17, (Throwable) null);
        }
    }

    public final zzrg zza(zzro zzro) {
        zzgz zzb = zzgz.zzb();
        zzrg zzb2 = zzb(zzro.zzj(), zzro.zzk());
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i10 = zzbq.zza;
        zzbq.zza(zzbr.zzh.zza(), zza2);
        return zzb2;
    }
}
