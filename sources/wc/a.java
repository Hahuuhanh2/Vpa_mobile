package wc;

import cd.b;
import cd.e;
import com.google.zxing.FormatException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.ArrayList;
import java.util.Arrays;
import v.v;
import z.d;

/* compiled from: Decoder */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f16790b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f16791c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f16792d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f16793e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f16794f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a  reason: collision with root package name */
    public vc.a f16795a;

    public static int b(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    public final e a(vc.a aVar) {
        int i10;
        int i11;
        int i12;
        ed.a aVar2;
        FormatException formatException;
        int i13;
        String str;
        int i14;
        boolean z10;
        boolean z11;
        vc.a aVar3 = aVar;
        this.f16795a = aVar3;
        b bVar = (b) aVar3.f17386a;
        boolean z12 = aVar3.f16166c;
        int i15 = aVar3.f16168e;
        if (z12) {
            i10 = 11;
        } else {
            i10 = 14;
        }
        int i16 = i10 + (i15 << 2);
        int[] iArr = new int[i16];
        if (z12) {
            i11 = 88;
        } else {
            i11 = 112;
        }
        int i17 = (i11 + (i15 << 4)) * i15;
        boolean[] zArr = new boolean[i17];
        char c10 = 2;
        if (z12) {
            for (int i18 = 0; i18 < i16; i18++) {
                iArr[i18] = i18;
            }
        } else {
            int i19 = i16 / 2;
            int i20 = ((((i19 - 1) / 15) * 2) + (i16 + 1)) / 2;
            for (int i21 = 0; i21 < i19; i21++) {
                int i22 = (i21 / 15) + i21;
                iArr[(i19 - i21) - 1] = (i20 - i22) - 1;
                iArr[i19 + i21] = i22 + i20 + 1;
            }
        }
        int i23 = 0;
        int i24 = 0;
        while (true) {
            i12 = 12;
            if (i23 >= i15) {
                break;
            }
            int i25 = (i15 - i23) << c10;
            if (z12) {
                i12 = 9;
            }
            int i26 = i25 + i12;
            int i27 = i23 << 1;
            int i28 = (i16 - 1) - i27;
            int i29 = 0;
            while (i29 < i26) {
                int i30 = i29 << 1;
                int i31 = i15;
                int i32 = 0;
                while (i32 < c10) {
                    int i33 = i27 + i32;
                    int i34 = i27 + i29;
                    int i35 = i16;
                    zArr[i24 + i30 + i32] = bVar.b(iArr[i33], iArr[i34]);
                    int i36 = i28 - i32;
                    zArr[(i26 * 2) + i24 + i30 + i32] = bVar.b(iArr[i34], iArr[i36]);
                    int i37 = iArr[i36];
                    int i38 = i28 - i29;
                    zArr[(i26 * 4) + i24 + i30 + i32] = bVar.b(i37, iArr[i38]);
                    zArr[(i26 * 6) + i24 + i30 + i32] = bVar.b(iArr[i38], iArr[i33]);
                    i32++;
                    c10 = 2;
                    i16 = i35;
                    z12 = z12;
                    i27 = i27;
                }
                boolean z13 = z12;
                int i39 = i16;
                int i40 = i27;
                i29++;
                c10 = 2;
                i15 = i31;
            }
            boolean z14 = z12;
            int i41 = i16;
            i24 += i26 << 3;
            i23++;
            c10 = 2;
            i15 = i15;
        }
        vc.a aVar4 = this.f16795a;
        int i42 = aVar4.f16168e;
        int i43 = 8;
        if (i42 <= 2) {
            aVar2 = ed.a.f9341j;
            i12 = 6;
        } else if (i42 <= 8) {
            aVar2 = ed.a.f9345n;
            i12 = 8;
        } else if (i42 <= 22) {
            i12 = 10;
            aVar2 = ed.a.f9340i;
        } else {
            aVar2 = ed.a.f9339h;
        }
        int i44 = aVar4.f16167d;
        int i45 = i17 / i12;
        if (i45 >= i44) {
            int i46 = i17 % i12;
            int[] iArr2 = new int[i45];
            int i47 = 0;
            while (i47 < i45) {
                iArr2[i47] = b(zArr, i46, i12);
                i47++;
                i46 += i12;
            }
            try {
                new d((Object) aVar2).d(iArr2, i45 - i44);
                int i48 = 1;
                int i49 = (1 << i12) - 1;
                int i50 = 0;
                int i51 = 0;
                while (i50 < i44) {
                    int i52 = iArr2[i50];
                    if (i52 == 0 || i52 == i49) {
                        throw FormatException.a();
                    }
                    if (i52 == i48 || i52 == i49 - 1) {
                        i51++;
                    }
                    i50++;
                    i48 = 1;
                }
                int i53 = (i44 * i12) - i51;
                boolean[] zArr2 = new boolean[i53];
                int i54 = 0;
                for (int i55 = 0; i55 < i44; i55++) {
                    int i56 = iArr2[i55];
                    int i57 = 1;
                    if (i56 == 1 || i56 == i49 - 1) {
                        int i58 = (i54 + i12) - 1;
                        if (i56 > 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Arrays.fill(zArr2, i54, i58, z10);
                        i54 = (i12 - 1) + i54;
                    } else {
                        int i59 = i12 - 1;
                        while (i59 >= 0) {
                            int i60 = i54 + 1;
                            if (((i57 << i59) & i56) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zArr2[i54] = z11;
                            i59--;
                            i57 = 1;
                            i54 = i60;
                        }
                    }
                }
                int i61 = (i53 + 7) / 8;
                byte[] bArr = new byte[i61];
                for (int i62 = 0; i62 < i61; i62++) {
                    int i63 = i62 << 3;
                    int i64 = i53 - i63;
                    if (i64 >= 8) {
                        i14 = b(zArr2, i63, 8);
                    } else {
                        i14 = b(zArr2, i63, i64) << (8 - i64);
                    }
                    bArr[i62] = (byte) i14;
                }
                StringBuilder sb2 = new StringBuilder(20);
                int i65 = 1;
                int i66 = 1;
                int i67 = 0;
                while (i67 < i53) {
                    if (i65 == 6) {
                        if (i53 - i67 < 5) {
                            break;
                        }
                        int b10 = b(zArr2, i67, 5);
                        i67 += 5;
                        if (b10 == 0) {
                            if (i53 - i67 < 11) {
                                break;
                            }
                            b10 = b(zArr2, i67, 11) + 31;
                            i67 += 11;
                        }
                        int i68 = 0;
                        while (true) {
                            if (i68 >= b10) {
                                break;
                            } else if (i53 - i67 < i43) {
                                i67 = i53;
                                break;
                            } else {
                                sb2.append((char) b(zArr2, i67, i43));
                                i67 += 8;
                                i68++;
                            }
                        }
                    } else {
                        int i69 = 4;
                        if (i65 == 4) {
                            i13 = 4;
                        } else {
                            i13 = 5;
                        }
                        if (i53 - i67 < i13) {
                            break;
                        }
                        int b11 = b(zArr2, i67, i13);
                        i67 += i13;
                        int g2 = v.g(i65);
                        if (g2 == 0) {
                            str = f16790b[b11];
                        } else if (g2 == 1) {
                            str = f16791c[b11];
                        } else if (g2 == 2) {
                            str = f16792d[b11];
                        } else if (g2 == 3) {
                            str = f16794f[b11];
                        } else if (g2 == 4) {
                            str = f16793e[b11];
                        } else {
                            throw new IllegalStateException("Bad table");
                        }
                        if (str.startsWith("CTRL_")) {
                            char charAt = str.charAt(5);
                            if (charAt == 'B') {
                                i69 = 6;
                            } else if (charAt != 'D') {
                                if (charAt == 'P') {
                                    i69 = 5;
                                } else if (charAt == 'L') {
                                    i69 = 2;
                                } else if (charAt != 'M') {
                                    i69 = 1;
                                } else {
                                    i69 = 3;
                                }
                            }
                            if (str.charAt(6) == 'L') {
                                i66 = i69;
                            } else {
                                int i70 = i65;
                                i65 = i69;
                                i43 = 8;
                                i66 = i70;
                            }
                        } else {
                            sb2.append(str);
                        }
                        i43 = 8;
                    }
                    i65 = i66;
                }
                return new e(bArr, sb2.toString(), (ArrayList) null, (String) null);
            } catch (ReedSolomonException e10) {
                FormatException formatException2 = FormatException.f7966c;
                if (ReaderException.f7968a) {
                    formatException = new FormatException(e10);
                } else {
                    formatException = FormatException.f7966c;
                }
                throw formatException;
            }
        } else {
            throw FormatException.a();
        }
    }
}
