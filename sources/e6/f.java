package e6;

import e6.l;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent */
public final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f9206a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f9207b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9208c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f9209d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9210e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9211f;

    /* renamed from: g  reason: collision with root package name */
    public final o f9212g;

    /* compiled from: AutoValue_LogEvent */
    public static final class a extends l.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f9213a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f9214b;

        /* renamed from: c  reason: collision with root package name */
        public Long f9215c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f9216d;

        /* renamed from: e  reason: collision with root package name */
        public String f9217e;

        /* renamed from: f  reason: collision with root package name */
        public Long f9218f;

        /* renamed from: g  reason: collision with root package name */
        public o f9219g;
    }

    public f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f9206a = j10;
        this.f9207b = num;
        this.f9208c = j11;
        this.f9209d = bArr;
        this.f9210e = str;
        this.f9211f = j12;
        this.f9212g = oVar;
    }

    public final Integer a() {
        return this.f9207b;
    }

    public final long b() {
        return this.f9206a;
    }

    public final long c() {
        return this.f9208c;
    }

    public final o d() {
        return this.f9212g;
    }

    public final byte[] e() {
        return this.f9209d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f9206a == lVar.b() && ((num = this.f9207b) != null ? num.equals(lVar.a()) : lVar.a() == null) && this.f9208c == lVar.c()) {
            byte[] bArr2 = this.f9209d;
            if (lVar instanceof f) {
                bArr = ((f) lVar).f9209d;
            } else {
                bArr = lVar.e();
            }
            if (Arrays.equals(bArr2, bArr) && ((str = this.f9210e) != null ? str.equals(lVar.f()) : lVar.f() == null) && this.f9211f == lVar.g()) {
                o oVar = this.f9212g;
                if (oVar == null) {
                    if (lVar.d() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.f9210e;
    }

    public final long g() {
        return this.f9211f;
    }

    public final int hashCode() {
        int i10;
        int i11;
        long j10 = this.f9206a;
        int i12 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f9207b;
        int i13 = 0;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        long j11 = this.f9208c;
        int hashCode = (((((i12 ^ i10) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f9209d)) * 1000003;
        String str = this.f9210e;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        long j12 = this.f9211f;
        int i14 = (((hashCode ^ i11) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f9212g;
        if (oVar != null) {
            i13 = oVar.hashCode();
        }
        return i14 ^ i13;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("LogEvent{eventTimeMs=");
        q10.append(this.f9206a);
        q10.append(", eventCode=");
        q10.append(this.f9207b);
        q10.append(", eventUptimeMs=");
        q10.append(this.f9208c);
        q10.append(", sourceExtension=");
        q10.append(Arrays.toString(this.f9209d));
        q10.append(", sourceExtensionJsonProto3=");
        q10.append(this.f9210e);
        q10.append(", timezoneOffsetSeconds=");
        q10.append(this.f9211f);
        q10.append(", networkConnectionInfo=");
        q10.append(this.f9212g);
        q10.append("}");
        return q10.toString();
    }
}
