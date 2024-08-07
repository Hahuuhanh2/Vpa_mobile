package e0;

import android.support.v4.media.a;
import c0.j0;
import e0.q;
import n0.n;

/* compiled from: AutoValue_JpegBytes2Disk_In */
public final class e extends q.a {

    /* renamed from: a  reason: collision with root package name */
    public final n<byte[]> f8995a;

    public e(n<byte[]> nVar, j0.f fVar) {
        if (nVar != null) {
            this.f8995a = nVar;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    public final j0.f a() {
        return null;
    }

    public final n<byte[]> b() {
        return this.f8995a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.a)) {
            return false;
        }
        q.a aVar = (q.a) obj;
        if (!this.f8995a.equals(aVar.b())) {
            return false;
        }
        aVar.a();
        throw null;
    }

    public final int hashCode() {
        this.f8995a.hashCode();
        throw null;
    }

    public final String toString() {
        StringBuilder q10 = a.q("In{packet=");
        q10.append(this.f8995a);
        q10.append(", outputFileOptions=");
        q10.append((Object) null);
        q10.append("}");
        return q10.toString();
    }
}
