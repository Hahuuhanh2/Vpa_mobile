package cd;

import com.google.zxing.NotFoundException;
import h4.i;
import java.lang.reflect.Array;
import uc.d;

/* compiled from: HybridBinarizer */
public final class f extends i {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f4708f = new byte[0];

    /* renamed from: c  reason: collision with root package name */
    public byte[] f4709c = f4708f;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f4710d = new int[32];

    /* renamed from: e  reason: collision with root package name */
    public b f4711e;

    public f(d dVar) {
        super(dVar, 2);
    }

    public static int j(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            if (i14 > i10) {
                i12 = i13;
                i10 = i14;
            }
            if (i14 > i11) {
                i11 = i14;
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 - i12;
            int i19 = iArr[i17] * i18 * i18;
            if (i19 > i16) {
                i15 = i17;
                i16 = i19;
            }
        }
        if (i12 <= i15) {
            int i20 = i12;
            i12 = i15;
            i15 = i20;
        }
        if (i12 - i15 > length / 16) {
            int i21 = i12 - 1;
            int i22 = -1;
            int i23 = i21;
            while (i21 > i15) {
                int i24 = i21 - i15;
                int i25 = (i11 - iArr[i21]) * (i12 - i21) * i24 * i24;
                if (i25 > i22) {
                    i23 = i21;
                    i22 = i25;
                }
                i21--;
            }
            return i23 << 3;
        }
        throw NotFoundException.f7967c;
    }

    public final f e(d dVar) {
        return new f(dVar);
    }

    public final b g() {
        int i10;
        int i11;
        int i12;
        int i13;
        b bVar = this.f4711e;
        if (bVar != null) {
            return bVar;
        }
        d dVar = (d) this.f10560b;
        int i14 = dVar.f15462a;
        int i15 = dVar.f15463b;
        int i16 = 0;
        if (i14 < 40 || i15 < 40) {
            b bVar2 = new b(i14, i15);
            if (this.f4709c.length < i14) {
                this.f4709c = new byte[i14];
            }
            for (int i17 = 0; i17 < 32; i17++) {
                this.f4710d[i17] = 0;
            }
            int[] iArr = this.f4710d;
            for (int i18 = 1; i18 < 5; i18++) {
                byte[] b10 = dVar.b((i15 * i18) / 5, this.f4709c);
                int i19 = (i14 << 2) / 5;
                for (int i20 = i14 / 5; i20 < i19; i20++) {
                    int i21 = (b10[i20] & 255) >> 3;
                    iArr[i21] = iArr[i21] + 1;
                }
            }
            int j10 = j(iArr);
            byte[] a10 = dVar.a();
            for (int i22 = 0; i22 < i15; i22++) {
                int i23 = i22 * i14;
                for (int i24 = 0; i24 < i14; i24++) {
                    if ((a10[i23 + i24] & 255) < j10) {
                        bVar2.g(i24, i22);
                    }
                }
            }
            this.f4711e = bVar2;
        } else {
            byte[] a11 = dVar.a();
            int i25 = i14 >> 3;
            if ((i14 & 7) != 0) {
                i25++;
            }
            int i26 = i15 >> 3;
            if ((i15 & 7) != 0) {
                i26++;
            }
            int i27 = i15 - 8;
            int i28 = i14 - 8;
            int[] iArr2 = new int[2];
            iArr2[1] = i25;
            iArr2[0] = i26;
            int[][] iArr3 = (int[][]) Array.newInstance(Integer.TYPE, iArr2);
            int i29 = 0;
            while (true) {
                int i30 = 8;
                if (i29 >= i26) {
                    break;
                }
                int i31 = i29 << 3;
                if (i31 > i27) {
                    i31 = i27;
                }
                while (i16 < i25) {
                    int i32 = i16 << 3;
                    if (i32 > i28) {
                        i32 = i28;
                    }
                    int i33 = (i31 * i14) + i32;
                    int i34 = 0;
                    int i35 = 0;
                    byte b11 = 255;
                    byte b12 = 0;
                    while (i34 < i30) {
                        byte b13 = b11;
                        byte b14 = b12;
                        int i36 = 0;
                        while (i36 < i30) {
                            int i37 = i34;
                            byte b15 = a11[i33 + i36] & 255;
                            i35 += b15;
                            if (b15 < b13) {
                                b13 = b15;
                            }
                            byte b16 = b14;
                            if (b15 > b16) {
                                b14 = b15;
                            } else {
                                b14 = b16;
                            }
                            i36++;
                            i34 = i37;
                            i30 = 8;
                        }
                        int i38 = i34;
                        byte b17 = b14;
                        if (b17 - b13 > 24) {
                            while (true) {
                                i13 = i38 + 1;
                                i33 += i14;
                                if (i13 >= 8) {
                                    break;
                                }
                                byte b18 = b13;
                                int i39 = 0;
                                for (int i40 = 8; i39 < i40; i40 = 8) {
                                    i35 += a11[i33 + i39] & 255;
                                    i39++;
                                    b17 = b17;
                                }
                                i38 = i13;
                                b13 = b18;
                            }
                            b11 = b13;
                            b12 = b17;
                            i12 = i13;
                        } else {
                            b11 = b13;
                            b12 = b17;
                            i12 = i38;
                        }
                        i34 = i12 + 1;
                        i33 += i14;
                        i30 = 8;
                    }
                    int i41 = i35 >> 6;
                    byte b19 = b11;
                    if (b12 - b19 <= 24) {
                        i41 = b19 / 2;
                        if (i29 > 0 && i16 > 0) {
                            int[] iArr4 = iArr3[i29 - 1];
                            int i42 = i16 - 1;
                            int i43 = (((iArr3[i29][i42] * 2) + iArr4[i16]) + iArr4[i42]) / 4;
                            if (b19 < i43) {
                                i41 = i43;
                            }
                        }
                    }
                    iArr3[i29][i16] = i41;
                    i16++;
                    i30 = 8;
                }
                i29++;
                i16 = 0;
            }
            b bVar3 = new b(i14, i15);
            for (int i44 = 0; i44 < i26; i44++) {
                int i45 = i44 << 3;
                if (i45 > i27) {
                    i45 = i27;
                }
                int i46 = i26 - 3;
                if (i44 < 2) {
                    i10 = 2;
                } else {
                    i10 = Math.min(i44, i46);
                }
                int i47 = 0;
                while (i47 < i25) {
                    int i48 = i47 << 3;
                    if (i48 > i28) {
                        i48 = i28;
                    }
                    int i49 = i25 - 3;
                    int i50 = 2;
                    if (i47 < 2) {
                        i11 = 2;
                    } else {
                        i11 = Math.min(i47, i49);
                    }
                    int i51 = i25;
                    int i52 = -2;
                    int i53 = 0;
                    while (i52 <= i50) {
                        int[] iArr5 = iArr3[i10 + i52];
                        i53 = iArr5[i11 - 2] + iArr5[i11 - 1] + iArr5[i11] + iArr5[i11 + 1] + iArr5[i11 + 2] + i53;
                        i52++;
                        i50 = 2;
                    }
                    int i54 = i50;
                    int i55 = i53 / 25;
                    int i56 = (i45 * i14) + i48;
                    int i57 = i10;
                    int i58 = 8;
                    int i59 = 0;
                    while (i59 < i58) {
                        int i60 = i26;
                        int i61 = 0;
                        while (i61 < i58) {
                            byte[] bArr = a11;
                            if ((a11[i56 + i61] & 255) <= i55) {
                                bVar3.g(i48 + i61, i45 + i59);
                            }
                            i61++;
                            a11 = bArr;
                            i58 = 8;
                        }
                        byte[] bArr2 = a11;
                        i59++;
                        i56 += i14;
                        i26 = i60;
                        i58 = 8;
                    }
                    byte[] bArr3 = a11;
                    int i62 = i26;
                    i47++;
                    i25 = i51;
                    i10 = i57;
                }
                byte[] bArr4 = a11;
                int i63 = i25;
                int i64 = i26;
            }
            this.f4711e = bVar3;
        }
        return this.f4711e;
    }

    public final a h(int i10, a aVar) {
        int i11;
        d dVar = (d) this.f10560b;
        int i12 = dVar.f15462a;
        if (aVar == null || aVar.f4688b < i12) {
            aVar = new a(i12);
        } else {
            int length = aVar.f4687a.length;
            for (int i13 = 0; i13 < length; i13++) {
                aVar.f4687a[i13] = 0;
            }
        }
        if (this.f4709c.length < i12) {
            this.f4709c = new byte[i12];
        }
        for (int i14 = 0; i14 < 32; i14++) {
            this.f4710d[i14] = 0;
        }
        byte[] b10 = dVar.b(i10, this.f4709c);
        int[] iArr = this.f4710d;
        int i15 = 0;
        while (true) {
            i11 = 1;
            if (i15 >= i12) {
                break;
            }
            int i16 = (b10[i15] & 255) >> 3;
            iArr[i16] = iArr[i16] + 1;
            i15++;
        }
        int j10 = j(iArr);
        if (i12 < 3) {
            for (int i17 = 0; i17 < i12; i17++) {
                if ((b10[i17] & 255) < j10) {
                    aVar.l(i17);
                }
            }
        } else {
            byte b11 = b10[1] & 255;
            byte b12 = b10[0] & 255;
            byte b13 = b11;
            while (i11 < i12 - 1) {
                int i18 = i11 + 1;
                byte b14 = b10[i18] & 255;
                if ((((b13 << 2) - b12) - b14) / 2 < j10) {
                    aVar.l(i11);
                }
                b12 = b13;
                i11 = i18;
                b13 = b14;
            }
        }
        return aVar;
    }
}
