package h5;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import o5.l;

/* compiled from: ActivityFragmentLifecycle */
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Set<i> f10561a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f10562b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10563c;

    public final void a(i iVar) {
        this.f10561a.remove(iVar);
    }

    public final void b() {
        this.f10563c = true;
        Iterator it = l.e(this.f10561a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }

    public final void c() {
        this.f10562b = true;
        Iterator it = l.e(this.f10561a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).b();
        }
    }

    public final void d(i iVar) {
        this.f10561a.add(iVar);
        if (this.f10563c) {
            iVar.a();
        } else if (this.f10562b) {
            iVar.b();
        } else {
            iVar.f();
        }
    }

    public final void e() {
        this.f10562b = false;
        Iterator it = l.e(this.f10561a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).f();
        }
    }
}
