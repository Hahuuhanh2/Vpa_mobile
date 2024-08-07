package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.app.v;
import androidx.appcompat.view.menu.j;
import java.util.WeakHashMap;
import n1.e;
import w1.d0;
import w1.n;
import w1.o;
import w1.p;
import w1.q0;
import w1.w0;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements v, n, o {
    public static final int[] I = {R$attr.actionBarSize, 16842841};
    public w0 A;
    public d B;
    public OverScroller C;
    public ViewPropertyAnimator D;
    public final a E;
    public final b F;
    public final c G;
    public final p H;

    /* renamed from: a  reason: collision with root package name */
    public int f725a;

    /* renamed from: b  reason: collision with root package name */
    public int f726b;

    /* renamed from: c  reason: collision with root package name */
    public ContentFrameLayout f727c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f728d;

    /* renamed from: e  reason: collision with root package name */
    public w f729e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f730f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f731n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f732o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f733p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f734q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f735r;

    /* renamed from: s  reason: collision with root package name */
    public int f736s;

    /* renamed from: t  reason: collision with root package name */
    public int f737t;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f738u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f739v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f740w;

    /* renamed from: x  reason: collision with root package name */
    public w0 f741x;

    /* renamed from: y  reason: collision with root package name */
    public w0 f742y;

    /* renamed from: z  reason: collision with root package name */
    public w0 f743z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = null;
            actionBarOverlayLayout.f735r = false;
        }

        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = null;
            actionBarOverlayLayout.f735r = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = actionBarOverlayLayout.f728d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.E);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = actionBarOverlayLayout.f728d.animate().translationY((float) (-ActionBarOverlayLayout.this.f728d.getHeight())).setListener(ActionBarOverlayLayout.this.E);
        }
    }

    public interface d {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public static boolean n(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        int i10;
        LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
        int i11 = layoutParams.leftMargin;
        int i12 = rect.left;
        if (i11 != i12) {
            layoutParams.leftMargin = i12;
            z11 = true;
        } else {
            z11 = false;
        }
        int i13 = layoutParams.topMargin;
        int i14 = rect.top;
        if (i13 != i14) {
            layoutParams.topMargin = i14;
            z11 = true;
        }
        int i15 = layoutParams.rightMargin;
        int i16 = rect.right;
        if (i15 != i16) {
            layoutParams.rightMargin = i16;
            z11 = true;
        }
        if (!z10 || layoutParams.bottomMargin == (i10 = rect.bottom)) {
            return z11;
        }
        layoutParams.bottomMargin = i10;
        return true;
    }

    public final boolean a() {
        q();
        return this.f729e.a();
    }

    public final boolean b() {
        q();
        return this.f729e.b();
    }

    public final boolean c() {
        q();
        return this.f729e.c();
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final boolean d() {
        q();
        return this.f729e.d();
    }

    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f730f != null && !this.f731n) {
            if (this.f728d.getVisibility() == 0) {
                i10 = (int) (this.f728d.getTranslationY() + ((float) this.f728d.getBottom()) + 0.5f);
            } else {
                i10 = 0;
            }
            this.f730f.setBounds(0, i10, getWidth(), this.f730f.getIntrinsicHeight() + i10);
            this.f730f.draw(canvas);
        }
    }

    public final boolean e() {
        q();
        return this.f729e.e();
    }

    public final void f(int i10) {
        q();
        if (i10 == 2) {
            this.f729e.o();
        } else if (i10 == 5) {
            this.f729e.p();
        } else if (i10 == 109) {
            setOverlayMode(true);
        }
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g() {
        q();
        this.f729e.f();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f728d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        p pVar = this.H;
        return pVar.f16346b | pVar.f16345a;
    }

    public CharSequence getTitle() {
        q();
        return this.f729e.getTitle();
    }

    public final void h(int i10, View view) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void i(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        j(view, i10, i11, i12, i13, i14);
    }

    public final void j(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public final boolean k(View view, View view2, int i10, int i11) {
        if (i11 != 0 || !onStartNestedScroll(view, view2, i10)) {
            return false;
        }
        return true;
    }

    public final void l(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public final void m(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public final void o() {
        removeCallbacks(this.F);
        removeCallbacks(this.G);
        ViewPropertyAnimator viewPropertyAnimator = this.D;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        q();
        w0 i10 = w0.i(this, windowInsets);
        boolean n10 = n(this.f728d, new Rect(i10.c(), i10.e(), i10.d(), i10.b()), false);
        Rect rect = this.f738u;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.i.b(this, i10, rect);
        Rect rect2 = this.f738u;
        w0 l10 = i10.f16391a.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f741x = l10;
        boolean z10 = true;
        if (!this.f742y.equals(l10)) {
            this.f742y = this.f741x;
            n10 = true;
        }
        if (!this.f739v.equals(this.f738u)) {
            this.f739v.set(this.f738u);
        } else {
            z10 = n10;
        }
        if (z10) {
            requestLayout();
        }
        return i10.f16391a.a().f16391a.c().f16391a.b().h();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p(getContext());
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.h.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = layoutParams.leftMargin + paddingLeft;
                int i16 = layoutParams.topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        w0.e eVar;
        q();
        measureChildWithMargins(this.f728d, i10, 0, i11, 0);
        LayoutParams layoutParams = (LayoutParams) this.f728d.getLayoutParams();
        int max = Math.max(0, this.f728d.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f728d.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f728d.getMeasuredState());
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if ((d0.d.g(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = this.f725a;
            if (this.f733p && this.f728d.getTabContainer() != null) {
                i12 += this.f725a;
            }
        } else {
            i12 = this.f728d.getVisibility() != 8 ? this.f728d.getMeasuredHeight() : 0;
        }
        this.f740w.set(this.f738u);
        w0 w0Var = this.f741x;
        this.f743z = w0Var;
        if (this.f732o || z10) {
            e b10 = e.b(w0Var.c(), this.f743z.e() + i12, this.f743z.d(), this.f743z.b() + 0);
            w0 w0Var2 = this.f743z;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                eVar = new w0.d(w0Var2);
            } else if (i13 >= 29) {
                eVar = new w0.c(w0Var2);
            } else {
                eVar = new w0.b(w0Var2);
            }
            eVar.g(b10);
            this.f743z = eVar.b();
        } else {
            Rect rect = this.f740w;
            rect.top += i12;
            rect.bottom += 0;
            this.f743z = w0Var.f16391a.l(0, i12, 0, 0);
        }
        n(this.f727c, this.f740w, true);
        if (!this.A.equals(this.f743z)) {
            w0 w0Var3 = this.f743z;
            this.A = w0Var3;
            d0.b(this.f727c, w0Var3);
        }
        measureChildWithMargins(this.f727c, i10, 0, i11, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f727c.getLayoutParams();
        int max3 = Math.max(max, this.f727c.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f727c.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f727c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        boolean z11 = false;
        if (!this.f734q || !z10) {
            return false;
        }
        this.C.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.C.getFinalY() > this.f728d.getHeight()) {
            z11 = true;
        }
        if (z11) {
            o();
            this.G.run();
        } else {
            o();
            this.F.run();
        }
        this.f735r = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f736s + i11;
        this.f736s = i14;
        setActionBarHideOffset(i14);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (androidx.appcompat.app.v) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            w1.p r1 = r0.H
            r1.f16345a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f736s = r1
            r0.o()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.B
            if (r1 == 0) goto L_0x001d
            androidx.appcompat.app.v r1 = (androidx.appcompat.app.v) r1
            l.g r2 = r1.f517t
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.f517t = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f728d.getVisibility() != 0) {
            return false;
        }
        return this.f734q;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f734q && !this.f735r) {
            if (this.f736s <= this.f728d.getHeight()) {
                o();
                postDelayed(this.F, 600);
                return;
            }
            o();
            postDelayed(this.G, 600);
        }
    }

    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i10);
        q();
        int i11 = this.f737t ^ i10;
        this.f737t = i10;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d dVar = this.B;
        if (dVar != null) {
            ((v) dVar).f513p = !z11;
            if (z10 || !z11) {
                v vVar = (v) dVar;
                if (vVar.f514q) {
                    vVar.f514q = false;
                    vVar.u(true);
                }
            } else {
                v vVar2 = (v) dVar;
                if (!vVar2.f514q) {
                    vVar2.f514q = true;
                    vVar2.u(true);
                }
            }
        }
        if ((i11 & 256) != 0 && this.B != null) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.h.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f726b = i10;
        d dVar = this.B;
        if (dVar != null) {
            ((v) dVar).f512o = i10;
        }
    }

    public final void p(Context context) {
        boolean z10;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(I);
        boolean z11 = false;
        this.f725a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f730f = drawable;
        if (drawable == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        }
        this.f731n = z11;
        this.C = new OverScroller(context);
    }

    public final void q() {
        w wVar;
        if (this.f727c == null) {
            this.f727c = (ContentFrameLayout) findViewById(R$id.action_bar_activity_content);
            this.f728d = (ActionBarContainer) findViewById(R$id.action_bar_container);
            View findViewById = findViewById(R$id.action_bar);
            if (findViewById instanceof w) {
                wVar = (w) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wVar = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder q10 = android.support.v4.media.a.q("Can't make a decor toolbar out of ");
                q10.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(q10.toString());
            }
            this.f729e = wVar;
        }
    }

    public void setActionBarHideOffset(int i10) {
        o();
        this.f728d.setTranslationY((float) (-Math.max(0, Math.min(i10, this.f728d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.B = dVar;
        if (getWindowToken() != null) {
            ((v) this.B).f512o = this.f726b;
            int i10 = this.f737t;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f733p = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f734q) {
            this.f734q = z10;
            if (!z10) {
                o();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        q();
        this.f729e.setIcon(i10);
    }

    public void setLogo(int i10) {
        q();
        this.f729e.k(i10);
    }

    public void setMenu(Menu menu, j.a aVar) {
        q();
        this.f729e.setMenu(menu, aVar);
    }

    public void setMenuPrepared() {
        q();
        this.f729e.setMenuPrepared();
    }

    public void setOverlayMode(boolean z10) {
        boolean z11;
        this.f732o = z10;
        if (!z10 || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f731n = z11;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        q();
        this.f729e.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        q();
        this.f729e.setWindowTitle(charSequence);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f726b = 0;
        this.f738u = new Rect();
        this.f739v = new Rect();
        this.f740w = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        w0 w0Var = w0.f16390b;
        this.f741x = w0Var;
        this.f742y = w0Var;
        this.f743z = w0Var;
        this.A = w0Var;
        this.E = new a();
        this.F = new b();
        this.G = new c();
        p(context);
        this.H = new p();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        q();
        this.f729e.setIcon(drawable);
    }
}
