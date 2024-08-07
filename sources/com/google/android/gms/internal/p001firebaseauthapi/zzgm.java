package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzgm extends zzng {
    public zzgm() {
        super(zzxj.class, new zzgk(zzbd.class));
    }

    public final zznf zza() {
        return new zzgl(this, zzxm.class);
    }

    public final zzwh zzb() {
        return zzwh.REMOTE;
    }

    public final /* synthetic */ zzalp zzc(zzajf zzajf) {
        return zzxj.zzd(zzajf, zzajx.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzalp zzalp) {
        zzxj zzxj = (zzxj) zzalp;
        zzzl.zzc(zzxj.zza(), 0);
        if (!zzgj.zzc(zzxj.zze().zza().zzg())) {
            throw new GeneralSecurityException(b0.s("Unsupported DEK key type: ", zzxj.zze().zza().zzg(), ". Only Tink AEAD key types are supported."));
        }
    }
}
