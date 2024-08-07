package kd;

import cd.a;
import com.google.zxing.NotFoundException;

/* compiled from: EAN13Reader */
public final class i extends u {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f12483j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i  reason: collision with root package name */
    public final int[] f12484i = new int[4];

    public final int l(a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f12484i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i10 = aVar.f4688b;
        int i11 = iArr[1];
        int i12 = 0;
        for (int i13 = 0; i13 < 6 && i11 < i10; i13++) {
            int j10 = u.j(aVar, iArr2, i11, u.f12510h);
            sb2.append((char) ((j10 % 10) + 48));
            for (int i14 : iArr2) {
                i11 += i14;
            }
            if (j10 >= 10) {
                i12 |= 1 << (5 - i13);
            }
        }
        for (int i15 = 0; i15 < 10; i15++) {
            if (i12 == f12483j[i15]) {
                sb2.insert(0, (char) (i15 + 48));
                int i16 = u.n(aVar, i11, true, u.f12507e, new int[5])[1];
                for (int i17 = 0; i17 < 6 && i16 < i10; i17++) {
                    sb2.append((char) (u.j(aVar, iArr2, i16, u.f12509g) + 48));
                    for (int i18 : iArr2) {
                        i16 += i18;
                    }
                }
                return i16;
            }
        }
        throw NotFoundException.f7967c;
    }

    public final uc.a p() {
        return uc.a.EAN_13;
    }
}
