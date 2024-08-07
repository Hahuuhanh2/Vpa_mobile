package ka;

import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport */
public final class b extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f12241b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12242c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12243d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12244e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12245f;

    /* renamed from: g  reason: collision with root package name */
    public final String f12246g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12247h;

    /* renamed from: i  reason: collision with root package name */
    public final String f12248i;

    /* renamed from: j  reason: collision with root package name */
    public final b0.e f12249j;

    /* renamed from: k  reason: collision with root package name */
    public final b0.d f12250k;

    /* renamed from: l  reason: collision with root package name */
    public final b0.a f12251l;

    /* compiled from: AutoValue_CrashlyticsReport */
    public static final class a extends b0.b {

        /* renamed from: a  reason: collision with root package name */
        public String f12252a;

        /* renamed from: b  reason: collision with root package name */
        public String f12253b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f12254c;

        /* renamed from: d  reason: collision with root package name */
        public String f12255d;

        /* renamed from: e  reason: collision with root package name */
        public String f12256e;

        /* renamed from: f  reason: collision with root package name */
        public String f12257f;

        /* renamed from: g  reason: collision with root package name */
        public String f12258g;

        /* renamed from: h  reason: collision with root package name */
        public String f12259h;

        /* renamed from: i  reason: collision with root package name */
        public b0.e f12260i;

        /* renamed from: j  reason: collision with root package name */
        public b0.d f12261j;

        /* renamed from: k  reason: collision with root package name */
        public b0.a f12262k;

        public a() {
        }

        public final b a() {
            String str;
            if (this.f12252a == null) {
                str = " sdkVersion";
            } else {
                str = "";
            }
            if (this.f12253b == null) {
                str = f0.b0.r(str, " gmpAppId");
            }
            if (this.f12254c == null) {
                str = f0.b0.r(str, " platform");
            }
            if (this.f12255d == null) {
                str = f0.b0.r(str, " installationUuid");
            }
            if (this.f12258g == null) {
                str = f0.b0.r(str, " buildVersion");
            }
            if (this.f12259h == null) {
                str = f0.b0.r(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.f12252a, this.f12253b, this.f12254c.intValue(), this.f12255d, this.f12256e, this.f12257f, this.f12258g, this.f12259h, this.f12260i, this.f12261j, this.f12262k);
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }

        public a(b0 b0Var) {
            this.f12252a = b0Var.j();
            this.f12253b = b0Var.f();
            this.f12254c = Integer.valueOf(b0Var.i());
            this.f12255d = b0Var.g();
            this.f12256e = b0Var.e();
            this.f12257f = b0Var.b();
            this.f12258g = b0Var.c();
            this.f12259h = b0Var.d();
            this.f12260i = b0Var.k();
            this.f12261j = b0Var.h();
            this.f12262k = b0Var.a();
        }
    }

    public b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, b0.e eVar, b0.d dVar, b0.a aVar) {
        this.f12241b = str;
        this.f12242c = str2;
        this.f12243d = i10;
        this.f12244e = str3;
        this.f12245f = str4;
        this.f12246g = str5;
        this.f12247h = str6;
        this.f12248i = str7;
        this.f12249j = eVar;
        this.f12250k = dVar;
        this.f12251l = aVar;
    }

    public final b0.a a() {
        return this.f12251l;
    }

    public final String b() {
        return this.f12246g;
    }

    public final String c() {
        return this.f12247h;
    }

    public final String d() {
        return this.f12248i;
    }

    public final String e() {
        return this.f12245f;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        b0.e eVar;
        b0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f12241b.equals(b0Var.j()) && this.f12242c.equals(b0Var.f()) && this.f12243d == b0Var.i() && this.f12244e.equals(b0Var.g()) && ((str = this.f12245f) != null ? str.equals(b0Var.e()) : b0Var.e() == null) && ((str2 = this.f12246g) != null ? str2.equals(b0Var.b()) : b0Var.b() == null) && this.f12247h.equals(b0Var.c()) && this.f12248i.equals(b0Var.d()) && ((eVar = this.f12249j) != null ? eVar.equals(b0Var.k()) : b0Var.k() == null) && ((dVar = this.f12250k) != null ? dVar.equals(b0Var.h()) : b0Var.h() == null)) {
            b0.a aVar = this.f12251l;
            if (aVar == null) {
                if (b0Var.a() == null) {
                    return true;
                }
            } else if (aVar.equals(b0Var.a())) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.f12242c;
    }

    public final String g() {
        return this.f12244e;
    }

    public final b0.d h() {
        return this.f12250k;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int hashCode = (((((((this.f12241b.hashCode() ^ 1000003) * 1000003) ^ this.f12242c.hashCode()) * 1000003) ^ this.f12243d) * 1000003) ^ this.f12244e.hashCode()) * 1000003;
        String str = this.f12245f;
        int i14 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = (hashCode ^ i10) * 1000003;
        String str2 = this.f12246g;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int hashCode2 = (((((i15 ^ i11) * 1000003) ^ this.f12247h.hashCode()) * 1000003) ^ this.f12248i.hashCode()) * 1000003;
        b0.e eVar = this.f12249j;
        if (eVar == null) {
            i12 = 0;
        } else {
            i12 = eVar.hashCode();
        }
        int i16 = (hashCode2 ^ i12) * 1000003;
        b0.d dVar = this.f12250k;
        if (dVar == null) {
            i13 = 0;
        } else {
            i13 = dVar.hashCode();
        }
        int i17 = (i16 ^ i13) * 1000003;
        b0.a aVar = this.f12251l;
        if (aVar != null) {
            i14 = aVar.hashCode();
        }
        return i17 ^ i14;
    }

    public final int i() {
        return this.f12243d;
    }

    public final String j() {
        return this.f12241b;
    }

    public final b0.e k() {
        return this.f12249j;
    }

    public final a l() {
        return new a(this);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("CrashlyticsReport{sdkVersion=");
        q10.append(this.f12241b);
        q10.append(", gmpAppId=");
        q10.append(this.f12242c);
        q10.append(", platform=");
        q10.append(this.f12243d);
        q10.append(", installationUuid=");
        q10.append(this.f12244e);
        q10.append(", firebaseInstallationId=");
        q10.append(this.f12245f);
        q10.append(", appQualitySessionId=");
        q10.append(this.f12246g);
        q10.append(", buildVersion=");
        q10.append(this.f12247h);
        q10.append(", displayVersion=");
        q10.append(this.f12248i);
        q10.append(", session=");
        q10.append(this.f12249j);
        q10.append(", ndkPayload=");
        q10.append(this.f12250k);
        q10.append(", appExitInfo=");
        q10.append(this.f12251l);
        q10.append("}");
        return q10.toString();
    }
}
