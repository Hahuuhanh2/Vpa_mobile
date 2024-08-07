package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zznc {
    private static final zznc zza = new zznc(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznc() {
        this(0, new int[8], new Object[8], true);
    }

    private zznc(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zznc zzc() {
        return zza;
    }

    public static zznc zze(zznc zznc, zznc zznc2) {
        int i10 = zznc.zzb + zznc2.zzb;
        int[] copyOf = Arrays.copyOf(zznc.zzc, i10);
        System.arraycopy(zznc2.zzc, 0, copyOf, zznc.zzb, zznc2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zznc.zzd, i10);
        System.arraycopy(zznc2.zzd, 0, copyOf2, zznc.zzb, zznc2.zzb);
        return new zznc(i10, copyOf, copyOf2, true);
    }

    public static zznc zzf() {
        return new zznc(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznc)) {
            return false;
        }
        zznc zznc = (zznc) obj;
        int i10 = this.zzb;
        if (i10 == zznc.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zznc.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zznc.zzd;
                    int i12 = this.zzb;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (objArr[i13].equals(objArr2[i13])) {
                            i13++;
                        }
                    }
                    return true;
                } else if (iArr[i11] != iArr2[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i11 * 31) + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int i10;
        int i11;
        int i12;
        int i13 = this.zze;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.zzb; i15++) {
            int i16 = this.zzc[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 == 1) {
                    ((Long) this.zzd[i15]).longValue();
                    i12 = zzjg.zzx(i17 << 3) + 8;
                } else if (i18 == 2) {
                    int zzx = zzjg.zzx(i17 << 3);
                    int zzd2 = ((zziv) this.zzd[i15]).zzd();
                    i14 = zzjg.zzx(zzd2) + zzd2 + zzx + i14;
                } else if (i18 == 3) {
                    int zzx2 = zzjg.zzx(i17 << 3);
                    i11 = zzx2 + zzx2;
                    i10 = ((zznc) this.zzd[i15]).zza();
                } else if (i18 == 5) {
                    ((Integer) this.zzd[i15]).intValue();
                    i12 = zzjg.zzx(i17 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzlc.zza());
                }
                i14 = i12 + i14;
            } else {
                int i19 = i17 << 3;
                long longValue = ((Long) this.zzd[i15]).longValue();
                i11 = zzjg.zzx(i19);
                i10 = zzjg.zzy(longValue);
            }
            i14 = i10 + i11 + i14;
        }
        this.zze = i14;
        return i14;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int zzx = zzjg.zzx(8);
            int zzx2 = zzjg.zzx(this.zzc[i12] >>> 3) + zzjg.zzx(16);
            int zzx3 = zzjg.zzx(24);
            int zzd2 = ((zziv) this.zzd[i12]).zzd();
            i11 += zzx + zzx + zzx2 + zzjg.zzx(zzd2) + zzd2 + zzx3;
        }
        this.zze = i11;
        return i11;
    }

    public final zznc zzd(zznc zznc) {
        if (zznc.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zznc.zzb;
        zzm(i10);
        System.arraycopy(zznc.zzc, 0, this.zzc, this.zzb, zznc.zzb);
        System.arraycopy(zznc.zzd, 0, this.zzd, this.zzb, zznc.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzlz.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzno zzno) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzno.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzno zzno) {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzno.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzno.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzno.zzd(i13, (zziv) obj);
                } else if (i12 == 3) {
                    zzno.zzF(i13);
                    ((zznc) obj).zzl(zzno);
                    zzno.zzh(i13);
                } else if (i12 == 5) {
                    zzno.zzk(i13, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzlc.zza());
                }
            }
        }
    }
}
