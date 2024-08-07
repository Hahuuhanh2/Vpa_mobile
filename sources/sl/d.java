package sl;

import android.support.v4.media.a;
import java.io.Serializable;
import nl.f;
import nl.k;
import p3.l0;

/* compiled from: ZoneOffsetTransition */
public final class d implements Comparable<d>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final f f22948a;

    /* renamed from: b  reason: collision with root package name */
    public final k f22949b;

    /* renamed from: c  reason: collision with root package name */
    public final k f22950c;

    public d(f fVar, k kVar, k kVar2) {
        this.f22948a = fVar;
        this.f22949b = kVar;
        this.f22950c = kVar2;
    }

    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        f fVar = this.f22948a;
        nl.d u10 = nl.d.u(fVar.v(this.f22949b), (long) fVar.x().f21767d);
        f fVar2 = dVar.f22948a;
        nl.d u11 = nl.d.u(fVar2.v(dVar.f22949b), (long) fVar2.x().f21767d);
        int x10 = l0.x(u10.f21750a, u11.f21750a);
        if (x10 != 0) {
            return x10;
        }
        return u10.f21751b - u11.f21751b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f22948a.equals(dVar.f22948a) || !this.f22949b.equals(dVar.f22949b) || !this.f22950c.equals(dVar.f22950c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f22948a.hashCode() ^ this.f22949b.f21779b) ^ Integer.rotateLeft(this.f22950c.f21779b, 16);
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder q10 = a.q("Transition[");
        if (this.f22950c.f21779b > this.f22949b.f21779b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str = "Gap";
        } else {
            str = "Overlap";
        }
        q10.append(str);
        q10.append(" at ");
        q10.append(this.f22948a);
        q10.append(this.f22949b);
        q10.append(" to ");
        q10.append(this.f22950c);
        q10.append(']');
        return q10.toString();
    }

    public d(long j10, k kVar, k kVar2) {
        this.f22948a = f.E(j10, 0, kVar);
        this.f22949b = kVar;
        this.f22950c = kVar2;
    }
}
