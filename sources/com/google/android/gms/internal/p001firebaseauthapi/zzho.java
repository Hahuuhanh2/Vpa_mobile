package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzho  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzho extends zznf {
    public final /* synthetic */ zzhp zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzho(zzhp zzhp, Class cls) {
        super(cls);
        this.zza = zzhp;
    }

    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalp) {
        zzxx zzxx = (zzxx) zzalp;
        zzxt zzb = zzxu.zzb();
        zzb.zzb(0);
        byte[] zzb2 = zzor.zzb(32);
        zzb.zza(zzajf.zzn(zzb2, 0, zzb2.length));
        return (zzxu) zzb.zzi();
    }

    public final /* synthetic */ zzalp zzb(zzajf zzajf) {
        return zzxx.zzd(zzajf, zzajx.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", zzhr.zzd(zzhq.zza));
        hashMap.put("XCHACHA20_POLY1305_RAW", zzhr.zzd(zzhq.zzc));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalp) {
        zzxx zzxx = (zzxx) zzalp;
    }
}