package m3;

import al.g0;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.t;
import androidx.fragment.app.w;
import androidx.fragment.app.z;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import f0.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import r2.l;
import v0.g;
import w1.d0;
import w1.q0;

/* compiled from: FragmentStateAdapter */
public abstract class a extends RecyclerView.e<h> implements i {

    /* renamed from: d  reason: collision with root package name */
    public final i f13090d;

    /* renamed from: e  reason: collision with root package name */
    public final FragmentManager f13091e;

    /* renamed from: f  reason: collision with root package name */
    public final v0.e<Fragment> f13092f = new v0.e<>();

    /* renamed from: n  reason: collision with root package name */
    public final v0.e<Fragment.SavedState> f13093n = new v0.e<>();

    /* renamed from: o  reason: collision with root package name */
    public final v0.e<Integer> f13094o = new v0.e<>();

    /* renamed from: p  reason: collision with root package name */
    public d f13095p;

    /* renamed from: q  reason: collision with root package name */
    public c f13096q = new c();

    /* renamed from: r  reason: collision with root package name */
    public boolean f13097r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f13098s = false;

    /* renamed from: m3.a$a  reason: collision with other inner class name */
    /* compiled from: FragmentStateAdapter */
    public class C0161a implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f13099a;

        public C0161a(h hVar) {
            this.f13099a = hVar;
        }

        public final void q(l lVar, i.a aVar) {
            if (!a.this.f13091e.O()) {
                lVar.B().c(this);
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (d0.g.b((FrameLayout) this.f13099a.f3013a)) {
                    a.this.y(this.f13099a);
                }
            }
        }
    }

    /* compiled from: FragmentStateAdapter */
    public static abstract class b extends RecyclerView.g {
        public b(int i10) {
        }

        public abstract void a();

        public final void b() {
            a();
        }

        public final void c(int i10, int i11) {
            a();
        }

        public final void d(int i10, int i11) {
            a();
        }
    }

    /* compiled from: FragmentStateAdapter */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public CopyOnWriteArrayList f13101a = new CopyOnWriteArrayList();

        public static void b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e.b) it.next()).a();
            }
        }

        public final ArrayList a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f13101a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(e.f13108a);
            }
            return arrayList;
        }
    }

    /* compiled from: FragmentStateAdapter */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public e f13102a;

        /* renamed from: b  reason: collision with root package name */
        public f f13103b;

        /* renamed from: c  reason: collision with root package name */
        public g f13104c;

        /* renamed from: d  reason: collision with root package name */
        public ViewPager2 f13105d;

        /* renamed from: e  reason: collision with root package name */
        public long f13106e = -1;

        public d() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z10) {
            boolean z11;
            int currentItem;
            boolean z12;
            if (!a.this.f13091e.O() && this.f13105d.getScrollState() == 0) {
                if (a.this.f13092f.l() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && a.this.c() != 0 && (currentItem = this.f13105d.getCurrentItem()) < a.this.c()) {
                    long d10 = a.this.d(currentItem);
                    if (d10 != this.f13106e || z10) {
                        Fragment fragment = null;
                        Fragment fragment2 = (Fragment) a.this.f13092f.f((Long) null, d10);
                        if (fragment2 != null && fragment2.C()) {
                            this.f13106e = d10;
                            FragmentManager fragmentManager = a.this.f13091e;
                            fragmentManager.getClass();
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                            ArrayList arrayList = new ArrayList();
                            for (int i10 = 0; i10 < a.this.f13092f.l(); i10++) {
                                long g2 = a.this.f13092f.g(i10);
                                Fragment m10 = a.this.f13092f.m(i10);
                                if (m10.C()) {
                                    if (g2 != this.f13106e) {
                                        aVar.j(m10, i.b.STARTED);
                                        arrayList.add(a.this.f13096q.a());
                                    } else {
                                        fragment = m10;
                                    }
                                    if (g2 == this.f13106e) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (m10.I != z12) {
                                        m10.I = z12;
                                    }
                                }
                            }
                            if (fragment != null) {
                                aVar.j(fragment, i.b.RESUMED);
                                arrayList.add(a.this.f13096q.a());
                            }
                            if (!aVar.f2555a.isEmpty()) {
                                aVar.f();
                                Collections.reverse(arrayList);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a.this.f13096q.getClass();
                                    c.b((List) it.next());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: FragmentStateAdapter */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public static final C0162a f13108a = new C0162a();

        /* renamed from: m3.a$e$a  reason: collision with other inner class name */
        /* compiled from: FragmentStateAdapter */
        public class C0162a implements b {
            public final void a() {
            }
        }

        /* compiled from: FragmentStateAdapter */
        public interface b {
            void a();
        }
    }

    public a(w wVar, o oVar) {
        this.f13091e = wVar;
        this.f13090d = oVar;
        r();
    }

    public static void t(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public final Bundle a() {
        Bundle bundle = new Bundle(this.f13093n.l() + this.f13092f.l());
        for (int i10 = 0; i10 < this.f13092f.l(); i10++) {
            long g2 = this.f13092f.g(i10);
            Fragment fragment = (Fragment) this.f13092f.f((Long) null, g2);
            if (fragment != null && fragment.C()) {
                String i11 = n0.l.i("f#", g2);
                FragmentManager fragmentManager = this.f13091e;
                fragmentManager.getClass();
                if (fragment.f2460y == fragmentManager) {
                    bundle.putString(i11, fragment.f2447e);
                } else {
                    fragmentManager.e0(new IllegalStateException(android.support.v4.media.a.n("Fragment ", fragment, " is not currently in the FragmentManager")));
                    throw null;
                }
            }
        }
        for (int i12 = 0; i12 < this.f13093n.l(); i12++) {
            long g10 = this.f13093n.g(i12);
            if (u(g10)) {
                bundle.putParcelable(n0.l.i("s#", g10), (Parcelable) this.f13093n.f((Long) null, g10));
            }
        }
        return bundle;
    }

    public final void b(Parcelable parcelable) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (this.f13093n.l() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f13092f.l() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String next : bundle.keySet()) {
                    if (!next.startsWith("f#") || next.length() <= 2) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        long parseLong = Long.parseLong(next.substring(2));
                        FragmentManager fragmentManager = this.f13091e;
                        fragmentManager.getClass();
                        String string = bundle.getString(next);
                        Fragment fragment = null;
                        if (string != null) {
                            Fragment B = fragmentManager.B(string);
                            if (B != null) {
                                fragment = B;
                            } else {
                                fragmentManager.e0(new IllegalStateException("Fragment no longer exists for key " + next + ": unique id " + string));
                                throw null;
                            }
                        }
                        this.f13092f.j(fragment, parseLong);
                    } else {
                        if (!next.startsWith("s#") || next.length() <= 2) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (z13) {
                            long parseLong2 = Long.parseLong(next.substring(2));
                            Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(next);
                            if (u(parseLong2)) {
                                this.f13093n.j(savedState, parseLong2);
                            }
                        } else {
                            throw new IllegalArgumentException(b0.r("Unexpected key in savedState: ", next));
                        }
                    }
                }
                if (this.f13092f.l() == 0) {
                    z14 = true;
                }
                if (!z14) {
                    this.f13098s = true;
                    this.f13097r = true;
                    w();
                    Handler handler = new Handler(Looper.getMainLooper());
                    c cVar = new c(this);
                    this.f13090d.a(new d(handler, cVar));
                    handler.postDelayed(cVar, 10000);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public long d(int i10) {
        return (long) i10;
    }

    public final void h(RecyclerView recyclerView) {
        boolean z10;
        if (this.f13095p == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.z(z10);
        d dVar = new d();
        this.f13095p = dVar;
        dVar.f13105d = d.a(recyclerView);
        e eVar = new e(dVar);
        dVar.f13102a = eVar;
        dVar.f13105d.f3593c.f3627a.add(eVar);
        f fVar = new f(dVar);
        dVar.f13103b = fVar;
        q(fVar);
        g gVar = new g(dVar);
        dVar.f13104c = gVar;
        this.f13090d.a(gVar);
    }

    public final void i(RecyclerView.a0 a0Var, int i10) {
        boolean z10;
        Bundle bundle;
        h hVar = (h) a0Var;
        long j10 = hVar.f3017e;
        int id2 = ((FrameLayout) hVar.f3013a).getId();
        Long x10 = x(id2);
        if (!(x10 == null || x10.longValue() == j10)) {
            z(x10.longValue());
            this.f13094o.k(x10.longValue());
        }
        this.f13094o.j(Integer.valueOf(id2), j10);
        long d10 = d(i10);
        v0.e<Fragment> eVar = this.f13092f;
        if (eVar.f15982a) {
            eVar.e();
        }
        if (j7.a.h(eVar.f15983b, eVar.f15985d, d10) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Fragment v2 = v(i10);
            Bundle bundle2 = null;
            Fragment.SavedState savedState = (Fragment.SavedState) this.f13093n.f((Long) null, d10);
            if (v2.f2460y == null) {
                if (!(savedState == null || (bundle = savedState.f2462a) == null)) {
                    bundle2 = bundle;
                }
                v2.f2442b = bundle2;
                this.f13092f.j(v2, d10);
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.g.b((FrameLayout) hVar.f3013a)) {
            y(hVar);
        }
        w();
    }

    public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
        int i11 = h.f13118u;
        FrameLayout frameLayout = new FrameLayout(recyclerView.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        frameLayout.setId(d0.e.a());
        frameLayout.setSaveEnabled(false);
        return new h(frameLayout);
    }

    public final void l(RecyclerView recyclerView) {
        d dVar = this.f13095p;
        dVar.getClass();
        ViewPager2 a10 = d.a(recyclerView);
        a10.f3593c.f3627a.remove(dVar.f13102a);
        a.this.s(dVar.f13103b);
        a.this.f13090d.c(dVar.f13104c);
        dVar.f13105d = null;
        this.f13095p = null;
    }

    public final /* bridge */ /* synthetic */ boolean m(RecyclerView.a0 a0Var) {
        h hVar = (h) a0Var;
        return true;
    }

    public final void n(RecyclerView.a0 a0Var) {
        y((h) a0Var);
        w();
    }

    public final void p(RecyclerView.a0 a0Var) {
        Long x10 = x(((FrameLayout) ((h) a0Var).f3013a).getId());
        if (x10 != null) {
            z(x10.longValue());
            this.f13094o.k(x10.longValue());
        }
    }

    public final boolean u(long j10) {
        if (j10 < 0 || j10 >= ((long) c())) {
            return false;
        }
        return true;
    }

    public abstract Fragment v(int i10);

    public final void w() {
        boolean z10;
        Fragment fragment;
        View view;
        if (this.f13098s && !this.f13091e.O()) {
            v0.d dVar = new v0.d();
            for (int i10 = 0; i10 < this.f13092f.l(); i10++) {
                long g2 = this.f13092f.g(i10);
                if (!u(g2)) {
                    dVar.add(Long.valueOf(g2));
                    this.f13094o.k(g2);
                }
            }
            if (!this.f13097r) {
                this.f13098s = false;
                for (int i11 = 0; i11 < this.f13092f.l(); i11++) {
                    long g10 = this.f13092f.g(i11);
                    v0.e<Integer> eVar = this.f13094o;
                    if (eVar.f15982a) {
                        eVar.e();
                    }
                    boolean z11 = true;
                    if (j7.a.h(eVar.f15983b, eVar.f15985d, g10) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && ((fragment = (Fragment) this.f13092f.f((Long) null, g10)) == null || (view = fragment.L) == null || view.getParent() == null)) {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar.add(Long.valueOf(g10));
                    }
                }
            }
            Iterator it = dVar.iterator();
            while (true) {
                g.a aVar = (g.a) it;
                if (aVar.hasNext()) {
                    z(((Long) aVar.next()).longValue());
                } else {
                    return;
                }
            }
        }
    }

    public final Long x(int i10) {
        Long l10 = null;
        for (int i11 = 0; i11 < this.f13094o.l(); i11++) {
            if (this.f13094o.m(i11).intValue() == i10) {
                if (l10 == null) {
                    l10 = Long.valueOf(this.f13094o.g(i11));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l10;
    }

    public final void y(h hVar) {
        Fragment fragment = (Fragment) this.f13092f.f((Long) null, hVar.f3017e);
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) hVar.f3013a;
            View view = fragment.L;
            if (!fragment.C() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (fragment.C() && view == null) {
                this.f13091e.f2496m.f2705a.add(new t.a(new b(this, fragment, frameLayout), false));
            } else if (!fragment.C() || view.getParent() == null) {
                if (fragment.C()) {
                    t(view, frameLayout);
                } else if (!this.f13091e.O()) {
                    this.f13091e.f2496m.f2705a.add(new t.a(new b(this, fragment, frameLayout), false));
                    c cVar = this.f13096q;
                    cVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = cVar.f13101a.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).getClass();
                        arrayList.add(e.f13108a);
                    }
                    try {
                        if (fragment.I) {
                            fragment.I = false;
                        }
                        FragmentManager fragmentManager = this.f13091e;
                        fragmentManager.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                        aVar.g(0, fragment, "f" + hVar.f3017e, 1);
                        aVar.j(fragment, i.b.STARTED);
                        aVar.f();
                        this.f13095p.b(false);
                    } finally {
                        this.f13096q.getClass();
                        c.b(arrayList);
                    }
                } else if (!this.f13091e.H) {
                    this.f13090d.a(new C0161a(hVar));
                }
            } else if (view.getParent() != frameLayout) {
                t(view, frameLayout);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void z(long j10) {
        ViewParent parent;
        Fragment.SavedState savedState = null;
        Fragment fragment = (Fragment) this.f13092f.f((Long) null, j10);
        if (fragment != null) {
            View view = fragment.L;
            if (!(view == null || (parent = view.getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!u(j10)) {
                this.f13093n.k(j10);
            }
            if (!fragment.C()) {
                this.f13092f.k(j10);
            } else if (this.f13091e.O()) {
                this.f13098s = true;
            } else {
                if (fragment.C() && u(j10)) {
                    c cVar = this.f13096q;
                    cVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = cVar.f13101a.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).getClass();
                        arrayList.add(e.f13108a);
                    }
                    FragmentManager fragmentManager = this.f13091e;
                    a1.c cVar2 = fragmentManager.f2486c;
                    z zVar = (z) ((HashMap) cVar2.f25b).get(fragment.f2447e);
                    if (zVar == null || !zVar.f2721c.equals(fragment)) {
                        fragmentManager.e0(new IllegalStateException(android.support.v4.media.a.n("Fragment ", fragment, " is not currently in the FragmentManager")));
                        throw null;
                    }
                    if (zVar.f2721c.f2440a > -1) {
                        savedState = new Fragment.SavedState(zVar.o());
                    }
                    this.f13096q.getClass();
                    c.b(arrayList);
                    this.f13093n.j(savedState, j10);
                }
                c cVar3 = this.f13096q;
                cVar3.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = cVar3.f13101a.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).getClass();
                    arrayList2.add(e.f13108a);
                }
                try {
                    FragmentManager fragmentManager2 = this.f13091e;
                    fragmentManager2.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager2);
                    aVar.i(fragment);
                    aVar.f();
                    this.f13092f.k(j10);
                } finally {
                    this.f13096q.getClass();
                    c.b(arrayList2);
                }
            }
        }
    }
}
