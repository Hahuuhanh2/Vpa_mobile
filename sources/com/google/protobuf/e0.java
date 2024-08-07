package com.google.protobuf;

import f0.b0;

/* compiled from: Utf8 */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7900a;

    /* compiled from: Utf8 */
    public static abstract class a {
        public abstract int a(CharSequence charSequence, byte[] bArr, int i10, int i11);

        public abstract int b(byte[] bArr, int i10, int i11);
    }

    /* compiled from: Utf8 */
    public static final class b extends a {
        public final int a(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            int i14;
            char charAt;
            int length = charSequence.length();
            int i15 = i11 + i10;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i10) < i15 && (charAt = charSequence.charAt(i16)) < 128) {
                bArr[i14] = (byte) charAt;
                i16++;
            }
            if (i16 == length) {
                return i10 + length;
            }
            int i17 = i10 + i16;
            while (i16 < length) {
                char charAt2 = charSequence.charAt(i16);
                if (charAt2 < 128 && i17 < i15) {
                    i12 = i17 + 1;
                    bArr[i17] = (byte) charAt2;
                } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                    i17 = i18 + 1;
                    bArr[i18] = (byte) ((charAt2 & '?') | 128);
                    i16++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i17 <= i15 - 3) {
                    int i19 = i17 + 1;
                    bArr[i17] = (byte) ((charAt2 >>> 12) | 480);
                    int i20 = i19 + 1;
                    bArr[i19] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i12 = i20 + 1;
                    bArr[i20] = (byte) ((charAt2 & '?') | 128);
                } else if (i17 <= i15 - 4) {
                    int i21 = i16 + 1;
                    if (i21 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i21);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i22 = i17 + 1;
                            bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                            int i23 = i22 + 1;
                            bArr[i22] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i24 = i23 + 1;
                            bArr[i23] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i17 = i24 + 1;
                            bArr[i24] = (byte) ((codePoint & 63) | 128);
                            i16 = i21;
                            i16++;
                        } else {
                            i16 = i21;
                        }
                    }
                    throw new c(i16 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i13 = i16 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
                } else {
                    throw new c(i16, length);
                }
                i17 = i12;
                i16++;
            }
            return i17;
        }

        public final int b(byte[] bArr, int i10, int i11) {
            while (r7 < i11 && bArr[r7] >= 0) {
                i10 = r7 + 1;
            }
            if (r7 < i11) {
                while (r7 < i11) {
                    int i12 = r7 + 1;
                    byte b10 = bArr[r7];
                    if (b10 < 0) {
                        if (b10 < -32) {
                            if (i12 >= i11) {
                                return b10;
                            }
                            if (b10 >= -62) {
                                r7 = i12 + 1;
                                if (bArr[i12] > -65) {
                                }
                            }
                        } else if (b10 < -16) {
                            if (i12 >= i11 - 1) {
                                return e0.a(bArr, i12, i11);
                            }
                            int i13 = i12 + 1;
                            byte b11 = bArr[i12];
                            if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                                r7 = i13 + 1;
                                if (bArr[i13] > -65) {
                                }
                            }
                        } else if (i12 >= i11 - 2) {
                            return e0.a(bArr, i12, i11);
                        } else {
                            int i14 = i12 + 1;
                            byte b12 = bArr[i12];
                            if (b12 <= -65) {
                                if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                                    int i15 = i14 + 1;
                                    if (bArr[i14] <= -65) {
                                        i12 = i15 + 1;
                                        if (bArr[i15] > -65) {
                                        }
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    r7 = i12;
                }
            }
            return 0;
        }
    }

    /* compiled from: Utf8 */
    public static class c extends IllegalArgumentException {
        public c(int i10, int i11) {
            super(b0.p("Unpaired surrogate at index ", i10, " of ", i11));
        }
    }

    /* compiled from: Utf8 */
    public static final class d extends a {
        public static int c(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                a aVar = e0.f7900a;
                if (i10 > -12) {
                    return -1;
                }
                return i10;
            } else if (i11 == 1) {
                return e0.c(i10, tc.b0.h(bArr, j10));
            } else {
                if (i11 == 2) {
                    return e0.d(i10, tc.b0.h(bArr, j10), tc.b0.h(bArr, j10 + 1));
                }
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00f3, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v4 long) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a(java.lang.CharSequence r20, byte[] r21, int r22, int r23) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                r3 = r23
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r20.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0135
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0135
                r2 = 0
            L_0x001a:
                r11 = 1
                r3 = 128(0x80, float:1.794E-43)
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                tc.b0.q(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0133
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x0048
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x0048
                long r14 = r4 + r11
                byte r13 = (byte) r13
                tc.b0.q(r1, r4, r13)
                r4 = r14
                goto L_0x00f3
            L_0x0048:
                r3 = 2048(0x800, float:2.87E-42)
                if (r13 >= r3) goto L_0x0071
                r14 = 2
                long r14 = r6 - r14
                int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r3 > 0) goto L_0x0071
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                tc.b0.q(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r5 = r5 | 128(0x80, float:1.794E-43)
                byte r5 = (byte) r5
                tc.b0.q(r1, r14, r5)
            L_0x0068:
                r5 = 128(0x80, float:1.794E-43)
                r17 = r3
                r3 = r5
                r4 = r17
                goto L_0x00f3
            L_0x0071:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007b
                if (r3 >= r13) goto L_0x00a6
            L_0x007b:
                r15 = 3
                long r15 = r6 - r15
                int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r15 > 0) goto L_0x00a6
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                tc.b0.q(r1, r4, r3)
                long r11 = r11 + r14
                int r3 = r13 >>> 6
                r3 = r3 & 63
                r3 = r3 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                tc.b0.q(r1, r14, r3)
                r3 = 1
                long r3 = r3 + r11
                r5 = r13 & 63
                r5 = r5 | 128(0x80, float:1.794E-43)
                byte r5 = (byte) r5
                tc.b0.q(r1, r11, r5)
                r11 = 1
                goto L_0x0068
            L_0x00a6:
                r11 = 4
                long r11 = r6 - r11
                int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r11 > 0) goto L_0x0100
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x00f8
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x00f7
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                tc.b0.q(r1, r4, r15)
                long r11 = r11 + r13
                int r4 = r2 >>> 12
                r4 = r4 & 63
                r5 = 128(0x80, float:1.794E-43)
                r4 = r4 | 128(0x80, float:1.794E-43)
                byte r4 = (byte) r4
                tc.b0.q(r1, r13, r4)
                r13 = 1
                long r13 = r13 + r11
                int r4 = r2 >>> 6
                r4 = r4 & 63
                r4 = r4 | r5
                byte r4 = (byte) r4
                tc.b0.q(r1, r11, r4)
                r11 = 1
                long r15 = r13 + r11
                r2 = r2 & 63
                r2 = r2 | r5
                byte r2 = (byte) r2
                tc.b0.q(r1, r13, r2)
                r2 = r3
                r3 = r5
                r4 = r15
            L_0x00f3:
                int r2 = r2 + 1
                goto L_0x0033
            L_0x00f7:
                r2 = r3
            L_0x00f8:
                com.google.protobuf.e0$c r0 = new com.google.protobuf.e0$c
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x0100:
                if (r14 > r13) goto L_0x0118
                if (r13 > r3) goto L_0x0118
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0112
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0118
            L_0x0112:
                com.google.protobuf.e0$c r0 = new com.google.protobuf.e0$c
                r0.<init>(r2, r8)
                throw r0
            L_0x0118:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0133:
                int r0 = (int) r4
                return r0
            L_0x0135:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = android.support.v4.media.a.q(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e0.d.a(java.lang.CharSequence, byte[], int, int):int");
        }

        public final int b(byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            byte[] bArr2 = bArr;
            int i14 = i10;
            int i15 = i11;
            if ((i14 | i15 | (bArr2.length - i15)) >= 0) {
                long j10 = (long) i14;
                int i16 = (int) (((long) i15) - j10);
                if (i16 >= 16) {
                    int i17 = 8 - (((int) j10) & 7);
                    long j11 = j10;
                    int i18 = 0;
                    while (true) {
                        if (i12 >= i17) {
                            while (true) {
                                int i19 = i12 + 8;
                                if (i19 > i16) {
                                    i13 = i12;
                                    break;
                                }
                                i13 = i12;
                                if ((tc.b0.n(bArr2, tc.b0.f14957f + j11) & -9187201950435737472L) != 0) {
                                    break;
                                }
                                j11 += 8;
                                i12 = i19;
                            }
                            i12 = i13;
                            while (true) {
                                if (i12 >= i16) {
                                    i12 = i16;
                                    break;
                                }
                                long j12 = j11 + 1;
                                if (tc.b0.h(bArr2, j11) < 0) {
                                    break;
                                }
                                i12++;
                                j11 = j12;
                            }
                        } else {
                            long j13 = j11 + 1;
                            if (tc.b0.h(bArr2, j11) < 0) {
                                break;
                            }
                            i18 = i12 + 1;
                            j11 = j13;
                        }
                    }
                } else {
                    i12 = 0;
                }
                int i20 = i16 - i12;
                long j14 = j10 + ((long) i12);
                while (true) {
                    byte b10 = 0;
                    while (true) {
                        if (i20 <= 0) {
                            break;
                        }
                        long j15 = j14 + 1;
                        b10 = tc.b0.h(bArr2, j14);
                        if (b10 < 0) {
                            j14 = j15;
                            break;
                        }
                        i20--;
                        j14 = j15;
                    }
                    if (i20 != 0) {
                        int i21 = i20 - 1;
                        if (b10 >= -32) {
                            if (b10 >= -16) {
                                if (i21 >= 3) {
                                    i20 = i21 - 3;
                                    long j16 = j14 + 1;
                                    byte h10 = tc.b0.h(bArr2, j14);
                                    if (h10 > -65) {
                                        break;
                                    }
                                    if ((((h10 + 112) + (b10 << 28)) >> 30) != 0) {
                                        break;
                                    }
                                    long j17 = j16 + 1;
                                    if (tc.b0.h(bArr2, j16) > -65) {
                                        break;
                                    }
                                    long j18 = j17 + 1;
                                    if (tc.b0.h(bArr2, j17) > -65) {
                                        break;
                                    }
                                    j14 = j18;
                                } else {
                                    return c(j14, bArr2, b10, i21);
                                }
                            } else if (i21 >= 2) {
                                i20 = i21 - 2;
                                long j19 = j14 + 1;
                                byte h11 = tc.b0.h(bArr2, j14);
                                if (h11 > -65 || ((b10 == -32 && h11 < -96) || (b10 == -19 && h11 >= -96))) {
                                    break;
                                }
                                j14 = j19 + 1;
                                if (tc.b0.h(bArr2, j19) > -65) {
                                    break;
                                }
                            } else {
                                return c(j14, bArr2, b10, i21);
                            }
                        } else if (i21 != 0) {
                            i20 = i21 - 1;
                            if (b10 < -62) {
                                break;
                            }
                            long j20 = j14 + 1;
                            if (tc.b0.h(bArr2, j14) > -65) {
                                break;
                            }
                            j14 = j20;
                        } else {
                            return b10;
                        }
                    } else {
                        return 0;
                    }
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
        }
    }

    static {
        boolean z10;
        a aVar;
        if (!tc.b0.f14956e || !tc.b0.f14955d) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || tc.a.a()) {
            aVar = new b();
        } else {
            aVar = new d();
        }
        f7900a = aVar;
    }

    public static int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                b10 = -1;
            }
            return b10;
        } else if (i12 == 1) {
            return c(b10, bArr[i10]);
        } else {
            if (i12 == 2) {
                return d(b10, bArr[i10], bArr[i10 + 1]);
            }
            throw new AssertionError();
        }
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new c(i11, length2);
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
        StringBuilder q10 = android.support.v4.media.a.q("UTF-8 length does not fit in int: ");
        q10.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(q10.toString());
    }

    public static int c(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int d(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
