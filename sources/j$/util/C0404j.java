package j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.j  reason: case insensitive filesystem */
public final class C0404j {

    /* renamed from: c  reason: collision with root package name */
    private static final C0404j f18563c = new C0404j();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18564a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18565b;

    private C0404j() {
        this.f18564a = false;
        this.f18565b = 0;
    }

    private C0404j(int i10) {
        this.f18564a = true;
        this.f18565b = i10;
    }

    public static C0404j a() {
        return f18563c;
    }

    public static C0404j d(int i10) {
        return new C0404j(i10);
    }

    public final int b() {
        if (this.f18564a) {
            return this.f18565b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f18564a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0404j)) {
            return false;
        }
        C0404j jVar = (C0404j) obj;
        boolean z10 = this.f18564a;
        if (!z10 || !jVar.f18564a) {
            if (z10 == jVar.f18564a) {
                return true;
            }
        } else if (this.f18565b == jVar.f18565b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18564a) {
            return this.f18565b;
        }
        return 0;
    }

    public final String toString() {
        if (!this.f18564a) {
            return "OptionalInt.empty";
        }
        return String.format("OptionalInt[%s]", new Object[]{Integer.valueOf(this.f18565b)});
    }
}
