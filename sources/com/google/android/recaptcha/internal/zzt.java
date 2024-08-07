package com.google.android.recaptcha.internal;

import al.d0;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzt extends i implements p {
    public int zza;
    public final /* synthetic */ zzx zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzaa zzd;
    public final /* synthetic */ zzqm zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzt(zzx zzx, String str, zzaa zzaa, zzqm zzqm, d dVar) {
        super(2, dVar);
        this.zzb = zzx;
        this.zzc = str;
        this.zzd = zzaa;
        this.zze = zzqm;
    }

    public final d create(Object obj, d dVar) {
        return new zzt(this.zzb, this.zzc, this.zzd, this.zze, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzt) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.zza;
        l0.Q0(obj);
        if (i10 == 0) {
            zzx zzx = this.zzb;
            String str = this.zzc;
            zzaa zzaa = this.zzd;
            this.zza = 1;
            obj = zzx.zzu(str, zzaa, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.zze.zzd((zzqj) obj);
        return ek.i.f20112a;
    }
}
