package com.google.android.recaptcha.internal;

import al.d0;
import com.google.android.recaptcha.RecaptchaAction;
import ek.f;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzct extends i implements p {
    public int zza;
    public final /* synthetic */ zzcx zzb;
    public final /* synthetic */ RecaptchaAction zzc;
    public final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzct(zzcx zzcx, RecaptchaAction recaptchaAction, long j10, d dVar) {
        super(2, dVar);
        this.zzb = zzcx;
        this.zzc = recaptchaAction;
        this.zzd = j10;
    }

    public final d create(Object obj, d dVar) {
        return new zzct(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.zza;
        l0.Q0(obj);
        if (i10 != 0) {
            obj2 = ((f) obj).f20104a;
        } else {
            zzcx zzcx = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            obj2 = zzcx.zzg(recaptchaAction, j10, this);
            if (obj2 == aVar) {
                return aVar;
            }
        }
        l0.Q0(obj2);
        return obj2;
    }
}
