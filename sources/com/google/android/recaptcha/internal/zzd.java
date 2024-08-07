package com.google.android.recaptcha.internal;

import al.d0;
import ek.f;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzd extends i implements p {
    public int zza;
    public final /* synthetic */ zze zzb;
    public final /* synthetic */ zzpq zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzd(zze zze, zzpq zzpq, d dVar) {
        super(2, dVar);
        this.zzb = zze;
        this.zzc = zzpq;
    }

    public final d create(Object obj, d dVar) {
        return new zzd(this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.zza;
        l0.Q0(obj);
        if (i10 != 0) {
            obj2 = ((f) obj).f20104a;
        } else {
            zze zze = this.zzb;
            zzpq zzpq = this.zzc;
            this.zza = 1;
            obj2 = zze.zzh(zzpq, this);
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return new f(obj2);
    }
}
