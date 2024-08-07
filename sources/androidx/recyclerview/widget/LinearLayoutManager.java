package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.m implements RecyclerView.v.b {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public SavedState H;
    public final a I;
    public final b J;
    public int K;
    public int[] L;

    /* renamed from: x  reason: collision with root package name */
    public int f2934x;

    /* renamed from: y  reason: collision with root package name */
    public c f2935y;

    /* renamed from: z  reason: collision with root package name */
    public q f2936z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2937a;

        /* renamed from: b  reason: collision with root package name */
        public int f2938b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2939c;

        public class a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2937a);
            parcel.writeInt(this.f2938b);
            parcel.writeInt(this.f2939c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f2937a = parcel.readInt();
            this.f2938b = parcel.readInt();
            this.f2939c = parcel.readInt() != 1 ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f2937a = savedState.f2937a;
            this.f2938b = savedState.f2938b;
            this.f2939c = savedState.f2939c;
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public q f2940a;

        /* renamed from: b  reason: collision with root package name */
        public int f2941b;

        /* renamed from: c  reason: collision with root package name */
        public int f2942c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2943d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2944e;

        public a() {
            d();
        }

        public final void a() {
            int i10;
            if (this.f2943d) {
                i10 = this.f2940a.g();
            } else {
                i10 = this.f2940a.k();
            }
            this.f2942c = i10;
        }

        public final void b(int i10, View view) {
            if (this.f2943d) {
                this.f2942c = this.f2940a.m() + this.f2940a.b(view);
            } else {
                this.f2942c = this.f2940a.e(view);
            }
            this.f2941b = i10;
        }

        public final void c(int i10, View view) {
            int m10 = this.f2940a.m();
            if (m10 >= 0) {
                b(i10, view);
                return;
            }
            this.f2941b = i10;
            if (this.f2943d) {
                int g2 = (this.f2940a.g() - m10) - this.f2940a.b(view);
                this.f2942c = this.f2940a.g() - g2;
                if (g2 > 0) {
                    int c10 = this.f2942c - this.f2940a.c(view);
                    int k10 = this.f2940a.k();
                    int min = c10 - (Math.min(this.f2940a.e(view) - k10, 0) + k10);
                    if (min < 0) {
                        this.f2942c = Math.min(g2, -min) + this.f2942c;
                        return;
                    }
                    return;
                }
                return;
            }
            int e10 = this.f2940a.e(view);
            int k11 = e10 - this.f2940a.k();
            this.f2942c = e10;
            if (k11 > 0) {
                int g10 = (this.f2940a.g() - Math.min(0, (this.f2940a.g() - m10) - this.f2940a.b(view))) - (this.f2940a.c(view) + e10);
                if (g10 < 0) {
                    this.f2942c -= Math.min(k11, -g10);
                }
            }
        }

        public final void d() {
            this.f2941b = -1;
            this.f2942c = Integer.MIN_VALUE;
            this.f2943d = false;
            this.f2944e = false;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("AnchorInfo{mPosition=");
            q10.append(this.f2941b);
            q10.append(", mCoordinate=");
            q10.append(this.f2942c);
            q10.append(", mLayoutFromEnd=");
            q10.append(this.f2943d);
            q10.append(", mValid=");
            q10.append(this.f2944e);
            q10.append('}');
            return q10.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2945a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2946b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2947c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2948d;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2949a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f2950b;

        /* renamed from: c  reason: collision with root package name */
        public int f2951c;

        /* renamed from: d  reason: collision with root package name */
        public int f2952d;

        /* renamed from: e  reason: collision with root package name */
        public int f2953e;

        /* renamed from: f  reason: collision with root package name */
        public int f2954f;

        /* renamed from: g  reason: collision with root package name */
        public int f2955g;

        /* renamed from: h  reason: collision with root package name */
        public int f2956h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f2957i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f2958j;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.a0> f2959k = null;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2960l;

        public final void a(View view) {
            int a10;
            int size = this.f2959k.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f2959k.get(i11).f3013a;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.e() && (a10 = (layoutParams.a() - this.f2952d) * this.f2953e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            if (view2 == null) {
                this.f2952d = -1;
            } else {
                this.f2952d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).a();
            }
        }

        public final View b(RecyclerView.s sVar) {
            List<RecyclerView.a0> list = this.f2959k;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    View view = this.f2959k.get(i10).f3013a;
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    if (!layoutParams.e() && this.f2952d == layoutParams.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View d10 = sVar.d(this.f2952d);
            this.f2952d += this.f2953e;
            return d10;
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    @SuppressLint({"UnknownNullness"})
    public final View B(int i10) {
        int H2 = H();
        if (H2 == 0) {
            return null;
        }
        int O = i10 - RecyclerView.m.O(G(0));
        if (O >= 0 && O < H2) {
            View G2 = G(O);
            if (RecyclerView.m.O(G2) == i10) {
                return G2;
            }
        }
        return super.B(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public int B0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        if (this.f2934x == 1) {
            return 0;
        }
        return p1(i10, sVar, wVar);
    }

    @SuppressLint({"UnknownNullness"})
    public RecyclerView.LayoutParams C() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final void C0(int i10) {
        this.F = i10;
        this.G = Integer.MIN_VALUE;
        SavedState savedState = this.H;
        if (savedState != null) {
            savedState.f2937a = -1;
        }
        A0();
    }

    @SuppressLint({"UnknownNullness"})
    public int D0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        if (this.f2934x == 0) {
            return 0;
        }
        return p1(i10, sVar, wVar);
    }

    public final boolean K0() {
        boolean z10;
        if (!(this.f3059u == 1073741824 || this.f3058t == 1073741824)) {
            int H2 = H();
            int i10 = 0;
            while (true) {
                if (i10 >= H2) {
                    z10 = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = G(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar, int i10) {
        l lVar = new l(recyclerView.getContext());
        lVar.f3084a = i10;
        N0(lVar);
    }

    public boolean O0() {
        if (this.H == null && this.A == this.D) {
            return true;
        }
        return false;
    }

    public void P0(RecyclerView.w wVar, int[] iArr) {
        int i10;
        int i12 = i1(wVar);
        if (this.f2935y.f2954f == -1) {
            i10 = 0;
        } else {
            i10 = i12;
            i12 = 0;
        }
        iArr[0] = i12;
        iArr[1] = i10;
    }

    public void Q0(RecyclerView.w wVar, c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f2952d;
        if (i10 >= 0 && i10 < wVar.b()) {
            ((j.b) cVar2).a(i10, Math.max(0, cVar.f2955g));
        }
    }

    public final int R0(RecyclerView.w wVar) {
        if (H() == 0) {
            return 0;
        }
        V0();
        return v.a(wVar, this.f2936z, Y0(!this.E), X0(!this.E), this, this.E);
    }

    public final int S0(RecyclerView.w wVar) {
        if (H() == 0) {
            return 0;
        }
        V0();
        return v.b(wVar, this.f2936z, Y0(!this.E), X0(!this.E), this, this.E, this.C);
    }

    public final int T0(RecyclerView.w wVar) {
        if (H() == 0) {
            return 0;
        }
        V0();
        return v.c(wVar, this.f2936z, Y0(!this.E), X0(!this.E), this, this.E);
    }

    public boolean U() {
        return true;
    }

    public final int U0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f2934x == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f2934x == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f2934x == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f2934x == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f2934x != 1 && j1()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f2934x != 1 && j1()) {
            return 1;
        } else {
            return -1;
        }
    }

    public final void V0() {
        if (this.f2935y == null) {
            this.f2935y = new c();
        }
    }

    public final int W0(RecyclerView.s sVar, c cVar, RecyclerView.w wVar, boolean z10) {
        boolean z11;
        int i10 = cVar.f2951c;
        int i11 = cVar.f2955g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f2955g = i11 + i10;
            }
            m1(sVar, cVar);
        }
        int i12 = cVar.f2951c + cVar.f2956h;
        b bVar = this.J;
        while (true) {
            if (!cVar.f2960l && i12 <= 0) {
                break;
            }
            int i13 = cVar.f2952d;
            if (i13 < 0 || i13 >= wVar.b()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                break;
            }
            bVar.f2945a = 0;
            bVar.f2946b = false;
            bVar.f2947c = false;
            bVar.f2948d = false;
            k1(sVar, wVar, cVar, bVar);
            if (!bVar.f2946b) {
                int i14 = cVar.f2950b;
                int i15 = bVar.f2945a;
                cVar.f2950b = (cVar.f2954f * i15) + i14;
                if (!bVar.f2947c || cVar.f2959k != null || !wVar.f3103g) {
                    cVar.f2951c -= i15;
                    i12 -= i15;
                }
                int i16 = cVar.f2955g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    cVar.f2955g = i17;
                    int i18 = cVar.f2951c;
                    if (i18 < 0) {
                        cVar.f2955g = i17 + i18;
                    }
                    m1(sVar, cVar);
                }
                if (z10 && bVar.f2948d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f2951c;
    }

    public final View X0(boolean z10) {
        if (this.C) {
            return c1(0, H(), z10);
        }
        return c1(H() - 1, -1, z10);
    }

    public final View Y0(boolean z10) {
        if (this.C) {
            return c1(H() - 1, -1, z10);
        }
        return c1(0, H(), z10);
    }

    public final int Z0() {
        View c12 = c1(0, H(), false);
        if (c12 == null) {
            return -1;
        }
        return RecyclerView.m.O(c12);
    }

    @SuppressLint({"UnknownNullness"})
    public final PointF a(int i10) {
        if (H() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < RecyclerView.m.O(G(0))) {
            z10 = true;
        }
        if (z10 != this.C) {
            i11 = -1;
        }
        if (this.f2934x == 0) {
            return new PointF((float) i11, 0.0f);
        }
        return new PointF(0.0f, (float) i11);
    }

    public final int a1() {
        View c12 = c1(H() - 1, -1, false);
        if (c12 == null) {
            return -1;
        }
        return RecyclerView.m.O(c12);
    }

    public final View b1(int i10, int i11) {
        char c10;
        int i12;
        int i13;
        V0();
        if (i11 > i10) {
            c10 = 1;
        } else if (i11 < i10) {
            c10 = 65535;
        } else {
            c10 = 0;
        }
        if (c10 == 0) {
            return G(i10);
        }
        if (this.f2936z.e(G(i10)) < this.f2936z.k()) {
            i13 = 16644;
            i12 = 16388;
        } else {
            i13 = 4161;
            i12 = 4097;
        }
        if (this.f2934x == 0) {
            return this.f3048c.a(i10, i11, i13, i12);
        }
        return this.f3049d.a(i10, i11, i13, i12);
    }

    @SuppressLint({"UnknownNullness"})
    public void c0(RecyclerView recyclerView) {
    }

    public final View c1(int i10, int i11, boolean z10) {
        int i12;
        V0();
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (this.f2934x == 0) {
            return this.f3048c.a(i10, i11, i12, 320);
        }
        return this.f3049d.a(i10, i11, i12, 320);
    }

    @SuppressLint({"UnknownNullness"})
    public View d0(View view, int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        int U0;
        View view2;
        View view3;
        o1();
        if (H() == 0 || (U0 = U0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        V0();
        t1(U0, (int) (((float) this.f2936z.l()) * 0.33333334f), false, wVar);
        c cVar = this.f2935y;
        cVar.f2955g = Integer.MIN_VALUE;
        cVar.f2949a = false;
        W0(sVar, cVar, wVar, true);
        if (U0 == -1) {
            if (this.C) {
                view2 = b1(H() - 1, -1);
            } else {
                view2 = b1(0, H());
            }
        } else if (this.C) {
            view2 = b1(0, H());
        } else {
            view2 = b1(H() - 1, -1);
        }
        if (U0 == -1) {
            view3 = h1();
        } else {
            view3 = g1();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public View d1(RecyclerView.s sVar, RecyclerView.w wVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        V0();
        int H2 = H();
        int i12 = -1;
        if (z11) {
            i11 = H() - 1;
            i10 = -1;
        } else {
            i12 = H2;
            i11 = 0;
            i10 = 1;
        }
        int b10 = wVar.b();
        int k10 = this.f2936z.k();
        int g2 = this.f2936z.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i12) {
            View G2 = G(i11);
            int O = RecyclerView.m.O(G2);
            int e10 = this.f2936z.e(G2);
            int b11 = this.f2936z.b(G2);
            if (O >= 0 && O < b10) {
                if (!((RecyclerView.LayoutParams) G2.getLayoutParams()).e()) {
                    if (b11 > k10 || e10 >= k10) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (e10 < g2 || b11 <= g2) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (!z12 && !z13) {
                        return G2;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = G2;
                        }
                    } else if (!z12) {
                        if (view != null) {
                        }
                        view = G2;
                    }
                    view2 = G2;
                } else if (view3 == null) {
                    view3 = G2;
                }
            }
            i11 += i10;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    @SuppressLint({"UnknownNullness"})
    public final void e0(AccessibilityEvent accessibilityEvent) {
        super.e0(accessibilityEvent);
        if (H() > 0) {
            accessibilityEvent.setFromIndex(Z0());
            accessibilityEvent.setToIndex(a1());
        }
    }

    public final int e1(int i10, RecyclerView.s sVar, RecyclerView.w wVar, boolean z10) {
        int g2;
        int g10 = this.f2936z.g() - i10;
        if (g10 <= 0) {
            return 0;
        }
        int i11 = -p1(-g10, sVar, wVar);
        int i12 = i10 + i11;
        if (!z10 || (g2 = this.f2936z.g() - i12) <= 0) {
            return i11;
        }
        this.f2936z.p(g2);
        return g2 + i11;
    }

    public final int f1(int i10, RecyclerView.s sVar, RecyclerView.w wVar, boolean z10) {
        int k10;
        int k11 = i10 - this.f2936z.k();
        if (k11 <= 0) {
            return 0;
        }
        int i11 = -p1(k11, sVar, wVar);
        int i12 = i10 + i11;
        if (!z10 || (k10 = i12 - this.f2936z.k()) <= 0) {
            return i11;
        }
        this.f2936z.p(-k10);
        return i11 - k10;
    }

    public final View g1() {
        int i10;
        if (this.C) {
            i10 = 0;
        } else {
            i10 = H() - 1;
        }
        return G(i10);
    }

    public final View h1() {
        int i10;
        if (this.C) {
            i10 = H() - 1;
        } else {
            i10 = 0;
        }
        return G(i10);
    }

    @Deprecated
    public int i1(RecyclerView.w wVar) {
        boolean z10;
        if (wVar.f3097a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return this.f2936z.l();
        }
        return 0;
    }

    public final boolean j1() {
        if (M() == 1) {
            return true;
        }
        return false;
    }

    public void k1(RecyclerView.s sVar, RecyclerView.w wVar, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        View b10 = cVar.b(sVar);
        if (b10 == null) {
            bVar.f2946b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) b10.getLayoutParams();
        if (cVar.f2959k == null) {
            boolean z12 = this.C;
            if (cVar.f2954f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                l(b10, -1, false);
            } else {
                l(b10, 0, false);
            }
        } else {
            boolean z13 = this.C;
            if (cVar.f2954f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                l(b10, -1, true);
            } else {
                l(b10, 0, true);
            }
        }
        X(b10, 0, 0);
        bVar.f2945a = this.f2936z.c(b10);
        if (this.f2934x == 1) {
            if (j1()) {
                i13 = this.f3060v - getPaddingRight();
                i12 = i13 - this.f2936z.d(b10);
            } else {
                i12 = getPaddingLeft();
                i13 = this.f2936z.d(b10) + i12;
            }
            if (cVar.f2954f == -1) {
                i10 = cVar.f2950b;
                i11 = i10 - bVar.f2945a;
            } else {
                i11 = cVar.f2950b;
                i10 = bVar.f2945a + i11;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d10 = this.f2936z.d(b10) + paddingTop;
            if (cVar.f2954f == -1) {
                int i14 = cVar.f2950b;
                int i15 = i14 - bVar.f2945a;
                int i16 = paddingTop;
                i13 = i14;
                i10 = d10;
                i12 = i15;
                i11 = i16;
            } else {
                int i17 = cVar.f2950b;
                int i18 = bVar.f2945a + i17;
                int i19 = d10;
                i12 = i17;
                i10 = i19;
                int i20 = i18;
                i11 = paddingTop;
                i13 = i20;
            }
        }
        RecyclerView.m.W(b10, i12, i11, i13, i10);
        if (layoutParams.e() || layoutParams.d()) {
            bVar.f2947c = true;
        }
        bVar.f2948d = b10.hasFocusable();
    }

    public void l1(RecyclerView.s sVar, RecyclerView.w wVar, a aVar, int i10) {
    }

    @SuppressLint({"UnknownNullness"})
    public final void m(String str) {
        if (this.H == null) {
            super.m(str);
        }
    }

    public final void m1(RecyclerView.s sVar, c cVar) {
        if (cVar.f2949a && !cVar.f2960l) {
            int i10 = cVar.f2955g;
            int i11 = cVar.f2957i;
            if (cVar.f2954f == -1) {
                int H2 = H();
                if (i10 >= 0) {
                    int f10 = (this.f2936z.f() - i10) + i11;
                    if (this.C) {
                        for (int i12 = 0; i12 < H2; i12++) {
                            View G2 = G(i12);
                            if (this.f2936z.e(G2) < f10 || this.f2936z.o(G2) < f10) {
                                n1(sVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = H2 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View G3 = G(i14);
                        if (this.f2936z.e(G3) < f10 || this.f2936z.o(G3) < f10) {
                            n1(sVar, i13, i14);
                            return;
                        }
                    }
                }
            } else if (i10 >= 0) {
                int i15 = i10 - i11;
                int H3 = H();
                if (this.C) {
                    int i16 = H3 - 1;
                    for (int i17 = i16; i17 >= 0; i17--) {
                        View G4 = G(i17);
                        if (this.f2936z.b(G4) > i15 || this.f2936z.n(G4) > i15) {
                            n1(sVar, i16, i17);
                            return;
                        }
                    }
                    return;
                }
                for (int i18 = 0; i18 < H3; i18++) {
                    View G5 = G(i18);
                    if (this.f2936z.b(G5) > i15 || this.f2936z.n(G5) > i15) {
                        n1(sVar, 0, i18);
                        return;
                    }
                }
            }
        }
    }

    public final void n1(RecyclerView.s sVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                while (true) {
                    i11--;
                    if (i11 >= i10) {
                        View G2 = G(i11);
                        if (G(i11) != null) {
                            this.f3046a.l(i11);
                        }
                        sVar.i(G2);
                    } else {
                        return;
                    }
                }
            } else {
                while (i10 > i11) {
                    View G3 = G(i10);
                    if (G(i10) != null) {
                        this.f3046a.l(i10);
                    }
                    sVar.i(G3);
                    i10--;
                }
            }
        }
    }

    public final boolean o() {
        if (this.f2934x == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x018f  */
    @android.annotation.SuppressLint({"UnknownNullness"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o0(androidx.recyclerview.widget.RecyclerView.s r18, androidx.recyclerview.widget.RecyclerView.w r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r3 = r0.H
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.F
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r19.b()
            if (r3 != 0) goto L_0x0019
            r17.w0(r18)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r3 = r0.H
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x002a
            int r3 = r3.f2937a
            if (r3 < 0) goto L_0x0025
            r7 = r6
            goto L_0x0026
        L_0x0025:
            r7 = r5
        L_0x0026:
            if (r7 == 0) goto L_0x002a
            r0.F = r3
        L_0x002a:
            r17.V0()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            r3.f2949a = r5
            r17.o1()
            androidx.recyclerview.widget.RecyclerView r3 = r0.f3047b
            if (r3 != 0) goto L_0x003a
        L_0x0038:
            r3 = 0
            goto L_0x0049
        L_0x003a:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L_0x0038
            androidx.recyclerview.widget.b r8 = r0.f3046a
            boolean r8 = r8.k(r3)
            if (r8 == 0) goto L_0x0049
            goto L_0x0038
        L_0x0049:
            androidx.recyclerview.widget.LinearLayoutManager$a r8 = r0.I
            boolean r9 = r8.f2944e
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == 0) goto L_0x0083
            int r9 = r0.F
            if (r9 != r4) goto L_0x0083
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r9 = r0.H
            if (r9 == 0) goto L_0x005a
            goto L_0x0083
        L_0x005a:
            if (r3 == 0) goto L_0x0242
            androidx.recyclerview.widget.q r8 = r0.f2936z
            int r8 = r8.e(r3)
            androidx.recyclerview.widget.q r9 = r0.f2936z
            int r9 = r9.g()
            if (r8 >= r9) goto L_0x0078
            androidx.recyclerview.widget.q r8 = r0.f2936z
            int r8 = r8.b(r3)
            androidx.recyclerview.widget.q r9 = r0.f2936z
            int r9 = r9.k()
            if (r8 > r9) goto L_0x0242
        L_0x0078:
            androidx.recyclerview.widget.LinearLayoutManager$a r8 = r0.I
            int r9 = androidx.recyclerview.widget.RecyclerView.m.O(r3)
            r8.c(r9, r3)
            goto L_0x0242
        L_0x0083:
            r8.d()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.I
            boolean r8 = r0.C
            boolean r9 = r0.D
            r8 = r8 ^ r9
            r3.f2943d = r8
            boolean r8 = r2.f3103g
            if (r8 != 0) goto L_0x018a
            int r8 = r0.F
            if (r8 != r4) goto L_0x0099
            goto L_0x018a
        L_0x0099:
            if (r8 < 0) goto L_0x0186
            int r9 = r19.b()
            if (r8 < r9) goto L_0x00a3
            goto L_0x0186
        L_0x00a3:
            int r8 = r0.F
            r3.f2941b = r8
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r9 = r0.H
            if (r9 == 0) goto L_0x00d8
            int r11 = r9.f2937a
            if (r11 < 0) goto L_0x00b1
            r11 = r6
            goto L_0x00b2
        L_0x00b1:
            r11 = r5
        L_0x00b2:
            if (r11 == 0) goto L_0x00d8
            boolean r8 = r9.f2939c
            r3.f2943d = r8
            if (r8 == 0) goto L_0x00c9
            androidx.recyclerview.widget.q r8 = r0.f2936z
            int r8 = r8.g()
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r9 = r0.H
            int r9 = r9.f2938b
            int r8 = r8 - r9
            r3.f2942c = r8
            goto L_0x0184
        L_0x00c9:
            androidx.recyclerview.widget.q r8 = r0.f2936z
            int r8 = r8.k()
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r9 = r0.H
            int r9 = r9.f2938b
            int r8 = r8 + r9
            r3.f2942c = r8
            goto L_0x0184
        L_0x00d8:
            int r9 = r0.G
            if (r9 != r10) goto L_0x0167
            android.view.View r8 = r0.B(r8)
            if (r8 == 0) goto L_0x0145
            androidx.recyclerview.widget.q r9 = r0.f2936z
            int r9 = r9.c(r8)
            androidx.recyclerview.widget.q r11 = r0.f2936z
            int r11 = r11.l()
            if (r9 <= r11) goto L_0x00f5
            r3.a()
            goto L_0x0184
        L_0x00f5:
            androidx.recyclerview.widget.q r9 = r0.f2936z
            int r9 = r9.e(r8)
            androidx.recyclerview.widget.q r11 = r0.f2936z
            int r11 = r11.k()
            int r9 = r9 - r11
            if (r9 >= 0) goto L_0x0110
            androidx.recyclerview.widget.q r8 = r0.f2936z
            int r8 = r8.k()
            r3.f2942c = r8
            r3.f2943d = r5
            goto L_0x0184
        L_0x0110:
            androidx.recyclerview.widget.q r9 = r0.f2936z
            int r9 = r9.g()
            androidx.recyclerview.widget.q r11 = r0.f2936z
            int r11 = r11.b(r8)
            int r9 = r9 - r11
            if (r9 >= 0) goto L_0x012a
            androidx.recyclerview.widget.q r8 = r0.f2936z
            int r8 = r8.g()
            r3.f2942c = r8
            r3.f2943d = r6
            goto L_0x0184
        L_0x012a:
            boolean r9 = r3.f2943d
            if (r9 == 0) goto L_0x013c
            androidx.recyclerview.widget.q r9 = r0.f2936z
            int r8 = r9.b(r8)
            androidx.recyclerview.widget.q r9 = r0.f2936z
            int r9 = r9.m()
            int r9 = r9 + r8
            goto L_0x0142
        L_0x013c:
            androidx.recyclerview.widget.q r9 = r0.f2936z
            int r9 = r9.e(r8)
        L_0x0142:
            r3.f2942c = r9
            goto L_0x0184
        L_0x0145:
            int r8 = r17.H()
            if (r8 <= 0) goto L_0x0163
            android.view.View r8 = r0.G(r5)
            int r8 = androidx.recyclerview.widget.RecyclerView.m.O(r8)
            int r9 = r0.F
            if (r9 >= r8) goto L_0x0159
            r8 = r6
            goto L_0x015a
        L_0x0159:
            r8 = r5
        L_0x015a:
            boolean r9 = r0.C
            if (r8 != r9) goto L_0x0160
            r8 = r6
            goto L_0x0161
        L_0x0160:
            r8 = r5
        L_0x0161:
            r3.f2943d = r8
        L_0x0163:
            r3.a()
            goto L_0x0184
        L_0x0167:
            boolean r8 = r0.C
            r3.f2943d = r8
            if (r8 == 0) goto L_0x0179
            androidx.recyclerview.widget.q r8 = r0.f2936z
            int r8 = r8.g()
            int r9 = r0.G
            int r8 = r8 - r9
            r3.f2942c = r8
            goto L_0x0184
        L_0x0179:
            androidx.recyclerview.widget.q r8 = r0.f2936z
            int r8 = r8.k()
            int r9 = r0.G
            int r8 = r8 + r9
            r3.f2942c = r8
        L_0x0184:
            r8 = r6
            goto L_0x018b
        L_0x0186:
            r0.F = r4
            r0.G = r10
        L_0x018a:
            r8 = r5
        L_0x018b:
            if (r8 == 0) goto L_0x018f
            goto L_0x023e
        L_0x018f:
            int r8 = r17.H()
            if (r8 != 0) goto L_0x0197
            goto L_0x022a
        L_0x0197:
            androidx.recyclerview.widget.RecyclerView r8 = r0.f3047b
            if (r8 != 0) goto L_0x019d
        L_0x019b:
            r8 = 0
            goto L_0x01ac
        L_0x019d:
            android.view.View r8 = r8.getFocusedChild()
            if (r8 == 0) goto L_0x019b
            androidx.recyclerview.widget.b r9 = r0.f3046a
            boolean r9 = r9.k(r8)
            if (r9 == 0) goto L_0x01ac
            goto L_0x019b
        L_0x01ac:
            if (r8 == 0) goto L_0x01d7
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r9 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r9
            boolean r11 = r9.e()
            if (r11 != 0) goto L_0x01cc
            int r11 = r9.a()
            if (r11 < 0) goto L_0x01cc
            int r9 = r9.a()
            int r11 = r19.b()
            if (r9 >= r11) goto L_0x01cc
            r9 = r6
            goto L_0x01cd
        L_0x01cc:
            r9 = r5
        L_0x01cd:
            if (r9 == 0) goto L_0x01d7
            int r9 = androidx.recyclerview.widget.RecyclerView.m.O(r8)
            r3.c(r9, r8)
            goto L_0x0228
        L_0x01d7:
            boolean r8 = r0.A
            boolean r9 = r0.D
            if (r8 == r9) goto L_0x01de
            goto L_0x022a
        L_0x01de:
            boolean r8 = r3.f2943d
            android.view.View r8 = r0.d1(r1, r2, r8, r9)
            if (r8 == 0) goto L_0x022a
            int r9 = androidx.recyclerview.widget.RecyclerView.m.O(r8)
            r3.b(r9, r8)
            boolean r9 = r2.f3103g
            if (r9 != 0) goto L_0x0228
            boolean r9 = r17.O0()
            if (r9 == 0) goto L_0x0228
            androidx.recyclerview.widget.q r9 = r0.f2936z
            int r9 = r9.e(r8)
            androidx.recyclerview.widget.q r11 = r0.f2936z
            int r8 = r11.b(r8)
            androidx.recyclerview.widget.q r11 = r0.f2936z
            int r11 = r11.k()
            androidx.recyclerview.widget.q r12 = r0.f2936z
            int r12 = r12.g()
            if (r8 > r11) goto L_0x0215
            if (r9 >= r11) goto L_0x0215
            r13 = r6
            goto L_0x0216
        L_0x0215:
            r13 = r5
        L_0x0216:
            if (r9 < r12) goto L_0x021c
            if (r8 <= r12) goto L_0x021c
            r8 = r6
            goto L_0x021d
        L_0x021c:
            r8 = r5
        L_0x021d:
            if (r13 != 0) goto L_0x0221
            if (r8 == 0) goto L_0x0228
        L_0x0221:
            boolean r8 = r3.f2943d
            if (r8 == 0) goto L_0x0226
            r11 = r12
        L_0x0226:
            r3.f2942c = r11
        L_0x0228:
            r8 = r6
            goto L_0x022b
        L_0x022a:
            r8 = r5
        L_0x022b:
            if (r8 == 0) goto L_0x022e
            goto L_0x023e
        L_0x022e:
            r3.a()
            boolean r8 = r0.D
            if (r8 == 0) goto L_0x023b
            int r8 = r19.b()
            int r8 = r8 + r4
            goto L_0x023c
        L_0x023b:
            r8 = r5
        L_0x023c:
            r3.f2941b = r8
        L_0x023e:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.I
            r3.f2944e = r6
        L_0x0242:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            int r8 = r3.f2958j
            if (r8 < 0) goto L_0x024a
            r8 = r6
            goto L_0x024b
        L_0x024a:
            r8 = r4
        L_0x024b:
            r3.f2954f = r8
            int[] r3 = r0.L
            r3[r5] = r5
            r3[r6] = r5
            r0.P0(r2, r3)
            int[] r3 = r0.L
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.q r8 = r0.f2936z
            int r8 = r8.k()
            int r8 = r8 + r3
            int[] r3 = r0.L
            r3 = r3[r6]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.q r9 = r0.f2936z
            int r9 = r9.h()
            int r9 = r9 + r3
            boolean r3 = r2.f3103g
            if (r3 == 0) goto L_0x02af
            int r3 = r0.F
            if (r3 == r4) goto L_0x02af
            int r11 = r0.G
            if (r11 == r10) goto L_0x02af
            android.view.View r3 = r0.B(r3)
            if (r3 == 0) goto L_0x02af
            boolean r10 = r0.C
            if (r10 == 0) goto L_0x029a
            androidx.recyclerview.widget.q r10 = r0.f2936z
            int r10 = r10.g()
            androidx.recyclerview.widget.q r11 = r0.f2936z
            int r3 = r11.b(r3)
            int r10 = r10 - r3
            int r3 = r0.G
            goto L_0x02a9
        L_0x029a:
            androidx.recyclerview.widget.q r10 = r0.f2936z
            int r3 = r10.e(r3)
            androidx.recyclerview.widget.q r10 = r0.f2936z
            int r10 = r10.k()
            int r3 = r3 - r10
            int r10 = r0.G
        L_0x02a9:
            int r10 = r10 - r3
            if (r10 <= 0) goto L_0x02ae
            int r8 = r8 + r10
            goto L_0x02af
        L_0x02ae:
            int r9 = r9 - r10
        L_0x02af:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.I
            boolean r10 = r3.f2943d
            if (r10 == 0) goto L_0x02ba
            boolean r10 = r0.C
            if (r10 == 0) goto L_0x02be
            goto L_0x02c0
        L_0x02ba:
            boolean r10 = r0.C
            if (r10 == 0) goto L_0x02c0
        L_0x02be:
            r10 = r4
            goto L_0x02c1
        L_0x02c0:
            r10 = r6
        L_0x02c1:
            r0.l1(r1, r2, r3, r10)
            r17.A(r18)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            androidx.recyclerview.widget.q r10 = r0.f2936z
            int r10 = r10.i()
            if (r10 != 0) goto L_0x02db
            androidx.recyclerview.widget.q r10 = r0.f2936z
            int r10 = r10.f()
            if (r10 != 0) goto L_0x02db
            r10 = r6
            goto L_0x02dc
        L_0x02db:
            r10 = r5
        L_0x02dc:
            r3.f2960l = r10
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            r3.getClass()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            r3.f2957i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.I
            boolean r10 = r3.f2943d
            if (r10 == 0) goto L_0x0334
            int r10 = r3.f2941b
            int r3 = r3.f2942c
            r0.v1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            r3.f2956h = r8
            r0.W0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            int r8 = r3.f2950b
            int r10 = r3.f2952d
            int r3 = r3.f2951c
            if (r3 <= 0) goto L_0x0306
            int r9 = r9 + r3
        L_0x0306:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.I
            int r11 = r3.f2941b
            int r3 = r3.f2942c
            r0.u1(r11, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            r3.f2956h = r9
            int r9 = r3.f2952d
            int r11 = r3.f2953e
            int r9 = r9 + r11
            r3.f2952d = r9
            r0.W0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            int r9 = r3.f2950b
            int r3 = r3.f2951c
            if (r3 <= 0) goto L_0x037a
            r0.v1(r10, r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r8 = r0.f2935y
            r8.f2956h = r3
            r0.W0(r1, r8, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            int r8 = r3.f2950b
            goto L_0x037a
        L_0x0334:
            int r10 = r3.f2941b
            int r3 = r3.f2942c
            r0.u1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            r3.f2956h = r9
            r0.W0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            int r9 = r3.f2950b
            int r10 = r3.f2952d
            int r3 = r3.f2951c
            if (r3 <= 0) goto L_0x034d
            int r8 = r8 + r3
        L_0x034d:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.I
            int r11 = r3.f2941b
            int r3 = r3.f2942c
            r0.v1(r11, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            r3.f2956h = r8
            int r8 = r3.f2952d
            int r11 = r3.f2953e
            int r8 = r8 + r11
            r3.f2952d = r8
            r0.W0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            int r8 = r3.f2950b
            int r3 = r3.f2951c
            if (r3 <= 0) goto L_0x037a
            r0.u1(r10, r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.f2935y
            r9.f2956h = r3
            r0.W0(r1, r9, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            int r9 = r3.f2950b
        L_0x037a:
            int r3 = r17.H()
            if (r3 <= 0) goto L_0x039e
            boolean r3 = r0.C
            boolean r10 = r0.D
            r3 = r3 ^ r10
            if (r3 == 0) goto L_0x0392
            int r3 = r0.e1(r9, r1, r2, r6)
            int r8 = r8 + r3
            int r9 = r9 + r3
            int r3 = r0.f1(r8, r1, r2, r5)
            goto L_0x039c
        L_0x0392:
            int r3 = r0.f1(r8, r1, r2, r6)
            int r8 = r8 + r3
            int r9 = r9 + r3
            int r3 = r0.e1(r9, r1, r2, r5)
        L_0x039c:
            int r8 = r8 + r3
            int r9 = r9 + r3
        L_0x039e:
            boolean r3 = r2.f3107k
            if (r3 == 0) goto L_0x043f
            int r3 = r17.H()
            if (r3 == 0) goto L_0x043f
            boolean r3 = r2.f3103g
            if (r3 != 0) goto L_0x043f
            boolean r3 = r17.O0()
            if (r3 != 0) goto L_0x03b4
            goto L_0x043f
        L_0x03b4:
            java.util.List<androidx.recyclerview.widget.RecyclerView$a0> r3 = r1.f3078d
            int r10 = r3.size()
            android.view.View r11 = r0.G(r5)
            int r11 = androidx.recyclerview.widget.RecyclerView.m.O(r11)
            r12 = r5
            r13 = r12
            r14 = r13
        L_0x03c5:
            if (r12 >= r10) goto L_0x03fd
            java.lang.Object r15 = r3.get(r12)
            androidx.recyclerview.widget.RecyclerView$a0 r15 = (androidx.recyclerview.widget.RecyclerView.a0) r15
            boolean r16 = r15.j()
            if (r16 == 0) goto L_0x03d4
            goto L_0x03f9
        L_0x03d4:
            int r6 = r15.d()
            if (r6 >= r11) goto L_0x03dc
            r6 = 1
            goto L_0x03dd
        L_0x03dc:
            r6 = r5
        L_0x03dd:
            boolean r7 = r0.C
            if (r6 == r7) goto L_0x03e3
            r6 = r4
            goto L_0x03e4
        L_0x03e3:
            r6 = 1
        L_0x03e4:
            if (r6 != r4) goto L_0x03f0
            androidx.recyclerview.widget.q r6 = r0.f2936z
            android.view.View r7 = r15.f3013a
            int r6 = r6.c(r7)
            int r13 = r13 + r6
            goto L_0x03f9
        L_0x03f0:
            androidx.recyclerview.widget.q r6 = r0.f2936z
            android.view.View r7 = r15.f3013a
            int r6 = r6.c(r7)
            int r14 = r14 + r6
        L_0x03f9:
            int r12 = r12 + 1
            r6 = 1
            goto L_0x03c5
        L_0x03fd:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2935y
            r4.f2959k = r3
            if (r13 <= 0) goto L_0x041d
            android.view.View r3 = r17.h1()
            int r3 = androidx.recyclerview.widget.RecyclerView.m.O(r3)
            r0.v1(r3, r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            r3.f2956h = r13
            r3.f2951c = r5
            r4 = 0
            r3.a(r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            r0.W0(r1, r3, r2, r5)
        L_0x041d:
            if (r14 <= 0) goto L_0x043a
            android.view.View r3 = r17.g1()
            int r3 = androidx.recyclerview.widget.RecyclerView.m.O(r3)
            r0.u1(r3, r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            r3.f2956h = r14
            r3.f2951c = r5
            r4 = 0
            r3.a(r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2935y
            r0.W0(r1, r3, r2, r5)
            goto L_0x043b
        L_0x043a:
            r4 = 0
        L_0x043b:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f2935y
            r1.f2959k = r4
        L_0x043f:
            boolean r1 = r2.f3103g
            if (r1 != 0) goto L_0x044c
            androidx.recyclerview.widget.q r1 = r0.f2936z
            int r2 = r1.l()
            r1.f3291b = r2
            goto L_0x0451
        L_0x044c:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.I
            r1.d()
        L_0x0451:
            boolean r1 = r0.D
            r0.A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.o0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    public final void o1() {
        if (this.f2934x == 1 || !j1()) {
            this.C = this.B;
        } else {
            this.C = !this.B;
        }
    }

    public final boolean p() {
        if (this.f2934x == 1) {
            return true;
        }
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public void p0(RecyclerView.w wVar) {
        this.H = null;
        this.F = -1;
        this.G = Integer.MIN_VALUE;
        this.I.d();
    }

    public final int p1(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        int i11;
        if (H() == 0 || i10 == 0) {
            return 0;
        }
        V0();
        this.f2935y.f2949a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        t1(i11, abs, true, wVar);
        c cVar = this.f2935y;
        int W0 = W0(sVar, cVar, wVar, false) + cVar.f2955g;
        if (W0 < 0) {
            return 0;
        }
        if (abs > W0) {
            i10 = i11 * W0;
        }
        this.f2936z.p(-i10);
        this.f2935y.f2958j = i10;
        return i10;
    }

    public final void q1(int i10, int i11) {
        this.F = i10;
        this.G = i11;
        SavedState savedState = this.H;
        if (savedState != null) {
            savedState.f2937a = -1;
        }
        A0();
    }

    @SuppressLint({"UnknownNullness"})
    public final void r0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.H = savedState;
            if (this.F != -1) {
                savedState.f2937a = -1;
            }
            A0();
        }
    }

    public final void r1(int i10) {
        if (i10 == 0 || i10 == 1) {
            m((String) null);
            if (i10 != this.f2934x || this.f2936z == null) {
                q a10 = q.a(this, i10);
                this.f2936z = a10;
                this.I.f2940a = a10;
                this.f2934x = i10;
                A0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.m("invalid orientation:", i10));
    }

    @SuppressLint({"UnknownNullness"})
    public final void s(int i10, int i11, RecyclerView.w wVar, RecyclerView.m.c cVar) {
        int i12;
        if (this.f2934x != 0) {
            i10 = i11;
        }
        if (H() != 0 && i10 != 0) {
            V0();
            if (i10 > 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            t1(i12, Math.abs(i10), true, wVar);
            Q0(wVar, this.f2935y, cVar);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public final Parcelable s0() {
        SavedState savedState = this.H;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (H() > 0) {
            V0();
            boolean z10 = this.A ^ this.C;
            savedState2.f2939c = z10;
            if (z10) {
                View g12 = g1();
                savedState2.f2938b = this.f2936z.g() - this.f2936z.b(g12);
                savedState2.f2937a = RecyclerView.m.O(g12);
            } else {
                View h12 = h1();
                savedState2.f2937a = RecyclerView.m.O(h12);
                savedState2.f2938b = this.f2936z.e(h12) - this.f2936z.k();
            }
        } else {
            savedState2.f2937a = -1;
        }
        return savedState2;
    }

    public void s1(boolean z10) {
        m((String) null);
        if (this.D != z10) {
            this.D = z10;
            A0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    @android.annotation.SuppressLint({"UnknownNullness"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(int r7, androidx.recyclerview.widget.RecyclerView.m.c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r6.H
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 == 0) goto L_0x0013
            int r4 = r0.f2937a
            if (r4 < 0) goto L_0x000d
            r5 = r3
            goto L_0x000e
        L_0x000d:
            r5 = r1
        L_0x000e:
            if (r5 == 0) goto L_0x0013
            boolean r0 = r0.f2939c
            goto L_0x0022
        L_0x0013:
            r6.o1()
            boolean r0 = r6.C
            int r4 = r6.F
            if (r4 != r2) goto L_0x0022
            if (r0 == 0) goto L_0x0021
            int r4 = r7 + -1
            goto L_0x0022
        L_0x0021:
            r4 = r1
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            r0 = r1
        L_0x0027:
            int r3 = r6.K
            if (r0 >= r3) goto L_0x0039
            if (r4 < 0) goto L_0x0039
            if (r4 >= r7) goto L_0x0039
            r3 = r8
            androidx.recyclerview.widget.j$b r3 = (androidx.recyclerview.widget.j.b) r3
            r3.a(r4, r1)
            int r4 = r4 + r2
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.t(int, androidx.recyclerview.widget.RecyclerView$m$c):void");
    }

    public final void t1(int i10, int i11, boolean z10, RecyclerView.w wVar) {
        boolean z11;
        int i12;
        int i13;
        c cVar = this.f2935y;
        int i14 = 1;
        boolean z12 = false;
        if (this.f2936z.i() == 0 && this.f2936z.f() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.f2960l = z11;
        this.f2935y.f2954f = i10;
        int[] iArr = this.L;
        iArr[0] = 0;
        iArr[1] = 0;
        P0(wVar, iArr);
        int max = Math.max(0, this.L[0]);
        int max2 = Math.max(0, this.L[1]);
        if (i10 == 1) {
            z12 = true;
        }
        c cVar2 = this.f2935y;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        cVar2.f2956h = i12;
        if (!z12) {
            max = max2;
        }
        cVar2.f2957i = max;
        if (z12) {
            cVar2.f2956h = this.f2936z.h() + i12;
            View g12 = g1();
            c cVar3 = this.f2935y;
            if (this.C) {
                i14 = -1;
            }
            cVar3.f2953e = i14;
            int O = RecyclerView.m.O(g12);
            c cVar4 = this.f2935y;
            cVar3.f2952d = O + cVar4.f2953e;
            cVar4.f2950b = this.f2936z.b(g12);
            i13 = this.f2936z.b(g12) - this.f2936z.g();
        } else {
            View h12 = h1();
            c cVar5 = this.f2935y;
            cVar5.f2956h = this.f2936z.k() + cVar5.f2956h;
            c cVar6 = this.f2935y;
            if (!this.C) {
                i14 = -1;
            }
            cVar6.f2953e = i14;
            int O2 = RecyclerView.m.O(h12);
            c cVar7 = this.f2935y;
            cVar6.f2952d = O2 + cVar7.f2953e;
            cVar7.f2950b = this.f2936z.e(h12);
            i13 = (-this.f2936z.e(h12)) + this.f2936z.k();
        }
        c cVar8 = this.f2935y;
        cVar8.f2951c = i11;
        if (z10) {
            cVar8.f2951c = i11 - i13;
        }
        cVar8.f2955g = i13;
    }

    @SuppressLint({"UnknownNullness"})
    public final int u(RecyclerView.w wVar) {
        return R0(wVar);
    }

    public final void u1(int i10, int i11) {
        int i12;
        this.f2935y.f2951c = this.f2936z.g() - i11;
        c cVar = this.f2935y;
        if (this.C) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        cVar.f2953e = i12;
        cVar.f2952d = i10;
        cVar.f2954f = 1;
        cVar.f2950b = i11;
        cVar.f2955g = Integer.MIN_VALUE;
    }

    @SuppressLint({"UnknownNullness"})
    public int v(RecyclerView.w wVar) {
        return S0(wVar);
    }

    public final void v1(int i10, int i11) {
        int i12;
        this.f2935y.f2951c = i11 - this.f2936z.k();
        c cVar = this.f2935y;
        cVar.f2952d = i10;
        if (this.C) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        cVar.f2953e = i12;
        cVar.f2954f = -1;
        cVar.f2950b = i11;
        cVar.f2955g = Integer.MIN_VALUE;
    }

    @SuppressLint({"UnknownNullness"})
    public int w(RecyclerView.w wVar) {
        return T0(wVar);
    }

    @SuppressLint({"UnknownNullness"})
    public final int x(RecyclerView.w wVar) {
        return R0(wVar);
    }

    @SuppressLint({"UnknownNullness"})
    public int y(RecyclerView.w wVar) {
        return S0(wVar);
    }

    @SuppressLint({"UnknownNullness"})
    public int z(RecyclerView.w wVar) {
        return T0(wVar);
    }

    public LinearLayoutManager(int i10) {
        this.f2934x = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = -1;
        this.G = Integer.MIN_VALUE;
        this.H = null;
        this.I = new a();
        this.J = new b();
        this.K = 2;
        this.L = new int[2];
        r1(i10);
        m((String) null);
        if (this.B) {
            this.B = false;
            A0();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2934x = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = -1;
        this.G = Integer.MIN_VALUE;
        this.H = null;
        this.I = new a();
        this.J = new b();
        this.K = 2;
        this.L = new int[2];
        RecyclerView.m.d P = RecyclerView.m.P(context, attributeSet, i10, i11);
        r1(P.f3064a);
        boolean z10 = P.f3066c;
        m((String) null);
        if (z10 != this.B) {
            this.B = z10;
            A0();
        }
        s1(P.f3067d);
    }
}
