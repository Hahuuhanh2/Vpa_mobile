package v;

import android.support.v4.media.a;
import v.t1;

/* compiled from: AutoValue_SupportedSurfaceCombination_FeatureSettings */
public final class c extends t1.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f15600a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15601b;

    public c(int i10, int i11) {
        this.f15600a = i10;
        this.f15601b = i11;
    }

    public final int a() {
        return this.f15600a;
    }

    public final int b() {
        return this.f15601b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t1.b)) {
            return false;
        }
        t1.b bVar = (t1.b) obj;
        if (this.f15600a == bVar.a() && this.f15601b == bVar.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15600a ^ 1000003) * 1000003) ^ this.f15601b;
    }

    public final String toString() {
        StringBuilder q10 = a.q("FeatureSettings{cameraMode=");
        q10.append(this.f15600a);
        q10.append(", requiredMaxBitDepth=");
        return v.e(q10, this.f15601b, "}");
    }
}
