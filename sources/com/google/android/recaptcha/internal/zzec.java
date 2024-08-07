package com.google.android.recaptcha.internal;

import al.d0;
import android.webkit.ValueCallback;
import ik.d;
import java.util.ArrayList;
import jk.a;
import kk.i;
import p3.l0;
import rk.l;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzec extends i implements p {
    public final /* synthetic */ String[] zza;
    public final /* synthetic */ zzed zzb;
    public final /* synthetic */ String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzec(String[] strArr, zzed zzed, String str, d dVar) {
        super(2, dVar);
        this.zza = strArr;
        this.zzb = zzed;
        this.zzc = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzec(this.zza, this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzec) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        ArrayList arrayList = new ArrayList(r0);
        for (String str : this.zza) {
            arrayList.add("\"" + str + "\"");
        }
        zzed zzed = this.zzb;
        String str2 = this.zzc;
        zzed.zza.evaluateJavascript(str2 + "(" + fk.p.Q0(arrayList, ",", (String) null, (String) null, (l) null, 62) + ")", (ValueCallback) null);
        return ek.i.f20112a;
    }
}
