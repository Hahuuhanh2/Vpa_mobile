package j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.i  reason: case insensitive filesystem */
public final class C0403i {

    /* renamed from: c  reason: collision with root package name */
    private static final C0403i f18560c = new C0403i();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18561a;

    /* renamed from: b  reason: collision with root package name */
    private final double f18562b;

    private C0403i() {
        this.f18561a = false;
        this.f18562b = Double.NaN;
    }

    private C0403i(double d10) {
        this.f18561a = true;
        this.f18562b = d10;
    }

    public static C0403i a() {
        return f18560c;
    }

    public static C0403i d(double d10) {
        return new C0403i(d10);
    }

    public final double b() {
        if (this.f18561a) {
            return this.f18562b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f18561a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0403i)) {
            return false;
        }
        C0403i iVar = (C0403i) obj;
        boolean z10 = this.f18561a;
        if (!z10 || !iVar.f18561a) {
            if (z10 == iVar.f18561a) {
                return true;
            }
        } else if (Double.compare(this.f18562b, iVar.f18562b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f18561a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f18562b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.f18561a) {
            return "OptionalDouble.empty";
        }
        return String.format("OptionalDouble[%s]", new Object[]{Double.valueOf(this.f18562b)});
    }
}
