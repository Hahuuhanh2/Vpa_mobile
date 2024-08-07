package com.google.android.recaptcha.internal;

import fk.h;
import java.util.Arrays;
import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzfj implements zzfe {
    public static final zzfj zza = new zzfj();

    private zzfj() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        Class<?> cls;
        int length = zzrrArr.length;
        if (length >= 2) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof Class) {
                    cls = (Class) zza2;
                } else {
                    cls = zza2.getClass();
                }
                Object zza3 = zzek.zzc().zza(zzrrArr[1]);
                if (true != (zza3 instanceof String)) {
                    zza3 = null;
                }
                String str = (String) zza3;
                if (str != null) {
                    String zza4 = zzek.zzh().zza(str);
                    if (!j.a(zza4, "forName")) {
                        Class[] zzf = zzek.zzc().zzf(h.z0(zzrrArr).subList(2, length));
                        try {
                            zzek.zzc().zze(i10, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzf, zzf.length)));
                        } catch (Exception e10) {
                            throw new zzby(6, 13, e10);
                        }
                    } else {
                        throw new zzby(6, 48, (Throwable) null);
                    }
                } else {
                    throw new zzby(4, 5, (Throwable) null);
                }
            } else {
                throw new zzby(4, 5, (Throwable) null);
            }
        } else {
            throw new zzby(4, 3, (Throwable) null);
        }
    }
}
