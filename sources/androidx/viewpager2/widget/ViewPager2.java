package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.viewpager2.R$styleable;
import androidx.viewpager2.widget.g;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;
import x1.f;

public final class ViewPager2 extends ViewGroup {
    public h A;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f3591a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final Rect f3592b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public c f3593c = new c();

    /* renamed from: d  reason: collision with root package name */
    public int f3594d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3595e = false;

    /* renamed from: f  reason: collision with root package name */
    public a f3596f = new a();

    /* renamed from: n  reason: collision with root package name */
    public f f3597n;

    /* renamed from: o  reason: collision with root package name */
    public int f3598o = -1;

    /* renamed from: p  reason: collision with root package name */
    public Parcelable f3599p;

    /* renamed from: q  reason: collision with root package name */
    public k f3600q;

    /* renamed from: r  reason: collision with root package name */
    public j f3601r;

    /* renamed from: s  reason: collision with root package name */
    public g f3602s;

    /* renamed from: t  reason: collision with root package name */
    public c f3603t;

    /* renamed from: u  reason: collision with root package name */
    public d f3604u;

    /* renamed from: v  reason: collision with root package name */
    public f f3605v;

    /* renamed from: w  reason: collision with root package name */
    public RecyclerView.j f3606w = null;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3607x = false;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3608y = true;

    /* renamed from: z  reason: collision with root package name */
    public int f3609z = -1;

    public class a extends e {
        public a() {
            super(0);
        }

        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f3595e = true;
            viewPager2.f3602s.f3645l = true;
        }
    }

    public class b extends g {
        public b() {
        }

        public final void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.d();
            }
        }

        public final void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f3594d != i10) {
                viewPager2.f3594d = i10;
                viewPager2.A.b();
            }
        }
    }

    public class c extends g {
        public c() {
        }

        public final void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f3600q.requestFocus(2);
            }
        }
    }

    public abstract class d {
    }

    public static abstract class e extends RecyclerView.g {
        public e(int i10) {
        }

        public abstract void a();

        public final void b() {
            a();
        }

        public final void c(int i10, int i11) {
            a();
        }

        public final void d(int i10, int i11) {
            a();
        }
    }

    public class f extends LinearLayoutManager {
        public f() {
            super(1);
        }

        public final void P0(RecyclerView.w wVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.P0(wVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public final void f0(RecyclerView.s sVar, RecyclerView.w wVar, x1.f fVar) {
            super.f0(sVar, wVar, fVar);
            ViewPager2.this.A.getClass();
        }

        public final void h0(RecyclerView.s sVar, RecyclerView.w wVar, View view, x1.f fVar) {
            int i10;
            h hVar = ViewPager2.this.A;
            int i11 = 0;
            if (ViewPager2.this.getOrientation() == 1) {
                ViewPager2.this.f3597n.getClass();
                i10 = RecyclerView.m.O(view);
            } else {
                i10 = 0;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                ViewPager2.this.f3597n.getClass();
                i11 = RecyclerView.m.O(view);
            }
            fVar.j(f.g.a(i10, 1, i11, 1, false, false));
        }

        public final boolean u0(RecyclerView.s sVar, RecyclerView.w wVar, int i10, Bundle bundle) {
            ViewPager2.this.A.getClass();
            return super.u0(sVar, wVar, i10, bundle);
        }

        public final boolean z0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    public static abstract class g {
        public void a(int i10) {
        }

        public void b(float f10, int i10, int i11) {
        }

        public void c(int i10) {
        }
    }

    public class h extends d {

        /* renamed from: a  reason: collision with root package name */
        public final a f3616a = new a();

        /* renamed from: b  reason: collision with root package name */
        public final b f3617b = new b();

        /* renamed from: c  reason: collision with root package name */
        public i f3618c;

        public class a implements x1.j {
            public a() {
            }

            public final boolean a(View view) {
                h hVar = h.this;
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f3608y) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        public class b implements x1.j {
            public b() {
            }

            public final boolean a(View view) {
                h hVar = h.this;
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f3608y) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        public h() {
        }

        public final void a(RecyclerView recyclerView) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.s(recyclerView, 2);
            this.f3618c = new i(this);
            if (d0.d.c(ViewPager2.this) == 0) {
                d0.d.s(ViewPager2.this, 1);
            }
        }

        public final void b() {
            int c10;
            int i10;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i11 = 16908360;
            d0.l(16908360, viewPager2);
            boolean z10 = false;
            d0.i(0, viewPager2);
            d0.l(16908361, viewPager2);
            d0.i(0, viewPager2);
            d0.l(16908358, viewPager2);
            d0.i(0, viewPager2);
            d0.l(16908359, viewPager2);
            d0.i(0, viewPager2);
            if (ViewPager2.this.getAdapter() != null && (c10 = ViewPager2.this.getAdapter().c()) != 0) {
                ViewPager2 viewPager22 = ViewPager2.this;
                if (viewPager22.f3608y) {
                    if (viewPager22.getOrientation() == 0) {
                        if (ViewPager2.this.f3597n.M() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            i10 = 16908360;
                        } else {
                            i10 = 16908361;
                        }
                        if (z10) {
                            i11 = 16908361;
                        }
                        if (ViewPager2.this.f3594d < c10 - 1) {
                            d0.m(viewPager2, new f.a(i10), (String) null, this.f3616a);
                        }
                        if (ViewPager2.this.f3594d > 0) {
                            d0.m(viewPager2, new f.a(i11), (String) null, this.f3617b);
                            return;
                        }
                        return;
                    }
                    if (ViewPager2.this.f3594d < c10 - 1) {
                        d0.m(viewPager2, new f.a(16908359), (String) null, this.f3616a);
                    }
                    if (ViewPager2.this.f3594d > 0) {
                        d0.m(viewPager2, new f.a(16908358), (String) null, this.f3617b);
                    }
                }
            }
        }
    }

    public interface i {
    }

    public class j extends r {
        public j() {
        }

        public final View d(RecyclerView.m mVar) {
            if (((g) ViewPager2.this.f3604u.f3629b).f3646m) {
                return null;
            }
            return super.d(mVar);
        }
    }

    public class k extends RecyclerView {
        public k(Context context) {
            super(context);
        }

        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.A.getClass();
            return super.getAccessibilityClassName();
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f3594d);
            accessibilityEvent.setToIndex(ViewPager2.this.f3594d);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ViewPager2.this.f3608y || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (!ViewPager2.this.f3608y || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    public static class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f3623a;

        /* renamed from: b  reason: collision with root package name */
        public final RecyclerView f3624b;

        public l(int i10, k kVar) {
            this.f3623a = i10;
            this.f3624b = kVar;
        }

        public final void run() {
            this.f3624b.n0(this.f3623a);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    /* JADX INFO: finally extract failed */
    public final void a(Context context, AttributeSet attributeSet) {
        this.A = new h();
        k kVar = new k(context);
        this.f3600q = kVar;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        kVar.setId(d0.e.a());
        this.f3600q.setDescendantFocusability(131072);
        f fVar = new f();
        this.f3597n = fVar;
        this.f3600q.setLayoutManager(fVar);
        this.f3600q.setScrollingTouchSlop(1);
        int[] iArr = R$styleable.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        d0.n(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(R$styleable.ViewPager2_android_orientation, 0));
            obtainStyledAttributes.recycle();
            this.f3600q.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            k kVar2 = this.f3600q;
            h hVar = new h();
            if (kVar2.K == null) {
                kVar2.K = new ArrayList();
            }
            kVar2.K.add(hVar);
            g gVar = new g(this);
            this.f3602s = gVar;
            this.f3604u = new d(this, gVar, this.f3600q);
            j jVar = new j();
            this.f3601r = jVar;
            jVar.a(this.f3600q);
            this.f3600q.j(this.f3602s);
            c cVar = new c();
            this.f3603t = cVar;
            this.f3602s.f3634a = cVar;
            b bVar = new b();
            c cVar2 = new c();
            this.f3603t.f3627a.add(bVar);
            this.f3603t.f3627a.add(cVar2);
            this.A.a(this.f3600q);
            c cVar3 = this.f3603t;
            cVar3.f3627a.add(this.f3593c);
            f fVar2 = new f(this.f3597n);
            this.f3605v = fVar2;
            this.f3603t.f3627a.add(fVar2);
            k kVar3 = this.f3600q;
            attachViewToParent(kVar3, 0, kVar3.getLayoutParams());
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b() {
        RecyclerView.e adapter;
        if (this.f3598o != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f3599p;
            if (parcelable != null) {
                if (adapter instanceof m3.i) {
                    ((m3.i) adapter).b(parcelable);
                }
                this.f3599p = null;
            }
            int max = Math.max(0, Math.min(this.f3598o, adapter.c() - 1));
            this.f3594d = max;
            this.f3598o = -1;
            this.f3600q.k0(max);
            this.A.b();
        }
    }

    public final void c(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        g gVar;
        boolean z12;
        RecyclerView.e adapter = getAdapter();
        boolean z13 = false;
        if (adapter == null) {
            if (this.f3598o != -1) {
                this.f3598o = Math.max(i10, 0);
            }
        } else if (adapter.c() > 0) {
            int min = Math.min(Math.max(i10, 0), adapter.c() - 1);
            int i13 = this.f3594d;
            if (min == i13) {
                if (this.f3602s.f3639f == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    return;
                }
            }
            if (min != i13 || !z10) {
                double d10 = (double) i13;
                this.f3594d = min;
                this.A.b();
                g gVar2 = this.f3602s;
                if (gVar2.f3639f == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    gVar2.e();
                    g.a aVar = gVar2.f3640g;
                    d10 = ((double) aVar.f3647a) + ((double) aVar.f3648b);
                }
                g gVar3 = this.f3602s;
                if (z10) {
                    i11 = 2;
                } else {
                    i11 = 3;
                }
                gVar3.f3638e = i11;
                gVar3.f3646m = false;
                if (gVar3.f3642i != min) {
                    z13 = true;
                }
                gVar3.f3642i = min;
                gVar3.c(2);
                if (z13 && (gVar = gVar3.f3634a) != null) {
                    gVar.c(min);
                }
                if (!z10) {
                    this.f3600q.k0(min);
                    return;
                }
                double d11 = (double) min;
                if (Math.abs(d11 - d10) > 3.0d) {
                    k kVar = this.f3600q;
                    if (d11 > d10) {
                        i12 = min - 3;
                    } else {
                        i12 = min + 3;
                    }
                    kVar.k0(i12);
                    k kVar2 = this.f3600q;
                    kVar2.post(new l(min, kVar2));
                    return;
                }
                this.f3600q.n0(min);
            }
        }
    }

    public final boolean canScrollHorizontally(int i10) {
        return this.f3600q.canScrollHorizontally(i10);
    }

    public final boolean canScrollVertically(int i10) {
        return this.f3600q.canScrollVertically(i10);
    }

    public final void d() {
        j jVar = this.f3601r;
        if (jVar != null) {
            View d10 = jVar.d(this.f3597n);
            if (d10 != null) {
                this.f3597n.getClass();
                int O = RecyclerView.m.O(d10);
                if (O != this.f3594d && getScrollState() == 0) {
                    this.f3603t.c(O);
                }
                this.f3595e = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f3610a;
            sparseArray.put(this.f3600q.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public CharSequence getAccessibilityClassName() {
        this.A.getClass();
        this.A.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.e getAdapter() {
        return this.f3600q.getAdapter();
    }

    public int getCurrentItem() {
        return this.f3594d;
    }

    public int getItemDecorationCount() {
        return this.f3600q.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f3609z;
    }

    public int getOrientation() {
        if (this.f3597n.f2934x == 1) {
            return 1;
        }
        return 0;
    }

    public int getPageSize() {
        int i10;
        int i11;
        k kVar = this.f3600q;
        if (getOrientation() == 0) {
            i10 = kVar.getWidth() - kVar.getPaddingLeft();
            i11 = kVar.getPaddingRight();
        } else {
            i10 = kVar.getHeight() - kVar.getPaddingTop();
            i11 = kVar.getPaddingBottom();
        }
        return i10 - i11;
    }

    public int getScrollState() {
        return this.f3602s.f3639f;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        int c10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h hVar = this.A;
        if (ViewPager2.this.getAdapter() == null) {
            i11 = 0;
            i10 = 0;
        } else if (ViewPager2.this.getOrientation() == 1) {
            i11 = ViewPager2.this.getAdapter().c();
            i10 = 1;
        } else {
            i10 = ViewPager2.this.getAdapter().c();
            i11 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.C0220f.a(i11, i10, 0).f16880a);
        RecyclerView.e adapter = ViewPager2.this.getAdapter();
        if (adapter != null && (c10 = adapter.c()) != 0) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f3608y) {
                if (viewPager2.f3594d > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f3594d < c10 - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f3600q.getMeasuredWidth();
        int measuredHeight = this.f3600q.getMeasuredHeight();
        this.f3591a.left = getPaddingLeft();
        this.f3591a.right = (i12 - i10) - getPaddingRight();
        this.f3591a.top = getPaddingTop();
        this.f3591a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f3591a, this.f3592b);
        k kVar = this.f3600q;
        Rect rect = this.f3592b;
        kVar.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f3595e) {
            d();
        }
    }

    public final void onMeasure(int i10, int i11) {
        measureChild(this.f3600q, i10, i11);
        int measuredWidth = this.f3600q.getMeasuredWidth();
        int measuredHeight = this.f3600q.getMeasuredHeight();
        int measuredState = this.f3600q.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3598o = savedState.f3611b;
        this.f3599p = savedState.f3612c;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3610a = this.f3600q.getId();
        int i10 = this.f3598o;
        if (i10 == -1) {
            i10 = this.f3594d;
        }
        savedState.f3611b = i10;
        Parcelable parcelable = this.f3599p;
        if (parcelable != null) {
            savedState.f3612c = parcelable;
        } else {
            RecyclerView.e adapter = this.f3600q.getAdapter();
            if (adapter instanceof m3.i) {
                savedState.f3612c = ((m3.i) adapter).a();
            }
        }
        return savedState;
    }

    public final void onViewAdded(View view) {
        Class<ViewPager2> cls = ViewPager2.class;
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        boolean z10;
        int i11;
        this.A.getClass();
        boolean z11 = false;
        if (i10 == 8192 || i10 == 4096) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return super.performAccessibilityAction(i10, bundle);
        }
        h hVar = this.A;
        hVar.getClass();
        if (i10 == 8192 || i10 == 4096) {
            z11 = true;
        }
        if (z11) {
            if (i10 == 8192) {
                i11 = ViewPager2.this.getCurrentItem() - 1;
            } else {
                i11 = ViewPager2.this.getCurrentItem() + 1;
            }
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f3608y) {
                viewPager2.c(i11, true);
            }
            return true;
        }
        throw new IllegalStateException();
    }

    public void setAdapter(RecyclerView.e eVar) {
        RecyclerView.e adapter = this.f3600q.getAdapter();
        h hVar = this.A;
        if (adapter != null) {
            adapter.s(hVar.f3618c);
        } else {
            hVar.getClass();
        }
        if (adapter != null) {
            adapter.s(this.f3596f);
        }
        this.f3600q.setAdapter(eVar);
        this.f3594d = 0;
        b();
        h hVar2 = this.A;
        hVar2.b();
        if (eVar != null) {
            eVar.q(hVar2.f3618c);
        }
        if (eVar != null) {
            eVar.q(this.f3596f);
        }
    }

    public void setCurrentItem(int i10) {
        setCurrentItem(i10, true);
    }

    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.A.b();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 >= 1 || i10 == -1) {
            this.f3609z = i10;
            this.f3600q.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i10) {
        this.f3597n.r1(i10);
        this.A.b();
    }

    public void setPageTransformer(i iVar) {
        if (iVar != null) {
            if (!this.f3607x) {
                this.f3606w = this.f3600q.getItemAnimator();
                this.f3607x = true;
            }
            this.f3600q.setItemAnimator((RecyclerView.j) null);
        } else if (this.f3607x) {
            this.f3600q.setItemAnimator(this.f3606w);
            this.f3606w = null;
            this.f3607x = false;
        }
        f fVar = this.f3605v;
        if (iVar != fVar.f3633b) {
            fVar.f3633b = iVar;
            if (iVar != null) {
                g gVar = this.f3602s;
                gVar.e();
                g.a aVar = gVar.f3640g;
                double d10 = ((double) aVar.f3647a) + ((double) aVar.f3648b);
                int i10 = (int) d10;
                float f10 = (float) (d10 - ((double) i10));
                this.f3605v.b(f10, i10, Math.round(((float) getPageSize()) * f10));
            }
        }
    }

    public void setUserInputEnabled(boolean z10) {
        this.f3608y = z10;
        this.A.b();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f3610a;

        /* renamed from: b  reason: collision with root package name */
        public int f3611b;

        /* renamed from: c  reason: collision with root package name */
        public Parcelable f3612c;

        @SuppressLint({"ClassVerificationFailure"})
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3610a = parcel.readInt();
            this.f3611b = parcel.readInt();
            this.f3612c = parcel.readParcelable(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3610a);
            parcel.writeInt(this.f3611b);
            parcel.writeParcelable(this.f3612c, i10);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, (ClassLoader) null);
                }
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, classLoader);
                }
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3610a = parcel.readInt();
            this.f3611b = parcel.readInt();
            this.f3612c = parcel.readParcelable((ClassLoader) null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCurrentItem(int i10, boolean z10) {
        if (!((g) this.f3604u.f3629b).f3646m) {
            c(i10, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }
}
