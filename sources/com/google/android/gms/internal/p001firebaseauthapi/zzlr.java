package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzlr implements zzbl {
    private final zzwd zza;
    private final zzlt zzb;
    private final zzls zzc;
    private final zzlo zzd;

    private zzlr(zzwd zzwd, zzlt zzlt, zzls zzls, zzlo zzlo) {
        this.zza = zzwd;
        this.zzb = zzlt;
        this.zzc = zzls;
        this.zzd = zzlo;
    }

    public static zzlr zza(zzwd zzwd) {
        if (!zzwd.zzg().zzp()) {
            zzvx zzb2 = zzwd.zzb();
            return new zzlr(zzwd, zzlv.zzc(zzb2), zzlv.zzb(zzb2), zzlv.zza(zzb2));
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
