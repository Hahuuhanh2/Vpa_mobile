package androidx.slidingpanelayout.widget;

import al.a0;
import al.e0;
import al.x1;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import androidx.slidingpanelayout.widget.a;
import androidx.window.layout.g;
import c2.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import p3.l0;
import sk.j;
import w1.d0;
import w1.q0;
import w1.w0;

public class SlidingPaneLayout extends ViewGroup {
    public static boolean F;
    public final ArrayList<c> A;
    public int B;
    public g C;
    public a D;
    public a E;

    /* renamed from: a  reason: collision with root package name */
    public int f3322a;

    /* renamed from: b  reason: collision with root package name */
    public int f3323b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f3324c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f3325d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3326e;

    /* renamed from: f  reason: collision with root package name */
    public View f3327f;

    /* renamed from: n  reason: collision with root package name */
    public float f3328n;

    /* renamed from: o  reason: collision with root package name */
    public float f3329o;

    /* renamed from: p  reason: collision with root package name */
    public int f3330p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3331q;

    /* renamed from: r  reason: collision with root package name */
    public int f3332r;

    /* renamed from: s  reason: collision with root package name */
    public float f3333s;

    /* renamed from: t  reason: collision with root package name */
    public float f3334t;

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList f3335u;

    /* renamed from: v  reason: collision with root package name */
    public e f3336v;

    /* renamed from: w  reason: collision with root package name */
    public final c2.c f3337w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3338x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3339y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f3340z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f3345c;

        /* renamed from: d  reason: collision with root package name */
        public int f3346d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeInt(this.f3345c ? 1 : 0);
            parcel.writeInt(this.f3346d);
        }

        public SavedState(Parcel parcel) {
            super(parcel, (ClassLoader) null);
            this.f3345c = parcel.readInt() != 0;
            this.f3346d = parcel.readInt();
        }
    }

    public class a implements a.C0031a {
        public a() {
        }
    }

    public class b extends w1.a {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f3348d = new Rect();

        public b() {
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        public final void d(View view, x1.f fVar) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(fVar.f16862a);
            this.f16280a.onInitializeAccessibilityNodeInfo(view, obtain);
            Rect rect = this.f3348d;
            obtain.getBoundsInScreen(rect);
            fVar.f16862a.setBoundsInScreen(rect);
            fVar.f16862a.setVisibleToUser(obtain.isVisibleToUser());
            fVar.f16862a.setPackageName(obtain.getPackageName());
            fVar.i(obtain.getClassName());
            fVar.k(obtain.getContentDescription());
            fVar.f16862a.setEnabled(obtain.isEnabled());
            fVar.f16862a.setClickable(obtain.isClickable());
            fVar.f16862a.setFocusable(obtain.isFocusable());
            fVar.f16862a.setFocused(obtain.isFocused());
            fVar.f16862a.setAccessibilityFocused(obtain.isAccessibilityFocused());
            fVar.f16862a.setSelected(obtain.isSelected());
            fVar.f16862a.setLongClickable(obtain.isLongClickable());
            fVar.a(obtain.getActions());
            fVar.f16862a.setMovementGranularities(obtain.getMovementGranularities());
            fVar.i("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            fVar.f16864c = -1;
            fVar.f16862a.setSource(view);
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            ViewParent f10 = d0.d.f(view);
            if (f10 instanceof View) {
                fVar.f16863b = -1;
                fVar.f16862a.setParent((View) f10);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i10);
                if (!SlidingPaneLayout.this.a(childAt) && childAt.getVisibility() == 0) {
                    d0.d.s(childAt, 1);
                    fVar.f16862a.addChild(childAt);
                }
            }
        }

        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!SlidingPaneLayout.this.a(view)) {
                return super.f(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public class c implements Runnable {
        public final void run() {
            throw null;
        }
    }

    public class d extends c.C0048c {
        public d() {
        }

        public final int a(View view, int i10) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f3327f.getLayoutParams();
            if (SlidingPaneLayout.this.b()) {
                int width = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.f3327f.getWidth() + (SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin));
                return Math.max(Math.min(i10, width), width - SlidingPaneLayout.this.f3330p);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i10, paddingLeft), SlidingPaneLayout.this.f3330p + paddingLeft);
        }

        public final int b(View view, int i10) {
            return view.getTop();
        }

        public final int c(View view) {
            return SlidingPaneLayout.this.f3330p;
        }

        public final void e(int i10, int i11) {
            if (l()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f3337w.c(i11, slidingPaneLayout.f3327f);
            }
        }

        public final void f(int i10) {
            if (l()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f3337w.c(i10, slidingPaneLayout.f3327f);
            }
        }

        public final void g(int i10, View view) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = slidingPaneLayout.getChildAt(i11);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
        }

        public final void h(int i10) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f3337w.f4530a != 0) {
                return;
            }
            if (slidingPaneLayout.f3328n == 1.0f) {
                slidingPaneLayout.f(slidingPaneLayout.f3327f);
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                View view = slidingPaneLayout2.f3327f;
                Iterator it = slidingPaneLayout2.f3335u.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a();
                }
                slidingPaneLayout2.sendAccessibilityEvent(32);
                SlidingPaneLayout.this.f3338x = false;
                return;
            }
            Iterator it2 = slidingPaneLayout.f3335u.iterator();
            while (it2.hasNext()) {
                ((e) it2.next()).b();
            }
            slidingPaneLayout.sendAccessibilityEvent(32);
            SlidingPaneLayout.this.f3338x = true;
        }

        public final void i(View view, int i10, int i11) {
            int i12;
            int i13;
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f3327f == null) {
                slidingPaneLayout.f3328n = 0.0f;
            } else {
                boolean b10 = slidingPaneLayout.b();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f3327f.getLayoutParams();
                int width = slidingPaneLayout.f3327f.getWidth();
                if (b10) {
                    i10 = (slidingPaneLayout.getWidth() - i10) - width;
                }
                if (b10) {
                    i12 = slidingPaneLayout.getPaddingRight();
                } else {
                    i12 = slidingPaneLayout.getPaddingLeft();
                }
                if (b10) {
                    i13 = layoutParams.rightMargin;
                } else {
                    i13 = layoutParams.leftMargin;
                }
                float f10 = ((float) (i10 - (i12 + i13))) / ((float) slidingPaneLayout.f3330p);
                slidingPaneLayout.f3328n = f10;
                if (slidingPaneLayout.f3332r != 0) {
                    slidingPaneLayout.d(f10);
                }
                Iterator it = slidingPaneLayout.f3335u.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c();
                }
            }
            SlidingPaneLayout.this.invalidate();
        }

        public final void j(View view, float f10, float f11) {
            int i10;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.b()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f10 < 0.0f || (f10 == 0.0f && SlidingPaneLayout.this.f3328n > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f3330p;
                }
                i10 = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f3327f.getWidth();
            } else {
                i10 = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i11 > 0 || (i11 == 0 && SlidingPaneLayout.this.f3328n > 0.5f)) {
                    i10 += SlidingPaneLayout.this.f3330p;
                }
            }
            SlidingPaneLayout.this.f3337w.s(i10, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        public final boolean k(int i10, View view) {
            if (!l()) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f3343b;
        }

        public final boolean l() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f3331q || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.c() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            if (SlidingPaneLayout.this.c() || SlidingPaneLayout.this.getLockMode() != 2) {
                return true;
            }
            return false;
        }
    }

    public interface e {
        void a();

        void b();

        void c();
    }

    public static class f extends FrameLayout {
        public f(View view) {
            super(view.getContext());
            addView(view);
        }

        public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        F = z10;
    }

    public SlidingPaneLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private n1.e getSystemGestureInsets() {
        if (F) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            w0 a10 = d0.j.a(this);
            if (a10 != null) {
                return a10.f16391a.i();
            }
        }
        return null;
    }

    private void setFoldingFeatureObserver(a aVar) {
        this.E = aVar;
        a aVar2 = this.D;
        aVar.getClass();
        j.f(aVar2, "onFoldingFeatureChangeListener");
        aVar.f3354d = aVar2;
    }

    public final boolean a(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f3326e || !layoutParams.f3344c || this.f3328n <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new f(view), i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public final boolean b() {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.d(this) == 1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (!this.f3326e || this.f3328n == 0.0f) {
            return true;
        }
        return false;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final void computeScroll() {
        if (!this.f3337w.h()) {
            return;
        }
        if (!this.f3326e) {
            this.f3337w.a();
            return;
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.k(this);
    }

    public final void d(float f10) {
        boolean b10 = b();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f3327f) {
                int i11 = this.f3332r;
                this.f3329o = f10;
                int i12 = ((int) ((1.0f - this.f3329o) * ((float) i11))) - ((int) ((1.0f - f10) * ((float) i11)));
                if (b10) {
                    i12 = -i12;
                }
                childAt.offsetLeftAndRight(i12);
            }
        }
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i10;
        int i11;
        super.draw(canvas);
        if (b()) {
            drawable = this.f3325d;
        } else {
            drawable = this.f3324c;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (b()) {
                i11 = view.getRight();
                i10 = intrinsicWidth + i11;
            } else {
                int left = view.getLeft();
                int i12 = left - intrinsicWidth;
                i10 = left;
                i11 = i12;
            }
            drawable.setBounds(i11, top, i10, bottom);
            drawable.draw(canvas);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (b() ^ c()) {
            this.f3337w.f4546q = 1;
            n1.e systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                c2.c cVar = this.f3337w;
                cVar.f4544o = Math.max(cVar.f4545p, systemGestureInsets.f13427a);
            }
        } else {
            this.f3337w.f4546q = 2;
            n1.e systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                c2.c cVar2 = this.f3337w;
                cVar2.f4544o = Math.max(cVar2.f4545p, systemGestureInsets2.f13429c);
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f3326e && !layoutParams.f3343b && this.f3327f != null) {
            canvas.getClipBounds(this.f3340z);
            if (b()) {
                Rect rect = this.f3340z;
                rect.left = Math.max(rect.left, this.f3327f.getRight());
            } else {
                Rect rect2 = this.f3340z;
                rect2.right = Math.min(rect2.right, this.f3327f.getLeft());
            }
            canvas.clipRect(this.f3340z);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final boolean e(float f10) {
        int i10;
        if (!this.f3326e) {
            return false;
        }
        boolean b10 = b();
        LayoutParams layoutParams = (LayoutParams) this.f3327f.getLayoutParams();
        if (b10) {
            i10 = (int) (((float) getWidth()) - (((f10 * ((float) this.f3330p)) + ((float) (getPaddingRight() + layoutParams.rightMargin))) + ((float) this.f3327f.getWidth())));
        } else {
            i10 = (int) ((f10 * ((float) this.f3330p)) + ((float) (getPaddingLeft() + layoutParams.leftMargin)));
        }
        c2.c cVar = this.f3337w;
        View view = this.f3327f;
        if (!cVar.u(view, i10, view.getTop())) {
            return false;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.k(this);
        return true;
    }

    public final void f(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View childAt;
        boolean z10;
        int i16;
        int i17;
        int i18;
        View view2 = view;
        boolean b10 = b();
        if (b10) {
            i10 = getWidth() - getPaddingRight();
        } else {
            i10 = getPaddingLeft();
        }
        if (b10) {
            i11 = getPaddingLeft();
        } else {
            i11 = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            i15 = 0;
            i14 = 0;
            i13 = 0;
            i12 = 0;
        } else {
            i15 = view.getLeft();
            i14 = view.getRight();
            i13 = view.getTop();
            i12 = view.getBottom();
        }
        int childCount = getChildCount();
        int i19 = 0;
        while (true) {
            if (i19 < childCount && (childAt = getChildAt(i19)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z10 = b10;
                } else {
                    if (b10) {
                        i16 = i11;
                    } else {
                        i16 = i10;
                    }
                    int max = Math.max(i16, childAt.getLeft());
                    int max2 = Math.max(paddingTop, childAt.getTop());
                    z10 = b10;
                    if (b10) {
                        i17 = i10;
                    } else {
                        i17 = i11;
                    }
                    int min = Math.min(i17, childAt.getRight());
                    int min2 = Math.min(height, childAt.getBottom());
                    if (max < i15 || max2 < i13 || min > i14 || min2 > i12) {
                        i18 = 0;
                    } else {
                        i18 = 4;
                    }
                    childAt.setVisibility(i18);
                }
                i19++;
                view2 = view;
                b10 = z10;
            } else {
                return;
            }
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.f3323b;
    }

    public final int getLockMode() {
        return this.B;
    }

    public int getParallaxDistance() {
        return this.f3332r;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.f3322a;
    }

    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f3339y = true;
        if (this.E != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                a aVar = this.E;
                aVar.getClass();
                x1 x1Var = aVar.f3353c;
                if (x1Var != null) {
                    x1Var.cancel((CancellationException) null);
                }
                aVar.f3353c = l0.j0(e0.a(l0.U(aVar.f3352b)), (a0) null, new b(aVar, activity, (ik.d<? super b>) null), 3);
            }
        }
    }

    public final void onDetachedFromWindow() {
        x1 x1Var;
        super.onDetachedFromWindow();
        this.f3339y = true;
        a aVar = this.E;
        if (!(aVar == null || (x1Var = aVar.f3353c) == null)) {
            x1Var.cancel((CancellationException) null);
        }
        if (this.A.size() <= 0) {
            this.A.clear();
        } else {
            this.A.get(0).getClass();
            throw null;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f3326e && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f3337w.getClass();
            this.f3338x = c2.c.l(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f3326e || (this.f3331q && actionMasked != 0)) {
            this.f3337w.b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f3337w.b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f3331q = false;
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                this.f3333s = x10;
                this.f3334t = y10;
                this.f3337w.getClass();
                if (c2.c.l(this.f3327f, (int) x10, (int) y10) && a(this.f3327f)) {
                    z10 = true;
                    if (this.f3337w.t(motionEvent) && !z10) {
                        return false;
                    }
                }
            } else if (actionMasked == 2) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                float abs = Math.abs(x11 - this.f3333s);
                float abs2 = Math.abs(y11 - this.f3334t);
                c2.c cVar = this.f3337w;
                if (abs > ((float) cVar.f4531b) && abs2 > abs) {
                    cVar.b();
                    this.f3331q = true;
                    return false;
                }
            }
            z10 = false;
            return this.f3337w.t(motionEvent) ? true : true;
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z11;
        float f10;
        boolean b10 = b();
        int i23 = i12 - i10;
        if (b10) {
            i14 = getPaddingRight();
        } else {
            i14 = getPaddingLeft();
        }
        if (b10) {
            i15 = getPaddingLeft();
        } else {
            i15 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f3339y) {
            if (!this.f3326e || !this.f3338x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f3328n = f10;
        }
        int i24 = i14;
        int i25 = 0;
        while (i25 < childCount) {
            View childAt = getChildAt(i25);
            if (childAt.getVisibility() == 8) {
                i16 = i24;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f3343b) {
                    int i26 = i23 - i15;
                    int min = (Math.min(i14, i26) - i24) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f3330p = min;
                    if (b10) {
                        i22 = layoutParams.rightMargin;
                    } else {
                        i22 = layoutParams.leftMargin;
                    }
                    if ((measuredWidth / 2) + i24 + i22 + min > i26) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    layoutParams.f3344c = z11;
                    int i27 = (int) (((float) min) * this.f3328n);
                    i16 = i22 + i27 + i24;
                    this.f3328n = ((float) i27) / ((float) min);
                    i17 = 0;
                } else if (!this.f3326e || (i21 = this.f3332r) == 0) {
                    i16 = i14;
                    i17 = 0;
                } else {
                    i17 = (int) ((1.0f - this.f3328n) * ((float) i21));
                    i16 = i14;
                }
                if (b10) {
                    i18 = (i23 - i16) + i17;
                    i19 = i18 - measuredWidth;
                } else {
                    i19 = i16 - i17;
                    i18 = i19 + measuredWidth;
                }
                childAt.layout(i19, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                g gVar = this.C;
                if (gVar == null || gVar.b() != g.a.f3676b || !this.C.a()) {
                    i20 = 0;
                } else {
                    i20 = this.C.getBounds().width();
                }
                i14 = Math.abs(i20) + childAt.getWidth() + i14;
            }
            i25++;
            i24 = i16;
        }
        if (this.f3339y) {
            if (this.f3326e && this.f3332r != 0) {
                d(this.f3328n);
            }
            f(this.f3327f);
        }
        this.f3339y = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x019c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            int r2 = android.view.View.MeasureSpec.getMode(r22)
            int r3 = android.view.View.MeasureSpec.getSize(r22)
            int r4 = android.view.View.MeasureSpec.getMode(r23)
            int r5 = android.view.View.MeasureSpec.getSize(r23)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 0
            if (r4 == r6) goto L_0x002b
            if (r4 == r7) goto L_0x001f
            r5 = r8
            goto L_0x0029
        L_0x001f:
            int r9 = r21.getPaddingTop()
            int r5 = r5 - r9
            int r9 = r21.getPaddingBottom()
            int r5 = r5 - r9
        L_0x0029:
            r9 = r5
            goto L_0x0037
        L_0x002b:
            int r9 = r21.getPaddingTop()
            int r5 = r5 - r9
            int r9 = r21.getPaddingBottom()
            int r5 = r5 - r9
            r9 = r5
            r5 = r8
        L_0x0037:
            int r10 = r21.getPaddingLeft()
            int r10 = r3 - r10
            int r11 = r21.getPaddingRight()
            int r10 = r10 - r11
            int r10 = java.lang.Math.max(r10, r8)
            int r11 = r21.getChildCount()
            r12 = 0
            r0.f3327f = r12
            r14 = r8
            r15 = r14
            r12 = r10
            r16 = 0
        L_0x0052:
            r6 = 8
            if (r14 >= r11) goto L_0x00e8
            android.view.View r7 = r0.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r17 = r7.getLayoutParams()
            r13 = r17
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r13 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r13
            r17 = r3
            int r3 = r7.getVisibility()
            if (r3 != r6) goto L_0x006e
            r13.f3344c = r8
            goto L_0x00df
        L_0x006e:
            float r3 = r13.f3342a
            r6 = 0
            int r19 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r19 <= 0) goto L_0x007d
            float r16 = r16 + r3
            int r3 = r13.width
            if (r3 != 0) goto L_0x007d
            goto L_0x00df
        L_0x007d:
            int r3 = r13.leftMargin
            int r6 = r13.rightMargin
            int r3 = r3 + r6
            int r3 = r10 - r3
            int r3 = java.lang.Math.max(r3, r8)
            int r6 = r13.width
            r8 = -2
            if (r6 != r8) goto L_0x0098
            if (r2 != 0) goto L_0x0091
            r6 = r2
            goto L_0x0093
        L_0x0091:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0093:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r6)
            goto L_0x00a7
        L_0x0098:
            r8 = -1
            if (r6 != r8) goto L_0x00a0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            goto L_0x00a7
        L_0x00a0:
            r3 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            r3 = r6
        L_0x00a7:
            int r6 = r21.getPaddingTop()
            int r8 = r21.getPaddingBottom()
            int r8 = r8 + r6
            int r6 = r13.height
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r1, r8, r6)
            r7.measure(r3, r6)
            int r3 = r7.getMeasuredWidth()
            int r6 = r7.getMeasuredHeight()
            if (r6 <= r5) goto L_0x00cf
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r8) goto L_0x00cc
            int r5 = java.lang.Math.min(r6, r9)
            goto L_0x00cf
        L_0x00cc:
            if (r4 != 0) goto L_0x00cf
            r5 = r6
        L_0x00cf:
            int r12 = r12 - r3
            if (r14 != 0) goto L_0x00d3
            goto L_0x00df
        L_0x00d3:
            if (r12 >= 0) goto L_0x00d7
            r3 = 1
            goto L_0x00d8
        L_0x00d7:
            r3 = 0
        L_0x00d8:
            r13.f3343b = r3
            r15 = r15 | r3
            if (r3 == 0) goto L_0x00df
            r0.f3327f = r7
        L_0x00df:
            int r14 = r14 + 1
            r3 = r17
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 0
            goto L_0x0052
        L_0x00e8:
            r17 = r3
            if (r15 != 0) goto L_0x00f1
            r2 = 0
            int r3 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a4
        L_0x00f1:
            r2 = 0
        L_0x00f2:
            if (r2 >= r11) goto L_0x01a4
            android.view.View r3 = r0.getChildAt(r2)
            int r7 = r3.getVisibility()
            if (r7 != r6) goto L_0x0104
            r20 = r12
            r18 = 0
            goto L_0x019c
        L_0x0104:
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r7 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r7
            int r8 = r7.width
            if (r8 != 0) goto L_0x0117
            float r8 = r7.f3342a
            r13 = 0
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0117
            r8 = 1
            goto L_0x0118
        L_0x0117:
            r8 = 0
        L_0x0118:
            if (r8 == 0) goto L_0x011c
            r8 = 0
            goto L_0x0120
        L_0x011c:
            int r8 = r3.getMeasuredWidth()
        L_0x0120:
            if (r15 == 0) goto L_0x0130
            int r13 = r7.leftMargin
            int r7 = r7.rightMargin
            int r13 = r13 + r7
            int r7 = r10 - r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r13)
            goto L_0x014d
        L_0x0130:
            float r13 = r7.f3342a
            r14 = 0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x014b
            r13 = 0
            int r14 = java.lang.Math.max(r13, r12)
            float r7 = r7.f3342a
            float r13 = (float) r14
            float r7 = r7 * r13
            float r7 = r7 / r16
            int r7 = (int) r7
            int r7 = r7 + r8
            r13 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r13)
            goto L_0x014d
        L_0x014b:
            r7 = r8
            r14 = 0
        L_0x014d:
            int r13 = r21.getPaddingTop()
            int r20 = r21.getPaddingBottom()
            int r13 = r20 + r13
            android.view.ViewGroup$LayoutParams r20 = r3.getLayoutParams()
            r6 = r20
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r6 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r6
            r20 = r12
            int r12 = r6.width
            if (r12 != 0) goto L_0x016f
            float r12 = r6.f3342a
            r18 = 0
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 <= 0) goto L_0x0171
            r12 = 1
            goto L_0x0172
        L_0x016f:
            r18 = 0
        L_0x0171:
            r12 = 0
        L_0x0172:
            if (r12 == 0) goto L_0x017b
            int r6 = r6.height
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r1, r13, r6)
            goto L_0x0185
        L_0x017b:
            int r6 = r3.getMeasuredHeight()
            r12 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r12)
        L_0x0185:
            if (r8 == r7) goto L_0x019c
            r3.measure(r14, r6)
            int r3 = r3.getMeasuredHeight()
            if (r3 <= r5) goto L_0x019c
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r6) goto L_0x0199
            int r3 = java.lang.Math.min(r3, r9)
            goto L_0x019b
        L_0x0199:
            if (r4 != 0) goto L_0x019c
        L_0x019b:
            r5 = r3
        L_0x019c:
            int r2 = r2 + 1
            r12 = r20
            r6 = 8
            goto L_0x00f2
        L_0x01a4:
            androidx.window.layout.g r1 = r0.C
            if (r1 == 0) goto L_0x0263
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x01b0
            goto L_0x0263
        L_0x01b0:
            androidx.window.layout.g r1 = r0.C
            android.graphics.Rect r1 = r1.getBounds()
            int r1 = r1.left
            if (r1 != 0) goto L_0x01bc
            goto L_0x0263
        L_0x01bc:
            androidx.window.layout.g r1 = r0.C
            android.graphics.Rect r1 = r1.getBounds()
            int r1 = r1.top
            if (r1 != 0) goto L_0x0263
            androidx.window.layout.g r1 = r0.C
            r2 = 2
            int[] r3 = new int[r2]
            r0.getLocationInWindow(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            r6 = 0
            r7 = r3[r6]
            r6 = 1
            r8 = r3[r6]
            int r9 = r21.getWidth()
            int r9 = r9 + r7
            r12 = r3[r6]
            int r6 = r21.getWidth()
            int r6 = r6 + r12
            r4.<init>(r7, r8, r9, r6)
            android.graphics.Rect r6 = new android.graphics.Rect
            android.graphics.Rect r1 = r1.getBounds()
            r6.<init>(r1)
            boolean r1 = r6.intersect(r4)
            int r4 = r6.width()
            if (r4 != 0) goto L_0x01fe
            int r4 = r6.height()
            if (r4 == 0) goto L_0x0200
        L_0x01fe:
            if (r1 != 0) goto L_0x0202
        L_0x0200:
            r6 = 0
            goto L_0x020d
        L_0x0202:
            r1 = 0
            r4 = r3[r1]
            int r1 = -r4
            r4 = 1
            r3 = r3[r4]
            int r3 = -r3
            r6.offset(r1, r3)
        L_0x020d:
            if (r6 != 0) goto L_0x0210
            goto L_0x0263
        L_0x0210:
            android.graphics.Rect r1 = new android.graphics.Rect
            int r3 = r21.getPaddingLeft()
            int r4 = r21.getPaddingTop()
            int r7 = r21.getPaddingLeft()
            int r8 = r6.left
            int r7 = java.lang.Math.max(r7, r8)
            int r8 = r21.getHeight()
            int r9 = r21.getPaddingBottom()
            int r8 = r8 - r9
            r1.<init>(r3, r4, r7, r8)
            int r3 = r21.getWidth()
            int r4 = r21.getPaddingRight()
            int r3 = r3 - r4
            android.graphics.Rect r4 = new android.graphics.Rect
            int r6 = r6.right
            int r6 = java.lang.Math.min(r3, r6)
            int r7 = r21.getPaddingTop()
            int r8 = r21.getHeight()
            int r9 = r21.getPaddingBottom()
            int r8 = r8 - r9
            r4.<init>(r6, r7, r3, r8)
            java.util.ArrayList r12 = new java.util.ArrayList
            android.graphics.Rect[] r2 = new android.graphics.Rect[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            java.util.List r1 = java.util.Arrays.asList(r2)
            r12.<init>(r1)
            goto L_0x0264
        L_0x0263:
            r12 = 0
        L_0x0264:
            if (r12 == 0) goto L_0x0311
            if (r15 != 0) goto L_0x0311
            r13 = 0
        L_0x0269:
            if (r13 >= r11) goto L_0x0311
            android.view.View r1 = r0.getChildAt(r13)
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 != r3) goto L_0x027e
            r3 = 1073741824(0x40000000, float:2.0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 0
            goto L_0x0305
        L_0x027e:
            java.lang.Object r2 = r12.get(r13)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r4 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r4
            int r6 = r4.leftMargin
            int r7 = r4.rightMargin
            int r6 = r6 + r7
            int r7 = r1.getMeasuredHeight()
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            int r8 = r2.width()
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            r1.measure(r8, r7)
            int r8 = r1.getMeasuredWidthAndState()
            r14 = 16777216(0x1000000, float:2.3509887E-38)
            r8 = r8 & r14
            r14 = 1
            if (r8 == r14) goto L_0x02f7
            boolean r8 = r1 instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.f
            if (r8 == 0) goto L_0x02c3
            r14 = r1
            androidx.slidingpanelayout.widget.SlidingPaneLayout$f r14 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.f) r14
            r3 = 0
            android.view.View r14 = r14.getChildAt(r3)
            java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
            int r3 = w1.d0.d.e(r14)
            goto L_0x02c9
        L_0x02c3:
            java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
            int r3 = w1.d0.d.e(r1)
        L_0x02c9:
            if (r3 == 0) goto L_0x02e8
            int r3 = r2.width()
            if (r8 == 0) goto L_0x02de
            r8 = r1
            androidx.slidingpanelayout.widget.SlidingPaneLayout$f r8 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.f) r8
            r14 = 0
            android.view.View r8 = r8.getChildAt(r14)
            int r8 = w1.d0.d.e(r8)
            goto L_0x02e3
        L_0x02de:
            r14 = 0
            int r8 = w1.d0.d.e(r1)
        L_0x02e3:
            if (r3 >= r8) goto L_0x02e9
            r3 = 1073741824(0x40000000, float:2.0)
            goto L_0x02fa
        L_0x02e8:
            r14 = 0
        L_0x02e9:
            int r2 = r2.width()
            r3 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            r1.measure(r2, r7)
            goto L_0x0305
        L_0x02f7:
            r3 = 1073741824(0x40000000, float:2.0)
            r14 = 0
        L_0x02fa:
            int r2 = r10 - r6
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            r1.measure(r2, r7)
            if (r13 != 0) goto L_0x0307
        L_0x0305:
            r6 = 1
            goto L_0x030d
        L_0x0307:
            r6 = 1
            r4.f3343b = r6
            r0.f3327f = r1
            r15 = r6
        L_0x030d:
            int r13 = r13 + 1
            goto L_0x0269
        L_0x0311:
            int r1 = r21.getPaddingTop()
            int r1 = r1 + r5
            int r2 = r21.getPaddingBottom()
            int r2 = r2 + r1
            r1 = r17
            r0.setMeasuredDimension(r1, r2)
            r0.f3326e = r15
            c2.c r1 = r0.f3337w
            int r2 = r1.f4530a
            if (r2 == 0) goto L_0x032d
            if (r15 != 0) goto L_0x032d
            r1.a()
        L_0x032d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        if (savedState.f3345c) {
            if (!this.f3326e) {
                this.f3338x = true;
            }
            if (this.f3339y || e(0.0f)) {
                this.f3338x = true;
            }
        } else {
            if (!this.f3326e) {
                this.f3338x = false;
            }
            if (this.f3339y || e(1.0f)) {
                this.f3338x = false;
            }
        }
        this.f3338x = savedState.f3345c;
        setLockMode(savedState.f3346d);
    }

    public final Parcelable onSaveInstanceState() {
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f3326e) {
            z10 = c();
        } else {
            z10 = this.f3338x;
        }
        savedState.f3345c = z10;
        savedState.f3346d = this.B;
        return savedState;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.f3339y = true;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3326e) {
            return super.onTouchEvent(motionEvent);
        }
        this.f3337w.m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f3333s = x10;
            this.f3334t = y10;
        } else if (actionMasked == 1 && a(this.f3327f)) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float f10 = x11 - this.f3333s;
            float f11 = y11 - this.f3334t;
            int i10 = this.f3337w.f4531b;
            if ((f11 * f11) + (f10 * f10) < ((float) (i10 * i10)) && c2.c.l(this.f3327f, (int) x11, (int) y11)) {
                if (!this.f3326e) {
                    this.f3338x = false;
                }
                if (this.f3339y || e(1.0f)) {
                    this.f3338x = false;
                }
            }
        }
        return true;
    }

    public final void removeView(View view) {
        if (view.getParent() instanceof f) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    public final void requestChildFocus(View view, View view2) {
        boolean z10;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f3326e) {
            if (view == this.f3327f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f3338x = z10;
        }
    }

    @Deprecated
    public void setCoveredFadeColor(int i10) {
        this.f3323b = i10;
    }

    public final void setLockMode(int i10) {
        this.B = i10;
    }

    @Deprecated
    public void setPanelSlideListener(e eVar) {
        e eVar2 = this.f3336v;
        if (eVar2 != null) {
            this.f3335u.remove(eVar2);
        }
        if (eVar != null) {
            this.f3335u.add(eVar);
        }
        this.f3336v = eVar;
    }

    public void setParallaxDistance(int i10) {
        this.f3332r = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f3324c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f3325d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i10) {
        setShadowDrawableLeft(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        setShadowDrawableLeft(k1.a.getDrawable(getContext(), i10));
    }

    public void setShadowResourceRight(int i10) {
        setShadowDrawableRight(k1.a.getDrawable(getContext(), i10));
    }

    @Deprecated
    public void setSliderFadeColor(int i10) {
        this.f3322a = i10;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: d  reason: collision with root package name */
        public static final int[] f3341d = {16843137};

        /* renamed from: a  reason: collision with root package name */
        public float f3342a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3343b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3344c;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3341d);
            this.f3342a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(2:19|(1:21))|(2:23|(1:25))|26|27) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bf */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SlidingPaneLayout(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            r9 = 0
            r7.f3322a = r9
            r10 = 1065353216(0x3f800000, float:1.0)
            r7.f3328n = r10
            java.util.concurrent.CopyOnWriteArrayList r10 = new java.util.concurrent.CopyOnWriteArrayList
            r10.<init>()
            r7.f3335u = r10
            r10 = 1
            r7.f3339y = r10
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f3340z = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.A = r0
            androidx.slidingpanelayout.widget.SlidingPaneLayout$a r0 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$a
            r0.<init>()
            r7.D = r0
            android.content.res.Resources r0 = r8.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r7.setWillNotDraw(r9)
            androidx.slidingpanelayout.widget.SlidingPaneLayout$b r1 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$b
            r1.<init>()
            w1.d0.o(r7, r1)
            w1.d0.d.s(r7, r10)
            androidx.slidingpanelayout.widget.SlidingPaneLayout$d r1 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$d
            r1.<init>()
            r2 = 1056964608(0x3f000000, float:0.5)
            c2.c r1 = c2.c.i(r7, r2, r1)
            r7.f3337w = r1
            r2 = 1137180672(0x43c80000, float:400.0)
            float r0 = r0 * r2
            r1.f4543n = r0
            int r0 = androidx.window.layout.v.f3711a
            androidx.window.layout.w$a r0 = androidx.window.layout.w.f3712a
            r0.getClass()
            androidx.window.layout.y r0 = new androidx.window.layout.y
            androidx.window.layout.a0 r1 = androidx.window.layout.a0.f3667a
            r2 = 0
            androidx.window.layout.m r3 = androidx.window.layout.m.f3692a     // Catch:{ all -> 0x0071 }
            r3.getClass()     // Catch:{ all -> 0x0071 }
            androidx.window.extensions.layout.WindowLayoutComponent r3 = androidx.window.layout.m.c()     // Catch:{ all -> 0x0071 }
            if (r3 != 0) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            androidx.window.layout.e r4 = new androidx.window.layout.e     // Catch:{ all -> 0x0071 }
            r4.<init>(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0072
        L_0x0071:
            r4 = r2
        L_0x0072:
            if (r4 != 0) goto L_0x00d6
            androidx.window.layout.t r3 = androidx.window.layout.t.f3702c
            androidx.window.layout.t r3 = androidx.window.layout.t.f3702c
            if (r3 != 0) goto L_0x00d1
            java.util.concurrent.locks.ReentrantLock r3 = androidx.window.layout.t.f3703d
            r3.lock()
            androidx.window.layout.t r4 = androidx.window.layout.t.f3702c     // Catch:{ all -> 0x00cc }
            if (r4 != 0) goto L_0x00c6
            n3.f r4 = androidx.window.layout.SidecarCompat.a.c()     // Catch:{ all -> 0x00bf }
            if (r4 != 0) goto L_0x008a
            goto L_0x00b0
        L_0x008a:
            n3.f r5 = n3.f.f13491f     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = "other"
            sk.j.f(r5, r6)     // Catch:{ all -> 0x00bf }
            ek.g r4 = r4.f13496e     // Catch:{ all -> 0x00bf }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = "<get-bigInteger>(...)"
            sk.j.e(r4, r6)     // Catch:{ all -> 0x00bf }
            java.math.BigInteger r4 = (java.math.BigInteger) r4     // Catch:{ all -> 0x00bf }
            ek.g r5 = r5.f13496e     // Catch:{ all -> 0x00bf }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x00bf }
            sk.j.e(r5, r6)     // Catch:{ all -> 0x00bf }
            java.math.BigInteger r5 = (java.math.BigInteger) r5     // Catch:{ all -> 0x00bf }
            int r4 = r4.compareTo(r5)     // Catch:{ all -> 0x00bf }
            if (r4 < 0) goto L_0x00b0
            r9 = r10
        L_0x00b0:
            if (r9 == 0) goto L_0x00bf
            androidx.window.layout.SidecarCompat r9 = new androidx.window.layout.SidecarCompat     // Catch:{ all -> 0x00bf }
            r9.<init>(r8)     // Catch:{ all -> 0x00bf }
            boolean r10 = r9.j()     // Catch:{ all -> 0x00bf }
            if (r10 != 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r2 = r9
        L_0x00bf:
            androidx.window.layout.t r9 = new androidx.window.layout.t     // Catch:{ all -> 0x00cc }
            r9.<init>(r2)     // Catch:{ all -> 0x00cc }
            androidx.window.layout.t.f3702c = r9     // Catch:{ all -> 0x00cc }
        L_0x00c6:
            ek.i r9 = ek.i.f20112a     // Catch:{ all -> 0x00cc }
            r3.unlock()
            goto L_0x00d1
        L_0x00cc:
            r8 = move-exception
            r3.unlock()
            throw r8
        L_0x00d1:
            androidx.window.layout.t r4 = androidx.window.layout.t.f3702c
            sk.j.c(r4)
        L_0x00d6:
            r0.<init>(r1, r4)
            al.g0 r9 = androidx.window.layout.w.a.f3714b
            r9.getClass()
            java.util.concurrent.Executor r8 = k1.a.getMainExecutor(r8)
            androidx.slidingpanelayout.widget.a r9 = new androidx.slidingpanelayout.widget.a
            r9.<init>(r0, r8)
            r7.setFoldingFeatureObserver(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
