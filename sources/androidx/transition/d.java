package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.p;
import androidx.fragment.app.h0;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;
import s1.e;

@SuppressLint({"RestrictedApi"})
/* compiled from: FragmentTransitionSupport */
public class d extends h0 {

    /* compiled from: FragmentTransitionSupport */
    public class a implements Transition.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3479a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3480b;

        public a(View view, ArrayList arrayList) {
            this.f3479a = view;
            this.f3480b = arrayList;
        }

        public final void a() {
        }

        public final void b(Transition transition) {
            transition.z(this);
            transition.a(this);
        }

        public final void c() {
        }

        public final void d(Transition transition) {
            transition.z(this);
            this.f3479a.setVisibility(8);
            int size = this.f3480b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f3480b.get(i10)).setVisibility(0);
            }
        }

        public final void e() {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    public class b extends Transition.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f3481a;

        public b(Rect rect) {
            this.f3481a = rect;
        }

        public final Rect a() {
            Rect rect = this.f3481a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3481a;
        }
    }

    public static boolean s(Transition transition) {
        if (!h0.h(transition.f3435e) || !h0.h((List) null) || !h0.h((List) null)) {
            return true;
        }
        return false;
    }

    public final void a(View view, Object obj) {
        ((Transition) obj).b(view);
    }

    public final void b(Object obj, ArrayList<View> arrayList) {
        Transition transition;
        Transition transition2 = (Transition) obj;
        if (transition2 != null) {
            int i10 = 0;
            if (transition2 instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition2;
                int size = transitionSet.F.size();
                while (i10 < size) {
                    if (i10 < 0 || i10 >= transitionSet.F.size()) {
                        transition = null;
                    } else {
                        transition = transitionSet.F.get(i10);
                    }
                    b(transition, arrayList);
                    i10++;
                }
            } else if (!s(transition2) && h0.h(transition2.f3436f)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    transition2.b(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public final void c(ViewGroup viewGroup, Object obj) {
        h.a(viewGroup, (Transition) obj);
    }

    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public final Object i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.L(transition);
            transitionSet.L(transition2);
            transitionSet.O(1);
            transition = transitionSet;
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.L(transition);
        }
        transitionSet2.L(transition3);
        return transitionSet2;
    }

    public final Object j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.L((Transition) obj);
        }
        transitionSet.L((Transition) obj2);
        return transitionSet;
    }

    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).a(new a(view, arrayList));
    }

    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).a(new e(this, obj2, arrayList, obj3, arrayList2));
    }

    public final void m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            h0.g(view, rect);
            ((Transition) obj).E(new c(rect));
        }
    }

    public final void n(Object obj, Rect rect) {
        ((Transition) obj).E(new b(rect));
    }

    public final void o(Object obj, e eVar, p pVar) {
        Transition transition = (Transition) obj;
        eVar.b(new i3.d(transition));
        transition.a(new f(pVar));
    }

    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.f3436f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h0.d(arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.f3436f.clear();
            transitionSet.f3436f.addAll(arrayList2);
            t(transitionSet, arrayList, arrayList2);
        }
    }

    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.L((Transition) obj);
        return transitionSet;
    }

    public final void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i10;
        Transition transition;
        Transition transition2 = (Transition) obj;
        int i11 = 0;
        if (transition2 instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition2;
            int size = transitionSet.F.size();
            while (i11 < size) {
                if (i11 < 0 || i11 >= transitionSet.F.size()) {
                    transition = null;
                } else {
                    transition = transitionSet.F.get(i11);
                }
                t(transition, arrayList, arrayList2);
                i11++;
            }
        } else if (!s(transition2)) {
            ArrayList<View> arrayList3 = transition2.f3436f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i10 = 0;
                } else {
                    i10 = arrayList2.size();
                }
                while (i11 < i10) {
                    transition2.b(arrayList2.get(i11));
                    i11++;
                }
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        transition2.A(arrayList.get(size2));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
