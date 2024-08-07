package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzgp extends WebViewClient {
    public final /* synthetic */ zzgv zza;

    public zzgp(zzgv zzgv) {
        this.zza = zzgv;
    }

    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    public final void onPageFinished(WebView webView, String str) {
        long zza2 = this.zza.zzj.zza(TimeUnit.MICROSECONDS);
        int i10 = zzbq.zza;
        zzbq.zza(zzbr.zzg.zza(), zza2);
    }

    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        zzbh zzbh = zzbh.zzc;
        zzbg zzbg = (zzbg) this.zza.zzh.get(Integer.valueOf(i10));
        if (zzbg == null) {
            zzbg = zzbg.zzM;
        }
        zzbj zzbj = new zzbj(zzbh, zzbg, (String) null);
        this.zza.zzu().hashCode();
        zzbj.getMessage();
        this.zza.zzu().z(zzbj);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        int i10 = zzdt.zza;
        j.c(parse);
        if (!zzdt.zzc(parse) || zzdt.zza(parse)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzbj zzbj = new zzbj(zzbh.zzb, zzbg.zzQ, (String) null);
        this.zza.zzu().hashCode();
        parse.toString();
        this.zza.zzu().z(zzbj);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
