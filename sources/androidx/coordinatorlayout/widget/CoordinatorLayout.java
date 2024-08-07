package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.R$attr;
import androidx.coordinatorlayout.R$style;
import androidx.coordinatorlayout.R$styleable;
import androidx.customview.view.AbsSavedState;
import f0.b0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import o1.a;
import v0.h;
import w1.d0;
import w1.n;
import w1.o;
import w1.p;
import w1.q;
import w1.q0;
import w1.w0;

public class CoordinatorLayout extends ViewGroup implements n, o {
    public static final String A;
    public static final Class<?>[] B = {Context.class, AttributeSet.class};
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> C = new ThreadLocal<>();
    public static final g D = new g();
    public static final v1.e E = new v1.e(12);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2045a;

    /* renamed from: b  reason: collision with root package name */
    public final h1.a f2046b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2047c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f2048d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f2049e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f2050f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2051n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2052o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f2053p;

    /* renamed from: q  reason: collision with root package name */
    public View f2054q;

    /* renamed from: r  reason: collision with root package name */
    public View f2055r;

    /* renamed from: s  reason: collision with root package name */
    public f f2056s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2057t;

    /* renamed from: u  reason: collision with root package name */
    public w0 f2058u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2059v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f2060w;

    /* renamed from: x  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f2061x;

    /* renamed from: y  reason: collision with root package name */
    public a f2062y;

    /* renamed from: z  reason: collision with root package name */
    public final p f2063z;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public boolean e(View view, Rect rect) {
            return false;
        }

        public boolean f(View view, View view2) {
            return false;
        }

        public void g(e eVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v2, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v2, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            return false;
        }

        public boolean n(View view) {
            return false;
        }

        public void o(CoordinatorLayout coordinatorLayout, V v2, View view, int i10, int i11, int[] iArr, int i12) {
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, V v2, Rect rect, boolean z10) {
            return false;
        }

        public void r(View view, Parcelable parcelable) {
        }

        public Parcelable s(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean t(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i10, int i11) {
            return false;
        }

        public void u(CoordinatorLayout coordinatorLayout, V v2, View view, int i10) {
        }

        public boolean v(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    public class a implements q {
        public a() {
        }

        public final w0 g(View view, w0 w0Var) {
            boolean z10;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!v1.b.a(coordinatorLayout.f2058u, w0Var)) {
                coordinatorLayout.f2058u = w0Var;
                boolean z11 = true;
                if (w0Var.e() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                coordinatorLayout.f2059v = z10;
                if (z10 || coordinatorLayout.getBackground() != null) {
                    z11 = false;
                }
                coordinatorLayout.setWillNotDraw(z11);
                if (!w0Var.f16391a.m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                        if (d0.d.b(childAt) && ((e) childAt.getLayoutParams()).f2067a != null && w0Var.f16391a.m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return w0Var;
        }
    }

    public interface b {
        Behavior getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class<? extends Behavior> value();
    }

    public class d implements ViewGroup.OnHierarchyChangeListener {
        public d() {
        }

        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2061x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.t(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2061x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.t(0);
            return true;
        }
    }

    public static class g implements Comparator<View> {
        public final int compare(Object obj, Object obj2) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            float m10 = d0.i.m((View) obj);
            float m11 = d0.i.m((View) obj2);
            if (m10 > m11) {
                return -1;
            }
            if (m10 < m11) {
                return 1;
            }
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            A = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            D = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            B = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            C = r0
            v1.e r0 = new v1.e
            r1 = 12
            r0.<init>(r1)
            E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public static void A(int i10, View view) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f2076j;
        if (i11 != i10) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            view.offsetTopAndBottom(i10 - i11);
            eVar.f2076j = i10;
        }
    }

    public static Rect e() {
        Rect rect = (Rect) E.b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void q(int i10, Rect rect, Rect rect2, e eVar, int i11, int i12) {
        int i13;
        int i14;
        int i15 = eVar.f2069c;
        if (i15 == 0) {
            i15 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i15, i10);
        int i16 = eVar.f2070d;
        if ((i16 & 7) == 0) {
            i16 |= 8388611;
        }
        if ((i16 & 112) == 0) {
            i16 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i16, i10);
        int i17 = absoluteGravity & 7;
        int i18 = absoluteGravity & 112;
        int i19 = absoluteGravity2 & 7;
        int i20 = absoluteGravity2 & 112;
        if (i19 == 1) {
            i13 = rect.left + (rect.width() / 2);
        } else if (i19 != 5) {
            i13 = rect.left;
        } else {
            i13 = rect.right;
        }
        if (i20 == 16) {
            i14 = rect.top + (rect.height() / 2);
        } else if (i20 != 80) {
            i14 = rect.top;
        } else {
            i14 = rect.bottom;
        }
        if (i17 == 1) {
            i13 -= i11 / 2;
        } else if (i17 != 5) {
            i13 -= i11;
        }
        if (i18 == 16) {
            i14 -= i12 / 2;
        } else if (i18 != 80) {
            i14 -= i12;
        }
        rect2.set(i13, i14, i11 + i13, i12 + i14);
    }

    public static e r(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f2068b) {
            if (view instanceof b) {
                eVar.b(((b) view).getBehavior());
                eVar.f2068b = true;
            } else {
                c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (c) cls.getAnnotation(c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.b((Behavior) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        cVar.value().getClass();
                    }
                }
                eVar.f2068b = true;
            }
        }
        return eVar;
    }

    public static void z(int i10, View view) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f2075i;
        if (i11 != i10) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            view.offsetLeftAndRight(i10 - i11);
            eVar.f2075i = i10;
        }
    }

    public final void B() {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.d.b(this)) {
            if (this.f2062y == null) {
                this.f2062y = new a();
            }
            d0.i.u(this, this.f2062y);
            setSystemUiVisibility(1280);
            return;
        }
        d0.i.u(this, (q) null);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof e) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Behavior behavior = ((e) view.getLayoutParams()).f2067a;
        if (behavior != null) {
            behavior.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2060w;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void f(e eVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - eVar.bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final void g(View view) {
        List list = (List) ((h) this.f2046b.f10528b).getOrDefault(view, null);
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                View view2 = (View) list.get(i10);
                Behavior behavior = ((e) view2.getLayoutParams()).f2067a;
                if (behavior != null) {
                    behavior.h(this, view2, view);
                }
            }
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        x();
        return Collections.unmodifiableList(this.f2045a);
    }

    public final w0 getLastWindowInsets() {
        return this.f2058u;
    }

    public int getNestedScrollAxes() {
        p pVar = this.f2063z;
        return pVar.f16346b | pVar.f16345a;
    }

    public Drawable getStatusBarBackground() {
        return this.f2060w;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(int i10, View view) {
        p pVar = this.f2063z;
        if (i10 == 1) {
            pVar.f16346b = 0;
        } else {
            pVar.f16345a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i10)) {
                Behavior behavior = eVar.f2067a;
                if (behavior != null) {
                    behavior.u(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    eVar.f2080n = false;
                } else if (i10 == 1) {
                    eVar.f2081o = false;
                }
                eVar.f2082p = false;
            }
        }
        this.f2055r = null;
    }

    public final void i(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        Behavior behavior;
        int i15;
        int i16;
        int childCount = getChildCount();
        boolean z10 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                int i20 = i14;
            } else {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i14) && (behavior = eVar.f2067a) != null) {
                    int[] iArr2 = this.f2049e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.p(this, childAt, i11, i12, i13, iArr2);
                    int[] iArr3 = this.f2049e;
                    if (i12 > 0) {
                        i15 = Math.max(i17, iArr3[0]);
                    } else {
                        i15 = Math.min(i17, iArr3[0]);
                    }
                    i17 = i15;
                    if (i13 > 0) {
                        i16 = Math.max(i18, this.f2049e[1]);
                    } else {
                        i16 = Math.min(i18, this.f2049e[1]);
                    }
                    i18 = i16;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i17;
        iArr[1] = iArr[1] + i18;
        if (z10) {
            t(1);
        }
    }

    public final void j(View view, int i10, int i11, int i12, int i13, int i14) {
        i(view, i10, i11, i12, i13, 0, this.f2050f);
    }

    public final boolean k(View view, View view2, int i10, int i11) {
        int i12 = i11;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                Behavior behavior = eVar.f2067a;
                if (behavior != null) {
                    boolean t10 = behavior.t(this, childAt, view, view2, i10, i11);
                    z10 |= t10;
                    if (i12 == 0) {
                        eVar.f2080n = t10;
                    } else if (i12 == 1) {
                        eVar.f2081o = t10;
                    }
                } else if (i12 == 0) {
                    eVar.f2080n = false;
                } else if (i12 == 1) {
                    eVar.f2081o = false;
                }
            }
        }
        return z10;
    }

    public final void l(View view, View view2, int i10, int i11) {
        p pVar = this.f2063z;
        if (i11 == 1) {
            pVar.f16346b = i10;
        } else {
            pVar.f16345a = i10;
        }
        this.f2055r = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((e) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    public final void m(View view, int i10, int i11, int[] iArr, int i12) {
        Behavior behavior;
        int i13;
        int i14;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                int i18 = i12;
            } else {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i12) && (behavior = eVar.f2067a) != null) {
                    int[] iArr2 = this.f2049e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.o(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f2049e;
                    if (i10 > 0) {
                        i13 = Math.max(i15, iArr3[0]);
                    } else {
                        i13 = Math.min(i15, iArr3[0]);
                    }
                    i15 = i13;
                    int[] iArr4 = this.f2049e;
                    if (i11 > 0) {
                        i14 = Math.max(i16, iArr4[1]);
                    } else {
                        i14 = Math.min(i16, iArr4[1]);
                    }
                    i16 = i14;
                    z10 = true;
                }
            }
        }
        iArr[0] = i15;
        iArr[1] = i16;
        if (z10) {
            t(1);
        }
    }

    public final void n(View view, Rect rect, boolean z10) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            p(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList o(View view) {
        h1.a aVar = this.f2046b;
        int i10 = ((h) aVar.f10528b).f16007c;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((h) aVar.f10528b).m(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((h) aVar.f10528b).i(i11));
            }
        }
        this.f2048d.clear();
        if (arrayList != null) {
            this.f2048d.addAll(arrayList);
        }
        return this.f2048d;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y(false);
        if (this.f2057t) {
            if (this.f2056s == null) {
                this.f2056s = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2056s);
        }
        if (this.f2058u == null) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.d.b(this)) {
                d0.h.c(this);
            }
        }
        this.f2052o = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y(false);
        if (this.f2057t && this.f2056s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2056s);
        }
        View view = this.f2055r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2052o = false;
    }

    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.f2059v && this.f2060w != null) {
            w0 w0Var = this.f2058u;
            if (w0Var != null) {
                i10 = w0Var.e();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f2060w.setBounds(0, 0, getWidth(), i10);
                this.f2060w.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y(true);
        }
        boolean w9 = w(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            y(true);
        }
        return w9;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Behavior behavior;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int d10 = d0.e.d(this);
        int size = this.f2045a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f2045a.get(i14);
            if (view.getVisibility() != 8 && ((behavior = ((e) view.getLayoutParams()).f2067a) == null || !behavior.l(this, view, d10))) {
                u(d10, view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a4, code lost:
        if (r0.m(r30, r19, r24, r20, r25) == false) goto L_0x01b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r6 = r30
            r30.x()
            int r0 = r30.getChildCount()
            r7 = 0
            r1 = r7
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x003c
            android.view.View r3 = r6.getChildAt(r1)
            h1.a r4 = r6.f2046b
            java.lang.Object r5 = r4.f10528b
            v0.h r5 = (v0.h) r5
            int r5 = r5.f16007c
            r8 = r7
        L_0x001b:
            if (r8 >= r5) goto L_0x0034
            java.lang.Object r9 = r4.f10528b
            v0.h r9 = (v0.h) r9
            java.lang.Object r9 = r9.m(r8)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0031
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x0031
            r3 = r2
            goto L_0x0035
        L_0x0031:
            int r8 = r8 + 1
            goto L_0x001b
        L_0x0034:
            r3 = r7
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r0 = r2
            goto L_0x003d
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x003c:
            r0 = r7
        L_0x003d:
            boolean r1 = r6.f2057t
            if (r0 == r1) goto L_0x0071
            if (r0 == 0) goto L_0x005e
            boolean r0 = r6.f2052o
            if (r0 == 0) goto L_0x005b
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = r6.f2056s
            if (r0 != 0) goto L_0x0052
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            r0.<init>()
            r6.f2056s = r0
        L_0x0052:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = r6.f2056s
            r0.addOnPreDrawListener(r1)
        L_0x005b:
            r6.f2057t = r2
            goto L_0x0071
        L_0x005e:
            boolean r0 = r6.f2052o
            if (r0 == 0) goto L_0x006f
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = r6.f2056s
            if (r0 == 0) goto L_0x006f
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = r6.f2056s
            r0.removeOnPreDrawListener(r1)
        L_0x006f:
            r6.f2057t = r7
        L_0x0071:
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
            int r10 = w1.d0.e.d(r30)
            if (r10 != r2) goto L_0x008b
            r11 = r2
            goto L_0x008c
        L_0x008b:
            r11 = r7
        L_0x008c:
            int r12 = android.view.View.MeasureSpec.getMode(r31)
            int r13 = android.view.View.MeasureSpec.getSize(r31)
            int r14 = android.view.View.MeasureSpec.getMode(r32)
            int r15 = android.view.View.MeasureSpec.getSize(r32)
            int r16 = r8 + r9
            int r17 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            w1.w0 r3 = r6.f2058u
            if (r3 == 0) goto L_0x00b5
            boolean r3 = w1.d0.d.b(r30)
            if (r3 == 0) goto L_0x00b5
            r18 = r2
            goto L_0x00b7
        L_0x00b5:
            r18 = r7
        L_0x00b7:
            java.util.ArrayList r2 = r6.f2045a
            int r5 = r2.size()
            r4 = r0
            r3 = r1
            r1 = r7
            r2 = r1
        L_0x00c1:
            if (r2 >= r5) goto L_0x0200
            java.util.ArrayList r0 = r6.f2045a
            java.lang.Object r0 = r0.get(r2)
            r19 = r0
            android.view.View r19 = (android.view.View) r19
            int r0 = r19.getVisibility()
            r7 = 8
            if (r0 != r7) goto L_0x00e3
            r21 = r2
            r28 = r5
            r22 = r8
            r26 = r9
            r27 = r10
            r23 = 0
            goto L_0x01f2
        L_0x00e3:
            android.view.ViewGroup$LayoutParams r0 = r19.getLayoutParams()
            r7 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r7
            int r0 = r7.f2071e
            if (r0 < 0) goto L_0x0143
            if (r12 == 0) goto L_0x0143
            r21 = r1
            int[] r1 = r6.f2053p
            if (r1 != 0) goto L_0x00fd
            r30.toString()
            r22 = r2
        L_0x00fb:
            r0 = 0
            goto L_0x010c
        L_0x00fd:
            r22 = r2
            if (r0 < 0) goto L_0x0108
            int r2 = r1.length
            if (r0 < r2) goto L_0x0105
            goto L_0x0108
        L_0x0105:
            r0 = r1[r0]
            goto L_0x010c
        L_0x0108:
            r30.toString()
            goto L_0x00fb
        L_0x010c:
            int r1 = r7.f2069c
            if (r1 != 0) goto L_0x0113
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L_0x0113:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r10)
            r1 = r1 & 7
            r2 = 3
            if (r1 != r2) goto L_0x011e
            if (r11 == 0) goto L_0x0123
        L_0x011e:
            r2 = 5
            if (r1 != r2) goto L_0x012f
            if (r11 == 0) goto L_0x012f
        L_0x0123:
            int r1 = r13 - r9
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r2 = r0
            r20 = r1
            goto L_0x014a
        L_0x012f:
            if (r1 != r2) goto L_0x0133
            if (r11 == 0) goto L_0x0138
        L_0x0133:
            r2 = 3
            if (r1 != r2) goto L_0x0141
            if (r11 == 0) goto L_0x0141
        L_0x0138:
            int r0 = r0 - r8
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r20 = r0
            goto L_0x014a
        L_0x0141:
            r2 = 0
            goto L_0x0148
        L_0x0143:
            r21 = r1
            r22 = r2
            goto L_0x0141
        L_0x0148:
            r20 = r2
        L_0x014a:
            if (r18 == 0) goto L_0x017d
            boolean r0 = w1.d0.d.b(r19)
            if (r0 != 0) goto L_0x017d
            w1.w0 r0 = r6.f2058u
            int r0 = r0.c()
            w1.w0 r1 = r6.f2058u
            int r1 = r1.d()
            int r1 = r1 + r0
            w1.w0 r0 = r6.f2058u
            int r0 = r0.e()
            w1.w0 r2 = r6.f2058u
            int r2 = r2.b()
            int r2 = r2 + r0
            int r0 = r13 - r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r12)
            int r1 = r15 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r24 = r0
            r25 = r1
            goto L_0x0181
        L_0x017d:
            r24 = r31
            r25 = r32
        L_0x0181:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r7.f2067a
            if (r0 == 0) goto L_0x01a7
            r2 = r21
            r1 = r30
            r21 = r22
            r23 = 0
            r22 = r8
            r8 = r2
            r2 = r19
            r26 = r9
            r9 = r3
            r3 = r24
            r27 = r10
            r10 = r4
            r4 = r20
            r28 = r5
            r5 = r25
            boolean r0 = r0.m(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01c7
            goto L_0x01b9
        L_0x01a7:
            r28 = r5
            r26 = r9
            r27 = r10
            r23 = 0
            r9 = r3
            r10 = r4
            r29 = r22
            r22 = r8
            r8 = r21
            r21 = r29
        L_0x01b9:
            r5 = 0
            r0 = r30
            r1 = r19
            r2 = r24
            r3 = r20
            r4 = r25
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01c7:
            int r0 = r19.getMeasuredWidth()
            int r0 = r0 + r16
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r10, r0)
            int r1 = r19.getMeasuredHeight()
            int r1 = r1 + r17
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r9, r1)
            int r2 = r19.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r4 = r0
            r3 = r1
            r1 = r2
        L_0x01f2:
            int r2 = r21 + 1
            r8 = r22
            r7 = r23
            r9 = r26
            r10 = r27
            r5 = r28
            goto L_0x00c1
        L_0x0200:
            r8 = r1
            r9 = r3
            r10 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r1 = r31
            int r0 = android.view.View.resolveSizeAndState(r10, r1, r0)
            int r1 = r8 << 16
            r2 = r32
            int r1 = android.view.View.resolveSizeAndState(r9, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    Behavior behavior = eVar.f2067a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (behavior = eVar.f2067a) != null) {
                    z10 |= behavior.n(view);
                }
            }
        }
        return z10;
    }

    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        m(view, i10, i11, iArr, 0);
    }

    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        j(view, i10, i11, i12, i13, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        l(view, view2, i10, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        SparseArray<Parcelable> sparseArray = savedState.f2064c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            Behavior behavior = r(childAt).f2067a;
            if (!(id2 == -1 || behavior == null || (parcelable2 = sparseArray.get(id2)) == null)) {
                behavior.r(childAt, parcelable2);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable s10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            Behavior behavior = ((e) childAt.getLayoutParams()).f2067a;
            if (!(id2 == -1 || behavior == null || (s10 = behavior.s(childAt)) == null)) {
                sparseArray.append(id2, s10);
            }
        }
        savedState.f2064c = sparseArray;
        return savedState;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return k(view, view2, i10, 0);
    }

    public final void onStopNestedScroll(View view) {
        h(0, view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2054q
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.w(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f2054q
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.f2067a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f2054q
            boolean r6 = r6.v(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.f2054q
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.y(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = h1.b.f10531a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = h1.b.f10531a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        h1.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = h1.b.f10532b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        Behavior behavior = ((e) view.getLayoutParams()).f2067a;
        if (behavior == null || !behavior.q(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f2051n) {
            y(false);
            this.f2051n = true;
        }
    }

    public final boolean s(View view, int i10, int i11) {
        Rect e10 = e();
        p(view, e10);
        try {
            return e10.contains(i10, i11);
        } finally {
            e10.setEmpty();
            E.a(e10);
        }
    }

    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        B();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2061x = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f2060w;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2060w = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2060w.setState(getDrawableState());
                }
                Drawable drawable4 = this.f2060w;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                a.c.b(drawable4, d0.e.d(this));
                Drawable drawable5 = this.f2060w;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f2060w.setCallback(this);
            }
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            d0.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = k1.a.getDrawable(getContext(), i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f2060w;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f2060w.setVisible(z10, false);
        }
    }

    public final void t(int i10) {
        int i11;
        Rect rect;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        int i19;
        Rect rect2;
        int i20;
        int i21;
        Behavior behavior;
        int i22 = i10;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int d10 = d0.e.d(this);
        int size = this.f2045a.size();
        Rect e10 = e();
        Rect e11 = e();
        Rect e12 = e();
        int i23 = 0;
        int i24 = i22;
        while (i23 < size) {
            View view = (View) this.f2045a.get(i23);
            e eVar = (e) view.getLayoutParams();
            if (i24 == 0 && view.getVisibility() == 8) {
                i12 = size;
                rect = e12;
                i11 = i23;
            } else {
                int i25 = 0;
                while (i25 < i23) {
                    if (eVar.f2078l == ((View) this.f2045a.get(i25))) {
                        e eVar2 = (e) view.getLayoutParams();
                        if (eVar2.f2077k != null) {
                            Rect e13 = e();
                            Rect e14 = e();
                            Rect e15 = e();
                            p(eVar2.f2077k, e13);
                            n(view, e14, false);
                            int measuredWidth = view.getMeasuredWidth();
                            i21 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            boolean z13 = true;
                            int i26 = measuredWidth;
                            Rect rect3 = e15;
                            i20 = i23;
                            Rect rect4 = e14;
                            Rect rect5 = e13;
                            rect2 = e12;
                            e eVar3 = eVar2;
                            i19 = i25;
                            q(d10, e13, rect3, eVar2, i26, measuredHeight);
                            Rect rect6 = rect3;
                            if (rect6.left == rect4.left && rect6.top == rect4.top) {
                                z13 = false;
                            }
                            f(eVar3, rect6, i26, measuredHeight);
                            int i27 = rect6.left - rect4.left;
                            int i28 = rect6.top - rect4.top;
                            if (i27 != 0) {
                                WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                                view.offsetLeftAndRight(i27);
                            }
                            if (i28 != 0) {
                                WeakHashMap<View, q0> weakHashMap3 = d0.f16298a;
                                view.offsetTopAndBottom(i28);
                            }
                            if (z13 && (behavior = eVar3.f2067a) != null) {
                                behavior.h(this, view, eVar3.f2077k);
                            }
                            rect5.setEmpty();
                            v1.e eVar4 = E;
                            eVar4.a(rect5);
                            rect4.setEmpty();
                            eVar4.a(rect4);
                            rect6.setEmpty();
                            eVar4.a(rect6);
                            i25 = i19 + 1;
                            size = i21;
                            i23 = i20;
                            e12 = rect2;
                        }
                    }
                    i19 = i25;
                    i21 = size;
                    rect2 = e12;
                    i20 = i23;
                    i25 = i19 + 1;
                    size = i21;
                    i23 = i20;
                    e12 = rect2;
                }
                int i29 = size;
                Rect rect7 = e12;
                i11 = i23;
                n(view, e11, true);
                if (eVar.f2073g != 0 && !e11.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar.f2073g, d10);
                    int i30 = absoluteGravity & 112;
                    if (i30 == 48) {
                        e10.top = Math.max(e10.top, e11.bottom);
                    } else if (i30 == 80) {
                        e10.bottom = Math.max(e10.bottom, getHeight() - e11.top);
                    }
                    int i31 = absoluteGravity & 7;
                    if (i31 == 3) {
                        e10.left = Math.max(e10.left, e11.right);
                    } else if (i31 == 5) {
                        e10.right = Math.max(e10.right, getWidth() - e11.left);
                    }
                }
                if (eVar.f2074h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, q0> weakHashMap4 = d0.f16298a;
                    if (d0.g.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        e eVar5 = (e) view.getLayoutParams();
                        Behavior behavior2 = eVar5.f2067a;
                        Rect e16 = e();
                        Rect e17 = e();
                        e17.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (behavior2 == null || !behavior2.e(view, e16)) {
                            e16.set(e17);
                        } else if (!e17.contains(e16)) {
                            StringBuilder q10 = android.support.v4.media.a.q("Rect should be within the child's bounds. Rect:");
                            q10.append(e16.toShortString());
                            q10.append(" | Bounds:");
                            q10.append(e17.toShortString());
                            throw new IllegalArgumentException(q10.toString());
                        }
                        e17.setEmpty();
                        v1.e eVar6 = E;
                        eVar6.a(e17);
                        if (e16.isEmpty()) {
                            e16.setEmpty();
                            eVar6.a(e16);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar5.f2074h, d10);
                            if ((absoluteGravity2 & 48) != 48 || (i17 = (e16.top - eVar5.topMargin) - eVar5.f2076j) >= (i18 = e10.top)) {
                                z11 = false;
                            } else {
                                A(i18 - i17, view);
                                z11 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - e16.bottom) - eVar5.bottomMargin) + eVar5.f2076j) < (i16 = e10.bottom)) {
                                A(height - i16, view);
                                z11 = true;
                            }
                            if (!z11) {
                                A(0, view);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i14 = (e16.left - eVar5.leftMargin) - eVar5.f2075i) >= (i15 = e10.left)) {
                                z12 = false;
                            } else {
                                z(i15 - i14, view);
                                z12 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - e16.right) - eVar5.rightMargin) + eVar5.f2075i) < (i13 = e10.right)) {
                                z(width - i13, view);
                                z12 = true;
                            }
                            if (!z12) {
                                z(0, view);
                            }
                            e16.setEmpty();
                            eVar6.a(e16);
                        }
                    }
                }
                if (i22 != 2) {
                    rect = rect7;
                    rect.set(((e) view.getLayoutParams()).f2083q);
                    if (rect.equals(e11)) {
                        i12 = i29;
                        i24 = i22;
                    } else {
                        ((e) view.getLayoutParams()).f2083q.set(e11);
                    }
                } else {
                    rect = rect7;
                }
                i12 = i29;
                for (int i32 = i11 + 1; i32 < i12; i32++) {
                    View view2 = (View) this.f2045a.get(i32);
                    e eVar7 = (e) view2.getLayoutParams();
                    Behavior behavior3 = eVar7.f2067a;
                    if (behavior3 != null && behavior3.f(view2, view)) {
                        if (i22 != 0 || !eVar7.f2082p) {
                            if (i22 != 2) {
                                z10 = behavior3.h(this, view2, view);
                            } else {
                                behavior3.i(this, view);
                                z10 = true;
                            }
                            if (i22 == 1) {
                                eVar7.f2082p = z10;
                            }
                        } else {
                            eVar7.f2082p = false;
                        }
                    }
                }
                i24 = i22;
            }
            i23 = i11 + 1;
            size = i12;
            e12 = rect;
        }
        Rect rect8 = e12;
        e10.setEmpty();
        v1.e eVar8 = E;
        eVar8.a(e10);
        e11.setEmpty();
        eVar8.a(e11);
        rect8.setEmpty();
        eVar8.a(rect8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(int r12, android.view.View r13) {
        /*
            r11 = this;
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r0
            android.view.View r1 = r0.f2077k
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0013
            int r4 = r0.f2072f
            r5 = -1
            if (r4 == r5) goto L_0x0013
            r4 = r3
            goto L_0x0014
        L_0x0013:
            r4 = r2
        L_0x0014:
            if (r4 != 0) goto L_0x01ab
            if (r1 == 0) goto L_0x0068
            android.graphics.Rect r0 = e()
            android.graphics.Rect r2 = e()
            r11.p(r1, r0)     // Catch:{ all -> 0x0058 }
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()     // Catch:{ all -> 0x0058 }
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r1     // Catch:{ all -> 0x0058 }
            int r3 = r13.getMeasuredWidth()     // Catch:{ all -> 0x0058 }
            int r4 = r13.getMeasuredHeight()     // Catch:{ all -> 0x0058 }
            r5 = r12
            r6 = r0
            r7 = r2
            r8 = r1
            r9 = r3
            r10 = r4
            q(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0058 }
            r11.f(r1, r2, r3, r4)     // Catch:{ all -> 0x0058 }
            int r12 = r2.left     // Catch:{ all -> 0x0058 }
            int r1 = r2.top     // Catch:{ all -> 0x0058 }
            int r3 = r2.right     // Catch:{ all -> 0x0058 }
            int r4 = r2.bottom     // Catch:{ all -> 0x0058 }
            r13.layout(r12, r1, r3, r4)     // Catch:{ all -> 0x0058 }
            r0.setEmpty()
            v1.e r12 = E
            r12.a(r0)
            r2.setEmpty()
            r12.a(r2)
            goto L_0x01aa
        L_0x0058:
            r12 = move-exception
            r0.setEmpty()
            v1.e r13 = E
            r13.a(r0)
            r2.setEmpty()
            r13.a(r2)
            throw r12
        L_0x0068:
            int r0 = r0.f2071e
            if (r0 < 0) goto L_0x00fd
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r1
            int r4 = r1.f2069c
            if (r4 != 0) goto L_0x0079
            r4 = 8388661(0x800035, float:1.1755018E-38)
        L_0x0079:
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r12)
            r5 = r4 & 7
            r4 = r4 & 112(0x70, float:1.57E-43)
            int r6 = r11.getWidth()
            int r7 = r11.getHeight()
            int r8 = r13.getMeasuredWidth()
            int r9 = r13.getMeasuredHeight()
            if (r12 != r3) goto L_0x0095
            int r0 = r6 - r0
        L_0x0095:
            int[] r12 = r11.f2053p
            if (r12 != 0) goto L_0x009e
            r11.toString()
        L_0x009c:
            r12 = r2
            goto L_0x00ab
        L_0x009e:
            if (r0 < 0) goto L_0x00a7
            int r10 = r12.length
            if (r0 < r10) goto L_0x00a4
            goto L_0x00a7
        L_0x00a4:
            r12 = r12[r0]
            goto L_0x00ab
        L_0x00a7:
            r11.toString()
            goto L_0x009c
        L_0x00ab:
            int r12 = r12 - r8
            if (r5 == r3) goto L_0x00b4
            r0 = 5
            if (r5 == r0) goto L_0x00b2
            goto L_0x00b7
        L_0x00b2:
            int r12 = r12 + r8
            goto L_0x00b7
        L_0x00b4:
            int r0 = r8 / 2
            int r12 = r12 + r0
        L_0x00b7:
            r0 = 16
            if (r4 == r0) goto L_0x00c3
            r0 = 80
            if (r4 == r0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            int r2 = r9 + 0
            goto L_0x00c6
        L_0x00c3:
            int r0 = r9 / 2
            int r2 = r2 + r0
        L_0x00c6:
            int r0 = r11.getPaddingLeft()
            int r3 = r1.leftMargin
            int r0 = r0 + r3
            int r3 = r11.getPaddingRight()
            int r6 = r6 - r3
            int r6 = r6 - r8
            int r3 = r1.rightMargin
            int r6 = r6 - r3
            int r12 = java.lang.Math.min(r12, r6)
            int r12 = java.lang.Math.max(r0, r12)
            int r0 = r11.getPaddingTop()
            int r3 = r1.topMargin
            int r0 = r0 + r3
            int r3 = r11.getPaddingBottom()
            int r7 = r7 - r3
            int r7 = r7 - r9
            int r1 = r1.bottomMargin
            int r7 = r7 - r1
            int r1 = java.lang.Math.min(r2, r7)
            int r0 = java.lang.Math.max(r0, r1)
            int r8 = r8 + r12
            int r9 = r9 + r0
            r13.layout(r12, r0, r8, r9)
            goto L_0x01aa
        L_0x00fd:
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r0
            android.graphics.Rect r7 = e()
            int r1 = r11.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r11.getPaddingTop()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r11.getWidth()
            int r4 = r11.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r0.rightMargin
            int r3 = r3 - r4
            int r4 = r11.getHeight()
            int r5 = r11.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r0.bottomMargin
            int r4 = r4 - r5
            r7.set(r1, r2, r3, r4)
            w1.w0 r1 = r11.f2058u
            if (r1 == 0) goto L_0x016e
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            boolean r1 = w1.d0.d.b(r11)
            if (r1 == 0) goto L_0x016e
            boolean r1 = w1.d0.d.b(r13)
            if (r1 != 0) goto L_0x016e
            int r1 = r7.left
            w1.w0 r2 = r11.f2058u
            int r2 = r2.c()
            int r2 = r2 + r1
            r7.left = r2
            int r1 = r7.top
            w1.w0 r2 = r11.f2058u
            int r2 = r2.e()
            int r2 = r2 + r1
            r7.top = r2
            int r1 = r7.right
            w1.w0 r2 = r11.f2058u
            int r2 = r2.d()
            int r1 = r1 - r2
            r7.right = r1
            int r1 = r7.bottom
            w1.w0 r2 = r11.f2058u
            int r2 = r2.b()
            int r1 = r1 - r2
            r7.bottom = r1
        L_0x016e:
            android.graphics.Rect r8 = e()
            int r0 = r0.f2069c
            r1 = r0 & 7
            if (r1 != 0) goto L_0x017c
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0 = r0 | r1
        L_0x017c:
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0182
            r0 = r0 | 48
        L_0x0182:
            r1 = r0
            int r2 = r13.getMeasuredWidth()
            int r3 = r13.getMeasuredHeight()
            r4 = r7
            r5 = r8
            r6 = r12
            w1.e.b(r1, r2, r3, r4, r5, r6)
            int r12 = r8.left
            int r0 = r8.top
            int r1 = r8.right
            int r2 = r8.bottom
            r13.layout(r12, r0, r1, r2)
            r7.setEmpty()
            v1.e r12 = E
            r12.a(r7)
            r8.setEmpty()
            r12.a(r8)
        L_0x01aa:
            return
        L_0x01ab:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u(int, android.view.View):void");
    }

    public final void v(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f2060w) {
            return true;
        }
        return false;
    }

    public final boolean w(MotionEvent motionEvent, int i10) {
        boolean z10;
        int i11;
        MotionEvent motionEvent2 = motionEvent;
        int i12 = i10;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f2047c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i13);
            } else {
                i11 = i13;
            }
            arrayList.add(getChildAt(i11));
        }
        g gVar = D;
        if (gVar != null) {
            Collections.sort(arrayList, gVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            e eVar = (e) view.getLayoutParams();
            Behavior behavior = eVar.f2067a;
            if ((!z11 && !z12) || actionMasked == 0) {
                if (!z11 && behavior != null) {
                    if (i12 == 0) {
                        z11 = behavior.k(this, view, motionEvent2);
                    } else if (i12 == 1) {
                        z11 = behavior.v(this, view, motionEvent2);
                    }
                    if (z11) {
                        this.f2054q = view;
                    }
                }
                if (eVar.f2067a == null) {
                    eVar.f2079m = false;
                }
                boolean z13 = eVar.f2079m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    eVar.f2079m = z10;
                }
                if (!z10 || z13) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z10 && !z12) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i12 == 0) {
                    behavior.k(this, view, motionEvent3);
                } else if (i12 == 1) {
                    behavior.v(this, view, motionEvent3);
                }
            }
        }
        arrayList.clear();
        return z11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r5 != false) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x018c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r12 = this;
            java.util.ArrayList r0 = r12.f2045a
            r0.clear()
            h1.a r0 = r12.f2046b
            java.lang.Object r1 = r0.f10528b
            v0.h r1 = (v0.h) r1
            int r1 = r1.f16007c
            r2 = 0
            r3 = r2
        L_0x000f:
            if (r3 >= r1) goto L_0x002a
            java.lang.Object r4 = r0.f10528b
            v0.h r4 = (v0.h) r4
            java.lang.Object r4 = r4.m(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0027
            r4.clear()
            java.lang.Object r5 = r0.f10527a
            v1.d r5 = (v1.d) r5
            r5.a(r4)
        L_0x0027:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x002a:
            java.lang.Object r0 = r0.f10528b
            v0.h r0 = (v0.h) r0
            r0.clear()
            int r0 = r12.getChildCount()
            r1 = r2
        L_0x0036:
            if (r1 >= r0) goto L_0x01b9
            android.view.View r3 = r12.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r4 = r(r3)
            int r5 = r4.f2072f
            r6 = -1
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x004d
            r4.f2078l = r7
            r4.f2077k = r7
            goto L_0x00d3
        L_0x004d:
            android.view.View r5 = r4.f2077k
            if (r5 == 0) goto L_0x007e
            int r5 = r5.getId()
            int r6 = r4.f2072f
            if (r5 == r6) goto L_0x005a
            goto L_0x0077
        L_0x005a:
            android.view.View r5 = r4.f2077k
            android.view.ViewParent r6 = r5.getParent()
        L_0x0060:
            if (r6 == r12) goto L_0x0079
            if (r6 == 0) goto L_0x0073
            if (r6 != r3) goto L_0x0067
            goto L_0x0073
        L_0x0067:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x006e
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x006e:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0060
        L_0x0073:
            r4.f2078l = r7
            r4.f2077k = r7
        L_0x0077:
            r5 = r2
            goto L_0x007c
        L_0x0079:
            r4.f2078l = r5
            r5 = r8
        L_0x007c:
            if (r5 != 0) goto L_0x00d3
        L_0x007e:
            int r5 = r4.f2072f
            android.view.View r5 = r12.findViewById(r5)
            r4.f2077k = r5
            if (r5 == 0) goto L_0x00c9
            if (r5 != r12) goto L_0x009d
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x0095
            r4.f2078l = r7
            r4.f2077k = r7
            goto L_0x00d3
        L_0x0095:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x009d:
            android.view.ViewParent r6 = r5.getParent()
        L_0x00a1:
            if (r6 == r12) goto L_0x00c6
            if (r6 == 0) goto L_0x00c6
            if (r6 != r3) goto L_0x00ba
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x00b2
            r4.f2078l = r7
            r4.f2077k = r7
            goto L_0x00d3
        L_0x00b2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x00c1
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00c1:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x00a1
        L_0x00c6:
            r4.f2078l = r5
            goto L_0x00d3
        L_0x00c9:
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x0194
            r4.f2078l = r7
            r4.f2077k = r7
        L_0x00d3:
            h1.a r5 = r12.f2046b
            java.lang.Object r6 = r5.f10528b
            v0.h r6 = (v0.h) r6
            boolean r6 = r6.containsKey(r3)
            if (r6 != 0) goto L_0x00e6
            java.lang.Object r5 = r5.f10528b
            v0.h r5 = (v0.h) r5
            r5.put(r3, r7)
        L_0x00e6:
            r5 = r2
        L_0x00e7:
            if (r5 >= r0) goto L_0x0190
            if (r5 != r1) goto L_0x00ed
            goto L_0x018c
        L_0x00ed:
            android.view.View r6 = r12.getChildAt(r5)
            android.view.View r9 = r4.f2078l
            if (r6 == r9) goto L_0x0124
            java.util.WeakHashMap<android.view.View, w1.q0> r9 = w1.d0.f16298a
            int r9 = w1.d0.e.d(r12)
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r10
            int r10 = r10.f2073g
            int r10 = android.view.Gravity.getAbsoluteGravity(r10, r9)
            if (r10 == 0) goto L_0x0114
            int r11 = r4.f2074h
            int r9 = android.view.Gravity.getAbsoluteGravity(r11, r9)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x0114
            r9 = r8
            goto L_0x0115
        L_0x0114:
            r9 = r2
        L_0x0115:
            if (r9 != 0) goto L_0x0124
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r9 = r4.f2067a
            if (r9 == 0) goto L_0x0122
            boolean r9 = r9.f(r3, r6)
            if (r9 == 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r9 = r2
            goto L_0x0125
        L_0x0124:
            r9 = r8
        L_0x0125:
            if (r9 == 0) goto L_0x018c
            h1.a r9 = r12.f2046b
            java.lang.Object r9 = r9.f10528b
            v0.h r9 = (v0.h) r9
            boolean r9 = r9.containsKey(r6)
            if (r9 != 0) goto L_0x0146
            h1.a r9 = r12.f2046b
            java.lang.Object r10 = r9.f10528b
            v0.h r10 = (v0.h) r10
            boolean r10 = r10.containsKey(r6)
            if (r10 != 0) goto L_0x0146
            java.lang.Object r9 = r9.f10528b
            v0.h r9 = (v0.h) r9
            r9.put(r6, r7)
        L_0x0146:
            h1.a r9 = r12.f2046b
            java.lang.Object r10 = r9.f10528b
            v0.h r10 = (v0.h) r10
            boolean r10 = r10.containsKey(r6)
            if (r10 == 0) goto L_0x0184
            java.lang.Object r10 = r9.f10528b
            v0.h r10 = (v0.h) r10
            boolean r10 = r10.containsKey(r3)
            if (r10 == 0) goto L_0x0184
            java.lang.Object r10 = r9.f10528b
            v0.h r10 = (v0.h) r10
            java.lang.Object r10 = r10.getOrDefault(r6, r7)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0180
            java.lang.Object r10 = r9.f10527a
            v1.d r10 = (v1.d) r10
            java.lang.Object r10 = r10.b()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0179
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0179:
            java.lang.Object r9 = r9.f10528b
            v0.h r9 = (v0.h) r9
            r9.put(r6, r10)
        L_0x0180:
            r10.add(r3)
            goto L_0x018c
        L_0x0184:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x018c:
            int r5 = r5 + 1
            goto L_0x00e7
        L_0x0190:
            int r1 = r1 + 1
            goto L_0x0036
        L_0x0194:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            android.content.res.Resources r2 = r12.getResources()
            int r4 = r4.f2072f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01b9:
            java.util.ArrayList r0 = r12.f2045a
            h1.a r1 = r12.f2046b
            java.lang.Object r3 = r1.f10529c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.lang.Object r3 = r1.f10530d
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.clear()
            java.lang.Object r3 = r1.f10528b
            v0.h r3 = (v0.h) r3
            int r3 = r3.f16007c
        L_0x01d1:
            if (r2 >= r3) goto L_0x01e9
            java.lang.Object r4 = r1.f10528b
            v0.h r4 = (v0.h) r4
            java.lang.Object r4 = r4.i(r2)
            java.lang.Object r5 = r1.f10529c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r1.f10530d
            java.util.HashSet r6 = (java.util.HashSet) r6
            r1.b(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x01d1
        L_0x01e9:
            java.lang.Object r1 = r1.f10529c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.addAll(r1)
            java.util.ArrayList r0 = r12.f2045a
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.x():void");
    }

    public final void y(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Behavior behavior = ((e) childAt.getLayoutParams()).f2067a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    behavior.k(this, childAt, obtain);
                } else {
                    behavior.v(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).f2079m = false;
        }
        this.f2054q = null;
        this.f2051n = false;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.coordinatorLayoutStyle);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArray;
        this.f2045a = new ArrayList();
        this.f2046b = new h1.a(0);
        this.f2047c = new ArrayList();
        this.f2048d = new ArrayList();
        this.f2049e = new int[2];
        this.f2050f = new int[2];
        this.f2063z = new p();
        if (i10 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, 0, R$style.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, i10, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, R$styleable.CoordinatorLayout, attributeSet, typedArray, 0, R$style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, R$styleable.CoordinatorLayout, attributeSet, typedArray, i10, 0);
            }
        }
        int resourceId = typedArray.getResourceId(R$styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2053p = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f2053p.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = this.f2053p;
                iArr[i11] = (int) (((float) iArr[i11]) * f10);
            }
        }
        this.f2060w = typedArray.getDrawable(R$styleable.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        B();
        super.setOnHierarchyChangeListener(new d());
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.d.c(this) == 0) {
            d0.d.s(this, 1);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public SparseArray<Parcelable> f2064c;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2064c = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f2064c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            int i11;
            parcel.writeParcelable(this.f2188a, i10);
            SparseArray<Parcelable> sparseArray = this.f2064c;
            if (sparseArray != null) {
                i11 = sparseArray.size();
            } else {
                i11 = 0;
            }
            parcel.writeInt(i11);
            int[] iArr = new int[i11];
            Parcelable[] parcelableArr = new Parcelable[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = this.f2064c.keyAt(i12);
                parcelableArr[i12] = this.f2064c.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public Behavior f2067a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2068b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f2069c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2070d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f2071e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2072f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2073g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f2074h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f2075i;

        /* renamed from: j  reason: collision with root package name */
        public int f2076j;

        /* renamed from: k  reason: collision with root package name */
        public View f2077k;

        /* renamed from: l  reason: collision with root package name */
        public View f2078l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2079m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f2080n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f2081o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f2082p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f2083q = new Rect();

        public e() {
            super(-2, -2);
        }

        public final boolean a(int i10) {
            if (i10 == 0) {
                return this.f2080n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f2081o;
        }

        public final void b(Behavior behavior) {
            Behavior behavior2 = this.f2067a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.j();
                }
                this.f2067a = behavior;
                this.f2068b = true;
                if (behavior != null) {
                    behavior.g(this);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Behavior behavior;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout_Layout);
            this.f2069c = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2072f = obtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2070d = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2071e = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2073g = obtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2074h = obtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i10 = R$styleable.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f2068b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(i10);
                String str = CoordinatorLayout.A;
                if (TextUtils.isEmpty(string)) {
                    behavior = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.A;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = CoordinatorLayout.C;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.B);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        behavior = (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e10) {
                        throw new RuntimeException(b0.r("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f2067a = behavior;
            }
            obtainStyledAttributes.recycle();
            Behavior behavior2 = this.f2067a;
            if (behavior2 != null) {
                behavior2.g(this);
            }
        }

        public e(e eVar) {
            super(eVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
