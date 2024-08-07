package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzll  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzll implements zzlo {
    private final int zza;

    public zzll(int i10) {
        if (i10 == 16 || i10 == 32) {
            this.zza = i10;
            return;
        }
        throw new InvalidAlgorithmParameterException(a.m("Unsupported key length: ", i10));
    }

    public final int zza() {
        return this.zza;
    }

    public final byte[] zzb() {
        int i10 = this.zza;
        if (i10 == 16) {
            return zzmb.zzj;
        }
        if (i10 == 32) {
            return zzmb.zzk;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.zza) {
            return new zzhz(bArr, false).zza(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException(a.m("Unexpected key length: ", length));
    }
}
