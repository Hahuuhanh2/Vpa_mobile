package ka;

import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
public final class o extends b0.e.d.a.b.C0143a {

    /* renamed from: a  reason: collision with root package name */
    public final long f12369a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12370b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12371c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12372d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
    public static final class a extends b0.e.d.a.b.C0143a.C0144a {

        /* renamed from: a  reason: collision with root package name */
        public Long f12373a;

        /* renamed from: b  reason: collision with root package name */
        public Long f12374b;

        /* renamed from: c  reason: collision with root package name */
        public String f12375c;

        /* renamed from: d  reason: collision with root package name */
        public String f12376d;

        public final o a() {
            String str;
            if (this.f12373a == null) {
                str = " baseAddress";
            } else {
                str = "";
            }
            if (this.f12374b == null) {
                str = f0.b0.r(str, " size");
            }
            if (this.f12375c == null) {
                str = f0.b0.r(str, " name");
            }
            if (str.isEmpty()) {
                return new o(this.f12373a.longValue(), this.f12374b.longValue(), this.f12375c, this.f12376d);
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }
    }

    public o(long j10, long j11, String str, String str2) {
        this.f12369a = j10;
        this.f12370b = j11;
        this.f12371c = str;
        this.f12372d = str2;
    }

    public final long a() {
        return this.f12369a;
    }

    public final String b() {
        return this.f12371c;
    }

    public final long c() {
        return this.f12370b;
    }

    public final String d() {
        return this.f12372d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.C0143a)) {
            return false;
        }
        b0.e.d.a.b.C0143a aVar = (b0.e.d.a.b.C0143a) obj;
        if (this.f12369a == aVar.a() && this.f12370b == aVar.c() && this.f12371c.equals(aVar.b())) {
            String str = this.f12372d;
            if (str == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f12369a;
        long j11 = this.f12370b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f12371c.hashCode()) * 1000003;
        String str = this.f12372d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("BinaryImage{baseAddress=");
        q10.append(this.f12369a);
        q10.append(", size=");
        q10.append(this.f12370b);
        q10.append(", name=");
        q10.append(this.f12371c);
        q10.append(", uuid=");
        return android.support.v4.media.a.o(q10, this.f12372d, "}");
    }
}
