package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzes implements zzfe {
    public static final zzes zza = new zzes();

    private zzes() {
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
                if (zza3 == null) {
                    throw new zzby(4, 4, (Throwable) null);
                } else if (!(zza3 instanceof Integer) && !(zza3 instanceof Short) && !(zza3 instanceof Byte) && !(zza3 instanceof Long) && !(zza3 instanceof Double) && !(zza3 instanceof Float) && !(zza3 instanceof Boolean) && !(zza3 instanceof Character) && !(zza3 instanceof String)) {
                    throw new zzby(4, 7, (Throwable) null);
                } else {
                    zzek.zzi().zzb(str, zza3.toString());
                }
            } else {
                throw new zzby(4, 5, (Throwable) null);
            }
        } else {
            throw new zzby(4, 3, (Throwable) null);
        }
    }
}
