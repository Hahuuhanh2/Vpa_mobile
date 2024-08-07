package x3;

import android.support.v4.media.a;
import sk.j;

/* compiled from: SystemIdInfo.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f17003a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17004b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17005c;

    public i(String str, int i10, int i11) {
        j.f(str, "workSpecId");
        this.f17003a = str;
        this.f17004b = i10;
        this.f17005c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return j.a(this.f17003a, iVar.f17003a) && this.f17004b == iVar.f17004b && this.f17005c == iVar.f17005c;
    }

    public final int hashCode() {
        return (((this.f17003a.hashCode() * 31) + this.f17004b) * 31) + this.f17005c;
    }

    public final String toString() {
        StringBuilder q10 = a.q("SystemIdInfo(workSpecId=");
        q10.append(this.f17003a);
        q10.append(", generation=");
        q10.append(this.f17004b);
        q10.append(", systemId=");
        q10.append(this.f17005c);
        q10.append(')');
        return q10.toString();
    }
}
