package kd;

import cd.a;
import com.google.zxing.NotFoundException;

/* compiled from: UPCEReader */
public final class w extends u {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f12514j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k  reason: collision with root package name */
    public static final int[][] f12515k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i  reason: collision with root package name */
    public final int[] f12516i = new int[4];

    public static String r(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c10);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c10);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    public final boolean h(String str) {
        return u.i(r(str));
    }

    public final int[] k(int i10, a aVar) {
        return u.n(aVar, i10, true, f12514j, new int[6]);
    }

    public final int l(a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f12516i;
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
        for (int i15 = 0; i15 <= 1; i15++) {
            for (int i16 = 0; i16 < 10; i16++) {
                if (i12 == f12515k[i15][i16]) {
                    sb2.insert(0, (char) (i15 + 48));
                    sb2.append((char) (i16 + 48));
                    return i11;
                }
            }
        }
        throw NotFoundException.f7967c;
    }

    public final uc.a p() {
        return uc.a.UPC_E;
    }
}
