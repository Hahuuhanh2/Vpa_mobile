package fk;

import android.support.v4.media.a;
import sk.j;

/* compiled from: IndexedValue.kt */
public final class u<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f20216a;

    /* renamed from: b  reason: collision with root package name */
    public final T f20217b;

    public u(int i10, T t10) {
        this.f20216a = i10;
        this.f20217b = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f20216a == uVar.f20216a && j.a(this.f20217b, uVar.f20217b);
    }

    public final int hashCode() {
        int i10 = this.f20216a * 31;
        T t10 = this.f20217b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    public final String toString() {
        StringBuilder q10 = a.q("IndexedValue(index=");
        q10.append(this.f20216a);
        q10.append(", value=");
        q10.append(this.f20217b);
        q10.append(')');
        return q10.toString();
    }
}
