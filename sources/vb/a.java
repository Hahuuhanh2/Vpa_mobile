package vb;

import java.util.HashSet;
import java.util.Set;

/* compiled from: AutoValue_ConfigUpdate */
public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f16140a;

    public a(HashSet hashSet) {
        this.f16140a = hashSet;
    }

    public final Set<String> a() {
        return this.f16140a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f16140a.equals(((b) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f16140a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ConfigUpdate{updatedKeys=");
        q10.append(this.f16140a);
        q10.append("}");
        return q10.toString();
    }
}
