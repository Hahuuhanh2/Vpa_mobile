package db;

import android.support.v4.media.a;
import v.v;

/* compiled from: AutoValue_TokenResult */
public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f8871a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8872b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8873c;

    public b(String str, long j10, int i10) {
        this.f8871a = str;
        this.f8872b = j10;
        this.f8873c = i10;
    }

    public final int a() {
        return this.f8873c;
    }

    public final String b() {
        return this.f8871a;
    }

    public final long c() {
        return this.f8872b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f8871a;
        if (str != null ? str.equals(fVar.b()) : fVar.b() == null) {
            if (this.f8872b == fVar.c()) {
                int i10 = this.f8873c;
                if (i10 == 0) {
                    if (fVar.a() == 0) {
                        return true;
                    }
                } else if (v.a(i10, fVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f8871a;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        long j10 = this.f8872b;
        int i12 = (((i10 ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i13 = this.f8873c;
        if (i13 != 0) {
            i11 = v.g(i13);
        }
        return i12 ^ i11;
    }

    public final String toString() {
        StringBuilder q10 = a.q("TokenResult{token=");
        q10.append(this.f8871a);
        q10.append(", tokenExpirationTimestamp=");
        q10.append(this.f8872b);
        q10.append(", responseCode=");
        q10.append(a.E(this.f8873c));
        q10.append("}");
        return q10.toString();
    }
}
