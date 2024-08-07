package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzmr {
    public static /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!zza(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !zza(b12) && !zza(b13)) {
                byte b14 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((b14 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((b14 & 1023) + 56320);
                return;
            }
        }
        throw zzjq.zzd();
    }

    private static boolean zza(byte b10) {
        return b10 > -65;
    }

    public static /* synthetic */ void zza(byte b10, char[] cArr, int i10) {
        cArr[i10] = (char) b10;
    }

    public static /* synthetic */ void zza(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (zza(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || zza(b12)))) {
            throw zzjq.zzd();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    public static /* synthetic */ void zza(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || zza(b11)) {
            throw zzjq.zzd();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }
}
