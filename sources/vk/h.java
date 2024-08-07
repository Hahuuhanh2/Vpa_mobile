package vk;

/* compiled from: PrimitiveRanges.kt */
public final class h extends f implements e<Integer> {

    /* renamed from: d  reason: collision with root package name */
    public static final h f23342d = new h(1, 0);

    public h(int i10, int i11) {
        super(i10, i11, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (!isEmpty() || !((h) obj).isEmpty()) {
                h hVar = (h) obj;
                if (!(this.f23335a == hVar.f23335a && this.f23336b == hVar.f23336b)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final Comparable g() {
        return Integer.valueOf(this.f23335a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f23335a * 31) + this.f23336b;
    }

    public final boolean isEmpty() {
        if (this.f23335a > this.f23336b) {
            return true;
        }
        return false;
    }

    public final Comparable l() {
        return Integer.valueOf(this.f23336b);
    }

    public final String toString() {
        return this.f23335a + ".." + this.f23336b;
    }
}
