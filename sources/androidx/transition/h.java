package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import i3.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import v0.b;
import w1.d0;
import w1.q0;

/* compiled from: TransitionManager */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static AutoTransition f3490a = new AutoTransition();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<b<ViewGroup, ArrayList<Transition>>>> f3491b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f3492c = new ArrayList<>();

    /* compiled from: TransitionManager */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public Transition f3493a;

        /* renamed from: b  reason: collision with root package name */
        public ViewGroup f3494b;

        /* renamed from: androidx.transition.h$a$a  reason: collision with other inner class name */
        /* compiled from: TransitionManager */
        public class C0034a extends g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f3495a;

            public C0034a(b bVar) {
                this.f3495a = bVar;
            }

            public final void d(Transition transition) {
                ((ArrayList) this.f3495a.getOrDefault(a.this.f3494b, null)).remove(transition);
                transition.z(this);
            }
        }

        public a(ViewGroup viewGroup, Transition transition) {
            this.f3493a = transition;
            this.f3494b = viewGroup;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: i3.p} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0251  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x01ff A[EDGE_INSN: B:140:0x01ff->B:88:0x01ff ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0225  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreDraw() {
            /*
                r19 = this;
                r0 = r19
                android.view.ViewGroup r1 = r0.f3494b
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f3494b
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = androidx.transition.h.f3492c
                android.view.ViewGroup r2 = r0.f3494b
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                v0.b r1 = androidx.transition.h.b()
                android.view.ViewGroup r3 = r0.f3494b
                r4 = 0
                java.lang.Object r3 = r1.getOrDefault(r3, r4)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f3494b
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                androidx.transition.Transition r6 = r0.f3493a
                r3.add(r6)
                androidx.transition.Transition r3 = r0.f3493a
                androidx.transition.h$a$a r6 = new androidx.transition.h$a$a
                r6.<init>(r1)
                r3.a(r6)
                androidx.transition.Transition r1 = r0.f3493a
                android.view.ViewGroup r3 = r0.f3494b
                r6 = 0
                r1.k(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                androidx.transition.Transition r3 = (androidx.transition.Transition) r3
                android.view.ViewGroup r5 = r0.f3494b
                r3.B(r5)
                goto L_0x0060
            L_0x0072:
                androidx.transition.Transition r1 = r0.f3493a
                android.view.ViewGroup r8 = r0.f3494b
                r1.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f3441r = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f3442s = r3
                h1.a r3 = r1.f3437n
                h1.a r5 = r1.f3438o
                v0.b r7 = new v0.b
                java.lang.Object r9 = r3.f10527a
                v0.b r9 = (v0.b) r9
                r7.<init>((v0.b) r9)
                v0.b r9 = new v0.b
                java.lang.Object r10 = r5.f10527a
                v0.b r10 = (v0.b) r10
                r9.<init>((v0.b) r10)
                r10 = r6
            L_0x009e:
                int[] r11 = r1.f3440q
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01ff
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01bf
                r12 = 2
                if (r11 == r12) goto L_0x016d
                r12 = 3
                if (r11 == r12) goto L_0x0115
                r12 = 4
                if (r11 == r12) goto L_0x00b3
            L_0x00b0:
                r17 = r3
                goto L_0x0111
            L_0x00b3:
                java.lang.Object r11 = r3.f10529c
                v0.e r11 = (v0.e) r11
                java.lang.Object r12 = r5.f10529c
                v0.e r12 = (v0.e) r12
                int r13 = r11.l()
                r14 = r6
            L_0x00c0:
                if (r14 >= r13) goto L_0x00b0
                java.lang.Object r15 = r11.m(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x0107
                boolean r16 = r1.w(r15)
                if (r16 == 0) goto L_0x0107
                r17 = r3
                long r2 = r11.g(r14)
                java.lang.Object r2 = r12.f(r4, r2)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x0109
                boolean r3 = r1.w(r2)
                if (r3 == 0) goto L_0x0109
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                i3.p r3 = (i3.p) r3
                java.lang.Object r18 = r9.getOrDefault(r2, r4)
                r6 = r18
                i3.p r6 = (i3.p) r6
                if (r3 == 0) goto L_0x0109
                if (r6 == 0) goto L_0x0109
                java.util.ArrayList<i3.p> r4 = r1.f3441r
                r4.add(r3)
                java.util.ArrayList<i3.p> r3 = r1.f3442s
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x0109
            L_0x0107:
                r17 = r3
            L_0x0109:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00c0
            L_0x0111:
                r2 = r17
                goto L_0x01f5
            L_0x0115:
                r2 = r3
                java.lang.Object r3 = r2.f10528b
                android.util.SparseArray r3 = (android.util.SparseArray) r3
                java.lang.Object r4 = r5.f10528b
                android.util.SparseArray r4 = (android.util.SparseArray) r4
                int r6 = r3.size()
                r11 = 0
            L_0x0123:
                if (r11 >= r6) goto L_0x01f5
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x0168
                boolean r13 = r1.w(r12)
                if (r13 == 0) goto L_0x0168
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x0168
                boolean r14 = r1.w(r13)
                if (r14 == 0) goto L_0x0168
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                i3.p r15 = (i3.p) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                i3.p r14 = (i3.p) r14
                if (r15 == 0) goto L_0x0168
                if (r14 == 0) goto L_0x0168
                java.util.ArrayList<i3.p> r0 = r1.f3441r
                r0.add(r15)
                java.util.ArrayList<i3.p> r0 = r1.f3442s
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x0168:
                int r11 = r11 + 1
                r0 = r19
                goto L_0x0123
            L_0x016d:
                r2 = r3
                java.lang.Object r0 = r2.f10530d
                v0.b r0 = (v0.b) r0
                java.lang.Object r3 = r5.f10530d
                v0.b r3 = (v0.b) r3
                int r4 = r0.f16007c
                r6 = 0
            L_0x0179:
                if (r6 >= r4) goto L_0x01f5
                java.lang.Object r11 = r0.m(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01bc
                boolean r12 = r1.w(r11)
                if (r12 == 0) goto L_0x01bc
                java.lang.Object r12 = r0.i(r6)
                r13 = 0
                java.lang.Object r12 = r3.getOrDefault(r12, r13)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01bc
                boolean r14 = r1.w(r12)
                if (r14 == 0) goto L_0x01bc
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                i3.p r14 = (i3.p) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                i3.p r15 = (i3.p) r15
                if (r14 == 0) goto L_0x01bc
                if (r15 == 0) goto L_0x01bc
                java.util.ArrayList<i3.p> r13 = r1.f3441r
                r13.add(r14)
                java.util.ArrayList<i3.p> r13 = r1.f3442s
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01bc:
                int r6 = r6 + 1
                goto L_0x0179
            L_0x01bf:
                r2 = r3
                int r0 = r7.f16007c
            L_0x01c2:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01f5
                java.lang.Object r3 = r7.i(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01c2
                boolean r4 = r1.w(r3)
                if (r4 == 0) goto L_0x01c2
                java.lang.Object r3 = r9.remove(r3)
                i3.p r3 = (i3.p) r3
                if (r3 == 0) goto L_0x01c2
                android.view.View r4 = r3.f11063b
                boolean r4 = r1.w(r4)
                if (r4 == 0) goto L_0x01c2
                java.lang.Object r4 = r7.k(r0)
                i3.p r4 = (i3.p) r4
                java.util.ArrayList<i3.p> r6 = r1.f3441r
                r6.add(r4)
                java.util.ArrayList<i3.p> r4 = r1.f3442s
                r4.add(r3)
                goto L_0x01c2
            L_0x01f5:
                int r10 = r10 + 1
                r0 = r19
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x009e
            L_0x01ff:
                r0 = 0
            L_0x0200:
                int r2 = r7.f16007c
                if (r0 >= r2) goto L_0x0220
                java.lang.Object r2 = r7.m(r0)
                i3.p r2 = (i3.p) r2
                android.view.View r3 = r2.f11063b
                boolean r3 = r1.w(r3)
                if (r3 == 0) goto L_0x021d
                java.util.ArrayList<i3.p> r3 = r1.f3441r
                r3.add(r2)
                java.util.ArrayList<i3.p> r2 = r1.f3442s
                r3 = 0
                r2.add(r3)
            L_0x021d:
                int r0 = r0 + 1
                goto L_0x0200
            L_0x0220:
                r0 = 0
            L_0x0221:
                int r2 = r9.f16007c
                if (r0 >= r2) goto L_0x0241
                java.lang.Object r2 = r9.m(r0)
                i3.p r2 = (i3.p) r2
                android.view.View r3 = r2.f11063b
                boolean r3 = r1.w(r3)
                if (r3 == 0) goto L_0x023e
                java.util.ArrayList<i3.p> r3 = r1.f3442s
                r3.add(r2)
                java.util.ArrayList<i3.p> r2 = r1.f3441r
                r3 = 0
                r2.add(r3)
            L_0x023e:
                int r0 = r0 + 1
                goto L_0x0221
            L_0x0241:
                v0.b r0 = androidx.transition.Transition.r()
                int r2 = r0.f16007c
                i3.w r3 = i3.r.f11068a
                android.view.WindowId r3 = r8.getWindowId()
                r4 = 1
                int r2 = r2 - r4
            L_0x024f:
                if (r2 < 0) goto L_0x02c6
                java.lang.Object r4 = r0.i(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                if (r4 == 0) goto L_0x02c2
                r5 = 0
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                androidx.transition.Transition$b r6 = (androidx.transition.Transition.b) r6
                if (r6 == 0) goto L_0x02c2
                android.view.View r5 = r6.f3450a
                if (r5 == 0) goto L_0x02c2
                i3.a0 r5 = r6.f3453d
                boolean r7 = r5 instanceof i3.z
                if (r7 == 0) goto L_0x0278
                i3.z r5 = (i3.z) r5
                android.view.WindowId r5 = r5.f11072a
                boolean r5 = r5.equals(r3)
                if (r5 == 0) goto L_0x0278
                r5 = 1
                goto L_0x0279
            L_0x0278:
                r5 = 0
            L_0x0279:
                if (r5 == 0) goto L_0x02c2
                i3.p r5 = r6.f3452c
                android.view.View r7 = r6.f3450a
                r9 = 1
                i3.p r10 = r1.t(r7, r9)
                i3.p r11 = r1.q(r7, r9)
                if (r10 != 0) goto L_0x029b
                if (r11 != 0) goto L_0x029b
                h1.a r9 = r1.f3438o
                java.lang.Object r9 = r9.f10527a
                v0.b r9 = (v0.b) r9
                r12 = 0
                java.lang.Object r7 = r9.getOrDefault(r7, r12)
                r11 = r7
                i3.p r11 = (i3.p) r11
                goto L_0x029c
            L_0x029b:
                r12 = 0
            L_0x029c:
                if (r10 != 0) goto L_0x02a0
                if (r11 == 0) goto L_0x02aa
            L_0x02a0:
                androidx.transition.Transition r6 = r6.f3454e
                boolean r5 = r6.u(r5, r11)
                if (r5 == 0) goto L_0x02aa
                r5 = 1
                goto L_0x02ab
            L_0x02aa:
                r5 = 0
            L_0x02ab:
                if (r5 == 0) goto L_0x02c3
                boolean r5 = r4.isRunning()
                if (r5 != 0) goto L_0x02be
                boolean r5 = r4.isStarted()
                if (r5 == 0) goto L_0x02ba
                goto L_0x02be
            L_0x02ba:
                r0.remove(r4)
                goto L_0x02c3
            L_0x02be:
                r4.cancel()
                goto L_0x02c3
            L_0x02c2:
                r12 = 0
            L_0x02c3:
                int r2 = r2 + -1
                goto L_0x024f
            L_0x02c6:
                h1.a r9 = r1.f3437n
                h1.a r10 = r1.f3438o
                java.util.ArrayList<i3.p> r11 = r1.f3441r
                java.util.ArrayList<i3.p> r12 = r1.f3442s
                r7 = r1
                r7.o(r8, r9, r10, r11, r12)
                r1.C()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.h.a.onPreDraw():boolean");
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f3494b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3494b.removeOnAttachStateChangeListener(this);
            h.f3492c.remove(this.f3494b);
            ArrayList orDefault = h.b().getOrDefault(this.f3494b, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).B(this.f3494b);
                }
            }
            this.f3493a.l(true);
        }
    }

    public static void a(ViewGroup viewGroup, Transition transition) {
        if (!f3492c.contains(viewGroup)) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.g.c(viewGroup)) {
                f3492c.add(viewGroup);
                if (transition == null) {
                    transition = f3490a;
                }
                Transition m10 = transition.clone();
                ArrayList orDefault = b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator it = orDefault.iterator();
                    while (it.hasNext()) {
                        ((Transition) it.next()).y(viewGroup);
                    }
                }
                if (m10 != null) {
                    m10.k(viewGroup, true);
                }
                int i10 = R$id.transition_current_scene;
                if (((k) viewGroup.getTag(i10)) == null) {
                    viewGroup.setTag(i10, (Object) null);
                    if (m10 != null) {
                        a aVar = new a(viewGroup, m10);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static b<ViewGroup, ArrayList<Transition>> b() {
        b<ViewGroup, ArrayList<Transition>> bVar;
        WeakReference weakReference = f3491b.get();
        if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
            return bVar;
        }
        b<ViewGroup, ArrayList<Transition>> bVar2 = new b<>();
        f3491b.set(new WeakReference(bVar2));
        return bVar2;
    }
}
