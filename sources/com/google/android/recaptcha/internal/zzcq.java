package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ek.f;
import ik.d;
import jk.a;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzcq extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzcx zzb;
    public int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcq(zzcx zzcx, d dVar) {
        super(dVar);
        this.zzb = zzcx;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object r42 = this.zzb.m8execute0E7RQCE((RecaptchaAction) null, 0, this);
        if (r42 == a.COROUTINE_SUSPENDED) {
            return r42;
        }
        return new f(r42);
    }
}
