package x8;

import i3.y;
import java.util.Objects;
import v.v;

/* compiled from: AesEaxParameters */
public final class h extends y {

    /* renamed from: c  reason: collision with root package name */
    public final int f17107c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17108d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17109e;

    /* renamed from: f  reason: collision with root package name */
    public final a f17110f;

    /* compiled from: AesEaxParameters */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f17111b = new a("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final a f17112c = new a("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final a f17113d = new a("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        public final String f17114a;

        public a(String str) {
            this.f17114a = str;
        }

        public final String toString() {
            return this.f17114a;
        }
    }

    public h(int i10, int i11, int i12, a aVar) {
        this.f17107c = i10;
        this.f17108d = i11;
        this.f17109e = i12;
        this.f17110f = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (hVar.f17107c == this.f17107c && hVar.f17108d == this.f17108d && hVar.f17109e == this.f17109e && hVar.f17110f == this.f17110f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f17107c), Integer.valueOf(this.f17108d), Integer.valueOf(this.f17109e), this.f17110f});
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("AesEax Parameters (variant: ");
        q10.append(this.f17110f);
        q10.append(", ");
        q10.append(this.f17108d);
        q10.append("-byte IV, ");
        q10.append(this.f17109e);
        q10.append("-byte tag, and ");
        return v.e(q10, this.f17107c, "-byte key)");
    }
}
