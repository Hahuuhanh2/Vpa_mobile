package kd;

import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import uc.b;
import uc.h;
import uc.j;

/* compiled from: CodaBarReader */
public final class a extends q {

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f12463d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f12464e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f  reason: collision with root package name */
    public static final char[] f12465f = {'A', 'B', 'C', 'D'};

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f12466a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public int[] f12467b = new int[80];

    /* renamed from: c  reason: collision with root package name */
    public int f12468c = 0;

    public static boolean h(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final h c(int i10, cd.a aVar, Map<b, ?> map) {
        cd.a aVar2 = aVar;
        Map<b, ?> map2 = map;
        Arrays.fill(this.f12467b, 0);
        this.f12468c = 0;
        int g2 = aVar2.g(0);
        int i11 = aVar2.f4688b;
        if (g2 < i11) {
            int i12 = 0;
            boolean z10 = true;
            while (g2 < i11) {
                if (aVar2.e(g2) != z10) {
                    i12++;
                } else {
                    int[] iArr = this.f12467b;
                    int i13 = this.f12468c;
                    iArr[i13] = i12;
                    int i14 = i13 + 1;
                    this.f12468c = i14;
                    if (i14 >= iArr.length) {
                        int[] iArr2 = new int[(i14 << 1)];
                        System.arraycopy(iArr, 0, iArr2, 0, i14);
                        this.f12467b = iArr2;
                    }
                    z10 = !z10;
                    i12 = 1;
                }
                g2++;
            }
            int[] iArr3 = this.f12467b;
            int i15 = this.f12468c;
            iArr3[i15] = i12;
            int i16 = i15 + 1;
            this.f12468c = i16;
            if (i16 >= iArr3.length) {
                int[] iArr4 = new int[(i16 << 1)];
                System.arraycopy(iArr3, 0, iArr4, 0, i16);
                this.f12467b = iArr4;
            }
            int i17 = 1;
            while (i17 < this.f12468c) {
                int i18 = i(i17);
                if (i18 != -1 && h(f12465f, f12463d[i18])) {
                    int i19 = 0;
                    for (int i20 = i17; i20 < i17 + 7; i20++) {
                        i19 += this.f12467b[i20];
                    }
                    if (i17 == 1 || this.f12467b[i17 - 1] >= i19 / 2) {
                        this.f12466a.setLength(0);
                        int i21 = i17;
                        while (true) {
                            int i22 = i(i21);
                            if (i22 != -1) {
                                this.f12466a.append((char) i22);
                                i21 += 8;
                                if ((this.f12466a.length() <= 1 || !h(f12465f, f12463d[i22])) && i21 < this.f12468c) {
                                    int i23 = i10;
                                }
                            } else {
                                throw NotFoundException.f7967c;
                            }
                        }
                        int i24 = i21 - 1;
                        int i25 = this.f12467b[i24];
                        int i26 = 0;
                        for (int i27 = -8; i27 < -1; i27++) {
                            i26 += this.f12467b[i21 + i27];
                        }
                        if (i21 >= this.f12468c || i25 >= i26 / 2) {
                            int[] iArr5 = {0, 0, 0, 0};
                            int[] iArr6 = {0, 0, 0, 0};
                            int length = this.f12466a.length() - 1;
                            int i28 = i17;
                            int i29 = 0;
                            while (true) {
                                int i30 = f12464e[this.f12466a.charAt(i29)];
                                for (int i31 = 6; i31 >= 0; i31--) {
                                    int i32 = (i31 & 1) + ((i30 & 1) << 1);
                                    iArr5[i32] = iArr5[i32] + this.f12467b[i28 + i31];
                                    iArr6[i32] = iArr6[i32] + 1;
                                    i30 >>= 1;
                                }
                                if (i29 >= length) {
                                    break;
                                }
                                i28 += 8;
                                i29++;
                            }
                            float[] fArr = new float[4];
                            float[] fArr2 = new float[4];
                            int i33 = 0;
                            for (int i34 = 2; i33 < i34; i34 = 2) {
                                fArr2[i33] = 0.0f;
                                int i35 = i33 + 2;
                                float f10 = ((float) iArr5[i33]) / ((float) iArr6[i33]);
                                float f11 = (float) iArr5[i35];
                                float f12 = (float) iArr6[i35];
                                float f13 = ((f11 / f12) + f10) / 2.0f;
                                fArr2[i35] = f13;
                                fArr[i33] = f13;
                                fArr[i35] = ((f11 * 2.0f) + 1.5f) / f12;
                                i33++;
                            }
                            int i36 = i17;
                            int i37 = 0;
                            loop8:
                            while (true) {
                                int i38 = f12464e[this.f12466a.charAt(i37)];
                                int i39 = 6;
                                while (i39 >= 0) {
                                    int i40 = (i39 & 1) + ((i38 & 1) << 1);
                                    float f14 = (float) this.f12467b[i36 + i39];
                                    if (f14 >= fArr2[i40] && f14 <= fArr[i40]) {
                                        i38 >>= 1;
                                        i39--;
                                    }
                                }
                                if (i37 < length) {
                                    i36 += 8;
                                    i37++;
                                } else {
                                    for (int i41 = 0; i41 < this.f12466a.length(); i41++) {
                                        StringBuilder sb2 = this.f12466a;
                                        sb2.setCharAt(i41, f12463d[sb2.charAt(i41)]);
                                    }
                                    char charAt = this.f12466a.charAt(0);
                                    char[] cArr = f12465f;
                                    if (h(cArr, charAt)) {
                                        StringBuilder sb3 = this.f12466a;
                                        if (!h(cArr, sb3.charAt(sb3.length() - 1))) {
                                            throw NotFoundException.f7967c;
                                        } else if (this.f12466a.length() > 3) {
                                            if (map2 == null || !map2.containsKey(b.RETURN_CODABAR_START_END)) {
                                                StringBuilder sb4 = this.f12466a;
                                                sb4.deleteCharAt(sb4.length() - 1);
                                                this.f12466a.deleteCharAt(0);
                                            }
                                            int i42 = 0;
                                            for (int i43 = 0; i43 < i17; i43++) {
                                                i42 += this.f12467b[i43];
                                            }
                                            float f15 = (float) i42;
                                            while (i17 < i24) {
                                                i42 += this.f12467b[i17];
                                                i17++;
                                            }
                                            float f16 = (float) i10;
                                            return new h(this.f12466a.toString(), (byte[]) null, new j[]{new j(f15, f16), new j((float) i42, f16)}, uc.a.CODABAR);
                                        } else {
                                            throw NotFoundException.f7967c;
                                        }
                                    } else {
                                        throw NotFoundException.f7967c;
                                    }
                                }
                            }
                            throw NotFoundException.f7967c;
                        }
                        throw NotFoundException.f7967c;
                    }
                }
                int i44 = i10;
                i17 += 2;
            }
            throw NotFoundException.f7967c;
        }
        throw NotFoundException.f7967c;
    }

    public final int i(int i10) {
        int i11;
        int i12 = i10 + 7;
        if (i12 >= this.f12468c) {
            return -1;
        }
        int[] iArr = this.f12467b;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        int i15 = Integer.MAX_VALUE;
        int i16 = 0;
        for (int i17 = i10; i17 < i12; i17 += 2) {
            int i18 = iArr[i17];
            if (i18 < i15) {
                i15 = i18;
            }
            if (i18 > i16) {
                i16 = i18;
            }
        }
        int i19 = (i15 + i16) / 2;
        int i20 = 0;
        for (int i21 = i10 + 1; i21 < i12; i21 += 2) {
            int i22 = iArr[i21];
            if (i22 < i13) {
                i13 = i22;
            }
            if (i22 > i20) {
                i20 = i22;
            }
        }
        int i23 = (i13 + i20) / 2;
        int i24 = 128;
        int i25 = 0;
        for (int i26 = 0; i26 < 7; i26++) {
            if ((i26 & 1) == 0) {
                i11 = i19;
            } else {
                i11 = i23;
            }
            i24 >>= 1;
            if (iArr[i10 + i26] > i11) {
                i25 |= i24;
            }
        }
        while (true) {
            int[] iArr2 = f12464e;
            if (i14 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i14] == i25) {
                return i14;
            }
            i14++;
        }
    }
}
