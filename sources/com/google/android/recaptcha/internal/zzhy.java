package com.google.android.recaptcha.internal;

import android.support.v4.media.a;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
class zzhy extends zzhz {
    public final zzhv zza;
    public final Character zzb;

    public zzhy(zzhv zzhv, Character ch2) {
        this.zza = zzhv;
        if (ch2 != null) {
            ch2.charValue();
            if (zzhv.zzd('=')) {
                throw new IllegalArgumentException(zzha.zza("Padding character %s was already in alphabet", ch2));
            }
        }
        this.zzb = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhy) {
            zzhy zzhy = (zzhy) obj;
            if (!this.zza.equals(zzhy.zza) || !Objects.equals(this.zzb, zzhy.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.zzb;
        return Objects.hashCode(ch2) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzb);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public int zza(byte[] bArr, CharSequence charSequence) {
        zzhv zzhv;
        CharSequence zze = zze(charSequence);
        if (this.zza.zzc(zze.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < zze.length()) {
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    zzhv = this.zza;
                    if (i12 >= zzhv.zzc) {
                        break;
                    }
                    j10 <<= zzhv.zzb;
                    if (i10 + i12 < zze.length()) {
                        j10 |= (long) this.zza.zzb(zze.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = zzhv.zzd;
                int i15 = i13 * zzhv.zzb;
                int i16 = (i14 - 1) * 8;
                while (i16 >= (i14 * 8) - i15) {
                    bArr[i11] = (byte) ((int) ((j10 >>> i16) & 255));
                    i16 -= 8;
                    i11++;
                }
                i10 += this.zza.zzc;
            }
            return i11;
        }
        throw new zzhx(a.m("Invalid input length ", zze.length()));
    }

    public void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzgx.zzd(0, i11, bArr.length);
        while (i12 < i11) {
            zzf(appendable, bArr, i12, Math.min(this.zza.zzd, i11 - i12));
            i12 += this.zza.zzd;
        }
    }

    public final int zzc(int i10) {
        return (int) (((((long) this.zza.zzb) * ((long) i10)) + 7) / 8);
    }

    public final int zzd(int i10) {
        zzhv zzhv = this.zza;
        return zzhv.zzc * zzib.zza(i10, zzhv.zzd, RoundingMode.CEILING);
    }

    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        Character ch2 = this.zzb;
        if (ch2 == null) {
            return charSequence;
        }
        ch2.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0 || charSequence.charAt(length) != '=') {
            }
            length--;
            break;
        } while (charSequence.charAt(length) != '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i10, int i11) {
        boolean z10;
        zzgx.zzd(i10, i10 + i11, bArr.length);
        int i12 = 0;
        if (i11 <= this.zza.zzd) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgx.zza(z10);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = (i11 + 1) * 8;
        zzhv zzhv = this.zza;
        while (i12 < i11 * 8) {
            long j11 = j10 >>> ((i14 - zzhv.zzb) - i12);
            zzhv zzhv2 = this.zza;
            appendable.append(zzhv2.zza(((int) j11) & zzhv2.zza));
            i12 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i12 < this.zza.zzd * 8) {
                this.zzb.charValue();
                appendable.append('=');
                i12 += this.zza.zzb;
            }
        }
    }

    public zzhy(String str, String str2, Character ch2) {
        this(new zzhv(str, str2.toCharArray()), ch2);
    }
}
