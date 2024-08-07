package e0;

import android.graphics.Bitmap;
import e0.h;
import n0.n;
import v.v;

/* compiled from: AutoValue_Bitmap2JpegBytes_In */
public final class a extends h.a {

    /* renamed from: a  reason: collision with root package name */
    public final n<Bitmap> f8969a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8970b;

    public a(n<Bitmap> nVar, int i10) {
        if (nVar != null) {
            this.f8969a = nVar;
            this.f8970b = i10;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    public final int a() {
        return this.f8970b;
    }

    public final n<Bitmap> b() {
        return this.f8969a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h.a)) {
            return false;
        }
        h.a aVar = (h.a) obj;
        if (!this.f8969a.equals(aVar.b()) || this.f8970b != aVar.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f8969a.hashCode() ^ 1000003) * 1000003) ^ this.f8970b;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("In{packet=");
        q10.append(this.f8969a);
        q10.append(", jpegQuality=");
        return v.e(q10, this.f8970b, "}");
    }
}
