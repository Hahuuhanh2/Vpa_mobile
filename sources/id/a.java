package id;

import al.g0;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.text.DecimalFormat;
import java.util.Map;
import lc.b;
import p3.l0;
import uc.g;
import uc.h;
import uc.i;
import uc.j;
import vl.d;

/* compiled from: MaxiCodeReader */
public final class a implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final j[] f11430b = new j[0];

    /* renamed from: a  reason: collision with root package name */
    public final b f11431a = new b(8);

    public final h a(d dVar) {
        return b(dVar, (Map<uc.b, ?>) null);
    }

    public final h b(d dVar, Map<uc.b, ?> map) {
        byte[] bArr;
        String str;
        boolean z10;
        cd.b e10 = dVar.e();
        int i10 = e10.f4689a;
        int i11 = e10.f4690b;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < e10.f4690b; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = e10.f4691c;
                if (i15 >= i16) {
                    break;
                }
                int i17 = e10.f4692d[(i16 * i14) + i15];
                if (i17 != 0) {
                    if (i14 < i11) {
                        i11 = i14;
                    }
                    if (i14 > i13) {
                        i13 = i14;
                    }
                    int i18 = i15 << 5;
                    if (i18 < i10) {
                        int i19 = 0;
                        while ((i17 << (31 - i19)) == 0) {
                            i19++;
                        }
                        int i20 = i19 + i18;
                        if (i20 < i10) {
                            i10 = i20;
                        }
                    }
                    if (i18 + 31 > i12) {
                        int i21 = 31;
                        while ((i17 >>> i21) == 0) {
                            i21--;
                        }
                        int i22 = i18 + i21;
                        if (i22 > i12) {
                            i12 = i22;
                        }
                    }
                }
                i15++;
            }
        }
        int[] iArr = (i12 < i10 || i13 < i11) ? null : new int[]{i10, i11, (i12 - i10) + 1, (i13 - i11) + 1};
        if (iArr != null) {
            int i23 = iArr[0];
            int i24 = iArr[1];
            int i25 = iArr[2];
            int i26 = iArr[3];
            int i27 = (30 + 31) / 32;
            int[] iArr2 = new int[(i27 * 33)];
            for (int i28 = 0; i28 < 33; i28++) {
                int i29 = (((i26 / 2) + (i28 * i26)) / 33) + i24;
                for (int i30 = 0; i30 < 30; i30++) {
                    if (e10.b((((((i28 & 1) * i25) / 2) + ((i25 / 2) + (i30 * i25))) / 30) + i23, i29)) {
                        int i31 = (i30 / 32) + (i28 * i27);
                        iArr2[i31] = (1 << (i30 & 31)) | iArr2[i31];
                    }
                }
            }
            b bVar = this.f11431a;
            bVar.getClass();
            byte[] bArr2 = new byte[144];
            for (int i32 = 0; i32 < 33; i32++) {
                int[] iArr3 = l0.f13953d[i32];
                for (int i33 = 0; i33 < 30; i33++) {
                    int i34 = iArr3[i33];
                    if (i34 >= 0) {
                        if (((iArr2[(i33 / 32) + (i32 * i27)] >>> (i33 & 31)) & 1) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            int i35 = i34 / 6;
                            bArr2[i35] = (byte) (((byte) (1 << (5 - (i34 % 6)))) | bArr2[i35]);
                        }
                    }
                }
            }
            bVar.a(bArr2, 0, 10, 10, 0);
            byte b10 = bArr2[0] & 15;
            if (b10 == 2 || b10 == 3 || b10 == 4) {
                b bVar2 = bVar;
                byte[] bArr3 = bArr2;
                bVar2.a(bArr3, 20, 84, 40, 1);
                bVar2.a(bArr3, 20, 84, 40, 2);
                bArr = new byte[94];
            } else if (b10 == 5) {
                b bVar3 = bVar;
                byte[] bArr4 = bArr2;
                bVar3.a(bArr4, 20, 68, 56, 1);
                bVar3.a(bArr4, 20, 68, 56, 2);
                bArr = new byte[78];
            } else {
                throw FormatException.a();
            }
            System.arraycopy(bArr2, 0, bArr, 0, 10);
            System.arraycopy(bArr2, 20, bArr, 10, bArr.length - 10);
            StringBuilder sb2 = new StringBuilder(144);
            if (b10 == 2 || b10 == 3) {
                if (b10 == 2) {
                    str = new DecimalFormat("0000000000".substring(0, g0.U(bArr, new byte[]{39, 40, 41, 42, 31, 32}))).format((long) g0.U(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
                } else {
                    String[] strArr = g0.f19026p;
                    str = String.valueOf(new char[]{strArr[0].charAt(g0.U(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(g0.U(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(g0.U(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(g0.U(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(g0.U(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(g0.U(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
                }
                DecimalFormat decimalFormat = new DecimalFormat("000");
                String format = decimalFormat.format((long) g0.U(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
                String format2 = decimalFormat.format((long) g0.U(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
                sb2.append(g0.X(bArr, 10, 84));
                if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                    sb2.insert(9, str + 29 + format + 29 + format2 + 29);
                } else {
                    sb2.insert(0, str + 29 + format + 29 + format2 + 29);
                }
            } else if (b10 == 4) {
                sb2.append(g0.X(bArr, 1, 93));
            } else if (b10 == 5) {
                sb2.append(g0.X(bArr, 1, 77));
            }
            String sb3 = sb2.toString();
            String valueOf = String.valueOf(b10);
            h hVar = new h(sb3, bArr, f11430b, uc.a.MAXICODE);
            if (valueOf != null) {
                hVar.b(i.ERROR_CORRECTION_LEVEL, valueOf);
            }
            return hVar;
        }
        throw NotFoundException.f7967c;
    }

    public final void reset() {
    }
}
