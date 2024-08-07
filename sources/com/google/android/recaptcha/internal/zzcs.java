package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ek.f;
import ik.d;
import jk.a;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzcs extends c {
    public Object zza;
    public Object zzb;
    public double zzc;
    public /* synthetic */ Object zzd;
    public final /* synthetic */ zzcx zze;
    public int zzf;
    public zzcx zzg;
    public zzdf zzh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcs(zzcx zzcx, d dVar) {
        super(dVar);
        this.zze = zzcx;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzd = obj;
        this.zzf |= Integer.MIN_VALUE;
        Object zzd2 = this.zze.zzg((RecaptchaAction) null, 0, this);
        if (zzd2 == a.COROUTINE_SUSPENDED) {
            return zzd2;
        }
        return new f(zzd2);
    }
}
