package com.google.android.recaptcha.internal;

import al.d0;
import al.i1;
import ik.d;
import java.util.List;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzdx extends i implements p {
    public int zza;
    public final /* synthetic */ zzek zzb;
    public final /* synthetic */ List zzc;
    public final /* synthetic */ zzea zzd;
    private /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdx(zzek zzek, List list, zzea zzea, d dVar) {
        super(2, dVar);
        this.zzb = zzek;
        this.zzc = list;
        this.zzd = zzea;
    }

    public final d create(Object obj, d dVar) {
        zzdx zzdx = new zzdx(this.zzb, this.zzc, this.zzd, dVar);
        zzdx.zze = obj;
        return zzdx;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z10;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.zza;
        l0.Q0(obj);
        if (i10 == 0) {
            d0 d0Var = (d0) this.zze;
            while (true) {
                zzek zzek = this.zzb;
                if (zzek.zza() < 0) {
                    break;
                }
                if (zzek.zza() < this.zzc.size()) {
                    i1 i1Var = (i1) d0Var.s().get(i1.b.f19045a);
                    if (i1Var != null) {
                        z10 = i1Var.isActive();
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                    zzrs zzrs = (zzrs) this.zzc.get(this.zzb.zza());
                    try {
                        zzea.zzf(this.zzd, zzrs, this.zzb);
                    } catch (Exception e10) {
                        zzrs.zzk();
                        new Integer(zzrs.zzg());
                        fk.p.Q0(zzrs.zzj(), (String) null, (String) null, (String) null, new zzdw(this.zzd), 31);
                        zzea zzea = this.zzd;
                        zzek zzek2 = this.zzb;
                        this.zza = 1;
                        if (zzea.zzh(e10, zzek2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    break;
                }
            }
            return ek.i.f20112a;
        }
        return ek.i.f20112a;
    }
}
