package ka;

import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo */
public final class c extends b0.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f12264a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12265b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12266c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12267d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12268e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12269f;

    /* renamed from: g  reason: collision with root package name */
    public final long f12270g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12271h;

    /* renamed from: i  reason: collision with root package name */
    public final c0<b0.a.C0139a> f12272i;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo */
    public static final class a extends b0.a.b {

        /* renamed from: a  reason: collision with root package name */
        public Integer f12273a;

        /* renamed from: b  reason: collision with root package name */
        public String f12274b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f12275c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f12276d;

        /* renamed from: e  reason: collision with root package name */
        public Long f12277e;

        /* renamed from: f  reason: collision with root package name */
        public Long f12278f;

        /* renamed from: g  reason: collision with root package name */
        public Long f12279g;

        /* renamed from: h  reason: collision with root package name */
        public String f12280h;

        /* renamed from: i  reason: collision with root package name */
        public c0<b0.a.C0139a> f12281i;

        public final c a() {
            String str;
            if (this.f12273a == null) {
                str = " pid";
            } else {
                str = "";
            }
            if (this.f12274b == null) {
                str = f0.b0.r(str, " processName");
            }
            if (this.f12275c == null) {
                str = f0.b0.r(str, " reasonCode");
            }
            if (this.f12276d == null) {
                str = f0.b0.r(str, " importance");
            }
            if (this.f12277e == null) {
                str = f0.b0.r(str, " pss");
            }
            if (this.f12278f == null) {
                str = f0.b0.r(str, " rss");
            }
            if (this.f12279g == null) {
                str = f0.b0.r(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new c(this.f12273a.intValue(), this.f12274b, this.f12275c.intValue(), this.f12276d.intValue(), this.f12277e.longValue(), this.f12278f.longValue(), this.f12279g.longValue(), this.f12280h, this.f12281i);
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }
    }

    public c() {
        throw null;
    }

    public c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, c0 c0Var) {
        this.f12264a = i10;
        this.f12265b = str;
        this.f12266c = i11;
        this.f12267d = i12;
        this.f12268e = j10;
        this.f12269f = j11;
        this.f12270g = j12;
        this.f12271h = str2;
        this.f12272i = c0Var;
    }

    public final c0<b0.a.C0139a> a() {
        return this.f12272i;
    }

    public final int b() {
        return this.f12267d;
    }

    public final int c() {
        return this.f12264a;
    }

    public final String d() {
        return this.f12265b;
    }

    public final long e() {
        return this.f12268e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.a)) {
            return false;
        }
        b0.a aVar = (b0.a) obj;
        if (this.f12264a == aVar.c() && this.f12265b.equals(aVar.d()) && this.f12266c == aVar.f() && this.f12267d == aVar.b() && this.f12268e == aVar.e() && this.f12269f == aVar.g() && this.f12270g == aVar.h() && ((str = this.f12271h) != null ? str.equals(aVar.i()) : aVar.i() == null)) {
            c0<b0.a.C0139a> c0Var = this.f12272i;
            if (c0Var == null) {
                if (aVar.a() == null) {
                    return true;
                }
            } else if (c0Var.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f12266c;
    }

    public final long g() {
        return this.f12269f;
    }

    public final long h() {
        return this.f12270g;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f12268e;
        long j11 = this.f12269f;
        long j12 = this.f12270g;
        int hashCode = (((((((((((((this.f12264a ^ 1000003) * 1000003) ^ this.f12265b.hashCode()) * 1000003) ^ this.f12266c) * 1000003) ^ this.f12267d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f12271h;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode ^ i10) * 1000003;
        c0<b0.a.C0139a> c0Var = this.f12272i;
        if (c0Var != null) {
            i11 = c0Var.hashCode();
        }
        return i12 ^ i11;
    }

    public final String i() {
        return this.f12271h;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ApplicationExitInfo{pid=");
        q10.append(this.f12264a);
        q10.append(", processName=");
        q10.append(this.f12265b);
        q10.append(", reasonCode=");
        q10.append(this.f12266c);
        q10.append(", importance=");
        q10.append(this.f12267d);
        q10.append(", pss=");
        q10.append(this.f12268e);
        q10.append(", rss=");
        q10.append(this.f12269f);
        q10.append(", timestamp=");
        q10.append(this.f12270g);
        q10.append(", traceFile=");
        q10.append(this.f12271h);
        q10.append(", buildIdMappingForArch=");
        q10.append(this.f12272i);
        q10.append("}");
        return q10.toString();
    }
}
