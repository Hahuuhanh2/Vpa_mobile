package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
class zzie extends zzif {
    public final byte[] zzb;

    public zzie(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhu) || zzb() != ((zzhu) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzie)) {
            return obj.equals(this);
        }
        zzie zzie = (zzie) obj;
        int zza = zza();
        int zza2 = zzie.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzie, 0, zzb());
        }
        return false;
    }

    public byte zza(int i10) {
        return this.zzb[i10];
    }

    public byte zzb(int i10) {
        return this.zzb[i10];
    }

    public final boolean zzd() {
        int zze = zze();
        return zzmp.zzc(this.zzb, zze, zzb() + zze);
    }

    public int zze() {
        return 0;
    }

    public final zzhu zza(int i10, int i11) {
        int zza = zzhu.zza(0, i11, zzb());
        if (zza == 0) {
            return zzhu.zza;
        }
        return new zzhy(this.zzb, zze(), zza);
    }

    public final int zzb(int i10, int i11, int i12) {
        return zzjh.zza(i10, this.zzb, zze(), i12);
    }

    public int zzb() {
        return this.zzb.length;
    }

    public final String zza(Charset charset) {
        return new String(this.zzb, zze(), zzb(), charset);
    }

    public final void zza(zzhv zzhv) {
        zzhv.zza(this.zzb, zze(), zzb());
    }

    public final boolean zza(zzhu zzhu, int i10, int i11) {
        if (i11 > zzhu.zzb()) {
            int zzb2 = zzb();
            throw new IllegalArgumentException("Length too large: " + i11 + zzb2);
        } else if (i11 > zzhu.zzb()) {
            int zzb3 = zzhu.zzb();
            throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + i11 + ", " + zzb3);
        } else if (!(zzhu instanceof zzie)) {
            return zzhu.zza(0, i11).equals(zza(0, i11));
        } else {
            zzie zzie = (zzie) zzhu;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzie.zzb;
            int zze = zze() + i11;
            int zze2 = zze();
            int zze3 = zzie.zze();
            while (zze2 < zze) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        }
    }
}
