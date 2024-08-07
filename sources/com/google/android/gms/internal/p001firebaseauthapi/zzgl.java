package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzgl extends zznf {
    public final /* synthetic */ zzgm zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgl(zzgm zzgm, Class cls) {
        super(cls);
        this.zza = zzgm;
    }

    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalp) {
        zzxi zzb = zzxj.zzb();
        zzb.zza((zzxm) zzalp);
        zzb.zzb(0);
        return (zzxj) zzb.zzi();
    }

    public final /* synthetic */ zzalp zzb(zzajf zzajf) {
        return zzxm.zze(zzajf, zzajx.zza());
    }

    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalp) {
        zzxm zzxm = (zzxm) zzalp;
        if (!zzgj.zzc(zzxm.zza().zzg())) {
            throw new GeneralSecurityException(b0.s("Unsupported DEK key type: ", zzxm.zza().zzg(), ". Only Tink AEAD key types are supported."));
        } else if (zzxm.zzf().isEmpty() || !zzxm.zzi()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
