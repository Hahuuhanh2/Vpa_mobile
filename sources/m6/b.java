package m6;

import android.support.v4.media.a;
import f6.n;
import f6.s;

/* compiled from: AutoValue_PersistedEvent */
public final class b extends j {

    /* renamed from: a  reason: collision with root package name */
    public final long f13147a;

    /* renamed from: b  reason: collision with root package name */
    public final s f13148b;

    /* renamed from: c  reason: collision with root package name */
    public final n f13149c;

    public b(long j10, s sVar, n nVar) {
        this.f13147a = j10;
        if (sVar != null) {
            this.f13148b = sVar;
            if (nVar != null) {
                this.f13149c = nVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public final n a() {
        return this.f13149c;
    }

    public final long b() {
        return this.f13147a;
    }

    public final s c() {
        return this.f13148b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f13147a != jVar.b() || !this.f13148b.equals(jVar.c()) || !this.f13149c.equals(jVar.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f13147a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13148b.hashCode()) * 1000003) ^ this.f13149c.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("PersistedEvent{id=");
        q10.append(this.f13147a);
        q10.append(", transportContext=");
        q10.append(this.f13148b);
        q10.append(", event=");
        q10.append(this.f13149c);
        q10.append("}");
        return q10.toString();
    }
}
