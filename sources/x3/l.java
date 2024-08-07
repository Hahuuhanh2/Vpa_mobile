package x3;

import android.support.v4.media.a;
import sk.j;

/* compiled from: WorkSpec.kt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f17010a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17011b;

    public l(String str, int i10) {
        j.f(str, "workSpecId");
        this.f17010a = str;
        this.f17011b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return j.a(this.f17010a, lVar.f17010a) && this.f17011b == lVar.f17011b;
    }

    public final int hashCode() {
        return (this.f17010a.hashCode() * 31) + this.f17011b;
    }

    public final String toString() {
        StringBuilder q10 = a.q("WorkGenerationalId(workSpecId=");
        q10.append(this.f17010a);
        q10.append(", generation=");
        q10.append(this.f17011b);
        q10.append(')');
        return q10.toString();
    }
}
