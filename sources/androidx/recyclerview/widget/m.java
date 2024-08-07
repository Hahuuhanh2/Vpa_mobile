package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSnapHelper */
public final class m extends x {

    /* renamed from: d  reason: collision with root package name */
    public p f3287d;

    /* renamed from: e  reason: collision with root package name */
    public o f3288e;

    public final int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.o()) {
            q i10 = i(mVar);
            iArr[0] = ((i10.c(view) / 2) + i10.e(view)) - ((i10.l() / 2) + i10.k());
        } else {
            iArr[0] = 0;
        }
        if (mVar.p()) {
            q j10 = j(mVar);
            iArr[1] = ((j10.c(view) / 2) + j10.e(view)) - ((j10.l() / 2) + j10.k());
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final View d(RecyclerView.m mVar) {
        if (mVar.p()) {
            return h(mVar, j(mVar));
        }
        if (mVar.o()) {
            return h(mVar, i(mVar));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r4 = r0 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(androidx.recyclerview.widget.RecyclerView.m r9, int r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.recyclerview.widget.RecyclerView.v.b
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.L()
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            android.view.View r2 = r8.d(r9)
            if (r2 != 0) goto L_0x0014
            return r1
        L_0x0014:
            int r2 = androidx.recyclerview.widget.RecyclerView.m.O(r2)
            if (r2 != r1) goto L_0x001b
            return r1
        L_0x001b:
            r3 = r9
            androidx.recyclerview.widget.RecyclerView$v$b r3 = (androidx.recyclerview.widget.RecyclerView.v.b) r3
            int r4 = r0 + -1
            android.graphics.PointF r3 = r3.a(r4)
            if (r3 != 0) goto L_0x0027
            return r1
        L_0x0027:
            boolean r5 = r9.o()
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x003f
            androidx.recyclerview.widget.q r5 = r8.i(r9)
            int r10 = r8.g(r9, r5, r10, r7)
            float r5 = r3.x
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0040
            int r10 = -r10
            goto L_0x0040
        L_0x003f:
            r10 = r7
        L_0x0040:
            boolean r5 = r9.p()
            if (r5 == 0) goto L_0x0056
            androidx.recyclerview.widget.q r5 = r8.j(r9)
            int r11 = r8.g(r9, r5, r7, r11)
            float r3 = r3.y
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0057
            int r11 = -r11
            goto L_0x0057
        L_0x0056:
            r11 = r7
        L_0x0057:
            boolean r9 = r9.p()
            if (r9 == 0) goto L_0x005e
            r10 = r11
        L_0x005e:
            if (r10 != 0) goto L_0x0061
            return r1
        L_0x0061:
            int r2 = r2 + r10
            if (r2 >= 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r7 = r2
        L_0x0066:
            if (r7 < r0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r4 = r7
        L_0x006a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.e(androidx.recyclerview.widget.RecyclerView$m, int, int):int");
    }

    public final int g(RecyclerView.m mVar, q qVar, int i10, int i11) {
        int i12;
        int max;
        this.f3304b.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f3304b.getFinalX(), this.f3304b.getFinalY()};
        int H = mVar.H();
        float f10 = 1.0f;
        if (H != 0) {
            View view = null;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i15 = 0; i15 < H; i15++) {
                View G = mVar.G(i15);
                int O = RecyclerView.m.O(G);
                if (O != -1) {
                    if (O < i14) {
                        view = G;
                        i14 = O;
                    }
                    if (O > i13) {
                        view2 = G;
                        i13 = O;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(qVar.b(view), qVar.b(view2)) - Math.min(qVar.e(view), qVar.e(view2))) == 0)) {
                f10 = (((float) max) * 1.0f) / ((float) ((i13 - i14) + 1));
            }
        }
        if (f10 <= 0.0f) {
            return 0;
        }
        if (Math.abs(iArr[0]) > Math.abs(iArr[1])) {
            i12 = iArr[0];
        } else {
            i12 = iArr[1];
        }
        return Math.round(((float) i12) / f10);
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
        o oVar = this.f3288e;
        if (oVar == null || oVar.f3290a != mVar) {
            this.f3288e = new o(mVar);
        }
        return this.f3288e;
    }

    public final q j(RecyclerView.m mVar) {
        p pVar = this.f3287d;
        if (pVar == null || pVar.f3290a != mVar) {
            this.f3287d = new p(mVar);
        }
        return this.f3287d;
    }
}
