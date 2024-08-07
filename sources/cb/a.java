package cb;

import cb.d;
import f0.b0;
import v.v;

/* compiled from: AutoValue_PersistedInstallationEntry */
public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f4667b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4668c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4669d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4670e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4671f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4672g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4673h;

    /* renamed from: cb.a$a  reason: collision with other inner class name */
    /* compiled from: AutoValue_PersistedInstallationEntry */
    public static final class C0053a extends d.a {

        /* renamed from: a  reason: collision with root package name */
        public String f4674a;

        /* renamed from: b  reason: collision with root package name */
        public int f4675b;

        /* renamed from: c  reason: collision with root package name */
        public String f4676c;

        /* renamed from: d  reason: collision with root package name */
        public String f4677d;

        /* renamed from: e  reason: collision with root package name */
        public Long f4678e;

        /* renamed from: f  reason: collision with root package name */
        public Long f4679f;

        /* renamed from: g  reason: collision with root package name */
        public String f4680g;

        public C0053a() {
        }

        public final a a() {
            String str;
            if (this.f4675b == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (this.f4678e == null) {
                str = b0.r(str, " expiresInSecs");
            }
            if (this.f4679f == null) {
                str = b0.r(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f4674a, this.f4675b, this.f4676c, this.f4677d, this.f4678e.longValue(), this.f4679f.longValue(), this.f4680g);
            }
            throw new IllegalStateException(b0.r("Missing required properties:", str));
        }

        public final C0053a b(int i10) {
            if (i10 != 0) {
                this.f4675b = i10;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public C0053a(d dVar) {
            this.f4674a = dVar.c();
            this.f4675b = dVar.f();
            this.f4676c = dVar.a();
            this.f4677d = dVar.e();
            this.f4678e = Long.valueOf(dVar.b());
            this.f4679f = Long.valueOf(dVar.g());
            this.f4680g = dVar.d();
        }
    }

    public a(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.f4667b = str;
        this.f4668c = i10;
        this.f4669d = str2;
        this.f4670e = str3;
        this.f4671f = j10;
        this.f4672g = j11;
        this.f4673h = str4;
    }

    public final String a() {
        return this.f4669d;
    }

    public final long b() {
        return this.f4671f;
    }

    public final String c() {
        return this.f4667b;
    }

    public final String d() {
        return this.f4673h;
    }

    public final String e() {
        return this.f4670e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f4667b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (v.a(this.f4668c, dVar.f()) && ((str = this.f4669d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f4670e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f4671f == dVar.b() && this.f4672g == dVar.g()) {
                String str4 = this.f4673h;
                if (str4 == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int f() {
        return this.f4668c;
    }

    public final long g() {
        return this.f4672g;
    }

    public final C0053a h() {
        return new C0053a(this);
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        String str = this.f4667b;
        int i13 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int g2 = (((i10 ^ 1000003) * 1000003) ^ v.g(this.f4668c)) * 1000003;
        String str2 = this.f4669d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (g2 ^ i11) * 1000003;
        String str3 = this.f4670e;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        long j10 = this.f4671f;
        long j11 = this.f4672g;
        int i15 = (((((i14 ^ i12) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f4673h;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i15 ^ i13;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("PersistedInstallationEntry{firebaseInstallationId=");
        q10.append(this.f4667b);
        q10.append(", registrationStatus=");
        q10.append(android.support.v4.media.a.z(this.f4668c));
        q10.append(", authToken=");
        q10.append(this.f4669d);
        q10.append(", refreshToken=");
        q10.append(this.f4670e);
        q10.append(", expiresInSecs=");
        q10.append(this.f4671f);
        q10.append(", tokenCreationEpochInSecs=");
        q10.append(this.f4672g);
        q10.append(", fisError=");
        return android.support.v4.media.a.o(q10, this.f4673h, "}");
    }
}
