package com.google.android.recaptcha.internal;

import al.d0;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzal extends i implements p {
    public int zza;
    public final /* synthetic */ zzap zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzal(zzap zzap, d dVar) {
        super(2, dVar);
        this.zzb = zzap;
    }

    public final d create(Object obj, d dVar) {
        return new zzal(this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.zza;
        l0.Q0(obj);
        if (i10 == 0) {
            this.zzb.zze = zzat.zza;
            zzap zzap = this.zzb;
            this.zza = 1;
            if (zzap.zze(this) == aVar) {
                return aVar;
            }
        }
        return ek.i.f20112a;
    }
}
