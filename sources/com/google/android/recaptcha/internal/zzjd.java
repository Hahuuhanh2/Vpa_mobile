package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzjd extends zzjg {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzjd(byte[] bArr, int i10, int i11) {
        super((zzjf) null);
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i11)}));
    }

    public final int zza() {
        return this.zzc - this.zzd;
    }

    public final void zzb(byte b10) {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i11);
            this.zzd += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i11)}), e10);
        }
    }

    public final void zzd(int i10, boolean z10) {
        zzq(i10 << 3);
        zzb(z10 ? (byte) 1 : 0);
    }

    public final void zze(int i10, zziv zziv) {
        zzq((i10 << 3) | 2);
        zzq(zziv.zzd());
        zziv.zzh(this);
    }

    public final void zzf(int i10, int i11) {
        zzq((i10 << 3) | 5);
        zzg(i11);
    }

    public final void zzg(int i10) {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.zzd = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
        }
    }

    public final void zzh(int i10, long j10) {
        zzq((i10 << 3) | 1);
        zzi(j10);
    }

    public final void zzi(long j10) {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.zzd = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
        }
    }

    public final void zzj(int i10, int i11) {
        zzq(i10 << 3);
        zzk(i11);
    }

    public final void zzk(int i10) {
        if (i10 >= 0) {
            zzq(i10);
        } else {
            zzs((long) i10);
        }
    }

    public final void zzl(byte[] bArr, int i10, int i11) {
        zzc(bArr, 0, i11);
    }

    public final void zzm(int i10, String str) {
        zzq((i10 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int i10 = this.zzd;
        try {
            int zzx = zzjg.zzx(str.length() * 3);
            int zzx2 = zzjg.zzx(str.length());
            if (zzx2 == zzx) {
                int i11 = i10 + zzx2;
                this.zzd = i11;
                int zzb2 = zznl.zzb(str, this.zzb, i11, this.zzc - i11);
                this.zzd = i10;
                zzq((zzb2 - i10) - zzx2);
                this.zzd = zzb2;
                return;
            }
            zzq(zznl.zzc(str));
            byte[] bArr = this.zzb;
            int i12 = this.zzd;
            this.zzd = zznl.zzb(str, bArr, i12, this.zzc - i12);
        } catch (zznk e10) {
            this.zzd = i10;
            zzB(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzje(e11);
        }
    }

    public final void zzo(int i10, int i11) {
        zzq((i10 << 3) | i11);
    }

    public final void zzp(int i10, int i11) {
        zzq(i10 << 3);
        zzq(i11);
    }

    public final void zzq(int i10) {
        while ((i10 & -128) != 0) {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr[i11] = (byte) ((i10 | 128) & 255);
            i10 >>>= 7;
        }
        try {
            byte[] bArr2 = this.zzb;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            bArr2[i12] = (byte) i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
        }
    }

    public final void zzr(int i10, long j10) {
        zzq(i10 << 3);
        zzs(j10);
    }

    public final void zzs(long j10) {
        if (!zzjg.zzc || this.zzc - this.zzd < 10) {
            while ((j10 & -128) != 0) {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                j10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                bArr2[i11] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzje(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
            }
        } else {
            while (true) {
                int i12 = (int) j10;
                if ((j10 & -128) == 0) {
                    byte[] bArr3 = this.zzb;
                    int i13 = this.zzd;
                    this.zzd = i13 + 1;
                    zzni.zzn(bArr3, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr4 = this.zzb;
                int i14 = this.zzd;
                this.zzd = i14 + 1;
                zzni.zzn(bArr4, (long) i14, (byte) ((i12 | 128) & 255));
                j10 >>>= 7;
            }
        }
    }
}
