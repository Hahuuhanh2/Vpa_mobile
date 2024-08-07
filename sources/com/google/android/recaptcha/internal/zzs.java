package com.google.android.recaptcha.internal;

import ek.f;
import ik.d;
import jk.a;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzs extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzx zzb;
    public int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzs(zzx zzx, d dVar) {
        super(dVar);
        this.zzb = zzx;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzf = this.zzb.zzf((String) null, this);
        if (zzf == a.COROUTINE_SUSPENDED) {
            return zzf;
        }
        return new f(zzf);
    }
}
