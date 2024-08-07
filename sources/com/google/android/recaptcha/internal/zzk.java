package com.google.android.recaptcha.internal;

import al.d0;
import al.j0;
import ek.f;
import ik.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzk extends i implements p {
    public int zza;
    public final /* synthetic */ zzl zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzpq zzd;
    private /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzl, long j10, zzpq zzpq, d dVar) {
        super(2, dVar);
        this.zzb = zzl;
        this.zzc = j10;
        this.zzd = zzpq;
    }

    public final d create(Object obj, d dVar) {
        zzk zzk = new zzk(this.zzb, this.zzc, this.zzd, dVar);
        zzk.zze = obj;
        return zzk;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        zzdf zzdf;
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zza != 0) {
            zzdf = (zzdf) this.zze;
            l0.Q0(obj);
        } else {
            l0.Q0(obj);
            d0 d0Var = (d0) this.zze;
            zzl zzl = this.zzb;
            zzdc zza2 = zzl.zza();
            zza2.zzc(zzl.zza().zzd());
            zzdf zzf = zza2.zzf(30);
            ArrayList arrayList = new ArrayList();
            for (zze zzj : this.zzb.zzd()) {
                arrayList.add(l0.h(d0Var, new zzj(zzj, this.zzc, this.zzd, (d) null)));
            }
            j0[] j0VarArr = (j0[]) arrayList.toArray(new j0[0]);
            this.zze = zzf;
            this.zza = 1;
            obj = al.d.a((j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length), this);
            if (obj == aVar) {
                return aVar;
            }
            zzdf = zzf;
        }
        List list = (List) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!(((f) it.next()).f20104a instanceof f.a)) {
                        zzdf.zza();
                        obj2 = ek.i.f20112a;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        zzbj zzbj = new zzbj(zzbh.zzb, zzbg.zzY, (String) null);
        zzdf.zzb(zzbj);
        obj2 = l0.A(zzbj);
        return new f(obj2);
    }
}
