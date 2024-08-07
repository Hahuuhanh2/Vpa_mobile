package com.google.android.recaptcha.internal;

import al.a0;
import al.d0;
import al.i1;
import ek.f;
import ik.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzu extends i implements p {
    public int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzx zzc;
    private /* synthetic */ Object zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzu(String str, zzx zzx, d dVar) {
        super(2, dVar);
        this.zzb = str;
        this.zzc = zzx;
    }

    public final d create(Object obj, d dVar) {
        zzu zzu = new zzu(this.zzb, this.zzc, dVar);
        zzu.zzd = obj;
        return zzu;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.zza;
        l0.Q0(obj);
        if (i10 == 0) {
            d0 d0Var = (d0) this.zzd;
            String str = this.zzb;
            zzqm zzf = zzqn.zzf();
            zzf.zze(str);
            zzx zzx = this.zzc;
            zzx.zzr().put(this.zzb, zzf);
            ArrayList arrayList = new ArrayList();
            List zzq = this.zzc.zzb;
            ArrayList arrayList2 = new ArrayList();
            for (Object next : zzq) {
                if (((zzaa) next).zzf()) {
                    arrayList2.add(next);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(l0.j0(d0Var, (a0) null, new zzt(this.zzc, this.zzb, (zzaa) it.next(), zzf, (d) null), 3));
            }
            i1[] i1VarArr = (i1[]) arrayList.toArray(new i1[0]);
            this.zza = 1;
            if (al.d.c((i1[]) Arrays.copyOf(i1VarArr, i1VarArr.length), this) == aVar) {
                return aVar;
            }
        }
        return new f(this.zzc.zzt(this.zzb));
    }
}
