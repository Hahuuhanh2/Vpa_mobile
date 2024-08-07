package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzfg implements zzfe {
    public static final zzfg zza = new zzfg();

    private zzfg() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        if (zzrrArr.length == 1) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                try {
                    if (zza2 instanceof String) {
                        zza2 = zzek.zzh().zza((String) zza2);
                    }
                    zzek.zzc().zze(i10, zzej.zza(zza2));
                } catch (zzby e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new zzby(6, 8, e11);
                }
            } else {
                throw new zzby(4, 5, (Throwable) null);
            }
        } else {
            throw new zzby(4, 3, (Throwable) null);
        }
    }
}
