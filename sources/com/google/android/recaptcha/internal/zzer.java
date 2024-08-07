package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzer implements zzfe {
    public static final zzer zza = new zzer();

    private zzer() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        int length = zzrrArr.length;
        if (length != 0) {
            zzrj zzf = zzrm.zzf();
            int i11 = 0;
            while (i11 < length) {
                Object zza2 = zzek.zzc().zza(zzrrArr[i11]);
                if (zza2 != null) {
                    zzrk zzf2 = zzrl.zzf();
                    if (zza2 instanceof Integer) {
                        zzf2.zzt(((Number) zza2).intValue());
                    } else if (zza2 instanceof Short) {
                        zzf2.zzs(((Number) zza2).shortValue());
                    } else if (zza2 instanceof Byte) {
                        zzf2.zze(zziv.zzk(new byte[]{((Number) zza2).byteValue()}, 0, 1));
                    } else if (zza2 instanceof Long) {
                        zzf2.zzu(((Number) zza2).longValue());
                    } else if (zza2 instanceof Double) {
                        zzf2.zzq(((Number) zza2).doubleValue());
                    } else if (zza2 instanceof Float) {
                        zzf2.zzr(((Number) zza2).floatValue());
                    } else if (zza2 instanceof Boolean) {
                        zzf2.zzd(((Boolean) zza2).booleanValue());
                    } else if (zza2 instanceof Character) {
                        zzf2.zzp(zza2.toString());
                    } else if (zza2 instanceof String) {
                        zzf2.zzv((String) zza2);
                    } else {
                        zzf2.zzv(zza2.toString());
                    }
                    zzf.zze((zzrl) zzf2.zzj());
                    i11++;
                } else {
                    throw new zzby(4, 4, (Throwable) null);
                }
            }
            zzel zzc = zzek.zzc();
            byte[] zzd = ((zzrm) zzf.zzj()).zzd();
            zzc.zze(i10, zzhz.zzh().zzi(zzd, 0, zzd.length));
            return;
        }
        throw new zzby(4, 3, (Throwable) null);
    }
}
