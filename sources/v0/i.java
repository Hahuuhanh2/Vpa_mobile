package v0;

import j7.a;

/* compiled from: SparseArrayCompat */
public final class i<E> implements Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f16008d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public int[] f16009a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f16010b;

    /* renamed from: c  reason: collision with root package name */
    public int f16011c;

    public i() {
        int i10 = 40;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f16009a = new int[i13];
        this.f16010b = new Object[i13];
    }

    public final void a(int i10, E e10) {
        int i11 = this.f16011c;
        if (i11 == 0 || i10 > this.f16009a[i11 - 1]) {
            if (i11 >= this.f16009a.length) {
                int i12 = (i11 + 1) * 4;
                int i13 = 4;
                while (true) {
                    if (i13 >= 32) {
                        break;
                    }
                    int i14 = (1 << i13) - 12;
                    if (i12 <= i14) {
                        i12 = i14;
                        break;
                    }
                    i13++;
                }
                int i15 = i12 / 4;
                int[] iArr = new int[i15];
                Object[] objArr = new Object[i15];
                int[] iArr2 = this.f16009a;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f16010b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f16009a = iArr;
                this.f16010b = objArr;
            }
            this.f16009a[i11] = i10;
            this.f16010b[i11] = e10;
            this.f16011c = i11 + 1;
            return;
        }
        e(i10, e10);
    }

    /* renamed from: b */
    public final i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f16009a = (int[]) this.f16009a.clone();
            iVar.f16010b = (Object[]) this.f16010b.clone();
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final Object c(int i10, Integer num) {
        Object obj;
        int g2 = a.g(this.f16011c, i10, this.f16009a);
        if (g2 < 0 || (obj = this.f16010b[g2]) == f16008d) {
            return num;
        }
        return obj;
    }

    public final void e(int i10, E e10) {
        int g2 = a.g(this.f16011c, i10, this.f16009a);
        if (g2 >= 0) {
            this.f16010b[g2] = e10;
            return;
        }
        int i11 = ~g2;
        int i12 = this.f16011c;
        if (i11 < i12) {
            Object[] objArr = this.f16010b;
            if (objArr[i11] == f16008d) {
                this.f16009a[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (i12 >= this.f16009a.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArr = new int[i16];
            Object[] objArr2 = new Object[i16];
            int[] iArr2 = this.f16009a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f16010b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16009a = iArr;
            this.f16010b = objArr2;
        }
        int i17 = this.f16011c - i11;
        if (i17 != 0) {
            int[] iArr3 = this.f16009a;
            int i18 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i18, i17);
            Object[] objArr4 = this.f16010b;
            System.arraycopy(objArr4, i11, objArr4, i18, this.f16011c - i11);
        }
        this.f16009a[i11] = i10;
        this.f16010b[i11] = e10;
        this.f16011c++;
    }

    public final int f() {
        return this.f16011c;
    }

    public final String toString() {
        int i10 = this.f16011c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f16011c; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f16009a[i11]);
            sb2.append('=');
            Object obj = this.f16010b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
