package com.google.android.recaptcha.internal;

import f0.b0;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzgz {
    private boolean zza;
    private long zzb;
    private long zzc;

    public static zzgz zzb() {
        zzgz zzgz = new zzgz();
        zzgz.zze();
        return zzgz;
    }

    public static zzgz zzc() {
        return new zzgz();
    }

    private final long zzg() {
        if (this.zza) {
            return (System.nanoTime() - this.zzc) + this.zzb;
        }
        return this.zzb;
    }

    public final String toString() {
        String str;
        long zzg = zzg();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(zzg, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String format = String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(((double) zzg) / ((double) timeUnit2.convert(1, timeUnit)))});
        switch (zzgy.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return b0.s(format, " ", str);
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
    }

    public final zzgz zzd() {
        this.zzb = 0;
        this.zza = false;
        return this;
    }

    public final zzgz zze() {
        zzgx.zze(!this.zza, "This stopwatch is already running.");
        this.zza = true;
        this.zzc = System.nanoTime();
        return this;
    }

    public final zzgz zzf() {
        long nanoTime = System.nanoTime();
        zzgx.zze(this.zza, "This stopwatch is already stopped.");
        this.zza = false;
        this.zzb = (nanoTime - this.zzc) + this.zzb;
        return this;
    }
}
