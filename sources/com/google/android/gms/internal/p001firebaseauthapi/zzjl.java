package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzjl extends zzon {
    public zzjl() {
        super(zzup.class, zzus.class, new zzjj(zzbk.class));
    }

    public final zznf zza() {
        return new zzjk(this, zzuj.class);
    }

    public final zzwh zzb() {
        return zzwh.ASYMMETRIC_PRIVATE;
    }

    public final /* synthetic */ zzalp zzc(zzajf zzajf) {
        return zzup.zzd(zzajf, zzajx.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzalp zzalp) {
        zzup zzup = (zzup) zzalp;
        if (!zzup.zzf().zzp()) {
            zzzl.zzc(zzup.zza(), 0);
            zzlj.zzb(zzup.zze().zzb());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final /* synthetic */ zzalp zzg(zzalp zzalp) {
        return ((zzup) zzalp).zze();
    }
}
