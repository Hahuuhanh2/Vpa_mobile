package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzfk implements zzfe {
    public static final zzfk zza = new zzfk();

    private zzfk() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        if (zzrrArr.length == 2) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Field)) {
                zza2 = null;
            }
            Field field = (Field) zza2;
            if (field != null) {
                try {
                    zzek.zzc().zze(i10, field.get(zzek.zzc().zza(zzrrArr[1])));
                } catch (Exception e10) {
                    throw new zzby(6, 16, e10);
                }
            } else {
                throw new zzby(4, 5, (Throwable) null);
            }
        } else {
            throw new zzby(4, 3, (Throwable) null);
        }
    }
}
