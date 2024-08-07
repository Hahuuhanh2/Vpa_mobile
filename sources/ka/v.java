package ka;

import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem */
public final class v extends b0.e.C0153e {

    /* renamed from: a  reason: collision with root package name */
    public final int f12422a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12423b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12424c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12425d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem */
    public static final class a extends b0.e.C0153e.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f12426a;

        /* renamed from: b  reason: collision with root package name */
        public String f12427b;

        /* renamed from: c  reason: collision with root package name */
        public String f12428c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f12429d;

        public final v a() {
            String str;
            if (this.f12426a == null) {
                str = " platform";
            } else {
                str = "";
            }
            if (this.f12427b == null) {
                str = f0.b0.r(str, " version");
            }
            if (this.f12428c == null) {
                str = f0.b0.r(str, " buildVersion");
            }
            if (this.f12429d == null) {
                str = f0.b0.r(str, " jailbroken");
            }
            if (str.isEmpty()) {
                return new v(this.f12426a.intValue(), this.f12427b, this.f12428c, this.f12429d.booleanValue());
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }
    }

    public v(int i10, String str, String str2, boolean z10) {
        this.f12422a = i10;
        this.f12423b = str;
        this.f12424c = str2;
        this.f12425d = z10;
    }

    public final String a() {
        return this.f12424c;
    }

    public final int b() {
        return this.f12422a;
    }

    public final String c() {
        return this.f12423b;
    }

    public final boolean d() {
        return this.f12425d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.C0153e)) {
            return false;
        }
        b0.e.C0153e eVar = (b0.e.C0153e) obj;
        if (this.f12422a != eVar.b() || !this.f12423b.equals(eVar.c()) || !this.f12424c.equals(eVar.a()) || this.f12425d != eVar.d()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f12422a ^ 1000003) * 1000003) ^ this.f12423b.hashCode()) * 1000003) ^ this.f12424c.hashCode()) * 1000003;
        if (this.f12425d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("OperatingSystem{platform=");
        q10.append(this.f12422a);
        q10.append(", version=");
        q10.append(this.f12423b);
        q10.append(", buildVersion=");
        q10.append(this.f12424c);
        q10.append(", jailbroken=");
        q10.append(this.f12425d);
        q10.append("}");
        return q10.toString();
    }
}
