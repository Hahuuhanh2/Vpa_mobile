package ka;

import ka.b0;
import v.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
public final class s extends b0.e.d.a.b.C0148d.C0150b {

    /* renamed from: a  reason: collision with root package name */
    public final long f12399a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12400b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12401c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12402d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12403e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
    public static final class a extends b0.e.d.a.b.C0148d.C0150b.C0151a {

        /* renamed from: a  reason: collision with root package name */
        public Long f12404a;

        /* renamed from: b  reason: collision with root package name */
        public String f12405b;

        /* renamed from: c  reason: collision with root package name */
        public String f12406c;

        /* renamed from: d  reason: collision with root package name */
        public Long f12407d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f12408e;

        public final s a() {
            String str;
            if (this.f12404a == null) {
                str = " pc";
            } else {
                str = "";
            }
            if (this.f12405b == null) {
                str = f0.b0.r(str, " symbol");
            }
            if (this.f12407d == null) {
                str = f0.b0.r(str, " offset");
            }
            if (this.f12408e == null) {
                str = f0.b0.r(str, " importance");
            }
            if (str.isEmpty()) {
                return new s(this.f12404a.longValue(), this.f12405b, this.f12406c, this.f12407d.longValue(), this.f12408e.intValue());
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }
    }

    public s(long j10, String str, String str2, long j11, int i10) {
        this.f12399a = j10;
        this.f12400b = str;
        this.f12401c = str2;
        this.f12402d = j11;
        this.f12403e = i10;
    }

    public final String a() {
        return this.f12401c;
    }

    public final int b() {
        return this.f12403e;
    }

    public final long c() {
        return this.f12402d;
    }

    public final long d() {
        return this.f12399a;
    }

    public final String e() {
        return this.f12400b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.C0148d.C0150b)) {
            return false;
        }
        b0.e.d.a.b.C0148d.C0150b bVar = (b0.e.d.a.b.C0148d.C0150b) obj;
        if (this.f12399a == bVar.d() && this.f12400b.equals(bVar.e()) && ((str = this.f12401c) != null ? str.equals(bVar.a()) : bVar.a() == null) && this.f12402d == bVar.c() && this.f12403e == bVar.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f12399a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f12400b.hashCode()) * 1000003;
        String str = this.f12401c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        long j11 = this.f12402d;
        return ((((hashCode ^ i10) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f12403e;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Frame{pc=");
        q10.append(this.f12399a);
        q10.append(", symbol=");
        q10.append(this.f12400b);
        q10.append(", file=");
        q10.append(this.f12401c);
        q10.append(", offset=");
        q10.append(this.f12402d);
        q10.append(", importance=");
        return v.e(q10, this.f12403e, "}");
    }
}
