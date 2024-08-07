package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.p;
import androidx.fragment.R$id;
import androidx.fragment.app.Fragment;
import ek.i;
import f0.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
import s1.e;
import sk.j;
import v.f;
import w1.d0;
import w1.q0;

/* compiled from: SpecialEffectsController.kt */
public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f2663a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2664b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2665c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f2666d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2667e;

    /* compiled from: SpecialEffectsController.kt */
    public static final class a extends b {

        /* renamed from: h  reason: collision with root package name */
        public final z f2668h;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(androidx.fragment.app.l0.b.C0024b r3, androidx.fragment.app.l0.b.a r4, androidx.fragment.app.z r5, s1.e r6) {
            /*
                r2 = this;
                java.lang.String r0 = "fragmentStateManager"
                sk.j.f(r5, r0)
                androidx.fragment.app.Fragment r0 = r5.f2721c
                java.lang.String r1 = "fragmentStateManager.fragment"
                sk.j.e(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.f2668h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l0.a.<init>(androidx.fragment.app.l0$b$b, androidx.fragment.app.l0$b$a, androidx.fragment.app.z, s1.e):void");
        }

        public final void b() {
            super.b();
            this.f2668h.k();
        }

        public final void d() {
            boolean z10;
            float f10;
            b.a aVar = this.f2670b;
            if (aVar == b.a.ADDING) {
                Fragment fragment = this.f2668h.f2721c;
                j.e(fragment, "fragmentStateManager.fragment");
                View findFocus = fragment.L.findFocus();
                if (findFocus != null) {
                    fragment.l().f2478m = findFocus;
                    if (FragmentManager.J(2)) {
                        findFocus.toString();
                        fragment.toString();
                    }
                }
                View e02 = this.f2671c.e0();
                if (e02.getParent() == null) {
                    this.f2668h.b();
                    e02.setAlpha(0.0f);
                }
                if (e02.getAlpha() == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && e02.getVisibility() == 0) {
                    e02.setVisibility(4);
                }
                Fragment.d dVar = fragment.O;
                if (dVar == null) {
                    f10 = 1.0f;
                } else {
                    f10 = dVar.f2477l;
                }
                e02.setAlpha(f10);
            } else if (aVar == b.a.REMOVING) {
                Fragment fragment2 = this.f2668h.f2721c;
                j.e(fragment2, "fragmentStateManager.fragment");
                View e03 = fragment2.e0();
                if (FragmentManager.J(2)) {
                    Objects.toString(e03.findFocus());
                    e03.toString();
                    fragment2.toString();
                }
                e03.clearFocus();
            }
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public C0024b f2669a;

        /* renamed from: b  reason: collision with root package name */
        public a f2670b;

        /* renamed from: c  reason: collision with root package name */
        public final Fragment f2671c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f2672d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final LinkedHashSet f2673e = new LinkedHashSet();

        /* renamed from: f  reason: collision with root package name */
        public boolean f2674f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2675g;

        /* compiled from: SpecialEffectsController.kt */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.l0$b$b  reason: collision with other inner class name */
        /* compiled from: SpecialEffectsController.kt */
        public enum C0024b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: androidx.fragment.app.l0$b$b$a */
            /* compiled from: SpecialEffectsController.kt */
            public static final class a {
                public static C0024b a(View view) {
                    boolean z10;
                    C0024b bVar = C0024b.INVISIBLE;
                    if (view.getAlpha() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && view.getVisibility() == 0) {
                        return bVar;
                    }
                    int visibility = view.getVisibility();
                    if (visibility == 0) {
                        return C0024b.VISIBLE;
                    }
                    if (visibility == 4) {
                        return bVar;
                    }
                    if (visibility == 8) {
                        return C0024b.GONE;
                    }
                    throw new IllegalArgumentException(android.support.v4.media.a.m("Unknown visibility ", visibility));
                }
            }

            public final void b(View view) {
                ViewGroup viewGroup;
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        viewGroup = (ViewGroup) parent;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup != null) {
                        if (FragmentManager.J(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                    }
                } else if (ordinal == 1) {
                    if (FragmentManager.J(2)) {
                        view.toString();
                    }
                    view.setVisibility(0);
                } else if (ordinal == 2) {
                    if (FragmentManager.J(2)) {
                        view.toString();
                    }
                    view.setVisibility(8);
                } else if (ordinal == 3) {
                    if (FragmentManager.J(2)) {
                        view.toString();
                    }
                    view.setVisibility(4);
                }
            }
        }

        public b(C0024b bVar, a aVar, Fragment fragment, e eVar) {
            this.f2669a = bVar;
            this.f2670b = aVar;
            this.f2671c = fragment;
            eVar.b(new ea.c(this, 11));
        }

        public final void a() {
            if (!this.f2674f) {
                this.f2674f = true;
                if (this.f2673e.isEmpty()) {
                    b();
                    return;
                }
                LinkedHashSet linkedHashSet = this.f2673e;
                j.f(linkedHashSet, "<this>");
                for (e a10 : new LinkedHashSet(linkedHashSet)) {
                    a10.a();
                }
            }
        }

        public void b() {
            if (!this.f2675g) {
                if (FragmentManager.J(2)) {
                    toString();
                }
                this.f2675g = true;
                Iterator it = this.f2672d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }

        public final void c(C0024b bVar, a aVar) {
            C0024b bVar2 = C0024b.REMOVED;
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (FragmentManager.J(2)) {
                            Objects.toString(this.f2671c);
                            Objects.toString(this.f2669a);
                            Objects.toString(this.f2670b);
                        }
                        this.f2669a = bVar2;
                        this.f2670b = a.REMOVING;
                    }
                } else if (this.f2669a == bVar2) {
                    if (FragmentManager.J(2)) {
                        Objects.toString(this.f2671c);
                        Objects.toString(this.f2670b);
                    }
                    this.f2669a = C0024b.VISIBLE;
                    this.f2670b = a.ADDING;
                }
            } else if (this.f2669a != bVar2) {
                if (FragmentManager.J(2)) {
                    Objects.toString(this.f2671c);
                    Objects.toString(this.f2669a);
                    bVar.toString();
                }
                this.f2669a = bVar;
            }
        }

        public void d() {
        }

        public final String toString() {
            StringBuilder w9 = b0.w("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            w9.append(this.f2669a);
            w9.append(" lifecycleImpact = ");
            w9.append(this.f2670b);
            w9.append(" fragment = ");
            w9.append(this.f2671c);
            w9.append('}');
            return w9.toString();
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2685a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2685a = iArr;
        }
    }

    public l0(ViewGroup viewGroup) {
        j.f(viewGroup, "container");
        this.f2663a = viewGroup;
    }

    public static final l0 f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        j.f(viewGroup, "container");
        j.f(fragmentManager, "fragmentManager");
        j.e(fragmentManager.I(), "fragmentManager.specialEffectsControllerFactory");
        int i10 = R$id.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof l0) {
            return (l0) tag;
        }
        d dVar = new d(viewGroup);
        viewGroup.setTag(i10, dVar);
        return dVar;
    }

    public final void a(b.C0024b bVar, b.a aVar, z zVar) {
        synchronized (this.f2664b) {
            e eVar = new e();
            Fragment fragment = zVar.f2721c;
            j.e(fragment, "fragmentStateManager.fragment");
            b d10 = d(fragment);
            if (d10 != null) {
                d10.c(bVar, aVar);
                return;
            }
            a aVar2 = new a(bVar, aVar, zVar, eVar);
            this.f2664b.add(aVar2);
            aVar2.f2672d.add(new p(22, this, aVar2));
            aVar2.f2672d.add(new f(15, this, aVar2));
            i iVar = i.f20112a;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c() {
        if (!this.f2667e) {
            ViewGroup viewGroup = this.f2663a;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (!d0.g.b(viewGroup)) {
                e();
                this.f2666d = false;
                return;
            }
            synchronized (this.f2664b) {
                if (!this.f2664b.isEmpty()) {
                    ArrayList b12 = fk.p.b1(this.f2665c);
                    this.f2665c.clear();
                    Iterator it = b12.iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        if (FragmentManager.J(2)) {
                            Objects.toString(bVar);
                        }
                        bVar.a();
                        if (!bVar.f2675g) {
                            this.f2665c.add(bVar);
                        }
                    }
                    h();
                    ArrayList b13 = fk.p.b1(this.f2664b);
                    this.f2664b.clear();
                    this.f2665c.addAll(b13);
                    FragmentManager.J(2);
                    Iterator it2 = b13.iterator();
                    while (it2.hasNext()) {
                        ((b) it2.next()).d();
                    }
                    b(b13, this.f2666d);
                    this.f2666d = false;
                    FragmentManager.J(2);
                }
                i iVar = i.f20112a;
            }
        }
    }

    public final b d(Fragment fragment) {
        Object obj;
        boolean z10;
        Iterator it = this.f2664b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            b bVar = (b) obj;
            if (!j.a(bVar.f2671c, fragment) || bVar.f2674f) {
                z10 = false;
                continue;
            } else {
                z10 = true;
                continue;
            }
            if (z10) {
                break;
            }
        }
        return (b) obj;
    }

    public final void e() {
        FragmentManager.J(2);
        ViewGroup viewGroup = this.f2663a;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        boolean b10 = d0.g.b(viewGroup);
        synchronized (this.f2664b) {
            h();
            Iterator it = this.f2664b.iterator();
            while (it.hasNext()) {
                ((b) it.next()).d();
            }
            Iterator it2 = fk.p.b1(this.f2665c).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (FragmentManager.J(2)) {
                    if (!b10) {
                        Objects.toString(this.f2663a);
                    }
                    Objects.toString(bVar);
                }
                bVar.a();
            }
            Iterator it3 = fk.p.b1(this.f2664b).iterator();
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                if (FragmentManager.J(2)) {
                    if (!b10) {
                        Objects.toString(this.f2663a);
                    }
                    Objects.toString(bVar2);
                }
                bVar2.a();
            }
            i iVar = i.f20112a;
        }
    }

    public final void g() {
        Fragment fragment;
        Object obj;
        boolean z10;
        synchronized (this.f2664b) {
            h();
            ArrayList arrayList = this.f2664b;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                fragment = null;
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                b bVar = (b) obj;
                View view = bVar.f2671c.L;
                j.e(view, "operation.fragment.mView");
                b.C0024b a10 = b.C0024b.a.a(view);
                b.C0024b bVar2 = bVar.f2669a;
                b.C0024b bVar3 = b.C0024b.VISIBLE;
                if (bVar2 != bVar3 || a10 == bVar3) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            b bVar4 = (b) obj;
            if (bVar4 != null) {
                fragment = bVar4.f2671c;
            }
            if (fragment != null) {
                Fragment.d dVar = fragment.O;
            }
            this.f2667e = false;
            i iVar = i.f20112a;
        }
    }

    public final void h() {
        b.C0024b bVar;
        Iterator it = this.f2664b.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f2670b == b.a.ADDING) {
                int visibility = bVar2.f2671c.e0().getVisibility();
                if (visibility == 0) {
                    bVar = b.C0024b.VISIBLE;
                } else if (visibility == 4) {
                    bVar = b.C0024b.INVISIBLE;
                } else if (visibility == 8) {
                    bVar = b.C0024b.GONE;
                } else {
                    throw new IllegalArgumentException(android.support.v4.media.a.m("Unknown visibility ", visibility));
                }
                bVar2.c(bVar, b.a.NONE);
            }
        }
    }
}
