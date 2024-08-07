package m9;

/* compiled from: AutoValue_StartupTime */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final long f13193a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13194b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13195c;

    public a(long j10, long j11, long j12) {
        this.f13193a = j10;
        this.f13194b = j11;
        this.f13195c = j12;
    }

    public final long a() {
        return this.f13194b;
    }

    public final long b() {
        return this.f13193a;
    }

    public final long c() {
        return this.f13195c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f13193a == fVar.b() && this.f13194b == fVar.a() && this.f13195c == fVar.c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f13193a;
        long j11 = this.f13194b;
        long j12 = this.f13195c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("StartupTime{epochMillis=");
        q10.append(this.f13193a);
        q10.append(", elapsedRealtime=");
        q10.append(this.f13194b);
        q10.append(", uptimeMillis=");
        q10.append(this.f13195c);
        q10.append("}");
        return q10.toString();
    }
}
