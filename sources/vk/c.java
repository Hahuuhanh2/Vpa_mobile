package vk;

import sk.j;

/* compiled from: PrimitiveRanges.kt */
public final class c extends a implements e<Character> {
    static {
        new c(1, 0);
    }

    public c(char c10, char c11) {
        super(c10, c11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(this.f23328a == cVar.f23328a && this.f23329b == cVar.f23329b)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final Comparable g() {
        return Character.valueOf(this.f23328a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f23328a * 31) + this.f23329b;
    }

    public final boolean isEmpty() {
        if (j.h(this.f23328a, this.f23329b) > 0) {
            return true;
        }
        return false;
    }

    public final Comparable l() {
        return Character.valueOf(this.f23329b);
    }

    public final String toString() {
        return this.f23328a + ".." + this.f23329b;
    }
}
