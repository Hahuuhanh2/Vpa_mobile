package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public abstract class zzhz {
    private static final zzhz zza = new zzhw("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzhz zzb = new zzhw("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        boolean z10;
        new zzhy("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzhy("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzhv zzhv = new zzhv("base16()", "0123456789ABCDEF".toCharArray());
        new zzhy(zzhv, (Character) null);
        char[] cArr = new char[512];
        if (zzhv.zzf.length == 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgx.zza(z10);
        for (int i10 = 0; i10 < 256; i10++) {
            cArr[i10] = zzhv.zza(i10 >>> 4);
            cArr[i10 | 256] = zzhv.zza(i10 & 15);
        }
    }

    public static zzhz zzg() {
        return zza;
    }

    public static zzhz zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzb(Appendable appendable, byte[] bArr, int i10, int i11);

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i10, int i11) {
        zzgx.zzd(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i11));
        try {
            zzb(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zze = zze(charSequence);
            int zzc = zzc(zze.length());
            byte[] bArr = new byte[zzc];
            int zza2 = zza(bArr, zze);
            if (zza2 == zzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzhx e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
