package com.ots.core.utils.commom;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.WeakHashMap;
import sk.j;
import w1.d0;
import w1.q0;

/* compiled from: PickerLayoutManager.kt */
public final class PickerLayoutManager extends LinearLayoutManager {
    public final m M = new m();
    public final int N;
    public final float O;
    public final boolean P;
    public RecyclerView Q;
    public a R;

    /* compiled from: PickerLayoutManager.kt */
    public interface a {
        void i(int i10, RecyclerView recyclerView);
    }

    public PickerLayoutManager(int i10, int i11, float f10, boolean z10) {
        super(i10);
        this.N = i11;
        this.P = z10;
        this.O = f10;
    }

    public final int B0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        x1();
        return super.B0(i10, sVar, wVar);
    }

    public final int D0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        y1();
        return super.D0(i10, sVar, wVar);
    }

    public final boolean U() {
        if (this.N == 0) {
            return true;
        }
        return false;
    }

    public final void b0(RecyclerView recyclerView) {
        j.f(recyclerView, "recyclerView");
        this.Q = recyclerView;
        recyclerView.setClipToPadding(false);
        this.M.a(this.Q);
    }

    public final void c0(RecyclerView recyclerView) {
        this.Q = null;
    }

    public final void o0(RecyclerView.s sVar, RecyclerView.w wVar) {
        j.f(sVar, "recycler");
        j.f(wVar, "state");
        super.o0(sVar, wVar);
        if (L() >= 0 && !wVar.f3103g) {
            int i10 = this.f2934x;
            if (i10 == 0) {
                x1();
            } else if (i10 == 1) {
                y1();
            }
        }
    }

    public final void q0(RecyclerView.s sVar, RecyclerView.w wVar, int i10, int i11) {
        j.f(sVar, "recycler");
        j.f(wVar, "state");
        int paddingRight = getPaddingRight() + getPaddingLeft();
        RecyclerView recyclerView = this.Q;
        j.c(recyclerView);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int r10 = RecyclerView.m.r(i10, paddingRight, d0.d.e(recyclerView));
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        RecyclerView recyclerView2 = this.Q;
        j.c(recyclerView2);
        int r11 = RecyclerView.m.r(i11, paddingBottom, d0.d.d(recyclerView2));
        if (!(wVar.b() == 0 || this.N == 0)) {
            View d10 = sVar.d(0);
            j.e(d10, "getViewForPosition(...)");
            X(d10, i10, i11);
            int i12 = this.f2934x;
            if (i12 == 0) {
                int measuredWidth = d10.getMeasuredWidth();
                int i13 = ((this.N - 1) / 2) * measuredWidth;
                RecyclerView recyclerView3 = this.Q;
                j.c(recyclerView3);
                recyclerView3.setPadding(i13, 0, i13, 0);
                r10 = measuredWidth * this.N;
            } else if (i12 == 1) {
                int measuredHeight = d10.getMeasuredHeight();
                int i14 = ((this.N - 1) / 2) * measuredHeight;
                RecyclerView recyclerView4 = this.Q;
                j.c(recyclerView4);
                recyclerView4.setPadding(0, i14, 0, i14);
                r11 = measuredHeight * this.N;
            }
        }
        this.f3047b.setMeasuredDimension(r10, r11);
    }

    public final void t0(int i10) {
        RecyclerView recyclerView;
        a aVar;
        if (i10 == 0 && (recyclerView = this.Q) != null && (aVar = this.R) != null) {
            aVar.i(w1(), recyclerView);
        }
    }

    public final int w1() {
        View d10 = this.M.d(this);
        if (d10 == null) {
            return 0;
        }
        return RecyclerView.m.O(d10);
    }

    public final void x1() {
        float f10 = ((float) this.f3060v) / 2.0f;
        int H = H();
        for (int i10 = 0; i10 < H; i10++) {
            View G = G(i10);
            if (G != null) {
                int left = G.getLeft() - RecyclerView.m.N(G);
                int right = G.getRight();
                float f11 = ((float) 1) - this.O;
                float min = ((Math.min(f10, Math.abs(f10 - (((float) ((RecyclerView.m.Q(G) + right) + left)) / 2.0f))) * (f11 * ((float) -1))) / f10) + 1.0f;
                G.setScaleX(min);
                G.setScaleY(min);
                if (this.P) {
                    G.setAlpha(min);
                }
            }
        }
    }

    public final void y1() {
        float f10 = ((float) this.f3061w) / 2.0f;
        int H = H();
        for (int i10 = 0; i10 < H; i10++) {
            View G = G(i10);
            if (G != null) {
                int top = G.getTop() - RecyclerView.m.S(G);
                int bottom = G.getBottom();
                float f11 = ((float) 1) - this.O;
                float min = ((Math.min(f10, Math.abs(f10 - (((float) ((RecyclerView.m.F(G) + bottom) + top)) / 2.0f))) * (f11 * ((float) -1))) / f10) + 1.0f;
                G.setScaleX(min);
                G.setScaleY(min);
                if (this.P) {
                    G.setAlpha(min);
                }
            }
        }
    }
}
