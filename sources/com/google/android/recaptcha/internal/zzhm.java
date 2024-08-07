package com.google.android.recaptcha.internal;

import java.io.Serializable;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzhm extends zzhn implements Serializable {
    public final byte[] zza;

    public zzhm(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length >= 4) {
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        }
        throw new IllegalStateException(zzha.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
    }

    public final int zzb() {
        return this.zza.length * 8;
    }

    public final boolean zzc(zzhn zzhn) {
        boolean z10;
        if (this.zza.length != zzhn.zze().length) {
            return false;
        }
        boolean z11 = true;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i10 >= bArr.length) {
                return z11;
            }
            if (bArr[i10] == zzhn.zze()[i10]) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 &= z10;
            i10++;
        }
    }

    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    public final byte[] zze() {
        return this.zza;
    }
}
