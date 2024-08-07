package xd;

/* compiled from: Size */
public final class n implements Comparable<n> {

    /* renamed from: a  reason: collision with root package name */
    public final int f17310a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17311b;

    public n(int i10, int i11) {
        this.f17310a = i10;
        this.f17311b = i11;
    }

    public final n b(n nVar) {
        int i10 = this.f17310a;
        int i11 = nVar.f17311b;
        int i12 = i10 * i11;
        int i13 = nVar.f17310a;
        int i14 = this.f17311b;
        if (i12 <= i13 * i14) {
            return new n(i13, (i14 * i13) / i10);
        }
        return new n((i10 * i11) / i14, i11);
    }

    public final n c(n nVar) {
        int i10 = this.f17310a;
        int i11 = nVar.f17311b;
        int i12 = i10 * i11;
        int i13 = nVar.f17310a;
        int i14 = this.f17311b;
        if (i12 >= i13 * i14) {
            return new n(i13, (i14 * i13) / i10);
        }
        return new n((i10 * i11) / i14, i11);
    }

    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int i10 = this.f17311b * this.f17310a;
        int i11 = nVar.f17311b * nVar.f17310a;
        if (i11 < i10) {
            return 1;
        }
        if (i11 > i10) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f17310a == nVar.f17310a && this.f17311b == nVar.f17311b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17310a * 31) + this.f17311b;
    }

    public final String toString() {
        return this.f17310a + "x" + this.f17311b;
    }
}
