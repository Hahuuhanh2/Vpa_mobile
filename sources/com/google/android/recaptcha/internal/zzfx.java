package com.google.android.recaptcha.internal;

import java.util.ArrayList;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzfx implements zzfe {
    public static final zzfx zza = new zzfx();

    private zzfx() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        Object obj;
        if (zzrrArr.length == 2) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzek.zzc().zza(zzrrArr[1]);
                if (true != (zza3 instanceof Integer)) {
                    zza3 = null;
                }
                Integer num = (Integer) zza3;
                if (num != null) {
                    int intValue = num.intValue();
                    if (zza2 instanceof Integer) {
                        obj = Integer.valueOf(((Number) zza2).intValue() - intValue);
                    } else if (zza2 instanceof int[]) {
                        ArrayList arrayList = new ArrayList(r1);
                        for (int i11 : (int[]) zza2) {
                            arrayList.add(Integer.valueOf(i11 - intValue));
                        }
                        obj = arrayList.toArray(new Integer[0]);
                    } else {
                        throw new zzby(4, 5, (Throwable) null);
                    }
                    zzek.zzc().zze(i10, obj);
                    return;
                }
                throw new zzby(4, 5, (Throwable) null);
            }
            throw new zzby(4, 5, (Throwable) null);
        }
        throw new zzby(4, 3, (Throwable) null);
    }
}
