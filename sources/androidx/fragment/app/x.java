package androidx.fragment.app;

import androidx.lifecycle.f0;
import java.util.HashMap;
import java.util.Iterator;
import r2.v;
import r2.w;
import s2.b;

/* compiled from: FragmentManagerViewModel */
public final class x extends v {

    /* renamed from: j  reason: collision with root package name */
    public static final a f2712j = new a();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, Fragment> f2713d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, x> f2714e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, w> f2715f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2716g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2717h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2718i = false;

    /* compiled from: FragmentManagerViewModel */
    public class a implements f0.b {
        public final <T extends v> T a(Class<T> cls) {
            return new x(true);
        }

        public final v b(Class cls, b bVar) {
            return a(cls);
        }
    }

    public x(boolean z10) {
        this.f2716g = z10;
    }

    public final void b() {
        if (FragmentManager.J(3)) {
            toString();
        }
        this.f2717h = true;
    }

    public final void d(String str) {
        x xVar = this.f2714e.get(str);
        if (xVar != null) {
            xVar.b();
            this.f2714e.remove(str);
        }
        w wVar = this.f2715f.get(str);
        if (wVar != null) {
            wVar.a();
            this.f2715f.remove(str);
        }
    }

    public final void e(Fragment fragment) {
        boolean z10;
        if (this.f2718i) {
            FragmentManager.J(2);
            return;
        }
        if (this.f2713d.remove(fragment.f2447e) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && FragmentManager.J(2)) {
            fragment.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f2713d.equals(xVar.f2713d) || !this.f2714e.equals(xVar.f2714e) || !this.f2715f.equals(xVar.f2715f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f2714e.hashCode();
        return this.f2715f.hashCode() + ((hashCode + (this.f2713d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f2713d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f2714e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2715f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
