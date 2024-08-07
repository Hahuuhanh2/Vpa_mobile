package f6;

import f0.b0;
import f6.n;
import java.util.Map;

/* compiled from: AutoValue_EventInternal */
public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final String f9985a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f9986b;

    /* renamed from: c  reason: collision with root package name */
    public final m f9987c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9988d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9989e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f9990f;

    /* compiled from: AutoValue_EventInternal */
    public static final class a extends n.a {

        /* renamed from: a  reason: collision with root package name */
        public String f9991a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f9992b;

        /* renamed from: c  reason: collision with root package name */
        public m f9993c;

        /* renamed from: d  reason: collision with root package name */
        public Long f9994d;

        /* renamed from: e  reason: collision with root package name */
        public Long f9995e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f9996f;

        public final h b() {
            String str;
            if (this.f9991a == null) {
                str = " transportName";
            } else {
                str = "";
            }
            if (this.f9993c == null) {
                str = b0.r(str, " encodedPayload");
            }
            if (this.f9994d == null) {
                str = b0.r(str, " eventMillis");
            }
            if (this.f9995e == null) {
                str = b0.r(str, " uptimeMillis");
            }
            if (this.f9996f == null) {
                str = b0.r(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.f9991a, this.f9992b, this.f9993c, this.f9994d.longValue(), this.f9995e.longValue(), this.f9996f);
            }
            throw new IllegalStateException(b0.r("Missing required properties:", str));
        }

        public final a c(m mVar) {
            if (mVar != null) {
                this.f9993c = mVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public final a d(String str) {
            if (str != null) {
                this.f9991a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public h(String str, Integer num, m mVar, long j10, long j11, Map map) {
        this.f9985a = str;
        this.f9986b = num;
        this.f9987c = mVar;
        this.f9988d = j10;
        this.f9989e = j11;
        this.f9990f = map;
    }

    public final Map<String, String> b() {
        return this.f9990f;
    }

    public final Integer c() {
        return this.f9986b;
    }

    public final m d() {
        return this.f9987c;
    }

    public final long e() {
        return this.f9988d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f9985a.equals(nVar.g()) || ((num = this.f9986b) != null ? !num.equals(nVar.c()) : nVar.c() != null) || !this.f9987c.equals(nVar.d()) || this.f9988d != nVar.e() || this.f9989e != nVar.h() || !this.f9990f.equals(nVar.b())) {
            return false;
        }
        return true;
    }

    public final String g() {
        return this.f9985a;
    }

    public final long h() {
        return this.f9989e;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f9985a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f9986b;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        long j10 = this.f9988d;
        long j11 = this.f9989e;
        return ((((((((hashCode ^ i10) * 1000003) ^ this.f9987c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f9990f.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("EventInternal{transportName=");
        q10.append(this.f9985a);
        q10.append(", code=");
        q10.append(this.f9986b);
        q10.append(", encodedPayload=");
        q10.append(this.f9987c);
        q10.append(", eventMillis=");
        q10.append(this.f9988d);
        q10.append(", uptimeMillis=");
        q10.append(this.f9989e);
        q10.append(", autoMetadata=");
        q10.append(this.f9990f);
        q10.append("}");
        return q10.toString();
    }
}
