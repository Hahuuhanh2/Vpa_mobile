package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public abstract class zzio extends zzhv {
    private static final Logger zzb = Logger.getLogger(zzio.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzc = zzmo.zzc();
    public zzir zza;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static class zza extends zzio {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        public zza(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i11 | 0 | (bArr.length - i11)) >= 0) {
                this.zzb = bArr;
                this.zzc = 0;
                this.zze = 0;
                this.zzd = i11;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)}));
            }
        }

        private final void zzc(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.zzb, this.zze, i11);
                this.zze += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i11)}), e10);
            }
        }

        public final int zza() {
            return this.zzd - this.zze;
        }

        public final void zzb(byte[] bArr, int i10, int i11) {
            zzc(i11);
            zzc(bArr, 0, i11);
        }

        public final void zzd(int i10, int i11) {
            zzc(i10, 0);
            zzc(i11);
        }

        public final void zza(byte b10) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
            }
        }

        public final void zzb(int i10, int i11) {
            zzc(i10, 0);
            zzb(i11);
        }

        public final void zza(int i10, boolean z10) {
            zzc(i10, 0);
            zza(z10 ? (byte) 1 : 0);
        }

        public final void zzb(int i10) {
            if (i10 >= 0) {
                zzc(i10);
            } else {
                zzb((long) i10);
            }
        }

        public final void zzc(int i10, int i11) {
            zzc((i10 << 3) | i11);
        }

        public final void zzc(int i10) {
            while ((i10 & -128) != 0) {
                byte[] bArr = this.zzb;
                int i11 = this.zze;
                this.zze = i11 + 1;
                bArr[i11] = (byte) (i10 | 128);
                i10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.zzb;
                int i12 = this.zze;
                this.zze = i12 + 1;
                bArr2[i12] = (byte) i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
            }
        }

        public final void zza(int i10, zzhu zzhu) {
            zzc(i10, 2);
            zza(zzhu);
        }

        public final void zzb(int i10, zzhu zzhu) {
            zzc(1, 3);
            zzd(2, i10);
            zza(3, zzhu);
            zzc(1, 4);
        }

        public final void zza(zzhu zzhu) {
            zzc(zzhu.zzb());
            zzhu.zza((zzhv) this);
        }

        public final void zza(int i10, int i11) {
            zzc(i10, 5);
            zza(i11);
        }

        public final void zzb(int i10, long j10) {
            zzc(i10, 0);
            zzb(j10);
        }

        public final void zza(int i10) {
            try {
                byte[] bArr = this.zzb;
                int i11 = this.zze;
                int i12 = i11 + 1;
                bArr[i11] = (byte) i10;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (i10 >> 16);
                this.zze = i14 + 1;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
            }
        }

        public final void zzb(long j10) {
            if (!zzio.zzc || zza() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.zzb;
                    int i10 = this.zze;
                    this.zze = i10 + 1;
                    bArr[i10] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.zzb;
                    int i11 = this.zze;
                    this.zze = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.zzb;
                    int i12 = this.zze;
                    this.zze = i12 + 1;
                    zzmo.zza(bArr3, (long) i12, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.zzb;
                int i13 = this.zze;
                this.zze = i13 + 1;
                zzmo.zza(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void zza(int i10, long j10) {
            zzc(i10, 1);
            zza(j10);
        }

        public final void zza(long j10) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zze;
                int i11 = i10 + 1;
                bArr[i10] = (byte) ((int) j10);
                int i12 = i11 + 1;
                bArr[i11] = (byte) ((int) (j10 >> 8));
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((int) (j10 >> 16));
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((int) (j10 >> 24));
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((int) (j10 >> 32));
                int i16 = i15 + 1;
                bArr[i15] = (byte) ((int) (j10 >> 40));
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((int) (j10 >> 48));
                this.zze = i17 + 1;
                bArr[i17] = (byte) ((int) (j10 >> 56));
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
            }
        }

        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        public final void zza(int i10, zzkr zzkr, zzlj zzlj) {
            zzc(i10, 2);
            zzc(((zzhl) zzkr).zza(zzlj));
            zzlj.zza(zzkr, (zzne) this.zza);
        }

        public final void zza(zzkr zzkr) {
            zzc(zzkr.zzbw());
            zzkr.zza(this);
        }

        public final void zza(int i10, zzkr zzkr) {
            zzc(1, 3);
            zzd(2, i10);
            zzc(3, 2);
            zza(zzkr);
            zzc(1, 4);
        }

        public final void zza(int i10, String str) {
            zzc(i10, 2);
            zza(str);
        }

        public final void zza(String str) {
            int i10 = this.zze;
            try {
                int zzj = zzio.zzj(str.length() * 3);
                int zzj2 = zzio.zzj(str.length());
                if (zzj2 == zzj) {
                    int i11 = i10 + zzj2;
                    this.zze = i11;
                    int zza = zzmp.zza(str, this.zzb, i11, zza());
                    this.zze = i10;
                    zzc((zza - i10) - zzj2);
                    this.zze = zza;
                    return;
                }
                zzc(zzmp.zza(str));
                this.zze = zzmp.zza(str, this.zzb, this.zze, zza());
            } catch (zzms e10) {
                this.zze = i10;
                zza(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzb(e11);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        public zzb(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    private zzio() {
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zza(float f10) {
        return 4;
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    public static int zzb(int i10, boolean z10) {
        return zzj(i10 << 3) + 1;
    }

    public static int zzc(int i10, zzhu zzhu) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzhu.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zzc(long j10) {
        return 8;
    }

    public static int zzd(int i10) {
        return zzg((long) i10);
    }

    public static int zze(int i10) {
        return 4;
    }

    public static int zze(int i10, int i11) {
        return zzg((long) i11) + zzj(i10 << 3);
    }

    public static int zze(long j10) {
        return 8;
    }

    public static int zzf(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzg(int i10) {
        return 4;
    }

    public static int zzg(int i10, int i11) {
        return zzg((long) i11) + zzj(i10 << 3);
    }

    public static int zzh(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzi(int i10, int i11) {
        return zzj(zzl(i11)) + zzj(i10 << 3);
    }

    private static long zzi(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int zzj(int i10, int i11) {
        return zzj(i11) + zzj(i10 << 3);
    }

    private static int zzl(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b10);

    public abstract void zza(int i10);

    public abstract void zza(int i10, int i11);

    public abstract void zza(int i10, long j10);

    public abstract void zza(int i10, zzhu zzhu);

    public abstract void zza(int i10, zzkr zzkr);

    public abstract void zza(int i10, zzkr zzkr, zzlj zzlj);

    public abstract void zza(int i10, String str);

    public abstract void zza(int i10, boolean z10);

    public abstract void zza(long j10);

    public abstract void zza(zzhu zzhu);

    public abstract void zza(zzkr zzkr);

    public abstract void zza(String str);

    public abstract void zzb(int i10);

    public abstract void zzb(int i10, int i11);

    public abstract void zzb(int i10, long j10);

    public abstract void zzb(int i10, zzhu zzhu);

    public abstract void zzb(long j10);

    public abstract void zzb(byte[] bArr, int i10, int i11);

    public abstract void zzc(int i10);

    public abstract void zzc(int i10, int i11);

    public abstract void zzd(int i10, int i11);

    public final void zzk(int i10, int i11) {
        zzd(i10, zzl(i11));
    }

    public static int zzb(zzhu zzhu) {
        int zzb2 = zzhu.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzd(int i10, long j10) {
        return zzg(j10) + zzj(i10 << 3);
    }

    public static int zzf(int i10) {
        return zzg((long) i10);
    }

    public static int zzh(int i10) {
        return zzj(zzl(i10));
    }

    public final void zzk(int i10) {
        zzc(zzl(i10));
    }

    public static int zza(int i10, double d10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zze(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzf(int i10, long j10) {
        return zzg(zzi(j10)) + zzj(i10 << 3);
    }

    public static int zzg(int i10, long j10) {
        return zzg(j10) + zzj(i10 << 3);
    }

    public static int zzi(int i10) {
        return zzj(i10 << 3);
    }

    public static int zzj(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void zzh(int i10, long j10) {
        zzb(i10, zzi(j10));
    }

    public static int zza(int i10, float f10) {
        return zzj(i10 << 3) + 4;
    }

    @Deprecated
    public static int zzb(int i10, zzkr zzkr, zzlj zzlj) {
        return ((zzhl) zzkr).zza(zzlj) + (zzj(i10 << 3) << 1);
    }

    public static int zzc(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzd(long j10) {
        return zzg(j10);
    }

    public final void zzh(long j10) {
        zzb(zzi(j10));
    }

    public static int zza(int i10, zzjv zzjv) {
        int zzj = zzj(2, i10);
        return zzb(3, zzjv) + zzj + (zzj(8) << 1);
    }

    public static int zzc(int i10, zzkr zzkr, zzlj zzlj) {
        return zza(zzkr, zzlj) + zzj(i10 << 3);
    }

    public static int zzd(int i10, zzhu zzhu) {
        int zzj = zzj(2, i10);
        return zzc(3, zzhu) + zzj + (zzj(8) << 1);
    }

    public static int zzf(long j10) {
        return zzg(zzi(j10));
    }

    public static int zzg(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzb(zzkr zzkr) {
        return zzkr.zzbw();
    }

    public static int zzb(int i10, zzjv zzjv) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzjv.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zzc(zzkr zzkr) {
        int zzbw = zzkr.zzbw();
        return zzj(zzbw) + zzbw;
    }

    public static int zza(zzjv zzjv) {
        int zzb2 = zzjv.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zza(zzkr zzkr, zzlj zzlj) {
        int zza2 = ((zzhl) zzkr).zza(zzlj);
        return zzj(zza2) + zza2;
    }

    public static int zzb(int i10, zzkr zzkr) {
        return zzc(zzkr) + zzj(24) + zzj(2, i10) + (zzj(8) << 1);
    }

    public final void zza(String str, zzms zzms) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzms);
        byte[] bytes = str.getBytes(zzjh.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzb(e10);
        }
    }

    public static int zzb(int i10, String str) {
        return zzb(str) + zzj(i10 << 3);
    }

    public static int zzb(String str) {
        int i10;
        try {
            i10 = zzmp.zza(str);
        } catch (zzms unused) {
            i10 = str.getBytes(zzjh.zza).length;
        }
        return zzj(i10) + i10;
    }

    public static zzio zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z10) {
        zza(z10 ? (byte) 1 : 0);
    }

    public final void zzb(int i10, double d10) {
        zza(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(double d10) {
        zza(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f10) {
        zza(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzb(float f10) {
        zza(Float.floatToRawIntBits(f10));
    }
}
