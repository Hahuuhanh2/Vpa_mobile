package f0;

import android.support.v4.media.a;

/* compiled from: AutoValue_Identifier */
public final class b extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9516a;

    public b(Object obj) {
        this.f9516a = obj;
    }

    public final Object a() {
        return this.f9516a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f9516a.equals(((a0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f9516a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder q10 = a.q("Identifier{value=");
        q10.append(this.f9516a);
        q10.append("}");
        return q10.toString();
    }
}
