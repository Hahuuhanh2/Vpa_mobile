package a3;

import a3.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.g;
import java.util.Iterator;
import java.util.Map;
import o.b;
import sk.j;

@SuppressLint({"RestrictedApi"})
/* compiled from: SavedStateRegistry.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final o.b<String, b> f82a = new o.b<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f83b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f84c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f85d;

    /* renamed from: e  reason: collision with root package name */
    public a.C0001a f86e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f87f = true;

    /* compiled from: SavedStateRegistry.kt */
    public interface a {
        void a(e eVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (this.f85d) {
            Bundle bundle = this.f84c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.f84c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f84c;
            boolean z10 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            }
            if (!z10) {
                this.f84c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final b b() {
        Map.Entry entry;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f82a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            entry = (Map.Entry) eVar.next();
            j.e(entry, "components");
            bVar = (b) entry.getValue();
        } while (!j.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(String str, b bVar) {
        boolean z10;
        j.f(str, "key");
        j.f(bVar, "provider");
        if (this.f82a.i(str, bVar) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        Class<g.a> cls = g.a.class;
        if (this.f87f) {
            a.C0001a aVar = this.f86e;
            if (aVar == null) {
                aVar = new a.C0001a(this);
            }
            this.f86e = aVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                a.C0001a aVar2 = this.f86e;
                if (aVar2 != null) {
                    aVar2.f80a.add(cls.getName());
                }
            } catch (NoSuchMethodException e10) {
                StringBuilder q10 = android.support.v4.media.a.q("Class ");
                q10.append(cls.getSimpleName());
                q10.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(q10.toString(), e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
