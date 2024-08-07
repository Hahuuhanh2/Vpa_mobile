package com.google.android.recaptcha.internal;

import android.support.v4.media.a;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zznl {
    static {
        if (zzni.zzx() && zzni.zzy()) {
            int i10 = zzij.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 != 0) {
            if (i12 == 1) {
                byte b11 = bArr[i10];
                if (b10 > -12 || b11 > -65) {
                    return -1;
                }
                return (b11 << 8) ^ b10;
            } else if (i12 == 2) {
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 > -12 || b12 > -65 || b13 > -65) {
                    return -1;
                }
                return (b13 << 16) ^ ((b12 << 8) ^ b10);
            } else {
                throw new AssertionError();
            }
        } else if (b10 <= -12) {
            return b10;
        } else {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzb(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            int r0 = r8.length()
            r1 = 0
        L_0x0005:
            int r2 = r10 + r11
            r3 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L_0x001b
            int r4 = r1 + r10
            if (r4 >= r2) goto L_0x001b
            char r5 = r8.charAt(r1)
            if (r5 >= r3) goto L_0x001b
            byte r2 = (byte) r5
            r9[r4] = r2
            int r1 = r1 + 1
            goto L_0x0005
        L_0x001b:
            if (r1 != r0) goto L_0x0020
            int r10 = r10 + r0
            goto L_0x0101
        L_0x0020:
            int r10 = r10 + r1
        L_0x0021:
            if (r1 >= r0) goto L_0x0101
            char r11 = r8.charAt(r1)
            if (r11 >= r3) goto L_0x0033
            if (r10 >= r2) goto L_0x0033
            int r4 = r10 + 1
            byte r11 = (byte) r11
            r9[r10] = r11
            r10 = r4
            goto L_0x00b9
        L_0x0033:
            r4 = 2048(0x800, float:2.87E-42)
            if (r11 >= r4) goto L_0x004e
            int r4 = r2 + -2
            if (r10 > r4) goto L_0x004e
            int r4 = r10 + 1
            int r5 = r4 + 1
            int r6 = r11 >>> 6
            r6 = r6 | 960(0x3c0, float:1.345E-42)
            byte r6 = (byte) r6
            r9[r10] = r6
            r10 = r11 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r9[r4] = r10
            r10 = r5
            goto L_0x00b9
        L_0x004e:
            r4 = 57343(0xdfff, float:8.0355E-41)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r11 < r5) goto L_0x0058
            if (r11 <= r4) goto L_0x0079
        L_0x0058:
            int r6 = r2 + -3
            if (r10 > r6) goto L_0x0079
            int r4 = r10 + 1
            int r5 = r4 + 1
            int r6 = r5 + 1
            int r7 = r11 >>> 12
            r7 = r7 | 480(0x1e0, float:6.73E-43)
            byte r7 = (byte) r7
            r9[r10] = r7
            int r10 = r11 >>> 6
            r10 = r10 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r9[r4] = r10
            r10 = r11 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r9[r5] = r10
            r10 = r6
            goto L_0x00b9
        L_0x0079:
            int r6 = r2 + -4
            if (r10 > r6) goto L_0x00c6
            int r4 = r1 + 1
            int r5 = r8.length()
            if (r4 == r5) goto L_0x00be
            char r1 = r8.charAt(r4)
            boolean r5 = java.lang.Character.isSurrogatePair(r11, r1)
            if (r5 == 0) goto L_0x00bd
            int r5 = r10 + 1
            int r6 = r5 + 1
            int r7 = r6 + 1
            int r11 = java.lang.Character.toCodePoint(r11, r1)
            int r1 = r11 >>> 18
            r1 = r1 | 240(0xf0, float:3.36E-43)
            byte r1 = (byte) r1
            r9[r10] = r1
            int r10 = r11 >>> 12
            r10 = r10 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r9[r5] = r10
            int r10 = r11 >>> 6
            r10 = r10 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r9[r6] = r10
            int r10 = r7 + 1
            r11 = r11 & 63
            r11 = r11 | r3
            byte r11 = (byte) r11
            r9[r7] = r11
            r1 = r4
        L_0x00b9:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x00bd:
            r1 = r4
        L_0x00be:
            com.google.android.recaptcha.internal.zznk r8 = new com.google.android.recaptcha.internal.zznk
            int r1 = r1 + -1
            r8.<init>(r1, r0)
            throw r8
        L_0x00c6:
            if (r11 < r5) goto L_0x00e2
            if (r11 > r4) goto L_0x00e2
            int r9 = r1 + 1
            int r2 = r8.length()
            if (r9 == r2) goto L_0x00dc
            char r8 = r8.charAt(r9)
            boolean r8 = java.lang.Character.isSurrogatePair(r11, r8)
            if (r8 != 0) goto L_0x00e2
        L_0x00dc:
            com.google.android.recaptcha.internal.zznk r8 = new com.google.android.recaptcha.internal.zznk
            r8.<init>(r1, r0)
            throw r8
        L_0x00e2:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Failed writing "
            r9.append(r0)
            r9.append(r11)
            java.lang.String r11 = " at index "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0101:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zznl.zzb(java.lang.String, byte[], int, int):int");
    }

    public static int zzc(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = str.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char charAt2 = str.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new zznk(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder q10 = a.q("UTF-8 length does not fit in int: ");
        q10.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(q10.toString());
    }

    public static String zzd(byte[] bArr, int i10, int i11) {
        int i12;
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) >= 0) {
            int i13 = i10 + i11;
            char[] cArr = new char[i11];
            int i14 = 0;
            while (r11 < i13) {
                byte b10 = bArr[r11];
                if (!zznj.zzd(b10)) {
                    break;
                }
                i10 = r11 + 1;
                cArr[i12] = (char) b10;
                i14 = i12 + 1;
            }
            while (r11 < i13) {
                int i15 = r11 + 1;
                byte b11 = bArr[r11];
                if (zznj.zzd(b11)) {
                    int i16 = i12 + 1;
                    cArr[i12] = (char) b11;
                    r11 = i15;
                    while (true) {
                        i12 = i16;
                        if (r11 >= i13) {
                            break;
                        }
                        byte b12 = bArr[r11];
                        if (!zznj.zzd(b12)) {
                            break;
                        }
                        r11++;
                        i16 = i12 + 1;
                        cArr[i12] = (char) b12;
                    }
                } else if (b11 < -32) {
                    if (i15 < i13) {
                        zznj.zzc(b11, bArr[i15], cArr, i12);
                        i12++;
                        r11 = i15 + 1;
                    } else {
                        throw zzlc.zzd();
                    }
                } else if (b11 < -16) {
                    if (i15 < i13 - 1) {
                        int i17 = i15 + 1;
                        zznj.zzb(b11, bArr[i15], bArr[i17], cArr, i12);
                        i12++;
                        r11 = i17 + 1;
                    } else {
                        throw zzlc.zzd();
                    }
                } else if (i15 < i13 - 2) {
                    int i18 = i15 + 1;
                    byte b13 = bArr[i15];
                    int i19 = i18 + 1;
                    zznj.zza(b11, b13, bArr[i18], bArr[i19], cArr, i12);
                    i12 += 2;
                    r11 = i19 + 1;
                } else {
                    throw zzlc.zzd();
                }
            }
            return new String(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)}));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zze(byte[] r5, int r6, int r7) {
        /*
        L_0x0000:
            if (r6 >= r7) goto L_0x0009
            byte r0 = r5[r6]
            if (r0 < 0) goto L_0x0009
            int r6 = r6 + 1
            goto L_0x0000
        L_0x0009:
            if (r6 < r7) goto L_0x000d
            goto L_0x007a
        L_0x000d:
            if (r6 >= r7) goto L_0x007a
            int r0 = r6 + 1
            byte r6 = r5[r6]
            if (r6 >= 0) goto L_0x0078
            r1 = -32
            r2 = -65
            if (r6 >= r1) goto L_0x0029
            if (r0 < r7) goto L_0x001e
            goto L_0x0057
        L_0x001e:
            r1 = -62
            if (r6 < r1) goto L_0x0076
            int r6 = r0 + 1
            byte r0 = r5[r0]
            if (r0 <= r2) goto L_0x000d
            goto L_0x0076
        L_0x0029:
            r3 = -16
            if (r6 >= r3) goto L_0x004f
            int r3 = r7 + -1
            if (r0 < r3) goto L_0x0036
            int r6 = zza(r5, r0, r7)
            goto L_0x0057
        L_0x0036:
            int r3 = r0 + 1
            byte r0 = r5[r0]
            if (r0 > r2) goto L_0x0076
            r4 = -96
            if (r6 != r1) goto L_0x0042
            if (r0 < r4) goto L_0x0076
        L_0x0042:
            r1 = -19
            if (r6 != r1) goto L_0x0048
            if (r0 >= r4) goto L_0x0076
        L_0x0048:
            int r6 = r3 + 1
            byte r0 = r5[r3]
            if (r0 <= r2) goto L_0x000d
            goto L_0x0076
        L_0x004f:
            int r1 = r7 + -2
            if (r0 < r1) goto L_0x005a
            int r6 = zza(r5, r0, r7)
        L_0x0057:
            if (r6 == 0) goto L_0x007a
            goto L_0x0076
        L_0x005a:
            int r1 = r0 + 1
            byte r0 = r5[r0]
            if (r0 > r2) goto L_0x0076
            int r6 = r6 << 28
            int r0 = r0 + 112
            int r0 = r0 + r6
            int r6 = r0 >> 30
            if (r6 != 0) goto L_0x0076
            int r6 = r1 + 1
            byte r0 = r5[r1]
            if (r0 > r2) goto L_0x0076
            int r0 = r6 + 1
            byte r6 = r5[r6]
            if (r6 > r2) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r5 = 0
            return r5
        L_0x0078:
            r6 = r0
            goto L_0x000d
        L_0x007a:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zznl.zze(byte[], int, int):boolean");
    }
}
