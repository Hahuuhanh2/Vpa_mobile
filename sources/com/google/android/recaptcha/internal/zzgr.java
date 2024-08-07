package com.google.android.recaptcha.internal;

import al.a0;
import al.d0;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzgr extends i implements p {
    public final /* synthetic */ zzgv zza;
    public final /* synthetic */ zzpq zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgr(zzgv zzgv, zzpq zzpq, d dVar) {
        super(2, dVar);
        this.zza = zzgv;
        this.zzb = zzpq;
    }

    public final d create(Object obj, d dVar) {
        return new zzgr(this.zza, this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgr) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        try {
            zzgv zzgv = this.zza;
            l0.j0(this.zza.zzn.zzb(), (a0) null, new zzgq(this.zza, zzgv.zzp().zzb(this.zzb, zzgv.zzl), (d) null), 3);
        } catch (zzbj e10) {
            this.zza.zzu().z(e10);
        }
        return ek.i.f20112a;
    }
}
