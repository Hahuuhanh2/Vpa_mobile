package ka;

import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event */
public final class l extends b0.e.d {

    /* renamed from: a  reason: collision with root package name */
    public final long f12344a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12345b;

    /* renamed from: c  reason: collision with root package name */
    public final b0.e.d.a f12346c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.c f12347d;

    /* renamed from: e  reason: collision with root package name */
    public final b0.e.d.C0152d f12348e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event */
    public static final class a extends b0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        public Long f12349a;

        /* renamed from: b  reason: collision with root package name */
        public String f12350b;

        /* renamed from: c  reason: collision with root package name */
        public b0.e.d.a f12351c;

        /* renamed from: d  reason: collision with root package name */
        public b0.e.d.c f12352d;

        /* renamed from: e  reason: collision with root package name */
        public b0.e.d.C0152d f12353e;

        public a() {
        }

        public final l a() {
            String str;
            if (this.f12349a == null) {
                str = " timestamp";
            } else {
                str = "";
            }
            if (this.f12350b == null) {
                str = f0.b0.r(str, " type");
            }
            if (this.f12351c == null) {
                str = f0.b0.r(str, " app");
            }
            if (this.f12352d == null) {
                str = f0.b0.r(str, " device");
            }
            if (str.isEmpty()) {
                return new l(this.f12349a.longValue(), this.f12350b, this.f12351c, this.f12352d, this.f12353e);
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }

        public a(b0.e.d dVar) {
            this.f12349a = Long.valueOf(dVar.d());
            this.f12350b = dVar.e();
            this.f12351c = dVar.a();
            this.f12352d = dVar.b();
            this.f12353e = dVar.c();
        }
    }

    public l(long j10, String str, b0.e.d.a aVar, b0.e.d.c cVar, b0.e.d.C0152d dVar) {
        this.f12344a = j10;
        this.f12345b = str;
        this.f12346c = aVar;
        this.f12347d = cVar;
        this.f12348e = dVar;
    }

    public final b0.e.d.a a() {
        return this.f12346c;
    }

    public final b0.e.d.c b() {
        return this.f12347d;
    }

    public final b0.e.d.C0152d c() {
        return this.f12348e;
    }

    public final long d() {
        return this.f12344a;
    }

    public final String e() {
        return this.f12345b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d)) {
            return false;
        }
        b0.e.d dVar = (b0.e.d) obj;
        if (this.f12344a == dVar.d() && this.f12345b.equals(dVar.e()) && this.f12346c.equals(dVar.a()) && this.f12347d.equals(dVar.b())) {
            b0.e.d.C0152d dVar2 = this.f12348e;
            if (dVar2 == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (dVar2.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f12344a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f12345b.hashCode()) * 1000003) ^ this.f12346c.hashCode()) * 1000003) ^ this.f12347d.hashCode()) * 1000003;
        b0.e.d.C0152d dVar = this.f12348e;
        if (dVar == null) {
            i10 = 0;
        } else {
            i10 = dVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Event{timestamp=");
        q10.append(this.f12344a);
        q10.append(", type=");
        q10.append(this.f12345b);
        q10.append(", app=");
        q10.append(this.f12346c);
        q10.append(", device=");
        q10.append(this.f12347d);
        q10.append(", log=");
        q10.append(this.f12348e);
        q10.append("}");
        return q10.toString();
    }
}
