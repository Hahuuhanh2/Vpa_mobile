package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzfs implements zzfe {
    public static final zzfs zza = new zzfs();

    private zzfs() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        if (zzrrArr.length == 1) {
            zzek.zzc().zze(i10, zzek.zzc().zza(zzrrArr[0]));
            return;
        }
        throw new zzby(4, 3, (Throwable) null);
    }
}
