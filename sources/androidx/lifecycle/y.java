package androidx.lifecycle;

import a3.c;
import a3.e;
import android.os.Bundle;
import androidx.lifecycle.f0;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import r2.s;
import r2.t;
import r2.x;
import sk.j;

/* compiled from: SavedStateHandleSupport.kt */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2839a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f2840b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a f2841c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class a {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class b {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class c {
    }

    public static final v a(s2.b bVar) {
        s sVar;
        Bundle bundle;
        e eVar = (e) bVar.f14601a.get(f2839a);
        if (eVar != null) {
            x xVar = (x) bVar.f14601a.get(f2840b);
            if (xVar != null) {
                Bundle bundle2 = (Bundle) bVar.f14601a.get(f2841c);
                String str = (String) bVar.f14601a.get(g0.f2763a);
                if (str != null) {
                    c.b b10 = eVar.q().b();
                    if (b10 instanceof s) {
                        sVar = (s) b10;
                    } else {
                        sVar = null;
                    }
                    if (sVar != null) {
                        t tVar = (t) new f0(xVar, (f0.b) new z()).b(t.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
                        v vVar = (v) tVar.f14494d.get(str);
                        if (vVar != null) {
                            return vVar;
                        }
                        Class<? extends Object>[] clsArr = v.f2829f;
                        sVar.b();
                        Bundle bundle3 = sVar.f14491c;
                        if (bundle3 != null) {
                            bundle = bundle3.getBundle(str);
                        } else {
                            bundle = null;
                        }
                        Bundle bundle4 = sVar.f14491c;
                        if (bundle4 != null) {
                            bundle4.remove(str);
                        }
                        Bundle bundle5 = sVar.f14491c;
                        boolean z10 = true;
                        if (bundle5 == null || !bundle5.isEmpty()) {
                            z10 = false;
                        }
                        if (z10) {
                            sVar.f14491c = null;
                        }
                        v a10 = v.a.a(bundle, bundle2);
                        tVar.f14494d.put(str, a10);
                        return a10;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final <T extends e & x> void b(T t10) {
        boolean z10;
        j.f(t10, "<this>");
        i.b bVar = t10.B().f2785d;
        if (bVar == i.b.INITIALIZED || bVar == i.b.CREATED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t10.q().b() == null) {
            s sVar = new s(t10.q(), (x) t10);
            t10.q().c("androidx.lifecycle.internal.SavedStateHandlesProvider", sVar);
            t10.B().a(new w(sVar));
        }
    }
}
