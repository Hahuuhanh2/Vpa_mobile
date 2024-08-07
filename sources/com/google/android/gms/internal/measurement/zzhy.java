package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzhy extends zzie {
    private final int zzc;
    private final int zzd;

    public zzhy(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzhu.zza(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    public final byte zza(int i10) {
        int zzb = zzb();
        if (((zzb - (i10 + 1)) | i10) >= 0) {
            return this.zzb[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + zzb);
    }

    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    public final int zze() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }
}
