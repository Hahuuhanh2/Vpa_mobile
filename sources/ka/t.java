package ka;

import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device */
public final class t extends b0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    public final Double f12409a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12410b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12411c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12412d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12413e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12414f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device */
    public static final class a extends b0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Double f12415a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f12416b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f12417c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f12418d;

        /* renamed from: e  reason: collision with root package name */
        public Long f12419e;

        /* renamed from: f  reason: collision with root package name */
        public Long f12420f;

        public final t a() {
            String str;
            if (this.f12416b == null) {
                str = " batteryVelocity";
            } else {
                str = "";
            }
            if (this.f12417c == null) {
                str = f0.b0.r(str, " proximityOn");
            }
            if (this.f12418d == null) {
                str = f0.b0.r(str, " orientation");
            }
            if (this.f12419e == null) {
                str = f0.b0.r(str, " ramUsed");
            }
            if (this.f12420f == null) {
                str = f0.b0.r(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new t(this.f12415a, this.f12416b.intValue(), this.f12417c.booleanValue(), this.f12418d.intValue(), this.f12419e.longValue(), this.f12420f.longValue());
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }
    }

    public t(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f12409a = d10;
        this.f12410b = i10;
        this.f12411c = z10;
        this.f12412d = i11;
        this.f12413e = j10;
        this.f12414f = j11;
    }

    public final Double a() {
        return this.f12409a;
    }

    public final int b() {
        return this.f12410b;
    }

    public final long c() {
        return this.f12414f;
    }

    public final int d() {
        return this.f12412d;
    }

    public final long e() {
        return this.f12413e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.c)) {
            return false;
        }
        b0.e.d.c cVar = (b0.e.d.c) obj;
        Double d10 = this.f12409a;
        if (d10 != null ? d10.equals(cVar.a()) : cVar.a() == null) {
            if (this.f12410b == cVar.b() && this.f12411c == cVar.f() && this.f12412d == cVar.d() && this.f12413e == cVar.e() && this.f12414f == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f12411c;
    }

    public final int hashCode() {
        int i10;
        int i11;
        Double d10 = this.f12409a;
        if (d10 == null) {
            i10 = 0;
        } else {
            i10 = d10.hashCode();
        }
        int i12 = (((i10 ^ 1000003) * 1000003) ^ this.f12410b) * 1000003;
        if (this.f12411c) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        long j10 = this.f12413e;
        long j11 = this.f12414f;
        return ((((((i12 ^ i11) * 1000003) ^ this.f12412d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Device{batteryLevel=");
        q10.append(this.f12409a);
        q10.append(", batteryVelocity=");
        q10.append(this.f12410b);
        q10.append(", proximityOn=");
        q10.append(this.f12411c);
        q10.append(", orientation=");
        q10.append(this.f12412d);
        q10.append(", ramUsed=");
        q10.append(this.f12413e);
        q10.append(", diskUsed=");
        q10.append(this.f12414f);
        q10.append("}");
        return q10.toString();
    }
}
