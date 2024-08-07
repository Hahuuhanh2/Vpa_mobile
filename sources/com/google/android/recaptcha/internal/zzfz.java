package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzfz implements zzfe {
    public static final zzfz zza = new zzfz();

    private zzfz() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        int length = zzrrArr.length;
        if (length == 2) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object zza3 = zzek.zzc().zza(zzrrArr[1]);
                if (true != (zza3 instanceof zzbt)) {
                    zza3 = null;
                }
                zzbt zzbt = (zzbt) zza3;
                if (zzbt != null) {
                    byte[] zzd = zzdn.zza(zzek.zzb(), zzbt).zzd();
                    zzek.zzi().zzb(str, zzhz.zzh().zzi(zzd, 0, zzd.length));
                    return;
                }
                throw new zzby(4, 5, (Throwable) null);
            }
            throw new zzby(4, 5, (Throwable) null);
        } else if (length == 0) {
            zzek.zzc().zze(i10, new zzbt());
        } else {
            throw new zzby(4, 3, (Throwable) null);
        }
    }
}
