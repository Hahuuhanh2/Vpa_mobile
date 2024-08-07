package com.google.android.recaptcha.internal;

import al.a0;
import al.d0;
import android.webkit.WebView;
import ik.d;
import java.util.Arrays;
import p3.l0;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzed {
    /* access modifiers changed from: private */
    public final WebView zza;
    private final d0 zzb;

    public zzed(WebView webView, d0 d0Var) {
        this.zza = webView;
        this.zzb = d0Var;
    }

    public final void zzb(String str, String... strArr) {
        l0.j0(this.zzb, (a0) null, new zzec((String[]) Arrays.copyOf(strArr, strArr.length), this, str, (d) null), 3);
    }
}
