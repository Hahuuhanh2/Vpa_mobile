package f0;

import android.support.v4.media.a;
import android.util.Size;
import android.view.Surface;
import v.v;

/* compiled from: AutoValue_OutputSurface */
public final class c extends l0 {

    /* renamed from: a  reason: collision with root package name */
    public final Surface f9517a;

    /* renamed from: b  reason: collision with root package name */
    public final Size f9518b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9519c;

    public c(Surface surface, Size size, int i10) {
        if (surface != null) {
            this.f9517a = surface;
            this.f9518b = size;
            this.f9519c = i10;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    public final int a() {
        return this.f9519c;
    }

    public final Size b() {
        return this.f9518b;
    }

    public final Surface c() {
        return this.f9517a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (!this.f9517a.equals(l0Var.c()) || !this.f9518b.equals(l0Var.b()) || this.f9519c != l0Var.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f9517a.hashCode() ^ 1000003) * 1000003) ^ this.f9518b.hashCode()) * 1000003) ^ this.f9519c;
    }

    public final String toString() {
        StringBuilder q10 = a.q("OutputSurface{surface=");
        q10.append(this.f9517a);
        q10.append(", size=");
        q10.append(this.f9518b);
        q10.append(", imageFormat=");
        return v.e(q10, this.f9519c, "}");
    }
}
