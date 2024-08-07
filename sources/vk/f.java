package vk;

import al.g0;

/* compiled from: Progressions.kt */
public class f implements Iterable<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final int f23335a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23336b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23337c;

    public f(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.f23335a = i10;
            this.f23336b = g0.a0(i10, i11, i12);
            this.f23337c = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (!(this.f23335a == fVar.f23335a && this.f23336b == fVar.f23336b && this.f23337c == fVar.f23337c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f23335a * 31) + this.f23336b) * 31) + this.f23337c;
    }

    public boolean isEmpty() {
        if (this.f23337c > 0) {
            if (this.f23335a > this.f23336b) {
                return true;
            }
        } else if (this.f23335a < this.f23336b) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final g iterator() {
        return new g(this.f23335a, this.f23336b, this.f23337c);
    }

    public String toString() {
        int i10;
        StringBuilder sb2;
        if (this.f23337c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f23335a);
            sb2.append("..");
            sb2.append(this.f23336b);
            sb2.append(" step ");
            i10 = this.f23337c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f23335a);
            sb2.append(" downTo ");
            sb2.append(this.f23336b);
            sb2.append(" step ");
            i10 = -this.f23337c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
