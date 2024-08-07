package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzajx {
    public static final zzajx zza = new zzajx(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzajx() {
        this.zzd = new HashMap();
    }

    public static zzajx zza() {
        return zza;
    }

    public final zzaki zzb(zzalp zzalp, int i10) {
        return (zzaki) this.zzd.get(new zzajw(zzalp, i10));
    }

    public zzajx(boolean z10) {
        this.zzd = Collections.emptyMap();
    }
}
