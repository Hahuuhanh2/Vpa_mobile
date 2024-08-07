package com.google.android.recaptcha.internal;

import rk.a;
import sk.k;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzcw extends k implements a {
    public static final zzcw zza = new zzcw();

    public zzcw() {
        super(0);
    }

    public final Object invoke() {
        int i10 = zzbb.zza;
        Object zzb = zzba.zza().zzb(915034668);
        if (zzb != null) {
            return (zzbk) zzb;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.abuse.recaptcha.common.NetworkStatus");
    }
}
