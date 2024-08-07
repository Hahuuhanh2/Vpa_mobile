package s8;

import android.support.v4.media.a;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final class m extends n {

    /* renamed from: a  reason: collision with root package name */
    public final int f14692a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14693b;

    public m(int i10, long j10) {
        this.f14692a = i10;
        this.f14693b = j10;
    }

    public final int a() {
        return this.f14692a;
    }

    public final long b() {
        return this.f14693b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f14692a == nVar.a() && this.f14693b == nVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f14693b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f14692a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder q10 = a.q("EventRecord{eventType=");
        q10.append(this.f14692a);
        q10.append(", eventTimestamp=");
        q10.append(this.f14693b);
        q10.append("}");
        return q10.toString();
    }
}
