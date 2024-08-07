package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzlk {
    public static final List zza(Object obj, long j10) {
        int i10;
        zzkz zzkz = (zzkz) zzni.zzf(obj, j10);
        if (zzkz.zzc()) {
            return zzkz;
        }
        int size = zzkz.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        zzkz zzd = zzkz.zzd(i10);
        zzni.zzs(obj, j10, zzd);
        return zzd;
    }
}
