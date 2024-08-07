package sk;

import n0.l;
import sk.b;
import wk.a;
import wk.e;

/* compiled from: PropertyReference */
public abstract class p extends b implements e {

    /* renamed from: n  reason: collision with root package name */
    public final boolean f22929n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        boolean z10 = true;
        this.f22929n = (i10 & 2) != 2 ? false : z10;
    }

    public final a e() {
        if (this.f22929n) {
            return this;
        }
        a aVar = this.f22916a;
        if (aVar != null) {
            return aVar;
        }
        a a10 = a();
        this.f22916a = a10;
        return a10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (!b().equals(pVar.b()) || !this.f22919d.equals(pVar.f22919d) || !this.f22920e.equals(pVar.f22920e) || !j.a(this.f22917b, pVar.f22917b)) {
                return false;
            }
            return true;
        } else if (obj instanceof e) {
            return obj.equals(e());
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return this.f22920e.hashCode() + l.f(this.f22919d, b().hashCode() * 31, 31);
    }

    public final String toString() {
        a e10 = e();
        if (e10 != this) {
            return e10.toString();
        }
        return android.support.v4.media.a.o(android.support.v4.media.a.q("property "), this.f22919d, " (Kotlin reflection is not available)");
    }

    public p() {
        super(b.a.f22922a, (Class) null, (String) null, (String) null, false);
        this.f22929n = false;
    }
}
