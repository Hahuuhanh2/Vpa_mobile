package a3;

import a3.c;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import f0.b0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import r2.l;
import sk.j;

/* compiled from: Recreator.kt */
public final class a implements n {

    /* renamed from: a  reason: collision with root package name */
    public final e f79a;

    /* renamed from: a3.a$a  reason: collision with other inner class name */
    /* compiled from: Recreator.kt */
    public static final class C0001a implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashSet f80a = new LinkedHashSet();

        public C0001a(c cVar) {
            j.f(cVar, "registry");
            cVar.c("androidx.savedstate.Restarter", this);
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f80a));
            return bundle;
        }
    }

    public a(e eVar) {
        j.f(eVar, "owner");
        this.f79a = eVar;
    }

    public final void q(l lVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            lVar.B().c(this);
            Bundle a10 = this.f79a.q().a("androidx.savedstate.Restarter");
            if (a10 != null) {
                ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, a.class.getClassLoader()).asSubclass(c.a.class);
                            j.e(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                    j.e(newInstance, "{\n                constr…wInstance()\n            }");
                                    ((c.a) newInstance).a(this.f79a);
                                } catch (Exception e10) {
                                    throw new RuntimeException(b0.r("Failed to instantiate ", next), e10);
                                }
                            } catch (NoSuchMethodException e11) {
                                StringBuilder q10 = android.support.v4.media.a.q("Class ");
                                q10.append(asSubclass.getSimpleName());
                                q10.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(q10.toString(), e11);
                            }
                        } catch (ClassNotFoundException e12) {
                            throw new RuntimeException(b0.s("Class ", next, " wasn't found"), e12);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
