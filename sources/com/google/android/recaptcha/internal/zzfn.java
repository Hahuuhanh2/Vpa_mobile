package com.google.android.recaptcha.internal;

import fk.h;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzfn implements zzfe {
    public static final zzfn zza = new zzfn();

    private zzfn() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        int length = zzrrArr.length;
        if (length != 0) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Method)) {
                zza2 = null;
            }
            Method method = (Method) zza2;
            if (method != null) {
                Object[] zzg = zzek.zzc().zzg(h.z0(zzrrArr).subList(1, length));
                try {
                    zzek.zzc().zze(i10, method.invoke((Object) null, Arrays.copyOf(zzg, zzg.length)));
                } catch (Exception e10) {
                    throw new zzby(6, 15, e10);
                }
            } else {
                throw new zzby(4, 5, (Throwable) null);
            }
        } else {
            throw new zzby(4, 3, (Throwable) null);
        }
    }
}
