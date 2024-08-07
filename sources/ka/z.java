package ka;

import android.support.v4.media.a;
import ka.d0;

/* compiled from: AutoValue_StaticSessionData_DeviceData */
public final class z extends d0.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f12440a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12441b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12442c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12443d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12444e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12445f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12446g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12447h;

    /* renamed from: i  reason: collision with root package name */
    public final String f12448i;

    public z(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f12440a = i10;
        if (str != null) {
            this.f12441b = str;
            this.f12442c = i11;
            this.f12443d = j10;
            this.f12444e = j11;
            this.f12445f = z10;
            this.f12446g = i12;
            if (str2 != null) {
                this.f12447h = str2;
                if (str3 != null) {
                    this.f12448i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public final int a() {
        return this.f12440a;
    }

    public final int b() {
        return this.f12442c;
    }

    public final long c() {
        return this.f12444e;
    }

    public final boolean d() {
        return this.f12445f;
    }

    public final String e() {
        return this.f12447h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.b)) {
            return false;
        }
        d0.b bVar = (d0.b) obj;
        if (this.f12440a == bVar.a() && this.f12441b.equals(bVar.f()) && this.f12442c == bVar.b() && this.f12443d == bVar.i() && this.f12444e == bVar.c() && this.f12445f == bVar.d() && this.f12446g == bVar.h() && this.f12447h.equals(bVar.e()) && this.f12448i.equals(bVar.g())) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f12441b;
    }

    public final String g() {
        return this.f12448i;
    }

    public final int h() {
        return this.f12446g;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f12443d;
        long j11 = this.f12444e;
        int hashCode = (((((((((this.f12440a ^ 1000003) * 1000003) ^ this.f12441b.hashCode()) * 1000003) ^ this.f12442c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f12445f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f12446g) * 1000003) ^ this.f12447h.hashCode()) * 1000003) ^ this.f12448i.hashCode();
    }

    public final long i() {
        return this.f12443d;
    }

    public final String toString() {
        StringBuilder q10 = a.q("DeviceData{arch=");
        q10.append(this.f12440a);
        q10.append(", model=");
        q10.append(this.f12441b);
        q10.append(", availableProcessors=");
        q10.append(this.f12442c);
        q10.append(", totalRam=");
        q10.append(this.f12443d);
        q10.append(", diskSpace=");
        q10.append(this.f12444e);
        q10.append(", isEmulator=");
        q10.append(this.f12445f);
        q10.append(", state=");
        q10.append(this.f12446g);
        q10.append(", manufacturer=");
        q10.append(this.f12447h);
        q10.append(", modelClass=");
        return a.o(q10, this.f12448i, "}");
    }
}
