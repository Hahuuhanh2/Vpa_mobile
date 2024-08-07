package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.transition.Transition;
import f0.b0;
import i3.m;
import i3.p;
import java.util.ArrayList;
import java.util.Iterator;
import m1.i;

public class TransitionSet extends Transition {
    public ArrayList<Transition> F = new ArrayList<>();
    public boolean G = true;
    public int H;
    public boolean I = false;
    public int J = 0;

    public class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Transition f3455a;

        public a(Transition transition) {
            this.f3455a = transition;
        }

        public final void d(Transition transition) {
            this.f3455a.C();
            transition.z(this);
        }
    }

    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public TransitionSet f3456a;

        public b(TransitionSet transitionSet) {
            this.f3456a = transitionSet;
        }

        public final void b(Transition transition) {
            TransitionSet transitionSet = this.f3456a;
            if (!transitionSet.I) {
                transitionSet.J();
                this.f3456a.I = true;
            }
        }

        public final void d(Transition transition) {
            TransitionSet transitionSet = this.f3456a;
            int i10 = transitionSet.H - 1;
            transitionSet.H = i10;
            if (i10 == 0) {
                transitionSet.I = false;
                transitionSet.p();
            }
            transition.z(this);
        }
    }

    public TransitionSet() {
    }

    public final void A(View view) {
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            this.F.get(i10).A(view);
        }
        this.f3436f.remove(view);
    }

    public final void B(ViewGroup viewGroup) {
        super.B(viewGroup);
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).B(viewGroup);
        }
    }

    public final void C() {
        if (this.F.isEmpty()) {
            J();
            p();
            return;
        }
        b bVar = new b(this);
        Iterator<Transition> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.H = this.F.size();
        if (!this.G) {
            for (int i10 = 1; i10 < this.F.size(); i10++) {
                this.F.get(i10 - 1).a(new a(this.F.get(i10)));
            }
            Transition transition = this.F.get(0);
            if (transition != null) {
                transition.C();
                return;
            }
            return;
        }
        Iterator<Transition> it2 = this.F.iterator();
        while (it2.hasNext()) {
            it2.next().C();
        }
    }

    public final void E(Transition.c cVar) {
        this.A = cVar;
        this.J |= 8;
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).E(cVar);
        }
    }

    public final void G(PathMotion pathMotion) {
        super.G(pathMotion);
        this.J |= 4;
        if (this.F != null) {
            for (int i10 = 0; i10 < this.F.size(); i10++) {
                this.F.get(i10).G(pathMotion);
            }
        }
    }

    public final void H(o oVar) {
        this.f3449z = oVar;
        this.J |= 2;
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).H(oVar);
        }
    }

    public final void I(long j10) {
        this.f3432b = j10;
    }

    public final String K(String str) {
        String K = super.K(str);
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            StringBuilder v2 = b0.v(K, "\n");
            v2.append(this.F.get(i10).K(str + "  "));
            K = v2.toString();
        }
        return K;
    }

    public final void L(Transition transition) {
        this.F.add(transition);
        transition.f3439p = this;
        long j10 = this.f3433c;
        if (j10 >= 0) {
            transition.D(j10);
        }
        if ((this.J & 1) != 0) {
            transition.F(this.f3434d);
        }
        if ((this.J & 2) != 0) {
            transition.H(this.f3449z);
        }
        if ((this.J & 4) != 0) {
            transition.G(this.B);
        }
        if ((this.J & 8) != 0) {
            transition.E(this.A);
        }
    }

    /* renamed from: M */
    public final void D(long j10) {
        ArrayList<Transition> arrayList;
        this.f3433c = j10;
        if (j10 >= 0 && (arrayList = this.F) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.F.get(i10).D(j10);
            }
        }
    }

    /* renamed from: N */
    public final void F(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList<Transition> arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.F.get(i10).F(timeInterpolator);
            }
        }
        this.f3434d = timeInterpolator;
    }

    public final void O(int i10) {
        if (i10 == 0) {
            this.G = true;
        } else if (i10 == 1) {
            this.G = false;
        } else {
            throw new AndroidRuntimeException(android.support.v4.media.a.m("Invalid parameter for TransitionSet ordering: ", i10));
        }
    }

    public final void a(Transition.d dVar) {
        super.a(dVar);
    }

    public final void b(View view) {
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            this.F.get(i10).b(view);
        }
        this.f3436f.add(view);
    }

    public final void cancel() {
        super.cancel();
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).cancel();
        }
    }

    public final void e(p pVar) {
        if (w(pVar.f11063b)) {
            Iterator<Transition> it = this.F.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.w(pVar.f11063b)) {
                    next.e(pVar);
                    pVar.f11064c.add(next);
                }
            }
        }
    }

    public final void g(p pVar) {
        super.g(pVar);
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).g(pVar);
        }
    }

    public final void j(p pVar) {
        if (w(pVar.f11063b)) {
            Iterator<Transition> it = this.F.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.w(pVar.f11063b)) {
                    next.j(pVar);
                    pVar.f11064c.add(next);
                }
            }
        }
    }

    /* renamed from: m */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.F = new ArrayList<>();
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition m10 = this.F.get(i10).clone();
            transitionSet.F.add(m10);
            m10.f3439p = transitionSet;
        }
        return transitionSet;
    }

    public final void o(ViewGroup viewGroup, h1.a aVar, h1.a aVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        long j10 = this.f3432b;
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition transition = this.F.get(i10);
            if (j10 > 0 && (this.G || i10 == 0)) {
                long j11 = transition.f3432b;
                if (j11 > 0) {
                    transition.I(j11 + j10);
                } else {
                    transition.I(j10);
                }
            }
            transition.o(viewGroup, aVar, aVar2, arrayList, arrayList2);
        }
    }

    public final void y(View view) {
        super.y(view);
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).y(view);
        }
    }

    public final void z(Transition.d dVar) {
        super.z(dVar);
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f11056g);
        O(i.c(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
