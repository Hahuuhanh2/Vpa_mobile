package com.google.android.recaptcha.internal;

import al.d0;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzbn extends i implements p {
    public zzbn(d dVar) {
        super(2, dVar);
    }

    public final d create(Object obj, d dVar) {
        return new zzbn(dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        return new zzbn((d) obj2).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        Thread.currentThread().setPriority(8);
        return ek.i.f20112a;
    }
}
