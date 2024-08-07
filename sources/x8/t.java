package x8;

import i3.y;
import java.util.Objects;

/* compiled from: ChaCha20Poly1305Parameters */
public final class t extends y {

    /* compiled from: ChaCha20Poly1305Parameters */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f17150b = new a("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final a f17151c = new a("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final a f17152d = new a("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        public final String f17153a;

        public a(String str) {
            this.f17153a = str;
        }

        public final String toString() {
            return this.f17153a;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        ((t) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode((Object) null);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ChaCha20Poly1305 Parameters (variant: ");
        q10.append((Object) null);
        q10.append(")");
        return q10.toString();
    }
}
