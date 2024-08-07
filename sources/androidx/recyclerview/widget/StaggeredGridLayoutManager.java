package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.v.b {
    public q A;
    public int B;
    public int C;
    public final k D;
    public boolean E;
    public boolean F;
    public BitSet G;
    public int H;
    public int I;
    public LazySpanLookup J;
    public int K;
    public boolean L;
    public boolean M;
    public SavedState N;
    public final Rect O;
    public final b P;
    public boolean Q;
    public int[] R;
    public final a S;

    /* renamed from: x  reason: collision with root package name */
    public int f3118x = -1;

    /* renamed from: y  reason: collision with root package name */
    public c[] f3119y;

    /* renamed from: z  reason: collision with root package name */
    public q f3120z;

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e  reason: collision with root package name */
        public c f3121e;

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

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f3128a;

        /* renamed from: b  reason: collision with root package name */
        public int f3129b;

        /* renamed from: c  reason: collision with root package name */
        public int f3130c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f3131d;

        /* renamed from: e  reason: collision with root package name */
        public int f3132e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f3133f;

        /* renamed from: n  reason: collision with root package name */
        public List<LazySpanLookup.FullSpanItem> f3134n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f3135o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f3136p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f3137q;

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
            parcel.writeInt(this.f3128a);
            parcel.writeInt(this.f3129b);
            parcel.writeInt(this.f3130c);
            if (this.f3130c > 0) {
                parcel.writeIntArray(this.f3131d);
            }
            parcel.writeInt(this.f3132e);
            if (this.f3132e > 0) {
                parcel.writeIntArray(this.f3133f);
            }
            parcel.writeInt(this.f3135o ? 1 : 0);
            parcel.writeInt(this.f3136p ? 1 : 0);
            parcel.writeInt(this.f3137q ? 1 : 0);
            parcel.writeList(this.f3134n);
        }

        public SavedState(Parcel parcel) {
            this.f3128a = parcel.readInt();
            this.f3129b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3130c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3131d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3132e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3133f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.f3135o = parcel.readInt() == 1;
            this.f3136p = parcel.readInt() == 1;
            this.f3137q = parcel.readInt() == 1 ? true : z10;
            this.f3134n = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f3130c = savedState.f3130c;
            this.f3128a = savedState.f3128a;
            this.f3129b = savedState.f3129b;
            this.f3131d = savedState.f3131d;
            this.f3132e = savedState.f3132e;
            this.f3133f = savedState.f3133f;
            this.f3135o = savedState.f3135o;
            this.f3136p = savedState.f3136p;
            this.f3137q = savedState.f3137q;
            this.f3134n = savedState.f3134n;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            StaggeredGridLayoutManager.this.Q0();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3139a;

        /* renamed from: b  reason: collision with root package name */
        public int f3140b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3141c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3142d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3143e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f3144f;

        public b() {
            a();
        }

        public final void a() {
            this.f3139a = -1;
            this.f3140b = Integer.MIN_VALUE;
            this.f3141c = false;
            this.f3142d = false;
            this.f3143e = false;
            int[] iArr = this.f3144f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f3146a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f3147b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f3148c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f3149d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f3150e;

        public c(int i10) {
            this.f3150e = i10;
        }

        public static LayoutParams h(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        public final void a() {
            ArrayList<View> arrayList = this.f3146a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams h10 = h(view);
            this.f3148c = StaggeredGridLayoutManager.this.f3120z.b(view);
            h10.getClass();
        }

        public final void b() {
            this.f3146a.clear();
            this.f3147b = Integer.MIN_VALUE;
            this.f3148c = Integer.MIN_VALUE;
            this.f3149d = 0;
        }

        public final int c() {
            if (StaggeredGridLayoutManager.this.E) {
                return e(this.f3146a.size() - 1, -1);
            }
            return e(0, this.f3146a.size());
        }

        public final int d() {
            if (StaggeredGridLayoutManager.this.E) {
                return e(0, this.f3146a.size());
            }
            return e(this.f3146a.size() - 1, -1);
        }

        public final int e(int i10, int i11) {
            int i12;
            boolean z10;
            int k10 = StaggeredGridLayoutManager.this.f3120z.k();
            int g2 = StaggeredGridLayoutManager.this.f3120z.g();
            if (i11 > i10) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            while (i10 != i11) {
                View view = this.f3146a.get(i10);
                int e10 = StaggeredGridLayoutManager.this.f3120z.e(view);
                int b10 = StaggeredGridLayoutManager.this.f3120z.b(view);
                boolean z11 = false;
                if (e10 <= g2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b10 >= k10) {
                    z11 = true;
                }
                if (!z10 || !z11 || (e10 >= k10 && b10 <= g2)) {
                    i10 += i12;
                } else {
                    StaggeredGridLayoutManager.this.getClass();
                    return RecyclerView.m.O(view);
                }
            }
            return -1;
        }

        public final int f(int i10) {
            int i11 = this.f3148c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3146a.size() == 0) {
                return i10;
            }
            a();
            return this.f3148c;
        }

        public final View g(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f3146a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3146a.get(size);
                    if ((StaggeredGridLayoutManager.this.E && RecyclerView.m.O(view2) >= i10) || ((!StaggeredGridLayoutManager.this.E && RecyclerView.m.O(view2) <= i10) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3146a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f3146a.get(i12);
                    if ((StaggeredGridLayoutManager.this.E && RecyclerView.m.O(view3) <= i10) || ((!StaggeredGridLayoutManager.this.E && RecyclerView.m.O(view3) >= i10) || !view3.hasFocusable())) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public final int i(int i10) {
            int i11 = this.f3147b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3146a.size() == 0) {
                return i10;
            }
            View view = this.f3146a.get(0);
            LayoutParams h10 = h(view);
            this.f3147b = StaggeredGridLayoutManager.this.f3120z.e(view);
            h10.getClass();
            return this.f3147b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.E = false;
        this.F = false;
        this.H = -1;
        this.I = Integer.MIN_VALUE;
        this.J = new LazySpanLookup();
        this.K = 2;
        this.O = new Rect();
        this.P = new b();
        this.Q = true;
        this.S = new a();
        RecyclerView.m.d P2 = RecyclerView.m.P(context, attributeSet, i10, i11);
        int i12 = P2.f3064a;
        if (i12 == 0 || i12 == 1) {
            m((String) null);
            if (i12 != this.B) {
                this.B = i12;
                q qVar = this.f3120z;
                this.f3120z = this.A;
                this.A = qVar;
                A0();
            }
            int i13 = P2.f3065b;
            m((String) null);
            if (i13 != this.f3118x) {
                this.J.a();
                A0();
                this.f3118x = i13;
                this.G = new BitSet(this.f3118x);
                this.f3119y = new c[this.f3118x];
                for (int i14 = 0; i14 < this.f3118x; i14++) {
                    this.f3119y[i14] = new c(i14);
                }
                A0();
            }
            boolean z10 = P2.f3066c;
            m((String) null);
            SavedState savedState = this.N;
            if (!(savedState == null || savedState.f3135o == z10)) {
                savedState.f3135o = z10;
            }
            this.E = z10;
            A0();
            this.D = new k();
            this.f3120z = q.a(this, this.B);
            this.A = q.a(this, 1 - this.B);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int s1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
        }
        return i10;
    }

    public final int B0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        return o1(i10, sVar, wVar);
    }

    public final RecyclerView.LayoutParams C() {
        if (this.B == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    public final void C0(int i10) {
        SavedState savedState = this.N;
        if (!(savedState == null || savedState.f3128a == i10)) {
            savedState.f3131d = null;
            savedState.f3130c = 0;
            savedState.f3128a = -1;
            savedState.f3129b = -1;
        }
        this.H = i10;
        this.I = Integer.MIN_VALUE;
        A0();
    }

    public final RecyclerView.LayoutParams D(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final int D0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        return o1(i10, sVar, wVar);
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
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.B == 1) {
            int height = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f3047b;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            i13 = RecyclerView.m.r(i11, height, d0.d.d(recyclerView));
            i12 = RecyclerView.m.r(i10, (this.C * this.f3118x) + paddingRight, d0.d.e(this.f3047b));
        } else {
            int width = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f3047b;
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            i12 = RecyclerView.m.r(i10, width, d0.d.e(recyclerView2));
            i13 = RecyclerView.m.r(i11, (this.C * this.f3118x) + paddingBottom, d0.d.d(this.f3047b));
        }
        this.f3047b.setMeasuredDimension(i12, i13);
    }

    public final void M0(RecyclerView recyclerView, RecyclerView.w wVar, int i10) {
        l lVar = new l(recyclerView.getContext());
        lVar.f3084a = i10;
        N0(lVar);
    }

    public final boolean O0() {
        if (this.N == null) {
            return true;
        }
        return false;
    }

    public final int P0(int i10) {
        boolean z10;
        if (H() != 0) {
            if (i10 < Z0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.F) {
                return -1;
            }
            return 1;
        } else if (this.F) {
            return 1;
        } else {
            return -1;
        }
    }

    public final boolean Q0() {
        int i10;
        if (!(H() == 0 || this.K == 0 || !this.f3052n)) {
            if (this.F) {
                i10 = a1();
                Z0();
            } else {
                i10 = Z0();
                a1();
            }
            if (i10 == 0 && e1() != null) {
                this.J.a();
                this.f3051f = true;
                A0();
                return true;
            }
        }
        return false;
    }

    public final int R0(RecyclerView.w wVar) {
        if (H() == 0) {
            return 0;
        }
        return v.a(wVar, this.f3120z, W0(!this.Q), V0(!this.Q), this, this.Q);
    }

    public final int S0(RecyclerView.w wVar) {
        if (H() == 0) {
            return 0;
        }
        return v.b(wVar, this.f3120z, W0(!this.Q), V0(!this.Q), this, this.Q, this.F);
    }

    public final int T0(RecyclerView.w wVar) {
        if (H() == 0) {
            return 0;
        }
        return v.c(wVar, this.f3120z, W0(!this.Q), V0(!this.Q), this, this.Q);
    }

    public final boolean U() {
        if (this.K != 0) {
            return true;
        }
        return false;
    }

    public final int U0(RecyclerView.s sVar, k kVar, RecyclerView.w wVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        c cVar;
        boolean z10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        RecyclerView.s sVar2 = sVar;
        k kVar2 = kVar;
        int i24 = 0;
        this.G.set(0, this.f3118x, true);
        if (this.D.f3278i) {
            if (kVar2.f3274e == 1) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
        } else if (kVar2.f3274e == 1) {
            i10 = kVar2.f3276g + kVar2.f3271b;
        } else {
            i10 = kVar2.f3275f - kVar2.f3271b;
        }
        int i25 = kVar2.f3274e;
        for (int i26 = 0; i26 < this.f3118x; i26++) {
            if (!this.f3119y[i26].f3146a.isEmpty()) {
                r1(this.f3119y[i26], i25, i10);
            }
        }
        if (this.F) {
            i11 = this.f3120z.g();
        } else {
            i11 = this.f3120z.k();
        }
        boolean z11 = false;
        while (true) {
            int i27 = kVar2.f3272c;
            if (i27 < 0 || i27 >= wVar.b()) {
                i12 = i24;
            } else {
                i12 = 1;
            }
            if (i12 == 0 || (!this.D.f3278i && this.G.isEmpty())) {
                int i28 = i24;
            } else {
                View d10 = sVar2.d(kVar2.f3272c);
                kVar2.f3272c += kVar2.f3273d;
                LayoutParams layoutParams = (LayoutParams) d10.getLayoutParams();
                int a10 = layoutParams.a();
                int[] iArr = this.J.f3122a;
                if (iArr == null || a10 >= iArr.length) {
                    i14 = -1;
                } else {
                    i14 = iArr[a10];
                }
                if (i14 == -1) {
                    i15 = 1;
                } else {
                    i15 = i24;
                }
                if (i15 != 0) {
                    if (i1(kVar2.f3274e)) {
                        i21 = -1;
                        i22 = this.f3118x - 1;
                        i23 = -1;
                    } else {
                        i23 = this.f3118x;
                        i22 = i24;
                        i21 = 1;
                    }
                    c cVar2 = null;
                    if (kVar2.f3274e == 1) {
                        int k10 = this.f3120z.k();
                        int i29 = Integer.MAX_VALUE;
                        while (i22 != i23) {
                            c cVar3 = this.f3119y[i22];
                            int f10 = cVar3.f(k10);
                            if (f10 < i29) {
                                cVar2 = cVar3;
                                i29 = f10;
                            }
                            i22 += i21;
                        }
                    } else {
                        int g2 = this.f3120z.g();
                        int i30 = Integer.MIN_VALUE;
                        while (i22 != i23) {
                            c cVar4 = this.f3119y[i22];
                            int i31 = cVar4.i(g2);
                            if (i31 > i30) {
                                cVar2 = cVar4;
                                i30 = i31;
                            }
                            i22 += i21;
                        }
                    }
                    cVar = cVar2;
                    LazySpanLookup lazySpanLookup = this.J;
                    lazySpanLookup.b(a10);
                    lazySpanLookup.f3122a[a10] = cVar.f3150e;
                } else {
                    cVar = this.f3119y[i14];
                }
                layoutParams.f3121e = cVar;
                if (kVar2.f3274e == 1) {
                    z10 = false;
                    l(d10, -1, false);
                } else {
                    z10 = false;
                    l(d10, 0, false);
                }
                if (this.B == 1) {
                    g1(d10, RecyclerView.m.I(this.C, this.f3058t, z10 ? 1 : 0, layoutParams.width, z10), RecyclerView.m.I(this.f3061w, this.f3059u, getPaddingBottom() + getPaddingTop(), layoutParams.height, true), z10);
                } else {
                    g1(d10, RecyclerView.m.I(this.f3060v, this.f3058t, getPaddingRight() + getPaddingLeft(), layoutParams.width, true), RecyclerView.m.I(this.C, this.f3059u, 0, layoutParams.height, false), false);
                }
                if (kVar2.f3274e == 1) {
                    i17 = cVar.f(i11);
                    i16 = this.f3120z.c(d10) + i17;
                } else {
                    i16 = cVar.i(i11);
                    i17 = i16 - this.f3120z.c(d10);
                }
                if (kVar2.f3274e == 1) {
                    c cVar5 = layoutParams.f3121e;
                    cVar5.getClass();
                    LayoutParams layoutParams2 = (LayoutParams) d10.getLayoutParams();
                    layoutParams2.f3121e = cVar5;
                    cVar5.f3146a.add(d10);
                    cVar5.f3148c = Integer.MIN_VALUE;
                    if (cVar5.f3146a.size() == 1) {
                        cVar5.f3147b = Integer.MIN_VALUE;
                    }
                    if (layoutParams2.e() || layoutParams2.d()) {
                        cVar5.f3149d = StaggeredGridLayoutManager.this.f3120z.c(d10) + cVar5.f3149d;
                    }
                } else {
                    c cVar6 = layoutParams.f3121e;
                    cVar6.getClass();
                    LayoutParams layoutParams3 = (LayoutParams) d10.getLayoutParams();
                    layoutParams3.f3121e = cVar6;
                    cVar6.f3146a.add(0, d10);
                    cVar6.f3147b = Integer.MIN_VALUE;
                    if (cVar6.f3146a.size() == 1) {
                        cVar6.f3148c = Integer.MIN_VALUE;
                    }
                    if (layoutParams3.e() || layoutParams3.d()) {
                        cVar6.f3149d = StaggeredGridLayoutManager.this.f3120z.c(d10) + cVar6.f3149d;
                    }
                }
                if (!f1() || this.B != 1) {
                    i18 = this.A.k() + (cVar.f3150e * this.C);
                    i19 = this.A.c(d10) + i18;
                } else {
                    i19 = this.A.g() - (((this.f3118x - 1) - cVar.f3150e) * this.C);
                    i18 = i19 - this.A.c(d10);
                }
                if (this.B == 1) {
                    RecyclerView.m.W(d10, i18, i17, i19, i16);
                } else {
                    RecyclerView.m.W(d10, i17, i18, i16, i19);
                }
                r1(cVar, this.D.f3274e, i10);
                k1(sVar2, this.D);
                if (!this.D.f3277h || !d10.hasFocusable()) {
                    i20 = 0;
                } else {
                    i20 = 0;
                    this.G.set(cVar.f3150e, false);
                }
                z11 = true;
                i24 = i20;
            }
        }
        int i282 = i24;
        if (!z11) {
            k1(sVar2, this.D);
        }
        if (this.D.f3274e == -1) {
            i13 = this.f3120z.k() - c1(this.f3120z.k());
        } else {
            i13 = b1(this.f3120z.g()) - this.f3120z.g();
        }
        if (i13 > 0) {
            return Math.min(kVar2.f3271b, i13);
        }
        return i282;
    }

    public final View V0(boolean z10) {
        int k10 = this.f3120z.k();
        int g2 = this.f3120z.g();
        View view = null;
        for (int H2 = H() - 1; H2 >= 0; H2--) {
            View G2 = G(H2);
            int e10 = this.f3120z.e(G2);
            int b10 = this.f3120z.b(G2);
            if (b10 > k10 && e10 < g2) {
                if (b10 <= g2 || !z10) {
                    return G2;
                }
                if (view == null) {
                    view = G2;
                }
            }
        }
        return view;
    }

    public final View W0(boolean z10) {
        int k10 = this.f3120z.k();
        int g2 = this.f3120z.g();
        int H2 = H();
        View view = null;
        for (int i10 = 0; i10 < H2; i10++) {
            View G2 = G(i10);
            int e10 = this.f3120z.e(G2);
            if (this.f3120z.b(G2) > k10 && e10 < g2) {
                if (e10 >= k10 || !z10) {
                    return G2;
                }
                if (view == null) {
                    view = G2;
                }
            }
        }
        return view;
    }

    public final void X0(RecyclerView.s sVar, RecyclerView.w wVar, boolean z10) {
        int g2;
        int b12 = b1(Integer.MIN_VALUE);
        if (b12 != Integer.MIN_VALUE && (g2 = this.f3120z.g() - b12) > 0) {
            int i10 = g2 - (-o1(-g2, sVar, wVar));
            if (z10 && i10 > 0) {
                this.f3120z.p(i10);
            }
        }
    }

    public final void Y(int i10) {
        super.Y(i10);
        for (int i11 = 0; i11 < this.f3118x; i11++) {
            c cVar = this.f3119y[i11];
            int i12 = cVar.f3147b;
            if (i12 != Integer.MIN_VALUE) {
                cVar.f3147b = i12 + i10;
            }
            int i13 = cVar.f3148c;
            if (i13 != Integer.MIN_VALUE) {
                cVar.f3148c = i13 + i10;
            }
        }
    }

    public final void Y0(RecyclerView.s sVar, RecyclerView.w wVar, boolean z10) {
        int k10;
        int c12 = c1(Integer.MAX_VALUE);
        if (c12 != Integer.MAX_VALUE && (k10 = c12 - this.f3120z.k()) > 0) {
            int o12 = k10 - o1(k10, sVar, wVar);
            if (z10 && o12 > 0) {
                this.f3120z.p(-o12);
            }
        }
    }

    public final void Z(int i10) {
        super.Z(i10);
        for (int i11 = 0; i11 < this.f3118x; i11++) {
            c cVar = this.f3119y[i11];
            int i12 = cVar.f3147b;
            if (i12 != Integer.MIN_VALUE) {
                cVar.f3147b = i12 + i10;
            }
            int i13 = cVar.f3148c;
            if (i13 != Integer.MIN_VALUE) {
                cVar.f3148c = i13 + i10;
            }
        }
    }

    public final int Z0() {
        if (H() == 0) {
            return 0;
        }
        return RecyclerView.m.O(G(0));
    }

    public final PointF a(int i10) {
        int P0 = P0(i10);
        PointF pointF = new PointF();
        if (P0 == 0) {
            return null;
        }
        if (this.B == 0) {
            pointF.x = (float) P0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) P0;
        }
        return pointF;
    }

    public final void a0() {
        this.J.a();
        for (int i10 = 0; i10 < this.f3118x; i10++) {
            this.f3119y[i10].b();
        }
    }

    public final int a1() {
        int H2 = H();
        if (H2 == 0) {
            return 0;
        }
        return RecyclerView.m.O(G(H2 - 1));
    }

    public final int b1(int i10) {
        int f10 = this.f3119y[0].f(i10);
        for (int i11 = 1; i11 < this.f3118x; i11++) {
            int f11 = this.f3119y[i11].f(i10);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    public final void c0(RecyclerView recyclerView) {
        a aVar = this.S;
        RecyclerView recyclerView2 = this.f3047b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(aVar);
        }
        for (int i10 = 0; i10 < this.f3118x; i10++) {
            this.f3119y[i10].b();
        }
        recyclerView.requestLayout();
    }

    public final int c1(int i10) {
        int i11 = this.f3119y[0].i(i10);
        for (int i12 = 1; i12 < this.f3118x; i12++) {
            int i13 = this.f3119y[i12].i(i10);
            if (i13 < i11) {
                i11 = i13;
            }
        }
        return i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r8.B == 1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        if (r8.B == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        if (f1() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        if (f1() == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View d0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.s r11, androidx.recyclerview.widget.RecyclerView.w r12) {
        /*
            r8 = this;
            int r0 = r8.H()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3047b
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r9 = r1
            goto L_0x001e
        L_0x000e:
            android.view.View r9 = r0.E(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            androidx.recyclerview.widget.b r0 = r8.f3046a
            boolean r0 = r0.k(r9)
            if (r0 == 0) goto L_0x001e
            goto L_0x000c
        L_0x001e:
            if (r9 != 0) goto L_0x0021
            return r1
        L_0x0021:
            r8.n1()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = -1
            if (r10 == r2) goto L_0x0060
            r4 = 2
            if (r10 == r4) goto L_0x0054
            r4 = 17
            if (r10 == r4) goto L_0x004d
            r4 = 33
            if (r10 == r4) goto L_0x0048
            r4 = 66
            if (r10 == r4) goto L_0x0043
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x003e
            goto L_0x0052
        L_0x003e:
            int r10 = r8.B
            if (r10 != r2) goto L_0x0052
            goto L_0x006b
        L_0x0043:
            int r10 = r8.B
            if (r10 != 0) goto L_0x0052
            goto L_0x006b
        L_0x0048:
            int r10 = r8.B
            if (r10 != r2) goto L_0x0052
            goto L_0x006d
        L_0x004d:
            int r10 = r8.B
            if (r10 != 0) goto L_0x0052
            goto L_0x006d
        L_0x0052:
            r10 = r0
            goto L_0x006e
        L_0x0054:
            int r10 = r8.B
            if (r10 != r2) goto L_0x0059
            goto L_0x006b
        L_0x0059:
            boolean r10 = r8.f1()
            if (r10 == 0) goto L_0x006b
            goto L_0x006d
        L_0x0060:
            int r10 = r8.B
            if (r10 != r2) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            boolean r10 = r8.f1()
            if (r10 == 0) goto L_0x006d
        L_0x006b:
            r10 = r2
            goto L_0x006e
        L_0x006d:
            r10 = r3
        L_0x006e:
            if (r10 != r0) goto L_0x0071
            return r1
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r0
            r0.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = r0.f3121e
            if (r10 != r2) goto L_0x0083
            int r4 = r8.a1()
            goto L_0x0087
        L_0x0083:
            int r4 = r8.Z0()
        L_0x0087:
            r8.q1(r4, r12)
            r8.p1(r10)
            androidx.recyclerview.widget.k r5 = r8.D
            int r6 = r5.f3273d
            int r6 = r6 + r4
            r5.f3272c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.q r7 = r8.f3120z
            int r7 = r7.l()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.f3271b = r6
            androidx.recyclerview.widget.k r5 = r8.D
            r5.f3277h = r2
            r6 = 0
            r5.f3270a = r6
            r8.U0(r11, r5, r12)
            boolean r11 = r8.F
            r8.L = r11
            android.view.View r11 = r0.g(r4, r10)
            if (r11 == 0) goto L_0x00b9
            if (r11 == r9) goto L_0x00b9
            return r11
        L_0x00b9:
            boolean r11 = r8.i1(r10)
            if (r11 == 0) goto L_0x00d4
            int r11 = r8.f3118x
            int r11 = r11 - r2
        L_0x00c2:
            if (r11 < 0) goto L_0x00e9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r12 = r8.f3119y
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00d1
            if (r12 == r9) goto L_0x00d1
            return r12
        L_0x00d1:
            int r11 = r11 + -1
            goto L_0x00c2
        L_0x00d4:
            r11 = r6
        L_0x00d5:
            int r12 = r8.f3118x
            if (r11 >= r12) goto L_0x00e9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r12 = r8.f3119y
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00e6
            if (r12 == r9) goto L_0x00e6
            return r12
        L_0x00e6:
            int r11 = r11 + 1
            goto L_0x00d5
        L_0x00e9:
            boolean r11 = r8.E
            r11 = r11 ^ r2
            if (r10 != r3) goto L_0x00f0
            r12 = r2
            goto L_0x00f1
        L_0x00f0:
            r12 = r6
        L_0x00f1:
            if (r11 != r12) goto L_0x00f5
            r11 = r2
            goto L_0x00f6
        L_0x00f5:
            r11 = r6
        L_0x00f6:
            if (r11 == 0) goto L_0x00fd
            int r12 = r0.c()
            goto L_0x0101
        L_0x00fd:
            int r12 = r0.d()
        L_0x0101:
            android.view.View r12 = r8.B(r12)
            if (r12 == 0) goto L_0x010a
            if (r12 == r9) goto L_0x010a
            return r12
        L_0x010a:
            boolean r10 = r8.i1(r10)
            if (r10 == 0) goto L_0x0139
            int r10 = r8.f3118x
            int r10 = r10 - r2
        L_0x0113:
            if (r10 < 0) goto L_0x015c
            int r12 = r0.f3150e
            if (r10 != r12) goto L_0x011a
            goto L_0x0136
        L_0x011a:
            if (r11 == 0) goto L_0x0125
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r12 = r8.f3119y
            r12 = r12[r10]
            int r12 = r12.c()
            goto L_0x012d
        L_0x0125:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r12 = r8.f3119y
            r12 = r12[r10]
            int r12 = r12.d()
        L_0x012d:
            android.view.View r12 = r8.B(r12)
            if (r12 == 0) goto L_0x0136
            if (r12 == r9) goto L_0x0136
            return r12
        L_0x0136:
            int r10 = r10 + -1
            goto L_0x0113
        L_0x0139:
            int r10 = r8.f3118x
            if (r6 >= r10) goto L_0x015c
            if (r11 == 0) goto L_0x0148
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r10 = r8.f3119y
            r10 = r10[r6]
            int r10 = r10.c()
            goto L_0x0150
        L_0x0148:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r10 = r8.f3119y
            r10 = r10[r6]
            int r10 = r10.d()
        L_0x0150:
            android.view.View r10 = r8.B(r10)
            if (r10 == 0) goto L_0x0159
            if (r10 == r9) goto L_0x0159
            return r10
        L_0x0159:
            int r6 = r6 + 1
            goto L_0x0139
        L_0x015c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d1(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.F
            if (r0 == 0) goto L_0x0009
            int r0 = r6.a1()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.Z0()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.J
            r4.c(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.J
            r9.e(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.J
            r7.d(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.J
            r9.e(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.J
            r9.d(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.F
            if (r7 == 0) goto L_0x004d
            int r7 = r6.Z0()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.a1()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.A0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d1(int, int, int):void");
    }

    public final void e0(AccessibilityEvent accessibilityEvent) {
        super.e0(accessibilityEvent);
        if (H() > 0) {
            View W0 = W0(false);
            View V0 = V0(false);
            if (W0 != null && V0 != null) {
                int O2 = RecyclerView.m.O(W0);
                int O3 = RecyclerView.m.O(V0);
                if (O2 < O3) {
                    accessibilityEvent.setFromIndex(O2);
                    accessibilityEvent.setToIndex(O3);
                    return;
                }
                accessibilityEvent.setFromIndex(O3);
                accessibilityEvent.setToIndex(O2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        if (r10 == r11) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e3, code lost:
        if (r10 == r11) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e7, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View e1() {
        /*
            r13 = this;
            int r0 = r13.H()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.f3118x
            r2.<init>(r3)
            int r3 = r13.f3118x
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r13.B
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r13.f1()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r13.F
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x0106
            android.view.View r7 = r13.G(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f3121e
            int r9 = r9.f3150e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x00b7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f3121e
            boolean r10 = r13.F
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x0073
            int r10 = r9.f3148c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.a()
            int r10 = r9.f3148c
        L_0x0056:
            androidx.recyclerview.widget.q r11 = r13.f3120z
            int r11 = r11.g()
            if (r10 >= r11) goto L_0x00ac
            java.util.ArrayList<android.view.View> r9 = r9.f3146a
            int r10 = r9.size()
            int r10 = r10 - r1
            java.lang.Object r9 = r9.get(r10)
            android.view.View r9 = (android.view.View) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.c.h(r9)
            r9.getClass()
            goto L_0x00aa
        L_0x0073:
            int r10 = r9.f3147b
            if (r10 == r11) goto L_0x0078
            goto L_0x0093
        L_0x0078:
            java.util.ArrayList<android.view.View> r10 = r9.f3146a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r11 = androidx.recyclerview.widget.StaggeredGridLayoutManager.c.h(r10)
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.q r12 = r12.f3120z
            int r10 = r12.e(r10)
            r9.f3147b = r10
            r11.getClass()
            int r10 = r9.f3147b
        L_0x0093:
            androidx.recyclerview.widget.q r11 = r13.f3120z
            int r11 = r11.k()
            if (r10 <= r11) goto L_0x00ac
            java.util.ArrayList<android.view.View> r9 = r9.f3146a
            java.lang.Object r9 = r9.get(r4)
            android.view.View r9 = (android.view.View) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.c.h(r9)
            r9.getClass()
        L_0x00aa:
            r9 = r1
            goto L_0x00ad
        L_0x00ac:
            r9 = r4
        L_0x00ad:
            if (r9 == 0) goto L_0x00b0
            return r7
        L_0x00b0:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f3121e
            int r9 = r9.f3150e
            r2.clear(r9)
        L_0x00b7:
            int r0 = r0 + r5
            if (r0 == r6) goto L_0x002e
            android.view.View r9 = r13.G(r0)
            boolean r10 = r13.F
            if (r10 == 0) goto L_0x00d4
            androidx.recyclerview.widget.q r10 = r13.f3120z
            int r10 = r10.b(r7)
            androidx.recyclerview.widget.q r11 = r13.f3120z
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L_0x00d1
            return r7
        L_0x00d1:
            if (r10 != r11) goto L_0x00e7
            goto L_0x00e5
        L_0x00d4:
            androidx.recyclerview.widget.q r10 = r13.f3120z
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.q r11 = r13.f3120z
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L_0x00e3
            return r7
        L_0x00e3:
            if (r10 != r11) goto L_0x00e7
        L_0x00e5:
            r10 = r1
            goto L_0x00e8
        L_0x00e7:
            r10 = r4
        L_0x00e8:
            if (r10 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = r8.f3121e
            int r8 = r8.f3150e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.f3121e
            int r9 = r9.f3150e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00fd
            r8 = r1
            goto L_0x00fe
        L_0x00fd:
            r8 = r4
        L_0x00fe:
            if (r3 >= 0) goto L_0x0102
            r9 = r1
            goto L_0x0103
        L_0x0102:
            r9 = r4
        L_0x0103:
            if (r8 == r9) goto L_0x002e
            return r7
        L_0x0106:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.e1():android.view.View");
    }

    public final boolean f1() {
        if (M() == 1) {
            return true;
        }
        return false;
    }

    public final void g1(View view, int i10, int i11, boolean z10) {
        n(view, this.O);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = layoutParams.leftMargin;
        Rect rect = this.O;
        int s12 = s1(i10, i12 + rect.left, layoutParams.rightMargin + rect.right);
        int i13 = layoutParams.topMargin;
        Rect rect2 = this.O;
        int s13 = s1(i11, i13 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (J0(view, s12, s13, layoutParams)) {
            view.measure(s12, s13);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:236:0x041f, code lost:
        if (Q0() != false) goto L_0x0423;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h1(androidx.recyclerview.widget.RecyclerView.s r12, androidx.recyclerview.widget.RecyclerView.w r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.P
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.N
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.H
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.b()
            if (r1 != 0) goto L_0x0018
            r11.w0(r12)
            r0.a()
            return
        L_0x0018:
            boolean r1 = r0.f3143e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r11.H
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.N
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x020b
            r0.a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.N
            if (r6 == 0) goto L_0x00ba
            int r7 = r6.f3130c
            r8 = 0
            if (r7 <= 0) goto L_0x007d
            int r9 = r11.f3118x
            if (r7 != r9) goto L_0x006f
            r6 = r3
        L_0x003f:
            int r7 = r11.f3118x
            if (r6 >= r7) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r7 = r11.f3119y
            r7 = r7[r6]
            r7.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.N
            int[] r9 = r7.f3131d
            r9 = r9[r6]
            if (r9 == r5) goto L_0x0064
            boolean r7 = r7.f3136p
            if (r7 == 0) goto L_0x005d
            androidx.recyclerview.widget.q r7 = r11.f3120z
            int r7 = r7.g()
            goto L_0x0063
        L_0x005d:
            androidx.recyclerview.widget.q r7 = r11.f3120z
            int r7 = r7.k()
        L_0x0063:
            int r9 = r9 + r7
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r7 = r11.f3119y
            r7 = r7[r6]
            r7.f3147b = r9
            r7.f3148c = r9
            int r6 = r6 + 1
            goto L_0x003f
        L_0x006f:
            r6.f3131d = r8
            r6.f3130c = r3
            r6.f3132e = r3
            r6.f3133f = r8
            r6.f3134n = r8
            int r7 = r6.f3129b
            r6.f3128a = r7
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.N
            boolean r7 = r6.f3137q
            r11.M = r7
            boolean r6 = r6.f3135o
            r11.m(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.N
            if (r7 == 0) goto L_0x0092
            boolean r8 = r7.f3135o
            if (r8 == r6) goto L_0x0092
            r7.f3135o = r6
        L_0x0092:
            r11.E = r6
            r11.A0()
            r11.n1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.N
            int r7 = r6.f3128a
            if (r7 == r2) goto L_0x00a7
            r11.H = r7
            boolean r7 = r6.f3136p
            r0.f3141c = r7
            goto L_0x00ab
        L_0x00a7:
            boolean r7 = r11.F
            r0.f3141c = r7
        L_0x00ab:
            int r7 = r6.f3132e
            if (r7 <= r4) goto L_0x00c1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r11.J
            int[] r8 = r6.f3133f
            r7.f3122a = r8
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r6 = r6.f3134n
            r7.f3123b = r6
            goto L_0x00c1
        L_0x00ba:
            r11.n1()
            boolean r6 = r11.F
            r0.f3141c = r6
        L_0x00c1:
            boolean r6 = r13.f3103g
            if (r6 != 0) goto L_0x01c8
            int r6 = r11.H
            if (r6 != r2) goto L_0x00cb
            goto L_0x01c8
        L_0x00cb:
            if (r6 < 0) goto L_0x01c4
            int r7 = r13.b()
            if (r6 < r7) goto L_0x00d5
            goto L_0x01c4
        L_0x00d5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.N
            if (r6 == 0) goto L_0x00ea
            int r7 = r6.f3128a
            if (r7 == r2) goto L_0x00ea
            int r6 = r6.f3130c
            if (r6 >= r4) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            r0.f3140b = r5
            int r6 = r11.H
            r0.f3139a = r6
            goto L_0x01c2
        L_0x00ea:
            int r6 = r11.H
            android.view.View r6 = r11.B(r6)
            if (r6 == 0) goto L_0x017c
            boolean r7 = r11.F
            if (r7 == 0) goto L_0x00fb
            int r7 = r11.a1()
            goto L_0x00ff
        L_0x00fb:
            int r7 = r11.Z0()
        L_0x00ff:
            r0.f3139a = r7
            int r7 = r11.I
            if (r7 == r5) goto L_0x0131
            boolean r7 = r0.f3141c
            if (r7 == 0) goto L_0x011d
            androidx.recyclerview.widget.q r7 = r11.f3120z
            int r7 = r7.g()
            int r8 = r11.I
            int r7 = r7 - r8
            androidx.recyclerview.widget.q r8 = r11.f3120z
            int r6 = r8.b(r6)
            int r7 = r7 - r6
            r0.f3140b = r7
            goto L_0x01c2
        L_0x011d:
            androidx.recyclerview.widget.q r7 = r11.f3120z
            int r7 = r7.k()
            int r8 = r11.I
            int r7 = r7 + r8
            androidx.recyclerview.widget.q r8 = r11.f3120z
            int r6 = r8.e(r6)
            int r7 = r7 - r6
            r0.f3140b = r7
            goto L_0x01c2
        L_0x0131:
            androidx.recyclerview.widget.q r7 = r11.f3120z
            int r7 = r7.c(r6)
            androidx.recyclerview.widget.q r8 = r11.f3120z
            int r8 = r8.l()
            if (r7 <= r8) goto L_0x0154
            boolean r6 = r0.f3141c
            if (r6 == 0) goto L_0x014a
            androidx.recyclerview.widget.q r6 = r11.f3120z
            int r6 = r6.g()
            goto L_0x0150
        L_0x014a:
            androidx.recyclerview.widget.q r6 = r11.f3120z
            int r6 = r6.k()
        L_0x0150:
            r0.f3140b = r6
            goto L_0x01c2
        L_0x0154:
            androidx.recyclerview.widget.q r7 = r11.f3120z
            int r7 = r7.e(r6)
            androidx.recyclerview.widget.q r8 = r11.f3120z
            int r8 = r8.k()
            int r7 = r7 - r8
            if (r7 >= 0) goto L_0x0167
            int r6 = -r7
            r0.f3140b = r6
            goto L_0x01c2
        L_0x0167:
            androidx.recyclerview.widget.q r7 = r11.f3120z
            int r7 = r7.g()
            androidx.recyclerview.widget.q r8 = r11.f3120z
            int r6 = r8.b(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x0179
            r0.f3140b = r7
            goto L_0x01c2
        L_0x0179:
            r0.f3140b = r5
            goto L_0x01c2
        L_0x017c:
            int r6 = r11.H
            r0.f3139a = r6
            int r7 = r11.I
            if (r7 != r5) goto L_0x01a5
            int r6 = r11.P0(r6)
            if (r6 != r4) goto L_0x018c
            r6 = r4
            goto L_0x018d
        L_0x018c:
            r6 = r3
        L_0x018d:
            r0.f3141c = r6
            if (r6 == 0) goto L_0x019a
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.q r6 = r6.f3120z
            int r6 = r6.g()
            goto L_0x01a2
        L_0x019a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.q r6 = r6.f3120z
            int r6 = r6.k()
        L_0x01a2:
            r0.f3140b = r6
            goto L_0x01c0
        L_0x01a5:
            boolean r6 = r0.f3141c
            if (r6 == 0) goto L_0x01b5
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.q r6 = r6.f3120z
            int r6 = r6.g()
            int r6 = r6 - r7
            r0.f3140b = r6
            goto L_0x01c0
        L_0x01b5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.q r6 = r6.f3120z
            int r6 = r6.k()
            int r6 = r6 + r7
            r0.f3140b = r6
        L_0x01c0:
            r0.f3142d = r4
        L_0x01c2:
            r6 = r4
            goto L_0x01c9
        L_0x01c4:
            r11.H = r2
            r11.I = r5
        L_0x01c8:
            r6 = r3
        L_0x01c9:
            if (r6 == 0) goto L_0x01cc
            goto L_0x0209
        L_0x01cc:
            boolean r6 = r11.L
            if (r6 == 0) goto L_0x01e8
            int r6 = r13.b()
            int r7 = r11.H()
        L_0x01d8:
            int r7 = r7 + r2
            if (r7 < 0) goto L_0x0204
            android.view.View r8 = r11.G(r7)
            int r8 = androidx.recyclerview.widget.RecyclerView.m.O(r8)
            if (r8 < 0) goto L_0x01d8
            if (r8 >= r6) goto L_0x01d8
            goto L_0x0205
        L_0x01e8:
            int r6 = r13.b()
            int r7 = r11.H()
            r8 = r3
        L_0x01f1:
            if (r8 >= r7) goto L_0x0204
            android.view.View r9 = r11.G(r8)
            int r9 = androidx.recyclerview.widget.RecyclerView.m.O(r9)
            if (r9 < 0) goto L_0x0201
            if (r9 >= r6) goto L_0x0201
            r8 = r9
            goto L_0x0205
        L_0x0201:
            int r8 = r8 + 1
            goto L_0x01f1
        L_0x0204:
            r8 = r3
        L_0x0205:
            r0.f3139a = r8
            r0.f3140b = r5
        L_0x0209:
            r0.f3143e = r4
        L_0x020b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.N
            if (r6 != 0) goto L_0x0228
            int r6 = r11.H
            if (r6 != r2) goto L_0x0228
            boolean r6 = r0.f3141c
            boolean r7 = r11.L
            if (r6 != r7) goto L_0x0221
            boolean r6 = r11.f1()
            boolean r7 = r11.M
            if (r6 == r7) goto L_0x0228
        L_0x0221:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r11.J
            r6.a()
            r0.f3142d = r4
        L_0x0228:
            int r6 = r11.H()
            if (r6 <= 0) goto L_0x02e0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.N
            if (r6 == 0) goto L_0x0236
            int r6 = r6.f3130c
            if (r6 >= r4) goto L_0x02e0
        L_0x0236:
            boolean r6 = r0.f3142d
            if (r6 == 0) goto L_0x0255
            r1 = r3
        L_0x023b:
            int r6 = r11.f3118x
            if (r1 >= r6) goto L_0x02e0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f3119y
            r6 = r6[r1]
            r6.b()
            int r6 = r0.f3140b
            if (r6 == r5) goto L_0x0252
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r7 = r11.f3119y
            r7 = r7[r1]
            r7.f3147b = r6
            r7.f3148c = r6
        L_0x0252:
            int r1 = r1 + 1
            goto L_0x023b
        L_0x0255:
            if (r1 != 0) goto L_0x0277
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.P
            int[] r1 = r1.f3144f
            if (r1 != 0) goto L_0x025e
            goto L_0x0277
        L_0x025e:
            r1 = r3
        L_0x025f:
            int r6 = r11.f3118x
            if (r1 >= r6) goto L_0x02e0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f3119y
            r6 = r6[r1]
            r6.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.P
            int[] r7 = r7.f3144f
            r7 = r7[r1]
            r6.f3147b = r7
            r6.f3148c = r7
            int r1 = r1 + 1
            goto L_0x025f
        L_0x0277:
            r1 = r3
        L_0x0278:
            int r6 = r11.f3118x
            if (r1 >= r6) goto L_0x02b8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f3119y
            r6 = r6[r1]
            boolean r7 = r11.F
            int r8 = r0.f3140b
            if (r7 == 0) goto L_0x028b
            int r9 = r6.f(r5)
            goto L_0x028f
        L_0x028b:
            int r9 = r6.i(r5)
        L_0x028f:
            r6.b()
            if (r9 != r5) goto L_0x0295
            goto L_0x02b5
        L_0x0295:
            if (r7 == 0) goto L_0x02a1
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.q r10 = r10.f3120z
            int r10 = r10.g()
            if (r9 < r10) goto L_0x02b5
        L_0x02a1:
            if (r7 != 0) goto L_0x02ae
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.q r7 = r7.f3120z
            int r7 = r7.k()
            if (r9 <= r7) goto L_0x02ae
            goto L_0x02b5
        L_0x02ae:
            if (r8 == r5) goto L_0x02b1
            int r9 = r9 + r8
        L_0x02b1:
            r6.f3148c = r9
            r6.f3147b = r9
        L_0x02b5:
            int r1 = r1 + 1
            goto L_0x0278
        L_0x02b8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.P
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f3119y
            r1.getClass()
            int r7 = r6.length
            int[] r8 = r1.f3144f
            if (r8 == 0) goto L_0x02c7
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02d0
        L_0x02c7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r8 = r8.f3119y
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f3144f = r8
        L_0x02d0:
            r8 = r3
        L_0x02d1:
            if (r8 >= r7) goto L_0x02e0
            int[] r9 = r1.f3144f
            r10 = r6[r8]
            int r10 = r10.i(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02d1
        L_0x02e0:
            r11.A(r12)
            androidx.recyclerview.widget.k r1 = r11.D
            r1.f3270a = r3
            androidx.recyclerview.widget.q r1 = r11.A
            int r1 = r1.l()
            int r6 = r11.f3118x
            int r6 = r1 / r6
            r11.C = r6
            androidx.recyclerview.widget.q r6 = r11.A
            int r6 = r6.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r1 = r0.f3139a
            r11.q1(r1, r13)
            boolean r1 = r0.f3141c
            if (r1 == 0) goto L_0x031d
            r11.p1(r2)
            androidx.recyclerview.widget.k r1 = r11.D
            r11.U0(r12, r1, r13)
            r11.p1(r4)
            androidx.recyclerview.widget.k r1 = r11.D
            int r2 = r0.f3139a
            int r6 = r1.f3273d
            int r2 = r2 + r6
            r1.f3272c = r2
            r11.U0(r12, r1, r13)
            goto L_0x0334
        L_0x031d:
            r11.p1(r4)
            androidx.recyclerview.widget.k r1 = r11.D
            r11.U0(r12, r1, r13)
            r11.p1(r2)
            androidx.recyclerview.widget.k r1 = r11.D
            int r2 = r0.f3139a
            int r6 = r1.f3273d
            int r2 = r2 + r6
            r1.f3272c = r2
            r11.U0(r12, r1, r13)
        L_0x0334:
            androidx.recyclerview.widget.q r1 = r11.A
            int r1 = r1.i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x0340
            goto L_0x03e0
        L_0x0340:
            r1 = 0
            int r2 = r11.H()
            r6 = r3
        L_0x0346:
            if (r6 >= r2) goto L_0x0368
            android.view.View r7 = r11.G(r6)
            androidx.recyclerview.widget.q r8 = r11.A
            int r8 = r8.c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0358
            goto L_0x0365
        L_0x0358:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r7
            r7.getClass()
            float r1 = java.lang.Math.max(r1, r8)
        L_0x0365:
            int r6 = r6 + 1
            goto L_0x0346
        L_0x0368:
            int r6 = r11.C
            int r7 = r11.f3118x
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.q r7 = r11.A
            int r7 = r7.i()
            if (r7 != r5) goto L_0x0384
            androidx.recyclerview.widget.q r5 = r11.A
            int r5 = r5.l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0384:
            int r5 = r11.f3118x
            int r5 = r1 / r5
            r11.C = r5
            androidx.recyclerview.widget.q r5 = r11.A
            int r5 = r5.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r1 = r11.C
            if (r1 != r6) goto L_0x0398
            goto L_0x03e0
        L_0x0398:
            r1 = r3
        L_0x0399:
            if (r1 >= r2) goto L_0x03e0
            android.view.View r5 = r11.G(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r7
            r7.getClass()
            boolean r8 = r11.f1()
            if (r8 == 0) goto L_0x03c8
            int r8 = r11.B
            if (r8 != r4) goto L_0x03c8
            int r8 = r11.f3118x
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r7.f3121e
            int r7 = r7.f3150e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.C
            int r9 = r9 * r10
            int r8 = r8 - r4
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03dd
        L_0x03c8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r7.f3121e
            int r7 = r7.f3150e
            int r8 = r11.C
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.B
            if (r9 != r4) goto L_0x03d9
            int r8 = r8 - r7
            r5.offsetLeftAndRight(r8)
            goto L_0x03dd
        L_0x03d9:
            int r8 = r8 - r7
            r5.offsetTopAndBottom(r8)
        L_0x03dd:
            int r1 = r1 + 1
            goto L_0x0399
        L_0x03e0:
            int r1 = r11.H()
            if (r1 <= 0) goto L_0x03f7
            boolean r1 = r11.F
            if (r1 == 0) goto L_0x03f1
            r11.X0(r12, r13, r4)
            r11.Y0(r12, r13, r3)
            goto L_0x03f7
        L_0x03f1:
            r11.Y0(r12, r13, r4)
            r11.X0(r12, r13, r3)
        L_0x03f7:
            if (r14 == 0) goto L_0x0422
            boolean r14 = r13.f3103g
            if (r14 != 0) goto L_0x0422
            int r14 = r11.K
            if (r14 == 0) goto L_0x040f
            int r14 = r11.H()
            if (r14 <= 0) goto L_0x040f
            android.view.View r14 = r11.e1()
            if (r14 == 0) goto L_0x040f
            r14 = r4
            goto L_0x0410
        L_0x040f:
            r14 = r3
        L_0x0410:
            if (r14 == 0) goto L_0x0422
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r14 = r11.S
            androidx.recyclerview.widget.RecyclerView r1 = r11.f3047b
            if (r1 == 0) goto L_0x041b
            r1.removeCallbacks(r14)
        L_0x041b:
            boolean r14 = r11.Q0()
            if (r14 == 0) goto L_0x0422
            goto L_0x0423
        L_0x0422:
            r4 = r3
        L_0x0423:
            boolean r14 = r13.f3103g
            if (r14 == 0) goto L_0x042c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.P
            r14.a()
        L_0x042c:
            boolean r14 = r0.f3141c
            r11.L = r14
            boolean r14 = r11.f1()
            r11.M = r14
            if (r4 == 0) goto L_0x0440
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.P
            r14.a()
            r11.h1(r12, r13, r3)
        L_0x0440:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.h1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$w, boolean):void");
    }

    public final void i0(int i10, int i11) {
        d1(i10, i11, 1);
    }

    public final boolean i1(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.B == 0) {
            if (i10 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.F) {
                return true;
            }
            return false;
        }
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.F) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 == f1()) {
            return true;
        }
        return false;
    }

    public final void j0() {
        this.J.a();
        A0();
    }

    public final void j1(int i10, RecyclerView.w wVar) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = a1();
            i11 = 1;
        } else {
            i11 = -1;
            i12 = Z0();
        }
        this.D.f3270a = true;
        q1(i12, wVar);
        p1(i11);
        k kVar = this.D;
        kVar.f3272c = i12 + kVar.f3273d;
        kVar.f3271b = Math.abs(i10);
    }

    public final void k0(int i10, int i11) {
        d1(i10, i11, 8);
    }

    public final void k1(RecyclerView.s sVar, k kVar) {
        int i10;
        int i11;
        if (kVar.f3270a && !kVar.f3278i) {
            if (kVar.f3271b != 0) {
                int i12 = 1;
                if (kVar.f3274e == -1) {
                    int i13 = kVar.f3275f;
                    int i14 = this.f3119y[0].i(i13);
                    while (i12 < this.f3118x) {
                        int i15 = this.f3119y[i12].i(i13);
                        if (i15 > i14) {
                            i14 = i15;
                        }
                        i12++;
                    }
                    int i16 = i13 - i14;
                    if (i16 < 0) {
                        i11 = kVar.f3276g;
                    } else {
                        i11 = kVar.f3276g - Math.min(i16, kVar.f3271b);
                    }
                    l1(i11, sVar);
                    return;
                }
                int i17 = kVar.f3276g;
                int f10 = this.f3119y[0].f(i17);
                while (i12 < this.f3118x) {
                    int f11 = this.f3119y[i12].f(i17);
                    if (f11 < f10) {
                        f10 = f11;
                    }
                    i12++;
                }
                int i18 = f10 - kVar.f3276g;
                if (i18 < 0) {
                    i10 = kVar.f3275f;
                } else {
                    i10 = Math.min(i18, kVar.f3271b) + kVar.f3275f;
                }
                m1(i10, sVar);
            } else if (kVar.f3274e == -1) {
                l1(kVar.f3276g, sVar);
            } else {
                m1(kVar.f3275f, sVar);
            }
        }
    }

    public final void l0(int i10, int i11) {
        d1(i10, i11, 2);
    }

    public final void l1(int i10, RecyclerView.s sVar) {
        int H2 = H() - 1;
        while (H2 >= 0) {
            View G2 = G(H2);
            if (this.f3120z.e(G2) >= i10 && this.f3120z.o(G2) >= i10) {
                LayoutParams layoutParams = (LayoutParams) G2.getLayoutParams();
                layoutParams.getClass();
                if (layoutParams.f3121e.f3146a.size() != 1) {
                    c cVar = layoutParams.f3121e;
                    int size = cVar.f3146a.size();
                    View remove = cVar.f3146a.remove(size - 1);
                    LayoutParams h10 = c.h(remove);
                    h10.f3121e = null;
                    if (h10.e() || h10.d()) {
                        cVar.f3149d -= StaggeredGridLayoutManager.this.f3120z.c(remove);
                    }
                    if (size == 1) {
                        cVar.f3147b = Integer.MIN_VALUE;
                    }
                    cVar.f3148c = Integer.MIN_VALUE;
                    y0(G2, sVar);
                    H2--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void m(String str) {
        if (this.N == null) {
            super.m(str);
        }
    }

    public final void m1(int i10, RecyclerView.s sVar) {
        while (H() > 0) {
            View G2 = G(0);
            if (this.f3120z.b(G2) <= i10 && this.f3120z.n(G2) <= i10) {
                LayoutParams layoutParams = (LayoutParams) G2.getLayoutParams();
                layoutParams.getClass();
                if (layoutParams.f3121e.f3146a.size() != 1) {
                    c cVar = layoutParams.f3121e;
                    View remove = cVar.f3146a.remove(0);
                    LayoutParams h10 = c.h(remove);
                    h10.f3121e = null;
                    if (cVar.f3146a.size() == 0) {
                        cVar.f3148c = Integer.MIN_VALUE;
                    }
                    if (h10.e() || h10.d()) {
                        cVar.f3149d -= StaggeredGridLayoutManager.this.f3120z.c(remove);
                    }
                    cVar.f3147b = Integer.MIN_VALUE;
                    y0(G2, sVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void n0(RecyclerView recyclerView, int i10, int i11) {
        d1(i10, i11, 4);
    }

    public final void n1() {
        if (this.B == 1 || !f1()) {
            this.F = this.E;
        } else {
            this.F = !this.E;
        }
    }

    public final boolean o() {
        if (this.B == 0) {
            return true;
        }
        return false;
    }

    public final void o0(RecyclerView.s sVar, RecyclerView.w wVar) {
        h1(sVar, wVar, true);
    }

    public final int o1(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        if (H() == 0 || i10 == 0) {
            return 0;
        }
        j1(i10, wVar);
        int U0 = U0(sVar, this.D, wVar);
        if (this.D.f3271b >= U0) {
            if (i10 < 0) {
                i10 = -U0;
            } else {
                i10 = U0;
            }
        }
        this.f3120z.p(-i10);
        this.L = this.F;
        k kVar = this.D;
        kVar.f3271b = 0;
        k1(sVar, kVar);
        return i10;
    }

    public final boolean p() {
        if (this.B == 1) {
            return true;
        }
        return false;
    }

    public final void p0(RecyclerView.w wVar) {
        this.H = -1;
        this.I = Integer.MIN_VALUE;
        this.N = null;
        this.P.a();
    }

    public final void p1(int i10) {
        boolean z10;
        k kVar = this.D;
        kVar.f3274e = i10;
        boolean z11 = this.F;
        int i11 = 1;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i11 = -1;
        }
        kVar.f3273d = i11;
    }

    public final boolean q(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void q1(int i10, RecyclerView.w wVar) {
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        k kVar = this.D;
        boolean z13 = false;
        kVar.f3271b = 0;
        kVar.f3272c = i10;
        RecyclerView.v vVar = this.f3050e;
        if (vVar == null || !vVar.f3088e) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || (i13 = wVar.f3097a) == -1) {
            i12 = 0;
            i11 = 0;
        } else {
            boolean z14 = this.F;
            if (i13 < i10) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z14 == z12) {
                i12 = this.f3120z.l();
                i11 = 0;
            } else {
                i11 = this.f3120z.l();
                i12 = 0;
            }
        }
        RecyclerView recyclerView = this.f3047b;
        if (recyclerView == null || !recyclerView.f2982o) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            this.D.f3275f = this.f3120z.k() - i11;
            this.D.f3276g = this.f3120z.g() + i12;
        } else {
            this.D.f3276g = this.f3120z.f() + i12;
            this.D.f3275f = -i11;
        }
        k kVar2 = this.D;
        kVar2.f3277h = false;
        kVar2.f3270a = true;
        if (this.f3120z.i() == 0 && this.f3120z.f() == 0) {
            z13 = true;
        }
        kVar2.f3278i = z13;
    }

    public final void r0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.N = savedState;
            if (this.H != -1) {
                savedState.f3131d = null;
                savedState.f3130c = 0;
                savedState.f3128a = -1;
                savedState.f3129b = -1;
                savedState.f3131d = null;
                savedState.f3130c = 0;
                savedState.f3132e = 0;
                savedState.f3133f = null;
                savedState.f3134n = null;
            }
            A0();
        }
    }

    public final void r1(c cVar, int i10, int i11) {
        int i12 = cVar.f3149d;
        if (i10 == -1) {
            int i13 = cVar.f3147b;
            if (i13 == Integer.MIN_VALUE) {
                View view = cVar.f3146a.get(0);
                LayoutParams h10 = c.h(view);
                cVar.f3147b = StaggeredGridLayoutManager.this.f3120z.e(view);
                h10.getClass();
                i13 = cVar.f3147b;
            }
            if (i13 + i12 <= i11) {
                this.G.set(cVar.f3150e, false);
                return;
            }
            return;
        }
        int i14 = cVar.f3148c;
        if (i14 == Integer.MIN_VALUE) {
            cVar.a();
            i14 = cVar.f3148c;
        }
        if (i14 - i12 >= i11) {
            this.G.set(cVar.f3150e, false);
        }
    }

    public final void s(int i10, int i11, RecyclerView.w wVar, RecyclerView.m.c cVar) {
        boolean z10;
        int i12;
        int i13;
        if (this.B != 0) {
            i10 = i11;
        }
        if (H() != 0 && i10 != 0) {
            j1(i10, wVar);
            int[] iArr = this.R;
            if (iArr == null || iArr.length < this.f3118x) {
                this.R = new int[this.f3118x];
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.f3118x; i15++) {
                k kVar = this.D;
                if (kVar.f3273d == -1) {
                    i13 = kVar.f3275f;
                    i12 = this.f3119y[i15].i(i13);
                } else {
                    i13 = this.f3119y[i15].f(kVar.f3276g);
                    i12 = this.D.f3276g;
                }
                int i16 = i13 - i12;
                if (i16 >= 0) {
                    this.R[i14] = i16;
                    i14++;
                }
            }
            Arrays.sort(this.R, 0, i14);
            int i17 = 0;
            while (i17 < i14) {
                int i18 = this.D.f3272c;
                if (i18 < 0 || i18 >= wVar.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    ((j.b) cVar).a(this.D.f3272c, this.R[i17]);
                    k kVar2 = this.D;
                    kVar2.f3272c += kVar2.f3273d;
                    i17++;
                } else {
                    return;
                }
            }
        }
    }

    public final Parcelable s0() {
        int i10;
        View view;
        int i11;
        int i12;
        int[] iArr;
        SavedState savedState = this.N;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f3135o = this.E;
        savedState2.f3136p = this.L;
        savedState2.f3137q = this.M;
        LazySpanLookup lazySpanLookup = this.J;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f3122a) == null) {
            savedState2.f3132e = 0;
        } else {
            savedState2.f3133f = iArr;
            savedState2.f3132e = iArr.length;
            savedState2.f3134n = lazySpanLookup.f3123b;
        }
        int i13 = -1;
        if (H() > 0) {
            if (this.L) {
                i10 = a1();
            } else {
                i10 = Z0();
            }
            savedState2.f3128a = i10;
            if (this.F) {
                view = V0(true);
            } else {
                view = W0(true);
            }
            if (view != null) {
                i13 = RecyclerView.m.O(view);
            }
            savedState2.f3129b = i13;
            int i14 = this.f3118x;
            savedState2.f3130c = i14;
            savedState2.f3131d = new int[i14];
            for (int i15 = 0; i15 < this.f3118x; i15++) {
                if (this.L) {
                    i11 = this.f3119y[i15].f(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f3120z.g();
                    } else {
                        savedState2.f3131d[i15] = i11;
                    }
                } else {
                    i11 = this.f3119y[i15].i(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f3120z.k();
                    } else {
                        savedState2.f3131d[i15] = i11;
                    }
                }
                i11 -= i12;
                savedState2.f3131d[i15] = i11;
            }
        } else {
            savedState2.f3128a = -1;
            savedState2.f3129b = -1;
            savedState2.f3130c = 0;
        }
        return savedState2;
    }

    public final void t0(int i10) {
        if (i10 == 0) {
            Q0();
        }
    }

    public final int u(RecyclerView.w wVar) {
        return R0(wVar);
    }

    public final int v(RecyclerView.w wVar) {
        return S0(wVar);
    }

    public final int w(RecyclerView.w wVar) {
        return T0(wVar);
    }

    public final int x(RecyclerView.w wVar) {
        return R0(wVar);
    }

    public final int y(RecyclerView.w wVar) {
        return S0(wVar);
    }

    public final int z(RecyclerView.w wVar) {
        return T0(wVar);
    }

    public static class LazySpanLookup {

        /* renamed from: a  reason: collision with root package name */
        public int[] f3122a;

        /* renamed from: b  reason: collision with root package name */
        public List<FullSpanItem> f3123b;

        public final void a() {
            int[] iArr = this.f3122a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3123b = null;
        }

        public final void b(int i10) {
            int[] iArr = this.f3122a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i10, 10) + 1)];
                this.f3122a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f3122a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3122a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int c(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f3122a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r6 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f3123b
                if (r0 != 0) goto L_0x000f
                goto L_0x005e
            L_0x000f:
                r2 = 0
                if (r0 != 0) goto L_0x0013
                goto L_0x002b
            L_0x0013:
                int r0 = r0.size()
                int r0 = r0 + r1
            L_0x0018:
                if (r0 < 0) goto L_0x002b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f3123b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r4 = r3.f3124a
                if (r4 != r6) goto L_0x0028
                r2 = r3
                goto L_0x002b
            L_0x0028:
                int r0 = r0 + -1
                goto L_0x0018
            L_0x002b:
                if (r2 == 0) goto L_0x0032
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f3123b
                r0.remove(r2)
            L_0x0032:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f3123b
                int r0 = r0.size()
                r2 = 0
            L_0x0039:
                if (r2 >= r0) goto L_0x004b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f3123b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.f3124a
                if (r3 < r6) goto L_0x0048
                goto L_0x004c
            L_0x0048:
                int r2 = r2 + 1
                goto L_0x0039
            L_0x004b:
                r2 = r1
            L_0x004c:
                if (r2 == r1) goto L_0x005e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f3123b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f3123b
                r3.remove(r2)
                int r0 = r0.f3124a
                goto L_0x005f
            L_0x005e:
                r0 = r1
            L_0x005f:
                if (r0 != r1) goto L_0x006b
                int[] r0 = r5.f3122a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r6 = r5.f3122a
                int r6 = r6.length
                return r6
            L_0x006b:
                int r0 = r0 + 1
                int[] r2 = r5.f3122a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r5.f3122a
                java.util.Arrays.fill(r2, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.c(int):int");
        }

        public final void d(int i10, int i11) {
            int[] iArr = this.f3122a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f3122a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f3122a, i10, i12, -1);
                List<FullSpanItem> list = this.f3123b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.f3123b.get(size);
                        int i13 = fullSpanItem.f3124a;
                        if (i13 >= i10) {
                            fullSpanItem.f3124a = i13 + i11;
                        }
                    }
                }
            }
        }

        public final void e(int i10, int i11) {
            int[] iArr = this.f3122a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f3122a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f3122a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                List<FullSpanItem> list = this.f3123b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.f3123b.get(size);
                        int i13 = fullSpanItem.f3124a;
                        if (i13 >= i10) {
                            if (i13 < i12) {
                                this.f3123b.remove(size);
                            } else {
                                fullSpanItem.f3124a = i13 - i11;
                            }
                        }
                    }
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            public int f3124a;

            /* renamed from: b  reason: collision with root package name */
            public int f3125b;

            /* renamed from: c  reason: collision with root package name */
            public int[] f3126c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f3127d;

            public class a implements Parcelable.Creator<FullSpanItem> {
                public final Object createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public final Object[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f3124a = parcel.readInt();
                this.f3125b = parcel.readInt();
                this.f3127d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3126c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("FullSpanItem{mPosition=");
                q10.append(this.f3124a);
                q10.append(", mGapDir=");
                q10.append(this.f3125b);
                q10.append(", mHasUnwantedGapAfter=");
                q10.append(this.f3127d);
                q10.append(", mGapPerSpan=");
                q10.append(Arrays.toString(this.f3126c));
                q10.append('}');
                return q10.toString();
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f3124a);
                parcel.writeInt(this.f3125b);
                parcel.writeInt(this.f3127d ? 1 : 0);
                int[] iArr = this.f3126c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3126c);
            }

            public FullSpanItem() {
            }
        }
    }
}
