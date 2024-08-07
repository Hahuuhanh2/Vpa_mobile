package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzkd {
    public static final zzkd zza = new zzkd(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzkd() {
        this.zzd = new HashMap();
    }

    public final zzkq zza(zzlx zzlx, int i10) {
        return (zzkq) this.zzd.get(new zzkc(zzlx, i10));
    }

    public zzkd(boolean z10) {
        this.zzd = Collections.emptyMap();
    }
}
