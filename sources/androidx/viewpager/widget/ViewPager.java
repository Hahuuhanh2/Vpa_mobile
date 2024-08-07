package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import v.v;
import w1.d0;
import w1.q;
import w1.q0;
import w1.w0;

public class ViewPager extends ViewGroup {

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f3544f0 = {16842931};

    /* renamed from: g0  reason: collision with root package name */
    public static final a f3545g0 = new a();

    /* renamed from: h0  reason: collision with root package name */
    public static final b f3546h0 = new b();

    /* renamed from: i0  reason: collision with root package name */
    public static final l f3547i0 = new l();
    public boolean A;
    public boolean B;
    public int C = 1;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public float I;
    public float J;
    public float K;
    public int L = -1;
    public VelocityTracker M;
    public int N;
    public EdgeEffect O;
    public EdgeEffect P;
    public boolean Q = true;
    public boolean R;
    public int S;
    public ArrayList T;
    public i U;
    public i V;
    public ArrayList W;

    /* renamed from: a  reason: collision with root package name */
    public int f3548a;

    /* renamed from: a0  reason: collision with root package name */
    public int f3549a0;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<f> f3550b = new ArrayList<>();

    /* renamed from: b0  reason: collision with root package name */
    public int f3551b0;

    /* renamed from: c  reason: collision with root package name */
    public final f f3552c = new f();

    /* renamed from: c0  reason: collision with root package name */
    public ArrayList<View> f3553c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3554d = new Rect();

    /* renamed from: d0  reason: collision with root package name */
    public final c f3555d0 = new c();

    /* renamed from: e  reason: collision with root package name */
    public l3.a f3556e;

    /* renamed from: e0  reason: collision with root package name */
    public int f3557e0 = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f3558f;

    /* renamed from: n  reason: collision with root package name */
    public int f3559n = -1;

    /* renamed from: o  reason: collision with root package name */
    public Parcelable f3560o = null;

    /* renamed from: p  reason: collision with root package name */
    public Scroller f3561p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3562q;

    /* renamed from: r  reason: collision with root package name */
    public k f3563r;

    /* renamed from: s  reason: collision with root package name */
    public int f3564s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f3565t;

    /* renamed from: u  reason: collision with root package name */
    public int f3566u;

    /* renamed from: v  reason: collision with root package name */
    public int f3567v;

    /* renamed from: w  reason: collision with root package name */
    public float f3568w = -3.4028235E38f;

    /* renamed from: x  reason: collision with root package name */
    public float f3569x = Float.MAX_VALUE;

    /* renamed from: y  reason: collision with root package name */
    public int f3570y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3571z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f3578c;

        /* renamed from: d  reason: collision with root package name */
        public Parcelable f3579d;

        /* renamed from: e  reason: collision with root package name */
        public ClassLoader f3580e;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("FragmentPager.SavedState{");
            q10.append(Integer.toHexString(System.identityHashCode(this)));
            q10.append(" position=");
            return v.e(q10, this.f3578c, "}");
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeInt(this.f3578c);
            parcel.writeParcelable(this.f3579d, i10);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f3578c = parcel.readInt();
            this.f3579d = parcel.readParcelable(classLoader);
            this.f3580e = classLoader;
        }
    }

    public static class a implements Comparator<f> {
        public final int compare(Object obj, Object obj2) {
            return ((f) obj).f3585b - ((f) obj2).f3585b;
        }
    }

    public static class b implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.q();
        }
    }

    public class d implements q {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f3582a = new Rect();

        public d() {
        }

        public final w0 g(View view, w0 w0Var) {
            w0 j10 = d0.j(view, w0Var);
            if (j10.f16391a.m()) {
                return j10;
            }
            Rect rect = this.f3582a;
            rect.left = j10.c();
            rect.top = j10.e();
            rect.right = j10.d();
            rect.bottom = j10.b();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                w0 b10 = d0.b(ViewPager.this.getChildAt(i10), j10);
                rect.left = Math.min(b10.c(), rect.left);
                rect.top = Math.min(b10.e(), rect.top);
                rect.right = Math.min(b10.d(), rect.right);
                rect.bottom = Math.min(b10.b(), rect.bottom);
            }
            return j10.g(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Object f3584a;

        /* renamed from: b  reason: collision with root package name */
        public int f3585b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3586c;

        /* renamed from: d  reason: collision with root package name */
        public float f3587d;

        /* renamed from: e  reason: collision with root package name */
        public float f3588e;
    }

    public class g extends w1.a {
        public g() {
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            l3.a aVar;
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            l3.a aVar2 = ViewPager.this.f3556e;
            if (aVar2 != null) {
                aVar2.c();
            }
            accessibilityEvent.setScrollable(false);
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f3556e) != null) {
                aVar.c();
                accessibilityEvent.setItemCount(0);
                accessibilityEvent.setFromIndex(ViewPager.this.f3558f);
                accessibilityEvent.setToIndex(ViewPager.this.f3558f);
            }
        }

        public final void d(View view, x1.f fVar) {
            this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            fVar.i(ViewPager.class.getName());
            l3.a aVar = ViewPager.this.f3556e;
            if (aVar != null) {
                aVar.c();
            }
            fVar.m(false);
            if (ViewPager.this.canScrollHorizontally(1)) {
                fVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                fVar.a(8192);
            }
        }

        public final boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f3558f - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f3558f + 1);
                return true;
            }
        }
    }

    public interface h {
        void d(ViewPager viewPager, l3.a aVar, l3.a aVar2);
    }

    public interface i {
        void a(float f10, int i10);

        void b(int i10);

        void c(int i10);
    }

    public interface j {
        void a();
    }

    public class k extends DataSetObserver {
        public k() {
        }

        public final void onChanged() {
            ViewPager.this.e();
        }

        public final void onInvalidated() {
            ViewPager.this.e();
        }
    }

    public static class l implements Comparator<View> {
        public final int compare(Object obj, Object obj2) {
            LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
            boolean z10 = layoutParams.f3572a;
            if (z10 == layoutParams2.f3572a) {
                return layoutParams.f3576e - layoutParams2.f3576e;
            }
            if (z10) {
                return 1;
            }
            return -1;
        }
    }

    public ViewPager(Context context) {
        super(context);
        k();
    }

    public static boolean c(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && c(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        if (!z10 || !view.canScrollHorizontally(-i10)) {
            return false;
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
        }
    }

    public final f a(int i10, int i11) {
        f fVar = new f();
        fVar.f3585b = i10;
        fVar.f3584a = this.f3556e.g();
        fVar.f3587d = this.f3556e.f();
        if (i11 < 0 || i11 >= this.f3550b.size()) {
            this.f3550b.add(fVar);
        } else {
            this.f3550b.add(i11, fVar);
        }
        return fVar;
    }

    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        f h10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3585b == this.f3558f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public final void addTouchables(ArrayList<View> arrayList) {
        f h10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3585b == this.f3558f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z11 = layoutParams2.f3572a;
        if (view.getClass().getAnnotation(e.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        layoutParams2.f3572a = z12;
        if (!this.f3571z) {
            super.addView(view, i10, layoutParams);
        } else if (!z12) {
            layoutParams2.f3575d = true;
            addViewInLayout(view, i10, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 0
            r2 = 1
            if (r0 != r6) goto L_0x0009
            goto L_0x002f
        L_0x0009:
            if (r0 == 0) goto L_0x0030
            android.view.ViewParent r3 = r0.getParent()
        L_0x000f:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x001c
            if (r3 != r6) goto L_0x0017
            r3 = r2
            goto L_0x001d
        L_0x0017:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x000f
        L_0x001c:
            r3 = r1
        L_0x001d:
            if (r3 != 0) goto L_0x0030
            android.view.ViewParent r0 = r0.getParent()
        L_0x0023:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x002f
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0023
        L_0x002f:
            r0 = 0
        L_0x0030:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x0086
            if (r3 == r0) goto L_0x0086
            if (r7 != r5) goto L_0x0066
            android.graphics.Rect r4 = r6.f3554d
            android.graphics.Rect r4 = r6.g(r3, r4)
            int r4 = r4.left
            android.graphics.Rect r5 = r6.f3554d
            android.graphics.Rect r5 = r6.g(r0, r5)
            int r5 = r5.left
            if (r0 == 0) goto L_0x0060
            if (r4 < r5) goto L_0x0060
            int r0 = r6.f3558f
            if (r0 <= 0) goto L_0x009e
            int r0 = r0 - r2
            r6.setCurrentItem(r0, r2)
        L_0x005e:
            r1 = r2
            goto L_0x009e
        L_0x0060:
            boolean r0 = r3.requestFocus()
        L_0x0064:
            r1 = r0
            goto L_0x009e
        L_0x0066:
            if (r7 != r4) goto L_0x009e
            android.graphics.Rect r1 = r6.f3554d
            android.graphics.Rect r1 = r6.g(r3, r1)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3554d
            android.graphics.Rect r2 = r6.g(r0, r2)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0081
            if (r1 > r2) goto L_0x0081
            boolean r0 = r6.n()
            goto L_0x0064
        L_0x0081:
            boolean r0 = r3.requestFocus()
            goto L_0x0064
        L_0x0086:
            if (r7 == r5) goto L_0x0095
            if (r7 != r2) goto L_0x008b
            goto L_0x0095
        L_0x008b:
            if (r7 == r4) goto L_0x0090
            r0 = 2
            if (r7 != r0) goto L_0x009e
        L_0x0090:
            boolean r1 = r6.n()
            goto L_0x009e
        L_0x0095:
            int r0 = r6.f3558f
            if (r0 <= 0) goto L_0x009e
            int r0 = r0 - r2
            r6.setCurrentItem(r0, r2)
            goto L_0x005e
        L_0x009e:
            if (r1 == 0) goto L_0x00a7
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.b(int):boolean");
    }

    public final boolean canScrollHorizontally(int i10) {
        if (this.f3556e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f3568w))) {
                return true;
            }
            return false;
        } else if (i10 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f3569x))) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final void computeScroll() {
        this.f3562q = true;
        if (this.f3561p.isFinished() || !this.f3561p.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3561p.getCurrX();
        int currY = this.f3561p.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                this.f3561p.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.k(this);
    }

    public final void d(boolean z10) {
        boolean z11;
        if (this.f3557e0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f3561p.isFinished()) {
                this.f3561p.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3561p.getCurrX();
                int currY = this.f3561p.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.B = false;
        for (int i10 = 0; i10 < this.f3550b.size(); i10++) {
            f fVar = this.f3550b.get(i10);
            if (fVar.f3586c) {
                fVar.f3586c = false;
                z11 = true;
            }
        }
        if (!z11) {
            return;
        }
        if (z10) {
            c cVar = this.f3555d0;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.m(this, cVar);
            return;
        }
        this.f3555d0.run();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0064
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x005f
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0048
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x005f
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r6 = r5.b(r4)
            goto L_0x0060
        L_0x002b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L_0x005f
            boolean r6 = r5.b(r1)
            goto L_0x0060
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r6 = r5.n()
            goto L_0x0060
        L_0x0041:
            r6 = 66
            boolean r6 = r5.b(r6)
            goto L_0x0060
        L_0x0048:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0058
            int r6 = r5.f3558f
            if (r6 <= 0) goto L_0x005f
            int r6 = r6 - r1
            r5.setCurrentItem(r6, r1)
            r6 = r1
            goto L_0x0060
        L_0x0058:
            r6 = 17
            boolean r6 = r5.b(r6)
            goto L_0x0060
        L_0x005f:
            r6 = r2
        L_0x0060:
            if (r6 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r1 = r2
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f h10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3585b == this.f3558f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        l3.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode != 0) {
            if (overScrollMode == 1 && (aVar = this.f3556e) != null) {
                aVar.c();
            }
            this.O.finish();
            this.P.finish();
        } else {
            if (!this.O.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.f3568w * ((float) width));
                this.O.setSize(height, width);
                z10 = false | this.O.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.P.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f3569x + 1.0f)) * ((float) width2));
                this.P.setSize(height2, width2);
                z10 |= this.P.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(this);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3565t;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e() {
        boolean z10;
        this.f3556e.c();
        this.f3548a = 0;
        if (this.f3550b.size() >= (this.C * 2) + 1 || this.f3550b.size() >= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i10 = this.f3558f;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < this.f3550b.size()) {
            f fVar = this.f3550b.get(i11);
            l3.a aVar = this.f3556e;
            Object obj = fVar.f3584a;
            int d10 = aVar.d();
            if (d10 != -1) {
                if (d10 == -2) {
                    this.f3550b.remove(i11);
                    i11--;
                    if (!z11) {
                        this.f3556e.n();
                        z11 = true;
                    }
                    this.f3556e.a();
                    int i12 = this.f3558f;
                    if (i12 == fVar.f3585b) {
                        i10 = Math.max(0, Math.min(i12, -1));
                    }
                } else {
                    int i13 = fVar.f3585b;
                    if (i13 != d10) {
                        if (i13 == this.f3558f) {
                            i10 = d10;
                        }
                        fVar.f3585b = d10;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.f3556e.b();
        }
        Collections.sort(this.f3550b, f3545g0);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i14).getLayoutParams();
                if (!layoutParams.f3572a) {
                    layoutParams.f3574c = 0.0f;
                }
            }
            v(i10, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i10) {
        i iVar = this.U;
        if (iVar != null) {
            iVar.c(i10);
        }
        ArrayList arrayList = this.T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar2 = (i) this.T.get(i11);
                if (iVar2 != null) {
                    iVar2.c(i10);
                }
            }
        }
        i iVar3 = this.V;
        if (iVar3 != null) {
            iVar3.c(i10);
        }
    }

    public final Rect g(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public l3.a getAdapter() {
        return this.f3556e;
    }

    public final int getChildDrawingOrder(int i10, int i11) {
        if (this.f3551b0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((LayoutParams) this.f3553c0.get(i11).getLayoutParams()).f3577f;
    }

    public int getCurrentItem() {
        return this.f3558f;
    }

    public int getOffscreenPageLimit() {
        return this.C;
    }

    public int getPageMargin() {
        return this.f3564s;
    }

    public final f h(View view) {
        for (int i10 = 0; i10 < this.f3550b.size(); i10++) {
            f fVar = this.f3550b.get(i10);
            l3.a aVar = this.f3556e;
            Object obj = fVar.f3584a;
            if (aVar.h()) {
                return fVar;
            }
        }
        return null;
    }

    public final f i() {
        float f10;
        float f11;
        int i10;
        int clientWidth = getClientWidth();
        float f12 = 0.0f;
        if (clientWidth > 0) {
            f10 = ((float) getScrollX()) / ((float) clientWidth);
        } else {
            f10 = 0.0f;
        }
        if (clientWidth > 0) {
            f11 = ((float) this.f3564s) / ((float) clientWidth);
        } else {
            f11 = 0.0f;
        }
        f fVar = null;
        int i11 = 0;
        boolean z10 = true;
        int i12 = -1;
        float f13 = 0.0f;
        while (i11 < this.f3550b.size()) {
            f fVar2 = this.f3550b.get(i11);
            if (!z10 && fVar2.f3585b != (i10 = i12 + 1)) {
                fVar2 = this.f3552c;
                fVar2.f3588e = f12 + f13 + f11;
                fVar2.f3585b = i10;
                fVar2.f3587d = this.f3556e.f();
                i11--;
            }
            f12 = fVar2.f3588e;
            float f14 = fVar2.f3587d + f12 + f11;
            if (!z10 && f10 < f12) {
                return fVar;
            }
            if (f10 < f14 || i11 == this.f3550b.size() - 1) {
                return fVar2;
            }
            i12 = fVar2.f3585b;
            f13 = fVar2.f3587d;
            i11++;
            z10 = false;
            fVar = fVar2;
        }
        return fVar;
    }

    public final f j(int i10) {
        for (int i11 = 0; i11 < this.f3550b.size(); i11++) {
            f fVar = this.f3550b.get(i11);
            if (fVar.f3585b == i10) {
                return fVar;
            }
        }
        return null;
    }

    public final void k() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3561p = new Scroller(context, f3546h0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.H = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.O = new EdgeEffect(context);
        this.P = new EdgeEffect(context);
        this.N = (int) (2.0f * f10);
        this.F = (int) (f10 * 16.0f);
        d0.o(this, new g());
        if (d0.d.c(this) == 0) {
            d0.d.s(this, 1);
        }
        d0.i.u(this, new d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(float r12, int r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.S
            r0 = 1
            r1 = 0
            if (r14 <= 0) goto L_0x006b
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r1
        L_0x001b:
            if (r6 >= r5) goto L_0x006b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r8 = (androidx.viewpager.widget.ViewPager.LayoutParams) r8
            boolean r9 = r8.f3572a
            if (r9 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r8 = r8.f3573b
            r8 = r8 & 7
            if (r8 == r0) goto L_0x004d
            r9 = 3
            if (r8 == r9) goto L_0x0047
            r9 = 5
            if (r8 == r9) goto L_0x003a
            r8 = r2
            goto L_0x005c
        L_0x003a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
            goto L_0x0059
        L_0x0047:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L_0x005c
        L_0x004d:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
        L_0x0059:
            r10 = r8
            r8 = r2
            r2 = r10
        L_0x005c:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L_0x0067
            r7.offsetLeftAndRight(r2)
        L_0x0067:
            r2 = r8
        L_0x0068:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x006b:
            androidx.viewpager.widget.ViewPager$i r14 = r11.U
            if (r14 == 0) goto L_0x0072
            r14.a(r12, r13)
        L_0x0072:
            java.util.ArrayList r14 = r11.T
            if (r14 == 0) goto L_0x008c
            int r14 = r14.size()
        L_0x007a:
            if (r1 >= r14) goto L_0x008c
            java.util.ArrayList r2 = r11.T
            java.lang.Object r2 = r2.get(r1)
            androidx.viewpager.widget.ViewPager$i r2 = (androidx.viewpager.widget.ViewPager.i) r2
            if (r2 == 0) goto L_0x0089
            r2.a(r12, r13)
        L_0x0089:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x008c:
            androidx.viewpager.widget.ViewPager$i r14 = r11.V
            if (r14 == 0) goto L_0x0093
            r14.a(r12, r13)
        L_0x0093:
            r11.R = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.l(float, int, int):void");
    }

    public final void m(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.L) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.I = motionEvent.getX(i10);
            this.L = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        l3.a aVar = this.f3556e;
        if (aVar == null) {
            return false;
        }
        int i10 = this.f3558f;
        aVar.c();
        if (i10 >= -1) {
            return false;
        }
        setCurrentItem(this.f3558f + 1, true);
        return true;
    }

    public final boolean o(int i10) {
        if (this.f3550b.size() != 0) {
            f i11 = i();
            int clientWidth = getClientWidth();
            int i12 = this.f3564s;
            int i13 = clientWidth + i12;
            float f10 = (float) clientWidth;
            int i14 = i11.f3585b;
            float f11 = ((((float) i10) / f10) - i11.f3588e) / (i11.f3587d + (((float) i12) / f10));
            this.R = false;
            l(f11, i14, (int) (((float) i13) * f11));
            if (this.R) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.Q) {
            return false;
        } else {
            this.R = false;
            l(0.0f, 0, 0);
            if (this.R) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3555d0);
        Scroller scroller = this.f3561p;
        if (scroller != null && !scroller.isFinished()) {
            this.f3561p.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f3564s
            if (r1 <= 0) goto L_0x00a9
            android.graphics.drawable.Drawable r1 = r0.f3565t
            if (r1 == 0) goto L_0x00a9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.f3550b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00a9
            l3.a r1 = r0.f3556e
            if (r1 == 0) goto L_0x00a9
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f3564s
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3550b
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            float r7 = r5.f3588e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f3550b
            int r8 = r8.size()
            int r9 = r5.f3585b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r10 = r0.f3550b
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$f r10 = (androidx.viewpager.widget.ViewPager.f) r10
            int r10 = r10.f3585b
        L_0x0045:
            if (r9 >= r10) goto L_0x00a9
        L_0x0047:
            int r11 = r5.f3585b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3550b
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0063
            float r7 = r5.f3588e
            float r11 = r5.f3587d
            float r7 = r7 + r11
            float r11 = r7 * r4
            float r7 = r7 + r3
            goto L_0x0070
        L_0x0063:
            l3.a r11 = r0.f3556e
            float r11 = r11.f()
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r11 = r11 + r7
            r7 = r11
            r11 = r12
        L_0x0070:
            int r12 = r0.f3564s
            float r12 = (float) r12
            float r12 = r12 + r11
            float r13 = (float) r1
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0098
            android.graphics.drawable.Drawable r12 = r0.f3565t
            int r13 = java.lang.Math.round(r11)
            int r14 = r0.f3566u
            int r15 = r0.f3564s
            float r15 = (float) r15
            float r15 = r15 + r11
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f3567v
            r12.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f3565t
            r12 = r18
            r3.draw(r12)
            goto L_0x009c
        L_0x0098:
            r12 = r18
            r16 = r3
        L_0x009c:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z10;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.D) {
                return true;
            }
            if (this.E) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.J = x10;
            this.I = x10;
            this.K = motionEvent.getY();
            this.L = motionEvent.getPointerId(0);
            this.E = false;
            this.f3562q = true;
            this.f3561p.computeScrollOffset();
            if (this.f3557e0 != 2 || Math.abs(this.f3561p.getFinalX() - this.f3561p.getCurrX()) <= this.N) {
                d(false);
                this.D = false;
            } else {
                this.f3561p.abortAnimation();
                this.B = false;
                q();
                this.D = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.L;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(findPointerIndex);
                float f11 = x11 - this.I;
                float abs = Math.abs(f11);
                float y10 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y10 - this.K);
                int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                if (i11 != 0) {
                    float f12 = this.I;
                    if ((f12 >= ((float) this.G) || i11 <= 0) && (f12 <= ((float) (getWidth() - this.G)) || f11 >= 0.0f)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10 && c((int) f11, (int) x11, (int) y10, this, false)) {
                        this.I = x11;
                        this.E = true;
                        return false;
                    }
                }
                float f13 = (float) this.H;
                if (abs > f13 && abs * 0.5f > abs2) {
                    this.D = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f14 = this.J;
                    float f15 = (float) this.H;
                    if (i11 > 0) {
                        f10 = f14 + f15;
                    } else {
                        f10 = f14 - f15;
                    }
                    this.I = f10;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f13) {
                    this.E = true;
                }
                if (this.D && p(x11)) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.d.k(this);
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        if (this.M == null) {
            this.M = VelocityTracker.obtain();
        }
        this.M.addMovement(motionEvent);
        return this.D;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r12 = (androidx.viewpager.widget.ViewPager.LayoutParams) r12
            boolean r14 = r12.f3572a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f3573b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0106
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0103
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f3572a
            if (r10 != 0) goto L_0x0103
            androidx.viewpager.widget.ViewPager$f r10 = r0.h(r8)
            if (r10 == 0) goto L_0x0103
            float r13 = (float) r2
            float r10 = r10.f3588e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f3575d
            if (r14 == 0) goto L_0x00f6
            r14 = 0
            r9.f3575d = r14
            float r9 = r9.f3574c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f6:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0103:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0106:
            r0.f3566u = r5
            int r3 = r3 - r7
            r0.f3567v = r3
            r0.S = r11
            boolean r1 = r0.Q
            if (r1 == 0) goto L_0x0118
            int r1 = r0.f3558f
            r2 = 0
            r0.u(r1, r2, r2, r2)
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r0.Q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i10, int i11) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z10;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.G = Math.min(measuredWidth / 10, this.F);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!(childAt.getVisibility() == 8 || (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) == null || !layoutParams2.f3572a)) {
                int i15 = layoutParams2.f3573b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                if (i17 == 48 || i17 == 80) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!(i16 == 3 || i16 == 5)) {
                    z11 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z10) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else if (z11) {
                    i12 = 1073741824;
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                int i19 = layoutParams2.width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = layoutParams2.height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f3570y = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f3571z = true;
        q();
        this.f3571z = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f3572a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * layoutParams.f3574c), 1073741824), this.f3570y);
            }
        }
    }

    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        f h10;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i11 = 1;
        } else {
            i12 = childCount - 1;
            i11 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3585b == this.f3558f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i12 += i11;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        l3.a aVar = this.f3556e;
        if (aVar != null) {
            aVar.j();
            v(savedState.f3578c, 0, false, true);
            return;
        }
        this.f3559n = savedState.f3578c;
        this.f3560o = savedState.f3579d;
        ClassLoader classLoader = savedState.f3580e;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3578c = this.f3558f;
        l3.a aVar = this.f3556e;
        if (aVar != null) {
            savedState.f3579d = aVar.k();
        }
        return savedState;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f3564s;
            s(i10, i12, i14, i14);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l3.a aVar;
        if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (aVar = this.f3556e) != null) {
            aVar.c();
        }
        return false;
    }

    public final boolean p(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.I - f10;
        this.I = f10;
        float scrollX = ((float) getScrollX()) + f11;
        float clientWidth = (float) getClientWidth();
        float f12 = this.f3568w * clientWidth;
        float f13 = this.f3569x * clientWidth;
        boolean z12 = false;
        f fVar = this.f3550b.get(0);
        ArrayList<f> arrayList = this.f3550b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f3585b != 0) {
            f12 = fVar.f3588e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        int i10 = fVar2.f3585b;
        this.f3556e.c();
        if (i10 != -1) {
            f13 = fVar2.f3588e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.O.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.P.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i11 = (int) scrollX;
        this.I = (scrollX - ((float) i11)) + this.I;
        scrollTo(i11, getScrollY());
        o(i11);
        return z12;
    }

    public final void q() {
        r(this.f3558f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r5 == r6) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(int r15) {
        /*
            r14 = this;
            int r0 = r14.f3558f
            if (r0 == r15) goto L_0x000b
            androidx.viewpager.widget.ViewPager$f r0 = r14.j(r0)
            r14.f3558f = r15
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            l3.a r15 = r14.f3556e
            if (r15 != 0) goto L_0x0014
            r14.w()
            return
        L_0x0014:
            boolean r15 = r14.B
            if (r15 == 0) goto L_0x001c
            r14.w()
            return
        L_0x001c:
            android.os.IBinder r15 = r14.getWindowToken()
            if (r15 != 0) goto L_0x0023
            return
        L_0x0023:
            l3.a r15 = r14.f3556e
            r15.n()
            int r15 = r14.C
            int r1 = r14.f3558f
            int r1 = r1 - r15
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            l3.a r3 = r14.f3556e
            r3.c()
            int r3 = r14.f3558f
            int r3 = r3 + r15
            r15 = -1
            int r3 = java.lang.Math.min(r15, r3)
            int r4 = r14.f3548a
            if (r4 != 0) goto L_0x0329
        L_0x0043:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r4 = r14.f3550b
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x005f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r4 = r14.f3550b
            java.lang.Object r4 = r4.get(r2)
            androidx.viewpager.widget.ViewPager$f r4 = (androidx.viewpager.widget.ViewPager.f) r4
            int r5 = r4.f3585b
            int r6 = r14.f3558f
            if (r5 < r6) goto L_0x005c
            if (r5 != r6) goto L_0x005f
            goto L_0x0060
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x005f:
            r4 = 0
        L_0x0060:
            r5 = 0
            if (r4 == 0) goto L_0x02a5
            int r6 = r2 + -1
            if (r6 < 0) goto L_0x0070
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.f) r7
            goto L_0x0071
        L_0x0070:
            r7 = 0
        L_0x0071:
            int r8 = r14.getClientWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            if (r8 > 0) goto L_0x007b
            r11 = r5
            goto L_0x0087
        L_0x007b:
            float r10 = r4.f3587d
            float r10 = r9 - r10
            int r11 = r14.getPaddingLeft()
            float r11 = (float) r11
            float r12 = (float) r8
            float r11 = r11 / r12
            float r11 = r11 + r10
        L_0x0087:
            int r10 = r14.f3558f
            int r10 = r10 + r15
            r12 = r5
        L_0x008b:
            if (r10 < 0) goto L_0x00e7
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x00b7
            if (r10 >= r1) goto L_0x00b7
            if (r7 != 0) goto L_0x0096
            goto L_0x00e7
        L_0x0096:
            int r13 = r7.f3585b
            if (r10 != r13) goto L_0x00e4
            boolean r13 = r7.f3586c
            if (r13 != 0) goto L_0x00e4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            r7.remove(r6)
            l3.a r7 = r14.f3556e
            r7.a()
            int r6 = r6 + -1
            int r2 = r2 + -1
            if (r6 < 0) goto L_0x00e3
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.f) r7
            goto L_0x00e4
        L_0x00b7:
            if (r7 == 0) goto L_0x00cd
            int r13 = r7.f3585b
            if (r10 != r13) goto L_0x00cd
            float r7 = r7.f3587d
            float r12 = r12 + r7
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x00e3
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.f) r7
            goto L_0x00e4
        L_0x00cd:
            int r7 = r6 + 1
            androidx.viewpager.widget.ViewPager$f r7 = r14.a(r10, r7)
            float r7 = r7.f3587d
            float r12 = r12 + r7
            int r2 = r2 + 1
            if (r6 < 0) goto L_0x00e3
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.f) r7
            goto L_0x00e4
        L_0x00e3:
            r7 = 0
        L_0x00e4:
            int r10 = r10 + -1
            goto L_0x008b
        L_0x00e7:
            float r1 = r4.f3587d
            int r6 = r2 + 1
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x017a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0100
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.f) r7
            goto L_0x0101
        L_0x0100:
            r7 = 0
        L_0x0101:
            if (r8 > 0) goto L_0x0105
            r10 = r5
            goto L_0x010d
        L_0x0105:
            int r10 = r14.getPaddingRight()
            float r10 = (float) r10
            float r8 = (float) r8
            float r10 = r10 / r8
            float r10 = r10 + r9
        L_0x010d:
            int r8 = r14.f3558f
            int r8 = r8 + 1
            r9 = r6
        L_0x0112:
            if (r8 >= 0) goto L_0x017a
            int r11 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x0140
            if (r8 <= r3) goto L_0x0140
            if (r7 != 0) goto L_0x011d
            goto L_0x017a
        L_0x011d:
            int r11 = r7.f3585b
            if (r8 != r11) goto L_0x0177
            boolean r11 = r7.f3586c
            if (r11 != 0) goto L_0x0177
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            r7.remove(r9)
            l3.a r7 = r14.f3556e
            r7.a()
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            int r7 = r7.size()
            if (r9 >= r7) goto L_0x0176
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            java.lang.Object r7 = r7.get(r9)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.f) r7
            goto L_0x0177
        L_0x0140:
            if (r7 == 0) goto L_0x015c
            int r11 = r7.f3585b
            if (r8 != r11) goto L_0x015c
            float r7 = r7.f3587d
            float r1 = r1 + r7
            int r9 = r9 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            int r7 = r7.size()
            if (r9 >= r7) goto L_0x0176
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            java.lang.Object r7 = r7.get(r9)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.f) r7
            goto L_0x0177
        L_0x015c:
            androidx.viewpager.widget.ViewPager$f r7 = r14.a(r8, r9)
            int r9 = r9 + 1
            float r7 = r7.f3587d
            float r1 = r1 + r7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            int r7 = r7.size()
            if (r9 >= r7) goto L_0x0176
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            java.lang.Object r7 = r7.get(r9)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.f) r7
            goto L_0x0177
        L_0x0176:
            r7 = 0
        L_0x0177:
            int r8 = r8 + 1
            goto L_0x0112
        L_0x017a:
            l3.a r1 = r14.f3556e
            r1.c()
            int r1 = r14.getClientWidth()
            if (r1 <= 0) goto L_0x018b
            int r3 = r14.f3564s
            float r3 = (float) r3
            float r1 = (float) r1
            float r3 = r3 / r1
            goto L_0x018c
        L_0x018b:
            r3 = r5
        L_0x018c:
            if (r0 == 0) goto L_0x0220
            int r1 = r0.f3585b
            int r7 = r4.f3585b
            if (r1 >= r7) goto L_0x01df
            float r7 = r0.f3588e
            float r0 = r0.f3587d
            float r7 = r7 + r0
            float r7 = r7 + r3
            r0 = 0
        L_0x019b:
            int r1 = r1 + 1
            int r8 = r4.f3585b
            if (r1 > r8) goto L_0x0220
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r14.f3550b
            int r8 = r8.size()
            if (r0 >= r8) goto L_0x0220
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r14.f3550b
            java.lang.Object r8 = r8.get(r0)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
        L_0x01b1:
            int r9 = r8.f3585b
            if (r1 <= r9) goto L_0x01c9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r9 = r14.f3550b
            int r9 = r9.size()
            int r9 = r9 + r15
            if (r0 >= r9) goto L_0x01c9
            int r0 = r0 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r14.f3550b
            java.lang.Object r8 = r8.get(r0)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
            goto L_0x01b1
        L_0x01c9:
            int r9 = r8.f3585b
            if (r1 >= r9) goto L_0x01d8
            l3.a r9 = r14.f3556e
            float r9 = r9.f()
            float r9 = r9 + r3
            float r7 = r7 + r9
            int r1 = r1 + 1
            goto L_0x01c9
        L_0x01d8:
            r8.f3588e = r7
            float r8 = r8.f3587d
            float r8 = r8 + r3
            float r7 = r7 + r8
            goto L_0x019b
        L_0x01df:
            if (r1 <= r7) goto L_0x0220
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            int r7 = r7.size()
            int r7 = r7 + r15
            float r0 = r0.f3588e
        L_0x01ea:
            int r1 = r1 + r15
            int r8 = r4.f3585b
            if (r1 < r8) goto L_0x0220
            if (r7 < 0) goto L_0x0220
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r14.f3550b
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
        L_0x01f9:
            int r9 = r8.f3585b
            if (r1 >= r9) goto L_0x020a
            if (r7 <= 0) goto L_0x020a
            int r7 = r7 + -1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r14.f3550b
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
            goto L_0x01f9
        L_0x020a:
            int r9 = r8.f3585b
            if (r1 <= r9) goto L_0x0219
            l3.a r9 = r14.f3556e
            float r9 = r9.f()
            float r9 = r9 + r3
            float r0 = r0 - r9
            int r1 = r1 + -1
            goto L_0x020a
        L_0x0219:
            float r9 = r8.f3587d
            float r9 = r9 + r3
            float r0 = r0 - r9
            r8.f3588e = r0
            goto L_0x01ea
        L_0x0220:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r0 = r14.f3550b
            int r0 = r0.size()
            float r1 = r4.f3588e
            int r7 = r4.f3585b
            int r8 = r7 + -1
            if (r7 != 0) goto L_0x0230
            r9 = r1
            goto L_0x0233
        L_0x0230:
            r9 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0233:
            r14.f3568w = r9
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r15) goto L_0x023e
            float r7 = r4.f3587d
            float r7 = r7 + r1
            float r7 = r7 - r9
            goto L_0x0241
        L_0x023e:
            r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0241:
            r14.f3569x = r7
            int r2 = r2 + r15
        L_0x0244:
            if (r2 < 0) goto L_0x026c
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.f3550b
            java.lang.Object r7 = r7.get(r2)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.f) r7
        L_0x024e:
            int r10 = r7.f3585b
            if (r8 <= r10) goto L_0x025d
            l3.a r10 = r14.f3556e
            int r8 = r8 + -1
            float r10 = r10.f()
            float r10 = r10 + r3
            float r1 = r1 - r10
            goto L_0x024e
        L_0x025d:
            float r11 = r7.f3587d
            float r11 = r11 + r3
            float r1 = r1 - r11
            r7.f3588e = r1
            if (r10 != 0) goto L_0x0267
            r14.f3568w = r1
        L_0x0267:
            int r2 = r2 + -1
            int r8 = r8 + -1
            goto L_0x0244
        L_0x026c:
            float r1 = r4.f3588e
            float r2 = r4.f3587d
            float r1 = r1 + r2
            float r1 = r1 + r3
            int r2 = r4.f3585b
        L_0x0274:
            int r2 = r2 + 1
            if (r6 >= r0) goto L_0x02a0
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r4 = r14.f3550b
            java.lang.Object r4 = r4.get(r6)
            androidx.viewpager.widget.ViewPager$f r4 = (androidx.viewpager.widget.ViewPager.f) r4
        L_0x0280:
            int r7 = r4.f3585b
            if (r2 >= r7) goto L_0x028f
            l3.a r7 = r14.f3556e
            int r2 = r2 + 1
            float r7 = r7.f()
            float r7 = r7 + r3
            float r1 = r1 + r7
            goto L_0x0280
        L_0x028f:
            if (r7 != r15) goto L_0x0297
            float r7 = r4.f3587d
            float r7 = r7 + r1
            float r7 = r7 - r9
            r14.f3569x = r7
        L_0x0297:
            r4.f3588e = r1
            float r4 = r4.f3587d
            float r4 = r4 + r3
            float r1 = r1 + r4
            int r6 = r6 + 1
            goto L_0x0274
        L_0x02a0:
            l3.a r15 = r14.f3556e
            r15.l()
        L_0x02a5:
            l3.a r15 = r14.f3556e
            r15.b()
            int r15 = r14.getChildCount()
            r0 = 0
        L_0x02af:
            if (r0 >= r15) goto L_0x02d8
            android.view.View r1 = r14.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r2 = (androidx.viewpager.widget.ViewPager.LayoutParams) r2
            r2.f3577f = r0
            boolean r3 = r2.f3572a
            if (r3 != 0) goto L_0x02d5
            float r3 = r2.f3574c
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x02d5
            androidx.viewpager.widget.ViewPager$f r1 = r14.h(r1)
            if (r1 == 0) goto L_0x02d5
            float r3 = r1.f3587d
            r2.f3574c = r3
            int r1 = r1.f3585b
            r2.f3576e = r1
        L_0x02d5:
            int r0 = r0 + 1
            goto L_0x02af
        L_0x02d8:
            r14.w()
            boolean r15 = r14.hasFocus()
            if (r15 == 0) goto L_0x0328
            android.view.View r15 = r14.findFocus()
            if (r15 == 0) goto L_0x02fd
        L_0x02e7:
            android.view.ViewParent r0 = r15.getParent()
            if (r0 == r14) goto L_0x02f8
            if (r0 == 0) goto L_0x02fd
            boolean r15 = r0 instanceof android.view.View
            if (r15 != 0) goto L_0x02f4
            goto L_0x02fd
        L_0x02f4:
            r15 = r0
            android.view.View r15 = (android.view.View) r15
            goto L_0x02e7
        L_0x02f8:
            androidx.viewpager.widget.ViewPager$f r15 = r14.h(r15)
            goto L_0x02fe
        L_0x02fd:
            r15 = 0
        L_0x02fe:
            if (r15 == 0) goto L_0x0306
            int r15 = r15.f3585b
            int r0 = r14.f3558f
            if (r15 == r0) goto L_0x0328
        L_0x0306:
            r15 = 0
        L_0x0307:
            int r0 = r14.getChildCount()
            if (r15 >= r0) goto L_0x0328
            android.view.View r0 = r14.getChildAt(r15)
            androidx.viewpager.widget.ViewPager$f r1 = r14.h(r0)
            if (r1 == 0) goto L_0x0325
            int r1 = r1.f3585b
            int r2 = r14.f3558f
            if (r1 != r2) goto L_0x0325
            r1 = 2
            boolean r0 = r0.requestFocus(r1)
            if (r0 == 0) goto L_0x0325
            goto L_0x0328
        L_0x0325:
            int r15 = r15 + 1
            goto L_0x0307
        L_0x0328:
            return
        L_0x0329:
            android.content.res.Resources r15 = r14.getResources()     // Catch:{ NotFoundException -> 0x0336 }
            int r0 = r14.getId()     // Catch:{ NotFoundException -> 0x0336 }
            java.lang.String r15 = r15.getResourceName(r0)     // Catch:{ NotFoundException -> 0x0336 }
            goto L_0x033e
        L_0x0336:
            int r15 = r14.getId()
            java.lang.String r15 = java.lang.Integer.toHexString(r15)
        L_0x033e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            int r2 = r14.f3548a
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r2 = 0
            r1.append(r2)
            java.lang.String r2 = " Pager id: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = " Pager class: "
            r1.append(r15)
            java.lang.Class r15 = r14.getClass()
            r1.append(r15)
            java.lang.String r15 = " Problematic adapter: "
            r1.append(r15)
            l3.a r15 = r14.f3556e
            java.lang.Class r15 = r15.getClass()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int):void");
    }

    public final void removeView(View view) {
        if (this.f3571z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i10, int i11, int i12, int i13) {
        float f10;
        if (i11 <= 0 || this.f3550b.isEmpty()) {
            f j10 = j(this.f3558f);
            if (j10 != null) {
                f10 = Math.min(j10.f3588e, this.f3569x);
            } else {
                f10 = 0.0f;
            }
            int paddingLeft = (int) (f10 * ((float) ((i10 - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                d(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.f3561p.isFinished()) {
            this.f3561p.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i11 - getPaddingLeft()) - getPaddingRight()) + i13))) * ((float) (((i10 - getPaddingLeft()) - getPaddingRight()) + i12))), getScrollY());
        }
    }

    public void setAdapter(l3.a aVar) {
        l3.a aVar2 = this.f3556e;
        if (aVar2 != null) {
            aVar2.m((DataSetObserver) null);
            this.f3556e.n();
            for (int i10 = 0; i10 < this.f3550b.size(); i10++) {
                l3.a aVar3 = this.f3556e;
                int i11 = this.f3550b.get(i10).f3585b;
                aVar3.a();
            }
            this.f3556e.b();
            this.f3550b.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i12).getLayoutParams()).f3572a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
            }
            this.f3558f = 0;
            scrollTo(0, 0);
        }
        l3.a aVar4 = this.f3556e;
        this.f3556e = aVar;
        this.f3548a = 0;
        if (aVar != null) {
            if (this.f3563r == null) {
                this.f3563r = new k();
            }
            this.f3556e.m(this.f3563r);
            this.B = false;
            boolean z10 = this.Q;
            this.Q = true;
            this.f3556e.c();
            this.f3548a = 0;
            if (this.f3559n >= 0) {
                this.f3556e.j();
                v(this.f3559n, 0, false, true);
                this.f3559n = -1;
                this.f3560o = null;
            } else if (!z10) {
                q();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList = this.W;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.W.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((h) this.W.get(i13)).d(this, aVar4, aVar);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.B = false;
        v(i10, 0, !this.Q, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        if (i10 != this.C) {
            this.C = i10;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.U = iVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f3564s;
        this.f3564s = i10;
        int width = getWidth();
        s(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3565t = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z10, j jVar) {
        setPageTransformer(z10, jVar, 2);
    }

    public void setScrollState(int i10) {
        if (this.f3557e0 != i10) {
            this.f3557e0 = i10;
            i iVar = this.U;
            if (iVar != null) {
                iVar.b(i10);
            }
            ArrayList arrayList = this.T;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar2 = (i) this.T.get(i11);
                    if (iVar2 != null) {
                        iVar2.b(i10);
                    }
                }
            }
            i iVar3 = this.V;
            if (iVar3 != null) {
                iVar3.b(i10);
            }
        }
    }

    public final boolean t() {
        this.L = -1;
        this.D = false;
        this.E = false;
        VelocityTracker velocityTracker = this.M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.M = null;
        }
        this.O.onRelease();
        this.P.onRelease();
        if (this.O.isFinished() || this.P.isFinished()) {
            return true;
        }
        return false;
    }

    public final void u(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        int i13;
        int i14;
        f j10 = j(i10);
        if (j10 != null) {
            i12 = (int) (Math.max(this.f3568w, Math.min(j10.f3588e, this.f3569x)) * ((float) getClientWidth()));
        } else {
            i12 = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f3561p;
                if (scroller == null || scroller.isFinished()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    if (this.f3562q) {
                        i13 = this.f3561p.getCurrX();
                    } else {
                        i13 = this.f3561p.getStartX();
                    }
                    this.f3561p.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    i13 = getScrollX();
                }
                int i15 = i13;
                int scrollY = getScrollY();
                int i16 = i12 - i15;
                int i17 = 0 - scrollY;
                if (i16 == 0 && i17 == 0) {
                    d(false);
                    q();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i18 = clientWidth / 2;
                    float f10 = (float) clientWidth;
                    float f11 = (float) i18;
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i16)) * 1.0f) / f10) - 0.5f) * 0.47123894f))) * f11) + f11;
                    int abs = Math.abs(i11);
                    if (abs > 0) {
                        i14 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        i14 = (int) (((((float) Math.abs(i16)) / ((this.f3556e.f() * f10) + ((float) this.f3564s))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(i14, 600);
                    this.f3562q = false;
                    this.f3561p.startScroll(i15, scrollY, i16, i17, min);
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.d.k(this);
                }
            }
            if (z11) {
                f(i10);
                return;
            }
            return;
        }
        if (z11) {
            f(i10);
        }
        d(false);
        scrollTo(i12, 0);
        o(i12);
    }

    public final void v(int i10, int i11, boolean z10, boolean z11) {
        l3.a aVar = this.f3556e;
        if (aVar != null) {
            aVar.c();
        }
        setScrollingCacheEnabled(false);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f3565t) {
            return true;
        }
        return false;
    }

    public final void w() {
        if (this.f3551b0 != 0) {
            ArrayList<View> arrayList = this.f3553c0;
            if (arrayList == null) {
                this.f3553c0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f3553c0.add(getChildAt(i10));
            }
            Collections.sort(this.f3553c0, f3547i0);
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3572a;

        /* renamed from: b  reason: collision with root package name */
        public int f3573b;

        /* renamed from: c  reason: collision with root package name */
        public float f3574c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3575d;

        /* renamed from: e  reason: collision with root package name */
        public int f3576e;

        /* renamed from: f  reason: collision with root package name */
        public int f3577f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f3544f0);
            this.f3573b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z10, j jVar, int i10) {
        int i11 = 1;
        boolean z11 = jVar != null;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            if (z10) {
                i11 = 2;
            }
            this.f3551b0 = i11;
            this.f3549a0 = i10;
        } else {
            this.f3551b0 = 0;
        }
        if (z11) {
            q();
        }
    }

    public void setCurrentItem(int i10, boolean z10) {
        this.B = false;
        v(i10, 0, z10, false);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(k1.a.getDrawable(getContext(), i10));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k();
    }
}
