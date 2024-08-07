package e6;

import android.support.v4.media.a;
import e6.k;

/* compiled from: AutoValue_ClientInfo */
public final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    public final k.a f9204a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9205b;

    public e(k.a aVar, a aVar2) {
        this.f9204a = aVar;
        this.f9205b = aVar2;
    }

    public final a a() {
        return this.f9205b;
    }

    public final k.a b() {
        return this.f9204a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.a aVar = this.f9204a;
        if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
            a aVar2 = this.f9205b;
            if (aVar2 == null) {
                if (kVar.a() == null) {
                    return true;
                }
            } else if (aVar2.equals(kVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        k.a aVar = this.f9204a;
        int i11 = 0;
        if (aVar == null) {
            i10 = 0;
        } else {
            i10 = aVar.hashCode();
        }
        int i12 = (i10 ^ 1000003) * 1000003;
        a aVar2 = this.f9205b;
        if (aVar2 != null) {
            i11 = aVar2.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        StringBuilder q10 = a.q("ClientInfo{clientType=");
        q10.append(this.f9204a);
        q10.append(", androidClientInfo=");
        q10.append(this.f9205b);
        q10.append("}");
        return q10.toString();
    }
}
