package com.google.android.recaptcha.internal;

import ek.f;
import ik.d;
import jk.a;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zza extends c {
    public Object zza;
    public long zzb;
    public /* synthetic */ Object zzc;
    public final /* synthetic */ zze zzd;
    public int zze;
    public String zzf;
    public zzdf zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zza(zze zze2, d dVar) {
        super(dVar);
        this.zzd = zze2;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object zzc2 = this.zzd.zzc((String) null, 0, this);
        if (zzc2 == a.COROUTINE_SUSPENDED) {
            return zzc2;
        }
        return new f(zzc2);
    }
}
