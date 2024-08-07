package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzev implements zzfe {
    public static final zzev zza = new zzev();

    private zzev() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        if (zzrrArr.length == 2) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object zza3 = zzek.zzc().zza(zzrrArr[1]);
                if (true != (zza3 instanceof String)) {
                    zza3 = null;
                }
                String str2 = (String) zza3;
                if (str2 != null) {
                    zzek.zzc().zze(i10, str.concat(str2));
                    return;
                }
                throw new zzby(4, 5, (Throwable) null);
            }
            throw new zzby(4, 5, (Throwable) null);
        }
        throw new zzby(4, 3, (Throwable) null);
    }
}
