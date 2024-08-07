package com.google.android.recaptcha.internal;

import ek.f;
import ik.d;
import jk.a;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzv extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzx zzb;
    public int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzv(zzx zzx, d dVar) {
        super(dVar);
        this.zzb = zzx;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzh = this.zzb.zzh((zzpq) null, this);
        if (zzh == a.COROUTINE_SUSPENDED) {
            return zzh;
        }
        return new f(zzh);
    }
}
