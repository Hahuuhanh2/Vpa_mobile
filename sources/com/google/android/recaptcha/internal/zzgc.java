package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzgc {
    /* access modifiers changed from: private */
    public static final zzgb zza = new zzgb(11, ((long) Math.pow(2.0d, 32.0d)) ^ 20919936621L, (long) Math.pow(2.0d, 48.0d));
    private final zzgb zzb;
    private long zzc;

    public zzgc(long j10, long j11, zzgb zzgb) {
        this.zzb = zzgb;
        this.zzc = Math.abs(j10);
    }

    public final long zza() {
        zzgb zzgb = this.zzb;
        long longValue = (BigInteger.valueOf(zzgb.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzgb.zza())).longValue() + 11) % this.zzb.zza();
        this.zzc = longValue;
        return longValue % 255;
    }
}
