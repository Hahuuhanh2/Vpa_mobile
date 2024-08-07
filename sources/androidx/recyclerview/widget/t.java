package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* compiled from: RecyclerView */
public final class t implements a.C0028a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3297a;

    public t(RecyclerView recyclerView) {
        this.f3297a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i10 = bVar.f3158a;
        if (i10 == 1) {
            this.f3297a.f2994u.i0(bVar.f3159b, bVar.f3161d);
        } else if (i10 == 2) {
            this.f3297a.f2994u.l0(bVar.f3159b, bVar.f3161d);
        } else if (i10 == 4) {
            RecyclerView recyclerView = this.f3297a;
            recyclerView.f2994u.n0(recyclerView, bVar.f3159b, bVar.f3161d);
        } else if (i10 == 8) {
            this.f3297a.f2994u.k0(bVar.f3159b, bVar.f3161d);
        }
    }

    public final RecyclerView.a0 b(int i10) {
        RecyclerView recyclerView = this.f3297a;
        int h10 = recyclerView.f2971f.h();
        int i11 = 0;
        RecyclerView.a0 a0Var = null;
        while (true) {
            if (i11 >= h10) {
                break;
            }
            RecyclerView.a0 O = RecyclerView.O(recyclerView.f2971f.g(i11));
            if (O != null && !O.j() && O.f3015c == i10) {
                if (!recyclerView.f2971f.k(O.f3013a)) {
                    a0Var = O;
                    break;
                }
                a0Var = O;
            }
            i11++;
        }
        if (a0Var == null) {
            return null;
        }
        if (!this.f3297a.f2971f.k(a0Var.f3013a)) {
            return a0Var;
        }
        boolean z10 = RecyclerView.I0;
        return null;
    }

    public final void c(Object obj, int i10, int i11) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f3297a;
        int h10 = recyclerView.f2971f.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g2 = recyclerView.f2971f.g(i15);
            RecyclerView.a0 O = RecyclerView.O(g2);
            if (O != null && !O.p() && (i13 = O.f3015c) >= i10 && i13 < i14) {
                O.b(2);
                O.a(obj);
                ((RecyclerView.LayoutParams) g2.getLayoutParams()).f3008c = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f2965c;
        int size = sVar.f3077c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.a0 a0Var = sVar.f3077c.get(size);
                if (a0Var != null && (i12 = a0Var.f3015c) >= i10 && i12 < i14) {
                    a0Var.b(2);
                    sVar.h(size);
                }
            } else {
                this.f3297a.f2993t0 = true;
                return;
            }
        }
    }

    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f3297a;
        int h10 = recyclerView.f2971f.h();
        for (int i12 = 0; i12 < h10; i12++) {
            RecyclerView.a0 O = RecyclerView.O(recyclerView.f2971f.g(i12));
            if (O != null && !O.p() && O.f3015c >= i10) {
                if (RecyclerView.J0) {
                    O.toString();
                }
                O.m(i11, false);
                recyclerView.f2985p0.f3102f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f2965c;
        int size = sVar.f3077c.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.a0 a0Var = sVar.f3077c.get(i13);
            if (a0Var != null && a0Var.f3015c >= i10) {
                if (RecyclerView.J0) {
                    a0Var.toString();
                }
                a0Var.m(i11, false);
            }
        }
        recyclerView.requestLayout();
        this.f3297a.f2991s0 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f3297a;
        int h10 = recyclerView.f2971f.h();
        int i19 = -1;
        if (i10 < i11) {
            i14 = i10;
            i13 = i11;
            i12 = -1;
        } else {
            i13 = i10;
            i14 = i11;
            i12 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            RecyclerView.a0 O = RecyclerView.O(recyclerView.f2971f.g(i20));
            if (O != null && (i18 = O.f3015c) >= i14 && i18 <= i13) {
                if (RecyclerView.J0) {
                    O.toString();
                }
                if (O.f3015c == i10) {
                    O.m(i11 - i10, false);
                } else {
                    O.m(i12, false);
                }
                recyclerView.f2985p0.f3102f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f2965c;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = sVar.f3077c.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.a0 a0Var = sVar.f3077c.get(i21);
            if (a0Var != null && (i17 = a0Var.f3015c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    a0Var.m(i11 - i10, false);
                } else {
                    a0Var.m(i19, false);
                }
                if (RecyclerView.J0) {
                    a0Var.toString();
                }
            }
        }
        recyclerView.requestLayout();
        this.f3297a.f2991s0 = true;
    }
}
