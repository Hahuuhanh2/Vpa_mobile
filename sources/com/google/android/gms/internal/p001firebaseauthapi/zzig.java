package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzig  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzig {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        long zzb = zzb(bArr3, 0, 0);
        long zzb2 = zzb(bArr3, 3, 2) & 67108611;
        long zzb3 = zzb(bArr3, 6, 4) & 67092735;
        long zzb4 = zzb(bArr3, 9, 6) & 66076671;
        long zzb5 = zzb(bArr3, 12, 8) & 1048575;
        int i10 = 17;
        byte[] bArr5 = new byte[17];
        long j10 = 0;
        int i11 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        while (true) {
            int length = bArr4.length;
            if (i11 < length) {
                int min = Math.min(16, length - i11);
                System.arraycopy(bArr4, i11, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i10, (byte) 0);
                }
                long j15 = zzb5 * 5;
                long j16 = zzb4 * 5;
                long j17 = zzb3 * 5;
                long zzb6 = j14 + zzb(bArr5, 0, 0);
                long zzb7 = j11 + zzb(bArr5, 3, 2);
                long zzb8 = j10 + zzb(bArr5, 6, 4);
                long zzb9 = j12 + zzb(bArr5, 9, 6);
                long zzb10 = j13 + (zzb(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                long j18 = zzb7 * zzb;
                long j19 = zzb7 * zzb2;
                long j20 = zzb8 * zzb;
                long j21 = zzb7 * zzb3;
                long j22 = zzb8 * zzb2;
                long j23 = zzb9 * zzb;
                long j24 = zzb7 * zzb4;
                long j25 = zzb8 * zzb3;
                long j26 = zzb9 * zzb2;
                long j27 = zzb10 * zzb;
                long j28 = (zzb2 * 5 * zzb10) + (zzb9 * j17) + (zzb8 * j16) + (zzb7 * j15) + (zzb6 * zzb);
                long j29 = j28 & 67108863;
                long j30 = zzb9 * j16;
                long j31 = j17 * zzb10;
                long j32 = j31 + j30 + (zzb8 * j15) + (zzb6 * zzb2) + j18 + (j28 >> 26);
                long j33 = j16 * zzb10;
                long j34 = j33 + (zzb9 * j15) + (zzb6 * zzb3) + j19 + j20 + (j32 >> 26);
                long j35 = (zzb10 * j15) + (zzb6 * zzb4) + j21 + j22 + j23 + (j34 >> 26);
                long j36 = (zzb6 * zzb5) + j24 + j25 + j26 + j27 + (j35 >> 26);
                long j37 = ((j36 >> 26) * 5) + j29;
                j11 = (j32 & 67108863) + (j37 >> 26);
                i11 += 16;
                j10 = j34 & 67108863;
                j12 = j35 & 67108863;
                j13 = j36 & 67108863;
                i10 = 17;
                j14 = j37 & 67108863;
            } else {
                long j38 = j10 + (j11 >> 26);
                long j39 = j38 & 67108863;
                long j40 = j12 + (j38 >> 26);
                long j41 = j40 & 67108863;
                long j42 = j13 + (j40 >> 26);
                long j43 = j42 & 67108863;
                long j44 = ((j42 >> 26) * 5) + j14;
                long j45 = j44 >> 26;
                long j46 = j44 & 67108863;
                long j47 = j46 + 5;
                long j48 = (j11 & 67108863) + j45;
                long j49 = j48 + (j47 >> 26);
                long j50 = (j49 >> 26) + j39;
                long j51 = j41 + (j50 >> 26);
                long j52 = (j43 + (j51 >> 26)) - 67108864;
                long j53 = j52 >> 63;
                long j54 = ~j53;
                long j55 = (j48 & j53) | (j49 & 67108863 & j54);
                long j56 = (j39 & j53) | (j50 & 67108863 & j54);
                long j57 = (j41 & j53) | (j51 & 67108863 & j54);
                long j58 = (j43 & j53) | (j52 & j54);
                long zzc = (((j46 & j53) | (j47 & 67108863 & j54) | (j55 << 26)) & 4294967295L) + zzc(bArr3, 16);
                long zzc2 = (((j55 >> 6) | (j56 << 20)) & 4294967295L) + zzc(bArr3, 20);
                long zzc3 = (((j57 << 14) | (j56 >> 12)) & 4294967295L) + zzc(bArr3, 24);
                long zzc4 = (((j57 >> 18) | (j58 << 8)) & 4294967295L) + zzc(bArr3, 28);
                byte[] bArr6 = new byte[16];
                zzd(bArr6, zzc & 4294967295L, 0);
                long j59 = zzc2 + (zzc >> 32);
                zzd(bArr6, j59 & 4294967295L, 4);
                long j60 = zzc3 + (j59 >> 32);
                zzd(bArr6, j60 & 4294967295L, 8);
                zzd(bArr6, (zzc4 + (j60 >> 32)) & 4294967295L, 12);
                return bArr6;
            }
        }
    }

    private static long zzb(byte[] bArr, int i10, int i11) {
        return (zzc(bArr, i10) >> i11) & 67108863;
    }

    private static long zzc(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((long) (((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j10, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) ((int) (255 & j10));
            j10 >>= 8;
        }
    }
}
