package androidx.fragment.app;

import a1.c;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.R$id;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l0;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.f0;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p2.a;
import sk.j;
import t2.a;
import w1.d0;
import w1.q0;

/* compiled from: FragmentStateManager */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final t f2719a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2720b;

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f2721c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2722d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f2723e = -1;

    /* compiled from: FragmentStateManager */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2724a;

        public a(View view) {
            this.f2724a = view;
        }

        public final void onViewAttachedToWindow(View view) {
            this.f2724a.removeOnAttachStateChangeListener(this);
            View view2 = this.f2724a;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.h.c(view2);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public z(t tVar, c cVar, Fragment fragment) {
        this.f2719a = tVar;
        this.f2720b = cVar;
        this.f2721c = fragment;
    }

    public final void a() {
        Bundle bundle;
        if (FragmentManager.J(3)) {
            Objects.toString(this.f2721c);
        }
        Bundle bundle2 = this.f2721c.f2442b;
        if (bundle2 != null) {
            bundle2.getBundle("savedInstanceState");
        }
        Fragment fragment = this.f2721c;
        fragment.A.Q();
        fragment.f2440a = 3;
        fragment.J = false;
        fragment.F();
        if (fragment.J) {
            if (FragmentManager.J(3)) {
                fragment.toString();
            }
            if (fragment.L != null) {
                Bundle bundle3 = fragment.f2442b;
                if (bundle3 != null) {
                    bundle = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle = null;
                }
                SparseArray<Parcelable> sparseArray = fragment.f2444c;
                if (sparseArray != null) {
                    fragment.L.restoreHierarchyState(sparseArray);
                    fragment.f2444c = null;
                }
                fragment.J = false;
                fragment.X(bundle);
                if (!fragment.J) {
                    throw new n0(android.support.v4.media.a.n("Fragment ", fragment, " did not call through to super.onViewStateRestored()"));
                } else if (fragment.L != null) {
                    fragment.V.a(i.a.ON_CREATE);
                }
            }
            fragment.f2442b = null;
            w wVar = fragment.A;
            wVar.F = false;
            wVar.G = false;
            wVar.M.f2718i = false;
            wVar.t(4);
            this.f2719a.a(false);
            return;
        }
        throw new n0(android.support.v4.media.a.n("Fragment ", fragment, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        int i10;
        View view;
        View view2;
        Fragment fragment;
        View view3 = this.f2721c.K;
        Fragment fragment2 = null;
        while (true) {
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R$id.fragment_container_view_tag);
            if (tag instanceof Fragment) {
                fragment = (Fragment) tag;
            } else {
                fragment = null;
            }
            if (fragment != null) {
                fragment2 = fragment;
                break;
            }
            ViewParent parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        Fragment fragment3 = this.f2721c.B;
        if (fragment2 != null && !fragment2.equals(fragment3)) {
            Fragment fragment4 = this.f2721c;
            int i11 = fragment4.D;
            a.c cVar = p2.a.f13907a;
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment4, fragment2, i11);
            p2.a.c(wrongNestedHierarchyViolation);
            a.c a10 = p2.a.a(fragment4);
            if (a10.f13916a.contains(a.C0176a.DETECT_WRONG_NESTED_HIERARCHY) && p2.a.f(a10, fragment4.getClass(), WrongNestedHierarchyViolation.class)) {
                p2.a.b(a10, wrongNestedHierarchyViolation);
            }
        }
        c cVar2 = this.f2720b;
        Fragment fragment5 = this.f2721c;
        cVar2.getClass();
        ViewGroup viewGroup = fragment5.K;
        if (viewGroup != null) {
            int indexOf = ((ArrayList) cVar2.f24a).indexOf(fragment5);
            int i12 = indexOf - 1;
            while (true) {
                if (i12 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= ((ArrayList) cVar2.f24a).size()) {
                            break;
                        }
                        Fragment fragment6 = (Fragment) ((ArrayList) cVar2.f24a).get(indexOf);
                        if (fragment6.K == viewGroup && (view = fragment6.L) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment7 = (Fragment) ((ArrayList) cVar2.f24a).get(i12);
                    if (fragment7.K == viewGroup && (view2 = fragment7.L) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i12--;
                }
            }
            Fragment fragment8 = this.f2721c;
            fragment8.K.addView(fragment8.L, i10);
        }
        i10 = -1;
        Fragment fragment82 = this.f2721c;
        fragment82.K.addView(fragment82.L, i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: androidx.fragment.app.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.J(r0)
            if (r0 == 0) goto L_0x000c
            androidx.fragment.app.Fragment r0 = r6.f2721c
            java.util.Objects.toString(r0)
        L_0x000c:
            androidx.fragment.app.Fragment r0 = r6.f2721c
            androidx.fragment.app.Fragment r1 = r0.f2449n
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r3 = " declared target fragment "
            r4 = 0
            java.lang.String r5 = "Fragment "
            if (r1 == 0) goto L_0x0055
            a1.c r0 = r6.f2720b
            java.lang.String r1 = r1.f2447e
            java.lang.Object r0 = r0.f25b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.z r0 = (androidx.fragment.app.z) r0
            if (r0 == 0) goto L_0x0035
            androidx.fragment.app.Fragment r1 = r6.f2721c
            androidx.fragment.app.Fragment r2 = r1.f2449n
            java.lang.String r2 = r2.f2447e
            r1.f2450o = r2
            r1.f2449n = r4
            r4 = r0
            goto L_0x0083
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r5)
            androidx.fragment.app.Fragment r4 = r6.f2721c
            r1.append(r4)
            r1.append(r3)
            androidx.fragment.app.Fragment r3 = r6.f2721c
            androidx.fragment.app.Fragment r3 = r3.f2449n
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0055:
            java.lang.String r0 = r0.f2450o
            if (r0 == 0) goto L_0x0083
            a1.c r1 = r6.f2720b
            java.lang.Object r1 = r1.f25b
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            r4 = r0
            androidx.fragment.app.z r4 = (androidx.fragment.app.z) r4
            if (r4 == 0) goto L_0x0069
            goto L_0x0083
        L_0x0069:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r5)
            androidx.fragment.app.Fragment r4 = r6.f2721c
            r1.append(r4)
            r1.append(r3)
            androidx.fragment.app.Fragment r3 = r6.f2721c
            java.lang.String r3 = r3.f2450o
            java.lang.String r1 = android.support.v4.media.a.o(r1, r3, r2)
            r0.<init>(r1)
            throw r0
        L_0x0083:
            if (r4 == 0) goto L_0x0088
            r4.k()
        L_0x0088:
            androidx.fragment.app.Fragment r0 = r6.f2721c
            androidx.fragment.app.FragmentManager r1 = r0.f2460y
            androidx.fragment.app.r<?> r2 = r1.f2504u
            r0.f2461z = r2
            androidx.fragment.app.Fragment r1 = r1.f2506w
            r0.B = r1
            androidx.fragment.app.t r0 = r6.f2719a
            r1 = 0
            r0.g(r1)
            androidx.fragment.app.Fragment r0 = r6.f2721c
            java.util.ArrayList<androidx.fragment.app.Fragment$e> r2 = r0.f2443b0
            java.util.Iterator r2 = r2.iterator()
        L_0x00a2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.Fragment$e r3 = (androidx.fragment.app.Fragment.e) r3
            r3.a()
            goto L_0x00a2
        L_0x00b2:
            java.util.ArrayList<androidx.fragment.app.Fragment$e> r2 = r0.f2443b0
            r2.clear()
            androidx.fragment.app.w r2 = r0.A
            androidx.fragment.app.r<?> r3 = r0.f2461z
            androidx.fragment.app.o r4 = r0.j()
            r2.b(r3, r4, r0)
            r0.f2440a = r1
            r0.J = r1
            androidx.fragment.app.r<?> r2 = r0.f2461z
            android.content.Context r2 = r2.f2698c
            r0.I(r2)
            boolean r2 = r0.J
            if (r2 == 0) goto L_0x00fc
            androidx.fragment.app.FragmentManager r2 = r0.f2460y
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.y> r2 = r2.f2497n
            java.util.Iterator r2 = r2.iterator()
        L_0x00d9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00e9
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.y r3 = (androidx.fragment.app.y) r3
            r3.a()
            goto L_0x00d9
        L_0x00e9:
            androidx.fragment.app.w r0 = r0.A
            r0.F = r1
            r0.G = r1
            androidx.fragment.app.x r2 = r0.M
            r2.f2718i = r1
            r0.t(r1)
            androidx.fragment.app.t r0 = r6.f2719a
            r0.b(r1)
            return
        L_0x00fc:
            androidx.fragment.app.n0 r1 = new androidx.fragment.app.n0
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.String r0 = android.support.v4.media.a.n(r5, r0, r2)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.z.c():void");
    }

    public final int d() {
        l0.b.a aVar;
        Object obj;
        int i10;
        boolean z10;
        Fragment fragment = this.f2721c;
        if (fragment.f2460y == null) {
            return fragment.f2440a;
        }
        int i11 = this.f2723e;
        int ordinal = fragment.T.ordinal();
        if (ordinal == 1) {
            i11 = Math.min(i11, 0);
        } else if (ordinal == 2) {
            i11 = Math.min(i11, 1);
        } else if (ordinal == 3) {
            i11 = Math.min(i11, 5);
        } else if (ordinal != 4) {
            i11 = Math.min(i11, -1);
        }
        Fragment fragment2 = this.f2721c;
        if (fragment2.f2455t) {
            if (fragment2.f2456u) {
                i11 = Math.max(this.f2723e, 2);
                View view = this.f2721c.L;
                if (view != null && view.getParent() == null) {
                    i11 = Math.min(i11, 2);
                }
            } else {
                i11 = this.f2723e < 4 ? Math.min(i11, fragment2.f2440a) : Math.min(i11, 1);
            }
        }
        if (!this.f2721c.f2453r) {
            i11 = Math.min(i11, 1);
        }
        Fragment fragment3 = this.f2721c;
        ViewGroup viewGroup = fragment3.K;
        l0.b.a aVar2 = null;
        if (viewGroup != null) {
            l0 f10 = l0.f(viewGroup, fragment3.v());
            f10.getClass();
            Fragment fragment4 = this.f2721c;
            j.e(fragment4, "fragmentStateManager.fragment");
            l0.b d10 = f10.d(fragment4);
            if (d10 != null) {
                aVar = d10.f2670b;
            } else {
                aVar = null;
            }
            Iterator it = f10.f2665c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                l0.b bVar = (l0.b) obj;
                if (!j.a(bVar.f2671c, fragment4) || bVar.f2674f) {
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
            l0.b bVar2 = (l0.b) obj;
            if (bVar2 != null) {
                aVar2 = bVar2.f2670b;
            }
            if (aVar == null) {
                i10 = -1;
            } else {
                i10 = l0.c.f2685a[aVar.ordinal()];
            }
            if (!(i10 == -1 || i10 == 1)) {
                aVar2 = aVar;
            }
        }
        if (aVar2 == l0.b.a.ADDING) {
            i11 = Math.min(i11, 6);
        } else if (aVar2 == l0.b.a.REMOVING) {
            i11 = Math.max(i11, 3);
        } else {
            Fragment fragment5 = this.f2721c;
            if (fragment5.f2454s) {
                if (fragment5.E()) {
                    i11 = Math.min(i11, 1);
                } else {
                    i11 = Math.min(i11, -1);
                }
            }
        }
        Fragment fragment6 = this.f2721c;
        if (fragment6.M && fragment6.f2440a < 5) {
            i11 = Math.min(i11, 4);
        }
        if (FragmentManager.J(2)) {
            Objects.toString(this.f2721c);
        }
        return i11;
    }

    public final void e() {
        Bundle bundle;
        if (FragmentManager.J(3)) {
            Objects.toString(this.f2721c);
        }
        Bundle bundle2 = null;
        Bundle bundle3 = this.f2721c.f2442b;
        if (bundle3 != null) {
            bundle2 = bundle3.getBundle("savedInstanceState");
        }
        Fragment fragment = this.f2721c;
        if (!fragment.R) {
            this.f2719a.h(false);
            Fragment fragment2 = this.f2721c;
            fragment2.A.Q();
            fragment2.f2440a = 1;
            fragment2.J = false;
            fragment2.U.a(new i(fragment2));
            fragment2.J(bundle2);
            fragment2.R = true;
            if (fragment2.J) {
                fragment2.U.f(i.a.ON_CREATE);
                this.f2719a.c(false);
                return;
            }
            throw new n0(android.support.v4.media.a.n("Fragment ", fragment2, " did not call through to super.onCreate()"));
        }
        fragment.f2440a = 1;
        Bundle bundle4 = fragment.f2442b;
        if (bundle4 != null && (bundle = bundle4.getBundle("childFragmentManager")) != null) {
            fragment.A.W(bundle);
            w wVar = fragment.A;
            wVar.F = false;
            wVar.G = false;
            wVar.M.f2718i = false;
            wVar.t(1);
        }
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r11 = this;
            androidx.fragment.app.Fragment r0 = r11.f2721c
            boolean r0 = r0.f2455t
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.J(r0)
            if (r1 == 0) goto L_0x0013
            androidx.fragment.app.Fragment r1 = r11.f2721c
            java.util.Objects.toString(r1)
        L_0x0013:
            androidx.fragment.app.Fragment r1 = r11.f2721c
            android.os.Bundle r1 = r1.f2442b
            java.lang.String r2 = "savedInstanceState"
            r3 = 0
            if (r1 == 0) goto L_0x0021
            android.os.Bundle r1 = r1.getBundle(r2)
            goto L_0x0022
        L_0x0021:
            r1 = r3
        L_0x0022:
            androidx.fragment.app.Fragment r4 = r11.f2721c
            android.view.LayoutInflater r5 = r4.P(r1)
            r4.Q = r5
            androidx.fragment.app.Fragment r4 = r11.f2721c
            android.view.ViewGroup r6 = r4.K
            if (r6 == 0) goto L_0x0032
            goto L_0x00d8
        L_0x0032:
            int r6 = r4.D
            if (r6 == 0) goto L_0x00d7
            r7 = -1
            if (r6 == r7) goto L_0x00bd
            androidx.fragment.app.FragmentManager r4 = r4.f2460y
            androidx.fragment.app.o r4 = r4.f2505v
            android.view.View r4 = r4.z(r6)
            r6 = r4
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            if (r6 != 0) goto L_0x008a
            androidx.fragment.app.Fragment r4 = r11.f2721c
            boolean r7 = r4.f2457v
            if (r7 == 0) goto L_0x004e
            goto L_0x00d8
        L_0x004e:
            android.content.res.Resources r0 = r4.w()     // Catch:{ NotFoundException -> 0x005b }
            androidx.fragment.app.Fragment r1 = r11.f2721c     // Catch:{ NotFoundException -> 0x005b }
            int r1 = r1.D     // Catch:{ NotFoundException -> 0x005b }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x005b }
            goto L_0x005d
        L_0x005b:
            java.lang.String r0 = "unknown"
        L_0x005d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No view found for id 0x"
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            androidx.fragment.app.Fragment r3 = r11.f2721c
            int r3 = r3.D
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r11.f2721c
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x008a:
            boolean r4 = r6 instanceof androidx.fragment.app.FragmentContainerView
            if (r4 != 0) goto L_0x00d8
            androidx.fragment.app.Fragment r4 = r11.f2721c
            p2.a$c r7 = p2.a.f13907a
            java.lang.String r7 = "fragment"
            sk.j.f(r4, r7)
            androidx.fragment.app.strictmode.WrongFragmentContainerViolation r7 = new androidx.fragment.app.strictmode.WrongFragmentContainerViolation
            r7.<init>(r4, r6)
            p2.a.c(r7)
            p2.a$c r8 = p2.a.a(r4)
            java.util.Set<p2.a$a> r9 = r8.f13916a
            p2.a$a r10 = p2.a.C0176a.DETECT_WRONG_FRAGMENT_CONTAINER
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L_0x00d8
            java.lang.Class r4 = r4.getClass()
            java.lang.Class<androidx.fragment.app.strictmode.WrongFragmentContainerViolation> r9 = androidx.fragment.app.strictmode.WrongFragmentContainerViolation.class
            boolean r4 = p2.a.f(r8, r4, r9)
            if (r4 == 0) goto L_0x00d8
            p2.a.b(r8, r7)
            goto L_0x00d8
        L_0x00bd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot create fragment "
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            androidx.fragment.app.Fragment r2 = r11.f2721c
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d7:
            r6 = r3
        L_0x00d8:
            androidx.fragment.app.Fragment r4 = r11.f2721c
            r4.K = r6
            r4.Y(r5, r6, r1)
            androidx.fragment.app.Fragment r4 = r11.f2721c
            android.view.View r4 = r4.L
            r5 = 2
            if (r4 == 0) goto L_0x0197
            boolean r0 = androidx.fragment.app.FragmentManager.J(r0)
            if (r0 == 0) goto L_0x00f1
            androidx.fragment.app.Fragment r0 = r11.f2721c
            java.util.Objects.toString(r0)
        L_0x00f1:
            androidx.fragment.app.Fragment r0 = r11.f2721c
            android.view.View r0 = r0.L
            r4 = 0
            r0.setSaveFromParentEnabled(r4)
            androidx.fragment.app.Fragment r0 = r11.f2721c
            android.view.View r7 = r0.L
            int r8 = androidx.fragment.R$id.fragment_container_view_tag
            r7.setTag(r8, r0)
            if (r6 == 0) goto L_0x0107
            r11.b()
        L_0x0107:
            androidx.fragment.app.Fragment r0 = r11.f2721c
            boolean r6 = r0.F
            if (r6 == 0) goto L_0x0114
            android.view.View r0 = r0.L
            r6 = 8
            r0.setVisibility(r6)
        L_0x0114:
            androidx.fragment.app.Fragment r0 = r11.f2721c
            android.view.View r0 = r0.L
            java.util.WeakHashMap<android.view.View, w1.q0> r6 = w1.d0.f16298a
            boolean r0 = w1.d0.g.b(r0)
            if (r0 == 0) goto L_0x0128
            androidx.fragment.app.Fragment r0 = r11.f2721c
            android.view.View r0 = r0.L
            w1.d0.h.c(r0)
            goto L_0x0134
        L_0x0128:
            androidx.fragment.app.Fragment r0 = r11.f2721c
            android.view.View r0 = r0.L
            androidx.fragment.app.z$a r6 = new androidx.fragment.app.z$a
            r6.<init>(r0)
            r0.addOnAttachStateChangeListener(r6)
        L_0x0134:
            androidx.fragment.app.Fragment r0 = r11.f2721c
            android.os.Bundle r6 = r0.f2442b
            if (r6 == 0) goto L_0x013e
            android.os.Bundle r3 = r6.getBundle(r2)
        L_0x013e:
            android.view.View r2 = r0.L
            r0.W(r2, r3)
            androidx.fragment.app.w r0 = r0.A
            r0.t(r5)
            androidx.fragment.app.t r0 = r11.f2719a
            androidx.fragment.app.Fragment r2 = r11.f2721c
            android.view.View r3 = r2.L
            r0.m(r2, r3, r1, r4)
            androidx.fragment.app.Fragment r0 = r11.f2721c
            android.view.View r0 = r0.L
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r1 = r11.f2721c
            android.view.View r1 = r1.L
            float r1 = r1.getAlpha()
            androidx.fragment.app.Fragment r2 = r11.f2721c
            androidx.fragment.app.Fragment$d r2 = r2.l()
            r2.f2477l = r1
            androidx.fragment.app.Fragment r1 = r11.f2721c
            android.view.ViewGroup r2 = r1.K
            if (r2 == 0) goto L_0x0197
            if (r0 != 0) goto L_0x0197
            android.view.View r0 = r1.L
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L_0x018f
            androidx.fragment.app.Fragment r1 = r11.f2721c
            androidx.fragment.app.Fragment$d r1 = r1.l()
            r1.f2478m = r0
            boolean r1 = androidx.fragment.app.FragmentManager.J(r5)
            if (r1 == 0) goto L_0x018f
            r0.toString()
            androidx.fragment.app.Fragment r0 = r11.f2721c
            java.util.Objects.toString(r0)
        L_0x018f:
            androidx.fragment.app.Fragment r0 = r11.f2721c
            android.view.View r0 = r0.L
            r1 = 0
            r0.setAlpha(r1)
        L_0x0197:
            androidx.fragment.app.Fragment r0 = r11.f2721c
            r0.f2440a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.z.f():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r4 != false) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r8 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.J(r0)
            if (r1 == 0) goto L_0x000c
            androidx.fragment.app.Fragment r1 = r8.f2721c
            java.util.Objects.toString(r1)
        L_0x000c:
            androidx.fragment.app.Fragment r1 = r8.f2721c
            boolean r2 = r1.f2454s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001c
            boolean r1 = r1.E()
            if (r1 != 0) goto L_0x001c
            r1 = r4
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            r2 = 0
            if (r1 == 0) goto L_0x002e
            androidx.fragment.app.Fragment r5 = r8.f2721c
            r5.getClass()
            a1.c r5 = r8.f2720b
            androidx.fragment.app.Fragment r6 = r8.f2721c
            java.lang.String r6 = r6.f2447e
            r5.k(r2, r6)
        L_0x002e:
            if (r1 != 0) goto L_0x0050
            a1.c r5 = r8.f2720b
            java.lang.Object r5 = r5.f27d
            androidx.fragment.app.x r5 = (androidx.fragment.app.x) r5
            androidx.fragment.app.Fragment r6 = r8.f2721c
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r7 = r5.f2713d
            java.lang.String r6 = r6.f2447e
            boolean r6 = r7.containsKey(r6)
            if (r6 != 0) goto L_0x0043
            goto L_0x004a
        L_0x0043:
            boolean r6 = r5.f2716g
            if (r6 == 0) goto L_0x004a
            boolean r5 = r5.f2717h
            goto L_0x004b
        L_0x004a:
            r5 = r4
        L_0x004b:
            if (r5 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r5 = r3
            goto L_0x0051
        L_0x0050:
            r5 = r4
        L_0x0051:
            if (r5 == 0) goto L_0x0103
            androidx.fragment.app.Fragment r5 = r8.f2721c
            androidx.fragment.app.r<?> r5 = r5.f2461z
            boolean r6 = r5 instanceof r2.x
            if (r6 == 0) goto L_0x0064
            a1.c r4 = r8.f2720b
            java.lang.Object r4 = r4.f27d
            androidx.fragment.app.x r4 = (androidx.fragment.app.x) r4
            boolean r4 = r4.f2717h
            goto L_0x0071
        L_0x0064:
            android.content.Context r5 = r5.f2698c
            boolean r6 = r5 instanceof android.app.Activity
            if (r6 == 0) goto L_0x0071
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r5 = r5.isChangingConfigurations()
            r4 = r4 ^ r5
        L_0x0071:
            if (r1 == 0) goto L_0x0079
            androidx.fragment.app.Fragment r1 = r8.f2721c
            r1.getClass()
            goto L_0x007b
        L_0x0079:
            if (r4 == 0) goto L_0x0094
        L_0x007b:
            a1.c r1 = r8.f2720b
            java.lang.Object r1 = r1.f27d
            androidx.fragment.app.x r1 = (androidx.fragment.app.x) r1
            androidx.fragment.app.Fragment r4 = r8.f2721c
            r1.getClass()
            boolean r0 = androidx.fragment.app.FragmentManager.J(r0)
            if (r0 == 0) goto L_0x008f
            java.util.Objects.toString(r4)
        L_0x008f:
            java.lang.String r0 = r4.f2447e
            r1.d(r0)
        L_0x0094:
            androidx.fragment.app.Fragment r0 = r8.f2721c
            androidx.fragment.app.w r1 = r0.A
            r1.k()
            androidx.lifecycle.o r1 = r0.U
            androidx.lifecycle.i$a r4 = androidx.lifecycle.i.a.ON_DESTROY
            r1.f(r4)
            r0.f2440a = r3
            r0.J = r3
            r0.R = r3
            r0.M()
            boolean r1 = r0.J
            if (r1 == 0) goto L_0x00f5
            androidx.fragment.app.t r0 = r8.f2719a
            r0.d(r3)
            a1.c r0 = r8.f2720b
            java.util.ArrayList r0 = r0.f()
            java.util.Iterator r0 = r0.iterator()
        L_0x00be:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e1
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.z r1 = (androidx.fragment.app.z) r1
            if (r1 == 0) goto L_0x00be
            androidx.fragment.app.Fragment r1 = r1.f2721c
            androidx.fragment.app.Fragment r3 = r8.f2721c
            java.lang.String r3 = r3.f2447e
            java.lang.String r4 = r1.f2450o
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00be
            androidx.fragment.app.Fragment r3 = r8.f2721c
            r1.f2449n = r3
            r1.f2450o = r2
            goto L_0x00be
        L_0x00e1:
            androidx.fragment.app.Fragment r0 = r8.f2721c
            java.lang.String r1 = r0.f2450o
            if (r1 == 0) goto L_0x00ef
            a1.c r2 = r8.f2720b
            androidx.fragment.app.Fragment r1 = r2.d(r1)
            r0.f2449n = r1
        L_0x00ef:
            a1.c r0 = r8.f2720b
            r0.j(r8)
            goto L_0x011d
        L_0x00f5:
            androidx.fragment.app.n0 r1 = new androidx.fragment.app.n0
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onDestroy()"
            java.lang.String r0 = android.support.v4.media.a.n(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x0103:
            androidx.fragment.app.Fragment r0 = r8.f2721c
            java.lang.String r0 = r0.f2450o
            if (r0 == 0) goto L_0x0119
            a1.c r1 = r8.f2720b
            androidx.fragment.app.Fragment r0 = r1.d(r0)
            if (r0 == 0) goto L_0x0119
            boolean r1 = r0.H
            if (r1 == 0) goto L_0x0119
            androidx.fragment.app.Fragment r1 = r8.f2721c
            r1.f2449n = r0
        L_0x0119:
            androidx.fragment.app.Fragment r0 = r8.f2721c
            r0.f2440a = r3
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.z.g():void");
    }

    public final void h() {
        boolean z10;
        View view;
        if (FragmentManager.J(3)) {
            Objects.toString(this.f2721c);
        }
        Fragment fragment = this.f2721c;
        ViewGroup viewGroup = fragment.K;
        if (!(viewGroup == null || (view = fragment.L) == null)) {
            viewGroup.removeView(view);
        }
        Fragment fragment2 = this.f2721c;
        fragment2.A.t(1);
        if (fragment2.L != null) {
            i0 i0Var = fragment2.V;
            i0Var.c();
            if (i0Var.f2652e.f2785d.compareTo(i.b.CREATED) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                fragment2.V.a(i.a.ON_DESTROY);
            }
        }
        fragment2.f2440a = 1;
        fragment2.J = false;
        fragment2.N();
        if (fragment2.J) {
            a.b bVar = (a.b) new f0(fragment2.n(), (f0.b) a.b.f14801e).a(a.b.class);
            int i10 = bVar.f14802d.f16011c;
            for (int i11 = 0; i11 < i10; i11++) {
                ((a.C0191a) bVar.f14802d.f16010b[i11]).getClass();
            }
            fragment2.f2458w = false;
            this.f2719a.n(false);
            Fragment fragment3 = this.f2721c;
            fragment3.K = null;
            fragment3.L = null;
            fragment3.V = null;
            fragment3.W.j(null);
            this.f2721c.f2456u = false;
            return;
        }
        throw new n0(android.support.v4.media.a.n("Fragment ", fragment2, " did not call through to super.onDestroyView()"));
    }

    public final void i() {
        if (FragmentManager.J(3)) {
            Objects.toString(this.f2721c);
        }
        Fragment fragment = this.f2721c;
        fragment.f2440a = -1;
        boolean z10 = false;
        fragment.J = false;
        fragment.O();
        fragment.Q = null;
        if (fragment.J) {
            w wVar = fragment.A;
            if (!wVar.H) {
                wVar.k();
                fragment.A = new w();
            }
            this.f2719a.e(false);
            Fragment fragment2 = this.f2721c;
            fragment2.f2440a = -1;
            fragment2.f2461z = null;
            fragment2.B = null;
            fragment2.f2460y = null;
            boolean z11 = true;
            if (fragment2.f2454s && !fragment2.E()) {
                z10 = true;
            }
            if (!z10) {
                x xVar = (x) this.f2720b.f27d;
                if (xVar.f2713d.containsKey(this.f2721c.f2447e) && xVar.f2716g) {
                    z11 = xVar.f2717h;
                }
                if (!z11) {
                    return;
                }
            }
            if (FragmentManager.J(3)) {
                Objects.toString(this.f2721c);
            }
            this.f2721c.A();
            return;
        }
        throw new n0(android.support.v4.media.a.n("Fragment ", fragment, " did not call through to super.onDetach()"));
    }

    public final void j() {
        Bundle bundle;
        Fragment fragment = this.f2721c;
        if (fragment.f2455t && fragment.f2456u && !fragment.f2458w) {
            if (FragmentManager.J(3)) {
                Objects.toString(this.f2721c);
            }
            Bundle bundle2 = this.f2721c.f2442b;
            Bundle bundle3 = null;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            Fragment fragment2 = this.f2721c;
            LayoutInflater P = fragment2.P(bundle);
            fragment2.Q = P;
            fragment2.Y(P, (ViewGroup) null, bundle);
            View view = this.f2721c.L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2721c;
                fragment3.L.setTag(R$id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2721c;
                if (fragment4.F) {
                    fragment4.L.setVisibility(8);
                }
                Fragment fragment5 = this.f2721c;
                Bundle bundle4 = fragment5.f2442b;
                if (bundle4 != null) {
                    bundle3 = bundle4.getBundle("savedInstanceState");
                }
                fragment5.W(fragment5.L, bundle3);
                fragment5.A.t(2);
                t tVar = this.f2719a;
                Fragment fragment6 = this.f2721c;
                tVar.m(fragment6, fragment6.L, bundle, false);
                this.f2721c.f2440a = 2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        l0.b.C0024b bVar;
        l0.b.C0024b bVar2 = l0.b.C0024b.GONE;
        l0.b.a aVar = l0.b.a.NONE;
        l0.b.C0024b bVar3 = l0.b.C0024b.VISIBLE;
        if (!this.f2722d) {
            try {
                this.f2722d = true;
                boolean z10 = false;
                while (true) {
                    int d10 = d();
                    Fragment fragment = this.f2721c;
                    int i10 = fragment.f2440a;
                    if (d10 != i10) {
                        if (d10 <= i10) {
                            switch (i10 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f2721c.f2440a = 1;
                                    break;
                                case 2:
                                    fragment.f2456u = false;
                                    fragment.f2440a = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.J(3)) {
                                        Objects.toString(this.f2721c);
                                    }
                                    this.f2721c.getClass();
                                    Fragment fragment2 = this.f2721c;
                                    if (fragment2.L != null && fragment2.f2444c == null) {
                                        p();
                                    }
                                    Fragment fragment3 = this.f2721c;
                                    if (!(fragment3.L == null || (viewGroup2 = fragment3.K) == null)) {
                                        l0 f10 = l0.f(viewGroup2, fragment3.v());
                                        f10.getClass();
                                        if (FragmentManager.J(2)) {
                                            Objects.toString(this.f2721c);
                                        }
                                        f10.a(l0.b.C0024b.REMOVED, l0.b.a.REMOVING, this);
                                    }
                                    this.f2721c.f2440a = 3;
                                    break;
                                case 4:
                                    r();
                                    break;
                                case 5:
                                    fragment.f2440a = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i10 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.L == null || (viewGroup3 = fragment.K) == null)) {
                                        l0 f11 = l0.f(viewGroup3, fragment.v());
                                        int visibility = this.f2721c.L.getVisibility();
                                        if (visibility == 0) {
                                            bVar = bVar3;
                                        } else if (visibility == 4) {
                                            bVar = l0.b.C0024b.INVISIBLE;
                                        } else if (visibility == 8) {
                                            bVar = bVar2;
                                        } else {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        f11.getClass();
                                        if (FragmentManager.J(2)) {
                                            Objects.toString(this.f2721c);
                                        }
                                        f11.a(bVar, l0.b.a.ADDING, this);
                                    }
                                    this.f2721c.f2440a = 4;
                                    break;
                                case 5:
                                    q();
                                    break;
                                case 6:
                                    fragment.f2440a = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                        z10 = true;
                    } else {
                        if (!z10 && i10 == -1 && fragment.f2454s && !fragment.E()) {
                            this.f2721c.getClass();
                            if (FragmentManager.J(3)) {
                                Objects.toString(this.f2721c);
                            }
                            x xVar = (x) this.f2720b.f27d;
                            Fragment fragment4 = this.f2721c;
                            xVar.getClass();
                            if (FragmentManager.J(3)) {
                                Objects.toString(fragment4);
                            }
                            xVar.d(fragment4.f2447e);
                            this.f2720b.j(this);
                            if (FragmentManager.J(3)) {
                                Objects.toString(this.f2721c);
                            }
                            this.f2721c.A();
                        }
                        Fragment fragment5 = this.f2721c;
                        if (fragment5.P) {
                            if (!(fragment5.L == null || (viewGroup = fragment5.K) == null)) {
                                l0 f12 = l0.f(viewGroup, fragment5.v());
                                if (this.f2721c.F) {
                                    f12.getClass();
                                    if (FragmentManager.J(2)) {
                                        Objects.toString(this.f2721c);
                                    }
                                    f12.a(bVar2, aVar, this);
                                } else {
                                    f12.getClass();
                                    if (FragmentManager.J(2)) {
                                        Objects.toString(this.f2721c);
                                    }
                                    f12.a(bVar3, aVar, this);
                                }
                            }
                            Fragment fragment6 = this.f2721c;
                            FragmentManager fragmentManager = fragment6.f2460y;
                            if (fragmentManager != null && fragment6.f2453r && FragmentManager.K(fragment6)) {
                                fragmentManager.E = true;
                            }
                            Fragment fragment7 = this.f2721c;
                            fragment7.P = false;
                            fragment7.A.n();
                        }
                        this.f2722d = false;
                        return;
                    }
                }
            } catch (Throwable th2) {
                this.f2722d = false;
                throw th2;
            }
        } else if (FragmentManager.J(2)) {
            Objects.toString(this.f2721c);
        }
    }

    public final void l() {
        if (FragmentManager.J(3)) {
            Objects.toString(this.f2721c);
        }
        Fragment fragment = this.f2721c;
        fragment.A.t(5);
        if (fragment.L != null) {
            fragment.V.a(i.a.ON_PAUSE);
        }
        fragment.U.f(i.a.ON_PAUSE);
        fragment.f2440a = 6;
        fragment.J = false;
        fragment.Q();
        if (fragment.J) {
            this.f2719a.f(this.f2721c, false);
            return;
        }
        throw new n0(android.support.v4.media.a.n("Fragment ", fragment, " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader classLoader) {
        Bundle bundle = this.f2721c.f2442b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (this.f2721c.f2442b.getBundle("savedInstanceState") == null) {
                this.f2721c.f2442b.putBundle("savedInstanceState", new Bundle());
            }
            Fragment fragment = this.f2721c;
            fragment.f2444c = fragment.f2442b.getSparseParcelableArray("viewState");
            Fragment fragment2 = this.f2721c;
            fragment2.f2446d = fragment2.f2442b.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) this.f2721c.f2442b.getParcelable("state");
            if (fragmentState != null) {
                Fragment fragment3 = this.f2721c;
                fragment3.f2450o = fragmentState.f2542s;
                fragment3.f2451p = fragmentState.f2543t;
                fragment3.N = fragmentState.f2544u;
            }
            Fragment fragment4 = this.f2721c;
            if (!fragment4.N) {
                fragment4.M = true;
            }
        }
    }

    public final void n() {
        View view;
        boolean z10;
        if (FragmentManager.J(3)) {
            Objects.toString(this.f2721c);
        }
        Fragment fragment = this.f2721c;
        Fragment.d dVar = fragment.O;
        if (dVar == null) {
            view = null;
        } else {
            view = dVar.f2478m;
        }
        if (view != null) {
            if (view != fragment.L) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z10 = false;
                        break;
                    } else if (parent == this.f2721c.L) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            z10 = true;
            if (z10) {
                view.requestFocus();
                if (FragmentManager.J(2)) {
                    view.toString();
                    Objects.toString(this.f2721c);
                    Objects.toString(this.f2721c.L.findFocus());
                }
            }
        }
        this.f2721c.l().f2478m = null;
        Fragment fragment2 = this.f2721c;
        fragment2.A.Q();
        fragment2.A.y(true);
        fragment2.f2440a = 7;
        fragment2.J = false;
        fragment2.S();
        if (fragment2.J) {
            o oVar = fragment2.U;
            i.a aVar = i.a.ON_RESUME;
            oVar.f(aVar);
            if (fragment2.L != null) {
                fragment2.V.f2652e.f(aVar);
            }
            w wVar = fragment2.A;
            wVar.F = false;
            wVar.G = false;
            wVar.M.f2718i = false;
            wVar.t(7);
            this.f2719a.i(this.f2721c, false);
            this.f2720b.k((Bundle) null, this.f2721c.f2447e);
            Fragment fragment3 = this.f2721c;
            fragment3.f2442b = null;
            fragment3.f2444c = null;
            fragment3.f2446d = null;
            return;
        }
        throw new n0(android.support.v4.media.a.n("Fragment ", fragment2, " did not call through to super.onResume()"));
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f2721c;
        if (fragment.f2440a == -1 && (bundle = fragment.f2442b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f2721c));
        if (this.f2721c.f2440a > -1) {
            Bundle bundle3 = new Bundle();
            this.f2721c.T(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f2719a.j(false);
            Bundle bundle4 = new Bundle();
            this.f2721c.Y.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle X = this.f2721c.A.X();
            if (!X.isEmpty()) {
                bundle2.putBundle("childFragmentManager", X);
            }
            if (this.f2721c.L != null) {
                p();
            }
            SparseArray<Parcelable> sparseArray = this.f2721c.f2444c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f2721c.f2446d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f2721c.f2448f;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        if (this.f2721c.L != null) {
            if (FragmentManager.J(2)) {
                Objects.toString(this.f2721c);
                Objects.toString(this.f2721c.L);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f2721c.L.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f2721c.f2444c = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f2721c.V.f2653f.c(bundle);
            if (!bundle.isEmpty()) {
                this.f2721c.f2446d = bundle;
            }
        }
    }

    public final void q() {
        if (FragmentManager.J(3)) {
            Objects.toString(this.f2721c);
        }
        Fragment fragment = this.f2721c;
        fragment.A.Q();
        fragment.A.y(true);
        fragment.f2440a = 5;
        fragment.J = false;
        fragment.U();
        if (fragment.J) {
            o oVar = fragment.U;
            i.a aVar = i.a.ON_START;
            oVar.f(aVar);
            if (fragment.L != null) {
                fragment.V.f2652e.f(aVar);
            }
            w wVar = fragment.A;
            wVar.F = false;
            wVar.G = false;
            wVar.M.f2718i = false;
            wVar.t(5);
            this.f2719a.k(false);
            return;
        }
        throw new n0(android.support.v4.media.a.n("Fragment ", fragment, " did not call through to super.onStart()"));
    }

    public final void r() {
        if (FragmentManager.J(3)) {
            Objects.toString(this.f2721c);
        }
        Fragment fragment = this.f2721c;
        w wVar = fragment.A;
        wVar.G = true;
        wVar.M.f2718i = true;
        wVar.t(4);
        if (fragment.L != null) {
            fragment.V.a(i.a.ON_STOP);
        }
        fragment.U.f(i.a.ON_STOP);
        fragment.f2440a = 4;
        fragment.J = false;
        fragment.V();
        if (fragment.J) {
            this.f2719a.l(false);
            return;
        }
        throw new n0(android.support.v4.media.a.n("Fragment ", fragment, " did not call through to super.onStop()"));
    }

    public z(t tVar, c cVar, ClassLoader classLoader, q qVar, Bundle bundle) {
        this.f2719a = tVar;
        this.f2720b = cVar;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        Fragment a10 = qVar.a(fragmentState.f2531a);
        a10.f2447e = fragmentState.f2532b;
        a10.f2455t = fragmentState.f2533c;
        a10.f2457v = true;
        a10.C = fragmentState.f2534d;
        a10.D = fragmentState.f2535e;
        a10.E = fragmentState.f2536f;
        a10.H = fragmentState.f2537n;
        a10.f2454s = fragmentState.f2538o;
        a10.G = fragmentState.f2539p;
        a10.F = fragmentState.f2540q;
        a10.T = i.b.values()[fragmentState.f2541r];
        a10.f2450o = fragmentState.f2542s;
        a10.f2451p = fragmentState.f2543t;
        a10.N = fragmentState.f2544u;
        this.f2721c = a10;
        a10.f2442b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.g0(bundle2);
        if (FragmentManager.J(2)) {
            Objects.toString(a10);
        }
    }

    public z(t tVar, c cVar, Fragment fragment, Bundle bundle) {
        this.f2719a = tVar;
        this.f2720b = cVar;
        this.f2721c = fragment;
        fragment.f2444c = null;
        fragment.f2446d = null;
        fragment.f2459x = 0;
        fragment.f2456u = false;
        fragment.f2453r = false;
        Fragment fragment2 = fragment.f2449n;
        fragment.f2450o = fragment2 != null ? fragment2.f2447e : null;
        fragment.f2449n = null;
        fragment.f2442b = bundle;
        fragment.f2448f = bundle.getBundle("arguments");
    }
}
