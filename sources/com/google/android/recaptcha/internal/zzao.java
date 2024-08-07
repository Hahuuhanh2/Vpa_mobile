package com.google.android.recaptcha.internal;

import al.d0;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;
import sk.r;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzao extends i implements p {
    public Object zza;
    public int zzb;
    public final /* synthetic */ zzap zzc;
    public final /* synthetic */ zzdf zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzao(zzap zzap, zzdf zzdf, d dVar) {
        super(2, dVar);
        this.zzc = zzap;
        this.zzd = zzdf;
    }

    public final d create(Object obj, d dVar) {
        return new zzao(this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        Exception e10;
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zzb != 0) {
            obj2 = this.zza;
            try {
                l0.Q0(obj);
            } catch (Exception e11) {
                e10 = e11;
            }
        } else {
            l0.Q0(obj);
            r rVar = new r();
            try {
                zzan zzan = new zzan(this.zzc, this.zzd, rVar, (d) null);
                this.zza = rVar;
                this.zzb = 1;
                if (l0.W0(60000, zzan, this) == aVar) {
                    return aVar;
                }
            } catch (Exception e12) {
                Exception exc = e12;
                obj2 = rVar;
                e10 = exc;
                al.r zzf = this.zzc.zzf();
                Throwable th2 = (Throwable) ((r) obj2).f22931a;
                if (th2 == null) {
                    th2 = e10;
                }
                zzf.z(th2);
                this.zzc.zze = zzat.zza;
                this.zzd.zzb(new zzbj(zzbh.zzb, zzbg.zza, e10.getMessage()));
                return ek.i.f20112a;
            }
        }
        return ek.i.f20112a;
    }
}
