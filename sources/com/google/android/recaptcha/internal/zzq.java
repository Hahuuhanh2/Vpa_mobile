package com.google.android.recaptcha.internal;

import ik.d;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzq extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzx zzb;
    public int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzq(zzx zzx, d dVar) {
        super(dVar);
        this.zzb = zzx;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzu((String) null, (zzaa) null, this);
    }
}
