package androidx.lifecycle;

import a3.c;
import a3.e;
import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.f0;
import androidx.lifecycle.v;
import java.lang.reflect.Constructor;
import r2.a;
import r2.u;
import r2.v;
import s2.b;
import sk.j;

/* compiled from: SavedStateViewModelFactory.kt */
public final class a0 extends f0.d implements f0.b {

    /* renamed from: a  reason: collision with root package name */
    public Application f2728a;

    /* renamed from: b  reason: collision with root package name */
    public final f0.a f2729b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f2730c;

    /* renamed from: d  reason: collision with root package name */
    public i f2731d;

    /* renamed from: e  reason: collision with root package name */
    public c f2732e;

    @SuppressLint({"LambdaLast"})
    public a0(Application application, e eVar, Bundle bundle) {
        f0.a aVar;
        j.f(eVar, "owner");
        this.f2732e = eVar.q();
        this.f2731d = eVar.B();
        this.f2730c = bundle;
        this.f2728a = application;
        if (application != null) {
            if (f0.a.f2760c == null) {
                f0.a.f2760c = new f0.a(application);
            }
            aVar = f0.a.f2760c;
            j.c(aVar);
        } else {
            aVar = new f0.a((Application) null);
        }
        this.f2729b = aVar;
    }

    public final <T extends v> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final v b(Class cls, b bVar) {
        Constructor<T> constructor;
        String str = (String) bVar.f14601a.get(g0.f2763a);
        if (str != null) {
            if (bVar.f14601a.get(y.f2839a) != null) {
                if (bVar.f14601a.get(y.f2840b) != null) {
                    Application application = (Application) bVar.f14601a.get(e0.f2756a);
                    boolean isAssignableFrom = a.class.isAssignableFrom(cls);
                    if (!isAssignableFrom || application == null) {
                        constructor = u.a(cls, u.f14496b);
                    } else {
                        constructor = u.a(cls, u.f14495a);
                    }
                    if (constructor == null) {
                        return this.f2729b.b(cls, bVar);
                    }
                    if (!isAssignableFrom || application == null) {
                        return u.b(cls, constructor, y.a(bVar));
                    }
                    return u.b(cls, constructor, application, y.a(bVar));
                }
            }
            if (this.f2731d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public final void c(v vVar) {
        if (this.f2731d != null) {
            c cVar = this.f2732e;
            j.c(cVar);
            i iVar = this.f2731d;
            j.c(iVar);
            g.a(vVar, cVar, iVar);
        }
    }

    public final v d(Class cls, String str) {
        Constructor<T> constructor;
        T t10;
        Application application;
        i iVar = this.f2731d;
        if (iVar != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f2728a == null) {
                constructor = u.a(cls, u.f14496b);
            } else {
                constructor = u.a(cls, u.f14495a);
            }
            if (constructor != null) {
                c cVar = this.f2732e;
                j.c(cVar);
                Bundle bundle = this.f2730c;
                Bundle a10 = cVar.a(str);
                Class<? extends Object>[] clsArr = v.f2829f;
                v a11 = v.a.a(a10, bundle);
                x xVar = new x(str, a11);
                xVar.a(iVar, cVar);
                g.b(iVar, cVar);
                if (!isAssignableFrom || (application = this.f2728a) == null) {
                    t10 = u.b(cls, constructor, a11);
                } else {
                    t10 = u.b(cls, constructor, application, a11);
                }
                t10.c(xVar, "androidx.lifecycle.savedstate.vm.tag");
                return t10;
            } else if (this.f2728a != null) {
                return this.f2729b.a(cls);
            } else {
                if (f0.c.f2762a == null) {
                    f0.c.f2762a = new f0.c();
                }
                f0.c cVar2 = f0.c.f2762a;
                j.c(cVar2);
                return cVar2.a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
