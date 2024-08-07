package ek;

import android.support.v4.media.a;
import java.io.Serializable;
import sk.j;

/* compiled from: Tuples.kt */
public final class e<A, B> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final A f20102a;

    /* renamed from: b  reason: collision with root package name */
    public final B f20103b;

    public e(A a10, B b10) {
        this.f20102a = a10;
        this.f20103b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return j.a(this.f20102a, eVar.f20102a) && j.a(this.f20103b, eVar.f20103b);
    }

    public final int hashCode() {
        A a10 = this.f20102a;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f20103b;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder p10 = a.p('(');
        p10.append(this.f20102a);
        p10.append(", ");
        p10.append(this.f20103b);
        p10.append(')');
        return p10.toString();
    }
}
