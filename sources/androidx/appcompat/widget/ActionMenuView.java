package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.app.s;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;

public class ActionMenuView extends LinearLayoutCompat implements f.b, k {
    public ActionMenuPresenter A;
    public j.a B;
    public f.a C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public d H;

    /* renamed from: w  reason: collision with root package name */
    public f f766w;

    /* renamed from: x  reason: collision with root package name */
    public Context f767x;

    /* renamed from: y  reason: collision with root package name */
    public int f768y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f769z;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f770a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f771b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f772c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f773d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f774e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f775f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f770a = layoutParams.f770a;
        }

        public LayoutParams() {
            super(-2, -2);
            this.f770a = false;
        }
    }

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements j.a {
        public final void c(f fVar, boolean z10) {
        }

        public final boolean d(f fVar) {
            return false;
        }
    }

    public class c implements f.a {
        public c() {
        }

        public final boolean a(f fVar, MenuItem menuItem) {
            boolean z10;
            boolean z11;
            d dVar = ActionMenuView.this.H;
            if (dVar == null) {
                return false;
            }
            Toolbar.a aVar = (Toolbar.a) dVar;
            Iterator<w1.k> it = Toolbar.this.N.f16324b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().a(menuItem)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                Toolbar.g gVar = Toolbar.this.P;
                if (gVar != null) {
                    z11 = s.this.f474b.onMenuItemSelected(0, menuItem);
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                return true;
            }
            return false;
        }

        public final void b(f fVar) {
            f.a aVar = ActionMenuView.this.C;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public interface d {
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static LayoutParams j(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (layoutParams2.gravity <= 0) {
                layoutParams2.gravity = 16;
            }
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams();
        layoutParams3.gravity = 16;
        return layoutParams3;
    }

    public final boolean a(h hVar) {
        return this.f766w.q(hVar, (j) null, 0);
    }

    public final void b(f fVar) {
        this.f766w = fVar;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final LinearLayoutCompat.LayoutParams f() {
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public final LinearLayoutCompat.LayoutParams g(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f766w == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.f766w = fVar;
            fVar.f619e = new c();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.A = actionMenuPresenter;
            actionMenuPresenter.f750t = true;
            actionMenuPresenter.f751u = true;
            j.a aVar = this.B;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter.f566e = aVar;
            this.f766w.b(actionMenuPresenter, this.f767x);
            ActionMenuPresenter actionMenuPresenter2 = this.A;
            actionMenuPresenter2.f569o = this;
            this.f766w = actionMenuPresenter2.f564c;
        }
        return this.f766w;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.A;
        ActionMenuPresenter.d dVar = actionMenuPresenter.f747q;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (actionMenuPresenter.f749s) {
            return actionMenuPresenter.f748r;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f768y;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams h(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final boolean k(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        if (i10 <= 0 || !(childAt2 instanceof a)) {
            return z10;
        }
        return z10 | ((a) childAt2).b();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.A;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.d(false);
            if (this.A.j()) {
                this.A.b();
                this.A.o();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.A;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar = actionMenuPresenter.B;
            if (aVar != null && aVar.b()) {
                aVar.f678j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        if (!this.D) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i17 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i18 = i12 - i10;
        int paddingRight = (i18 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = u0.a(this);
        int i19 = 0;
        int i20 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f770a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i21)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i15 = getPaddingLeft() + layoutParams.leftMargin;
                        i16 = i15 + measuredWidth;
                    } else {
                        i16 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i15 = i16 - measuredWidth;
                    }
                    int i22 = i17 - (measuredHeight / 2);
                    childAt.layout(i15, i22, i16, measuredHeight + i22);
                    paddingRight -= measuredWidth;
                    i19 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    k(i21);
                    i20++;
                }
            }
        }
        if (childCount == 1 && i19 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i23 = (i18 / 2) - (measuredWidth2 / 2);
            int i24 = i17 - (measuredHeight2 / 2);
            childAt2.layout(i23, i24, measuredWidth2 + i23, measuredHeight2 + i24);
            return;
        }
        int i25 = i20 - (i19 ^ 1);
        if (i25 > 0) {
            i14 = paddingRight / i25;
        } else {
            i14 = 0;
        }
        int max = Math.max(0, i14);
        if (a10) {
            int width = getWidth() - getPaddingRight();
            for (int i26 = 0; i26 < childCount; i26++) {
                View childAt3 = getChildAt(i26);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f770a) {
                    int i27 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i28 = i17 - (measuredHeight3 / 2);
                    childAt3.layout(i27 - measuredWidth3, i28, i27, measuredHeight3 + i28);
                    width = i27 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt4 = getChildAt(i29);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f770a) {
                int i30 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i31 = i17 - (measuredHeight4 / 2);
                childAt4.layout(i30, i31, i30 + measuredWidth4, measuredHeight4 + i31);
                paddingLeft = measuredWidth4 + layoutParams3.rightMargin + max + i30;
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z13;
        boolean z14;
        int i19;
        ActionMenuItemView actionMenuItemView;
        boolean z15;
        int i20;
        boolean z16;
        f fVar;
        boolean z17 = this.D;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z10;
        if (z17 != z10) {
            this.E = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (!(!this.D || (fVar = this.f766w) == null || size == this.E)) {
            this.E = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.D || childCount <= 0) {
            int i21 = i11;
            for (int i22 = 0; i22 < childCount; i22++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i22).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i23 = size2 - paddingRight;
        int i24 = this.F;
        int i25 = i23 / i24;
        int i26 = i23 % i24;
        if (i25 == 0) {
            setMeasuredDimension(i23, 0);
            return;
        }
        int i27 = (i26 / i25) + i24;
        int childCount2 = getChildCount();
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        boolean z18 = false;
        int i32 = 0;
        long j10 = 0;
        while (i31 < childCount2) {
            View childAt = getChildAt(i31);
            int i33 = size3;
            if (childAt.getVisibility() == 8) {
                i15 = mode;
                i16 = i23;
                i17 = paddingBottom;
            } else {
                boolean z19 = childAt instanceof ActionMenuItemView;
                int i34 = i29 + 1;
                if (z19) {
                    int i35 = this.G;
                    i18 = i34;
                    z13 = false;
                    childAt.setPadding(i35, 0, i35, 0);
                } else {
                    i18 = i34;
                    z13 = false;
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f775f = z13;
                layoutParams2.f772c = z13 ? 1 : 0;
                layoutParams2.f771b = z13;
                layoutParams2.f773d = z13;
                layoutParams2.leftMargin = z13;
                layoutParams2.rightMargin = z13;
                if (!z19 || !((ActionMenuItemView) childAt).l()) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                layoutParams2.f774e = z14;
                if (layoutParams2.f770a) {
                    i19 = 1;
                } else {
                    i19 = i25;
                }
                i16 = i23;
                LayoutParams layoutParams3 = (LayoutParams) childAt.getLayoutParams();
                i15 = mode;
                i17 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                if (z19) {
                    actionMenuItemView = (ActionMenuItemView) childAt;
                } else {
                    actionMenuItemView = null;
                }
                if (actionMenuItemView == null || !actionMenuItemView.l()) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (i19 <= 0 || (z15 && i19 < 2)) {
                    i20 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i19 * i27, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i20 = measuredWidth / i27;
                    if (measuredWidth % i27 != 0) {
                        i20++;
                    }
                    if (z15 && i20 < 2) {
                        i20 = 2;
                    }
                }
                if (layoutParams3.f770a || !z15) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                layoutParams3.f773d = z16;
                layoutParams3.f771b = i20;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i27 * i20, 1073741824), makeMeasureSpec);
                i30 = Math.max(i30, i20);
                if (layoutParams2.f773d) {
                    i32++;
                }
                if (layoutParams2.f770a) {
                    z18 = true;
                }
                i25 -= i20;
                i28 = Math.max(i28, childAt.getMeasuredHeight());
                if (i20 == 1) {
                    j10 |= (long) (1 << i31);
                }
                i29 = i18;
            }
            i31++;
            size3 = i33;
            paddingBottom = i17;
            i23 = i16;
            mode = i15;
        }
        int i36 = mode;
        int i37 = i23;
        int i38 = size3;
        if (!z18 || i29 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z20 = false;
        while (i32 > 0 && i25 > 0) {
            int i39 = Integer.MAX_VALUE;
            int i40 = 0;
            long j11 = 0;
            for (int i41 = 0; i41 < childCount2; i41++) {
                LayoutParams layoutParams4 = (LayoutParams) getChildAt(i41).getLayoutParams();
                if (layoutParams4.f773d) {
                    int i42 = layoutParams4.f771b;
                    if (i42 < i39) {
                        j11 = 1 << i41;
                        i39 = i42;
                        i40 = 1;
                    } else if (i42 == i39) {
                        i40++;
                        j11 |= 1 << i41;
                    }
                }
            }
            j10 |= j11;
            if (i40 > i25) {
                break;
            }
            int i43 = i39 + 1;
            int i44 = 0;
            while (i44 < childCount2) {
                View childAt2 = getChildAt(i44);
                LayoutParams layoutParams5 = (LayoutParams) childAt2.getLayoutParams();
                int i45 = childMeasureSpec;
                int i46 = childCount2;
                long j12 = (long) (1 << i44);
                if ((j11 & j12) != 0) {
                    if (z11 && layoutParams5.f774e && i25 == 1) {
                        int i47 = this.G;
                        childAt2.setPadding(i47 + i27, 0, i47, 0);
                    }
                    layoutParams5.f771b++;
                    layoutParams5.f775f = true;
                    i25--;
                } else if (layoutParams5.f771b == i43) {
                    j10 |= j12;
                }
                i44++;
                childMeasureSpec = i45;
                childCount2 = i46;
            }
            z20 = true;
        }
        int i48 = childMeasureSpec;
        int i49 = childCount2;
        if (z18 || i29 != 1) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (i25 <= 0 || j10 == 0 || (i25 >= i29 - 1 && !z12 && i30 <= 1)) {
            i12 = i49;
        } else {
            float bitCount = (float) Long.bitCount(j10);
            if (!z12) {
                if ((j10 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f774e) {
                    bitCount -= 0.5f;
                }
                int i50 = i49 - 1;
                if ((j10 & ((long) (1 << i50))) != 0 && !((LayoutParams) getChildAt(i50).getLayoutParams()).f774e) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i14 = (int) (((float) (i25 * i27)) / bitCount);
            } else {
                i14 = 0;
            }
            boolean z21 = z20;
            i12 = i49;
            for (int i51 = 0; i51 < i12; i51++) {
                if ((j10 & ((long) (1 << i51))) != 0) {
                    View childAt3 = getChildAt(i51);
                    LayoutParams layoutParams6 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams6.f772c = i14;
                        layoutParams6.f775f = true;
                        if (i51 == 0 && !layoutParams6.f774e) {
                            layoutParams6.leftMargin = (-i14) / 2;
                        }
                        z21 = true;
                    } else {
                        if (layoutParams6.f770a) {
                            layoutParams6.f772c = i14;
                            layoutParams6.f775f = true;
                            layoutParams6.rightMargin = (-i14) / 2;
                            z21 = true;
                        } else {
                            if (i51 != 0) {
                                layoutParams6.leftMargin = i14 / 2;
                            }
                            if (i51 != i12 - 1) {
                                layoutParams6.rightMargin = i14 / 2;
                            }
                        }
                    }
                }
            }
            z20 = z21;
        }
        if (z20) {
            for (int i52 = 0; i52 < i12; i52++) {
                View childAt4 = getChildAt(i52);
                LayoutParams layoutParams7 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams7.f775f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams7.f771b * i27) + layoutParams7.f772c, 1073741824), i48);
                }
            }
        }
        if (i36 != 1073741824) {
            i13 = i28;
        } else {
            i13 = i38;
        }
        setMeasuredDimension(i37, i13);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.A.f755y = z10;
    }

    public void setMenuCallbacks(j.a aVar, f.a aVar2) {
        this.B = aVar;
        this.C = aVar2;
    }

    public void setOnMenuItemClickListener(d dVar) {
        this.H = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.A;
        ActionMenuPresenter.d dVar = actionMenuPresenter.f747q;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.f749s = true;
        actionMenuPresenter.f748r = drawable;
    }

    public void setOverflowReserved(boolean z10) {
        this.f769z = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f768y != i10) {
            this.f768y = i10;
            if (i10 == 0) {
                this.f767x = getContext();
            } else {
                this.f767x = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.A = actionMenuPresenter;
        actionMenuPresenter.f569o = this;
        this.f766w = actionMenuPresenter.f564c;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.F = (int) (56.0f * f10);
        this.G = (int) (f10 * 4.0f);
        this.f767x = context;
        this.f768y = 0;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
