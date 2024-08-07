package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.l0;
import androidx.fragment.app.n;
import fk.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import rk.l;
import s1.e;
import sk.j;
import sk.k;
import v0.g;
import w1.d0;
import w1.i0;
import w1.q0;

/* compiled from: DefaultSpecialEffectsController.kt */
public final class d extends l0 {

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static final class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f2590c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2591d;

        /* renamed from: e  reason: collision with root package name */
        public n.a f2592e;

        public a(l0.b bVar, e eVar, boolean z10) {
            super(bVar, eVar);
            this.f2590c = z10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x006d A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.fragment.app.n.a c(android.content.Context r10) {
            /*
                r9 = this;
                boolean r0 = r9.f2591d
                if (r0 == 0) goto L_0x0008
                androidx.fragment.app.n$a r10 = r9.f2592e
                goto L_0x010b
            L_0x0008:
                androidx.fragment.app.l0$b r0 = r9.f2593a
                androidx.fragment.app.Fragment r1 = r0.f2671c
                androidx.fragment.app.l0$b$b r0 = r0.f2669a
                androidx.fragment.app.l0$b$b r2 = androidx.fragment.app.l0.b.C0024b.VISIBLE
                r3 = 1
                r4 = 0
                if (r0 != r2) goto L_0x0016
                r0 = r3
                goto L_0x0017
            L_0x0016:
                r0 = r4
            L_0x0017:
                boolean r2 = r9.f2590c
                androidx.fragment.app.Fragment$d r5 = r1.O
                if (r5 != 0) goto L_0x001f
                r6 = r4
                goto L_0x0021
            L_0x001f:
                int r6 = r5.f2471f
            L_0x0021:
                if (r2 == 0) goto L_0x0032
                if (r0 == 0) goto L_0x002c
                if (r5 != 0) goto L_0x0029
            L_0x0027:
                r2 = r4
                goto L_0x003f
            L_0x0029:
                int r2 = r5.f2469d
                goto L_0x003f
            L_0x002c:
                if (r5 != 0) goto L_0x002f
                goto L_0x0027
            L_0x002f:
                int r2 = r5.f2470e
                goto L_0x003f
            L_0x0032:
                if (r0 == 0) goto L_0x003a
                if (r5 != 0) goto L_0x0037
                goto L_0x0027
            L_0x0037:
                int r2 = r5.f2467b
                goto L_0x003f
            L_0x003a:
                if (r5 != 0) goto L_0x003d
                goto L_0x0027
            L_0x003d:
                int r2 = r5.f2468c
            L_0x003f:
                r1.f0(r4, r4, r4, r4)
                android.view.ViewGroup r5 = r1.K
                r7 = 0
                if (r5 == 0) goto L_0x0054
                int r8 = androidx.fragment.R$id.visible_removing_fragment_view_tag
                java.lang.Object r5 = r5.getTag(r8)
                if (r5 == 0) goto L_0x0054
                android.view.ViewGroup r5 = r1.K
                r5.setTag(r8, r7)
            L_0x0054:
                android.view.ViewGroup r5 = r1.K
                if (r5 == 0) goto L_0x0060
                android.animation.LayoutTransition r5 = r5.getLayoutTransition()
                if (r5 == 0) goto L_0x0060
                goto L_0x0106
            L_0x0060:
                android.view.animation.Animation r1 = r1.K(r0, r6, r2)
                if (r1 == 0) goto L_0x006d
                androidx.fragment.app.n$a r10 = new androidx.fragment.app.n$a
                r10.<init>((android.view.animation.Animation) r1)
                goto L_0x0107
            L_0x006d:
                if (r2 != 0) goto L_0x00c3
                if (r6 == 0) goto L_0x00c3
                r1 = 4097(0x1001, float:5.741E-42)
                if (r6 == r1) goto L_0x00bb
                r1 = 8194(0x2002, float:1.1482E-41)
                if (r6 == r1) goto L_0x00b3
                r1 = 8197(0x2005, float:1.1486E-41)
                if (r6 == r1) goto L_0x00a1
                r1 = 4099(0x1003, float:5.744E-42)
                if (r6 == r1) goto L_0x0099
                r1 = 4100(0x1004, float:5.745E-42)
                if (r6 == r1) goto L_0x0087
                r0 = -1
                goto L_0x00c2
            L_0x0087:
                if (r0 == 0) goto L_0x0091
                r0 = 16842936(0x10100b8, float:2.3694074E-38)
                int r0 = androidx.fragment.app.n.a(r10, r0)
                goto L_0x00c2
            L_0x0091:
                r0 = 16842937(0x10100b9, float:2.3694076E-38)
                int r0 = androidx.fragment.app.n.a(r10, r0)
                goto L_0x00c2
            L_0x0099:
                if (r0 == 0) goto L_0x009e
                int r0 = androidx.fragment.R$animator.fragment_fade_enter
                goto L_0x00c2
            L_0x009e:
                int r0 = androidx.fragment.R$animator.fragment_fade_exit
                goto L_0x00c2
            L_0x00a1:
                if (r0 == 0) goto L_0x00ab
                r0 = 16842938(0x10100ba, float:2.369408E-38)
                int r0 = androidx.fragment.app.n.a(r10, r0)
                goto L_0x00c2
            L_0x00ab:
                r0 = 16842939(0x10100bb, float:2.3694082E-38)
                int r0 = androidx.fragment.app.n.a(r10, r0)
                goto L_0x00c2
            L_0x00b3:
                if (r0 == 0) goto L_0x00b8
                int r0 = androidx.fragment.R$animator.fragment_close_enter
                goto L_0x00c2
            L_0x00b8:
                int r0 = androidx.fragment.R$animator.fragment_close_exit
                goto L_0x00c2
            L_0x00bb:
                if (r0 == 0) goto L_0x00c0
                int r0 = androidx.fragment.R$animator.fragment_open_enter
                goto L_0x00c2
            L_0x00c0:
                int r0 = androidx.fragment.R$animator.fragment_open_exit
            L_0x00c2:
                r2 = r0
            L_0x00c3:
                if (r2 == 0) goto L_0x0106
                android.content.res.Resources r0 = r10.getResources()
                java.lang.String r0 = r0.getResourceTypeName(r2)
                java.lang.String r1 = "anim"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00e6
                android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r10, r2)     // Catch:{ NotFoundException -> 0x00e4, RuntimeException -> 0x00e6 }
                if (r1 == 0) goto L_0x00e2
                androidx.fragment.app.n$a r5 = new androidx.fragment.app.n$a     // Catch:{ NotFoundException -> 0x00e4, RuntimeException -> 0x00e6 }
                r5.<init>((android.view.animation.Animation) r1)     // Catch:{ NotFoundException -> 0x00e4, RuntimeException -> 0x00e6 }
                r10 = r5
                goto L_0x0107
            L_0x00e2:
                r4 = r3
                goto L_0x00e6
            L_0x00e4:
                r10 = move-exception
                throw r10
            L_0x00e6:
                if (r4 != 0) goto L_0x0106
                android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r10, r2)     // Catch:{ RuntimeException -> 0x00f5 }
                if (r1 == 0) goto L_0x0106
                androidx.fragment.app.n$a r4 = new androidx.fragment.app.n$a     // Catch:{ RuntimeException -> 0x00f5 }
                r4.<init>((android.animation.Animator) r1)     // Catch:{ RuntimeException -> 0x00f5 }
                r10 = r4
                goto L_0x0107
            L_0x00f5:
                r1 = move-exception
                if (r0 != 0) goto L_0x0105
                android.view.animation.Animation r10 = android.view.animation.AnimationUtils.loadAnimation(r10, r2)
                if (r10 == 0) goto L_0x0106
                androidx.fragment.app.n$a r0 = new androidx.fragment.app.n$a
                r0.<init>((android.view.animation.Animation) r10)
                r10 = r0
                goto L_0x0107
            L_0x0105:
                throw r1
            L_0x0106:
                r10 = r7
            L_0x0107:
                r9.f2592e = r10
                r9.f2591d = r3
            L_0x010b:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.a.c(android.content.Context):androidx.fragment.app.n$a");
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final l0.b f2593a;

        /* renamed from: b  reason: collision with root package name */
        public final e f2594b;

        public b(l0.b bVar, e eVar) {
            this.f2593a = bVar;
            this.f2594b = eVar;
        }

        public final void a() {
            l0.b bVar = this.f2593a;
            e eVar = this.f2594b;
            bVar.getClass();
            j.f(eVar, "signal");
            if (bVar.f2673e.remove(eVar) && bVar.f2673e.isEmpty()) {
                bVar.b();
            }
        }

        public final boolean b() {
            l0.b.C0024b bVar;
            View view = this.f2593a.f2671c.L;
            j.e(view, "operation.fragment.mView");
            l0.b.C0024b a10 = l0.b.C0024b.a.a(view);
            l0.b.C0024b bVar2 = this.f2593a.f2669a;
            if (a10 == bVar2 || (a10 != (bVar = l0.b.C0024b.VISIBLE) && bVar2 != bVar)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static final class c extends b {

        /* renamed from: c  reason: collision with root package name */
        public final Object f2595c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2596d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f2597e;

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
            if (r5 == androidx.fragment.app.Fragment.f2439d0) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == androidx.fragment.app.Fragment.f2439d0) goto L_0x0035;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(androidx.fragment.app.l0.b r4, s1.e r5, boolean r6, boolean r7) {
            /*
                r3 = this;
                r3.<init>(r4, r5)
                androidx.fragment.app.l0$b$b r5 = r4.f2669a
                androidx.fragment.app.l0$b$b r0 = androidx.fragment.app.l0.b.C0024b.VISIBLE
                r1 = 0
                if (r5 != r0) goto L_0x0020
                if (r6 == 0) goto L_0x001a
                androidx.fragment.app.Fragment r5 = r4.f2671c
                androidx.fragment.app.Fragment$d r5 = r5.O
                if (r5 != 0) goto L_0x0013
                goto L_0x0035
            L_0x0013:
                java.lang.Object r5 = r5.f2475j
                java.lang.Object r2 = androidx.fragment.app.Fragment.f2439d0
                if (r5 != r2) goto L_0x0036
                goto L_0x0035
            L_0x001a:
                androidx.fragment.app.Fragment r5 = r4.f2671c
                r5.getClass()
                goto L_0x0035
            L_0x0020:
                if (r6 == 0) goto L_0x0030
                androidx.fragment.app.Fragment r5 = r4.f2671c
                androidx.fragment.app.Fragment$d r5 = r5.O
                if (r5 != 0) goto L_0x0029
                goto L_0x0035
            L_0x0029:
                java.lang.Object r5 = r5.f2474i
                java.lang.Object r2 = androidx.fragment.app.Fragment.f2439d0
                if (r5 != r2) goto L_0x0036
                goto L_0x0035
            L_0x0030:
                androidx.fragment.app.Fragment r5 = r4.f2671c
                r5.getClass()
            L_0x0035:
                r5 = r1
            L_0x0036:
                r3.f2595c = r5
                androidx.fragment.app.l0$b$b r5 = r4.f2669a
                if (r5 != r0) goto L_0x0047
                if (r6 == 0) goto L_0x0043
                androidx.fragment.app.Fragment r5 = r4.f2671c
                androidx.fragment.app.Fragment$d r5 = r5.O
                goto L_0x0047
            L_0x0043:
                androidx.fragment.app.Fragment r5 = r4.f2671c
                androidx.fragment.app.Fragment$d r5 = r5.O
            L_0x0047:
                r5 = 1
                r3.f2596d = r5
                if (r7 == 0) goto L_0x0063
                if (r6 == 0) goto L_0x005e
                androidx.fragment.app.Fragment r4 = r4.f2671c
                androidx.fragment.app.Fragment$d r4 = r4.O
                if (r4 != 0) goto L_0x0055
                goto L_0x0063
            L_0x0055:
                java.lang.Object r4 = r4.f2476k
                java.lang.Object r5 = androidx.fragment.app.Fragment.f2439d0
                if (r4 != r5) goto L_0x005c
                goto L_0x0063
            L_0x005c:
                r1 = r4
                goto L_0x0063
            L_0x005e:
                androidx.fragment.app.Fragment r4 = r4.f2671c
                r4.getClass()
            L_0x0063:
                r3.f2597e = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.c.<init>(androidx.fragment.app.l0$b, s1.e, boolean, boolean):void");
        }

        public final h0 c() {
            boolean z10;
            h0 d10 = d(this.f2595c);
            h0 d11 = d(this.f2597e);
            if (d10 == null || d11 == null || d10 == d11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                StringBuilder q10 = android.support.v4.media.a.q("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                q10.append(this.f2593a.f2671c);
                q10.append(" returned Transition ");
                q10.append(this.f2595c);
                q10.append(" which uses a different Transition  type than its shared element transition ");
                q10.append(this.f2597e);
                throw new IllegalArgumentException(q10.toString().toString());
            } else if (d10 == null) {
                return d11;
            } else {
                return d10;
            }
        }

        public final h0 d(Object obj) {
            if (obj == null) {
                return null;
            }
            d0 d0Var = b0.f2583a;
            if (d0Var != null && (obj instanceof Transition)) {
                return d0Var;
            }
            h0 h0Var = b0.f2584b;
            if (h0Var != null && h0Var.e(obj)) {
                return h0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f2593a.f2671c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    /* compiled from: DefaultSpecialEffectsController.kt */
    public static final class C0023d extends k implements l<Map.Entry<String, View>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Collection<String> f2598a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0023d(Collection<String> collection) {
            super(1);
            this.f2598a = collection;
        }

        public final Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            j.f(entry, "entry");
            Collection<String> collection = this.f2598a;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            return Boolean.valueOf(p.L0(collection, d0.i.k((View) entry.getValue())));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ViewGroup viewGroup) {
        super(viewGroup);
        j.f(viewGroup, "container");
    }

    public static void i(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!i0.b(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        i(childAt, arrayList);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void j(v0.b bVar, View view) {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        String k10 = d0.i.k(view);
        if (k10 != null) {
            bVar.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    j(bVar, childAt);
                }
            }
        }
    }

    public static void k(v0.b bVar, Collection collection) {
        Set entrySet = bVar.entrySet();
        j.e(entrySet, "entries");
        C0023d dVar = new C0023d(collection);
        Iterator it = ((g.b) entrySet).iterator();
        while (it.hasNext()) {
            if (!((Boolean) dVar.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.fragment.app.l0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: androidx.fragment.app.l0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: androidx.fragment.app.l0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v80, resolved type: androidx.fragment.app.l0$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x07c3  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0866  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x08f8 A[LOOP:26: B:342:0x08f2->B:344:0x08f8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0917  */
    /* JADX WARNING: Removed duplicated region for block: B:422:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.ArrayList r34, boolean r35) {
        /*
            r33 = this;
            r6 = r33
            r0 = r35
            androidx.fragment.app.l0$b$b r7 = androidx.fragment.app.l0.b.C0024b.GONE
            androidx.fragment.app.l0$b$b r1 = androidx.fragment.app.l0.b.C0024b.VISIBLE
            java.util.Iterator r2 = r34.iterator()
        L_0x000c:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "operation.fragment.mView"
            if (r3 == 0) goto L_0x0032
            java.lang.Object r3 = r2.next()
            r5 = r3
            androidx.fragment.app.l0$b r5 = (androidx.fragment.app.l0.b) r5
            androidx.fragment.app.Fragment r8 = r5.f2671c
            android.view.View r8 = r8.L
            sk.j.e(r8, r4)
            androidx.fragment.app.l0$b$b r8 = androidx.fragment.app.l0.b.C0024b.a.a(r8)
            if (r8 != r1) goto L_0x002e
            androidx.fragment.app.l0$b$b r5 = r5.f2669a
            if (r5 == r1) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 == 0) goto L_0x000c
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            r8 = r3
            androidx.fragment.app.l0$b r8 = (androidx.fragment.app.l0.b) r8
            int r2 = r34.size()
            r3 = r34
            java.util.ListIterator r2 = r3.listIterator(r2)
        L_0x0040:
            boolean r5 = r2.hasPrevious()
            if (r5 == 0) goto L_0x0064
            java.lang.Object r5 = r2.previous()
            r9 = r5
            androidx.fragment.app.l0$b r9 = (androidx.fragment.app.l0.b) r9
            androidx.fragment.app.Fragment r10 = r9.f2671c
            android.view.View r10 = r10.L
            sk.j.e(r10, r4)
            androidx.fragment.app.l0$b$b r10 = androidx.fragment.app.l0.b.C0024b.a.a(r10)
            if (r10 == r1) goto L_0x0060
            androidx.fragment.app.l0$b$b r9 = r9.f2669a
            if (r9 != r1) goto L_0x0060
            r9 = 1
            goto L_0x0061
        L_0x0060:
            r9 = 0
        L_0x0061:
            if (r9 == 0) goto L_0x0040
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            r9 = r5
            androidx.fragment.app.l0$b r9 = (androidx.fragment.app.l0.b) r9
            r2 = 2
            boolean r2 = androidx.fragment.app.FragmentManager.J(r2)
            if (r2 == 0) goto L_0x0075
            java.util.Objects.toString(r8)
            java.util.Objects.toString(r9)
        L_0x0075:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r10 = fk.p.b1(r34)
            java.lang.Object r11 = fk.p.R0(r34)
            androidx.fragment.app.l0$b r11 = (androidx.fragment.app.l0.b) r11
            androidx.fragment.app.Fragment r11 = r11.f2671c
            java.util.Iterator r12 = r34.iterator()
        L_0x008f:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00b2
            java.lang.Object r13 = r12.next()
            androidx.fragment.app.l0$b r13 = (androidx.fragment.app.l0.b) r13
            androidx.fragment.app.Fragment r13 = r13.f2671c
            androidx.fragment.app.Fragment$d r13 = r13.O
            androidx.fragment.app.Fragment$d r14 = r11.O
            int r15 = r14.f2467b
            r13.f2467b = r15
            int r15 = r14.f2468c
            r13.f2468c = r15
            int r15 = r14.f2469d
            r13.f2469d = r15
            int r14 = r14.f2470e
            r13.f2470e = r14
            goto L_0x008f
        L_0x00b2:
            java.util.Iterator r3 = r34.iterator()
        L_0x00b6:
            boolean r11 = r3.hasNext()
            r12 = 3
            if (r11 == 0) goto L_0x0102
            java.lang.Object r11 = r3.next()
            androidx.fragment.app.l0$b r11 = (androidx.fragment.app.l0.b) r11
            s1.e r13 = new s1.e
            r13.<init>()
            r11.d()
            java.util.LinkedHashSet r14 = r11.f2673e
            r14.add(r13)
            androidx.fragment.app.d$a r14 = new androidx.fragment.app.d$a
            r14.<init>(r11, r13, r0)
            r2.add(r14)
            s1.e r13 = new s1.e
            r13.<init>()
            r11.d()
            java.util.LinkedHashSet r14 = r11.f2673e
            r14.add(r13)
            androidx.fragment.app.d$c r14 = new androidx.fragment.app.d$c
            if (r0 == 0) goto L_0x00ec
            if (r11 != r8) goto L_0x00f0
            goto L_0x00ee
        L_0x00ec:
            if (r11 != r9) goto L_0x00f0
        L_0x00ee:
            r15 = 1
            goto L_0x00f1
        L_0x00f0:
            r15 = 0
        L_0x00f1:
            r14.<init>(r11, r13, r0, r15)
            r5.add(r14)
            v.i r13 = new v.i
            r13.<init>(r12, r10, r11, r6)
            java.util.ArrayList r11 = r11.f2672d
            r11.add(r13)
            goto L_0x00b6
        L_0x0102:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r12 = r5.iterator()
        L_0x0110:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0127
            java.lang.Object r13 = r12.next()
            r14 = r13
            androidx.fragment.app.d$c r14 = (androidx.fragment.app.d.c) r14
            boolean r14 = r14.b()
            if (r14 != 0) goto L_0x0110
            r3.add(r13)
            goto L_0x0110
        L_0x0127:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0130:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x014c
            java.lang.Object r13 = r3.next()
            r14 = r13
            androidx.fragment.app.d$c r14 = (androidx.fragment.app.d.c) r14
            androidx.fragment.app.h0 r14 = r14.c()
            if (r14 == 0) goto L_0x0145
            r14 = 1
            goto L_0x0146
        L_0x0145:
            r14 = 0
        L_0x0146:
            if (r14 == 0) goto L_0x0130
            r12.add(r13)
            goto L_0x0130
        L_0x014c:
            java.util.Iterator r3 = r12.iterator()
            r12 = 0
        L_0x0151:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0197
            java.lang.Object r13 = r3.next()
            androidx.fragment.app.d$c r13 = (androidx.fragment.app.d.c) r13
            androidx.fragment.app.h0 r14 = r13.c()
            if (r12 == 0) goto L_0x0168
            if (r14 != r12) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            r12 = 0
            goto L_0x0169
        L_0x0168:
            r12 = 1
        L_0x0169:
            if (r12 == 0) goto L_0x016d
            r12 = r14
            goto L_0x0151
        L_0x016d:
            java.lang.String r0 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
            androidx.fragment.app.l0$b r1 = r13.f2593a
            androidx.fragment.app.Fragment r1 = r1.f2671c
            r0.append(r1)
            java.lang.String r1 = " returned Transition "
            r0.append(r1)
            java.lang.Object r1 = r13.f2595c
            r0.append(r1)
            java.lang.String r1 = " which uses a different Transition type than other Fragments."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0197:
            if (r12 != 0) goto L_0x01bc
            java.util.Iterator r0 = r5.iterator()
        L_0x019d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.d$c r1 = (androidx.fragment.app.d.c) r1
            androidx.fragment.app.l0$b r3 = r1.f2593a
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r11.put(r3, r4)
            r1.a()
            goto L_0x019d
        L_0x01b4:
            r22 = r2
            r25 = r7
            r24 = r10
            goto L_0x06b0
        L_0x01bc:
            android.view.View r3 = new android.view.View
            android.view.ViewGroup r13 = r6.f2663a
            android.content.Context r13 = r13.getContext()
            r3.<init>(r13)
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r22 = r2
            v0.b r2 = new v0.b
            r2.<init>()
            java.util.Iterator r19 = r5.iterator()
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = r1
            r1 = r16
            r23 = r17
            r21 = r18
        L_0x01ef:
            boolean r16 = r19.hasNext()
            if (r16 == 0) goto L_0x04dc
            java.lang.Object r16 = r19.next()
            r24 = r10
            r10 = r16
            androidx.fragment.app.d$c r10 = (androidx.fragment.app.d.c) r10
            java.lang.Object r10 = r10.f2597e
            if (r10 == 0) goto L_0x0206
            r16 = 1
            goto L_0x0208
        L_0x0206:
            r16 = 0
        L_0x0208:
            if (r16 == 0) goto L_0x04c6
            if (r8 == 0) goto L_0x04c6
            if (r9 == 0) goto L_0x04c6
            java.lang.Object r1 = r12.f(r10)
            java.lang.Object r1 = r12.r(r1)
            androidx.fragment.app.Fragment r10 = r9.f2671c
            androidx.fragment.app.Fragment$d r10 = r10.O
            if (r10 == 0) goto L_0x0220
            java.util.ArrayList<java.lang.String> r10 = r10.f2472g
            if (r10 != 0) goto L_0x0225
        L_0x0220:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0225:
            r25 = r7
            androidx.fragment.app.Fragment r7 = r8.f2671c
            androidx.fragment.app.Fragment$d r7 = r7.O
            if (r7 == 0) goto L_0x0231
            java.util.ArrayList<java.lang.String> r7 = r7.f2472g
            if (r7 != 0) goto L_0x0236
        L_0x0231:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0236:
            r26 = r4
            androidx.fragment.app.Fragment r4 = r8.f2671c
            androidx.fragment.app.Fragment$d r4 = r4.O
            if (r4 == 0) goto L_0x0242
            java.util.ArrayList<java.lang.String> r4 = r4.f2473h
            if (r4 != 0) goto L_0x0247
        L_0x0242:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0247:
            r27 = r5
            int r5 = r4.size()
            r16 = 0
            r28 = r3
            r34 = r11
            r11 = r16
        L_0x0255:
            r3 = -1
            if (r11 >= r5) goto L_0x0270
            r16 = r5
            java.lang.Object r5 = r4.get(r11)
            int r5 = r10.indexOf(r5)
            if (r5 == r3) goto L_0x026b
            java.lang.Object r3 = r7.get(r11)
            r10.set(r5, r3)
        L_0x026b:
            int r11 = r11 + 1
            r5 = r16
            goto L_0x0255
        L_0x0270:
            androidx.fragment.app.Fragment r3 = r9.f2671c
            androidx.fragment.app.Fragment$d r3 = r3.O
            if (r3 == 0) goto L_0x027a
            java.util.ArrayList<java.lang.String> r3 = r3.f2473h
            if (r3 != 0) goto L_0x027f
        L_0x027a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x027f:
            if (r0 != 0) goto L_0x0292
            androidx.fragment.app.Fragment r4 = r8.f2671c
            r4.getClass()
            androidx.fragment.app.Fragment r4 = r9.f2671c
            r4.getClass()
            ek.e r4 = new ek.e
            r5 = 0
            r4.<init>(r5, r5)
            goto L_0x02a3
        L_0x0292:
            r4 = 0
            androidx.fragment.app.Fragment r5 = r8.f2671c
            r5.getClass()
            androidx.fragment.app.Fragment r5 = r9.f2671c
            r5.getClass()
            ek.e r5 = new ek.e
            r5.<init>(r4, r4)
            r4 = r5
        L_0x02a3:
            A r5 = r4.f20102a
            i1.b0 r5 = (i1.b0) r5
            B r4 = r4.f20103b
            i1.b0 r4 = (i1.b0) r4
            int r7 = r10.size()
            r11 = 0
        L_0x02b0:
            if (r11 >= r7) goto L_0x02d0
            java.lang.Object r16 = r10.get(r11)
            r17 = r7
            r7 = r16
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r16 = r3.get(r11)
            r18 = r15
            r15 = r16
            java.lang.String r15 = (java.lang.String) r15
            r2.put(r7, r15)
            int r11 = r11 + 1
            r7 = r17
            r15 = r18
            goto L_0x02b0
        L_0x02d0:
            r18 = r15
            r7 = 2
            boolean r7 = androidx.fragment.app.FragmentManager.J(r7)
            if (r7 == 0) goto L_0x02fb
            java.util.Iterator r7 = r3.iterator()
        L_0x02dd:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x02ea
            java.lang.Object r11 = r7.next()
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x02dd
        L_0x02ea:
            java.util.Iterator r7 = r10.iterator()
        L_0x02ee:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x02fb
            java.lang.Object r11 = r7.next()
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x02ee
        L_0x02fb:
            v0.b r7 = new v0.b
            r7.<init>()
            androidx.fragment.app.Fragment r11 = r8.f2671c
            android.view.View r11 = r11.L
            java.lang.String r15 = "firstOut.fragment.mView"
            sk.j.e(r11, r15)
            j(r7, r11)
            v0.g.k(r10, r7)
            if (r5 == 0) goto L_0x035f
            r5 = 2
            boolean r5 = androidx.fragment.app.FragmentManager.J(r5)
            if (r5 == 0) goto L_0x031b
            r8.toString()
        L_0x031b:
            int r5 = r10.size()
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x035c
        L_0x0323:
            int r11 = r5 + -1
            java.lang.Object r5 = r10.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r15 = 0
            java.lang.Object r15 = r7.getOrDefault(r5, r15)
            android.view.View r15 = (android.view.View) r15
            if (r15 != 0) goto L_0x033a
            r2.remove(r5)
            r29 = r1
            goto L_0x0355
        L_0x033a:
            java.util.WeakHashMap<android.view.View, w1.q0> r16 = w1.d0.f16298a
            r29 = r1
            java.lang.String r1 = w1.d0.i.k(r15)
            boolean r1 = sk.j.a(r5, r1)
            if (r1 != 0) goto L_0x0355
            java.lang.Object r1 = r2.remove(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = w1.d0.i.k(r15)
            r2.put(r5, r1)
        L_0x0355:
            if (r11 >= 0) goto L_0x0358
            goto L_0x0368
        L_0x0358:
            r5 = r11
            r1 = r29
            goto L_0x0323
        L_0x035c:
            r29 = r1
            goto L_0x0368
        L_0x035f:
            r29 = r1
            java.util.Set r1 = r7.keySet()
            v0.g.k(r1, r2)
        L_0x0368:
            v0.b r1 = new v0.b
            r1.<init>()
            androidx.fragment.app.Fragment r5 = r9.f2671c
            android.view.View r5 = r5.L
            java.lang.String r11 = "lastIn.fragment.mView"
            sk.j.e(r5, r11)
            j(r1, r5)
            v0.g.k(r3, r1)
            java.util.Collection r5 = r2.values()
            v0.g.k(r5, r1)
            if (r4 == 0) goto L_0x03e1
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.J(r4)
            if (r4 == 0) goto L_0x038f
            r9.toString()
        L_0x038f:
            int r4 = r3.size()
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x03de
        L_0x0397:
            int r5 = r4 + -1
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r11 = 0
            java.lang.Object r11 = r1.getOrDefault(r4, r11)
            android.view.View r11 = (android.view.View) r11
            java.lang.String r15 = "name"
            if (r11 != 0) goto L_0x03b9
            sk.j.e(r4, r15)
            java.lang.String r4 = androidx.fragment.app.b0.a(r2, r4)
            if (r4 == 0) goto L_0x03b6
            r2.remove(r4)
        L_0x03b6:
            r16 = r3
            goto L_0x03d7
        L_0x03b9:
            java.util.WeakHashMap<android.view.View, w1.q0> r16 = w1.d0.f16298a
            r16 = r3
            java.lang.String r3 = w1.d0.i.k(r11)
            boolean r3 = sk.j.a(r4, r3)
            if (r3 != 0) goto L_0x03d7
            sk.j.e(r4, r15)
            java.lang.String r3 = androidx.fragment.app.b0.a(r2, r4)
            if (r3 == 0) goto L_0x03d7
            java.lang.String r4 = w1.d0.i.k(r11)
            r2.put(r3, r4)
        L_0x03d7:
            if (r5 >= 0) goto L_0x03da
            goto L_0x03fd
        L_0x03da:
            r4 = r5
            r3 = r16
            goto L_0x0397
        L_0x03de:
            r16 = r3
            goto L_0x03fd
        L_0x03e1:
            r16 = r3
            androidx.fragment.app.d0 r3 = androidx.fragment.app.b0.f2583a
            int r3 = r2.f16007c
            r4 = -1
            int r3 = r3 + r4
        L_0x03e9:
            if (r4 >= r3) goto L_0x03fd
            java.lang.Object r5 = r2.m(r3)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r1.containsKey(r5)
            if (r5 != 0) goto L_0x03fa
            r2.k(r3)
        L_0x03fa:
            int r3 = r3 + -1
            goto L_0x03e9
        L_0x03fd:
            java.util.Set r3 = r2.keySet()
            java.lang.String r4 = "sharedElementNameMapping.keys"
            sk.j.e(r3, r4)
            k(r7, r3)
            java.util.Collection r3 = r2.values()
            java.lang.String r4 = "sharedElementNameMapping.values"
            sk.j.e(r3, r4)
            k(r1, r3)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0432
            r14.clear()
            r13.clear()
            r1 = 0
            r11 = r34
            r15 = r18
            r10 = r24
            r7 = r25
            r4 = r26
            r5 = r27
            r3 = r28
            goto L_0x01ef
        L_0x0432:
            androidx.fragment.app.Fragment r3 = r9.f2671c
            androidx.fragment.app.Fragment r4 = r8.f2671c
            androidx.fragment.app.d0 r5 = androidx.fragment.app.b0.f2583a
            java.lang.String r5 = "inFragment"
            sk.j.f(r3, r5)
            java.lang.String r3 = "outFragment"
            sk.j.f(r4, r3)
            android.view.ViewGroup r3 = r6.f2663a
            androidx.fragment.app.b r4 = new androidx.fragment.app.b
            r4.<init>(r9, r8, r0, r1)
            w1.t.a(r3, r4)
            java.util.Collection r3 = r7.values()
            r14.addAll(r3)
            boolean r3 = r10.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x0471
            r3 = 0
            java.lang.Object r3 = r10.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            java.lang.Object r3 = r7.getOrDefault(r3, r4)
            android.view.View r3 = (android.view.View) r3
            r4 = r29
            r12.m(r3, r4)
            r23 = r3
            goto L_0x0473
        L_0x0471:
            r4 = r29
        L_0x0473:
            java.util.Collection r3 = r1.values()
            r13.addAll(r3)
            boolean r3 = r16.isEmpty()
            r5 = 1
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x04a4
            r3 = 0
            r7 = r16
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r7 = 0
            java.lang.Object r1 = r1.getOrDefault(r3, r7)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x04a4
            android.view.ViewGroup r3 = r6.f2663a
            w.o r7 = new w.o
            r10 = 3
            r11 = r18
            r7.<init>(r10, r12, r1, r11)
            w1.t.a(r3, r7)
            r21 = r5
            goto L_0x04a6
        L_0x04a4:
            r11 = r18
        L_0x04a6:
            r3 = r28
            r12.p(r4, r3, r14)
            r15 = 0
            r16 = 0
            r5 = r13
            r13 = r12
            r7 = r14
            r14 = r4
            r10 = r11
            r17 = r4
            r18 = r5
            r13.l(r14, r15, r16, r17, r18)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r11 = r34
            r11.put(r8, r1)
            r11.put(r9, r1)
            r1 = r4
            goto L_0x04cf
        L_0x04c6:
            r26 = r4
            r27 = r5
            r25 = r7
            r5 = r13
            r7 = r14
            r10 = r15
        L_0x04cf:
            r13 = r5
            r14 = r7
            r15 = r10
            r10 = r24
            r7 = r25
            r4 = r26
            r5 = r27
            goto L_0x01ef
        L_0x04dc:
            r26 = r4
            r27 = r5
            r25 = r7
            r24 = r10
            r5 = r13
            r7 = r14
            r10 = r15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r27.iterator()
            r13 = 0
            r14 = 0
            r15 = r13
        L_0x04f3:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x061d
            java.lang.Object r13 = r4.next()
            androidx.fragment.app.d$c r13 = (androidx.fragment.app.d.c) r13
            boolean r16 = r13.b()
            if (r16 == 0) goto L_0x0514
            r34 = r4
            androidx.fragment.app.l0$b r4 = r13.f2593a
            r35 = r14
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r11.put(r4, r14)
            r13.a()
            goto L_0x0537
        L_0x0514:
            r34 = r4
            r35 = r14
            java.lang.Object r4 = r13.f2595c
            java.lang.Object r4 = r12.f(r4)
            androidx.fragment.app.l0$b r14 = r13.f2593a
            if (r1 == 0) goto L_0x0529
            if (r14 == r8) goto L_0x0526
            if (r14 != r9) goto L_0x0529
        L_0x0526:
            r16 = 1
            goto L_0x052b
        L_0x0529:
            r16 = 0
        L_0x052b:
            if (r4 != 0) goto L_0x054b
            if (r16 != 0) goto L_0x0537
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r11.put(r14, r4)
            r13.a()
        L_0x0537:
            r19 = r2
            r29 = r3
            r32 = r5
            r31 = r7
            r28 = r9
            r14 = r20
            r2 = r23
            r30 = r26
            r3 = r35
            goto L_0x0608
        L_0x054b:
            r19 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r17 = r13
            androidx.fragment.app.Fragment r13 = r14.f2671c
            android.view.View r13 = r13.L
            r28 = r9
            r9 = r26
            sk.j.e(r13, r9)
            i(r13, r2)
            if (r16 == 0) goto L_0x0575
            if (r14 != r8) goto L_0x056e
            java.util.Set r13 = fk.p.d1(r7)
            r2.removeAll(r13)
            goto L_0x0575
        L_0x056e:
            java.util.Set r13 = fk.p.d1(r5)
            r2.removeAll(r13)
        L_0x0575:
            boolean r13 = r2.isEmpty()
            if (r13 == 0) goto L_0x058d
            r12.a(r3, r4)
            r29 = r3
            r32 = r5
            r31 = r7
            r30 = r9
            r7 = r14
            r5 = r15
            r3 = r17
            r9 = r35
            goto L_0x05dd
        L_0x058d:
            r12.b(r4, r2)
            r18 = 0
            r26 = 0
            r29 = r3
            r3 = r17
            r13 = r12
            r31 = r7
            r30 = r9
            r7 = r14
            r9 = r35
            r14 = r4
            r32 = r5
            r5 = r15
            r15 = r4
            r16 = r2
            r17 = r18
            r18 = r26
            r13.l(r14, r15, r16, r17, r18)
            androidx.fragment.app.l0$b$b r13 = r7.f2669a
            r14 = r25
            if (r13 != r14) goto L_0x05db
            r13 = r24
            r13.remove(r7)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r2)
            androidx.fragment.app.Fragment r13 = r7.f2671c
            android.view.View r13 = r13.L
            r15.remove(r13)
            androidx.fragment.app.Fragment r13 = r7.f2671c
            android.view.View r13 = r13.L
            r12.k(r4, r13, r15)
            android.view.ViewGroup r13 = r6.f2663a
            d.h r15 = new d.h
            r25 = r14
            r14 = 14
            r15.<init>(r2, r14)
            w1.t.a(r13, r15)
            goto L_0x05dd
        L_0x05db:
            r25 = r14
        L_0x05dd:
            androidx.fragment.app.l0$b$b r13 = r7.f2669a
            r14 = r20
            if (r13 != r14) goto L_0x05ee
            r0.addAll(r2)
            if (r21 == 0) goto L_0x05eb
            r12.n(r4, r10)
        L_0x05eb:
            r2 = r23
            goto L_0x05f3
        L_0x05ee:
            r2 = r23
            r12.m(r2, r4)
        L_0x05f3:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r11.put(r7, r13)
            boolean r3 = r3.f2596d
            if (r3 == 0) goto L_0x0603
            java.lang.Object r3 = r12.j(r5, r4)
            r15 = r3
            r3 = r9
            goto L_0x0608
        L_0x0603:
            java.lang.Object r3 = r12.j(r9, r4)
            r15 = r5
        L_0x0608:
            r4 = r34
            r23 = r2
            r20 = r14
            r2 = r19
            r9 = r28
            r26 = r30
            r7 = r31
            r5 = r32
            r14 = r3
            r3 = r29
            goto L_0x04f3
        L_0x061d:
            r19 = r2
            r32 = r5
            r31 = r7
            r28 = r9
            r9 = r14
            r5 = r15
            java.lang.Object r2 = r12.i(r5, r9, r1)
            if (r2 != 0) goto L_0x0631
            r9 = r28
            goto L_0x06b0
        L_0x0631:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r27.iterator()
        L_0x063a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0651
            java.lang.Object r5 = r4.next()
            r7 = r5
            androidx.fragment.app.d$c r7 = (androidx.fragment.app.d.c) r7
            boolean r7 = r7.b()
            if (r7 != 0) goto L_0x063a
            r3.add(r5)
            goto L_0x063a
        L_0x0651:
            java.util.Iterator r3 = r3.iterator()
        L_0x0655:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x06a4
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.d$c r4 = (androidx.fragment.app.d.c) r4
            java.lang.Object r5 = r4.f2595c
            androidx.fragment.app.l0$b r7 = r4.f2593a
            r9 = r28
            if (r1 == 0) goto L_0x066f
            if (r7 == r8) goto L_0x066d
            if (r7 != r9) goto L_0x066f
        L_0x066d:
            r10 = 1
            goto L_0x0670
        L_0x066f:
            r10 = 0
        L_0x0670:
            if (r5 != 0) goto L_0x0674
            if (r10 == 0) goto L_0x06a1
        L_0x0674:
            android.view.ViewGroup r5 = r6.f2663a
            java.util.WeakHashMap<android.view.View, w1.q0> r10 = w1.d0.f16298a
            boolean r5 = w1.d0.g.c(r5)
            if (r5 != 0) goto L_0x0691
            r5 = 2
            boolean r5 = androidx.fragment.app.FragmentManager.J(r5)
            if (r5 == 0) goto L_0x068d
            android.view.ViewGroup r5 = r6.f2663a
            java.util.Objects.toString(r5)
            java.util.Objects.toString(r7)
        L_0x068d:
            r4.a()
            goto L_0x06a1
        L_0x0691:
            androidx.fragment.app.l0$b r5 = r4.f2593a
            androidx.fragment.app.Fragment r5 = r5.f2671c
            s1.e r5 = r4.f2594b
            androidx.appcompat.app.p r10 = new androidx.appcompat.app.p
            r13 = 21
            r10.<init>(r13, r4, r7)
            r12.o(r2, r5, r10)
        L_0x06a1:
            r28 = r9
            goto L_0x0655
        L_0x06a4:
            r9 = r28
            android.view.ViewGroup r3 = r6.f2663a
            java.util.WeakHashMap<android.view.View, w1.q0> r4 = w1.d0.f16298a
            boolean r3 = w1.d0.g.c(r3)
            if (r3 != 0) goto L_0x06b7
        L_0x06b0:
            r0 = 0
            r23 = r8
            r28 = r9
            goto L_0x07a5
        L_0x06b7:
            r3 = 4
            androidx.fragment.app.b0.b(r3, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r32.size()
            r5 = 0
        L_0x06c5:
            if (r5 >= r4) goto L_0x06df
            r7 = r32
            java.lang.Object r10 = r7.get(r5)
            android.view.View r10 = (android.view.View) r10
            java.util.WeakHashMap<android.view.View, w1.q0> r13 = w1.d0.f16298a
            java.lang.String r13 = w1.d0.i.k(r10)
            r3.add(r13)
            r13 = 0
            w1.d0.i.v(r10, r13)
            int r5 = r5 + 1
            goto L_0x06c5
        L_0x06df:
            r7 = r32
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.J(r4)
            if (r4 == 0) goto L_0x0720
            java.util.Iterator r4 = r31.iterator()
        L_0x06ec:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0704
            java.lang.Object r5 = r4.next()
            java.lang.String r10 = "sharedElementFirstOutViews"
            sk.j.e(r5, r10)
            android.view.View r5 = (android.view.View) r5
            r5.toString()
            w1.d0.i.k(r5)
            goto L_0x06ec
        L_0x0704:
            java.util.Iterator r4 = r7.iterator()
        L_0x0708:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0720
            java.lang.Object r5 = r4.next()
            java.lang.String r10 = "sharedElementLastInViews"
            sk.j.e(r5, r10)
            android.view.View r5 = (android.view.View) r5
            r5.toString()
            w1.d0.i.k(r5)
            goto L_0x0708
        L_0x0720:
            android.view.ViewGroup r4 = r6.f2663a
            r12.c(r4, r2)
            android.view.ViewGroup r2 = r6.f2663a
            int r4 = r7.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r10 = 0
        L_0x0731:
            if (r10 >= r4) goto L_0x0783
            r13 = r31
            java.lang.Object r14 = r13.get(r10)
            android.view.View r14 = (android.view.View) r14
            java.util.WeakHashMap<android.view.View, w1.q0> r15 = w1.d0.f16298a
            java.lang.String r15 = w1.d0.i.k(r14)
            r5.add(r15)
            if (r15 != 0) goto L_0x074b
            r23 = r8
            r28 = r9
            goto L_0x077a
        L_0x074b:
            r28 = r9
            r9 = 0
            w1.d0.i.v(r14, r9)
            r14 = r19
            java.lang.Object r9 = r14.getOrDefault(r15, r9)
            java.lang.String r9 = (java.lang.String) r9
            r16 = 0
            r14 = r16
        L_0x075d:
            r23 = r8
            if (r14 >= r4) goto L_0x077a
            java.lang.Object r8 = r3.get(r14)
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0775
            java.lang.Object r8 = r7.get(r14)
            android.view.View r8 = (android.view.View) r8
            w1.d0.i.v(r8, r15)
            goto L_0x077a
        L_0x0775:
            int r14 = r14 + 1
            r8 = r23
            goto L_0x075d
        L_0x077a:
            int r10 = r10 + 1
            r31 = r13
            r8 = r23
            r9 = r28
            goto L_0x0731
        L_0x0783:
            r23 = r8
            r28 = r9
            r13 = r31
            androidx.fragment.app.g0 r8 = new androidx.fragment.app.g0
            r16 = r8
            r17 = r4
            r18 = r7
            r19 = r3
            r20 = r13
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            w1.t.a(r2, r8)
            r2 = 0
            androidx.fragment.app.b0.b(r2, r0)
            r12.q(r1, r13, r7)
            r0 = r2
        L_0x07a5:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r7 = r11.containsValue(r1)
            android.view.ViewGroup r1 = r6.f2663a
            android.content.Context r8 = r1.getContext()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r22.iterator()
            r1 = r0
        L_0x07bb:
            boolean r2 = r10.hasNext()
            java.lang.String r3 = "context"
            if (r2 == 0) goto L_0x085a
            java.lang.Object r2 = r10.next()
            r12 = r2
            androidx.fragment.app.d$a r12 = (androidx.fragment.app.d.a) r12
            boolean r2 = r12.b()
            if (r2 == 0) goto L_0x07d4
            r12.a()
            goto L_0x07bb
        L_0x07d4:
            sk.j.e(r8, r3)
            androidx.fragment.app.n$a r2 = r12.c(r8)
            if (r2 != 0) goto L_0x07e1
            r12.a()
            goto L_0x07bb
        L_0x07e1:
            android.animation.Animator r13 = r2.f2688b
            if (r13 != 0) goto L_0x07e9
            r9.add(r12)
            goto L_0x07bb
        L_0x07e9:
            androidx.fragment.app.l0$b r14 = r12.f2593a
            androidx.fragment.app.Fragment r2 = r14.f2671c
            java.lang.Object r3 = r11.get(r14)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = sk.j.a(r3, r4)
            if (r3 == 0) goto L_0x0807
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.J(r3)
            if (r3 == 0) goto L_0x0803
            java.util.Objects.toString(r2)
        L_0x0803:
            r12.a()
            goto L_0x07bb
        L_0x0807:
            androidx.fragment.app.l0$b$b r1 = r14.f2669a
            r15 = r25
            if (r1 != r15) goto L_0x080e
            r0 = 1
        L_0x080e:
            r3 = r0
            r5 = r24
            if (r3 == 0) goto L_0x0816
            r5.remove(r14)
        L_0x0816:
            android.view.View r4 = r2.L
            android.view.ViewGroup r0 = r6.f2663a
            r0.startViewTransition(r4)
            androidx.fragment.app.e r2 = new androidx.fragment.app.e
            r0 = r2
            r1 = r33
            r34 = r10
            r10 = r2
            r2 = r4
            r16 = r11
            r11 = r4
            r4 = r14
            r17 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r13.addListener(r10)
            r13.setTarget(r11)
            r13.start()
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.J(r0)
            if (r0 == 0) goto L_0x0843
            r14.toString()
        L_0x0843:
            s1.e r0 = r12.f2594b
            c0.r r1 = new c0.r
            r2 = 4
            r1.<init>(r2, r13, r14)
            r0.b(r1)
            r1 = 1
            r0 = 0
            r10 = r34
            r25 = r15
            r11 = r16
            r24 = r17
            goto L_0x07bb
        L_0x085a:
            r17 = r24
            java.util.Iterator r0 = r9.iterator()
        L_0x0860:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x08ee
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.d$a r2 = (androidx.fragment.app.d.a) r2
            androidx.fragment.app.l0$b r4 = r2.f2593a
            androidx.fragment.app.Fragment r5 = r4.f2671c
            if (r7 == 0) goto L_0x0880
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.J(r4)
            if (r4 == 0) goto L_0x087c
            java.util.Objects.toString(r5)
        L_0x087c:
            r2.a()
            goto L_0x0860
        L_0x0880:
            r9 = 2
            if (r1 == 0) goto L_0x0890
            boolean r4 = androidx.fragment.app.FragmentManager.J(r9)
            if (r4 == 0) goto L_0x088c
            java.util.Objects.toString(r5)
        L_0x088c:
            r2.a()
            goto L_0x0860
        L_0x0890:
            android.view.View r5 = r5.L
            sk.j.e(r8, r3)
            androidx.fragment.app.n$a r9 = r2.c(r8)
            java.lang.String r10 = "Required value was null."
            if (r9 == 0) goto L_0x08e4
            android.view.animation.Animation r9 = r9.f2687a
            if (r9 == 0) goto L_0x08da
            androidx.fragment.app.l0$b$b r10 = r4.f2669a
            androidx.fragment.app.l0$b$b r11 = androidx.fragment.app.l0.b.C0024b.REMOVED
            if (r10 == r11) goto L_0x08ae
            r5.startAnimation(r9)
            r2.a()
            goto L_0x08cf
        L_0x08ae:
            android.view.ViewGroup r10 = r6.f2663a
            r10.startViewTransition(r5)
            androidx.fragment.app.n$b r10 = new androidx.fragment.app.n$b
            android.view.ViewGroup r11 = r6.f2663a
            r10.<init>(r9, r11, r5)
            androidx.fragment.app.f r9 = new androidx.fragment.app.f
            r9.<init>(r5, r2, r6, r4)
            r10.setAnimationListener(r9)
            r5.startAnimation(r10)
            r9 = 2
            boolean r9 = androidx.fragment.app.FragmentManager.J(r9)
            if (r9 == 0) goto L_0x08cf
            r4.toString()
        L_0x08cf:
            s1.e r9 = r2.f2594b
            androidx.fragment.app.c r10 = new androidx.fragment.app.c
            r10.<init>(r5, r2, r6, r4)
            r9.b(r10)
            goto L_0x0860
        L_0x08da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r10.toString()
            r0.<init>(r1)
            throw r0
        L_0x08e4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r10.toString()
            r0.<init>(r1)
            throw r0
        L_0x08ee:
            java.util.Iterator r0 = r17.iterator()
        L_0x08f2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x090d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.l0$b r1 = (androidx.fragment.app.l0.b) r1
            androidx.fragment.app.Fragment r2 = r1.f2671c
            android.view.View r2 = r2.L
            androidx.fragment.app.l0$b$b r1 = r1.f2669a
            java.lang.String r3 = "view"
            sk.j.e(r2, r3)
            r1.b(r2)
            goto L_0x08f2
        L_0x090d:
            r17.clear()
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.J(r0)
            if (r0 == 0) goto L_0x091d
            java.util.Objects.toString(r23)
            java.util.Objects.toString(r28)
        L_0x091d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.b(java.util.ArrayList, boolean):void");
    }
}
