package com.google.android.recaptcha.internal;

import fk.h;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzfq implements zzfe {
    public static final zzfq zza = new zzfq();

    private zzfq() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        Constructor<?> constructor;
        int length = zzrrArr.length;
        if (length != 0) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof Constructor) {
                    constructor = (Constructor) zza2;
                } else {
                    constructor = zza2.getClass().getConstructor(new Class[0]);
                }
                Object[] zzg = zzek.zzc().zzg(h.z0(zzrrArr).subList(1, length));
                try {
                    zzek.zzc().zze(i10, constructor.newInstance(Arrays.copyOf(zzg, zzg.length)));
                } catch (Exception e10) {
                    throw new zzby(6, 14, e10);
                }
            } else {
                throw new zzby(4, 5, (Throwable) null);
            }
        } else {
            throw new zzby(4, 3, (Throwable) null);
        }
    }
}
