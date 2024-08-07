package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.fragment.app.o;
import f0.b0;
import i3.a0;
import i3.m;
import i3.n;
import i3.p;
import i3.r;
import i3.w;
import i3.y;
import i3.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import m1.i;
import v0.e;
import w1.d0;
import w1.q0;

public abstract class Transition implements Cloneable {
    public static final int[] C = {2, 1, 3, 4};
    public static final a D = new a();
    public static ThreadLocal<v0.b<Animator, b>> E = new ThreadLocal<>();
    public c A;
    public PathMotion B = D;

    /* renamed from: a  reason: collision with root package name */
    public String f3431a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f3432b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f3433c = -1;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f3434d = null;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Integer> f3435e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<View> f3436f = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public h1.a f3437n = new h1.a(1);

    /* renamed from: o  reason: collision with root package name */
    public h1.a f3438o = new h1.a(1);

    /* renamed from: p  reason: collision with root package name */
    public TransitionSet f3439p = null;

    /* renamed from: q  reason: collision with root package name */
    public int[] f3440q = C;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<p> f3441r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<p> f3442s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<Animator> f3443t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public int f3444u = 0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3445v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3446w = false;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<d> f3447x = null;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<Animator> f3448y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public o f3449z;

    public class a extends PathMotion {
        public final Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f3450a;

        /* renamed from: b  reason: collision with root package name */
        public String f3451b;

        /* renamed from: c  reason: collision with root package name */
        public p f3452c;

        /* renamed from: d  reason: collision with root package name */
        public a0 f3453d;

        /* renamed from: e  reason: collision with root package name */
        public Transition f3454e;

        public b(View view, String str, Transition transition, z zVar, p pVar) {
            this.f3450a = view;
            this.f3451b = str;
            this.f3452c = pVar;
            this.f3453d = zVar;
            this.f3454e = transition;
        }
    }

    public static abstract class c {
        public abstract Rect a();
    }

    public interface d {
        void a();

        void b(Transition transition);

        void c();

        void d(Transition transition);

        void e();
    }

    public Transition() {
    }

    public static void c(h1.a aVar, View view, p pVar) {
        ((v0.b) aVar.f10527a).put(view, pVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (((SparseArray) aVar.f10528b).indexOfKey(id2) >= 0) {
                ((SparseArray) aVar.f10528b).put(id2, (Object) null);
            } else {
                ((SparseArray) aVar.f10528b).put(id2, view);
            }
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        String k10 = d0.i.k(view);
        if (k10 != null) {
            if (((v0.b) aVar.f10530d).containsKey(k10)) {
                ((v0.b) aVar.f10530d).put(k10, null);
            } else {
                ((v0.b) aVar.f10530d).put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                e eVar = (e) aVar.f10529c;
                if (eVar.f15982a) {
                    eVar.e();
                }
                if (j7.a.h(eVar.f15983b, eVar.f15985d, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((e) aVar.f10529c).f((Long) null, itemIdAtPosition);
                    if (view2 != null) {
                        d0.d.r(view2, false);
                        ((e) aVar.f10529c).j((Object) null, itemIdAtPosition);
                        return;
                    }
                    return;
                }
                d0.d.r(view, true);
                ((e) aVar.f10529c).j(view, itemIdAtPosition);
            }
        }
    }

    public static v0.b<Animator, b> r() {
        v0.b<Animator, b> bVar = E.get();
        if (bVar != null) {
            return bVar;
        }
        v0.b<Animator, b> bVar2 = new v0.b<>();
        E.set(bVar2);
        return bVar2;
    }

    public static boolean x(p pVar, p pVar2, String str) {
        Object obj = pVar.f11062a.get(str);
        Object obj2 = pVar2.f11062a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A(View view) {
        this.f3436f.remove(view);
    }

    public void B(ViewGroup viewGroup) {
        if (this.f3445v) {
            if (!this.f3446w) {
                int size = this.f3443t.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f3443t.get(size).resume();
                }
                ArrayList<d> arrayList = this.f3447x;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f3447x.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((d) arrayList2.get(i10)).e();
                    }
                }
            }
            this.f3445v = false;
        }
    }

    public void C() {
        J();
        v0.b<Animator, b> r10 = r();
        Iterator<Animator> it = this.f3448y.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (r10.containsKey(next)) {
                J();
                if (next != null) {
                    next.addListener(new n(this, r10));
                    long j10 = this.f3433c;
                    if (j10 >= 0) {
                        next.setDuration(j10);
                    }
                    long j11 = this.f3432b;
                    if (j11 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f3434d;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new i3.o(this));
                    next.start();
                }
            }
        }
        this.f3448y.clear();
        p();
    }

    public void D(long j10) {
        this.f3433c = j10;
    }

    public void E(c cVar) {
        this.A = cVar;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f3434d = timeInterpolator;
    }

    public void G(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.B = D;
        } else {
            this.B = pathMotion;
        }
    }

    public void H(o oVar) {
        this.f3449z = oVar;
    }

    public void I(long j10) {
        this.f3432b = j10;
    }

    public final void J() {
        if (this.f3444u == 0) {
            ArrayList<d> arrayList = this.f3447x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3447x.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).b(this);
                }
            }
            this.f3446w = false;
        }
        this.f3444u++;
    }

    public String K(String str) {
        StringBuilder q10 = android.support.v4.media.a.q(str);
        q10.append(getClass().getSimpleName());
        q10.append("@");
        q10.append(Integer.toHexString(hashCode()));
        q10.append(": ");
        String sb2 = q10.toString();
        if (this.f3433c != -1) {
            StringBuilder v2 = b0.v(sb2, "dur(");
            v2.append(this.f3433c);
            v2.append(") ");
            sb2 = v2.toString();
        }
        if (this.f3432b != -1) {
            StringBuilder v10 = b0.v(sb2, "dly(");
            v10.append(this.f3432b);
            v10.append(") ");
            sb2 = v10.toString();
        }
        if (this.f3434d != null) {
            StringBuilder v11 = b0.v(sb2, "interp(");
            v11.append(this.f3434d);
            v11.append(") ");
            sb2 = v11.toString();
        }
        if (this.f3435e.size() <= 0 && this.f3436f.size() <= 0) {
            return sb2;
        }
        String r10 = b0.r(sb2, "tgts(");
        if (this.f3435e.size() > 0) {
            for (int i10 = 0; i10 < this.f3435e.size(); i10++) {
                if (i10 > 0) {
                    r10 = b0.r(r10, ", ");
                }
                StringBuilder q11 = android.support.v4.media.a.q(r10);
                q11.append(this.f3435e.get(i10));
                r10 = q11.toString();
            }
        }
        if (this.f3436f.size() > 0) {
            for (int i11 = 0; i11 < this.f3436f.size(); i11++) {
                if (i11 > 0) {
                    r10 = b0.r(r10, ", ");
                }
                StringBuilder q12 = android.support.v4.media.a.q(r10);
                q12.append(this.f3436f.get(i11));
                r10 = q12.toString();
            }
        }
        return b0.r(r10, ")");
    }

    public void a(d dVar) {
        if (this.f3447x == null) {
            this.f3447x = new ArrayList<>();
        }
        this.f3447x.add(dVar);
    }

    public void b(View view) {
        this.f3436f.add(view);
    }

    public void cancel() {
        int size = this.f3443t.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            this.f3443t.get(size).cancel();
        }
        ArrayList<d> arrayList = this.f3447x;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f3447x.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((d) arrayList2.get(i10)).c();
            }
        }
    }

    public abstract void e(p pVar);

    public final void f(View view, boolean z10) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                p pVar = new p(view);
                if (z10) {
                    j(pVar);
                } else {
                    e(pVar);
                }
                pVar.f11064c.add(this);
                g(pVar);
                if (z10) {
                    c(this.f3437n, view, pVar);
                } else {
                    c(this.f3438o, view, pVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    f(viewGroup.getChildAt(i10), z10);
                }
            }
        }
    }

    public void g(p pVar) {
        if (this.f3449z != null && !pVar.f11062a.isEmpty()) {
            this.f3449z.p();
            String[] strArr = y.f11071b;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    z10 = true;
                    break;
                } else if (!pVar.f11062a.containsKey(strArr[i10])) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                this.f3449z.c(pVar);
            }
        }
    }

    public abstract void j(p pVar);

    public final void k(ViewGroup viewGroup, boolean z10) {
        l(z10);
        if (this.f3435e.size() > 0 || this.f3436f.size() > 0) {
            for (int i10 = 0; i10 < this.f3435e.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f3435e.get(i10).intValue());
                if (findViewById != null) {
                    p pVar = new p(findViewById);
                    if (z10) {
                        j(pVar);
                    } else {
                        e(pVar);
                    }
                    pVar.f11064c.add(this);
                    g(pVar);
                    if (z10) {
                        c(this.f3437n, findViewById, pVar);
                    } else {
                        c(this.f3438o, findViewById, pVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f3436f.size(); i11++) {
                View view = this.f3436f.get(i11);
                p pVar2 = new p(view);
                if (z10) {
                    j(pVar2);
                } else {
                    e(pVar2);
                }
                pVar2.f11064c.add(this);
                g(pVar2);
                if (z10) {
                    c(this.f3437n, view, pVar2);
                } else {
                    c(this.f3438o, view, pVar2);
                }
            }
            return;
        }
        f(viewGroup, z10);
    }

    public final void l(boolean z10) {
        if (z10) {
            ((v0.b) this.f3437n.f10527a).clear();
            ((SparseArray) this.f3437n.f10528b).clear();
            ((e) this.f3437n.f10529c).b();
            return;
        }
        ((v0.b) this.f3438o.f10527a).clear();
        ((SparseArray) this.f3438o.f10528b).clear();
        ((e) this.f3438o.f10529c).b();
    }

    /* renamed from: m */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f3448y = new ArrayList<>();
            transition.f3437n = new h1.a(1);
            transition.f3438o = new h1.a(1);
            transition.f3441r = null;
            transition.f3442s = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, p pVar, p pVar2) {
        return null;
    }

    public void o(ViewGroup viewGroup, h1.a aVar, h1.a aVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        int i10;
        boolean z10;
        Animator n10;
        View view;
        Animator animator;
        p pVar;
        p pVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        v0.b<Animator, b> r10 = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            p pVar3 = arrayList.get(i11);
            p pVar4 = arrayList2.get(i11);
            if (pVar3 != null && !pVar3.f11064c.contains(this)) {
                pVar3 = null;
            }
            if (pVar4 != null && !pVar4.f11064c.contains(this)) {
                pVar4 = null;
            }
            if (!(pVar3 == null && pVar4 == null)) {
                if (pVar3 == null || pVar4 == null || u(pVar3, pVar4)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (n10 = n(viewGroup2, pVar3, pVar4)) != null) {
                    if (pVar4 != null) {
                        view = pVar4.f11063b;
                        String[] s10 = s();
                        if (s10 != null && s10.length > 0) {
                            p pVar5 = new p(view);
                            Animator animator3 = n10;
                            i10 = size;
                            p pVar6 = (p) ((v0.b) aVar2.f10527a).getOrDefault(view, null);
                            if (pVar6 != null) {
                                int i12 = 0;
                                while (i12 < s10.length) {
                                    HashMap hashMap = pVar5.f11062a;
                                    String str = s10[i12];
                                    hashMap.put(str, pVar6.f11062a.get(str));
                                    i12++;
                                    ArrayList<p> arrayList3 = arrayList2;
                                    s10 = s10;
                                }
                            }
                            int i13 = r10.f16007c;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= i13) {
                                    pVar2 = pVar5;
                                    animator2 = animator3;
                                    break;
                                }
                                b orDefault = r10.getOrDefault(r10.i(i14), null);
                                if (orDefault.f3452c != null && orDefault.f3450a == view && orDefault.f3451b.equals(this.f3431a) && orDefault.f3452c.equals(pVar5)) {
                                    pVar2 = pVar5;
                                    animator2 = null;
                                    break;
                                }
                                i14++;
                            }
                        } else {
                            i10 = size;
                            animator2 = n10;
                            pVar2 = null;
                        }
                        animator = animator2;
                        pVar = pVar2;
                    } else {
                        i10 = size;
                        view = pVar3.f11063b;
                        animator = n10;
                        pVar = null;
                    }
                    if (animator != null) {
                        o oVar = this.f3449z;
                        if (oVar != null) {
                            long u10 = oVar.u(viewGroup2, this, pVar3, pVar4);
                            sparseIntArray.put(this.f3448y.size(), (int) u10);
                            j10 = Math.min(u10, j10);
                        }
                        long j11 = j10;
                        String str2 = this.f3431a;
                        w wVar = r.f11068a;
                        r10.put(animator, new b(view, str2, this, new z(viewGroup2), pVar));
                        this.f3448y.add(animator);
                        j10 = j11;
                    }
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator4 = this.f3448y.get(sparseIntArray.keyAt(i15));
                animator4.setStartDelay(animator4.getStartDelay() + (((long) sparseIntArray.valueAt(i15)) - j10));
            }
        }
    }

    public final void p() {
        int i10 = this.f3444u - 1;
        this.f3444u = i10;
        if (i10 == 0) {
            ArrayList<d> arrayList = this.f3447x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3447x.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((d) arrayList2.get(i11)).d(this);
                }
            }
            for (int i12 = 0; i12 < ((e) this.f3437n.f10529c).l(); i12++) {
                View view = (View) ((e) this.f3437n.f10529c).m(i12);
                if (view != null) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.d.r(view, false);
                }
            }
            for (int i13 = 0; i13 < ((e) this.f3438o.f10529c).l(); i13++) {
                View view2 = (View) ((e) this.f3438o.f10529c).m(i13);
                if (view2 != null) {
                    WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                    d0.d.r(view2, false);
                }
            }
            this.f3446w = true;
        }
    }

    public final p q(View view, boolean z10) {
        ArrayList<p> arrayList;
        ArrayList<p> arrayList2;
        TransitionSet transitionSet = this.f3439p;
        if (transitionSet != null) {
            return transitionSet.q(view, z10);
        }
        if (z10) {
            arrayList = this.f3441r;
        } else {
            arrayList = this.f3442s;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            p pVar = arrayList.get(i11);
            if (pVar == null) {
                return null;
            }
            if (pVar.f11063b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 < 0) {
            return null;
        }
        if (z10) {
            arrayList2 = this.f3442s;
        } else {
            arrayList2 = this.f3441r;
        }
        return arrayList2.get(i10);
    }

    public String[] s() {
        return null;
    }

    public final p t(View view, boolean z10) {
        h1.a aVar;
        TransitionSet transitionSet = this.f3439p;
        if (transitionSet != null) {
            return transitionSet.t(view, z10);
        }
        if (z10) {
            aVar = this.f3437n;
        } else {
            aVar = this.f3438o;
        }
        return (p) ((v0.b) aVar.f10527a).getOrDefault(view, null);
    }

    public final String toString() {
        return K("");
    }

    public boolean u(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return false;
        }
        String[] s10 = s();
        if (s10 != null) {
            int length = s10.length;
            int i10 = 0;
            while (i10 < length) {
                if (!x(pVar, pVar2, s10[i10])) {
                    i10++;
                }
            }
            return false;
        }
        for (String x10 : pVar.f11062a.keySet()) {
            if (x(pVar, pVar2, x10)) {
            }
        }
        return false;
        return true;
    }

    public final boolean w(View view) {
        int id2 = view.getId();
        if ((this.f3435e.size() != 0 || this.f3436f.size() != 0) && !this.f3435e.contains(Integer.valueOf(id2)) && !this.f3436f.contains(view)) {
            return false;
        }
        return true;
    }

    public void y(View view) {
        if (!this.f3446w) {
            for (int size = this.f3443t.size() - 1; size >= 0; size--) {
                this.f3443t.get(size).pause();
            }
            ArrayList<d> arrayList = this.f3447x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3447x.clone();
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((d) arrayList2.get(i10)).a();
                }
            }
            this.f3445v = true;
        }
    }

    public void z(d dVar) {
        ArrayList<d> arrayList = this.f3447x;
        if (arrayList != null) {
            arrayList.remove(dVar);
            if (this.f3447x.size() == 0) {
                this.f3447x = null;
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        int i10;
        boolean z10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f11050a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long c10 = (long) i.c(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (c10 >= 0) {
            D(c10);
        }
        long c11 = (long) i.c(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (c11 > 0) {
            I(c11);
        }
        if (!i.e(xmlResourceParser, "interpolator")) {
            i10 = 0;
        } else {
            i10 = obtainStyledAttributes.getResourceId(0, 0);
        }
        if (i10 > 0) {
            F(AnimationUtils.loadInterpolator(context, i10));
        }
        String d10 = i.d(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (d10 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(d10, ",");
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i11 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(trim)) {
                    iArr[i11] = 3;
                } else if ("instance".equalsIgnoreCase(trim)) {
                    iArr[i11] = 1;
                } else if ("name".equalsIgnoreCase(trim)) {
                    iArr[i11] = 2;
                } else if ("itemId".equalsIgnoreCase(trim)) {
                    iArr[i11] = 4;
                } else if (trim.isEmpty()) {
                    int[] iArr2 = new int[(iArr.length - 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i11);
                    i11--;
                    iArr = iArr2;
                } else {
                    throw new InflateException(b0.s("Unknown match type in matchOrder: '", trim, "'"));
                }
                i11++;
            }
            if (iArr.length == 0) {
                this.f3440q = C;
            } else {
                int i12 = 0;
                while (i12 < iArr.length) {
                    int i13 = iArr[i12];
                    if (i13 >= 1 && i13 <= 4) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= i12) {
                                z10 = false;
                                break;
                            } else if (iArr[i14] == i13) {
                                z10 = true;
                                break;
                            } else {
                                i14++;
                            }
                        }
                        if (!z10) {
                            i12++;
                        } else {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    } else {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                }
                this.f3440q = (int[]) iArr.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }
}
