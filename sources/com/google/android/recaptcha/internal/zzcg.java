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
final class zzcg extends i implements p {
    public final /* synthetic */ WebView zza;
    public final /* synthetic */ Application zzb;
    public final /* synthetic */ zzbv zzc;
    public final /* synthetic */ zzdc zzd;
    public final /* synthetic */ zzdq zze;
    public final /* synthetic */ zzbo zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcg(WebView webView, Application application, zzbv zzbv, zzdc zzdc, zzbo zzbo, zzdq zzdq, d dVar) {
        super(2, dVar);
        this.zza = webView;
        this.zzb = application;
        this.zzc = zzbv;
        this.zzd = zzdc;
        this.zzf = zzbo;
        this.zze = zzdq;
    }

    public final d create(Object obj, d dVar) {
        return new zzcg(this.zza, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcg) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        WebView webView;
        a aVar = a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        WebView webView2 = this.zza;
        if (webView2 == null) {
            webView = new WebView(this.zzb);
        } else {
            webView = webView2;
        }
        return new zzgv(webView, this.zzb, this.zzc, this.zzd, this.zzf, this.zze);
    }
}
