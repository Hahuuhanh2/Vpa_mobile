package n0;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.List;
import n0.x;

/* compiled from: AutoValue_SurfaceProcessorNode_In */
public final class d extends x.b {

    /* renamed from: a  reason: collision with root package name */
    public final u f13317a;

    /* renamed from: b  reason: collision with root package name */
    public final List<x.d> f13318b;

    public d(u uVar, ArrayList arrayList) {
        if (uVar != null) {
            this.f13317a = uVar;
            this.f13318b = arrayList;
            return;
        }
        throw new NullPointerException("Null surfaceEdge");
    }

    public final List<x.d> a() {
        return this.f13318b;
    }

    public final u b() {
        return this.f13317a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x.b)) {
            return false;
        }
        x.b bVar = (x.b) obj;
        if (!this.f13317a.equals(bVar.b()) || !this.f13318b.equals(bVar.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13317a.hashCode() ^ 1000003) * 1000003) ^ this.f13318b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("In{surfaceEdge=");
        q10.append(this.f13317a);
        q10.append(", outConfigs=");
        q10.append(this.f13318b);
        q10.append("}");
        return q10.toString();
    }
}
