package com.google.android.recaptcha;

import android.app.Application;
import ek.f;
import ik.d;
import jk.a;
import kk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class Recaptcha$getClient$1 extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ Recaptcha zzb;
    public int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object r72 = this.zzb.m5getClientBWLJW6A((Application) null, (String) null, 0, this);
        if (r72 == a.COROUTINE_SUSPENDED) {
            return r72;
        }
        return new f(r72);
    }
}
