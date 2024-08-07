package x8;

import i3.y;
import java.util.Objects;
import v.v;

/* compiled from: AesGcmParameters */
public final class l extends y {

    /* renamed from: c  reason: collision with root package name */
    public final int f17123c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17124d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17125e;

    /* renamed from: f  reason: collision with root package name */
    public final a f17126f;

    /* compiled from: AesGcmParameters */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f17127b = new a("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final a f17128c = new a("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final a f17129d = new a("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        public final String f17130a;

        public a(String str) {
            this.f17130a = str;
        }

        public final String toString() {
            return this.f17130a;
        }
    }

    public l(int i10, int i11, int i12, a aVar) {
        this.f17123c = i10;
        this.f17124d = i11;
        this.f17125e = i12;
        this.f17126f = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (lVar.f17123c == this.f17123c && lVar.f17124d == this.f17124d && lVar.f17125e == this.f17125e && lVar.f17126f == this.f17126f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f17123c), Integer.valueOf(this.f17124d), Integer.valueOf(this.f17125e), this.f17126f});
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("AesGcm Parameters (variant: ");
        q10.append(this.f17126f);
        q10.append(", ");
        q10.append(this.f17124d);
        q10.append("-byte IV, ");
        q10.append(this.f17125e);
        q10.append("-byte tag, and ");
        return v.e(q10, this.f17123c, "-byte key)");
    }
}
