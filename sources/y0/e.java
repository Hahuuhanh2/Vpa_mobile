package y0;

import fk.h;

/* compiled from: SnapshotDoubleIndexHeap.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f17362a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f17363b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public int[] f17364c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    public int[] f17365d;

    /* renamed from: e  reason: collision with root package name */
    public int f17366e;

    public e() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f17365d = iArr;
    }

    public final int a(int i10) {
        int i11 = this.f17362a + 1;
        int[] iArr = this.f17363b;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length * 2;
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            h.o0(iArr, iArr2);
            h.o0(this.f17364c, iArr3);
            this.f17363b = iArr2;
            this.f17364c = iArr3;
        }
        int i13 = this.f17362a;
        this.f17362a = i13 + 1;
        int length2 = this.f17365d.length;
        if (this.f17366e >= length2) {
            int i14 = 0;
            int i15 = length2 * 2;
            int[] iArr4 = new int[i15];
            while (i14 < i15) {
                int i16 = i14 + 1;
                iArr4[i14] = i16;
                i14 = i16;
            }
            h.o0(this.f17365d, iArr4);
            this.f17365d = iArr4;
        }
        int i17 = this.f17366e;
        int[] iArr5 = this.f17365d;
        this.f17366e = iArr5[i17];
        int[] iArr6 = this.f17363b;
        iArr6[i13] = i10;
        this.f17364c[i13] = i17;
        iArr5[i17] = i13;
        int i18 = iArr6[i13];
        while (i13 > 0) {
            int i19 = ((i13 + 1) >> 1) - 1;
            if (iArr6[i19] <= i18) {
                break;
            }
            int[] iArr7 = this.f17363b;
            int[] iArr8 = this.f17364c;
            int[] iArr9 = this.f17365d;
            int i20 = iArr7[i19];
            iArr7[i19] = iArr7[i13];
            iArr7[i13] = i20;
            int i21 = iArr8[i19];
            iArr8[i19] = iArr8[i13];
            iArr8[i13] = i21;
            iArr9[iArr8[i19]] = i19;
            iArr9[iArr8[i13]] = i13;
            i13 = i19;
        }
        return i17;
    }
}
