package e6;

import android.support.v4.media.a;

/* compiled from: AutoValue_LogResponse */
public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final long f9227a;

    public h(long j10) {
        this.f9227a = j10;
    }

    public final long b() {
        return this.f9227a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        if (this.f9227a == ((n) obj).b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9227a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        StringBuilder q10 = a.q("LogResponse{nextRequestWaitMillis=");
        q10.append(this.f9227a);
        q10.append("}");
        return q10.toString();
    }
}
