package com.google.android.recaptcha.internal;

import ik.d;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzam extends c {
    public Object zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzap zzc;
    public int zzd;
    public zzap zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzam(zzap zzap, d dVar) {
        super(dVar);
        this.zzc = zzap;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zze(this);
    }
}
