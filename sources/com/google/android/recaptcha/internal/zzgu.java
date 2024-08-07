package com.google.android.recaptcha.internal;

import ek.f;
import ik.d;
import jk.a;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzgu extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzgv zzb;
    public int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgu(zzgv zzgv, d dVar) {
        super(dVar);
        this.zzb = zzgv;
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
