package wi;

import ek.a;
import r2.q;
import rk.l;
import sk.f;
import sk.j;

/* compiled from: MainActivity.kt */
public final /* synthetic */ class h implements q, f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f23430a;

    public h(e eVar) {
        this.f23430a = eVar;
    }

    public final a<?> a() {
        return this.f23430a;
    }

    public final /* synthetic */ void b(Object obj) {
        this.f23430a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q) || !(obj instanceof f)) {
            return false;
        }
        return j.a(this.f23430a, ((f) obj).a());
    }

    public final int hashCode() {
        return this.f23430a.hashCode();
    }
}
