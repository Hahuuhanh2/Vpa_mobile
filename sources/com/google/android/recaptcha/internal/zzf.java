package com.google.android.recaptcha.internal;

import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzf {
    public static final zzbj zza(Exception exc, zzbj zzbj) {
        if (exc instanceof TimeoutCancellationException) {
            return new zzbj(zzbh.zzb, zzbg.zzb, (String) null);
        }
        if (exc instanceof zzbj) {
            return (zzbj) exc;
        }
        return zzbj;
    }
}
