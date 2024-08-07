package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzpf {
    private zzpr zza = null;
    private zzzq zzb = null;
    private Integer zzc = null;

    private zzpf() {
    }

    public /* synthetic */ zzpf(zzpe zzpe) {
    }

    public final zzpf zza(zzzq zzzq) {
        this.zzb = zzzq;
        return this;
    }

    public final zzpf zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzpf zzc(zzpr zzpr) {
        this.zza = zzpr;
        return this;
    }

    public final zzph zzd() {
        zzzq zzzq;
        zzzo f10;
        zzpr zzpr = this.zza;
        if (zzpr == null || (zzzq = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzpr.zzc() != zzzq.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzpr.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zze() == zzpp.zzd) {
                f10 = zzzo.zzb(new byte[0]);
            } else if (this.zza.zze() == zzpp.zzc || this.zza.zze() == zzpp.zzb) {
                f10 = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 0));
            } else if (this.zza.zze() == zzpp.zza) {
                f10 = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 1));
            } else {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            return new zzph(this.zza, this.zzb, f10, this.zzc, (zzpg) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
