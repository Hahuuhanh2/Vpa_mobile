package ef;

import android.support.v4.media.a;
import cc.b;
import sk.j;

/* compiled from: HttpData.kt */
public final class o {
    @b("unsorted")

    /* renamed from: a  reason: collision with root package name */
    private Boolean f9490a = null;
    @b("sorted")

    /* renamed from: b  reason: collision with root package name */
    private Boolean f9491b = null;
    @b("empty")

    /* renamed from: c  reason: collision with root package name */
    private Boolean f9492c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return j.a(this.f9490a, oVar.f9490a) && j.a(this.f9491b, oVar.f9491b) && j.a(this.f9492c, oVar.f9492c);
    }

    public final int hashCode() {
        Boolean bool = this.f9490a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f9491b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f9492c;
        if (bool3 != null) {
            i10 = bool3.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("Sort(unsorted=");
        q10.append(this.f9490a);
        q10.append(", sorted=");
        q10.append(this.f9491b);
        q10.append(", empty=");
        q10.append(this.f9492c);
        q10.append(')');
        return q10.toString();
    }
}
