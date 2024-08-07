package com.google.android.recaptcha.internal;

import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzmn extends zzmu {
    public zzmn(int i10) {
        super(i10, (zzmt) null);
    }

    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                ((zzkh) zzg(i10).getKey()).zzg();
            }
            for (Map.Entry key : zzc()) {
                ((zzkh) key.getKey()).zzg();
            }
        }
        super.zza();
    }
}
