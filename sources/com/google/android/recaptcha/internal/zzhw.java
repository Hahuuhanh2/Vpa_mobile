package com.google.android.recaptcha.internal;

import android.support.v4.media.a;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzhw extends zzhy {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzhw(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzhv r0 = new com.google.android.recaptcha.internal.zzhv
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = r0.zzf
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            com.google.android.recaptcha.internal.zzgx.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhw.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    public final int zza(byte[] bArr, CharSequence charSequence) {
        CharSequence zze = zze(charSequence);
        if (this.zza.zzc(zze.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < zze.length()) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                int zzb = (this.zza.zzb(zze.charAt(i10)) << 18) | (this.zza.zzb(zze.charAt(i12)) << 12);
                bArr[i11] = (byte) (zzb >>> 16);
                int i14 = i12 + 1;
                if (i14 < zze.length()) {
                    int i15 = i14 + 1;
                    int zzb2 = zzb | (this.zza.zzb(zze.charAt(i14)) << 6);
                    i11 = i13 + 1;
                    bArr[i13] = (byte) ((zzb2 >>> 8) & 255);
                    if (i15 < zze.length()) {
                        bArr[i11] = (byte) ((zzb2 | this.zza.zzb(zze.charAt(i15))) & 255);
                        i11++;
                        i10 = i15 + 1;
                    } else {
                        i10 = i15;
                    }
                } else {
                    i10 = i14;
                    i11 = i13;
                }
            }
            return i11;
        }
        throw new zzhx(a.m("Invalid input length ", zze.length()));
    }

    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzgx.zzd(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = i14 + 1;
            byte b10 = ((bArr[i12] & 255) << 16) | ((bArr[i14] & 255) << 8) | (bArr[i15] & 255);
            appendable.append(this.zza.zza(b10 >>> 18));
            appendable.append(this.zza.zza((b10 >>> 12) & 63));
            appendable.append(this.zza.zza((b10 >>> 6) & 63));
            appendable.append(this.zza.zza(b10 & 63));
            i12 = i15 + 1;
        }
        if (i12 < i11) {
            zzf(appendable, bArr, i12, i11 - i12);
        }
    }
}
