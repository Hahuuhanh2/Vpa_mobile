package com.google.android.recaptcha.internal;

import al.d0;
import ik.d;
import jk.a;
import kk.i;
import kotlin.NoWhenBranchMatchedException;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzr extends i implements p {
    public int zza;
    public final /* synthetic */ zzaa zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzx zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzr(zzaa zzaa, String str, zzx zzx, d dVar) {
        super(2, dVar);
        this.zzb = zzaa;
        this.zzc = str;
        this.zzd = zzx;
    }

    public final d create(Object obj, d dVar) {
        return new zzr(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.zza;
        l0.Q0(obj);
        if (i10 == 0) {
            zzaa zzaa = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzaa.zzc(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        zzac zzac = (zzac) obj;
        zzqj zzf = zzql.zzf();
        zzf.zzp(3);
        if (zzac instanceof zzz) {
            zzf.zze(zzx.zzp(this.zzd, ((zzz) zzac).zza()));
        } else if (zzac instanceof zzy) {
            zzf.zzd(zzx.zzo(this.zzd, ((zzy) zzac).zza()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return zzf;
    }
}
