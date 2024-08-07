package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.R$attr;
import androidx.core.widget.d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v.v;
import w1.d0;
import w1.l;
import w1.m;
import w1.o;
import w1.p;
import w1.q0;
import x1.f;
import x1.h;

public class NestedScrollView extends FrameLayout implements o, l {
    public static final float H = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final a I = new a();
    public static final int[] J = {16843130};
    public final int[] A;
    public int B;
    public int C;
    public SavedState D;
    public final p E;
    public final m F;
    public float G;

    /* renamed from: a  reason: collision with root package name */
    public final float f2133a;

    /* renamed from: b  reason: collision with root package name */
    public long f2134b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2135c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f2136d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f2137e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f2138f;

    /* renamed from: n  reason: collision with root package name */
    public int f2139n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2140o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2141p;

    /* renamed from: q  reason: collision with root package name */
    public View f2142q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2143r;

    /* renamed from: s  reason: collision with root package name */
    public VelocityTracker f2144s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2145t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2146u;

    /* renamed from: v  reason: collision with root package name */
    public int f2147v;

    /* renamed from: w  reason: collision with root package name */
    public int f2148w;

    /* renamed from: x  reason: collision with root package name */
    public int f2149x;

    /* renamed from: y  reason: collision with root package name */
    public int f2150y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f2151z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2152a;

        public class a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("HorizontalScrollView.SavedState{");
            q10.append(Integer.toHexString(System.identityHashCode(this)));
            q10.append(" scrollPosition=");
            return v.e(q10, this.f2152a, "}");
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2152a);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2152a = parcel.readInt();
        }
    }

    public static class a extends w1.a {
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            h.c(accessibilityEvent, nestedScrollView.getScrollX());
            h.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public final void d(View view, f fVar) {
            int scrollRange;
            this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            fVar.i(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                fVar.m(true);
                if (nestedScrollView.getScrollY() > 0) {
                    fVar.b(f.a.f16869i);
                    fVar.b(f.a.f16873m);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    fVar.b(f.a.f16868h);
                    fVar.b(f.a.f16874n);
                }
            }
        }

        public final boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static boolean f(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !f((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.G == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.G = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.G;
    }

    public final boolean a(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !g(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f2135c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2135c);
            s(b(this.f2135c), 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && (!g(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final int b(Rect rect) {
        int i10;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i10 = i13 - verticalFadingEdgeLength;
        } else {
            i10 = i13;
        }
        int i14 = rect.bottom;
        if (i14 > i10 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i10;
            }
            return Math.min(i12 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        } else if (rect.top >= scrollY || i14 >= i10) {
            return 0;
        } else {
            if (rect.height() > height) {
                i11 = 0 - (i10 - rect.bottom);
            } else {
                i11 = 0 - (scrollY - rect.top);
            }
            return Math.max(i11, -getScrollY());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.graphics.Rect r0 = r5.f2135c
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L_0x0061
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L_0x0061
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L_0x004c
            r6 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r3)
            if (r6 == 0) goto L_0x005f
            if (r6 == r5) goto L_0x005f
            boolean r6 = r6.requestFocus(r3)
            if (r6 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x00c7
            int r0 = r6.getKeyCode()
            r1 = 19
            r4 = 33
            if (r0 == r1) goto L_0x00b8
            r1 = 20
            if (r0 == r1) goto L_0x00a8
            r1 = 62
            if (r0 == r1) goto L_0x009d
            r6 = 92
            if (r0 == r6) goto L_0x0098
            r6 = 93
            if (r0 == r6) goto L_0x0093
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L_0x008f
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L_0x008b
            goto L_0x00c7
        L_0x008b:
            r5.q(r3)
            goto L_0x00c7
        L_0x008f:
            r5.q(r4)
            goto L_0x00c7
        L_0x0093:
            boolean r2 = r5.e(r3)
            goto L_0x00c7
        L_0x0098:
            boolean r2 = r5.e(r4)
            goto L_0x00c7
        L_0x009d:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L_0x00a4
            r3 = r4
        L_0x00a4:
            r5.q(r3)
            goto L_0x00c7
        L_0x00a8:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L_0x00b3
            boolean r2 = r5.e(r3)
            goto L_0x00c7
        L_0x00b3:
            boolean r2 = r5.a(r3)
            goto L_0x00c7
        L_0x00b8:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L_0x00c3
            boolean r2 = r5.e(r4)
            goto L_0x00c7
        L_0x00c3:
            boolean r2 = r5.a(r4)
        L_0x00c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.c(android.view.KeyEvent):boolean");
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r18 = this;
            r0 = r18
            android.widget.OverScroller r1 = r0.f2136d
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            android.widget.OverScroller r1 = r0.f2136d
            r1.computeScrollOffset()
            android.widget.OverScroller r1 = r0.f2136d
            int r1 = r1.getCurrY()
            int r2 = r0.C
            int r2 = r1 - r2
            int r3 = r18.getHeight()
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r6 = 1082130432(0x40800000, float:4.0)
            if (r2 <= 0) goto L_0x004a
            android.widget.EdgeEffect r7 = r0.f2137e
            float r7 = androidx.core.widget.d.a(r7)
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x004a
            int r5 = -r2
            float r5 = (float) r5
            float r5 = r5 * r6
            float r7 = (float) r3
            float r5 = r5 / r7
            int r3 = -r3
            float r3 = (float) r3
            float r3 = r3 / r6
            android.widget.EdgeEffect r6 = r0.f2137e
            float r4 = androidx.core.widget.d.b(r6, r5, r4)
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            if (r3 == r2) goto L_0x006d
            android.widget.EdgeEffect r4 = r0.f2137e
            r4.finish()
            goto L_0x006d
        L_0x004a:
            if (r2 >= 0) goto L_0x006e
            android.widget.EdgeEffect r7 = r0.f2138f
            float r7 = androidx.core.widget.d.a(r7)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x006e
            float r5 = (float) r2
            float r5 = r5 * r6
            float r3 = (float) r3
            float r5 = r5 / r3
            float r3 = r3 / r6
            android.widget.EdgeEffect r6 = r0.f2138f
            float r4 = androidx.core.widget.d.b(r6, r5, r4)
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            if (r3 == r2) goto L_0x006d
            android.widget.EdgeEffect r4 = r0.f2138f
            r4.finish()
        L_0x006d:
            int r2 = r2 - r3
        L_0x006e:
            r0.C = r1
            int[] r7 = r0.A
            r1 = 0
            r9 = 1
            r7[r9] = r1
            r4 = 0
            r8 = 0
            r6 = 1
            w1.m r3 = r0.F
            r5 = r2
            r3.c(r4, r5, r6, r7, r8)
            int[] r3 = r0.A
            r3 = r3[r9]
            int r2 = r2 - r3
            int r3 = r18.getScrollRange()
            if (r2 == 0) goto L_0x00b3
            int r4 = r18.getScrollY()
            int r5 = r18.getScrollX()
            r0.p(r2, r5, r4, r3)
            int r5 = r18.getScrollY()
            int r12 = r5 - r4
            int r2 = r2 - r12
            int[] r4 = r0.A
            r4[r9] = r1
            int[] r15 = r0.f2151z
            r16 = 1
            w1.m r10 = r0.F
            r11 = 0
            r13 = 0
            r14 = r2
            r17 = r4
            r10.e(r11, r12, r13, r14, r15, r16, r17)
            int[] r4 = r0.A
            r4 = r4[r9]
            int r2 = r2 - r4
        L_0x00b3:
            if (r2 == 0) goto L_0x00f5
            int r4 = r18.getOverScrollMode()
            if (r4 == 0) goto L_0x00bf
            if (r4 != r9) goto L_0x00c0
            if (r3 <= 0) goto L_0x00c0
        L_0x00bf:
            r1 = r9
        L_0x00c0:
            if (r1 == 0) goto L_0x00ed
            if (r2 >= 0) goto L_0x00d9
            android.widget.EdgeEffect r1 = r0.f2137e
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x00ed
            android.widget.EdgeEffect r1 = r0.f2137e
            android.widget.OverScroller r2 = r0.f2136d
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r1.onAbsorb(r2)
            goto L_0x00ed
        L_0x00d9:
            android.widget.EdgeEffect r1 = r0.f2138f
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x00ed
            android.widget.EdgeEffect r1 = r0.f2138f
            android.widget.OverScroller r2 = r0.f2136d
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r1.onAbsorb(r2)
        L_0x00ed:
            android.widget.OverScroller r1 = r0.f2136d
            r1.abortAnimation()
            r0.x(r9)
        L_0x00f5:
            android.widget.OverScroller r1 = r0.f2136d
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x0103
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            w1.d0.d.k(r18)
            goto L_0x0106
        L_0x0103:
            r0.x(r9)
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    public final void d(int i10) {
        if (getChildCount() > 0) {
            this.f2136d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            v(2, 1);
            this.C = getScrollY();
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(this);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || c(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.F.a(f10, f11, z10);
    }

    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.F.b(f10, f11);
    }

    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.F.c(i10, i11, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.F.e(i10, i11, i12, i13, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f2137e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i10, (float) min);
            this.f2137e.setSize(width, height);
            if (this.f2137e.draw(canvas)) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f2138f.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i11 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f2138f.setSize(width2, height2);
            if (this.f2138f.draw(canvas)) {
                WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                d0.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public final boolean e(int i10) {
        boolean z10;
        int childCount;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.f2135c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2135c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f2135c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2135c;
        return r(i10, rect3.top, rect3.bottom);
    }

    public final boolean g(View view, int i10, int i11) {
        view.getDrawingRect(this.f2135c);
        offsetDescendantRectToMyCoords(view, this.f2135c);
        if (this.f2135c.bottom + i10 < getScrollY() || this.f2135c.top - i10 > getScrollY() + i11) {
            return false;
        }
        return true;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        p pVar = this.E;
        return pVar.f16346b | pVar.f16345a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final void h(int i10, View view) {
        p pVar = this.E;
        if (i10 == 1) {
            pVar.f16346b = 0;
        } else {
            pVar.f16345a = 0;
        }
        x(i10);
    }

    public final boolean hasNestedScrollingParent() {
        if (this.F.f(0) != null) {
            return true;
        }
        return false;
    }

    public final void i(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(i13, i14, iArr);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.F.f16339d;
    }

    public final void j(View view, int i10, int i11, int i12, int i13, int i14) {
        n(i13, i14, (int[]) null);
    }

    public final boolean k(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public final void l(View view, View view2, int i10, int i11) {
        p pVar = this.E;
        if (i11 == 1) {
            pVar.f16346b = i10;
        } else {
            pVar.f16345a = i10;
        }
        v(2, i11);
    }

    public final void m(View view, int i10, int i11, int[] iArr, int i12) {
        this.F.c(i10, i11, i12, iArr, (int[]) null);
    }

    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.F.d(scrollY2, i10 - scrollY2, i11, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2150y) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f2139n = (int) motionEvent.getY(i10);
            this.f2150y = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2144s;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2141p = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        float f10;
        boolean z11;
        boolean z12 = false;
        if (motionEvent.getAction() == 8 && !this.f2143r) {
            if ((motionEvent.getSource() & 2) == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10 = motionEvent.getAxisValue(9);
                i10 = (int) motionEvent.getX();
            } else {
                if ((motionEvent.getSource() & 4194304) == 4194304) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f10 = motionEvent.getAxisValue(26);
                    i10 = getWidth() / 2;
                } else {
                    i10 = 0;
                    f10 = 0.0f;
                }
            }
            if (f10 != 0.0f) {
                int verticalScrollFactorCompat = (int) (f10 * getVerticalScrollFactorCompat());
                if ((motionEvent.getSource() & 8194) == 8194) {
                    z12 = true;
                }
                s(-verticalScrollFactorCompat, i10, 1, z12);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r12.f2143r
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0099
            r5 = -1
            if (r0 == r2) goto L_0x006b
            if (r0 == r1) goto L_0x0025
            r1 = 3
            if (r0 == r1) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0020
            goto L_0x0121
        L_0x0020:
            r12.o(r13)
            goto L_0x0121
        L_0x0025:
            int r0 = r12.f2150y
            if (r0 != r5) goto L_0x002b
            goto L_0x0121
        L_0x002b:
            int r0 = r13.findPointerIndex(r0)
            if (r0 != r5) goto L_0x0033
            goto L_0x0121
        L_0x0033:
            float r0 = r13.getY(r0)
            int r0 = (int) r0
            int r4 = r12.f2139n
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r12.f2147v
            if (r4 <= r5) goto L_0x0121
            int r4 = r12.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto L_0x0121
            r12.f2143r = r2
            r12.f2139n = r0
            android.view.VelocityTracker r0 = r12.f2144s
            if (r0 != 0) goto L_0x0059
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f2144s = r0
        L_0x0059:
            android.view.VelocityTracker r0 = r12.f2144s
            r0.addMovement(r13)
            r12.B = r3
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x0121
            r13.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0121
        L_0x006b:
            r12.f2143r = r3
            r12.f2150y = r5
            android.view.VelocityTracker r13 = r12.f2144s
            if (r13 == 0) goto L_0x0078
            r13.recycle()
            r12.f2144s = r4
        L_0x0078:
            android.widget.OverScroller r5 = r12.f2136d
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x0094
            java.util.WeakHashMap<android.view.View, w1.q0> r13 = w1.d0.f16298a
            w1.d0.d.k(r12)
        L_0x0094:
            r12.x(r3)
            goto L_0x0121
        L_0x0099:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L_0x00cd
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r3)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L_0x00cd
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L_0x00cd
            int r6 = r7.getLeft()
            if (r5 < r6) goto L_0x00cd
            int r6 = r7.getRight()
            if (r5 >= r6) goto L_0x00cd
            r5 = r2
            goto L_0x00ce
        L_0x00cd:
            r5 = r3
        L_0x00ce:
            if (r5 != 0) goto L_0x00ec
            boolean r13 = r12.w(r13)
            if (r13 != 0) goto L_0x00e0
            android.widget.OverScroller r13 = r12.f2136d
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r2 = r3
        L_0x00e0:
            r12.f2143r = r2
            android.view.VelocityTracker r13 = r12.f2144s
            if (r13 == 0) goto L_0x0121
            r13.recycle()
            r12.f2144s = r4
            goto L_0x0121
        L_0x00ec:
            r12.f2139n = r0
            int r0 = r13.getPointerId(r3)
            r12.f2150y = r0
            android.view.VelocityTracker r0 = r12.f2144s
            if (r0 != 0) goto L_0x00ff
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f2144s = r0
            goto L_0x0102
        L_0x00ff:
            r0.clear()
        L_0x0102:
            android.view.VelocityTracker r0 = r12.f2144s
            r0.addMovement(r13)
            android.widget.OverScroller r0 = r12.f2136d
            r0.computeScrollOffset()
            boolean r13 = r12.w(r13)
            if (r13 != 0) goto L_0x011c
            android.widget.OverScroller r13 = r12.f2136d
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x011b
            goto L_0x011c
        L_0x011b:
            r2 = r3
        L_0x011c:
            r12.f2143r = r2
            r12.v(r1, r3)
        L_0x0121:
            boolean r13 = r12.f2143r
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = 0;
        this.f2140o = false;
        View view = this.f2142q;
        if (view != null && f(view, this)) {
            View view2 = this.f2142q;
            view2.getDrawingRect(this.f2135c);
            offsetDescendantRectToMyCoords(view2, this.f2135c);
            int b10 = b(this.f2135c);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        }
        this.f2142q = null;
        if (!this.f2141p) {
            if (this.D != null) {
                scrollTo(getScrollX(), this.D.f2152a);
                this.D = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2141p = true;
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2145t && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        d((int) f11);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        m(view, i10, i11, iArr, 0);
    }

    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(i13, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        l(view, view2, i10, 0);
    }

    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View view;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i10);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (view != null && !(true ^ g(view, 0, getHeight()))) {
            return view.requestFocus(i10, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.D = savedState;
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2152a = getScrollY();
        return savedState;
    }

    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && g(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.f2135c);
            offsetDescendantRectToMyCoords(findFocus, this.f2135c);
            int b10 = b(this.f2135c);
            if (b10 == 0) {
                return;
            }
            if (this.f2146u) {
                u(0, b10, false);
            } else {
                scrollBy(0, b10);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return k(view, view2, i10, 0);
    }

    public final void onStopNestedScroll(View view) {
        h(0, view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.view.VelocityTracker r2 = r0.f2144s
            if (r2 != 0) goto L_0x000e
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.f2144s = r2
        L_0x000e:
            int r2 = r18.getActionMasked()
            r3 = 0
            if (r2 != 0) goto L_0x0017
            r0.B = r3
        L_0x0017:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r18)
            int r5 = r0.B
            float r5 = (float) r5
            r6 = 0
            r4.offsetLocation(r6, r5)
            r5 = 2
            r7 = 1
            if (r2 == 0) goto L_0x01eb
            r8 = 0
            r9 = -1
            if (r2 == r7) goto L_0x014e
            if (r2 == r5) goto L_0x009e
            r5 = 3
            if (r2 == r5) goto L_0x005c
            r3 = 5
            if (r2 == r3) goto L_0x0049
            r3 = 6
            if (r2 == r3) goto L_0x0037
            goto L_0x021f
        L_0x0037:
            r17.o(r18)
            int r2 = r0.f2150y
            int r2 = r1.findPointerIndex(r2)
            float r1 = r1.getY(r2)
            int r1 = (int) r1
            r0.f2139n = r1
            goto L_0x021f
        L_0x0049:
            int r2 = r18.getActionIndex()
            float r3 = r1.getY(r2)
            int r3 = (int) r3
            r0.f2139n = r3
            int r1 = r1.getPointerId(r2)
            r0.f2150y = r1
            goto L_0x021f
        L_0x005c:
            boolean r1 = r0.f2143r
            if (r1 == 0) goto L_0x0082
            int r1 = r17.getChildCount()
            if (r1 <= 0) goto L_0x0082
            android.widget.OverScroller r10 = r0.f2136d
            int r11 = r17.getScrollX()
            int r12 = r17.getScrollY()
            r13 = 0
            r14 = 0
            r15 = 0
            int r16 = r17.getScrollRange()
            boolean r1 = r10.springBack(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0082
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            w1.d0.d.k(r17)
        L_0x0082:
            r0.f2150y = r9
            r0.f2143r = r3
            android.view.VelocityTracker r1 = r0.f2144s
            if (r1 == 0) goto L_0x008f
            r1.recycle()
            r0.f2144s = r8
        L_0x008f:
            r0.x(r3)
            android.widget.EdgeEffect r1 = r0.f2137e
            r1.onRelease()
            android.widget.EdgeEffect r1 = r0.f2138f
            r1.onRelease()
            goto L_0x021f
        L_0x009e:
            int r2 = r0.f2150y
            int r2 = r1.findPointerIndex(r2)
            if (r2 != r9) goto L_0x00a8
            goto L_0x021f
        L_0x00a8:
            float r5 = r1.getY(r2)
            int r5 = (int) r5
            int r8 = r0.f2139n
            int r8 = r8 - r5
            float r9 = r1.getX(r2)
            int r10 = r17.getWidth()
            float r10 = (float) r10
            float r9 = r9 / r10
            float r10 = (float) r8
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r10 = r10 / r11
            android.widget.EdgeEffect r11 = r0.f2137e
            float r11 = androidx.core.widget.d.a(r11)
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x00e4
            android.widget.EdgeEffect r11 = r0.f2137e
            float r10 = -r10
            float r9 = androidx.core.widget.d.b(r11, r10, r9)
            float r9 = -r9
            android.widget.EdgeEffect r10 = r0.f2137e
            float r10 = androidx.core.widget.d.a(r10)
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00e2
            android.widget.EdgeEffect r6 = r0.f2137e
            r6.onRelease()
        L_0x00e2:
            r6 = r9
            goto L_0x0107
        L_0x00e4:
            android.widget.EdgeEffect r11 = r0.f2138f
            float r11 = androidx.core.widget.d.a(r11)
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0107
            android.widget.EdgeEffect r11 = r0.f2138f
            r12 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 - r9
            float r9 = androidx.core.widget.d.b(r11, r10, r12)
            android.widget.EdgeEffect r10 = r0.f2138f
            float r10 = androidx.core.widget.d.a(r10)
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00e2
            android.widget.EdgeEffect r6 = r0.f2138f
            r6.onRelease()
            goto L_0x00e2
        L_0x0107:
            int r9 = r17.getHeight()
            float r9 = (float) r9
            float r6 = r6 * r9
            int r6 = java.lang.Math.round(r6)
            if (r6 == 0) goto L_0x0116
            r17.invalidate()
        L_0x0116:
            int r8 = r8 - r6
            boolean r6 = r0.f2143r
            if (r6 != 0) goto L_0x0137
            int r6 = java.lang.Math.abs(r8)
            int r9 = r0.f2147v
            if (r6 <= r9) goto L_0x0137
            android.view.ViewParent r6 = r17.getParent()
            if (r6 == 0) goto L_0x012c
            r6.requestDisallowInterceptTouchEvent(r7)
        L_0x012c:
            r0.f2143r = r7
            if (r8 <= 0) goto L_0x0134
            int r6 = r0.f2147v
            int r8 = r8 - r6
            goto L_0x0137
        L_0x0134:
            int r6 = r0.f2147v
            int r8 = r8 + r6
        L_0x0137:
            boolean r6 = r0.f2143r
            if (r6 == 0) goto L_0x021f
            float r1 = r1.getX(r2)
            int r1 = (int) r1
            int r1 = r0.s(r8, r1, r3, r3)
            int r5 = r5 - r1
            r0.f2139n = r5
            int r2 = r0.B
            int r2 = r2 + r1
            r0.B = r2
            goto L_0x021f
        L_0x014e:
            android.view.VelocityTracker r1 = r0.f2144s
            r2 = 1000(0x3e8, float:1.401E-42)
            int r5 = r0.f2149x
            float r5 = (float) r5
            r1.computeCurrentVelocity(r2, r5)
            int r2 = r0.f2150y
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            int r2 = java.lang.Math.abs(r1)
            int r5 = r0.f2148w
            if (r2 < r5) goto L_0x01b4
            android.widget.EdgeEffect r2 = r0.f2137e
            float r2 = androidx.core.widget.d.a(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0184
            android.widget.EdgeEffect r2 = r0.f2137e
            boolean r2 = r0.t(r2, r1)
            if (r2 == 0) goto L_0x017f
            android.widget.EdgeEffect r2 = r0.f2137e
            r2.onAbsorb(r1)
            goto L_0x01a0
        L_0x017f:
            int r2 = -r1
            r0.d(r2)
            goto L_0x01a0
        L_0x0184:
            android.widget.EdgeEffect r2 = r0.f2138f
            float r2 = androidx.core.widget.d.a(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x01a2
            android.widget.EdgeEffect r2 = r0.f2138f
            int r5 = -r1
            boolean r2 = r0.t(r2, r5)
            if (r2 == 0) goto L_0x019d
            android.widget.EdgeEffect r2 = r0.f2138f
            r2.onAbsorb(r5)
            goto L_0x01a0
        L_0x019d:
            r0.d(r5)
        L_0x01a0:
            r2 = r7
            goto L_0x01a3
        L_0x01a2:
            r2 = r3
        L_0x01a3:
            if (r2 != 0) goto L_0x01d0
            int r1 = -r1
            float r2 = (float) r1
            boolean r5 = r0.dispatchNestedPreFling(r6, r2)
            if (r5 != 0) goto L_0x01d0
            r0.dispatchNestedFling(r6, r2, r7)
            r0.d(r1)
            goto L_0x01d0
        L_0x01b4:
            android.widget.OverScroller r10 = r0.f2136d
            int r11 = r17.getScrollX()
            int r12 = r17.getScrollY()
            r13 = 0
            r14 = 0
            r15 = 0
            int r16 = r17.getScrollRange()
            boolean r1 = r10.springBack(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x01d0
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            w1.d0.d.k(r17)
        L_0x01d0:
            r0.f2150y = r9
            r0.f2143r = r3
            android.view.VelocityTracker r1 = r0.f2144s
            if (r1 == 0) goto L_0x01dd
            r1.recycle()
            r0.f2144s = r8
        L_0x01dd:
            r0.x(r3)
            android.widget.EdgeEffect r1 = r0.f2137e
            r1.onRelease()
            android.widget.EdgeEffect r1 = r0.f2138f
            r1.onRelease()
            goto L_0x021f
        L_0x01eb:
            int r2 = r17.getChildCount()
            if (r2 != 0) goto L_0x01f2
            return r3
        L_0x01f2:
            boolean r2 = r0.f2143r
            if (r2 == 0) goto L_0x01ff
            android.view.ViewParent r2 = r17.getParent()
            if (r2 == 0) goto L_0x01ff
            r2.requestDisallowInterceptTouchEvent(r7)
        L_0x01ff:
            android.widget.OverScroller r2 = r0.f2136d
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L_0x020f
            android.widget.OverScroller r2 = r0.f2136d
            r2.abortAnimation()
            r0.x(r7)
        L_0x020f:
            float r2 = r18.getY()
            int r2 = (int) r2
            int r1 = r1.getPointerId(r3)
            r0.f2139n = r2
            r0.f2150y = r1
            r0.v(r5, r3)
        L_0x021f:
            android.view.VelocityTracker r1 = r0.f2144s
            if (r1 == 0) goto L_0x0226
            r1.addMovement(r4)
        L_0x0226:
            r4.recycle()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L_0x001a
        L_0x0017:
            r11 = r0
            r10 = r1
            goto L_0x001e
        L_0x001a:
            if (r11 >= 0) goto L_0x001d
            goto L_0x0017
        L_0x001d:
            r10 = r0
        L_0x001e:
            if (r12 <= r13) goto L_0x0023
            r12 = r13
        L_0x0021:
            r13 = r1
            goto L_0x0028
        L_0x0023:
            if (r12 >= 0) goto L_0x0027
            r12 = r0
            goto L_0x0021
        L_0x0027:
            r13 = r0
        L_0x0028:
            if (r13 == 0) goto L_0x0045
            w1.m r2 = r9.F
            android.view.ViewParent r2 = r2.f(r1)
            if (r2 == 0) goto L_0x0034
            r2 = r1
            goto L_0x0035
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 != 0) goto L_0x0045
            android.widget.OverScroller r2 = r9.f2136d
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L_0x0045:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L_0x004e
            if (r13 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r0
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.p(int, int, int, int):boolean");
    }

    public final void q(int i10) {
        boolean z10;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        if (z10) {
            this.f2135c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                Rect rect = this.f2135c;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            this.f2135c.top = getScrollY() - height;
            Rect rect2 = this.f2135c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2135c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        r(i10, i11, i12);
    }

    public final boolean r(int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        int i13;
        boolean z12;
        boolean z13;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        int height = getHeight();
        int scrollY = getScrollY();
        int i17 = height + scrollY;
        if (i14 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z14 = false;
        for (int i18 = 0; i18 < size; i18++) {
            View view2 = focusables.get(i18);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i15 < bottom && top < i16) {
                if (i15 >= top || bottom >= i16) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (view == null) {
                    view = view2;
                    z14 = z12;
                } else {
                    if ((!z10 || top >= view.getTop()) && (z10 || bottom <= view.getBottom())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z14) {
                        if (z12) {
                            if (!z13) {
                            }
                        }
                    } else if (z12) {
                        view = view2;
                        z14 = true;
                    } else if (!z13) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i15 < scrollY || i16 > i17) {
            if (z10) {
                i13 = i15 - scrollY;
            } else {
                i13 = i16 - i17;
            }
            s(i13, 0, 1, true);
            z11 = true;
        } else {
            z11 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i14);
        }
        return z11;
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f2140o) {
            view2.getDrawingRect(this.f2135c);
            offsetDescendantRectToMyCoords(view2, this.f2135c);
            int b10 = b(this.f2135c);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        } else {
            this.f2142q = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        boolean z11;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b10 = b(rect);
        if (b10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, b10);
            } else {
                u(0, b10, false);
            }
        }
        return z11;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f2144s) != null) {
            velocityTracker.recycle();
            this.f2144s = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void requestLayout() {
        this.f2140o = true;
        super.requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int s(int r20, int r21, int r22, boolean r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r10 = r22
            r11 = 1
            if (r10 != r11) goto L_0x000d
            r2 = 2
            r0.v(r2, r10)
        L_0x000d:
            r3 = 0
            int[] r6 = r0.A
            int[] r7 = r0.f2151z
            w1.m r2 = r0.F
            r4 = r20
            r5 = r22
            boolean r2 = r2.c(r3, r4, r5, r6, r7)
            r12 = 0
            if (r2 == 0) goto L_0x002d
            int[] r2 = r0.A
            r2 = r2[r11]
            int r2 = r20 - r2
            int[] r3 = r0.f2151z
            r3 = r3[r11]
            int r3 = r3 + r12
            r13 = r2
            r14 = r3
            goto L_0x0030
        L_0x002d:
            r13 = r20
            r14 = r12
        L_0x0030:
            int r15 = r19.getScrollY()
            int r9 = r19.getScrollRange()
            int r2 = r19.getOverScrollMode()
            if (r2 == 0) goto L_0x0049
            if (r2 != r11) goto L_0x0047
            int r2 = r19.getScrollRange()
            if (r2 <= 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r2 = r12
            goto L_0x004a
        L_0x0049:
            r2 = r11
        L_0x004a:
            if (r2 == 0) goto L_0x0051
            if (r23 != 0) goto L_0x0051
            r16 = r11
            goto L_0x0053
        L_0x0051:
            r16 = r12
        L_0x0053:
            boolean r2 = r0.p(r13, r12, r15, r9)
            if (r2 == 0) goto L_0x0069
            w1.m r2 = r0.F
            android.view.ViewParent r2 = r2.f(r10)
            if (r2 == 0) goto L_0x0063
            r2 = r11
            goto L_0x0064
        L_0x0063:
            r2 = r12
        L_0x0064:
            if (r2 != 0) goto L_0x0069
            r17 = r11
            goto L_0x006b
        L_0x0069:
            r17 = r12
        L_0x006b:
            int r2 = r19.getScrollY()
            int r4 = r2 - r15
            int r6 = r13 - r4
            int[] r8 = r0.A
            r8[r11] = r12
            int[] r7 = r0.f2151z
            w1.m r2 = r0.F
            r3 = 0
            r5 = 0
            r18 = r8
            r8 = r22
            r12 = r9
            r9 = r18
            r2.e(r3, r4, r5, r6, r7, r8, r9)
            int[] r2 = r0.f2151z
            r2 = r2[r11]
            int r14 = r14 + r2
            int[] r2 = r0.A
            r2 = r2[r11]
            int r13 = r13 - r2
            int r15 = r15 + r13
            if (r15 >= 0) goto L_0x00b8
            if (r16 == 0) goto L_0x00df
            android.widget.EdgeEffect r2 = r0.f2137e
            int r3 = -r13
            float r3 = (float) r3
            int r4 = r19.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r1 = (float) r1
            int r4 = r19.getWidth()
            float r4 = (float) r4
            float r1 = r1 / r4
            androidx.core.widget.d.b(r2, r3, r1)
            android.widget.EdgeEffect r1 = r0.f2138f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x00df
            android.widget.EdgeEffect r1 = r0.f2138f
            r1.onRelease()
            goto L_0x00df
        L_0x00b8:
            if (r15 <= r12) goto L_0x00df
            if (r16 == 0) goto L_0x00df
            android.widget.EdgeEffect r2 = r0.f2138f
            float r3 = (float) r13
            int r4 = r19.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r1
            int r5 = r19.getWidth()
            float r5 = (float) r5
            float r1 = r1 / r5
            float r4 = r4 - r1
            androidx.core.widget.d.b(r2, r3, r4)
            android.widget.EdgeEffect r1 = r0.f2137e
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x00df
            android.widget.EdgeEffect r1 = r0.f2137e
            r1.onRelease()
        L_0x00df:
            android.widget.EdgeEffect r1 = r0.f2137e
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x00f3
            android.widget.EdgeEffect r1 = r0.f2138f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x00f0
            goto L_0x00f3
        L_0x00f0:
            r12 = r17
            goto L_0x00f9
        L_0x00f3:
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            w1.d0.d.k(r19)
            r12 = 0
        L_0x00f9:
            if (r12 == 0) goto L_0x0102
            if (r10 != 0) goto L_0x0102
            android.view.VelocityTracker r1 = r0.f2144s
            r1.clear()
        L_0x0102:
            if (r10 != r11) goto L_0x0111
            r0.x(r10)
            android.widget.EdgeEffect r1 = r0.f2137e
            r1.onRelease()
            android.widget.EdgeEffect r1 = r0.f2138f
            r1.onRelease()
        L_0x0111:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.s(int, int, int, boolean):int");
    }

    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 != getScrollX() || i11 != getScrollY()) {
                super.scrollTo(i10, i11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2145t) {
            this.f2145t = z10;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        m mVar = this.F;
        if (mVar.f16339d) {
            View view = mVar.f16338c;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.i.z(view);
        }
        mVar.f16339d = z10;
    }

    public void setOnScrollChangeListener(c cVar) {
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2146u = z10;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i10) {
        return v(i10, 0);
    }

    public final void stopNestedScroll() {
        x(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float a10 = d.a(edgeEffect) * ((float) getHeight());
        double log = Math.log((double) ((((float) Math.abs(-i10)) * 0.35f) / (this.f2133a * 0.015f)));
        double d10 = (double) H;
        if (((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) (this.f2133a * 0.015f)))) < a10) {
            return true;
        }
        return false;
    }

    public final void u(int i10, int i11, boolean z10) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2134b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2136d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z10) {
                    v(2, 1);
                } else {
                    x(1);
                }
                this.C = getScrollY();
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.d.k(this);
            } else {
                if (!this.f2136d.isFinished()) {
                    this.f2136d.abortAnimation();
                    x(1);
                }
                scrollBy(i10, i11);
            }
            this.f2134b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final boolean v(int i10, int i11) {
        return this.F.g(i10, i11);
    }

    public final boolean w(MotionEvent motionEvent) {
        boolean z10;
        if (d.a(this.f2137e) != 0.0f) {
            d.b(this.f2137e, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z10 = true;
        } else {
            z10 = false;
        }
        if (d.a(this.f2138f) == 0.0f) {
            return z10;
        }
        d.b(this.f2138f, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void x(int i10) {
        this.F.h(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f2135c = new Rect();
        this.f2140o = true;
        this.f2141p = false;
        this.f2142q = null;
        this.f2143r = false;
        this.f2146u = true;
        this.f2150y = -1;
        this.f2151z = new int[2];
        this.A = new int[2];
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            edgeEffect = d.b.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f2137e = edgeEffect;
        if (i11 >= 31) {
            edgeEffect2 = d.b.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f2138f = edgeEffect2;
        this.f2133a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2136d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2147v = viewConfiguration.getScaledTouchSlop();
        this.f2148w = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2149x = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.E = new p();
        this.F = new m(this);
        setNestedScrollingEnabled(true);
        d0.o(this, I);
    }

    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
