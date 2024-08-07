package c0;

import android.support.v4.media.a;
import c0.q;
import v.v;

/* compiled from: AutoValue_CameraState */
public final class d extends q {

    /* renamed from: a  reason: collision with root package name */
    public final int f4203a;

    /* renamed from: b  reason: collision with root package name */
    public final q.a f4204b;

    public d(int i10, e eVar) {
        if (i10 != 0) {
            this.f4203a = i10;
            this.f4204b = eVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final q.a a() {
        return this.f4204b;
    }

    public final int b() {
        return this.f4203a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (v.a(this.f4203a, qVar.b())) {
            q.a aVar = this.f4204b;
            if (aVar == null) {
                if (qVar.a() == null) {
                    return true;
                }
            } else if (aVar.equals(qVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g2 = (v.g(this.f4203a) ^ 1000003) * 1000003;
        q.a aVar = this.f4204b;
        if (aVar == null) {
            i10 = 0;
        } else {
            i10 = aVar.hashCode();
        }
        return g2 ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("CameraState{type=");
        q10.append(a.y(this.f4203a));
        q10.append(", error=");
        q10.append(this.f4204b);
        q10.append("}");
        return q10.toString();
    }
}
