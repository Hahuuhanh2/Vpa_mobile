package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ek.f;
import ik.d;
import jk.a;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzcr extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzcx zzb;
    public int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcr(zzcx zzcx, d dVar) {
        super(dVar);
        this.zzb = zzcx;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object r22 = this.zzb.m9executegIAlus((RecaptchaAction) null, this);
        if (r22 == a.COROUTINE_SUSPENDED) {
            return r22;
        }
        return new f(r22);
    }
}
