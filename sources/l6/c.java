package l6;

import f0.b0;
import java.util.Set;
import l6.e;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
public final class c extends e.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f12716a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12717b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<e.b> f12718c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    public static final class a extends e.a.C0156a {

        /* renamed from: a  reason: collision with root package name */
        public Long f12719a;

        /* renamed from: b  reason: collision with root package name */
        public Long f12720b;

        /* renamed from: c  reason: collision with root package name */
        public Set<e.b> f12721c;

        public final c a() {
            String str;
            if (this.f12719a == null) {
                str = " delta";
            } else {
                str = "";
            }
            if (this.f12720b == null) {
                str = b0.r(str, " maxAllowedDelay");
            }
            if (this.f12721c == null) {
                str = b0.r(str, " flags");
            }
            if (str.isEmpty()) {
                return new c(this.f12719a.longValue(), this.f12720b.longValue(), this.f12721c);
            }
            throw new IllegalStateException(b0.r("Missing required properties:", str));
        }
    }

    public c(long j10, long j11, Set set) {
        this.f12716a = j10;
        this.f12717b = j11;
        this.f12718c = set;
    }

    public final long a() {
        return this.f12716a;
    }

    public final Set<e.b> b() {
        return this.f12718c;
    }

    public final long c() {
        return this.f12717b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        e.a aVar = (e.a) obj;
        if (this.f12716a == aVar.a() && this.f12717b == aVar.c() && this.f12718c.equals(aVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f12716a;
        long j11 = this.f12717b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f12718c.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ConfigValue{delta=");
        q10.append(this.f12716a);
        q10.append(", maxAllowedDelay=");
        q10.append(this.f12717b);
        q10.append(", flags=");
        q10.append(this.f12718c);
        q10.append("}");
        return q10.toString();
    }
}
