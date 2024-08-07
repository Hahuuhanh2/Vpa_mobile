package x8;

import i3.y;
import java.util.Objects;
import v.v;

/* compiled from: AesGcmSivParameters */
public final class p extends y {

    /* renamed from: c  reason: collision with root package name */
    public final int f17139c;

    /* renamed from: d  reason: collision with root package name */
    public final a f17140d;

    /* compiled from: AesGcmSivParameters */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f17141b = new a("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final a f17142c = new a("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final a f17143d = new a("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        public final String f17144a;

        public a(String str) {
            this.f17144a = str;
        }

        public final String toString() {
            return this.f17144a;
        }
    }

    public p(int i10, a aVar) {
        this.f17139c = i10;
        this.f17140d = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (pVar.f17139c == this.f17139c && pVar.f17140d == this.f17140d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f17139c), this.f17140d});
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("AesGcmSiv Parameters (variant: ");
        q10.append(this.f17140d);
        q10.append(", ");
        return v.e(q10, this.f17139c, "-byte key)");
    }
}
