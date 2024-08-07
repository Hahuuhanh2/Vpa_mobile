package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import r2.v;
import r2.w;
import s2.a;
import sk.j;

/* compiled from: ViewModelProvider.kt */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final w f2757a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2758b;

    /* renamed from: c  reason: collision with root package name */
    public final s2.a f2759c;

    /* compiled from: ViewModelProvider.kt */
    public static class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public static a f2760c;

        /* renamed from: b  reason: collision with root package name */
        public final Application f2761b;

        public a(Application application) {
            this.f2761b = application;
        }

        public final <T extends v> T a(Class<T> cls) {
            Application application = this.f2761b;
            if (application != null) {
                return c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final v b(Class cls, s2.b bVar) {
            if (this.f2761b != null) {
                return a(cls);
            }
            Application application = (Application) bVar.f14601a.get(e0.f2756a);
            if (application != null) {
                return c(cls, application);
            }
            if (!r2.a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public final <T extends v> T c(Class<T> cls, Application application) {
            if (!r2.a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                T t10 = (v) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                j.e(t10, "{\n                try {\n…          }\n            }");
                return t10;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }
    }

    /* compiled from: ViewModelProvider.kt */
    public interface b {
        <T extends v> T a(Class<T> cls);

        v b(Class cls, s2.b bVar);
    }

    /* compiled from: ViewModelProvider.kt */
    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static c f2762a;

        public <T extends v> T a(Class<T> cls) {
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                j.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return (v) newInstance;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }

        public v b(Class cls, s2.b bVar) {
            return a(cls);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    public static class d {
        public void c(v vVar) {
        }
    }

    public f0(w wVar, b bVar, s2.a aVar) {
        j.f(wVar, "store");
        j.f(bVar, "factory");
        j.f(aVar, "defaultCreationExtras");
        this.f2757a = wVar;
        this.f2758b = bVar;
        this.f2759c = aVar;
    }

    public final <T extends v> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final v b(Class cls, String str) {
        v vVar;
        d dVar;
        j.f(str, "key");
        w wVar = this.f2757a;
        wVar.getClass();
        v vVar2 = (v) wVar.f14500a.get(str);
        if (cls.isInstance(vVar2)) {
            b bVar = this.f2758b;
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                j.c(vVar2);
                dVar.c(vVar2);
            }
            j.d(vVar2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return vVar2;
        }
        s2.b bVar2 = new s2.b(this.f2759c);
        bVar2.f14601a.put(g0.f2763a, str);
        try {
            vVar = this.f2758b.b(cls, bVar2);
        } catch (AbstractMethodError unused) {
            vVar = this.f2758b.a(cls);
        }
        w wVar2 = this.f2757a;
        wVar2.getClass();
        j.f(vVar, "viewModel");
        v vVar3 = (v) wVar2.f14500a.put(str, vVar);
        if (vVar3 != null) {
            vVar3.b();
        }
        return vVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f0(w wVar, b bVar) {
        this(wVar, bVar, a.C0190a.f14602b);
        j.f(wVar, "store");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f0(r2.x r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            sk.j.f(r4, r0)
            r2.w r0 = r4.n()
            boolean r1 = r4 instanceof androidx.lifecycle.f
            if (r1 == 0) goto L_0x0015
            r2 = r4
            androidx.lifecycle.f r2 = (androidx.lifecycle.f) r2
            androidx.lifecycle.f0$b r2 = r2.f()
            goto L_0x0025
        L_0x0015:
            androidx.lifecycle.f0$c r2 = androidx.lifecycle.f0.c.f2762a
            if (r2 != 0) goto L_0x0020
            androidx.lifecycle.f0$c r2 = new androidx.lifecycle.f0$c
            r2.<init>()
            androidx.lifecycle.f0.c.f2762a = r2
        L_0x0020:
            androidx.lifecycle.f0$c r2 = androidx.lifecycle.f0.c.f2762a
            sk.j.c(r2)
        L_0x0025:
            if (r1 == 0) goto L_0x002e
            androidx.lifecycle.f r4 = (androidx.lifecycle.f) r4
            s2.b r4 = r4.g()
            goto L_0x0030
        L_0x002e:
            s2.a$a r4 = s2.a.C0190a.f14602b
        L_0x0030:
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.f0.<init>(r2.x):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f0(r2.x r3, androidx.lifecycle.f0.b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            sk.j.f(r3, r0)
            r2.w r0 = r3.n()
            boolean r1 = r3 instanceof androidx.lifecycle.f
            if (r1 == 0) goto L_0x0014
            androidx.lifecycle.f r3 = (androidx.lifecycle.f) r3
            s2.b r3 = r3.g()
            goto L_0x0016
        L_0x0014:
            s2.a$a r3 = s2.a.C0190a.f14602b
        L_0x0016:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.f0.<init>(r2.x, androidx.lifecycle.f0$b):void");
    }
}
