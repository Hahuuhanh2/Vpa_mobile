package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzce extends i implements p {
    public int zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ Application zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ zzbv zzf;
    public final /* synthetic */ zzbo zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzce(String str, Application application, long j10, zzbv zzbv, WebView webView, zzdq zzdq, zzbo zzbo, d dVar) {
        super(2, dVar);
        this.zzc = str;
        this.zzd = application;
        this.zze = j10;
        this.zzf = zzbv;
        this.zzg = zzbo;
    }

    public final d create(Object obj, d dVar) {
        zzce zzce = new zzce(this.zzc, this.zzd, this.zze, this.zzf, (WebView) null, (zzdq) null, this.zzg, dVar);
        zzce.zzb = obj;
        return zzce;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzce) create((zzdc) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.zza;
        l0.Q0(obj);
        if (i10 == 0) {
            zzdc zzdc = (zzdc) this.zzb;
            String str = this.zzc;
            zzco zzco = zzco.zza;
            zzcx zza2 = zzco.zza(zzco, str);
            if (zza2 != null) {
                return zza2;
            }
            Application application = this.zzd;
            if (this.zze < 5000) {
                throw new zzbj(zzbh.zzj, zzbg.zzI, (String) null);
            } else if (k1.a.checkSelfPermission(application, "android.permission.INTERNET") == 0) {
                Application application2 = this.zzd;
                String str2 = this.zzc;
                long j10 = this.zze;
                zzbv zzbv = this.zzf;
                zzbo zzbo = this.zzg;
                this.zza = 1;
                obj = zzco.zzm(application2, str2, j10, zzbv, (WebView) null, (zzdq) null, zzbo, zzdc, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                throw new zzbj(zzbh.zzc, zzbg.zzap, (String) null);
            }
        }
        return obj;
    }
}
