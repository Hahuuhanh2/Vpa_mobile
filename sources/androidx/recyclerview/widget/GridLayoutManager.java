package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import f0.b0;
import java.util.Arrays;
import java.util.WeakHashMap;
import v.v;
import w1.d0;
import w1.q0;
import x1.f;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean M = false;
    public int N = -1;
    public int[] O;
    public View[] P;
    public final SparseIntArray Q = new SparseIntArray();
    public final SparseIntArray R = new SparseIntArray();
    public a S = new a();
    public final Rect T = new Rect();

    public static final class a extends b {
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f2932a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f2933b = new SparseIntArray();

        public static int a(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i12++;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = 1;
                }
            }
            return i12 + 1 > i11 ? i13 + 1 : i13;
        }

        public final void b() {
            this.f2932a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        C1(RecyclerView.m.P(context, attributeSet, i10, i11).f3065b);
    }

    public final int A1(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        if (!wVar.f3103g) {
            this.S.getClass();
            return 1;
        }
        int i11 = this.Q.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (sVar.b(i10) == -1) {
            return 1;
        }
        this.S.getClass();
        return 1;
    }

    public final int B0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        D1();
        View[] viewArr = this.P;
        if (viewArr == null || viewArr.length != this.N) {
            this.P = new View[this.N];
        }
        return super.B0(i10, sVar, wVar);
    }

    public final void B1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        boolean z11;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f3007b;
        int i13 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i14 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int x12 = x1(layoutParams.f2930e, layoutParams.f2931f);
        if (this.f2934x == 1) {
            i11 = RecyclerView.m.I(x12, i10, i14, layoutParams.width, false);
            i12 = RecyclerView.m.I(this.f2936z.l(), this.f3059u, i13, layoutParams.height, true);
        } else {
            int I = RecyclerView.m.I(x12, i10, i13, layoutParams.height, false);
            int I2 = RecyclerView.m.I(this.f2936z.l(), this.f3058t, i14, layoutParams.width, true);
            i12 = I;
            i11 = I2;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z10) {
            z11 = L0(view, i11, i12, layoutParams2);
        } else {
            z11 = J0(view, i11, i12, layoutParams2);
        }
        if (z11) {
            view.measure(i11, i12);
        }
    }

    public final RecyclerView.LayoutParams C() {
        if (this.f2934x == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    public final void C1(int i10) {
        if (i10 != this.N) {
            this.M = true;
            if (i10 >= 1) {
                this.N = i10;
                this.S.b();
                A0();
                return;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.m("Span count should be at least 1. Provided ", i10));
        }
    }

    public final RecyclerView.LayoutParams D(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final int D0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        D1();
        View[] viewArr = this.P;
        if (viewArr == null || viewArr.length != this.N) {
            this.P = new View[this.N];
        }
        return super.D0(i10, sVar, wVar);
    }

    public final void D1() {
        int i10;
        int i11;
        if (this.f2934x == 1) {
            i11 = this.f3060v - getPaddingRight();
            i10 = getPaddingLeft();
        } else {
            i11 = this.f3061w - getPaddingBottom();
            i10 = getPaddingTop();
        }
        w1(i11 - i10);
    }

    public final RecyclerView.LayoutParams E(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public final void G0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.O == null) {
            super.G0(rect, i10, i11);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f2934x == 1) {
            int height = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f3047b;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            i13 = RecyclerView.m.r(i11, height, d0.d.d(recyclerView));
            int[] iArr = this.O;
            i12 = RecyclerView.m.r(i10, iArr[iArr.length - 1] + paddingRight, d0.d.e(this.f3047b));
        } else {
            int width = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f3047b;
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            i12 = RecyclerView.m.r(i10, width, d0.d.e(recyclerView2));
            int[] iArr2 = this.O;
            i13 = RecyclerView.m.r(i11, iArr2[iArr2.length - 1] + paddingBottom, d0.d.d(this.f3047b));
        }
        this.f3047b.setMeasuredDimension(i12, i13);
    }

    public final int J(RecyclerView.s sVar, RecyclerView.w wVar) {
        if (this.f2934x == 1) {
            return this.N;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return y1(wVar.b() - 1, sVar, wVar) + 1;
    }

    public final boolean O0() {
        if (this.H != null || this.M) {
            return false;
        }
        return true;
    }

    public final void Q0(RecyclerView.w wVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        boolean z10;
        int i10 = this.N;
        int i11 = 0;
        while (i11 < this.N) {
            int i12 = cVar.f2952d;
            if (i12 < 0 || i12 >= wVar.b()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && i10 > 0) {
                ((j.b) cVar2).a(cVar.f2952d, Math.max(0, cVar.f2955g));
                this.S.getClass();
                i10--;
                cVar.f2952d += cVar.f2953e;
                i11++;
            } else {
                return;
            }
        }
    }

    public final int R(RecyclerView.s sVar, RecyclerView.w wVar) {
        if (this.f2934x == 0) {
            return this.N;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return y1(wVar.b() - 1, sVar, wVar) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e1, code lost:
        if (r13 == r5) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0111, code lost:
        if (r13 == r5) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0.f3046a.k(r3) != false) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View d0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.s r25, androidx.recyclerview.widget.RecyclerView.w r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.f3047b
            r4 = 0
            if (r3 != 0) goto L_0x000f
            r5 = r23
        L_0x000d:
            r3 = r4
            goto L_0x0021
        L_0x000f:
            r5 = r23
            android.view.View r3 = r3.E(r5)
            if (r3 != 0) goto L_0x0018
        L_0x0017:
            goto L_0x000d
        L_0x0018:
            androidx.recyclerview.widget.b r6 = r0.f3046a
            boolean r6 = r6.k(r3)
            if (r6 == 0) goto L_0x0021
            goto L_0x0017
        L_0x0021:
            if (r3 != 0) goto L_0x0024
            return r4
        L_0x0024:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r6 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r6
            int r7 = r6.f2930e
            int r6 = r6.f2931f
            int r6 = r6 + r7
            android.view.View r5 = super.d0(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0036
            return r4
        L_0x0036:
            r5 = r24
            int r5 = r0.U0(r5)
            r8 = 1
            if (r5 != r8) goto L_0x0041
            r5 = r8
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            boolean r10 = r0.C
            if (r5 == r10) goto L_0x0048
            r5 = r8
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            r10 = -1
            if (r5 == 0) goto L_0x0054
            int r5 = r22.H()
            int r5 = r5 - r8
            r11 = r10
            r12 = r11
            goto L_0x005b
        L_0x0054:
            int r5 = r22.H()
            r11 = r5
            r12 = r8
            r5 = 0
        L_0x005b:
            int r13 = r0.f2934x
            if (r13 != r8) goto L_0x0067
            boolean r13 = r22.j1()
            if (r13 == 0) goto L_0x0067
            r13 = r8
            goto L_0x0068
        L_0x0067:
            r13 = 0
        L_0x0068:
            int r14 = r0.y1(r5, r1, r2)
            r9 = r10
            r15 = r9
            r16 = r12
            r8 = 0
            r12 = 0
            r10 = r5
            r5 = r4
        L_0x0074:
            if (r10 == r11) goto L_0x0155
            r17 = r11
            int r11 = r0.y1(r10, r1, r2)
            android.view.View r1 = r0.G(r10)
            if (r1 != r3) goto L_0x0084
            goto L_0x0155
        L_0x0084:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x009a
            if (r11 == r14) goto L_0x009a
            if (r4 == 0) goto L_0x0090
            goto L_0x0155
        L_0x0090:
            r18 = r3
            r21 = r5
            r19 = r8
            r20 = 1
            goto L_0x0145
        L_0x009a:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r11 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r11
            int r2 = r11.f2930e
            r18 = r3
            int r3 = r11.f2931f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b2
            if (r2 != r7) goto L_0x00b2
            if (r3 != r6) goto L_0x00b2
            return r1
        L_0x00b2:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00ba
            if (r4 == 0) goto L_0x00c2
        L_0x00ba:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c5
            if (r5 != 0) goto L_0x00c5
        L_0x00c2:
            r21 = r5
            goto L_0x00e3
        L_0x00c5:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e9
            if (r5 <= r8) goto L_0x00da
            goto L_0x00e3
        L_0x00da:
            if (r5 != r8) goto L_0x0116
            if (r2 <= r15) goto L_0x00e0
            r5 = 1
            goto L_0x00e1
        L_0x00e0:
            r5 = 0
        L_0x00e1:
            if (r13 != r5) goto L_0x0116
        L_0x00e3:
            r19 = r8
            r5 = 1
            r20 = 1
            goto L_0x011b
        L_0x00e9:
            if (r4 != 0) goto L_0x0116
            r19 = r8
            androidx.recyclerview.widget.z r8 = r0.f3048c
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00ff
            androidx.recyclerview.widget.z r8 = r0.f3049d
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00ff
            r8 = 1
            goto L_0x0100
        L_0x00ff:
            r8 = 0
        L_0x0100:
            r20 = 1
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x011a
            if (r5 <= r12) goto L_0x0109
            goto L_0x0113
        L_0x0109:
            if (r5 != r12) goto L_0x011a
            if (r2 <= r9) goto L_0x0110
            r5 = r20
            goto L_0x0111
        L_0x0110:
            r5 = 0
        L_0x0111:
            if (r13 != r5) goto L_0x011a
        L_0x0113:
            r5 = r20
            goto L_0x011b
        L_0x0116:
            r19 = r8
            r20 = 1
        L_0x011a:
            r5 = 0
        L_0x011b:
            if (r5 == 0) goto L_0x0145
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x0134
            int r4 = r11.f2930e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r8 = r3 - r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x0149
        L_0x0134:
            int r5 = r11.f2930e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r9 = r5
            r8 = r19
            r5 = r1
            goto L_0x0149
        L_0x0145:
            r8 = r19
            r5 = r21
        L_0x0149:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            goto L_0x0074
        L_0x0155:
            r21 = r5
            if (r4 == 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r4 = r21
        L_0x015c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.d0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    public final View d1(RecyclerView.s sVar, RecyclerView.w wVar, boolean z10, boolean z11) {
        int i10;
        int H = H();
        int i11 = -1;
        if (z11) {
            i10 = H() - 1;
            H = -1;
        } else {
            i10 = 0;
            i11 = 1;
        }
        int b10 = wVar.b();
        V0();
        int k10 = this.f2936z.k();
        int g2 = this.f2936z.g();
        View view = null;
        View view2 = null;
        while (i10 != H) {
            View G = G(i10);
            int O2 = RecyclerView.m.O(G);
            if (O2 >= 0 && O2 < b10 && z1(O2, sVar, wVar) == 0) {
                if (((RecyclerView.LayoutParams) G.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = G;
                    }
                } else if (this.f2936z.e(G) < g2 && this.f2936z.b(G) >= k10) {
                    return G;
                } else {
                    if (view == null) {
                        view = G;
                    }
                }
            }
            i10 += i11;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public final void f0(RecyclerView.s sVar, RecyclerView.w wVar, f fVar) {
        super.f0(sVar, wVar, fVar);
        fVar.i(GridView.class.getName());
    }

    public final void h0(RecyclerView.s sVar, RecyclerView.w wVar, View view, f fVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            g0(view, fVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int y12 = y1(layoutParams2.a(), sVar, wVar);
        if (this.f2934x == 0) {
            fVar.j(f.g.a(layoutParams2.f2930e, layoutParams2.f2931f, y12, 1, false, false));
            return;
        }
        fVar.j(f.g.a(y12, 1, layoutParams2.f2930e, layoutParams2.f2931f, false, false));
    }

    public final void i0(int i10, int i11) {
        this.S.b();
        this.S.f2933b.clear();
    }

    public final void j0() {
        this.S.b();
        this.S.f2933b.clear();
    }

    public final void k0(int i10, int i11) {
        this.S.b();
        this.S.f2933b.clear();
    }

    public final void k1(RecyclerView.s sVar, RecyclerView.w wVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z12;
        boolean z13;
        View b10;
        RecyclerView.s sVar2 = sVar;
        RecyclerView.w wVar2 = wVar;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int j10 = this.f2936z.j();
        int i22 = 1;
        if (j10 != 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (H() > 0) {
            i10 = this.O[this.N];
        } else {
            i10 = 0;
        }
        if (z10) {
            D1();
        }
        if (cVar2.f2953e == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i23 = this.N;
        if (!z11) {
            i23 = z1(cVar2.f2952d, sVar2, wVar2) + A1(cVar2.f2952d, sVar2, wVar2);
        }
        int i24 = 0;
        while (i24 < this.N) {
            int i25 = cVar2.f2952d;
            if (i25 < 0 || i25 >= wVar.b()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z13 || i23 <= 0) {
                break;
            }
            int i26 = cVar2.f2952d;
            int A1 = A1(i26, sVar2, wVar2);
            if (A1 <= this.N) {
                i23 -= A1;
                if (i23 < 0 || (b10 = cVar2.b(sVar2)) == null) {
                    break;
                }
                this.P[i24] = b10;
                i24++;
            } else {
                throw new IllegalArgumentException(v.e(b0.u("Item at position ", i26, " requires ", A1, " spans but GridLayoutManager has only "), this.N, " spans."));
            }
        }
        if (i24 == 0) {
            bVar2.f2946b = true;
            return;
        }
        if (z11) {
            i12 = 0;
            i11 = i24;
        } else {
            i12 = i24 - 1;
            i22 = -1;
            i11 = -1;
        }
        int i27 = 0;
        while (i12 != i11) {
            View view = this.P[i12];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int A12 = A1(RecyclerView.m.O(view), sVar2, wVar2);
            layoutParams.f2931f = A12;
            layoutParams.f2930e = i27;
            i27 += A12;
            i12 += i22;
        }
        float f10 = 0.0f;
        int i28 = 0;
        for (int i29 = 0; i29 < i24; i29++) {
            View view2 = this.P[i29];
            if (cVar2.f2959k != null) {
                z12 = false;
                if (z11) {
                    l(view2, -1, true);
                } else {
                    l(view2, 0, true);
                }
            } else if (z11) {
                z12 = false;
                l(view2, -1, false);
            } else {
                z12 = false;
                l(view2, 0, false);
            }
            n(view2, this.T);
            B1(view2, j10, z12);
            int c10 = this.f2936z.c(view2);
            if (c10 > i28) {
                i28 = c10;
            }
            float d10 = (((float) this.f2936z.d(view2)) * 1.0f) / ((float) ((LayoutParams) view2.getLayoutParams()).f2931f);
            if (d10 > f10) {
                f10 = d10;
            }
        }
        if (z10) {
            w1(Math.max(Math.round(f10 * ((float) this.N)), i10));
            i28 = 0;
            for (int i30 = 0; i30 < i24; i30++) {
                View view3 = this.P[i30];
                B1(view3, 1073741824, true);
                int c11 = this.f2936z.c(view3);
                if (c11 > i28) {
                    i28 = c11;
                }
            }
        }
        for (int i31 = 0; i31 < i24; i31++) {
            View view4 = this.P[i31];
            if (this.f2936z.c(view4) != i28) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect = layoutParams2.f3007b;
                int i32 = rect.top + rect.bottom + layoutParams2.topMargin + layoutParams2.bottomMargin;
                int i33 = rect.left + rect.right + layoutParams2.leftMargin + layoutParams2.rightMargin;
                int x12 = x1(layoutParams2.f2930e, layoutParams2.f2931f);
                if (this.f2934x == 1) {
                    i21 = RecyclerView.m.I(x12, 1073741824, i33, layoutParams2.width, false);
                    i20 = View.MeasureSpec.makeMeasureSpec(i28 - i32, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i28 - i33, 1073741824);
                    i20 = RecyclerView.m.I(x12, 1073741824, i32, layoutParams2.height, false);
                    i21 = makeMeasureSpec;
                }
                if (L0(view4, i21, i20, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(i21, i20);
                }
            }
        }
        bVar2.f2945a = i28;
        if (this.f2934x == 1) {
            if (cVar2.f2954f == -1) {
                i19 = cVar2.f2950b;
                i18 = i19 - i28;
            } else {
                i18 = cVar2.f2950b;
                i19 = i28 + i18;
            }
            i14 = 0;
            i13 = i18;
            i15 = i19;
            i16 = 0;
        } else {
            if (cVar2.f2954f == -1) {
                i16 = cVar2.f2950b;
                i17 = i16 - i28;
            } else {
                i17 = cVar2.f2950b;
                i16 = i28 + i17;
            }
            i13 = 0;
            i14 = i17;
            i15 = 0;
        }
        for (int i34 = 0; i34 < i24; i34++) {
            View view5 = this.P[i34];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (this.f2934x != 1) {
                int paddingTop = getPaddingTop() + this.O[layoutParams3.f2930e];
                i13 = paddingTop;
                i15 = this.f2936z.d(view5) + paddingTop;
            } else if (j1()) {
                i16 = getPaddingLeft() + this.O[this.N - layoutParams3.f2930e];
                i14 = i16 - this.f2936z.d(view5);
            } else {
                i14 = this.O[layoutParams3.f2930e] + getPaddingLeft();
                i16 = this.f2936z.d(view5) + i14;
            }
            RecyclerView.m.W(view5, i14, i13, i16, i15);
            if (layoutParams3.e() || layoutParams3.d()) {
                bVar2.f2947c = true;
            }
            bVar2.f2948d = view5.hasFocusable() | bVar2.f2948d;
        }
        Arrays.fill(this.P, (Object) null);
    }

    public final void l0(int i10, int i11) {
        this.S.b();
        this.S.f2933b.clear();
    }

    public final void l1(RecyclerView.s sVar, RecyclerView.w wVar, LinearLayoutManager.a aVar, int i10) {
        boolean z10;
        D1();
        if (wVar.b() > 0 && !wVar.f3103g) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int z12 = z1(aVar.f2941b, sVar, wVar);
            if (z10) {
                while (z12 > 0) {
                    int i11 = aVar.f2941b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f2941b = i12;
                    z12 = z1(i12, sVar, wVar);
                }
            } else {
                int b10 = wVar.b() - 1;
                int i13 = aVar.f2941b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int z13 = z1(i14, sVar, wVar);
                    if (z13 <= z12) {
                        break;
                    }
                    i13 = i14;
                    z12 = z13;
                }
                aVar.f2941b = i13;
            }
        }
        View[] viewArr = this.P;
        if (viewArr == null || viewArr.length != this.N) {
            this.P = new View[this.N];
        }
    }

    public final void n0(RecyclerView recyclerView, int i10, int i11) {
        this.S.b();
        this.S.f2933b.clear();
    }

    public final void o0(RecyclerView.s sVar, RecyclerView.w wVar) {
        if (wVar.f3103g) {
            int H = H();
            for (int i10 = 0; i10 < H; i10++) {
                LayoutParams layoutParams = (LayoutParams) G(i10).getLayoutParams();
                int a10 = layoutParams.a();
                this.Q.put(a10, layoutParams.f2931f);
                this.R.put(a10, layoutParams.f2930e);
            }
        }
        super.o0(sVar, wVar);
        this.Q.clear();
        this.R.clear();
    }

    public final void p0(RecyclerView.w wVar) {
        super.p0(wVar);
        this.M = false;
    }

    public final boolean q(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void s1(boolean z10) {
        if (!z10) {
            super.s1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int v(RecyclerView.w wVar) {
        return S0(wVar);
    }

    public final int w(RecyclerView.w wVar) {
        return T0(wVar);
    }

    public final void w1(int i10) {
        int i11;
        int[] iArr = this.O;
        int i12 = this.N;
        if (!(iArr != null && iArr.length == i12 + 1 && iArr[iArr.length - 1] == i10)) {
            iArr = new int[(i12 + 1)];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.O = iArr;
    }

    public final int x1(int i10, int i11) {
        if (this.f2934x != 1 || !j1()) {
            int[] iArr = this.O;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.O;
        int i12 = this.N;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int y(RecyclerView.w wVar) {
        return S0(wVar);
    }

    public final int y1(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        if (!wVar.f3103g) {
            a aVar = this.S;
            int i11 = this.N;
            aVar.getClass();
            return b.a(i10, i11);
        }
        int b10 = sVar.b(i10);
        if (b10 == -1) {
            return 0;
        }
        a aVar2 = this.S;
        int i12 = this.N;
        aVar2.getClass();
        return b.a(b10, i12);
    }

    public final int z(RecyclerView.w wVar) {
        return T0(wVar);
    }

    public final int z1(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        if (!wVar.f3103g) {
            a aVar = this.S;
            int i11 = this.N;
            aVar.getClass();
            return i10 % i11;
        }
        int i12 = this.R.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int b10 = sVar.b(i10);
        if (b10 == -1) {
            return 0;
        }
        a aVar2 = this.S;
        int i13 = this.N;
        aVar2.getClass();
        return b10 % i13;
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e  reason: collision with root package name */
        public int f2930e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2931f = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(int i10, int i11) {
        super(1);
        C1(i10);
    }

    public GridLayoutManager(int i10) {
        super(1);
        C1(i10);
    }
}
