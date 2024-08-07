package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzeo {
    private zzey zza = null;
    private zzzq zzb = null;
    private Integer zzc = null;

    private zzeo() {
    }

    public /* synthetic */ zzeo(zzen zzen) {
    }

    public final zzeo zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzeo zzb(zzzq zzzq) {
        this.zzb = zzzq;
        return this;
    }

    public final zzeo zzc(zzey zzey) {
        this.zza = zzey;
        return this;
    }

    public final zzeq zzd() {
        zzzq zzzq;
        zzzo f10;
        zzey zzey = this.zza;
        if (zzey == null || (zzzq = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzey.zzb() != zzzq.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzey.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zzd() == zzew.zzc) {
                f10 = zzzo.zzb(new byte[0]);
            } else if (this.zza.zzd() == zzew.zzb) {
                f10 = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 0));
            } else if (this.zza.zzd() == zzew.zza) {
                f10 = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 1));
            } else {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            return new zzeq(this.zza, this.zzb, f10, this.zzc, (zzep) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
