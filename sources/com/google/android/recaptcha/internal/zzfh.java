package com.google.android.recaptcha.internal;

import fk.h;
import java.util.Arrays;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzfh implements zzfe {
    public static final zzfh zza = new zzfh();

    private zzfh() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        int length = zzrrArr.length;
        if (length != 0) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Class)) {
                zza2 = null;
            }
            Class cls = (Class) zza2;
            if (cls != null) {
                Class[] zzf = zzek.zzc().zzf(h.z0(zzrrArr).subList(1, length));
                try {
                    zzek.zzc().zze(i10, cls.getConstructor((Class[]) Arrays.copyOf(zzf, zzf.length)));
                } catch (Exception e10) {
                    throw new zzby(6, 9, e10);
                }
            } else {
                throw new zzby(4, 5, (Throwable) null);
            }
        } else {
            throw new zzby(4, 3, (Throwable) null);
        }
    }
}
