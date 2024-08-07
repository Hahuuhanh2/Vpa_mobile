package cd;

import java.util.Arrays;

/* compiled from: BitMatrix */
public final class b implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public final int f4689a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4690b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4691c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f4692d;

    public b() {
        throw null;
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f4689a = i10;
        this.f4690b = i11;
        int i12 = (i10 + 31) / 32;
        this.f4691c = i12;
        this.f4692d = new int[(i12 * i11)];
    }

    public final void a(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f4691c);
        int[] iArr = this.f4692d;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public final boolean b(int i10, int i11) {
        if (((this.f4692d[(i10 / 32) + (i11 * this.f4691c)] >>> (i10 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int[] c() {
        int length = this.f4692d.length - 1;
        while (length >= 0 && this.f4692d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f4691c;
        int i11 = length / i10;
        int i12 = (length % i10) << 5;
        int i13 = 31;
        while ((this.f4692d[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public final Object clone() {
        return new b(this.f4689a, this.f4690b, this.f4691c, (int[]) this.f4692d.clone());
    }

    public final a e(int i10, a aVar) {
        int i11 = aVar.f4688b;
        int i12 = this.f4689a;
        if (i11 < i12) {
            aVar = new a(i12);
        } else {
            int length = aVar.f4687a.length;
            for (int i13 = 0; i13 < length; i13++) {
                aVar.f4687a[i13] = 0;
            }
        }
        int i14 = i10 * this.f4691c;
        for (int i15 = 0; i15 < this.f4691c; i15++) {
            aVar.f4687a[(i15 << 5) / 32] = this.f4692d[i14 + i15];
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4689a == bVar.f4689a && this.f4690b == bVar.f4690b && this.f4691c == bVar.f4691c && Arrays.equals(this.f4692d, bVar.f4692d)) {
            return true;
        }
        return false;
    }

    public final int[] f() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.f4692d;
            if (i10 < iArr.length && iArr[i10] == 0) {
                i10++;
            }
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f4691c;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) << 5;
        int i14 = iArr[i10];
        int i15 = 0;
        while ((i14 << (31 - i15)) == 0) {
            i15++;
        }
        return new int[]{i13 + i15, i12};
    }

    public final void g(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f4691c);
        int[] iArr = this.f4692d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public final int hashCode() {
        int i10 = this.f4689a;
        return Arrays.hashCode(this.f4692d) + (((((((i10 * 31) + i10) * 31) + this.f4690b) * 31) + this.f4691c) * 31);
    }

    public final void j(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i14 = i12 + i10;
            int i15 = i13 + i11;
            if (i15 > this.f4690b || i14 > this.f4689a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i11 < i15) {
                int i16 = this.f4691c * i11;
                for (int i17 = i10; i17 < i14; i17++) {
                    int[] iArr = this.f4692d;
                    int i18 = (i17 / 32) + i16;
                    iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                }
                i11++;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder((this.f4689a + 1) * this.f4690b);
        for (int i10 = 0; i10 < this.f4690b; i10++) {
            for (int i11 = 0; i11 < this.f4689a; i11++) {
                if (b(i11, i10)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb2.append(str);
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public b(int i10, int i11, int i12, int[] iArr) {
        this.f4689a = i10;
        this.f4690b = i11;
        this.f4691c = i12;
        this.f4692d = iArr;
    }
}
