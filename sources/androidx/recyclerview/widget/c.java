package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: DefaultItemAnimator */
public final class c extends w {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f3173s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3174h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3175i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<e> f3176j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<d> f3177k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.a0>> f3178l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<e>> f3179m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<ArrayList<d>> f3180n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3181o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3182p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3183q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3184r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3185a;

        public a(ArrayList arrayList) {
            this.f3185a = arrayList;
        }

        public final void run() {
            Iterator it = this.f3185a.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                c cVar = c.this;
                RecyclerView.a0 a0Var = eVar.f3197a;
                int i10 = eVar.f3198b;
                int i11 = eVar.f3199c;
                int i12 = eVar.f3200d;
                int i13 = eVar.f3201e;
                cVar.getClass();
                View view = a0Var.f3013a;
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                if (i14 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i15 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                cVar.f3182p.add(a0Var);
                animate.setDuration(cVar.f3041e).setListener(new f(cVar, a0Var, i14, view, i15, animate)).start();
            }
            this.f3185a.clear();
            c.this.f3179m.remove(this.f3185a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3187a;

        public b(ArrayList arrayList) {
            this.f3187a = arrayList;
        }

        public final void run() {
            View view;
            Iterator it = this.f3187a.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                c cVar = c.this;
                cVar.getClass();
                RecyclerView.a0 a0Var = dVar.f3191a;
                View view2 = null;
                if (a0Var == null) {
                    view = null;
                } else {
                    view = a0Var.f3013a;
                }
                RecyclerView.a0 a0Var2 = dVar.f3192b;
                if (a0Var2 != null) {
                    view2 = a0Var2.f3013a;
                }
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(cVar.f3042f);
                    cVar.f3184r.add(dVar.f3191a);
                    duration.translationX((float) (dVar.f3195e - dVar.f3193c));
                    duration.translationY((float) (dVar.f3196f - dVar.f3194d));
                    duration.alpha(0.0f).setListener(new g(cVar, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    cVar.f3184r.add(dVar.f3192b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(cVar.f3042f).alpha(1.0f).setListener(new h(cVar, dVar, animate, view2)).start();
                }
            }
            this.f3187a.clear();
            c.this.f3180n.remove(this.f3187a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultItemAnimator */
    public class C0030c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3189a;

        public C0030c(ArrayList arrayList) {
            this.f3189a = arrayList;
        }

        public final void run() {
            Iterator it = this.f3189a.iterator();
            while (it.hasNext()) {
                RecyclerView.a0 a0Var = (RecyclerView.a0) it.next();
                c cVar = c.this;
                cVar.getClass();
                View view = a0Var.f3013a;
                ViewPropertyAnimator animate = view.animate();
                cVar.f3181o.add(a0Var);
                animate.alpha(1.0f).setDuration(cVar.f3039c).setListener(new e(view, animate, cVar, a0Var)).start();
            }
            this.f3189a.clear();
            c.this.f3178l.remove(this.f3189a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.a0 f3191a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.a0 f3192b;

        /* renamed from: c  reason: collision with root package name */
        public int f3193c;

        /* renamed from: d  reason: collision with root package name */
        public int f3194d;

        /* renamed from: e  reason: collision with root package name */
        public int f3195e;

        /* renamed from: f  reason: collision with root package name */
        public int f3196f;

        public d(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i10, int i11, int i12, int i13) {
            this.f3191a = a0Var;
            this.f3192b = a0Var2;
            this.f3193c = i10;
            this.f3194d = i11;
            this.f3195e = i12;
            this.f3196f = i13;
        }

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("ChangeInfo{oldHolder=");
            q10.append(this.f3191a);
            q10.append(", newHolder=");
            q10.append(this.f3192b);
            q10.append(", fromX=");
            q10.append(this.f3193c);
            q10.append(", fromY=");
            q10.append(this.f3194d);
            q10.append(", toX=");
            q10.append(this.f3195e);
            q10.append(", toY=");
            q10.append(this.f3196f);
            q10.append('}');
            return q10.toString();
        }
    }

    /* compiled from: DefaultItemAnimator */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.a0 f3197a;

        /* renamed from: b  reason: collision with root package name */
        public int f3198b;

        /* renamed from: c  reason: collision with root package name */
        public int f3199c;

        /* renamed from: d  reason: collision with root package name */
        public int f3200d;

        /* renamed from: e  reason: collision with root package name */
        public int f3201e;

        public e(RecyclerView.a0 a0Var, int i10, int i11, int i12, int i13) {
            this.f3197a = a0Var;
            this.f3198b = i10;
            this.f3199c = i11;
            this.f3200d = i12;
            this.f3201e = i13;
        }
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.a0) arrayList.get(size)).f3013a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public final boolean g(RecyclerView.a0 a0Var, List<Object> list) {
        if (!list.isEmpty() || f(a0Var)) {
            return true;
        }
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public final void j(RecyclerView.a0 a0Var) {
        View view = a0Var.f3013a;
        view.animate().cancel();
        int size = this.f3176j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3176j.get(size).f3197a == a0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(a0Var);
                this.f3176j.remove(size);
            }
        }
        u(a0Var, this.f3177k);
        if (this.f3174h.remove(a0Var)) {
            view.setAlpha(1.0f);
            h(a0Var);
        }
        if (this.f3175i.remove(a0Var)) {
            view.setAlpha(1.0f);
            h(a0Var);
        }
        int size2 = this.f3180n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f3180n.get(size2);
            u(a0Var, arrayList);
            if (arrayList.isEmpty()) {
                this.f3180n.remove(size2);
            }
        }
        int size3 = this.f3179m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f3179m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((e) arrayList2.get(size4)).f3197a == a0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(a0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3179m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f3178l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = this.f3178l.get(size5);
                if (arrayList3.remove(a0Var)) {
                    view.setAlpha(1.0f);
                    h(a0Var);
                    if (arrayList3.isEmpty()) {
                        this.f3178l.remove(size5);
                    }
                }
            } else {
                this.f3183q.remove(a0Var);
                this.f3181o.remove(a0Var);
                this.f3184r.remove(a0Var);
                this.f3182p.remove(a0Var);
                t();
                return;
            }
        }
    }

    public final void k() {
        int size = this.f3176j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = this.f3176j.get(size);
            View view = eVar.f3197a.f3013a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(eVar.f3197a);
            this.f3176j.remove(size);
        }
        int size2 = this.f3174h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            h(this.f3174h.get(size2));
            this.f3174h.remove(size2);
        }
        int size3 = this.f3175i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.a0 a0Var = this.f3175i.get(size3);
            a0Var.f3013a.setAlpha(1.0f);
            h(a0Var);
            this.f3175i.remove(size3);
        }
        int size4 = this.f3177k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            d dVar = this.f3177k.get(size4);
            RecyclerView.a0 a0Var2 = dVar.f3191a;
            if (a0Var2 != null) {
                v(dVar, a0Var2);
            }
            RecyclerView.a0 a0Var3 = dVar.f3192b;
            if (a0Var3 != null) {
                v(dVar, a0Var3);
            }
        }
        this.f3177k.clear();
        if (l()) {
            int size5 = this.f3179m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f3179m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        e eVar2 = (e) arrayList.get(size6);
                        View view2 = eVar2.f3197a.f3013a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        h(eVar2.f3197a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f3179m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f3178l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = this.f3178l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.a0 a0Var4 = (RecyclerView.a0) arrayList2.get(size8);
                        a0Var4.f3013a.setAlpha(1.0f);
                        h(a0Var4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f3178l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f3180n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f3180n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            d dVar2 = (d) arrayList3.get(size10);
                            RecyclerView.a0 a0Var5 = dVar2.f3191a;
                            if (a0Var5 != null) {
                                v(dVar2, a0Var5);
                            }
                            RecyclerView.a0 a0Var6 = dVar2.f3192b;
                            if (a0Var6 != null) {
                                v(dVar2, a0Var6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f3180n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    s(this.f3183q);
                    s(this.f3182p);
                    s(this.f3181o);
                    s(this.f3184r);
                    i();
                    return;
                }
            }
        }
    }

    public final boolean l() {
        if (!this.f3175i.isEmpty() || !this.f3177k.isEmpty() || !this.f3176j.isEmpty() || !this.f3174h.isEmpty() || !this.f3182p.isEmpty() || !this.f3183q.isEmpty() || !this.f3181o.isEmpty() || !this.f3184r.isEmpty() || !this.f3179m.isEmpty() || !this.f3178l.isEmpty() || !this.f3180n.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void n() {
        long j10;
        long j11;
        boolean z10 = !this.f3174h.isEmpty();
        boolean z11 = !this.f3176j.isEmpty();
        boolean z12 = !this.f3177k.isEmpty();
        boolean z13 = !this.f3175i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.a0> it = this.f3174h.iterator();
            while (it.hasNext()) {
                RecyclerView.a0 next = it.next();
                View view = next.f3013a;
                ViewPropertyAnimator animate = view.animate();
                this.f3183q.add(next);
                animate.setDuration(this.f3040d).alpha(0.0f).setListener(new d(view, animate, this, next)).start();
            }
            this.f3174h.clear();
            if (z11) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3176j);
                this.f3179m.add(arrayList);
                this.f3176j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    View view2 = ((e) arrayList.get(0)).f3197a.f3013a;
                    long j12 = this.f3040d;
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.d.n(view2, aVar, j12);
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3177k);
                this.f3180n.add(arrayList2);
                this.f3177k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    View view3 = ((d) arrayList2.get(0)).f3191a.f3013a;
                    long j13 = this.f3040d;
                    WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                    d0.d.n(view3, bVar, j13);
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3175i);
                this.f3178l.add(arrayList3);
                this.f3175i.clear();
                C0030c cVar = new C0030c(arrayList3);
                if (z10 || z11 || z12) {
                    long j14 = 0;
                    if (z10) {
                        j10 = this.f3040d;
                    } else {
                        j10 = 0;
                    }
                    if (z11) {
                        j11 = this.f3041e;
                    } else {
                        j11 = 0;
                    }
                    if (z12) {
                        j14 = this.f3042f;
                    }
                    View view4 = ((RecyclerView.a0) arrayList3.get(0)).f3013a;
                    WeakHashMap<View, q0> weakHashMap3 = d0.f16298a;
                    d0.d.n(view4, cVar, Math.max(j11, j14) + j10);
                    return;
                }
                cVar.run();
            }
        }
    }

    @SuppressLint({"UnknownNullness"})
    public final void o(RecyclerView.a0 a0Var) {
        w(a0Var);
        a0Var.f3013a.setAlpha(0.0f);
        this.f3175i.add(a0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final boolean p(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i10, int i11, int i12, int i13) {
        if (a0Var == a0Var2) {
            return q(a0Var, i10, i11, i12, i13);
        }
        float translationX = a0Var.f3013a.getTranslationX();
        float translationY = a0Var.f3013a.getTranslationY();
        float alpha = a0Var.f3013a.getAlpha();
        w(a0Var);
        a0Var.f3013a.setTranslationX(translationX);
        a0Var.f3013a.setTranslationY(translationY);
        a0Var.f3013a.setAlpha(alpha);
        w(a0Var2);
        a0Var2.f3013a.setTranslationX((float) (-((int) (((float) (i12 - i10)) - translationX))));
        a0Var2.f3013a.setTranslationY((float) (-((int) (((float) (i13 - i11)) - translationY))));
        a0Var2.f3013a.setAlpha(0.0f);
        this.f3177k.add(new d(a0Var, a0Var2, i10, i11, i12, i13));
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public final boolean q(RecyclerView.a0 a0Var, int i10, int i11, int i12, int i13) {
        View view = a0Var.f3013a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) a0Var.f3013a.getTranslationY());
        w(a0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            h(a0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX((float) (-i14));
        }
        if (i15 != 0) {
            view.setTranslationY((float) (-i15));
        }
        this.f3176j.add(new e(a0Var, translationX, translationY, i12, i13));
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public final void r(RecyclerView.a0 a0Var) {
        w(a0Var);
        this.f3174h.add(a0Var);
    }

    public final void t() {
        if (!l()) {
            i();
        }
    }

    public final void u(RecyclerView.a0 a0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                d dVar = (d) arrayList.get(size);
                if (v(dVar, a0Var) && dVar.f3191a == null && dVar.f3192b == null) {
                    arrayList.remove(dVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean v(d dVar, RecyclerView.a0 a0Var) {
        if (dVar.f3192b == a0Var) {
            dVar.f3192b = null;
        } else if (dVar.f3191a != a0Var) {
            return false;
        } else {
            dVar.f3191a = null;
        }
        a0Var.f3013a.setAlpha(1.0f);
        a0Var.f3013a.setTranslationX(0.0f);
        a0Var.f3013a.setTranslationY(0.0f);
        h(a0Var);
        return true;
    }

    public final void w(RecyclerView.a0 a0Var) {
        if (f3173s == null) {
            f3173s = new ValueAnimator().getInterpolator();
        }
        a0Var.f3013a.animate().setInterpolator(f3173s);
        j(a0Var);
    }
}
