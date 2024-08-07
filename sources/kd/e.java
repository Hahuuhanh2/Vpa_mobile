package kd;

import cd.a;
import com.google.zxing.ChecksumException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import uc.b;
import uc.h;
import uc.j;

/* compiled from: Code39Reader */
public final class e extends q {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f12474d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12475a;

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f12476b = new StringBuilder(20);

    /* renamed from: c  reason: collision with root package name */
    public final int[] f12477c = new int[9];

    public e(boolean z10) {
        this.f12475a = z10;
    }

    public static int h(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i14 |= 1 << ((length - 1) - i16);
                    i13++;
                    i15 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if ((i19 << 1) >= i15) {
                            return -1;
                        }
                    }
                }
                return i14;
            } else if (i13 <= 3) {
                return -1;
            } else {
                i10 = i11;
            }
        }
    }

    public final h c(int i10, a aVar, Map<b, ?> map) {
        char c10;
        a aVar2 = aVar;
        int[] iArr = this.f12477c;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f12476b;
        sb2.setLength(0);
        int i11 = aVar2.f4688b;
        int f10 = aVar2.f(0);
        int length = iArr.length;
        boolean z10 = false;
        int i12 = 0;
        int i13 = f10;
        while (f10 < i11) {
            if (aVar2.e(f10) != z10) {
                iArr[i12] = iArr[i12] + 1;
                int i14 = i10;
            } else {
                if (i12 == length - 1) {
                    int i15 = 148;
                    if (h(iArr) != 148 || !aVar2.j(Math.max(0, i13 - ((f10 - i13) / 2)), i13)) {
                        int i16 = i10;
                        i13 += iArr[0] + iArr[1];
                        int i17 = i12 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i17);
                        iArr[i17] = 0;
                        iArr[i12] = 0;
                        i12 = i17;
                    } else {
                        int[] iArr2 = {i13, f10};
                        int f11 = aVar2.f(f10);
                        int i18 = aVar2.f4688b;
                        while (true) {
                            q.f(f11, aVar2, iArr);
                            int h10 = h(iArr);
                            if (h10 >= 0) {
                                int i19 = 0;
                                while (true) {
                                    int[] iArr3 = f12474d;
                                    if (i19 < 43) {
                                        if (iArr3[i19] == h10) {
                                            c10 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i19);
                                            break;
                                        }
                                        i19++;
                                    } else if (h10 == i15) {
                                        c10 = '*';
                                    } else {
                                        throw NotFoundException.f7967c;
                                    }
                                }
                                sb2.append(c10);
                                int i20 = f11;
                                for (int i21 : iArr) {
                                    i20 += i21;
                                }
                                int f12 = aVar2.f(i20);
                                if (c10 == '*') {
                                    sb2.setLength(sb2.length() - 1);
                                    int i22 = 0;
                                    for (int i23 : iArr) {
                                        i22 += i23;
                                    }
                                    int i24 = (f12 - f11) - i22;
                                    if (f12 == i18 || (i24 << 1) >= i22) {
                                        if (this.f12475a) {
                                            int length2 = sb2.length() - 1;
                                            int i25 = 0;
                                            for (int i26 = 0; i26 < length2; i26++) {
                                                i25 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f12476b.charAt(i26));
                                            }
                                            if (sb2.charAt(length2) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i25 % 43)) {
                                                sb2.setLength(length2);
                                            } else {
                                                throw ChecksumException.a();
                                            }
                                        }
                                        if (sb2.length() != 0) {
                                            float f13 = (float) i10;
                                            return new h(sb2.toString(), (byte[]) null, new j[]{new j(((float) (iArr2[1] + iArr2[0])) / 2.0f, f13), new j((((float) i22) / 2.0f) + ((float) f11), f13)}, uc.a.CODE_39);
                                        }
                                        throw NotFoundException.f7967c;
                                    }
                                    throw NotFoundException.f7967c;
                                }
                                int i27 = i10;
                                f11 = f12;
                                i15 = 148;
                            } else {
                                throw NotFoundException.f7967c;
                            }
                        }
                    }
                } else {
                    int i28 = i10;
                    i12++;
                }
                iArr[i12] = 1;
                z10 = !z10;
            }
            f10++;
        }
        throw NotFoundException.f7967c;
    }
}
