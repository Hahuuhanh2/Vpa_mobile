package ef;

import android.support.v4.media.a;
import cc.b;
import sk.j;

/* compiled from: HttpData.kt */
public final class l {
    @b("sort")

    /* renamed from: a  reason: collision with root package name */
    private o f9471a = null;
    @b("pageNumber")

    /* renamed from: b  reason: collision with root package name */
    private Integer f9472b = null;
    @b("pageSize")

    /* renamed from: c  reason: collision with root package name */
    private Integer f9473c = null;
    @b("offset")

    /* renamed from: d  reason: collision with root package name */
    private Integer f9474d = null;
    @b("paged")

    /* renamed from: e  reason: collision with root package name */
    private Boolean f9475e = null;
    @b("unpaged")

    /* renamed from: f  reason: collision with root package name */
    private Boolean f9476f = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return j.a(this.f9471a, lVar.f9471a) && j.a(this.f9472b, lVar.f9472b) && j.a(this.f9473c, lVar.f9473c) && j.a(this.f9474d, lVar.f9474d) && j.a(this.f9475e, lVar.f9475e) && j.a(this.f9476f, lVar.f9476f);
    }

    public final int hashCode() {
        o oVar = this.f9471a;
        int i10 = 0;
        int hashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        Integer num = this.f9472b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9473c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9474d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.f9475e;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f9476f;
        if (bool2 != null) {
            i10 = bool2.hashCode();
        }
        return hashCode5 + i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("Pageable(sort=");
        q10.append(this.f9471a);
        q10.append(", pageNumber=");
        q10.append(this.f9472b);
        q10.append(", pageSize=");
        q10.append(this.f9473c);
        q10.append(", offset=");
        q10.append(this.f9474d);
        q10.append(", paged=");
        q10.append(this.f9475e);
        q10.append(", unpaged=");
        q10.append(this.f9476f);
        q10.append(')');
        return q10.toString();
    }
}
