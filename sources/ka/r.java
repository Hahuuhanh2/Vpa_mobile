package ka;

import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
public final class r extends b0.e.d.a.b.C0148d {

    /* renamed from: a  reason: collision with root package name */
    public final String f12393a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12394b;

    /* renamed from: c  reason: collision with root package name */
    public final c0<b0.e.d.a.b.C0148d.C0150b> f12395c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
    public static final class a extends b0.e.d.a.b.C0148d.C0149a {

        /* renamed from: a  reason: collision with root package name */
        public String f12396a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f12397b;

        /* renamed from: c  reason: collision with root package name */
        public c0<b0.e.d.a.b.C0148d.C0150b> f12398c;

        public final r a() {
            String str;
            if (this.f12396a == null) {
                str = " name";
            } else {
                str = "";
            }
            if (this.f12397b == null) {
                str = f0.b0.r(str, " importance");
            }
            if (this.f12398c == null) {
                str = f0.b0.r(str, " frames");
            }
            if (str.isEmpty()) {
                return new r(this.f12396a, this.f12397b.intValue(), this.f12398c);
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }
    }

    public r() {
        throw null;
    }

    public r(String str, int i10, c0 c0Var) {
        this.f12393a = str;
        this.f12394b = i10;
        this.f12395c = c0Var;
    }

    public final c0<b0.e.d.a.b.C0148d.C0150b> a() {
        return this.f12395c;
    }

    public final int b() {
        return this.f12394b;
    }

    public final String c() {
        return this.f12393a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.C0148d)) {
            return false;
        }
        b0.e.d.a.b.C0148d dVar = (b0.e.d.a.b.C0148d) obj;
        if (!this.f12393a.equals(dVar.c()) || this.f12394b != dVar.b() || !this.f12395c.equals(dVar.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f12393a.hashCode() ^ 1000003) * 1000003) ^ this.f12394b) * 1000003) ^ this.f12395c.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Thread{name=");
        q10.append(this.f12393a);
        q10.append(", importance=");
        q10.append(this.f12394b);
        q10.append(", frames=");
        q10.append(this.f12395c);
        q10.append("}");
        return q10.toString();
    }
}
