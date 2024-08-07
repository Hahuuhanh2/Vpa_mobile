package ka;

import ka.b0;
import v.v;

/* compiled from: AutoValue_CrashlyticsReport_Session */
public final class h extends b0.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f12295a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12296b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12297c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12298d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f12299e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12300f;

    /* renamed from: g  reason: collision with root package name */
    public final b0.e.a f12301g;

    /* renamed from: h  reason: collision with root package name */
    public final b0.e.f f12302h;

    /* renamed from: i  reason: collision with root package name */
    public final b0.e.C0153e f12303i;

    /* renamed from: j  reason: collision with root package name */
    public final b0.e.c f12304j;

    /* renamed from: k  reason: collision with root package name */
    public final c0<b0.e.d> f12305k;

    /* renamed from: l  reason: collision with root package name */
    public final int f12306l;

    /* compiled from: AutoValue_CrashlyticsReport_Session */
    public static final class a extends b0.e.b {

        /* renamed from: a  reason: collision with root package name */
        public String f12307a;

        /* renamed from: b  reason: collision with root package name */
        public String f12308b;

        /* renamed from: c  reason: collision with root package name */
        public String f12309c;

        /* renamed from: d  reason: collision with root package name */
        public Long f12310d;

        /* renamed from: e  reason: collision with root package name */
        public Long f12311e;

        /* renamed from: f  reason: collision with root package name */
        public Boolean f12312f;

        /* renamed from: g  reason: collision with root package name */
        public b0.e.a f12313g;

        /* renamed from: h  reason: collision with root package name */
        public b0.e.f f12314h;

        /* renamed from: i  reason: collision with root package name */
        public b0.e.C0153e f12315i;

        /* renamed from: j  reason: collision with root package name */
        public b0.e.c f12316j;

        /* renamed from: k  reason: collision with root package name */
        public c0<b0.e.d> f12317k;

        /* renamed from: l  reason: collision with root package name */
        public Integer f12318l;

        public a() {
        }

        public final h a() {
            String str;
            if (this.f12307a == null) {
                str = " generator";
            } else {
                str = "";
            }
            if (this.f12308b == null) {
                str = f0.b0.r(str, " identifier");
            }
            if (this.f12310d == null) {
                str = f0.b0.r(str, " startedAt");
            }
            if (this.f12312f == null) {
                str = f0.b0.r(str, " crashed");
            }
            if (this.f12313g == null) {
                str = f0.b0.r(str, " app");
            }
            if (this.f12318l == null) {
                str = f0.b0.r(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new h(this.f12307a, this.f12308b, this.f12309c, this.f12310d.longValue(), this.f12311e, this.f12312f.booleanValue(), this.f12313g, this.f12314h, this.f12315i, this.f12316j, this.f12317k, this.f12318l.intValue());
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }

        public a(b0.e eVar) {
            this.f12307a = eVar.f();
            this.f12308b = eVar.h();
            this.f12309c = eVar.b();
            this.f12310d = Long.valueOf(eVar.j());
            this.f12311e = eVar.d();
            this.f12312f = Boolean.valueOf(eVar.l());
            this.f12313g = eVar.a();
            this.f12314h = eVar.k();
            this.f12315i = eVar.i();
            this.f12316j = eVar.c();
            this.f12317k = eVar.e();
            this.f12318l = Integer.valueOf(eVar.g());
        }
    }

    public h() {
        throw null;
    }

    public h(String str, String str2, String str3, long j10, Long l10, boolean z10, b0.e.a aVar, b0.e.f fVar, b0.e.C0153e eVar, b0.e.c cVar, c0 c0Var, int i10) {
        this.f12295a = str;
        this.f12296b = str2;
        this.f12297c = str3;
        this.f12298d = j10;
        this.f12299e = l10;
        this.f12300f = z10;
        this.f12301g = aVar;
        this.f12302h = fVar;
        this.f12303i = eVar;
        this.f12304j = cVar;
        this.f12305k = c0Var;
        this.f12306l = i10;
    }

    public final b0.e.a a() {
        return this.f12301g;
    }

    public final String b() {
        return this.f12297c;
    }

    public final b0.e.c c() {
        return this.f12304j;
    }

    public final Long d() {
        return this.f12299e;
    }

    public final c0<b0.e.d> e() {
        return this.f12305k;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l10;
        b0.e.f fVar;
        b0.e.C0153e eVar;
        b0.e.c cVar;
        c0<b0.e.d> c0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e)) {
            return false;
        }
        b0.e eVar2 = (b0.e) obj;
        if (!this.f12295a.equals(eVar2.f()) || !this.f12296b.equals(eVar2.h()) || ((str = this.f12297c) != null ? !str.equals(eVar2.b()) : eVar2.b() != null) || this.f12298d != eVar2.j() || ((l10 = this.f12299e) != null ? !l10.equals(eVar2.d()) : eVar2.d() != null) || this.f12300f != eVar2.l() || !this.f12301g.equals(eVar2.a()) || ((fVar = this.f12302h) != null ? !fVar.equals(eVar2.k()) : eVar2.k() != null) || ((eVar = this.f12303i) != null ? !eVar.equals(eVar2.i()) : eVar2.i() != null) || ((cVar = this.f12304j) != null ? !cVar.equals(eVar2.c()) : eVar2.c() != null) || ((c0Var = this.f12305k) != null ? !c0Var.equals(eVar2.e()) : eVar2.e() != null) || this.f12306l != eVar2.g()) {
            return false;
        }
        return true;
    }

    public final String f() {
        return this.f12295a;
    }

    public final int g() {
        return this.f12306l;
    }

    public final String h() {
        return this.f12296b;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int hashCode = (((this.f12295a.hashCode() ^ 1000003) * 1000003) ^ this.f12296b.hashCode()) * 1000003;
        String str = this.f12297c;
        int i16 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        long j10 = this.f12298d;
        int i17 = (((hashCode ^ i10) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f12299e;
        if (l10 == null) {
            i11 = 0;
        } else {
            i11 = l10.hashCode();
        }
        int i18 = (i17 ^ i11) * 1000003;
        if (this.f12300f) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int hashCode2 = (((i18 ^ i12) * 1000003) ^ this.f12301g.hashCode()) * 1000003;
        b0.e.f fVar = this.f12302h;
        if (fVar == null) {
            i13 = 0;
        } else {
            i13 = fVar.hashCode();
        }
        int i19 = (hashCode2 ^ i13) * 1000003;
        b0.e.C0153e eVar = this.f12303i;
        if (eVar == null) {
            i14 = 0;
        } else {
            i14 = eVar.hashCode();
        }
        int i20 = (i19 ^ i14) * 1000003;
        b0.e.c cVar = this.f12304j;
        if (cVar == null) {
            i15 = 0;
        } else {
            i15 = cVar.hashCode();
        }
        int i21 = (i20 ^ i15) * 1000003;
        c0<b0.e.d> c0Var = this.f12305k;
        if (c0Var != null) {
            i16 = c0Var.hashCode();
        }
        return ((i21 ^ i16) * 1000003) ^ this.f12306l;
    }

    public final b0.e.C0153e i() {
        return this.f12303i;
    }

    public final long j() {
        return this.f12298d;
    }

    public final b0.e.f k() {
        return this.f12302h;
    }

    public final boolean l() {
        return this.f12300f;
    }

    public final a m() {
        return new a(this);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Session{generator=");
        q10.append(this.f12295a);
        q10.append(", identifier=");
        q10.append(this.f12296b);
        q10.append(", appQualitySessionId=");
        q10.append(this.f12297c);
        q10.append(", startedAt=");
        q10.append(this.f12298d);
        q10.append(", endedAt=");
        q10.append(this.f12299e);
        q10.append(", crashed=");
        q10.append(this.f12300f);
        q10.append(", app=");
        q10.append(this.f12301g);
        q10.append(", user=");
        q10.append(this.f12302h);
        q10.append(", os=");
        q10.append(this.f12303i);
        q10.append(", device=");
        q10.append(this.f12304j);
        q10.append(", events=");
        q10.append(this.f12305k);
        q10.append(", generatorType=");
        return v.e(q10, this.f12306l, "}");
    }
}
