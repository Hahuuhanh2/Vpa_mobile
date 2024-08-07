package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzfx extends zznf {
    public final /* synthetic */ zzfy zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfx(zzfy zzfy, Class cls) {
        super(cls);
        this.zza = zzfy;
    }

    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalp) {
        zzub zzub = (zzub) zzalp;
        zztx zzb = zzty.zzb();
        zzb.zzb(0);
        byte[] zzb2 = zzor.zzb(32);
        zzb.zza(zzajf.zzn(zzb2, 0, zzb2.length));
        return (zzty) zzb.zzi();
    }

    public final /* synthetic */ zzalp zzb(zzajf zzajf) {
        return zzub.zzc(zzajf, zzajx.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", zzga.zzc(zzfz.zza));
        hashMap.put("CHACHA20_POLY1305_RAW", zzga.zzc(zzfz.zzc));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalp) {
        zzub zzub = (zzub) zzalp;
    }
}
