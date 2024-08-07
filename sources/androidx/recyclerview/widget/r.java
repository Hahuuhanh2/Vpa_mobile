package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper */
public class r extends x {

    /* renamed from: d  reason: collision with root package name */
    public p f3293d;

    /* renamed from: e  reason: collision with root package name */
    public o f3294e;

    /* compiled from: PagerSnapHelper */
    public class a extends l {
        public a(Context context) {
            super(context);
        }

        public final void f(View view, RecyclerView.v.a aVar) {
            r rVar = r.this;
            int[] b10 = rVar.b(rVar.f3303a.getLayoutManager(), view);
            int i10 = b10[0];
            int i11 = b10[1];
            int l10 = l(Math.max(Math.abs(i10), Math.abs(i11)));
            if (l10 > 0) {
                DecelerateInterpolator decelerateInterpolator = this.f3280i;
                aVar.f3091a = i10;
                aVar.f3092b = i11;
                aVar.f3093c = l10;
                aVar.f3095e = decelerateInterpolator;
                aVar.f3096f = true;
            }
        }

        public final float k(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        public final int m(int i10) {
            return Math.min(100, super.m(i10));
        }
    }

    public int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.o()) {
            iArr[0] = g(view, i(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.p()) {
            iArr[1] = g(view, j(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final RecyclerView.v c(RecyclerView.m mVar) {
        if (!(mVar instanceof RecyclerView.v.b)) {
            return null;
        }
        return new a(this.f3303a.getContext());
    }

    @SuppressLint({"UnknownNullness"})
    public View d(RecyclerView.m mVar) {
        if (mVar.p()) {
            return h(mVar, j(mVar));
        }
        if (mVar.o()) {
            return h(mVar, i(mVar));
        }
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public int e(RecyclerView.m mVar, int i10, int i11) {
        q qVar;
        boolean z10;
        PointF a10;
        int L = mVar.L();
        if (L == 0) {
            return -1;
        }
        View view = null;
        if (mVar.p()) {
            qVar = j(mVar);
        } else if (mVar.o()) {
            qVar = i(mVar);
        } else {
            qVar = null;
        }
        if (qVar == null) {
            return -1;
        }
        int H = mVar.H();
        boolean z11 = false;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < H; i14++) {
            View G = mVar.G(i14);
            if (G != null) {
                int g2 = g(G, qVar);
                if (g2 <= 0 && g2 > i13) {
                    view2 = G;
                    i13 = g2;
                }
                if (g2 >= 0 && g2 < i12) {
                    view = G;
                    i12 = g2;
                }
            }
        }
        int i15 = 1;
        if (!mVar.o() ? i11 <= 0 : i10 <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && view != null) {
            return RecyclerView.m.O(view);
        }
        if (!z10 && view2 != null) {
            return RecyclerView.m.O(view2);
        }
        if (z10) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int O = RecyclerView.m.O(view);
        int L2 = mVar.L();
        if ((mVar instanceof RecyclerView.v.b) && (a10 = ((RecyclerView.v.b) mVar).a(L2 - 1)) != null && (a10.x < 0.0f || a10.y < 0.0f)) {
            z11 = true;
        }
        if (z11 == z10) {
            i15 = -1;
        }
        int i16 = O + i15;
        if (i16 < 0 || i16 >= L) {
            return -1;
        }
        return i16;
    }

    public final int g(View view, q qVar) {
        return ((qVar.c(view) / 2) + qVar.e(view)) - ((qVar.l() / 2) + qVar.k());
    }

    public final View h(RecyclerView.m mVar, q qVar) {
        int H = mVar.H();
        View view = null;
        if (H == 0) {
            return null;
        }
        int l10 = (qVar.l() / 2) + qVar.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < H; i11++) {
            View G = mVar.G(i11);
            int abs = Math.abs(((qVar.c(G) / 2) + qVar.e(G)) - l10);
            if (abs < i10) {
                view = G;
                i10 = abs;
            }
        }
        return view;
    }

    public final q i(RecyclerView.m mVar) {
        o oVar = this.f3294e;
        if (oVar == null || oVar.f3290a != mVar) {
            this.f3294e = new o(mVar);
        }
        return this.f3294e;
    }

    public final q j(RecyclerView.m mVar) {
        p pVar = this.f3293d;
        if (pVar == null || pVar.f3290a != mVar) {
            this.f3293d = new p(mVar);
        }
        return this.f3293d;
    }
}
