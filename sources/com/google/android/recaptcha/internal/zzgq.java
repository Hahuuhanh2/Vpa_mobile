package com.google.android.recaptcha.internal;

import al.d0;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzgq extends i implements p {
    public final /* synthetic */ zzgv zza;
    public final /* synthetic */ String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgq(zzgv zzgv, String str, d dVar) {
        super(2, dVar);
        this.zza = zzgv;
        this.zzb = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzgq(this.zza, this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgq) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        this.zza.zzm().clearCache(true);
        zzgv.zzv(this.zza, this.zzb);
        return ek.i.f20112a;
    }
}
