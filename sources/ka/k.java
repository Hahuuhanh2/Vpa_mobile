package ka;

import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device */
public final class k extends b0.e.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f12326a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12327b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12328c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12329d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12330e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12331f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12332g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12333h;

    /* renamed from: i  reason: collision with root package name */
    public final String f12334i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device */
    public static final class a extends b0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f12335a;

        /* renamed from: b  reason: collision with root package name */
        public String f12336b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f12337c;

        /* renamed from: d  reason: collision with root package name */
        public Long f12338d;

        /* renamed from: e  reason: collision with root package name */
        public Long f12339e;

        /* renamed from: f  reason: collision with root package name */
        public Boolean f12340f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f12341g;

        /* renamed from: h  reason: collision with root package name */
        public String f12342h;

        /* renamed from: i  reason: collision with root package name */
        public String f12343i;

        public final k a() {
            String str;
            if (this.f12335a == null) {
                str = " arch";
            } else {
                str = "";
            }
            if (this.f12336b == null) {
                str = f0.b0.r(str, " model");
            }
            if (this.f12337c == null) {
                str = f0.b0.r(str, " cores");
            }
            if (this.f12338d == null) {
                str = f0.b0.r(str, " ram");
            }
            if (this.f12339e == null) {
                str = f0.b0.r(str, " diskSpace");
            }
            if (this.f12340f == null) {
                str = f0.b0.r(str, " simulator");
            }
            if (this.f12341g == null) {
                str = f0.b0.r(str, " state");
            }
            if (this.f12342h == null) {
                str = f0.b0.r(str, " manufacturer");
            }
            if (this.f12343i == null) {
                str = f0.b0.r(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new k(this.f12335a.intValue(), this.f12336b, this.f12337c.intValue(), this.f12338d.longValue(), this.f12339e.longValue(), this.f12340f.booleanValue(), this.f12341g.intValue(), this.f12342h, this.f12343i);
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }
    }

    public k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f12326a = i10;
        this.f12327b = str;
        this.f12328c = i11;
        this.f12329d = j10;
        this.f12330e = j11;
        this.f12331f = z10;
        this.f12332g = i12;
        this.f12333h = str2;
        this.f12334i = str3;
    }

    public final int a() {
        return this.f12326a;
    }

    public final int b() {
        return this.f12328c;
    }

    public final long c() {
        return this.f12330e;
    }

    public final String d() {
        return this.f12333h;
    }

    public final String e() {
        return this.f12327b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.c)) {
            return false;
        }
        b0.e.c cVar = (b0.e.c) obj;
        if (this.f12326a == cVar.a() && this.f12327b.equals(cVar.e()) && this.f12328c == cVar.b() && this.f12329d == cVar.g() && this.f12330e == cVar.c() && this.f12331f == cVar.i() && this.f12332g == cVar.h() && this.f12333h.equals(cVar.d()) && this.f12334i.equals(cVar.f())) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f12334i;
    }

    public final long g() {
        return this.f12329d;
    }

    public final int h() {
        return this.f12332g;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f12329d;
        long j11 = this.f12330e;
        int hashCode = (((((((((this.f12326a ^ 1000003) * 1000003) ^ this.f12327b.hashCode()) * 1000003) ^ this.f12328c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f12331f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f12332g) * 1000003) ^ this.f12333h.hashCode()) * 1000003) ^ this.f12334i.hashCode();
    }

    public final boolean i() {
        return this.f12331f;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Device{arch=");
        q10.append(this.f12326a);
        q10.append(", model=");
        q10.append(this.f12327b);
        q10.append(", cores=");
        q10.append(this.f12328c);
        q10.append(", ram=");
        q10.append(this.f12329d);
        q10.append(", diskSpace=");
        q10.append(this.f12330e);
        q10.append(", simulator=");
        q10.append(this.f12331f);
        q10.append(", state=");
        q10.append(this.f12332g);
        q10.append(", manufacturer=");
        q10.append(this.f12333h);
        q10.append(", modelClass=");
        return android.support.v4.media.a.o(q10, this.f12334i, "}");
    }
}
