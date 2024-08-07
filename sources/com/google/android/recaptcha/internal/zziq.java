package com.google.android.recaptcha.internal;

import android.support.v4.media.a;
import f0.b0;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zziq extends zziu {
    private final int zzc;

    public zziq(byte[] bArr, int i10, int i11) {
        super(bArr);
        zziv.zzi(0, i11, bArr.length);
        this.zzc = i11;
    }

    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.m("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(b0.p("Index > length: ", i10, ", ", i11));
    }

    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }
}
