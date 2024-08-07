package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzly  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzly extends zzon {
    public zzly() {
        super(zzwa.class, zzwd.class, new zzlw(zzbk.class));
    }

    public final zznf zza() {
        return new zzlx(this, zzvu.class);
    }

    public final zzwh zzb() {
        return zzwh.ASYMMETRIC_PRIVATE;
    }

    public final /* synthetic */ zzalp zzc(zzajf zzajf) {
        return zzwa.zzd(zzajf, zzajx.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzalp zzalp) {
        zzwa zzwa = (zzwa) zzalp;
        if (zzwa.zzf().zzp()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (zzwa.zzk()) {
            zzzl.zzc(zzwa.zza(), 0);
            zzmb.zzb(zzwa.zze().zzb());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    public final /* synthetic */ zzalp zzg(zzalp zzalp) {
        return ((zzwa) zzalp).zze();
    }
}
