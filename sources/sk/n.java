package sk;

import al.f0;
import sk.b;
import wk.a;
import wk.d;
import wk.e;
import zb.g;

/* compiled from: PropertyReference2 */
public abstract class n extends p implements d {
    public n(int i10) {
        super(b.a.f22922a, g.a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
    }

    public final a a() {
        s.f22932a.getClass();
        return this;
    }

    public final d.a c() {
        if (!this.f22929n) {
            a e10 = e();
            if (e10 != this) {
                return ((d) ((e) e10)).c();
            }
            throw new f0();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o) this).c().call();
    }
}
