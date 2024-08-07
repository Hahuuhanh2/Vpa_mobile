package ka;

import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
public final class q extends b0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f12387a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12388b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12389c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
    public static final class a extends b0.e.d.a.b.c.C0147a {

        /* renamed from: a  reason: collision with root package name */
        public String f12390a;

        /* renamed from: b  reason: collision with root package name */
        public String f12391b;

        /* renamed from: c  reason: collision with root package name */
        public Long f12392c;

        public final q a() {
            String str;
            if (this.f12390a == null) {
                str = " name";
            } else {
                str = "";
            }
            if (this.f12391b == null) {
                str = f0.b0.r(str, " code");
            }
            if (this.f12392c == null) {
                str = f0.b0.r(str, " address");
            }
            if (str.isEmpty()) {
                return new q(this.f12390a, this.f12391b, this.f12392c.longValue());
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }
    }

    public q(String str, String str2, long j10) {
        this.f12387a = str;
        this.f12388b = str2;
        this.f12389c = j10;
    }

    public final long a() {
        return this.f12389c;
    }

    public final String b() {
        return this.f12388b;
    }

    public final String c() {
        return this.f12387a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.c)) {
            return false;
        }
        b0.e.d.a.b.c cVar = (b0.e.d.a.b.c) obj;
        if (!this.f12387a.equals(cVar.c()) || !this.f12388b.equals(cVar.b()) || this.f12389c != cVar.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f12389c;
        return ((((this.f12387a.hashCode() ^ 1000003) * 1000003) ^ this.f12388b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Signal{name=");
        q10.append(this.f12387a);
        q10.append(", code=");
        q10.append(this.f12388b);
        q10.append(", address=");
        q10.append(this.f12389c);
        q10.append("}");
        return q10.toString();
    }
}
