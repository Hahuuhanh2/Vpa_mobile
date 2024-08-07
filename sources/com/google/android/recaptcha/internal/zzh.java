package com.google.android.recaptcha.internal;

import al.d0;
import al.j0;
import ek.f;
import ik.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzh extends i implements p {
    public int zza;
    public final /* synthetic */ zzl zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzl, String str, long j10, d dVar) {
        super(2, dVar);
        this.zzb = zzl;
        this.zzc = str;
        this.zzd = j10;
    }

    public final d create(Object obj, d dVar) {
        zzh zzh = new zzh(this.zzb, this.zzc, this.zzd, dVar);
        zzh.zze = obj;
        return zzh;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        zzdf zzdf;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zza != 0) {
            zzdf = (zzdf) this.zze;
            l0.Q0(obj);
        } else {
            l0.Q0(obj);
            d0 d0Var = (d0) this.zze;
            zzl zzl = this.zzb;
            String str = this.zzc;
            zzdc zza2 = zzl.zza();
            zza2.zzc(str);
            zzdf zzf = zza2.zzf(31);
            ArrayList arrayList = new ArrayList();
            for (zze zze2 : this.zzb.zzd()) {
                if (zze2.zzl()) {
                    arrayList.add(l0.h(d0Var, new zzg(zze2, this.zzc, this.zzd, (d) null)));
                }
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
        String str2 = this.zzc;
        zzpv zzf2 = zzpw.zzf();
        zzf2.zzd(str2);
        for (f fVar : (List) obj) {
            Object obj2 = fVar.f20104a;
            if (!(obj2 instanceof f.a)) {
                zzf2.zzg((zzpw) obj2);
            }
        }
        zzpw zzpw = (zzpw) zzf2.zzj();
        zzdf.zza();
        return zzpw;
    }
}
