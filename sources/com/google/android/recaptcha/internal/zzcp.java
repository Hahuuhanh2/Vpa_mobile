package com.google.android.recaptcha.internal;

import ik.d;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzcp extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzcx zzb;
    public int zzc;
    public zzdf zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcp(zzcx zzcx, d dVar) {
        super(dVar);
        this.zzb = zzcx;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzf(0, (String) null, (zzdc) null, this);
    }
}
