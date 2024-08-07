package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;
import tc.c;

/* compiled from: UnknownFieldSetLite */
public final class d0 {

    /* renamed from: f  reason: collision with root package name */
    public static final d0 f7893f = new d0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f7894a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f7895b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f7896c;

    /* renamed from: d  reason: collision with root package name */
    public int f7897d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7898e;

    public d0() {
        this(0, new int[8], new Object[8], true);
    }

    public final void a(int i10) {
        int[] iArr = this.f7895b;
        if (i10 > iArr.length) {
            int i11 = this.f7894a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f7895b = Arrays.copyOf(iArr, i10);
            this.f7896c = Arrays.copyOf(this.f7896c, i10);
        }
    }

    public final int b() {
        int i10;
        int i11 = this.f7897d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f7894a; i13++) {
            int i14 = this.f7895b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                i10 = CodedOutputStream.e0(i15, ((Long) this.f7896c[i13]).longValue());
            } else if (i16 == 1) {
                ((Long) this.f7896c[i13]).longValue();
                i10 = CodedOutputStream.O(i15);
            } else if (i16 == 2) {
                i10 = CodedOutputStream.K(i15, (c) this.f7896c[i13]);
            } else if (i16 == 3) {
                i12 = ((d0) this.f7896c[i13]).b() + (CodedOutputStream.b0(i15) * 2) + i12;
            } else if (i16 == 5) {
                ((Integer) this.f7896c[i13]).intValue();
                i10 = CodedOutputStream.N(i15);
            } else {
                int i17 = InvalidProtocolBufferException.f7869a;
                throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException());
            }
            i12 = i10 + i12;
        }
        this.f7897d = i12;
        return i12;
    }

    public final void c(e eVar) {
        if (this.f7894a != 0) {
            eVar.getClass();
            for (int i10 = 0; i10 < this.f7894a; i10++) {
                int i11 = this.f7895b[i10];
                Object obj = this.f7896c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    eVar.j(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    eVar.f(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    eVar.b(i12, (c) obj);
                } else if (i13 == 3) {
                    eVar.f7899a.x0(i12, 3);
                    ((d0) obj).c(eVar);
                    eVar.f7899a.x0(i12, 4);
                } else if (i13 == 5) {
                    eVar.e(i12, ((Integer) obj).intValue());
                } else {
                    int i14 = InvalidProtocolBufferException.f7869a;
                    throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        int i10 = this.f7894a;
        if (i10 == d0Var.f7894a) {
            int[] iArr = this.f7895b;
            int[] iArr2 = d0Var.f7895b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    z10 = true;
                    break;
                } else if (iArr[i11] != iArr2[i11]) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                Object[] objArr = this.f7896c;
                Object[] objArr2 = d0Var.f7896c;
                int i12 = this.f7894a;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z11 = true;
                        break;
                    } else if (!objArr[i13].equals(objArr2[i13])) {
                        z11 = false;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (!z11) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f7894a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f7895b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f7896c;
        int i16 = this.f7894a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public d0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f7897d = -1;
        this.f7894a = i10;
        this.f7895b = iArr;
        this.f7896c = objArr;
        this.f7898e = z10;
    }
}
