package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.InvalidKeyException;
import v.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzir  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzir extends zzng {
    public zzir() {
        super(zzts.class, new zzip(zzbj.class));
    }

    public final zznf zza() {
        return new zziq(this, zztv.class);
    }

    public final zzwh zzb() {
        return zzwh.SYMMETRIC;
    }

    public final /* synthetic */ zzalp zzc(zzajf zzajf) {
        return zzts.zzd(zzajf, zzajx.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzalp zzalp) {
        zzts zzts = (zzts) zzalp;
        zzzl.zzc(zzts.zza(), 0);
        if (zzts.zze().zzd() != 64) {
            throw new InvalidKeyException(v.d("invalid key size: ", zzts.zze().zzd(), ". Valid keys must have 64 bytes."));
        }
    }
}
