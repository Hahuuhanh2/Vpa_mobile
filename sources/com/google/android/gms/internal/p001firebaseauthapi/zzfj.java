package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzfj extends zznf {
    public final /* synthetic */ zzfk zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfj(zzfk zzfk, Class cls) {
        super(cls);
        this.zza = zzfk;
    }

    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalp) {
        zztl zzb = zztm.zzb();
        byte[] zzb2 = zzor.zzb(((zztp) zzalp).zza());
        zzb.zza(zzajf.zzn(zzb2, 0, zzb2.length));
        zzb.zzb(0);
        return (zztm) zzb.zzi();
    }

    public final /* synthetic */ zzalp zzb(zzajf zzajf) {
        return zztp.zze(zzajf, zzajx.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        zzfm zzfm = new zzfm((zzfl) null);
        zzfm.zza(16);
        zzfn zzfn = zzfn.zza;
        zzfm.zzb(zzfn);
        hashMap.put("AES128_GCM_SIV", zzfm.zzc());
        zzfm zzfm2 = new zzfm((zzfl) null);
        zzfm2.zza(16);
        zzfn zzfn2 = zzfn.zzc;
        zzfm2.zzb(zzfn2);
        hashMap.put("AES128_GCM_SIV_RAW", zzfm2.zzc());
        zzfm zzfm3 = new zzfm((zzfl) null);
        zzfm3.zza(32);
        zzfm3.zzb(zzfn);
        hashMap.put("AES256_GCM_SIV", zzfm3.zzc());
        zzfm zzfm4 = new zzfm((zzfl) null);
        zzfm4.zza(32);
        zzfm4.zzb(zzfn2);
        hashMap.put("AES256_GCM_SIV_RAW", zzfm4.zzc());
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzalp zzalp) {
        zzzl.zzb(((zztp) zzalp).zza());
    }
}