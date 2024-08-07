package j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.k  reason: case insensitive filesystem */
public final class C0405k {

    /* renamed from: c  reason: collision with root package name */
    private static final C0405k f18566c = new C0405k();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18567a;

    /* renamed from: b  reason: collision with root package name */
    private final long f18568b;

    private C0405k() {
        this.f18567a = false;
        this.f18568b = 0;
    }

    private C0405k(long j10) {
        this.f18567a = true;
        this.f18568b = j10;
    }

    public static C0405k a() {
        return f18566c;
    }

    public static C0405k d(long j10) {
        return new C0405k(j10);
    }

    public final long b() {
        if (this.f18567a) {
            return this.f18568b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f18567a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0405k)) {
            return false;
        }
        C0405k kVar = (C0405k) obj;
        boolean z10 = this.f18567a;
        if (!z10 || !kVar.f18567a) {
            if (z10 == kVar.f18567a) {
                return true;
            }
        } else if (this.f18568b == kVar.f18568b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f18567a) {
            return 0;
        }
        long j10 = this.f18568b;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        if (!this.f18567a) {
            return "OptionalLong.empty";
        }
        return String.format("OptionalLong[%s]", new Object[]{Long.valueOf(this.f18568b)});
    }
}
