package com.google.android.recaptcha.internal;

import ek.f;
import ik.d;
import jk.a;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzc extends c {
    public Object zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zze zzc;
    public int zzd;
    public zzdf zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzc(zze zze2, d dVar) {
        super(dVar);
        this.zzc = zze2;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zze2 = this.zzc.zze(0, (zzpq) null, this);
        if (zze2 == a.COROUTINE_SUSPENDED) {
            return zze2;
        }
        return new f(zze2);
    }
}
