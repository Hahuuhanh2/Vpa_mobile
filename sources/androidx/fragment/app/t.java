package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f2705a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final FragmentManager f2706b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final FragmentManager.k f2707a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2708b;

        public a(FragmentManager.k kVar, boolean z10) {
            this.f2707a = kVar;
            this.f2708b = z10;
        }
    }

    public t(FragmentManager fragmentManager) {
        this.f2706b = fragmentManager;
    }

    public final void a(boolean z10) {
        Fragment fragment = this.f2706b.f2506w;
        if (fragment != null) {
            fragment.v().f2496m.a(true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.getClass();
            }
        }
    }

    public final void b(boolean z10) {
        FragmentManager fragmentManager = this.f2706b;
        Context context = fragmentManager.f2504u.f2698c;
        Fragment fragment = fragmentManager.f2506w;
        if (fragment != null) {
            fragment.v().f2496m.b(true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.getClass();
            }
        }
    }

    public final void c(boolean z10) {
        Fragment fragment = this.f2706b.f2506w;
        if (fragment != null) {
            fragment.v().f2496m.c(true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.getClass();
            }
        }
    }

    public final void d(boolean z10) {
        Fragment fragment = this.f2706b.f2506w;
        if (fragment != null) {
            fragment.v().f2496m.d(true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.getClass();
            }
        }
    }

    public final void e(boolean z10) {
        Fragment fragment = this.f2706b.f2506w;
        if (fragment != null) {
            fragment.v().f2496m.e(true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.getClass();
            }
        }
    }

    public final void f(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2706b.f2506w;
        if (fragment2 != null) {
            fragment2.v().f2496m.f(fragment, true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.a(fragment);
            }
        }
    }

    public final void g(boolean z10) {
        FragmentManager fragmentManager = this.f2706b;
        Context context = fragmentManager.f2504u.f2698c;
        Fragment fragment = fragmentManager.f2506w;
        if (fragment != null) {
            fragment.v().f2496m.g(true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.getClass();
            }
        }
    }

    public final void h(boolean z10) {
        Fragment fragment = this.f2706b.f2506w;
        if (fragment != null) {
            fragment.v().f2496m.h(true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.getClass();
            }
        }
    }

    public final void i(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2706b.f2506w;
        if (fragment2 != null) {
            fragment2.v().f2496m.i(fragment, true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.b(fragment);
            }
        }
    }

    public final void j(boolean z10) {
        Fragment fragment = this.f2706b.f2506w;
        if (fragment != null) {
            fragment.v().f2496m.j(true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.getClass();
            }
        }
    }

    public final void k(boolean z10) {
        Fragment fragment = this.f2706b.f2506w;
        if (fragment != null) {
            fragment.v().f2496m.k(true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.getClass();
            }
        }
    }

    public final void l(boolean z10) {
        Fragment fragment = this.f2706b.f2506w;
        if (fragment != null) {
            fragment.v().f2496m.l(true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.getClass();
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f2706b.f2506w;
        if (fragment2 != null) {
            fragment2.v().f2496m.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.c(this.f2706b, fragment, view);
            }
        }
    }

    public final void n(boolean z10) {
        Fragment fragment = this.f2706b.f2506w;
        if (fragment != null) {
            fragment.v().f2496m.n(true);
        }
        Iterator<a> it = this.f2705a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2708b) {
                next.f2707a.getClass();
            }
        }
    }
}
