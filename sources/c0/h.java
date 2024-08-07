package c0;

import android.support.v4.media.a;
import android.view.Surface;
import c0.d1;

/* compiled from: AutoValue_SurfaceRequest_Result */
public final class h extends d1.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f4275a;

    /* renamed from: b  reason: collision with root package name */
    public final Surface f4276b;

    public h(int i10, Surface surface) {
        this.f4275a = i10;
        if (surface != null) {
            this.f4276b = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    public final int a() {
        return this.f4275a;
    }

    public final Surface b() {
        return this.f4276b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d1.c)) {
            return false;
        }
        d1.c cVar = (d1.c) obj;
        if (this.f4275a != cVar.a() || !this.f4276b.equals(cVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f4275a ^ 1000003) * 1000003) ^ this.f4276b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("Result{resultCode=");
        q10.append(this.f4275a);
        q10.append(", surface=");
        q10.append(this.f4276b);
        q10.append("}");
        return q10.toString();
    }
}
