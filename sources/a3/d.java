package a3;

import a3.c;
import android.os.Bundle;
import android.support.v4.media.a;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import java.util.Map;
import o.b;
import sk.j;

/* compiled from: SavedStateRegistryController.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f88a;

    /* renamed from: b  reason: collision with root package name */
    public final c f89b = new c();

    /* renamed from: c  reason: collision with root package name */
    public boolean f90c;

    public d(e eVar) {
        this.f88a = eVar;
    }

    public final void a() {
        boolean z10;
        o B = this.f88a.B();
        if (B.f2785d == i.b.INITIALIZED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            B.a(new a(this.f88a));
            c cVar = this.f89b;
            cVar.getClass();
            if (!cVar.f83b) {
                B.a(new b(cVar));
                cVar.f83b = true;
                this.f90c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        if (!this.f90c) {
            a();
        }
        o B = this.f88a.B();
        if (B.f2785d.compareTo(i.b.STARTED) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            c cVar = this.f89b;
            if (!cVar.f83b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!cVar.f85d) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                cVar.f84c = bundle2;
                cVar.f85d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            StringBuilder q10 = a.q("performRestore cannot be called when owner is ");
            q10.append(B.f2785d);
            throw new IllegalStateException(q10.toString().toString());
        }
    }

    public final void c(Bundle bundle) {
        j.f(bundle, "outBundle");
        c cVar = this.f89b;
        cVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = cVar.f84c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b<String, c.b> bVar = cVar.f82a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.f13602c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((c.b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
