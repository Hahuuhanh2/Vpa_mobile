package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zznr {
    private static final ThreadLocal zza = new zznq();

    static {
        zzmy zzi = zzmz.zzi();
        zzi.zze(-62135596800L);
        zzi.zzd(0);
        zzmz zzmz = (zzmz) zzi.zzj();
        zzmy zzi2 = zzmz.zzi();
        zzi2.zze(253402300799L);
        zzi2.zzd(999999999);
        zzmz zzmz2 = (zzmz) zzi2.zzj();
        zzmy zzi3 = zzmz.zzi();
        zzi3.zze(0);
        zzi3.zzd(0);
        zzmz zzmz3 = (zzmz) zzi3.zzj();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzmz zza(zzmz zzmz) {
        long zzg = zzmz.zzg();
        boolean zze = zze(zzg);
        int zzf = zzmz.zzf();
        if (zze && zzf >= 0 && zzf < 1000000000) {
            return zzmz;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", new Object[]{Long.valueOf(zzg), Integer.valueOf(zzf)}));
    }

    public static zzmz zzb(long j10) {
        long j11 = j10 / 1000;
        if (zze(j11)) {
            int i10 = (int) ((j10 % 1000) * 1000000);
            if (i10 <= -1000000000 || i10 >= 1000000000) {
                j11 = zzic.zza(j11, (long) (i10 / 1000000000));
                i10 %= 1000000000;
            }
            if (i10 < 0) {
                i10 += 1000000000;
                j11 = zzic.zzb(j11, 1);
            }
            zzmy zzi = zzmz.zzi();
            zzi.zze(j11);
            zzi.zzd(i10);
            zzmz zzmz = (zzmz) zzi.zzj();
            zza(zzmz);
            return zzmz;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", new Object[]{Long.valueOf(j11)}));
    }

    public static String zzc(zzmz zzmz) {
        String str;
        zza(zzmz);
        long zzg = zzmz.zzg();
        int zzf = zzmz.zzf();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((SimpleDateFormat) zza.get()).format(new Date(zzg * 1000)));
        if (zzf != 0) {
            sb2.append(".");
            if (zzf % 1000000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$03d", new Object[]{Integer.valueOf(zzf / 1000000)});
            } else if (zzf % 1000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$06d", new Object[]{Integer.valueOf(zzf / 1000)});
            } else {
                str = String.format(Locale.ENGLISH, "%1$09d", new Object[]{Integer.valueOf(zzf)});
            }
            sb2.append(str);
        }
        sb2.append("Z");
        return sb2.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j10) {
        return j10 >= -62135596800L && j10 <= 253402300799L;
    }
}
