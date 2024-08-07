package ka;

import ka.b0;
import v.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
public final class p extends b0.e.d.a.b.C0145b {

    /* renamed from: a  reason: collision with root package name */
    public final String f12377a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12378b;

    /* renamed from: c  reason: collision with root package name */
    public final c0<b0.e.d.a.b.C0148d.C0150b> f12379c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.a.b.C0145b f12380d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12381e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
    public static final class a extends b0.e.d.a.b.C0145b.C0146a {

        /* renamed from: a  reason: collision with root package name */
        public String f12382a;

        /* renamed from: b  reason: collision with root package name */
        public String f12383b;

        /* renamed from: c  reason: collision with root package name */
        public c0<b0.e.d.a.b.C0148d.C0150b> f12384c;

        /* renamed from: d  reason: collision with root package name */
        public b0.e.d.a.b.C0145b f12385d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f12386e;

        public final p a() {
            String str;
            if (this.f12382a == null) {
                str = " type";
            } else {
                str = "";
            }
            if (this.f12384c == null) {
                str = f0.b0.r(str, " frames");
            }
            if (this.f12386e == null) {
                str = f0.b0.r(str, " overflowCount");
            }
            if (str.isEmpty()) {
                return new p(this.f12382a, this.f12383b, this.f12384c, this.f12385d, this.f12386e.intValue());
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }
    }

    public p() {
        throw null;
    }

    public p(String str, String str2, c0 c0Var, b0.e.d.a.b.C0145b bVar, int i10) {
        this.f12377a = str;
        this.f12378b = str2;
        this.f12379c = c0Var;
        this.f12380d = bVar;
        this.f12381e = i10;
    }

    public final b0.e.d.a.b.C0145b a() {
        return this.f12380d;
    }

    public final c0<b0.e.d.a.b.C0148d.C0150b> b() {
        return this.f12379c;
    }

    public final int c() {
        return this.f12381e;
    }

    public final String d() {
        return this.f12378b;
    }

    public final String e() {
        return this.f12377a;
    }

    public final boolean equals(Object obj) {
        String str;
        b0.e.d.a.b.C0145b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.C0145b)) {
            return false;
        }
        b0.e.d.a.b.C0145b bVar2 = (b0.e.d.a.b.C0145b) obj;
        if (!this.f12377a.equals(bVar2.e()) || ((str = this.f12378b) != null ? !str.equals(bVar2.d()) : bVar2.d() != null) || !this.f12379c.equals(bVar2.b()) || ((bVar = this.f12380d) != null ? !bVar.equals(bVar2.a()) : bVar2.a() != null) || this.f12381e != bVar2.c()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f12377a.hashCode() ^ 1000003) * 1000003;
        String str = this.f12378b;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode2 = (((hashCode ^ i10) * 1000003) ^ this.f12379c.hashCode()) * 1000003;
        b0.e.d.a.b.C0145b bVar = this.f12380d;
        if (bVar != null) {
            i11 = bVar.hashCode();
        }
        return ((hashCode2 ^ i11) * 1000003) ^ this.f12381e;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Exception{type=");
        q10.append(this.f12377a);
        q10.append(", reason=");
        q10.append(this.f12378b);
        q10.append(", frames=");
        q10.append(this.f12379c);
        q10.append(", causedBy=");
        q10.append(this.f12380d);
        q10.append(", overflowCount=");
        return v.e(q10, this.f12381e, "}");
    }
}
