package androidx.lifecycle;

import a3.c;
import androidx.lifecycle.i;
import r2.l;
import sk.j;

/* compiled from: SavedStateHandleController.kt */
public final class x implements n {

    /* renamed from: a  reason: collision with root package name */
    public final String f2836a;

    /* renamed from: b  reason: collision with root package name */
    public final v f2837b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2838c;

    public x(String str, v vVar) {
        this.f2836a = str;
        this.f2837b = vVar;
    }

    public final void a(i iVar, c cVar) {
        j.f(cVar, "registry");
        j.f(iVar, "lifecycle");
        if (!this.f2838c) {
            this.f2838c = true;
            iVar.a(this);
            cVar.c(this.f2836a, this.f2837b.f2834e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final void q(l lVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            this.f2838c = false;
            lVar.B().c(this);
        }
    }
}
