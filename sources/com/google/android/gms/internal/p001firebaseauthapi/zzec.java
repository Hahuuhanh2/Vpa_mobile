package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzec  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzec extends zzng {
    public zzec() {
        super(zzsx.class, new zzea(zzbd.class));
    }

    public final zznf zza() {
        return new zzeb(this, zzta.class);
    }

    public final zzwh zzb() {
        return zzwh.SYMMETRIC;
    }

    public final /* synthetic */ zzalp zzc(zzajf zzajf) {
        return zzsx.zzd(zzajf, zzajx.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzalp zzalp) {
        zzsx zzsx = (zzsx) zzalp;
        zzzl.zzc(zzsx.zza(), 0);
        zzzl.zzb(zzsx.zzf().zzd());
        if (zzsx.zze().zza() != 12 && zzsx.zze().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
