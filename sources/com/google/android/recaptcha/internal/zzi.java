package com.google.android.recaptcha.internal;

import ek.f;
import ik.d;
import jk.a;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzi extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzl zzb;
    public int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzi(zzl zzl, d dVar) {
        super(dVar);
        this.zzb = zzl;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzc2 = this.zzb.zzc(0, (zzpq) null, this);
        if (zzc2 == a.COROUTINE_SUSPENDED) {
            return zzc2;
        }
        return new f(zzc2);
    }
}
