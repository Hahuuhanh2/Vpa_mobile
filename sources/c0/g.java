package c0;

import android.support.v4.media.a;
import c0.x0;
import n0.v;

/* compiled from: AutoValue_SurfaceOutput_Event */
public final class g extends x0.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f4267a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final x0 f4268b;

    public g(v vVar) {
        this.f4268b = vVar;
    }

    public final int a() {
        return this.f4267a;
    }

    public final x0 b() {
        return this.f4268b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0.a)) {
            return false;
        }
        x0.a aVar = (x0.a) obj;
        if (this.f4267a != aVar.a() || !this.f4268b.equals(aVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f4267a ^ 1000003) * 1000003) ^ this.f4268b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("Event{eventCode=");
        q10.append(this.f4267a);
        q10.append(", surfaceOutput=");
        q10.append(this.f4268b);
        q10.append("}");
        return q10.toString();
    }
}
