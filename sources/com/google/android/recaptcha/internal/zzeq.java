package com.google.android.recaptcha.internal;

import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzeq implements zzfe {
    public static final zzeq zza = new zzeq();

    private zzeq() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        if (zzrrArr.length == 3) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Integer)) {
                zza2 = null;
            }
            Integer num = (Integer) zza2;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    Object zza3 = zzek.zzc().zza(zzrrArr[1]);
                    if (true != (zza3 instanceof Object)) {
                        zza3 = null;
                    }
                    if (zza3 != null) {
                        Object zza4 = zzek.zzc().zza(zzrrArr[2]);
                        if (true != (zza4 instanceof Object)) {
                            zza4 = null;
                        }
                        if (zza4 == null) {
                            throw new zzby(4, 5, (Throwable) null);
                        } else if (j.a(zza3, zza4)) {
                            zzek.zzg(zzek.zza() + intValue);
                        }
                    } else {
                        throw new zzby(4, 5, (Throwable) null);
                    }
                } else {
                    throw new zzby(4, 6, (Throwable) null);
                }
            } else {
                throw new zzby(4, 5, (Throwable) null);
            }
        } else {
            throw new zzby(4, 3, (Throwable) null);
        }
    }
}
