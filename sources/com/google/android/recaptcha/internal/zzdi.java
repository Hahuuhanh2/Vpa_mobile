package com.google.android.recaptcha.internal;

import al.d0;
import ik.d;
import java.util.Timer;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzdi extends i implements p {
    public final /* synthetic */ zzdk zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdi(zzdk zzdk, d dVar) {
        super(2, dVar);
        this.zza = zzdk;
    }

    public final d create(Object obj, d dVar) {
        return new zzdi(this.zza, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdi) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        zzdk zzdk = this.zza;
        synchronized (zzdg.class) {
            zzda zzb = zzdk.zze;
            if (zzb != null && zzb.zzb() == 0) {
                Timer zzc = zzdk.zza;
                if (zzc != null) {
                    zzc.cancel();
                }
                zzdk.zza = null;
            }
            zzdk.zzg();
        }
        return ek.i.f20112a;
    }
}
