package ef;

import android.support.v4.media.a;
import cc.b;
import java.util.ArrayList;
import sk.j;

/* compiled from: HttpData.kt */
public final class n<T> {
    @b("content")

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<T> f9478a;
    @b("pageable")

    /* renamed from: b  reason: collision with root package name */
    private l f9479b;
    @b("totalPages")

    /* renamed from: c  reason: collision with root package name */
    private Integer f9480c;
    @b("totalElements")

    /* renamed from: d  reason: collision with root package name */
    private Integer f9481d;
    @b("last")

    /* renamed from: e  reason: collision with root package name */
    private Boolean f9482e;
    @b("numberOfElements")

    /* renamed from: f  reason: collision with root package name */
    private Integer f9483f;
    @b("first")

    /* renamed from: g  reason: collision with root package name */
    private Boolean f9484g;
    @b("sort")

    /* renamed from: h  reason: collision with root package name */
    private o f9485h;
    @b("size")

    /* renamed from: i  reason: collision with root package name */
    private Integer f9486i;
    @b("number")

    /* renamed from: j  reason: collision with root package name */
    private Integer f9487j;
    @b("page")

    /* renamed from: k  reason: collision with root package name */
    private Integer f9488k;
    @b("empty")

    /* renamed from: l  reason: collision with root package name */
    private Boolean f9489l;

    public n() {
        this((Object) null);
    }

    public n(Object obj) {
        this.f9478a = null;
        this.f9479b = null;
        this.f9480c = null;
        this.f9481d = null;
        this.f9482e = null;
        this.f9483f = null;
        this.f9484g = null;
        this.f9485h = null;
        this.f9486i = null;
        this.f9487j = null;
        this.f9488k = null;
        this.f9489l = null;
    }

    public final ArrayList<T> a() {
        return this.f9478a;
    }

    public final int b() {
        if (this.f9487j == null && this.f9480c == null) {
            return 10;
        }
        Integer num = this.f9486i;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final Integer c() {
        return this.f9481d;
    }

    public final boolean d() {
        int i10;
        int i11;
        Integer num = this.f9487j;
        if (num == null && this.f9480c == null) {
            return true;
        }
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        Integer num2 = this.f9480c;
        if (num2 != null) {
            i11 = num2.intValue();
        } else {
            i11 = 0;
        }
        if (i10 < i11 - 1) {
            return true;
        }
        return false;
    }

    public final int e() {
        int i10;
        Integer num = this.f9487j;
        int i11 = 0;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        Integer num2 = this.f9486i;
        if (num2 != null) {
            i11 = num2.intValue();
        }
        return i12 * i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return j.a(this.f9478a, nVar.f9478a) && j.a(this.f9479b, nVar.f9479b) && j.a(this.f9480c, nVar.f9480c) && j.a(this.f9481d, nVar.f9481d) && j.a(this.f9482e, nVar.f9482e) && j.a(this.f9483f, nVar.f9483f) && j.a(this.f9484g, nVar.f9484g) && j.a(this.f9485h, nVar.f9485h) && j.a(this.f9486i, nVar.f9486i) && j.a(this.f9487j, nVar.f9487j) && j.a(this.f9488k, nVar.f9488k) && j.a(this.f9489l, nVar.f9489l);
    }

    public final int f() {
        Integer num = this.f9487j;
        int i10 = 0;
        if (num == null && this.f9480c == null) {
            return 0;
        }
        if (num != null) {
            i10 = num.intValue();
        }
        return i10 + 1;
    }

    public final void g(Integer num) {
        this.f9481d = num;
    }

    public final int hashCode() {
        ArrayList<T> arrayList = this.f9478a;
        int i10 = 0;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        l lVar = this.f9479b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Integer num = this.f9480c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9481d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f9482e;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.f9483f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.f9484g;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        o oVar = this.f9485h;
        int hashCode8 = (hashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Integer num4 = this.f9486i;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f9487j;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f9488k;
        int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool3 = this.f9489l;
        if (bool3 != null) {
            i10 = bool3.hashCode();
        }
        return hashCode11 + i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("PagingResult(content=");
        q10.append(this.f9478a);
        q10.append(", pageable=");
        q10.append(this.f9479b);
        q10.append(", totalPages=");
        q10.append(this.f9480c);
        q10.append(", totalElements=");
        q10.append(this.f9481d);
        q10.append(", last=");
        q10.append(this.f9482e);
        q10.append(", numberOfElements=");
        q10.append(this.f9483f);
        q10.append(", first=");
        q10.append(this.f9484g);
        q10.append(", sort=");
        q10.append(this.f9485h);
        q10.append(", size=");
        q10.append(this.f9486i);
        q10.append(", number=");
        q10.append(this.f9487j);
        q10.append(", page=");
        q10.append(this.f9488k);
        q10.append(", empty=");
        q10.append(this.f9489l);
        q10.append(')');
        return q10.toString();
    }
}
