package ab;

/* compiled from: AutoValue_InstallationTokenResult */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f140a;

    /* renamed from: b  reason: collision with root package name */
    public final long f141b;

    /* renamed from: c  reason: collision with root package name */
    public final long f142c;

    public a(String str, long j10, long j11) {
        this.f140a = str;
        this.f141b = j10;
        this.f142c = j11;
    }

    public final String a() {
        return this.f140a;
    }

    public final long b() {
        return this.f142c;
    }

    public final long c() {
        return this.f141b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f140a.equals(fVar.a()) && this.f141b == fVar.c() && this.f142c == fVar.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f141b;
        long j11 = this.f142c;
        return ((((this.f140a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("InstallationTokenResult{token=");
        q10.append(this.f140a);
        q10.append(", tokenExpirationTimestamp=");
        q10.append(this.f141b);
        q10.append(", tokenCreationTimestamp=");
        q10.append(this.f142c);
        q10.append("}");
        return q10.toString();
    }
}
