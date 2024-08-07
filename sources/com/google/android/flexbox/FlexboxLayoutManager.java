package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.q;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.m implements a, RecyclerView.v.b {
    public static final Rect V = new Rect();
    public int A = -1;
    public boolean B;
    public boolean C;
    public List<b> D = new ArrayList();
    public final c E = new c(this);
    public RecyclerView.s F;
    public RecyclerView.w G;
    public b H;
    public a I = new a();
    public q J;
    public q K;
    public SavedState L;
    public int M = -1;
    public int N = Integer.MIN_VALUE;
    public int O = Integer.MIN_VALUE;
    public int P = Integer.MIN_VALUE;
    public SparseArray<View> Q = new SparseArray<>();
    public final Context R;
    public View S;
    public int T = -1;
    public c.a U = new c.a();

    /* renamed from: x  reason: collision with root package name */
    public int f5230x;

    /* renamed from: y  reason: collision with root package name */
    public int f5231y;

    /* renamed from: z  reason: collision with root package name */
    public int f5232z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f5242a;

        /* renamed from: b  reason: collision with root package name */
        public int f5243b;

        public static class a implements Parcelable.Creator<SavedState> {
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

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("SavedState{mAnchorPosition=");
            q10.append(this.f5242a);
            q10.append(", mAnchorOffset=");
            q10.append(this.f5243b);
            q10.append('}');
            return q10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f5242a);
            parcel.writeInt(this.f5243b);
        }

        public SavedState(Parcel parcel) {
            this.f5242a = parcel.readInt();
            this.f5243b = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.f5242a = savedState.f5242a;
            this.f5243b = savedState.f5243b;
        }
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f5244a;

        /* renamed from: b  reason: collision with root package name */
        public int f5245b;

        /* renamed from: c  reason: collision with root package name */
        public int f5246c;

        /* renamed from: d  reason: collision with root package name */
        public int f5247d = 0;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5248e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5249f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5250g;

        public a() {
        }

        public static void a(a aVar) {
            int i10;
            int i11;
            if (!FlexboxLayoutManager.this.j()) {
                FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                if (flexboxLayoutManager.B) {
                    if (aVar.f5248e) {
                        i11 = flexboxLayoutManager.J.g();
                    } else {
                        i11 = flexboxLayoutManager.f3060v - flexboxLayoutManager.J.k();
                    }
                    aVar.f5246c = i11;
                    return;
                }
            }
            if (aVar.f5248e) {
                i10 = FlexboxLayoutManager.this.J.g();
            } else {
                i10 = FlexboxLayoutManager.this.J.k();
            }
            aVar.f5246c = i10;
        }

        public static void b(a aVar) {
            aVar.f5244a = -1;
            aVar.f5245b = -1;
            aVar.f5246c = Integer.MIN_VALUE;
            boolean z10 = false;
            aVar.f5249f = false;
            aVar.f5250g = false;
            if (FlexboxLayoutManager.this.j()) {
                FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                int i10 = flexboxLayoutManager.f5231y;
                if (i10 == 0) {
                    if (flexboxLayoutManager.f5230x == 1) {
                        z10 = true;
                    }
                    aVar.f5248e = z10;
                    return;
                }
                if (i10 == 2) {
                    z10 = true;
                }
                aVar.f5248e = z10;
                return;
            }
            FlexboxLayoutManager flexboxLayoutManager2 = FlexboxLayoutManager.this;
            int i11 = flexboxLayoutManager2.f5231y;
            if (i11 == 0) {
                if (flexboxLayoutManager2.f5230x == 3) {
                    z10 = true;
                }
                aVar.f5248e = z10;
                return;
            }
            if (i11 == 2) {
                z10 = true;
            }
            aVar.f5248e = z10;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("AnchorInfo{mPosition=");
            q10.append(this.f5244a);
            q10.append(", mFlexLinePosition=");
            q10.append(this.f5245b);
            q10.append(", mCoordinate=");
            q10.append(this.f5246c);
            q10.append(", mPerpendicularCoordinate=");
            q10.append(this.f5247d);
            q10.append(", mLayoutFromEnd=");
            q10.append(this.f5248e);
            q10.append(", mValid=");
            q10.append(this.f5249f);
            q10.append(", mAssignedFromSavedState=");
            q10.append(this.f5250g);
            q10.append('}');
            return q10.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f5252a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5253b;

        /* renamed from: c  reason: collision with root package name */
        public int f5254c;

        /* renamed from: d  reason: collision with root package name */
        public int f5255d;

        /* renamed from: e  reason: collision with root package name */
        public int f5256e;

        /* renamed from: f  reason: collision with root package name */
        public int f5257f;

        /* renamed from: g  reason: collision with root package name */
        public int f5258g;

        /* renamed from: h  reason: collision with root package name */
        public int f5259h = 1;

        /* renamed from: i  reason: collision with root package name */
        public int f5260i = 1;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5261j;

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("LayoutState{mAvailable=");
            q10.append(this.f5252a);
            q10.append(", mFlexLinePosition=");
            q10.append(this.f5254c);
            q10.append(", mPosition=");
            q10.append(this.f5255d);
            q10.append(", mOffset=");
            q10.append(this.f5256e);
            q10.append(", mScrollingOffset=");
            q10.append(this.f5257f);
            q10.append(", mLastScrollDelta=");
            q10.append(this.f5258g);
            q10.append(", mItemDirection=");
            q10.append(this.f5259h);
            q10.append(", mLayoutDirection=");
            q10.append(this.f5260i);
            q10.append('}');
            return q10.toString();
        }
    }

    public FlexboxLayoutManager(Context context) {
        f1(0);
        g1(1);
        if (this.f5232z != 4) {
            v0();
            this.D.clear();
            a.b(this.I);
            this.I.f5247d = 0;
            this.f5232z = 4;
            A0();
        }
        this.f3053o = true;
        this.R = context;
    }

    public static boolean V(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i10) {
                return true;
            }
            return false;
        } else if (size >= i10) {
            return true;
        } else {
            return false;
        }
    }

    private boolean h1(View view, int i10, int i11, LayoutParams layoutParams) {
        if (view.isLayoutRequested() || !this.f3054p || !V(view.getWidth(), i10, layoutParams.width) || !V(view.getHeight(), i11, layoutParams.height)) {
            return true;
        }
        return false;
    }

    public final int B0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        if (!j() || (this.f5231y == 0 && j())) {
            int c12 = c1(i10, sVar, wVar);
            this.Q.clear();
            return c12;
        }
        int d12 = d1(i10);
        this.I.f5247d += d12;
        this.K.p(-d12);
        return d12;
    }

    public final RecyclerView.LayoutParams C() {
        return new LayoutParams();
    }

    public final void C0(int i10) {
        this.M = i10;
        this.N = Integer.MIN_VALUE;
        SavedState savedState = this.L;
        if (savedState != null) {
            savedState.f5242a = -1;
        }
        A0();
    }

    public final RecyclerView.LayoutParams D(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final int D0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        if (j() || (this.f5231y == 0 && !j())) {
            int c12 = c1(i10, sVar, wVar);
            this.Q.clear();
            return c12;
        }
        int d12 = d1(i10);
        this.I.f5247d += d12;
        this.K.p(-d12);
        return d12;
    }

    public final void M0(RecyclerView recyclerView, RecyclerView.w wVar, int i10) {
        l lVar = new l(recyclerView.getContext());
        lVar.f3084a = i10;
        N0(lVar);
    }

    public final int P0(RecyclerView.w wVar) {
        if (H() == 0) {
            return 0;
        }
        int b10 = wVar.b();
        S0();
        View U0 = U0(b10);
        View W0 = W0(b10);
        if (wVar.b() == 0 || U0 == null || W0 == null) {
            return 0;
        }
        return Math.min(this.J.l(), this.J.b(W0) - this.J.e(U0));
    }

    public final int Q0(RecyclerView.w wVar) {
        if (H() == 0) {
            return 0;
        }
        int b10 = wVar.b();
        View U0 = U0(b10);
        View W0 = W0(b10);
        if (!(wVar.b() == 0 || U0 == null || W0 == null)) {
            int O2 = RecyclerView.m.O(U0);
            int O3 = RecyclerView.m.O(W0);
            int abs = Math.abs(this.J.b(W0) - this.J.e(U0));
            int[] iArr = this.E.f5282c;
            int i10 = iArr[O2];
            if (!(i10 == 0 || i10 == -1)) {
                return Math.round((((float) i10) * (((float) abs) / ((float) ((iArr[O3] - i10) + 1)))) + ((float) (this.J.k() - this.J.e(U0))));
            }
        }
        return 0;
    }

    public final int R0(RecyclerView.w wVar) {
        int i10;
        if (H() == 0) {
            return 0;
        }
        int b10 = wVar.b();
        View U0 = U0(b10);
        View W0 = W0(b10);
        if (wVar.b() == 0 || U0 == null || W0 == null) {
            return 0;
        }
        View Y0 = Y0(0, H());
        int i11 = -1;
        if (Y0 == null) {
            i10 = -1;
        } else {
            i10 = RecyclerView.m.O(Y0);
        }
        View Y02 = Y0(H() - 1, -1);
        if (Y02 != null) {
            i11 = RecyclerView.m.O(Y02);
        }
        return (int) ((((float) Math.abs(this.J.b(W0) - this.J.e(U0))) / ((float) ((i11 - i10) + 1))) * ((float) wVar.b()));
    }

    public final void S0() {
        if (this.J == null) {
            if (j()) {
                if (this.f5231y == 0) {
                    this.J = new o(this);
                    this.K = new p(this);
                    return;
                }
                this.J = new p(this);
                this.K = new o(this);
            } else if (this.f5231y == 0) {
                this.J = new p(this);
                this.K = new o(this);
            } else {
                this.J = new o(this);
                this.K = new p(this);
            }
        }
    }

    public final int T0(RecyclerView.s sVar, RecyclerView.w wVar, b bVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        b bVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        View view;
        int i25;
        RecyclerView.s sVar2 = sVar;
        b bVar3 = bVar;
        int i26 = bVar3.f5257f;
        if (i26 != Integer.MIN_VALUE) {
            int i27 = bVar3.f5252a;
            if (i27 < 0) {
                bVar3.f5257f = i26 + i27;
            }
            e1(sVar2, bVar3);
        }
        int i28 = bVar3.f5252a;
        boolean j10 = j();
        int i29 = i28;
        int i30 = 0;
        while (true) {
            if (i29 <= 0 && !this.H.f5253b) {
                break;
            }
            List<b> list = this.D;
            int i31 = bVar3.f5255d;
            int i32 = 1;
            if (i31 < 0 || i31 >= wVar.b() || (i25 = bVar3.f5254c) < 0 || i25 >= list.size()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                break;
            }
            b bVar4 = this.D.get(bVar3.f5254c);
            bVar3.f5255d = bVar4.f5276o;
            if (j()) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i33 = this.f3060v;
                int i34 = bVar3.f5256e;
                if (bVar3.f5260i == -1) {
                    i34 -= bVar4.f5268g;
                }
                int i35 = bVar3.f5255d;
                float f11 = (float) (i33 - paddingRight);
                float f12 = (float) this.I.f5247d;
                float f13 = ((float) paddingLeft) - f12;
                float f14 = f11 - f12;
                float max = Math.max(0.0f, 0.0f);
                int i36 = bVar4.f5269h;
                int i37 = i35;
                int i38 = 0;
                while (i37 < i35 + i36) {
                    View g2 = g(i37);
                    if (g2 == null) {
                        i19 = i34;
                        i23 = i35;
                        i24 = i29;
                        i22 = i30;
                        i21 = i37;
                        i20 = i36;
                    } else {
                        i23 = i35;
                        if (bVar3.f5260i == i32) {
                            n(g2, V);
                            l(g2, -1, false);
                        } else {
                            n(g2, V);
                            int i39 = i38;
                            l(g2, i39, false);
                            i38 = i39 + 1;
                        }
                        i24 = i29;
                        i22 = i30;
                        long j11 = this.E.f5283d[i37];
                        int i40 = (int) j11;
                        int i41 = (int) (j11 >> 32);
                        LayoutParams layoutParams = (LayoutParams) g2.getLayoutParams();
                        if (h1(g2, i40, i41, layoutParams)) {
                            g2.measure(i40, i41);
                        }
                        float N2 = f13 + ((float) (RecyclerView.m.N(g2) + layoutParams.leftMargin));
                        float Q2 = f14 - ((float) (RecyclerView.m.Q(g2) + layoutParams.rightMargin));
                        int S2 = RecyclerView.m.S(g2) + i34;
                        if (this.B) {
                            i21 = i37;
                            i20 = i36;
                            i19 = i34;
                            view = g2;
                            this.E.o(g2, bVar4, Math.round(Q2) - g2.getMeasuredWidth(), S2, Math.round(Q2), g2.getMeasuredHeight() + S2);
                        } else {
                            i19 = i34;
                            i21 = i37;
                            i20 = i36;
                            view = g2;
                            this.E.o(view, bVar4, Math.round(N2), S2, view.getMeasuredWidth() + Math.round(N2), view.getMeasuredHeight() + S2);
                        }
                        float Q3 = ((float) (RecyclerView.m.Q(view) + view.getMeasuredWidth() + layoutParams.rightMargin)) + max + N2;
                        f14 = Q2 - (((float) (RecyclerView.m.N(view) + (view.getMeasuredWidth() + layoutParams.leftMargin))) + max);
                        f13 = Q3;
                    }
                    i37 = i21 + 1;
                    i29 = i24;
                    i35 = i23;
                    i30 = i22;
                    i36 = i20;
                    i34 = i19;
                    i32 = 1;
                }
                i12 = i29;
                i10 = i30;
                bVar3.f5254c += this.H.f5260i;
                i13 = bVar4.f5268g;
                i11 = i28;
            } else {
                i12 = i29;
                i10 = i30;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i42 = this.f3061w;
                int i43 = bVar3.f5256e;
                if (bVar3.f5260i == -1) {
                    int i44 = bVar4.f5268g;
                    i14 = i43 + i44;
                    i43 -= i44;
                } else {
                    i14 = i43;
                }
                int i45 = bVar3.f5255d;
                float f15 = (float) (i42 - paddingBottom);
                float f16 = (float) this.I.f5247d;
                float f17 = ((float) paddingTop) - f16;
                float f18 = f15 - f16;
                float max2 = Math.max(0.0f, 0.0f);
                int i46 = bVar4.f5269h;
                int i47 = i45;
                int i48 = 0;
                while (i47 < i45 + i46) {
                    View g10 = g(i47);
                    if (g10 == null) {
                        i17 = i28;
                        f10 = max2;
                        bVar2 = bVar4;
                        i18 = i47;
                        i16 = i46;
                        i15 = i45;
                    } else {
                        int i49 = i46;
                        f10 = max2;
                        bVar2 = bVar4;
                        long j12 = this.E.f5283d[i47];
                        int i50 = (int) j12;
                        int i51 = (int) (j12 >> 32);
                        LayoutParams layoutParams2 = (LayoutParams) g10.getLayoutParams();
                        if (h1(g10, i50, i51, layoutParams2)) {
                            g10.measure(i50, i51);
                        }
                        float S3 = f17 + ((float) (RecyclerView.m.S(g10) + layoutParams2.topMargin));
                        float F2 = f18 - ((float) (RecyclerView.m.F(g10) + layoutParams2.rightMargin));
                        if (bVar3.f5260i == 1) {
                            n(g10, V);
                            i17 = i28;
                            l(g10, -1, false);
                        } else {
                            i17 = i28;
                            n(g10, V);
                            l(g10, i48, false);
                            i48++;
                        }
                        int i52 = i48;
                        int N3 = RecyclerView.m.N(g10) + i43;
                        int Q4 = i14 - RecyclerView.m.Q(g10);
                        boolean z11 = this.B;
                        if (!z11) {
                            boolean z12 = z11;
                            i18 = i47;
                            i15 = i45;
                            i16 = i49;
                            if (this.C) {
                                this.E.p(g10, bVar2, z12, N3, Math.round(F2) - g10.getMeasuredHeight(), g10.getMeasuredWidth() + N3, Math.round(F2));
                            } else {
                                this.E.p(g10, bVar2, z12, N3, Math.round(S3), g10.getMeasuredWidth() + N3, g10.getMeasuredHeight() + Math.round(S3));
                            }
                        } else if (this.C) {
                            boolean z13 = z11;
                            c cVar = this.E;
                            i18 = i47;
                            i16 = i49;
                            i15 = i45;
                            cVar.p(g10, bVar2, z13, Q4 - g10.getMeasuredWidth(), Math.round(F2) - g10.getMeasuredHeight(), Q4, Math.round(F2));
                        } else {
                            i18 = i47;
                            i15 = i45;
                            i16 = i49;
                            this.E.p(g10, bVar2, z11, Q4 - g10.getMeasuredWidth(), Math.round(S3), Q4, g10.getMeasuredHeight() + Math.round(S3));
                        }
                        float F3 = ((float) (RecyclerView.m.F(g10) + g10.getMeasuredHeight() + layoutParams2.topMargin)) + f10 + S3;
                        f18 = F2 - (((float) (RecyclerView.m.S(g10) + (g10.getMeasuredHeight() + layoutParams2.bottomMargin))) + f10);
                        f17 = F3;
                        i48 = i52;
                    }
                    i47 = i18 + 1;
                    i28 = i17;
                    bVar4 = bVar2;
                    max2 = f10;
                    i46 = i16;
                    i45 = i15;
                }
                i11 = i28;
                b bVar5 = bVar4;
                bVar3.f5254c += this.H.f5260i;
                i13 = bVar4.f5268g;
            }
            i30 = i10 + i13;
            if (j10 || !this.B) {
                bVar3.f5256e = (bVar4.f5268g * bVar3.f5260i) + bVar3.f5256e;
            } else {
                bVar3.f5256e -= bVar4.f5268g * bVar3.f5260i;
            }
            i29 = i12 - bVar4.f5268g;
            i28 = i11;
        }
        int i53 = i28;
        int i54 = i30;
        int i55 = bVar3.f5252a - i54;
        bVar3.f5252a = i55;
        int i56 = bVar3.f5257f;
        if (i56 != Integer.MIN_VALUE) {
            int i57 = i56 + i54;
            bVar3.f5257f = i57;
            if (i55 < 0) {
                bVar3.f5257f = i57 + i55;
            }
            e1(sVar2, bVar3);
        }
        return i53 - bVar3.f5252a;
    }

    public final View U0(int i10) {
        int i11;
        View Z0 = Z0(0, H(), i10);
        if (Z0 == null || (i11 = this.E.f5282c[RecyclerView.m.O(Z0)]) == -1) {
            return null;
        }
        return V0(Z0, this.D.get(i11));
    }

    public final View V0(View view, b bVar) {
        boolean j10 = j();
        int i10 = bVar.f5269h;
        for (int i11 = 1; i11 < i10; i11++) {
            View G2 = G(i11);
            if (!(G2 == null || G2.getVisibility() == 8)) {
                if (!this.B || j10) {
                    if (this.J.e(view) <= this.J.e(G2)) {
                    }
                } else if (this.J.b(view) >= this.J.b(G2)) {
                }
                view = G2;
            }
        }
        return view;
    }

    public final View W0(int i10) {
        View Z0 = Z0(H() - 1, -1, i10);
        if (Z0 == null) {
            return null;
        }
        return X0(Z0, this.D.get(this.E.f5282c[RecyclerView.m.O(Z0)]));
    }

    public final View X0(View view, b bVar) {
        boolean j10 = j();
        int H2 = (H() - bVar.f5269h) - 1;
        for (int H3 = H() - 2; H3 > H2; H3--) {
            View G2 = G(H3);
            if (!(G2 == null || G2.getVisibility() == 8)) {
                if (!this.B || j10) {
                    if (this.J.b(view) >= this.J.b(G2)) {
                    }
                } else if (this.J.e(view) <= this.J.e(G2)) {
                }
                view = G2;
            }
        }
        return view;
    }

    public final View Y0(int i10, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        if (i11 > i10) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        while (i10 != i11) {
            View G2 = G(i10);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.f3060v - getPaddingRight();
            int paddingBottom = this.f3061w - getPaddingBottom();
            int left = (G2.getLeft() - RecyclerView.m.N(G2)) - ((RecyclerView.LayoutParams) G2.getLayoutParams()).leftMargin;
            int top = (G2.getTop() - RecyclerView.m.S(G2)) - ((RecyclerView.LayoutParams) G2.getLayoutParams()).topMargin;
            int Q2 = RecyclerView.m.Q(G2) + G2.getRight() + ((RecyclerView.LayoutParams) G2.getLayoutParams()).rightMargin;
            int F2 = RecyclerView.m.F(G2) + G2.getBottom() + ((RecyclerView.LayoutParams) G2.getLayoutParams()).bottomMargin;
            boolean z12 = false;
            if (left >= paddingRight || Q2 >= paddingLeft) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (top >= paddingBottom || F2 >= paddingTop) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                return G2;
            }
            i10 += i12;
        }
        return null;
    }

    public final View Z0(int i10, int i11, int i12) {
        int i13;
        S0();
        if (this.H == null) {
            this.H = new b();
        }
        int k10 = this.J.k();
        int g2 = this.J.g();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View G2 = G(i10);
            int O2 = RecyclerView.m.O(G2);
            if (O2 >= 0 && O2 < i12) {
                if (((RecyclerView.LayoutParams) G2.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = G2;
                    }
                } else if (this.J.e(G2) >= k10 && this.J.b(G2) <= g2) {
                    return G2;
                } else {
                    if (view == null) {
                        view = G2;
                    }
                }
            }
            i10 += i13;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public final PointF a(int i10) {
        int i11;
        if (H() == 0) {
            return null;
        }
        if (i10 < RecyclerView.m.O(G(0))) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        if (j()) {
            return new PointF(0.0f, (float) i11);
        }
        return new PointF((float) i11, 0.0f);
    }

    public final void a0() {
        v0();
    }

    public final int a1(int i10, RecyclerView.s sVar, RecyclerView.w wVar, boolean z10) {
        boolean z11;
        int i11;
        int g2;
        if (j() || !this.B) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            int k10 = i10 - this.J.k();
            if (k10 <= 0) {
                return 0;
            }
            i11 = c1(k10, sVar, wVar);
        } else {
            int g10 = this.J.g() - i10;
            if (g10 <= 0) {
                return 0;
            }
            i11 = -c1(-g10, sVar, wVar);
        }
        int i12 = i10 + i11;
        if (!z10 || (g2 = this.J.g() - i12) <= 0) {
            return i11;
        }
        this.J.p(g2);
        return g2 + i11;
    }

    public final void b(View view, int i10, int i11, b bVar) {
        n(view, V);
        if (j()) {
            int Q2 = RecyclerView.m.Q(view) + RecyclerView.m.N(view);
            bVar.f5266e += Q2;
            bVar.f5267f += Q2;
            return;
        }
        int F2 = RecyclerView.m.F(view) + RecyclerView.m.S(view);
        bVar.f5266e += F2;
        bVar.f5267f += F2;
    }

    public final void b0(RecyclerView recyclerView) {
        this.S = (View) recyclerView.getParent();
    }

    public final int b1(int i10, RecyclerView.s sVar, RecyclerView.w wVar, boolean z10) {
        int i11;
        int k10;
        if (j() || !this.B) {
            int k11 = i10 - this.J.k();
            if (k11 <= 0) {
                return 0;
            }
            i11 = -c1(k11, sVar, wVar);
        } else {
            int g2 = this.J.g() - i10;
            if (g2 <= 0) {
                return 0;
            }
            i11 = c1(-g2, sVar, wVar);
        }
        int i12 = i10 + i11;
        if (!z10 || (k10 = i12 - this.J.k()) <= 0) {
            return i11;
        }
        this.J.p(-k10);
        return i11 - k10;
    }

    public final void c(b bVar) {
    }

    public final void c0(RecyclerView recyclerView) {
    }

    public final int c1(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        if (H() == 0 || i10 == 0) {
            return 0;
        }
        S0();
        this.H.f5261j = true;
        if (j() || !this.B) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 ? i10 <= 0 : i10 >= 0) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        int abs = Math.abs(i10);
        this.H.f5260i = i11;
        boolean j10 = j();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f3060v, this.f3058t);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f3061w, this.f3059u);
        if (j10 || !this.B) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i11 == 1) {
            View G2 = G(H() - 1);
            this.H.f5256e = this.J.b(G2);
            int O2 = RecyclerView.m.O(G2);
            View X0 = X0(G2, this.D.get(this.E.f5282c[O2]));
            b bVar = this.H;
            bVar.f5259h = 1;
            int i14 = O2 + 1;
            bVar.f5255d = i14;
            int[] iArr = this.E.f5282c;
            if (iArr.length <= i14) {
                bVar.f5254c = -1;
            } else {
                bVar.f5254c = iArr[i14];
            }
            if (z11) {
                bVar.f5256e = this.J.e(X0);
                this.H.f5257f = this.J.k() + (-this.J.e(X0));
                b bVar2 = this.H;
                int i15 = bVar2.f5257f;
                if (i15 < 0) {
                    i15 = 0;
                }
                bVar2.f5257f = i15;
            } else {
                bVar.f5256e = this.J.b(X0);
                this.H.f5257f = this.J.b(X0) - this.J.g();
            }
            int i16 = this.H.f5254c;
            if ((i16 == -1 || i16 > this.D.size() - 1) && this.H.f5255d <= getFlexItemCount()) {
                b bVar3 = this.H;
                int i17 = abs - bVar3.f5257f;
                c.a aVar = this.U;
                aVar.f5285a = null;
                aVar.f5286b = 0;
                if (i17 > 0) {
                    if (j10) {
                        this.E.b(aVar, makeMeasureSpec, makeMeasureSpec2, i17, bVar3.f5255d, -1, this.D);
                    } else {
                        this.E.b(aVar, makeMeasureSpec2, makeMeasureSpec, i17, bVar3.f5255d, -1, this.D);
                    }
                    this.E.h(makeMeasureSpec, makeMeasureSpec2, this.H.f5255d);
                    this.E.u(this.H.f5255d);
                }
            }
        } else {
            View G3 = G(0);
            this.H.f5256e = this.J.e(G3);
            int O3 = RecyclerView.m.O(G3);
            View V0 = V0(G3, this.D.get(this.E.f5282c[O3]));
            b bVar4 = this.H;
            bVar4.f5259h = 1;
            int i18 = this.E.f5282c[O3];
            if (i18 == -1) {
                i18 = 0;
            }
            if (i18 > 0) {
                this.H.f5255d = O3 - this.D.get(i18 - 1).f5269h;
            } else {
                bVar4.f5255d = -1;
            }
            b bVar5 = this.H;
            if (i18 > 0) {
                i13 = i18 - 1;
            } else {
                i13 = 0;
            }
            bVar5.f5254c = i13;
            if (z11) {
                bVar5.f5256e = this.J.b(V0);
                this.H.f5257f = this.J.b(V0) - this.J.g();
                b bVar6 = this.H;
                int i19 = bVar6.f5257f;
                if (i19 < 0) {
                    i19 = 0;
                }
                bVar6.f5257f = i19;
            } else {
                bVar5.f5256e = this.J.e(V0);
                this.H.f5257f = this.J.k() + (-this.J.e(V0));
            }
        }
        b bVar7 = this.H;
        int i20 = bVar7.f5257f;
        bVar7.f5252a = abs - i20;
        int T0 = T0(sVar, wVar, bVar7) + i20;
        if (T0 < 0) {
            return 0;
        }
        if (z10) {
            if (abs > T0) {
                i12 = (-i11) * T0;
                this.J.p(-i12);
                this.H.f5258g = i12;
                return i12;
            }
        } else if (abs > T0) {
            i12 = i11 * T0;
            this.J.p(-i12);
            this.H.f5258g = i12;
            return i12;
        }
        i12 = i10;
        this.J.p(-i12);
        this.H.f5258g = i12;
        return i12;
    }

    public final View d(int i10) {
        return g(i10);
    }

    public final int d1(int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10 = false;
        if (H() == 0 || i10 == 0) {
            return 0;
        }
        S0();
        boolean j10 = j();
        View view = this.S;
        if (j10) {
            i11 = view.getWidth();
        } else {
            i11 = view.getHeight();
        }
        if (j10) {
            i12 = this.f3060v;
        } else {
            i12 = this.f3061w;
        }
        if (M() == 1) {
            z10 = true;
        }
        if (z10) {
            int abs = Math.abs(i10);
            if (i10 < 0) {
                return -Math.min((i12 + this.I.f5247d) - i11, abs);
            }
            i13 = this.I.f5247d;
            if (i13 + i10 <= 0) {
                return i10;
            }
        } else if (i10 > 0) {
            return Math.min((i12 - this.I.f5247d) - i11, i10);
        } else {
            i13 = this.I.f5247d;
            if (i13 + i10 >= 0) {
                return i10;
            }
        }
        return -i13;
    }

    public final int e(int i10, int i11, int i12) {
        return RecyclerView.m.I(this.f3060v, this.f3058t, i11, i12, o());
    }

    public final void e1(RecyclerView.s sVar, b bVar) {
        int H2;
        boolean z10;
        boolean z11;
        if (bVar.f5261j) {
            int i10 = -1;
            if (bVar.f5260i == -1) {
                if (bVar.f5257f >= 0) {
                    this.J.f();
                    int H3 = H();
                    if (H3 != 0) {
                        int i11 = H3 - 1;
                        int i12 = this.E.f5282c[RecyclerView.m.O(G(i11))];
                        if (i12 != -1) {
                            b bVar2 = this.D.get(i12);
                            int i13 = i11;
                            while (true) {
                                if (i13 < 0) {
                                    break;
                                }
                                View G2 = G(i13);
                                int i14 = bVar.f5257f;
                                if (j() || !this.B ? this.J.e(G2) < this.J.f() - i14 : this.J.b(G2) > i14) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (!z11) {
                                    break;
                                }
                                if (bVar2.f5276o == RecyclerView.m.O(G2)) {
                                    if (i12 <= 0) {
                                        H3 = i13;
                                        break;
                                    }
                                    i12 += bVar.f5260i;
                                    bVar2 = this.D.get(i12);
                                    H3 = i13;
                                }
                                i13--;
                            }
                            while (i11 >= H3) {
                                View G3 = G(i11);
                                if (G(i11) != null) {
                                    this.f3046a.l(i11);
                                }
                                sVar.i(G3);
                                i11--;
                            }
                        }
                    }
                }
            } else if (bVar.f5257f >= 0 && (H2 = H()) != 0) {
                int i15 = this.E.f5282c[RecyclerView.m.O(G(0))];
                if (i15 != -1) {
                    b bVar3 = this.D.get(i15);
                    int i16 = 0;
                    while (true) {
                        if (i16 >= H2) {
                            break;
                        }
                        View G4 = G(i16);
                        int i17 = bVar.f5257f;
                        if (j() || !this.B ? this.J.b(G4) > i17 : this.J.f() - this.J.e(G4) > i17) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10) {
                            break;
                        }
                        if (bVar3.f5277p == RecyclerView.m.O(G4)) {
                            if (i15 >= this.D.size() - 1) {
                                i10 = i16;
                                break;
                            }
                            i15 += bVar.f5260i;
                            bVar3 = this.D.get(i15);
                            i10 = i16;
                        }
                        i16++;
                    }
                    while (i10 >= 0) {
                        View G5 = G(i10);
                        if (G(i10) != null) {
                            this.f3046a.l(i10);
                        }
                        sVar.i(G5);
                        i10--;
                    }
                }
            }
        }
    }

    public final void f(int i10, View view) {
        this.Q.put(i10, view);
    }

    public final void f1(int i10) {
        if (this.f5230x != i10) {
            v0();
            this.f5230x = i10;
            this.J = null;
            this.K = null;
            this.D.clear();
            a.b(this.I);
            this.I.f5247d = 0;
            A0();
        }
    }

    public final View g(int i10) {
        View view = this.Q.get(i10);
        if (view != null) {
            return view;
        }
        return this.F.d(i10);
    }

    public final void g1(int i10) {
        int i11 = this.f5231y;
        if (i11 != 1) {
            if (i11 == 0) {
                v0();
                this.D.clear();
                a.b(this.I);
                this.I.f5247d = 0;
            }
            this.f5231y = 1;
            this.J = null;
            this.K = null;
            A0();
        }
    }

    public final int getAlignContent() {
        return 5;
    }

    public final int getAlignItems() {
        return this.f5232z;
    }

    public final int getFlexDirection() {
        return this.f5230x;
    }

    public final int getFlexItemCount() {
        return this.G.b();
    }

    public final List<b> getFlexLinesInternal() {
        return this.D;
    }

    public final int getFlexWrap() {
        return this.f5231y;
    }

    public final int getLargestMainSize() {
        if (this.D.size() == 0) {
            return 0;
        }
        int i10 = Integer.MIN_VALUE;
        int size = this.D.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = Math.max(i10, this.D.get(i11).f5266e);
        }
        return i10;
    }

    public final int getMaxLine() {
        return this.A;
    }

    public final int getSumOfCrossSize() {
        int size = this.D.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += this.D.get(i11).f5268g;
        }
        return i10;
    }

    public final int h(View view, int i10, int i11) {
        int i12;
        int i13;
        if (j()) {
            i12 = RecyclerView.m.N(view);
            i13 = RecyclerView.m.Q(view);
        } else {
            i12 = RecyclerView.m.S(view);
            i13 = RecyclerView.m.F(view);
        }
        return i13 + i12;
    }

    public final int i(int i10, int i11, int i12) {
        return RecyclerView.m.I(this.f3061w, this.f3059u, i11, i12, p());
    }

    public final void i0(int i10, int i11) {
        i1(i10);
    }

    public final void i1(int i10) {
        int i11 = -1;
        View Y0 = Y0(H() - 1, -1);
        if (Y0 != null) {
            i11 = RecyclerView.m.O(Y0);
        }
        if (i10 < i11) {
            int H2 = H();
            this.E.j(H2);
            this.E.k(H2);
            this.E.i(H2);
            if (i10 < this.E.f5282c.length) {
                this.T = i10;
                View G2 = G(0);
                if (G2 != null) {
                    this.M = RecyclerView.m.O(G2);
                    if (j() || !this.B) {
                        this.N = this.J.e(G2) - this.J.k();
                        return;
                    }
                    this.N = this.J.h() + this.J.b(G2);
                }
            }
        }
    }

    public final boolean j() {
        int i10 = this.f5230x;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void j1(a aVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean z12 = false;
        if (z11) {
            if (j()) {
                i11 = this.f3059u;
            } else {
                i11 = this.f3058t;
            }
            b bVar = this.H;
            if (i11 == 0 || i11 == Integer.MIN_VALUE) {
                z12 = true;
            }
            bVar.f5253b = z12;
        } else {
            this.H.f5253b = false;
        }
        if (j() || !this.B) {
            this.H.f5252a = this.J.g() - aVar.f5246c;
        } else {
            this.H.f5252a = aVar.f5246c - getPaddingRight();
        }
        b bVar2 = this.H;
        bVar2.f5255d = aVar.f5244a;
        bVar2.f5259h = 1;
        bVar2.f5260i = 1;
        bVar2.f5256e = aVar.f5246c;
        bVar2.f5257f = Integer.MIN_VALUE;
        bVar2.f5254c = aVar.f5245b;
        if (z10 && this.D.size() > 1 && (i10 = aVar.f5245b) >= 0 && i10 < this.D.size() - 1) {
            b bVar3 = this.H;
            bVar3.f5254c++;
            bVar3.f5255d += this.D.get(aVar.f5245b).f5269h;
        }
    }

    public final int k(View view) {
        int i10;
        int i11;
        if (j()) {
            i11 = RecyclerView.m.S(view);
            i10 = RecyclerView.m.F(view);
        } else {
            i11 = RecyclerView.m.N(view);
            i10 = RecyclerView.m.Q(view);
        }
        return i10 + i11;
    }

    public final void k0(int i10, int i11) {
        i1(Math.min(i10, i11));
    }

    public final void k1(a aVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean z12 = false;
        if (z11) {
            if (j()) {
                i11 = this.f3059u;
            } else {
                i11 = this.f3058t;
            }
            b bVar = this.H;
            if (i11 == 0 || i11 == Integer.MIN_VALUE) {
                z12 = true;
            }
            bVar.f5253b = z12;
        } else {
            this.H.f5253b = false;
        }
        if (j() || !this.B) {
            this.H.f5252a = aVar.f5246c - this.J.k();
        } else {
            this.H.f5252a = (this.S.getWidth() - aVar.f5246c) - this.J.k();
        }
        b bVar2 = this.H;
        bVar2.f5255d = aVar.f5244a;
        bVar2.f5259h = 1;
        bVar2.f5260i = -1;
        bVar2.f5256e = aVar.f5246c;
        bVar2.f5257f = Integer.MIN_VALUE;
        int i12 = aVar.f5245b;
        bVar2.f5254c = i12;
        if (z10 && i12 > 0 && this.D.size() > (i10 = aVar.f5245b)) {
            b bVar3 = this.H;
            bVar3.f5254c--;
            bVar3.f5255d -= this.D.get(i10).f5269h;
        }
    }

    public final void l0(int i10, int i11) {
        i1(i10);
    }

    public final void m0(int i10) {
        i1(i10);
    }

    public final void n0(RecyclerView recyclerView, int i10, int i11) {
        i1(i10);
        i1(i10);
    }

    public final boolean o() {
        int i10;
        if (this.f5231y == 0) {
            return j();
        }
        if (j()) {
            int i11 = this.f3060v;
            View view = this.S;
            if (view != null) {
                i10 = view.getWidth();
            } else {
                i10 = 0;
            }
            if (i11 > i10) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0251  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o0(androidx.recyclerview.widget.RecyclerView.s r20, androidx.recyclerview.widget.RecyclerView.w r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r0.F = r1
            r0.G = r2
            int r3 = r21.b()
            if (r3 != 0) goto L_0x0015
            boolean r4 = r2.f3103g
            if (r4 == 0) goto L_0x0015
            return
        L_0x0015:
            int r4 = r19.M()
            int r5 = r0.f5230x
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x005f
            if (r5 == r7) goto L_0x004e
            if (r5 == r6) goto L_0x003d
            r9 = 3
            if (r5 == r9) goto L_0x002c
            r0.B = r8
            r0.C = r8
            goto L_0x006f
        L_0x002c:
            if (r4 != r7) goto L_0x0030
            r4 = r7
            goto L_0x0031
        L_0x0030:
            r4 = r8
        L_0x0031:
            r0.B = r4
            int r5 = r0.f5231y
            if (r5 != r6) goto L_0x003a
            r4 = r4 ^ r7
            r0.B = r4
        L_0x003a:
            r0.C = r7
            goto L_0x006f
        L_0x003d:
            if (r4 != r7) goto L_0x0041
            r4 = r7
            goto L_0x0042
        L_0x0041:
            r4 = r8
        L_0x0042:
            r0.B = r4
            int r5 = r0.f5231y
            if (r5 != r6) goto L_0x004b
            r4 = r4 ^ r7
            r0.B = r4
        L_0x004b:
            r0.C = r8
            goto L_0x006f
        L_0x004e:
            if (r4 == r7) goto L_0x0052
            r4 = r7
            goto L_0x0053
        L_0x0052:
            r4 = r8
        L_0x0053:
            r0.B = r4
            int r4 = r0.f5231y
            if (r4 != r6) goto L_0x005b
            r4 = r7
            goto L_0x005c
        L_0x005b:
            r4 = r8
        L_0x005c:
            r0.C = r4
            goto L_0x006f
        L_0x005f:
            if (r4 != r7) goto L_0x0063
            r4 = r7
            goto L_0x0064
        L_0x0063:
            r4 = r8
        L_0x0064:
            r0.B = r4
            int r4 = r0.f5231y
            if (r4 != r6) goto L_0x006c
            r4 = r7
            goto L_0x006d
        L_0x006c:
            r4 = r8
        L_0x006d:
            r0.C = r4
        L_0x006f:
            r19.S0()
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.H
            if (r4 != 0) goto L_0x007d
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = new com.google.android.flexbox.FlexboxLayoutManager$b
            r4.<init>()
            r0.H = r4
        L_0x007d:
            com.google.android.flexbox.c r4 = r0.E
            r4.j(r3)
            com.google.android.flexbox.c r4 = r0.E
            r4.k(r3)
            com.google.android.flexbox.c r4 = r0.E
            r4.i(r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.H
            r4.f5261j = r8
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r4 = r0.L
            if (r4 == 0) goto L_0x00a1
            int r5 = r4.f5242a
            if (r5 < 0) goto L_0x009c
            if (r5 >= r3) goto L_0x009c
            r6 = r7
            goto L_0x009d
        L_0x009c:
            r6 = r8
        L_0x009d:
            if (r6 == 0) goto L_0x00a1
            r0.M = r5
        L_0x00a1:
            com.google.android.flexbox.FlexboxLayoutManager$a r5 = r0.I
            boolean r6 = r5.f5249f
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = -1
            if (r6 == 0) goto L_0x00b0
            int r6 = r0.M
            if (r6 != r10) goto L_0x00b0
            if (r4 == 0) goto L_0x025c
        L_0x00b0:
            com.google.android.flexbox.FlexboxLayoutManager.a.b(r5)
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.I
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r5 = r0.L
            boolean r6 = r2.f3103g
            if (r6 != 0) goto L_0x01ac
            int r6 = r0.M
            if (r6 != r10) goto L_0x00c1
            goto L_0x01ac
        L_0x00c1:
            if (r6 < 0) goto L_0x01a8
            int r11 = r21.b()
            if (r6 < r11) goto L_0x00cb
            goto L_0x01a8
        L_0x00cb:
            int r6 = r0.M
            r4.f5244a = r6
            com.google.android.flexbox.c r11 = r0.E
            int[] r11 = r11.f5282c
            r6 = r11[r6]
            r4.f5245b = r6
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r6 = r0.L
            if (r6 == 0) goto L_0x00fb
            int r11 = r21.b()
            int r6 = r6.f5242a
            if (r6 < 0) goto L_0x00e7
            if (r6 >= r11) goto L_0x00e7
            r6 = r7
            goto L_0x00e8
        L_0x00e7:
            r6 = r8
        L_0x00e8:
            if (r6 == 0) goto L_0x00fb
            androidx.recyclerview.widget.q r6 = r0.J
            int r6 = r6.k()
            int r5 = r5.f5243b
            int r6 = r6 + r5
            r4.f5246c = r6
            r4.f5250g = r7
            r4.f5245b = r10
            goto L_0x01a6
        L_0x00fb:
            int r5 = r0.N
            if (r5 != r9) goto L_0x0185
            int r5 = r0.M
            android.view.View r5 = r0.B(r5)
            if (r5 == 0) goto L_0x016a
            androidx.recyclerview.widget.q r6 = r0.J
            int r6 = r6.c(r5)
            androidx.recyclerview.widget.q r11 = r0.J
            int r11 = r11.l()
            if (r6 <= r11) goto L_0x011a
            com.google.android.flexbox.FlexboxLayoutManager.a.a(r4)
            goto L_0x01a6
        L_0x011a:
            androidx.recyclerview.widget.q r6 = r0.J
            int r6 = r6.e(r5)
            androidx.recyclerview.widget.q r11 = r0.J
            int r11 = r11.k()
            int r6 = r6 - r11
            if (r6 >= 0) goto L_0x0135
            androidx.recyclerview.widget.q r5 = r0.J
            int r5 = r5.k()
            r4.f5246c = r5
            r4.f5248e = r8
            goto L_0x01a6
        L_0x0135:
            androidx.recyclerview.widget.q r6 = r0.J
            int r6 = r6.g()
            androidx.recyclerview.widget.q r11 = r0.J
            int r11 = r11.b(r5)
            int r6 = r6 - r11
            if (r6 >= 0) goto L_0x014f
            androidx.recyclerview.widget.q r5 = r0.J
            int r5 = r5.g()
            r4.f5246c = r5
            r4.f5248e = r7
            goto L_0x01a6
        L_0x014f:
            boolean r6 = r4.f5248e
            if (r6 == 0) goto L_0x0161
            androidx.recyclerview.widget.q r6 = r0.J
            int r5 = r6.b(r5)
            androidx.recyclerview.widget.q r6 = r0.J
            int r6 = r6.m()
            int r6 = r6 + r5
            goto L_0x0167
        L_0x0161:
            androidx.recyclerview.widget.q r6 = r0.J
            int r6 = r6.e(r5)
        L_0x0167:
            r4.f5246c = r6
            goto L_0x01a6
        L_0x016a:
            int r5 = r19.H()
            if (r5 <= 0) goto L_0x0181
            android.view.View r5 = r0.G(r8)
            int r5 = androidx.recyclerview.widget.RecyclerView.m.O(r5)
            int r6 = r0.M
            if (r6 >= r5) goto L_0x017e
            r5 = r7
            goto L_0x017f
        L_0x017e:
            r5 = r8
        L_0x017f:
            r4.f5248e = r5
        L_0x0181:
            com.google.android.flexbox.FlexboxLayoutManager.a.a(r4)
            goto L_0x01a6
        L_0x0185:
            boolean r5 = r19.j()
            if (r5 != 0) goto L_0x019b
            boolean r5 = r0.B
            if (r5 == 0) goto L_0x019b
            int r5 = r0.N
            androidx.recyclerview.widget.q r6 = r0.J
            int r6 = r6.h()
            int r5 = r5 - r6
            r4.f5246c = r5
            goto L_0x01a6
        L_0x019b:
            androidx.recyclerview.widget.q r5 = r0.J
            int r5 = r5.k()
            int r6 = r0.N
            int r5 = r5 + r6
            r4.f5246c = r5
        L_0x01a6:
            r5 = r7
            goto L_0x01ad
        L_0x01a8:
            r0.M = r10
            r0.N = r9
        L_0x01ac:
            r5 = r8
        L_0x01ad:
            if (r5 == 0) goto L_0x01b1
            goto L_0x0258
        L_0x01b1:
            int r5 = r19.H()
            if (r5 != 0) goto L_0x01b9
            goto L_0x024d
        L_0x01b9:
            boolean r5 = r4.f5248e
            if (r5 == 0) goto L_0x01c6
            int r5 = r21.b()
            android.view.View r5 = r0.W0(r5)
            goto L_0x01ce
        L_0x01c6:
            int r5 = r21.b()
            android.view.View r5 = r0.U0(r5)
        L_0x01ce:
            if (r5 == 0) goto L_0x024d
            com.google.android.flexbox.FlexboxLayoutManager r6 = com.google.android.flexbox.FlexboxLayoutManager.this
            int r11 = r6.f5231y
            if (r11 != 0) goto L_0x01d9
            androidx.recyclerview.widget.q r11 = r6.K
            goto L_0x01db
        L_0x01d9:
            androidx.recyclerview.widget.q r11 = r6.J
        L_0x01db:
            boolean r6 = r6.j()
            if (r6 != 0) goto L_0x01fe
            com.google.android.flexbox.FlexboxLayoutManager r6 = com.google.android.flexbox.FlexboxLayoutManager.this
            boolean r6 = r6.B
            if (r6 == 0) goto L_0x01fe
            boolean r6 = r4.f5248e
            if (r6 == 0) goto L_0x01f7
            int r6 = r11.e(r5)
            int r11 = r11.m()
            int r11 = r11 + r6
            r4.f5246c = r11
            goto L_0x0214
        L_0x01f7:
            int r6 = r11.b(r5)
            r4.f5246c = r6
            goto L_0x0214
        L_0x01fe:
            boolean r6 = r4.f5248e
            if (r6 == 0) goto L_0x020e
            int r6 = r11.b(r5)
            int r11 = r11.m()
            int r11 = r11 + r6
            r4.f5246c = r11
            goto L_0x0214
        L_0x020e:
            int r6 = r11.e(r5)
            r4.f5246c = r6
        L_0x0214:
            com.google.android.flexbox.FlexboxLayoutManager r6 = com.google.android.flexbox.FlexboxLayoutManager.this
            r6.getClass()
            int r5 = androidx.recyclerview.widget.RecyclerView.m.O(r5)
            r4.f5244a = r5
            r4.f5250g = r8
            com.google.android.flexbox.FlexboxLayoutManager r6 = com.google.android.flexbox.FlexboxLayoutManager.this
            com.google.android.flexbox.c r11 = r6.E
            int[] r11 = r11.f5282c
            if (r5 == r10) goto L_0x022a
            goto L_0x022b
        L_0x022a:
            r5 = r8
        L_0x022b:
            r5 = r11[r5]
            if (r5 == r10) goto L_0x0230
            goto L_0x0231
        L_0x0230:
            r5 = r8
        L_0x0231:
            r4.f5245b = r5
            java.util.List<com.google.android.flexbox.b> r5 = r6.D
            int r5 = r5.size()
            int r6 = r4.f5245b
            if (r5 <= r6) goto L_0x024b
            com.google.android.flexbox.FlexboxLayoutManager r5 = com.google.android.flexbox.FlexboxLayoutManager.this
            java.util.List<com.google.android.flexbox.b> r5 = r5.D
            java.lang.Object r5 = r5.get(r6)
            com.google.android.flexbox.b r5 = (com.google.android.flexbox.b) r5
            int r5 = r5.f5276o
            r4.f5244a = r5
        L_0x024b:
            r5 = r7
            goto L_0x024e
        L_0x024d:
            r5 = r8
        L_0x024e:
            if (r5 == 0) goto L_0x0251
            goto L_0x0258
        L_0x0251:
            com.google.android.flexbox.FlexboxLayoutManager.a.a(r4)
            r4.f5244a = r8
            r4.f5245b = r8
        L_0x0258:
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.I
            r4.f5249f = r7
        L_0x025c:
            r19.A(r20)
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.I
            boolean r5 = r4.f5248e
            if (r5 == 0) goto L_0x0269
            r0.k1(r4, r8, r7)
            goto L_0x026c
        L_0x0269:
            r0.j1(r4, r8, r7)
        L_0x026c:
            int r4 = r0.f3060v
            int r5 = r0.f3058t
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            int r5 = r0.f3061w
            int r6 = r0.f3059u
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
            int r6 = r0.f3060v
            int r11 = r0.f3061w
            boolean r12 = r19.j()
            if (r12 == 0) goto L_0x02a5
            int r12 = r0.O
            if (r12 == r9) goto L_0x028e
            if (r12 == r6) goto L_0x028e
            r9 = r7
            goto L_0x028f
        L_0x028e:
            r9 = r8
        L_0x028f:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r0.H
            boolean r13 = r12.f5253b
            if (r13 == 0) goto L_0x02a2
            android.content.Context r12 = r0.R
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.heightPixels
            goto L_0x02c3
        L_0x02a2:
            int r12 = r12.f5252a
            goto L_0x02c3
        L_0x02a5:
            int r12 = r0.P
            if (r12 == r9) goto L_0x02ad
            if (r12 == r11) goto L_0x02ad
            r9 = r7
            goto L_0x02ae
        L_0x02ad:
            r9 = r8
        L_0x02ae:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r0.H
            boolean r13 = r12.f5253b
            if (r13 == 0) goto L_0x02c1
            android.content.Context r12 = r0.R
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.widthPixels
            goto L_0x02c3
        L_0x02c1:
            int r12 = r12.f5252a
        L_0x02c3:
            r15 = r12
            r0.O = r6
            r0.P = r11
            int r6 = r0.T
            r11 = 0
            if (r6 != r10) goto L_0x0339
            int r12 = r0.M
            if (r12 != r10) goto L_0x02d3
            if (r9 == 0) goto L_0x0339
        L_0x02d3:
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.I
            boolean r3 = r3.f5248e
            if (r3 == 0) goto L_0x02db
            goto L_0x03db
        L_0x02db:
            java.util.List<com.google.android.flexbox.b> r3 = r0.D
            r3.clear()
            com.google.android.flexbox.c$a r3 = r0.U
            r3.f5285a = r11
            r3.f5286b = r8
            boolean r3 = r19.j()
            if (r3 == 0) goto L_0x0302
            com.google.android.flexbox.c r11 = r0.E
            com.google.android.flexbox.c$a r12 = r0.U
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.I
            int r3 = r3.f5244a
            java.util.List<com.google.android.flexbox.b> r6 = r0.D
            r16 = 0
            r13 = r4
            r14 = r5
            r17 = r3
            r18 = r6
            r11.b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0317
        L_0x0302:
            com.google.android.flexbox.c r11 = r0.E
            com.google.android.flexbox.c$a r12 = r0.U
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.I
            int r3 = r3.f5244a
            java.util.List<com.google.android.flexbox.b> r6 = r0.D
            r16 = 0
            r13 = r5
            r14 = r4
            r17 = r3
            r18 = r6
            r11.b(r12, r13, r14, r15, r16, r17, r18)
        L_0x0317:
            com.google.android.flexbox.c$a r3 = r0.U
            java.util.List<com.google.android.flexbox.b> r3 = r3.f5285a
            r0.D = r3
            com.google.android.flexbox.c r3 = r0.E
            r3.h(r4, r5, r8)
            com.google.android.flexbox.c r3 = r0.E
            r3.u(r8)
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.I
            com.google.android.flexbox.c r4 = r0.E
            int[] r4 = r4.f5282c
            int r5 = r3.f5244a
            r4 = r4[r5]
            r3.f5245b = r4
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.H
            r3.f5254c = r4
            goto L_0x03db
        L_0x0339:
            if (r6 == r10) goto L_0x0344
            com.google.android.flexbox.FlexboxLayoutManager$a r9 = r0.I
            int r9 = r9.f5244a
            int r6 = java.lang.Math.min(r6, r9)
            goto L_0x0348
        L_0x0344:
            com.google.android.flexbox.FlexboxLayoutManager$a r6 = r0.I
            int r6 = r6.f5244a
        L_0x0348:
            com.google.android.flexbox.c$a r9 = r0.U
            r9.f5285a = r11
            r9.f5286b = r8
            boolean r9 = r19.j()
            if (r9 == 0) goto L_0x0390
            java.util.List<com.google.android.flexbox.b> r9 = r0.D
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x0379
            com.google.android.flexbox.c r3 = r0.E
            java.util.List<com.google.android.flexbox.b> r9 = r0.D
            r3.d(r6, r9)
            com.google.android.flexbox.c r11 = r0.E
            com.google.android.flexbox.c$a r12 = r0.U
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.I
            int r3 = r3.f5244a
            java.util.List<com.google.android.flexbox.b> r9 = r0.D
            r13 = r4
            r14 = r5
            r16 = r6
            r17 = r3
            r18 = r9
            r11.b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03cb
        L_0x0379:
            com.google.android.flexbox.c r9 = r0.E
            r9.i(r3)
            com.google.android.flexbox.c r11 = r0.E
            com.google.android.flexbox.c$a r12 = r0.U
            r16 = 0
            java.util.List<com.google.android.flexbox.b> r3 = r0.D
            r17 = -1
            r13 = r4
            r14 = r5
            r18 = r3
            r11.b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03cb
        L_0x0390:
            java.util.List<com.google.android.flexbox.b> r9 = r0.D
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x03b5
            com.google.android.flexbox.c r3 = r0.E
            java.util.List<com.google.android.flexbox.b> r9 = r0.D
            r3.d(r6, r9)
            com.google.android.flexbox.c r11 = r0.E
            com.google.android.flexbox.c$a r12 = r0.U
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.I
            int r3 = r3.f5244a
            java.util.List<com.google.android.flexbox.b> r9 = r0.D
            r13 = r5
            r14 = r4
            r16 = r6
            r17 = r3
            r18 = r9
            r11.b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03cb
        L_0x03b5:
            com.google.android.flexbox.c r9 = r0.E
            r9.i(r3)
            com.google.android.flexbox.c r11 = r0.E
            com.google.android.flexbox.c$a r12 = r0.U
            r16 = 0
            java.util.List<com.google.android.flexbox.b> r3 = r0.D
            r17 = -1
            r13 = r5
            r14 = r4
            r18 = r3
            r11.b(r12, r13, r14, r15, r16, r17, r18)
        L_0x03cb:
            com.google.android.flexbox.c$a r3 = r0.U
            java.util.List<com.google.android.flexbox.b> r3 = r3.f5285a
            r0.D = r3
            com.google.android.flexbox.c r3 = r0.E
            r3.h(r4, r5, r6)
            com.google.android.flexbox.c r3 = r0.E
            r3.u(r6)
        L_0x03db:
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.I
            boolean r3 = r3.f5248e
            if (r3 == 0) goto L_0x03f9
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.H
            r0.T0(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.H
            int r3 = r3.f5256e
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.I
            r0.j1(r4, r7, r8)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.H
            r0.T0(r1, r2, r4)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.H
            int r4 = r4.f5256e
            goto L_0x0410
        L_0x03f9:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.H
            r0.T0(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.H
            int r4 = r3.f5256e
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.I
            r0.k1(r3, r7, r8)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.H
            r0.T0(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.H
            int r3 = r3.f5256e
        L_0x0410:
            int r5 = r19.H()
            if (r5 <= 0) goto L_0x042d
            com.google.android.flexbox.FlexboxLayoutManager$a r5 = r0.I
            boolean r5 = r5.f5248e
            if (r5 == 0) goto L_0x0425
            int r4 = r0.a1(r4, r1, r2, r7)
            int r4 = r4 + r3
            r0.b1(r4, r1, r2, r8)
            goto L_0x042d
        L_0x0425:
            int r3 = r0.b1(r3, r1, r2, r7)
            int r3 = r3 + r4
            r0.a1(r3, r1, r2, r8)
        L_0x042d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.o0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    public final boolean p() {
        int i10;
        if (this.f5231y == 0) {
            return !j();
        }
        if (j()) {
            return true;
        }
        int i11 = this.f3061w;
        View view = this.S;
        if (view != null) {
            i10 = view.getHeight();
        } else {
            i10 = 0;
        }
        if (i11 > i10) {
            return true;
        }
        return false;
    }

    public final void p0(RecyclerView.w wVar) {
        this.L = null;
        this.M = -1;
        this.N = Integer.MIN_VALUE;
        this.T = -1;
        a.b(this.I);
        this.Q.clear();
    }

    public final boolean q(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void r0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.L = (SavedState) parcelable;
            A0();
        }
    }

    public final Parcelable s0() {
        SavedState savedState = this.L;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (H() > 0) {
            View G2 = G(0);
            savedState2.f5242a = RecyclerView.m.O(G2);
            savedState2.f5243b = this.J.e(G2) - this.J.k();
        } else {
            savedState2.f5242a = -1;
        }
        return savedState2;
    }

    public final void setFlexLines(List<b> list) {
        this.D = list;
    }

    public final int u(RecyclerView.w wVar) {
        return P0(wVar);
    }

    public final int v(RecyclerView.w wVar) {
        return Q0(wVar);
    }

    public final int w(RecyclerView.w wVar) {
        return R0(wVar);
    }

    public final int x(RecyclerView.w wVar) {
        return P0(wVar);
    }

    public final int y(RecyclerView.w wVar) {
        return Q0(wVar);
    }

    public final int z(RecyclerView.w wVar) {
        return R0(wVar);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public float f5233e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f5234f = 1.0f;

        /* renamed from: n  reason: collision with root package name */
        public int f5235n = -1;

        /* renamed from: o  reason: collision with root package name */
        public float f5236o = -1.0f;

        /* renamed from: p  reason: collision with root package name */
        public int f5237p;

        /* renamed from: q  reason: collision with root package name */
        public int f5238q;

        /* renamed from: r  reason: collision with root package name */
        public int f5239r = 16777215;

        /* renamed from: s  reason: collision with root package name */
        public int f5240s = 16777215;

        /* renamed from: t  reason: collision with root package name */
        public boolean f5241t;

        public static class a implements Parcelable.Creator<LayoutParams> {
            public final Object createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            public final Object[] newArray(int i10) {
                return new LayoutParams[i10];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final boolean A0() {
            return this.f5241t;
        }

        public final float B() {
            return this.f5234f;
        }

        public final int B0() {
            return this.f5240s;
        }

        public final int E() {
            return this.f5237p;
        }

        public final void K(int i10) {
            this.f5237p = i10;
        }

        public final int L() {
            return this.bottomMargin;
        }

        public final int N() {
            return this.leftMargin;
        }

        public final int N0() {
            return this.f5239r;
        }

        public final int W() {
            return this.topMargin;
        }

        public final void a0(int i10) {
            this.f5238q = i10;
        }

        public final int b() {
            return this.height;
        }

        public final int c() {
            return this.width;
        }

        public final float d0() {
            return this.f5233e;
        }

        public final int describeContents() {
            return 0;
        }

        public final int getOrder() {
            return 1;
        }

        public final float l0() {
            return this.f5236o;
        }

        public final int t0() {
            return this.rightMargin;
        }

        public final int w0() {
            return this.f5238q;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeFloat(this.f5233e);
            parcel.writeFloat(this.f5234f);
            parcel.writeInt(this.f5235n);
            parcel.writeFloat(this.f5236o);
            parcel.writeInt(this.f5237p);
            parcel.writeInt(this.f5238q);
            parcel.writeInt(this.f5239r);
            parcel.writeInt(this.f5240s);
            parcel.writeByte(this.f5241t ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public final int x() {
            return this.f5235n;
        }

        public LayoutParams() {
            super(-2, -2);
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f5233e = parcel.readFloat();
            this.f5234f = parcel.readFloat();
            this.f5235n = parcel.readInt();
            this.f5236o = parcel.readFloat();
            this.f5237p = parcel.readInt();
            this.f5238q = parcel.readInt();
            this.f5239r = parcel.readInt();
            this.f5240s = parcel.readInt();
            this.f5241t = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.m.d P2 = RecyclerView.m.P(context, attributeSet, i10, i11);
        int i12 = P2.f3064a;
        if (i12 != 0) {
            if (i12 == 1) {
                if (P2.f3066c) {
                    f1(3);
                } else {
                    f1(2);
                }
            }
        } else if (P2.f3066c) {
            f1(1);
        } else {
            f1(0);
        }
        g1(1);
        if (this.f5232z != 4) {
            v0();
            this.D.clear();
            a.b(this.I);
            this.I.f5247d = 0;
            this.f5232z = 4;
            A0();
        }
        this.f3053o = true;
        this.R = context;
    }
}
