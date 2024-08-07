package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public abstract class zzhn {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof zzhn) {
            zzhn zzhn = (zzhn) obj;
            if (zzb() != zzhn.zzb() || !zzc(zzhn)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] zze = zze();
        byte b10 = zze[0] & 255;
        for (int i10 = 1; i10 < zze.length; i10++) {
            b10 |= (zze[i10] & 255) << (i10 * 8);
        }
        return b10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(r1 + r1);
        for (byte b10 : zze()) {
            char[] cArr = zza;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzhn zzhn);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
