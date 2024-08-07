package c6;

import android.support.v4.media.a;

/* compiled from: Encoding */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4566a;

    public b(String str) {
        if (str != null) {
            this.f4566a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f4566a.equals(((b) obj).f4566a);
    }

    public final int hashCode() {
        return this.f4566a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.o(a.q("Encoding{name=\""), this.f4566a, "\"}");
    }
}
