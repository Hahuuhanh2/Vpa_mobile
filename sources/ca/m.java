package ca;

import android.support.v4.media.a;

/* compiled from: Dependency */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final r<?> f4644a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4645b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4646c;

    public m(int i10, int i11, Class cls) {
        this((r<?>) r.a(cls), i10, i11);
    }

    public static m a(Class<?> cls) {
        return new m(0, 1, (Class) cls);
    }

    public static m b(Class<?> cls) {
        return new m(1, 0, (Class) cls);
    }

    public static m c(Class<?> cls) {
        return new m(1, 1, (Class) cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f4644a.equals(mVar.f4644a) && this.f4645b == mVar.f4645b && this.f4646c == mVar.f4646c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4644a.hashCode() ^ 1000003) * 1000003) ^ this.f4645b) * 1000003) ^ this.f4646c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f4644a);
        sb2.append(", type=");
        int i10 = this.f4645b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f4646c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = "provider";
        } else if (i11 == 2) {
            str2 = "deferred";
        } else {
            throw new AssertionError(a.m("Unsupported injection: ", i11));
        }
        return a.o(sb2, str2, "}");
    }

    public m(r<?> rVar, int i10, int i11) {
        if (rVar != null) {
            this.f4644a = rVar;
            this.f4645b = i10;
            this.f4646c = i11;
            return;
        }
        throw new NullPointerException("Null dependency anInterface.");
    }
}
