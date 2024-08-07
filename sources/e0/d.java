package e0;

import android.support.v4.media.a;
import e0.m;
import n0.n;
import v.v;

/* compiled from: AutoValue_Image2JpegBytes_In */
public final class d extends m.a {

    /* renamed from: a  reason: collision with root package name */
    public final n<androidx.camera.core.d> f8991a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8992b;

    public d(n<androidx.camera.core.d> nVar, int i10) {
        if (nVar != null) {
            this.f8991a = nVar;
            this.f8992b = i10;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    public final int a() {
        return this.f8992b;
    }

    public final n<androidx.camera.core.d> b() {
        return this.f8991a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m.a)) {
            return false;
        }
        m.a aVar = (m.a) obj;
        if (!this.f8991a.equals(aVar.b()) || this.f8992b != aVar.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f8991a.hashCode() ^ 1000003) * 1000003) ^ this.f8992b;
    }

    public final String toString() {
        StringBuilder q10 = a.q("In{packet=");
        q10.append(this.f8991a);
        q10.append(", jpegQuality=");
        return v.e(q10, this.f8992b, "}");
    }
}
