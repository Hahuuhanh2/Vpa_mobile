package c0;

import android.support.v4.media.a;
import c0.q;

/* compiled from: AutoValue_CameraState_StateError */
public final class e extends q.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f4227a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f4228b;

    public e(int i10, Throwable th2) {
        this.f4227a = i10;
        this.f4228b = th2;
    }

    public final Throwable a() {
        return this.f4228b;
    }

    public final int b() {
        return this.f4227a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.a)) {
            return false;
        }
        q.a aVar = (q.a) obj;
        if (this.f4227a == aVar.b()) {
            Throwable th2 = this.f4228b;
            if (th2 == null) {
                if (aVar.a() == null) {
                    return true;
                }
            } else if (th2.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (this.f4227a ^ 1000003) * 1000003;
        Throwable th2 = this.f4228b;
        if (th2 == null) {
            i10 = 0;
        } else {
            i10 = th2.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("StateError{code=");
        q10.append(this.f4227a);
        q10.append(", cause=");
        q10.append(this.f4228b);
        q10.append("}");
        return q10.toString();
    }
}
