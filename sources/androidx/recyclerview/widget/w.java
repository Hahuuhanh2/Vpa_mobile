package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator */
public abstract class w extends RecyclerView.j {

    /* renamed from: g  reason: collision with root package name */
    public boolean f3302g = true;

    public final boolean a(RecyclerView.a0 a0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i10;
        int i11;
        if (cVar == null || ((i10 = cVar.f3043a) == (i11 = cVar2.f3043a) && cVar.f3044b == cVar2.f3044b)) {
            o(a0Var);
            return true;
        }
        return q(a0Var, i10, cVar.f3044b, i11, cVar2.f3044b);
    }

    public final boolean b(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f3043a;
        int i13 = cVar.f3044b;
        if (a0Var2.p()) {
            int i14 = cVar.f3043a;
            i10 = cVar.f3044b;
            i11 = i14;
        } else {
            i11 = cVar2.f3043a;
            i10 = cVar2.f3044b;
        }
        return p(a0Var, a0Var2, i12, i13, i11, i10);
    }

    public final boolean c(RecyclerView.a0 a0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f3043a;
        int i13 = cVar.f3044b;
        View view = a0Var.f3013a;
        if (cVar2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = cVar2.f3043a;
        }
        int i14 = i10;
        if (cVar2 == null) {
            i11 = view.getTop();
        } else {
            i11 = cVar2.f3044b;
        }
        int i15 = i11;
        if (a0Var.j() || (i12 == i14 && i13 == i15)) {
            r(a0Var);
            return true;
        }
        view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
        return q(a0Var, i12, i13, i14, i15);
    }

    public final boolean d(RecyclerView.a0 a0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i10 = cVar.f3043a;
        int i11 = cVar2.f3043a;
        if (i10 == i11 && cVar.f3044b == cVar2.f3044b) {
            h(a0Var);
            return false;
        }
        return q(a0Var, i10, cVar.f3044b, i11, cVar2.f3044b);
    }

    public final boolean f(RecyclerView.a0 a0Var) {
        if (!this.f3302g || a0Var.h()) {
            return true;
        }
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract void o(RecyclerView.a0 a0Var);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean p(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean q(RecyclerView.a0 a0Var, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    public abstract void r(RecyclerView.a0 a0Var);
}
