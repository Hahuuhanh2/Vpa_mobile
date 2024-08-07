package com.google.android.recaptcha.internal;

import f0.b0;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
class zziu extends zzit {
    public final byte[] zza;

    public zziu(byte[] bArr) {
        super((zzis) null);
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziv) || zzd() != ((zziv) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zziu)) {
            return obj.equals(this);
        }
        zziu zziu = (zziu) obj;
        int zzj = zzj();
        int zzj2 = zziu.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zziu.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd <= zziu.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zziu.zza;
            zziu.zzc();
            int i10 = 0;
            int i11 = 0;
            while (i10 < zzd) {
                if (bArr[i10] != bArr2[i11]) {
                    return false;
                }
                i10++;
                i11++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(b0.p("Ran off end of other: 0, ", zzd, ", ", zziu.zzd()));
        }
    }

    public byte zza(int i10) {
        return this.zza[i10];
    }

    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }

    public final int zzf(int i10, int i11, int i12) {
        return zzla.zzb(i10, this.zza, 0, i12);
    }

    public final zziv zzg(int i10, int i11) {
        int zzi = zziv.zzi(0, i11, zzd());
        if (zzi == 0) {
            return zziv.zzb;
        }
        return new zziq(this.zza, 0, zzi);
    }

    public final void zzh(zzin zzin) {
        ((zzjd) zzin).zzc(this.zza, 0, zzd());
    }
}
