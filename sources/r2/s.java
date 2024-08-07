package r2;

import a3.c;
import android.os.Bundle;
import androidx.lifecycle.f0;
import androidx.lifecycle.v;
import androidx.lifecycle.z;
import ek.g;
import java.util.Map;
import sk.j;
import sk.k;

/* compiled from: SavedStateHandleSupport.kt */
public final class s implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final c f14489a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14490b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f14491c;

    /* renamed from: d  reason: collision with root package name */
    public final g f14492d;

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class a extends k implements rk.a<t> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x f14493a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(x xVar) {
            super(0);
            this.f14493a = xVar;
        }

        public final Object invoke() {
            x xVar = this.f14493a;
            j.f(xVar, "<this>");
            return (t) new f0(xVar, (f0.b) new z()).b(t.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
        }
    }

    public s(c cVar, x xVar) {
        j.f(cVar, "savedStateRegistry");
        j.f(xVar, "viewModelStoreOwner");
        this.f14489a = cVar;
        this.f14492d = j7.a.b0(new a(xVar));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f14491c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((t) this.f14492d.getValue()).f14494d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((v) entry.getValue()).f2834e.a();
            if (!j.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f14490b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f14490b) {
            Bundle a10 = this.f14489a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f14491c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (a10 != null) {
                bundle.putAll(a10);
            }
            this.f14491c = bundle;
            this.f14490b = true;
            t tVar = (t) this.f14492d.getValue();
        }
    }
}
