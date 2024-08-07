package cd;

import java.util.Arrays;

/* compiled from: BitArray */
public final class a implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public int[] f4687a;

    /* renamed from: b  reason: collision with root package name */
    public int f4688b;

    public a() {
        this.f4688b = 0;
        this.f4687a = new int[1];
    }

    public final void a(boolean z10) {
        c(this.f4688b + 1);
        if (z10) {
            int[] iArr = this.f4687a;
            int i10 = this.f4688b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f4688b++;
    }

    public final void b(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        c(this.f4688b + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    public final void c(int i10) {
        int[] iArr = this.f4687a;
        if (i10 > (iArr.length << 5)) {
            int[] iArr2 = new int[((i10 + 31) / 32)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f4687a = iArr2;
        }
    }

    public final Object clone() {
        return new a((int[]) this.f4687a.clone(), this.f4688b);
    }

    public final boolean e(int i10) {
        if (((1 << (i10 & 31)) & this.f4687a[i10 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4688b != aVar.f4688b || !Arrays.equals(this.f4687a, aVar.f4687a)) {
            return false;
        }
        return true;
    }

    public final int f(int i10) {
        int i11 = this.f4688b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.f4687a[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f4687a;
            if (i12 == iArr.length) {
                return this.f4688b;
            }
            i13 = iArr[i12];
        }
        return Math.min(Integer.numberOfTrailingZeros(i13) + (i12 << 5), this.f4688b);
    }

    public final int g(int i10) {
        int i11 = this.f4688b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (~this.f4687a[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f4687a;
            if (i12 == iArr.length) {
                return this.f4688b;
            }
            i13 = ~iArr[i12];
        }
        return Math.min(Integer.numberOfTrailingZeros(i13) + (i12 << 5), this.f4688b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4687a) + (this.f4688b * 31);
    }

    public final boolean j(int i10, int i11) {
        int i12;
        if (i11 < i10 || i10 < 0 || i11 > this.f4688b) {
            throw new IllegalArgumentException();
        } else if (i11 == i10) {
            return true;
        } else {
            int i13 = i11 - 1;
            int i14 = i10 / 32;
            int i15 = i13 / 32;
            for (int i16 = i14; i16 <= i15; i16++) {
                int i17 = 31;
                if (i16 > i14) {
                    i12 = 0;
                } else {
                    i12 = i10 & 31;
                }
                if (i16 >= i15) {
                    i17 = 31 & i13;
                }
                if ((((2 << i17) - (1 << i12)) & this.f4687a[i16]) != 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public final void k() {
        int[] iArr = new int[this.f4687a.length];
        int i10 = (this.f4688b - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = (long) this.f4687a[i12];
            long j11 = ((j10 & 1431655765) << 1) | ((j10 >> 1) & 1431655765);
            long j12 = ((j11 & 858993459) << 2) | ((j11 >> 2) & 858993459);
            long j13 = ((j12 & 252645135) << 4) | ((j12 >> 4) & 252645135);
            long j14 = ((j13 & 16711935) << 8) | ((j13 >> 8) & 16711935);
            iArr[i10 - i12] = (int) (((j14 & 65535) << 16) | ((j14 >> 16) & 65535));
        }
        int i13 = this.f4688b;
        int i14 = i11 << 5;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i11 - 1] = i16;
        }
        this.f4687a = iArr;
    }

    public final void l(int i10) {
        int[] iArr = this.f4687a;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public final String toString() {
        char c10;
        int i10 = this.f4688b;
        StringBuilder sb2 = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f4688b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            if (e(i11)) {
                c10 = 'X';
            } else {
                c10 = '.';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public a(int i10) {
        this.f4688b = i10;
        this.f4687a = new int[((i10 + 31) / 32)];
    }

    public a(int[] iArr, int i10) {
        this.f4687a = iArr;
        this.f4688b = i10;
    }
}
