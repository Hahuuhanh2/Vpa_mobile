package ml;

import ll.f;
import ll.s;
import ll.x;
import sk.j;

/* compiled from: Buffer.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f21571a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(yk.a.f23582b);
        j.e(bytes, "this as java.lang.String).getBytes(charset)");
        f21571a = bytes;
    }

    public static final String a(f fVar, long j10) {
        j.f(fVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (fVar.B(j11) == 13) {
                String W = fVar.W(j11);
                fVar.skip(2);
                return W;
            }
        }
        String W2 = fVar.W(j10);
        fVar.skip(1);
        return W2;
    }

    public static final int b(f fVar, s sVar, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        int i12;
        x xVar;
        int i13;
        f fVar2 = fVar;
        s sVar2 = sVar;
        j.f(fVar2, "<this>");
        j.f(sVar2, "options");
        x xVar2 = fVar2.f20877a;
        if (xVar2 != null) {
            byte[] bArr = xVar2.f20918a;
            int i14 = xVar2.f20919b;
            int i15 = xVar2.f20920c;
            int[] iArr = sVar2.f20902b;
            x xVar3 = xVar2;
            int i16 = -1;
            int i17 = 0;
            loop0:
            while (true) {
                int i18 = i17 + 1;
                int i19 = iArr[i17];
                int i20 = i18 + 1;
                int i21 = iArr[i18];
                if (i21 != -1) {
                    i16 = i21;
                }
                if (xVar3 == null) {
                    break;
                }
                if (i19 < 0) {
                    int i22 = (i19 * -1) + i20;
                    while (true) {
                        int i23 = i14 + 1;
                        int i24 = i20 + 1;
                        if ((bArr[i14] & 255) != iArr[i20]) {
                            return i16;
                        }
                        if (i24 == i22) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i23 == i15) {
                            j.c(xVar3);
                            x xVar4 = xVar3.f20923f;
                            j.c(xVar4);
                            i13 = xVar4.f20919b;
                            byte[] bArr2 = xVar4.f20918a;
                            i12 = xVar4.f20920c;
                            if (xVar4 == xVar2) {
                                if (!z11) {
                                    break loop0;
                                }
                                bArr = bArr2;
                                xVar = null;
                            } else {
                                byte[] bArr3 = bArr2;
                                xVar = xVar4;
                                bArr = bArr3;
                            }
                        } else {
                            x xVar5 = xVar3;
                            i12 = i15;
                            i13 = i23;
                            xVar = xVar5;
                        }
                        if (z11) {
                            i11 = iArr[i24];
                            i10 = i13;
                            i15 = i12;
                            xVar3 = xVar;
                            break;
                        }
                        i14 = i13;
                        i15 = i12;
                        i20 = i24;
                        xVar3 = xVar;
                    }
                } else {
                    i10 = i14 + 1;
                    byte b10 = bArr[i14] & 255;
                    int i25 = i20 + i19;
                    while (i20 != i25) {
                        if (b10 == iArr[i20]) {
                            i11 = iArr[i20 + i19];
                            if (i10 == i15) {
                                xVar3 = xVar3.f20923f;
                                j.c(xVar3);
                                i10 = xVar3.f20919b;
                                bArr = xVar3.f20918a;
                                i15 = xVar3.f20920c;
                                if (xVar3 == xVar2) {
                                    xVar3 = null;
                                }
                            }
                        } else {
                            i20++;
                        }
                    }
                    return i16;
                }
                if (i11 >= 0) {
                    return i11;
                }
                i17 = -i11;
                i14 = i10;
            }
            if (z10) {
                return -2;
            }
            return i16;
        } else if (z10) {
            return -2;
        } else {
            return -1;
        }
    }
}
