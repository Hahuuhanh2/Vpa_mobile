package com.google.android.recaptcha.internal;

import ik.d;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzah extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzap zzb;
    public int zzc;
    public zzap zzd;
    public String zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzah(zzap zzap, d dVar) {
        super(dVar);
        this.zzb = zzap;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzc((String) null, this);
    }
}
