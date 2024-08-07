package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zznp {
    static {
        zzjz zzi = zzka.zzi();
        zzi.zze(-315576000000L);
        zzi.zzd(-999999999);
        zzka zzka = (zzka) zzi.zzj();
        zzjz zzi2 = zzka.zzi();
        zzi2.zze(315576000000L);
        zzi2.zzd(999999999);
        zzka zzka2 = (zzka) zzi2.zzj();
        zzjz zzi3 = zzka.zzi();
        zzi3.zze(0);
        zzi3.zzd(0);
        zzka zzka3 = (zzka) zzi3.zzj();
    }

    public static zzka zza(long j10) {
        int i10;
        int i11 = (int) (j10 % 1000000000);
        long j11 = j10 / 1000000000;
        if (i11 <= -1000000000 || i11 >= 1000000000) {
            j11 = zzic.zza(j11, (long) (i11 / 1000000000));
            i11 %= 1000000000;
        }
        if (j11 > 0 && i11 < 0) {
            i11 += 1000000000;
            j11--;
        }
        if (j11 < 0 && i11 > 0) {
            i11 -= 1000000000;
            j11++;
        }
        zzjz zzi = zzka.zzi();
        zzi.zze(j11);
        zzi.zzd(i11);
        zzka zzka = (zzka) zzi.zzj();
        long zzg = zzka.zzg();
        int zzf = zzka.zzf();
        if (zzg >= -315576000000L && zzg <= 315576000000L && ((long) zzf) >= -999999999 && zzf < 1000000000 && ((zzg >= 0 && zzf >= 0) || (i10 <= 0 && zzf <= 0))) {
            return zzka;
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", new Object[]{Long.valueOf(zzg), Integer.valueOf(zzf)}));
    }
}
