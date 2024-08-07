package ed;

/* compiled from: GenericGFPoly */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f9354a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f9355b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f9354a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f9355b = iArr;
                return;
            }
            int i10 = 1;
            while (i10 < length && iArr[i10] == 0) {
                i10++;
            }
            if (i10 == length) {
                this.f9355b = new int[]{0};
                return;
            }
            int i11 = length - i10;
            int[] iArr2 = new int[i11];
            this.f9355b = iArr2;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final b a(b bVar) {
        if (!this.f9354a.equals(bVar.f9354a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (d()) {
            return bVar;
        } else {
            if (bVar.d()) {
                return this;
            }
            int[] iArr = this.f9355b;
            int[] iArr2 = bVar.f9355b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr4[i10] = iArr2[i10 - length] ^ iArr[i10];
            }
            return new b(this.f9354a, iArr4);
        }
    }

    public final int b(int i10) {
        if (i10 == 0) {
            return c(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : this.f9355b) {
                a aVar = a.f9339h;
                i11 ^= i12;
            }
            return i11;
        }
        int[] iArr = this.f9355b;
        int i13 = iArr[0];
        int length = iArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            i13 = this.f9354a.c(i10, i13) ^ this.f9355b[i14];
        }
        return i13;
    }

    public final int c(int i10) {
        int[] iArr = this.f9355b;
        return iArr[(iArr.length - 1) - i10];
    }

    public final boolean d() {
        if (this.f9355b[0] == 0) {
            return true;
        }
        return false;
    }

    public final b e(int i10) {
        if (i10 == 0) {
            return this.f9354a.f9349c;
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f9355b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f9354a.c(this.f9355b[i11], i10);
        }
        return new b(this.f9354a, iArr);
    }

    public final b f(b bVar) {
        if (!this.f9354a.equals(bVar.f9354a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (d() || bVar.d()) {
            return this.f9354a.f9349c;
        } else {
            int[] iArr = this.f9355b;
            int length = iArr.length;
            int[] iArr2 = bVar.f9355b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    int i13 = i10 + i12;
                    iArr3[i13] = iArr3[i13] ^ this.f9354a.c(i11, iArr2[i12]);
                }
            }
            return new b(this.f9354a, iArr3);
        }
    }

    public final b g(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f9354a.f9349c;
        } else {
            int length = this.f9355b.length;
            int[] iArr = new int[(i10 + length)];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f9354a.c(this.f9355b[i12], i11);
            }
            return new b(this.f9354a, iArr);
        }
    }

    public final String toString() {
        if (d()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder((this.f9355b.length - 1) * 8);
        int length = this.f9355b.length;
        while (true) {
            length--;
            if (length < 0) {
                return sb2.toString();
            }
            int c10 = c(length);
            if (c10 != 0) {
                if (c10 < 0) {
                    if (length == this.f9355b.length - 1) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    c10 = -c10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (length == 0 || c10 != 1) {
                    a aVar = this.f9354a;
                    if (c10 != 0) {
                        int i10 = aVar.f9348b[c10];
                        if (i10 == 0) {
                            sb2.append('1');
                        } else if (i10 == 1) {
                            sb2.append('a');
                        } else {
                            sb2.append("a^");
                            sb2.append(i10);
                        }
                    } else {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                }
                if (length != 0) {
                    if (length == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(length);
                    }
                }
            }
        }
    }
}
