package g6;

import android.support.v4.media.a;
import f0.b0;
import v.v;

/* compiled from: AutoValue_BackendResponse */
public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public final int f10375a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10376b;

    public b(int i10, long j10) {
        if (i10 != 0) {
            this.f10375a = i10;
            this.f10376b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final long a() {
        return this.f10376b;
    }

    public final int b() {
        return this.f10375a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!v.a(this.f10375a, gVar.b()) || this.f10376b != gVar.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f10376b;
        return ((v.g(this.f10375a) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder q10 = a.q("BackendResponse{status=");
        q10.append(b0.E(this.f10375a));
        q10.append(", nextRequestWaitMillis=");
        q10.append(this.f10376b);
        q10.append("}");
        return q10.toString();
    }
}
