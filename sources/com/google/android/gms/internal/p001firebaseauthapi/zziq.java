package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zziq extends zznf {
    public final /* synthetic */ zzir zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zziq(zzir zzir, Class cls) {
        super(cls);
        this.zza = zzir;
    }

    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalp) {
        zztr zzb = zzts.zzb();
        byte[] zzb2 = zzor.zzb(((zztv) zzalp).zza());
        zzb.zza(zzajf.zzn(zzb2, 0, zzb2.length));
        zzb.zzb(0);
        return (zzts) zzb.zzi();
    }

    public final /* synthetic */ zzalp zzb(zzajf zzajf) {
        return zztv.zze(zzajf, zzajx.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES256_SIV", zzji.zza);
        zzit zzit = new zzit((zzis) null);
        zzit.zza(64);
        zzit.zzb(zziu.zzc);
        hashMap.put("AES256_SIV_RAW", zzit.zzc());
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalp) {
        zztv zztv = (zztv) zzalp;
        if (zztv.zza() != 64) {
            throw new InvalidAlgorithmParameterException(v.d("invalid key size: ", zztv.zza(), ". Valid keys must have 64 bytes."));
        }
    }
}
