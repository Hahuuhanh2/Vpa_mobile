package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import f0.b0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzfv extends zzcv {
    private final zzga zza;
    private final zzzq zzb;
    private final zzzo zzc;
    private final Integer zzd;

    private zzfv(zzga zzga, zzzq zzzq, zzzo zzzo, Integer num) {
        this.zza = zzga;
        this.zzb = zzzq;
        this.zzc = zzzo;
        this.zzd = num;
    }

    public static zzfv zza(zzfz zzfz, zzzq zzzq, Integer num) {
        zzzo zzzo;
        zzfz zzfz2 = zzfz.zzc;
        if (zzfz != zzfz2 && num == null) {
            throw new GeneralSecurityException(b0.s("For given Variant ", zzfz.toString(), " the value of idRequirement must be non-null"));
        } else if (zzfz == zzfz2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzzq.zza() == 32) {
            zzga zzc2 = zzga.zzc(zzfz);
            if (zzc2.zzb() == zzfz2) {
                zzzo = zzzo.zzb(new byte[0]);
            } else if (zzc2.zzb() == zzfz.zzb) {
                zzzo = a.f(num, ByteBuffer.allocate(5).put((byte) 0));
            } else if (zzc2.zzb() == zzfz.zza) {
                zzzo = a.f(num, ByteBuffer.allocate(5).put((byte) 1));
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc2.zzb().toString()));
            }
            return new zzfv(zzc2, zzzq, zzzo, num);
        } else {
            throw new GeneralSecurityException(a.m("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzzq.zza()));
        }
    }
}
