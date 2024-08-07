package com.google.android.recaptcha.internal;

import al.d0;
import android.app.Application;
import android.webkit.WebView;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzcc extends i implements p {
    public int zza;
    public final /* synthetic */ Application zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcc(Application application, String str, long j10, zzdq zzdq, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j10;
    }

    public final d create(Object obj, d dVar) {
        return new zzcc(this.zzb, this.zzc, this.zzd, (zzdq) null, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.zza;
        l0.Q0(obj);
        if (i10 == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            long j10 = this.zzd;
            zzco zzco = zzco.zza;
            this.zza = 1;
            obj = zzco.zze(application, str, j10, new zzbv("https://www.recaptcha.net/recaptcha/api3"), (WebView) null, (zzdq) null, zzco.zzf, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
