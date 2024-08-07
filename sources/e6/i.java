package e6;

import android.support.v4.media.a;
import e6.o;

/* compiled from: AutoValue_NetworkConnectionInfo */
public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final o.b f9228a;

    /* renamed from: b  reason: collision with root package name */
    public final o.a f9229b;

    public i(o.b bVar, o.a aVar) {
        this.f9228a = bVar;
        this.f9229b = aVar;
    }

    public final o.a a() {
        return this.f9229b;
    }

    public final o.b b() {
        return this.f9228a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f9228a;
        if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
            o.a aVar = this.f9229b;
            if (aVar == null) {
                if (oVar.a() == null) {
                    return true;
                }
            } else if (aVar.equals(oVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        o.b bVar = this.f9228a;
        int i11 = 0;
        if (bVar == null) {
            i10 = 0;
        } else {
            i10 = bVar.hashCode();
        }
        int i12 = (i10 ^ 1000003) * 1000003;
        o.a aVar = this.f9229b;
        if (aVar != null) {
            i11 = aVar.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        StringBuilder q10 = a.q("NetworkConnectionInfo{networkType=");
        q10.append(this.f9228a);
        q10.append(", mobileSubtype=");
        q10.append(this.f9229b);
        q10.append("}");
        return q10.toString();
    }
}
