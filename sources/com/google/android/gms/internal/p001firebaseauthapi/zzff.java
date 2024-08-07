package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzff  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzff {
    private zzfp zza = null;
    private zzzq zzb = null;
    private Integer zzc = null;

    private zzff() {
    }

    public /* synthetic */ zzff(zzfe zzfe) {
    }

    public final zzff zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzff zzb(zzzq zzzq) {
        this.zzb = zzzq;
        return this;
    }

    public final zzff zzc(zzfp zzfp) {
        this.zza = zzfp;
        return this;
    }

    public final zzfh zzd() {
        zzzq zzzq;
        zzzo f10;
        zzfp zzfp = this.zza;
        if (zzfp == null || (zzzq = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzfp.zzb() != zzzq.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzfp.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zzc() == zzfn.zzc) {
                f10 = zzzo.zzb(new byte[0]);
            } else if (this.zza.zzc() == zzfn.zzb) {
                f10 = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 0));
            } else if (this.zza.zzc() == zzfn.zza) {
                f10 = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 1));
            } else {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
            }
            return new zzfh(this.zza, this.zzb, f10, this.zzc, (zzfg) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
