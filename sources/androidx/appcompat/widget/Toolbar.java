package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.FragmentManager;
import d.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import w1.d0;
import w1.h;
import w1.i;
import w1.k;
import w1.q0;

public class Toolbar extends ViewGroup implements h {
    public f0 A;
    public int B;
    public int C;
    public int D;
    public CharSequence E;
    public CharSequence F;
    public ColorStateList G;
    public ColorStateList H;
    public boolean I;
    public boolean J;
    public final ArrayList<View> K;
    public final ArrayList<View> L;
    public final int[] M;
    public final i N;
    public ArrayList<MenuItem> O;
    public g P;
    public final a Q;
    public p0 R;
    public ActionMenuPresenter S;
    public f T;
    public j.a U;
    public f.a V;
    public boolean W;

    /* renamed from: a  reason: collision with root package name */
    public ActionMenuView f1006a;

    /* renamed from: a0  reason: collision with root package name */
    public OnBackInvokedCallback f1007a0;

    /* renamed from: b  reason: collision with root package name */
    public AppCompatTextView f1008b;

    /* renamed from: b0  reason: collision with root package name */
    public OnBackInvokedDispatcher f1009b0;

    /* renamed from: c  reason: collision with root package name */
    public AppCompatTextView f1010c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1011c0;

    /* renamed from: d  reason: collision with root package name */
    public AppCompatImageButton f1012d;

    /* renamed from: d0  reason: collision with root package name */
    public final b f1013d0;

    /* renamed from: e  reason: collision with root package name */
    public AppCompatImageView f1014e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1015f;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f1016n;

    /* renamed from: o  reason: collision with root package name */
    public AppCompatImageButton f1017o;

    /* renamed from: p  reason: collision with root package name */
    public View f1018p;

    /* renamed from: q  reason: collision with root package name */
    public Context f1019q;

    /* renamed from: r  reason: collision with root package name */
    public int f1020r;

    /* renamed from: s  reason: collision with root package name */
    public int f1021s;

    /* renamed from: t  reason: collision with root package name */
    public int f1022t;

    /* renamed from: u  reason: collision with root package name */
    public int f1023u;

    /* renamed from: v  reason: collision with root package name */
    public int f1024v;

    /* renamed from: w  reason: collision with root package name */
    public int f1025w;

    /* renamed from: x  reason: collision with root package name */
    public int f1026x;

    /* renamed from: y  reason: collision with root package name */
    public int f1027y;

    /* renamed from: z  reason: collision with root package name */
    public int f1028z;

    public class a implements ActionMenuView.d {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            ActionMenuPresenter actionMenuPresenter;
            ActionMenuView actionMenuView = Toolbar.this.f1006a;
            if (actionMenuView != null && (actionMenuPresenter = actionMenuView.A) != null) {
                actionMenuPresenter.o();
            }
        }
    }

    public class c implements f.a {
        public c() {
        }

        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            f.a aVar = Toolbar.this.V;
            if (aVar == null || !aVar.a(fVar, menuItem)) {
                return false;
            }
            return true;
        }

        public final void b(androidx.appcompat.view.menu.f fVar) {
            boolean z10;
            ActionMenuPresenter actionMenuPresenter = Toolbar.this.f1006a.A;
            if (actionMenuPresenter == null || !actionMenuPresenter.j()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                Iterator<k> it = Toolbar.this.N.f16324b.iterator();
                while (it.hasNext()) {
                    it.next().d(fVar);
                }
            }
            f.a aVar = Toolbar.this.V;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public final void onClick(View view) {
            androidx.appcompat.view.menu.h hVar;
            f fVar = Toolbar.this.T;
            if (fVar == null) {
                hVar = null;
            } else {
                hVar = fVar.f1037b;
            }
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new x(runnable, 1);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements j {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f1036a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f1037b;

        public f() {
        }

        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }

        public final void d(boolean z10) {
            if (this.f1037b != null) {
                androidx.appcompat.view.menu.f fVar = this.f1036a;
                boolean z11 = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f1036a.getItem(i10) == this.f1037b) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z11) {
                    g(this.f1037b);
                }
            }
        }

        public final boolean e() {
            return false;
        }

        public final boolean g(androidx.appcompat.view.menu.h hVar) {
            View view = Toolbar.this.f1018p;
            if (view instanceof l.b) {
                ((l.b) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1018p);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1017o);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1018p = null;
            int size = toolbar3.L.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.L.get(size));
                } else {
                    toolbar3.L.clear();
                    this.f1037b = null;
                    Toolbar.this.requestLayout();
                    hVar.C = false;
                    hVar.f655n.p(false);
                    Toolbar.this.t();
                    return true;
                }
            }
        }

        public final int getId() {
            return 0;
        }

        public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f1036a;
            if (!(fVar2 == null || (hVar = this.f1037b) == null)) {
                fVar2.d(hVar);
            }
            this.f1036a = fVar;
        }

        public final void i(Parcelable parcelable) {
        }

        public final boolean k(m mVar) {
            return false;
        }

        public final Parcelable l() {
            return null;
        }

        public final boolean m(androidx.appcompat.view.menu.h hVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f1017o.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1017o);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1017o);
            }
            Toolbar.this.f1018p = hVar.getActionView();
            this.f1037b = hVar;
            ViewParent parent2 = Toolbar.this.f1018p.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1018p);
                }
                Toolbar.this.getClass();
                LayoutParams layoutParams = new LayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                layoutParams.f309a = 8388611 | (toolbar4.f1023u & 112);
                layoutParams.f1029b = 2;
                toolbar4.f1018p.setLayoutParams(layoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1018p);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((LayoutParams) childAt.getLayoutParams()).f1029b == 2 || childAt == toolbar6.f1006a)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.L.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            hVar.C = true;
            hVar.f655n.p(false);
            View view = Toolbar.this.f1018p;
            if (view instanceof l.b) {
                ((l.b) view).onActionViewExpanded();
            }
            Toolbar.this.t();
            return true;
        }
    }

    public interface g {
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public static LayoutParams g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new l.f(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return w1.g.b(marginLayoutParams) + w1.g.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.d(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, d0.e.d(this));
        arrayList.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1029b == 0 && s(childAt)) {
                    int i12 = layoutParams.f309a;
                    WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                    int d10 = d0.e.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, d10) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = d10 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1029b == 0 && s(childAt2)) {
                int i14 = layoutParams2.f309a;
                WeakHashMap<View, q0> weakHashMap3 = d0.f16298a;
                int d11 = d0.e.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, d11) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = d11 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = new LayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = g(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f1029b = 1;
        if (!z10 || this.f1018p == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.L.add(view);
    }

    public final void c() {
        if (this.f1017o == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, R$attr.toolbarNavigationButtonStyle);
            this.f1017o = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1015f);
            this.f1017o.setContentDescription(this.f1016n);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f309a = 8388611 | (this.f1023u & 112);
            layoutParams.f1029b = 2;
            this.f1017o.setLayoutParams(layoutParams);
            this.f1017o.setOnClickListener(new d());
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof LayoutParams)) {
            return false;
        }
        return true;
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f1006a;
        if (actionMenuView.f766w == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.T == null) {
                this.T = new f();
            }
            this.f1006a.setExpandedActionViewsExclusive(true);
            fVar.b(this.T, this.f1019q);
            t();
        }
    }

    public final void e() {
        if (this.f1006a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1006a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1020r);
            this.f1006a.setOnMenuItemClickListener(this.Q);
            this.f1006a.setMenuCallbacks(this.U, new c());
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f309a = 8388613 | (this.f1023u & 112);
            this.f1006a.setLayoutParams(layoutParams);
            b(this.f1006a, false);
        }
    }

    public final void f() {
        if (this.f1012d == null) {
            this.f1012d = new AppCompatImageButton(getContext(), (AttributeSet) null, R$attr.toolbarNavigationButtonStyle);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f309a = 8388611 | (this.f1023u & 112);
            this.f1012d.setLayoutParams(layoutParams);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1017o;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f1017o;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        f0 f0Var = this.A;
        if (f0Var == null) {
            return 0;
        }
        if (f0Var.f1101g) {
            return f0Var.f1095a;
        }
        return f0Var.f1096b;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.C;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        f0 f0Var = this.A;
        if (f0Var != null) {
            return f0Var.f1095a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        f0 f0Var = this.A;
        if (f0Var != null) {
            return f0Var.f1096b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        f0 f0Var = this.A;
        if (f0Var == null) {
            return 0;
        }
        if (f0Var.f1101g) {
            return f0Var.f1096b;
        }
        return f0Var.f1095a;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.B;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z10;
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.f1006a;
        if (actionMenuView == null || (fVar = actionMenuView.f766w) == null || !fVar.hasVisibleItems()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return Math.max(getContentInsetEnd(), Math.max(this.C, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.B, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1014e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1014e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f1006a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1012d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1012d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f1012d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.S;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f1006a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1019q;
    }

    public int getPopupTheme() {
        return this.f1020r;
    }

    public CharSequence getSubtitle() {
        return this.F;
    }

    public final TextView getSubtitleTextView() {
        return this.f1010c;
    }

    public CharSequence getTitle() {
        return this.E;
    }

    public int getTitleMarginBottom() {
        return this.f1028z;
    }

    public int getTitleMarginEnd() {
        return this.f1026x;
    }

    public int getTitleMarginStart() {
        return this.f1025w;
    }

    public int getTitleMarginTop() {
        return this.f1027y;
    }

    public final TextView getTitleTextView() {
        return this.f1008b;
    }

    public w getWrapper() {
        if (this.R == null) {
            this.R = new p0(this, true);
        }
        return this.R;
    }

    public final int h(int i10, View view) {
        int i11;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int i12 = layoutParams.f309a & 112;
        if (!(i12 == 16 || i12 == 48 || i12 == 80)) {
            i12 = this.D & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = layoutParams.topMargin;
        if (i13 < i14) {
            i13 = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
            int i16 = layoutParams.bottomMargin;
            if (i15 < i16) {
                i13 = Math.max(0, i13 - (i16 - i15));
            }
        }
        return paddingTop + i13;
    }

    public void k(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void l() {
        Iterator<MenuItem> it = this.O.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        i iVar = this.N;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<k> it2 = iVar.f16324b.iterator();
        while (it2.hasNext()) {
            it2.next().c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.O = currentMenuItems2;
    }

    public final boolean m(View view) {
        if (view.getParent() == this || this.L.contains(view)) {
            return true;
        }
        return false;
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = layoutParams.leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int h10 = h(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h10, max + measuredWidth, view.getMeasuredHeight() + h10);
        return measuredWidth + layoutParams.rightMargin + max;
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = layoutParams.rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int h10 = h(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h10, max, view.getMeasuredHeight() + h10);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1013d0);
        t();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.J = false;
        }
        if (!this.J) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.J = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.J = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0294 A[LOOP:0: B:99:0x0292->B:100:0x0294, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02b6 A[LOOP:1: B:102:0x02b4->B:103:0x02b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02db A[LOOP:2: B:105:0x02d9->B:106:0x02db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0330 A[LOOP:3: B:113:0x032e->B:114:0x0330, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = r20
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            int r1 = w1.d0.e.d(r20)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            int r4 = r20.getWidth()
            int r5 = r20.getHeight()
            int r6 = r20.getPaddingLeft()
            int r7 = r20.getPaddingRight()
            int r8 = r20.getPaddingTop()
            int r9 = r20.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.M
            r11[r2] = r3
            r11[r3] = r3
            int r12 = w1.d0.d.d(r20)
            if (r12 < 0) goto L_0x003c
            int r13 = r25 - r23
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r3
        L_0x003d:
            androidx.appcompat.widget.AppCompatImageButton r13 = r0.f1012d
            boolean r13 = r0.s(r13)
            if (r13 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0050
            androidx.appcompat.widget.AppCompatImageButton r13 = r0.f1012d
            int r13 = r0.o(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x0059
        L_0x0050:
            androidx.appcompat.widget.AppCompatImageButton r13 = r0.f1012d
            int r13 = r0.n(r13, r6, r12, r11)
            goto L_0x0058
        L_0x0057:
            r13 = r6
        L_0x0058:
            r14 = r10
        L_0x0059:
            androidx.appcompat.widget.AppCompatImageButton r15 = r0.f1017o
            boolean r15 = r0.s(r15)
            if (r15 == 0) goto L_0x0070
            if (r1 == 0) goto L_0x006a
            androidx.appcompat.widget.AppCompatImageButton r15 = r0.f1017o
            int r14 = r0.o(r15, r14, r12, r11)
            goto L_0x0070
        L_0x006a:
            androidx.appcompat.widget.AppCompatImageButton r15 = r0.f1017o
            int r13 = r0.n(r15, r13, r12, r11)
        L_0x0070:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1006a
            boolean r15 = r0.s(r15)
            if (r15 == 0) goto L_0x0087
            if (r1 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1006a
            int r13 = r0.n(r15, r13, r12, r11)
            goto L_0x0087
        L_0x0081:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1006a
            int r14 = r0.o(r15, r14, r12, r11)
        L_0x0087:
            int r15 = r20.getCurrentContentInsetLeft()
            int r16 = r20.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1018p
            boolean r13 = r0.s(r13)
            if (r13 == 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00be
            android.view.View r13 = r0.f1018p
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00c4
        L_0x00be:
            android.view.View r13 = r0.f1018p
            int r2 = r0.n(r13, r2, r12, r11)
        L_0x00c4:
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f1014e
            boolean r13 = r0.s(r13)
            if (r13 == 0) goto L_0x00db
            if (r1 == 0) goto L_0x00d5
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f1014e
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00db
        L_0x00d5:
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f1014e
            int r2 = r0.n(r13, r2, r12, r11)
        L_0x00db:
            androidx.appcompat.widget.AppCompatTextView r13 = r0.f1008b
            boolean r13 = r0.s(r13)
            androidx.appcompat.widget.AppCompatTextView r14 = r0.f1010c
            boolean r14 = r0.s(r14)
            if (r13 == 0) goto L_0x0102
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f1008b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r15 = (androidx.appcompat.widget.Toolbar.LayoutParams) r15
            int r3 = r15.topMargin
            r24 = r7
            androidx.appcompat.widget.AppCompatTextView r7 = r0.f1008b
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x0105
        L_0x0102:
            r24 = r7
            r7 = 0
        L_0x0105:
            if (r14 == 0) goto L_0x011f
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f1010c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            int r15 = r3.topMargin
            r16 = r4
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1010c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0121
        L_0x011f:
            r16 = r4
        L_0x0121:
            if (r13 != 0) goto L_0x012c
            if (r14 == 0) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            r18 = r6
            r23 = r12
            goto L_0x0284
        L_0x012c:
            if (r13 == 0) goto L_0x0131
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f1008b
            goto L_0x0133
        L_0x0131:
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f1010c
        L_0x0133:
            if (r14 == 0) goto L_0x0138
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1010c
            goto L_0x013a
        L_0x0138:
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1008b
        L_0x013a:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            if (r13 == 0) goto L_0x0150
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f1008b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x015a
        L_0x0150:
            if (r14 == 0) goto L_0x015d
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f1010c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x015a:
            r17 = 1
            goto L_0x015f
        L_0x015d:
            r17 = 0
        L_0x015f:
            int r15 = r0.D
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a1
            r6 = 80
            if (r15 == r6) goto L_0x0195
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r23 = r12
            int r12 = r0.f1027y
            int r15 = r15 + r12
            if (r6 >= r15) goto L_0x017e
            r6 = r15
            goto L_0x0193
        L_0x017e:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r3 = r3.bottomMargin
            int r7 = r0.f1028z
            int r3 = r3 + r7
            if (r5 >= r3) goto L_0x0193
            int r3 = r4.bottomMargin
            int r3 = r3 + r7
            int r3 = r3 - r5
            int r6 = r6 - r3
            r3 = 0
            int r6 = java.lang.Math.max(r3, r6)
        L_0x0193:
            int r8 = r8 + r6
            goto L_0x01ae
        L_0x0195:
            r23 = r12
            int r5 = r5 - r9
            int r3 = r4.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f1028z
            int r5 = r5 - r3
            int r8 = r5 - r7
            goto L_0x01ae
        L_0x01a1:
            r23 = r12
            int r4 = r20.getPaddingTop()
            int r3 = r3.topMargin
            int r4 = r4 + r3
            int r3 = r0.f1027y
            int r8 = r4 + r3
        L_0x01ae:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b5
            int r1 = r0.f1025w
            goto L_0x01b6
        L_0x01b5:
            r1 = 0
        L_0x01b6:
            r3 = 1
            r4 = r11[r3]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r10 = r10 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x01ed
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1008b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f1008b
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1008b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f1008b
            r5.layout(r3, r8, r10, r4)
            int r5 = r0.f1026x
            int r3 = r3 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x01ee
        L_0x01ed:
            r3 = r10
        L_0x01ee:
            if (r14 == 0) goto L_0x0214
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1010c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1010c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1010c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f1010c
            r5.layout(r1, r8, r10, r4)
            int r1 = r0.f1026x
            int r1 = r10 - r1
            goto L_0x0215
        L_0x0214:
            r1 = r10
        L_0x0215:
            if (r17 == 0) goto L_0x0284
            int r1 = java.lang.Math.min(r3, r1)
            r10 = r1
            goto L_0x0284
        L_0x021d:
            if (r17 == 0) goto L_0x0222
            int r1 = r0.f1025w
            goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            r3 = 0
            r4 = r11[r3]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r3, r1)
            int r2 = r2 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x0258
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1008b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f1008b
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1008b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f1008b
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f1026x
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0259
        L_0x0258:
            r3 = r2
        L_0x0259:
            if (r14 == 0) goto L_0x027d
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1010c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1010c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r2
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1010c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f1010c
            r5.layout(r2, r8, r1, r4)
            int r4 = r0.f1026x
            int r1 = r1 + r4
            goto L_0x027e
        L_0x027d:
            r1 = r2
        L_0x027e:
            if (r17 == 0) goto L_0x0284
            int r2 = java.lang.Math.max(r3, r1)
        L_0x0284:
            java.util.ArrayList<android.view.View> r1 = r0.K
            r3 = 3
            r0.a(r3, r1)
            java.util.ArrayList<android.view.View> r1 = r0.K
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x0292:
            if (r2 >= r1) goto L_0x02a5
            java.util.ArrayList<android.view.View> r4 = r0.K
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r23
            int r3 = r0.n(r4, r3, r12, r11)
            int r2 = r2 + 1
            goto L_0x0292
        L_0x02a5:
            r12 = r23
            java.util.ArrayList<android.view.View> r1 = r0.K
            r2 = 5
            r0.a(r2, r1)
            java.util.ArrayList<android.view.View> r1 = r0.K
            int r1 = r1.size()
            r2 = 0
        L_0x02b4:
            if (r2 >= r1) goto L_0x02c5
            java.util.ArrayList<android.view.View> r4 = r0.K
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.o(r4, r10, r12, r11)
            int r2 = r2 + 1
            goto L_0x02b4
        L_0x02c5:
            java.util.ArrayList<android.view.View> r1 = r0.K
            r2 = 1
            r0.a(r2, r1)
            java.util.ArrayList<android.view.View> r1 = r0.K
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02d9:
            if (r5 >= r4) goto L_0x030c
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r9 = (androidx.appcompat.widget.Toolbar.LayoutParams) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02d9
        L_0x030c:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r24
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x031c
            goto L_0x0323
        L_0x031c:
            if (r6 <= r10) goto L_0x0322
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0323
        L_0x0322:
            r3 = r4
        L_0x0323:
            java.util.ArrayList<android.view.View> r1 = r0.K
            int r1 = r1.size()
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x032e:
            if (r3 >= r1) goto L_0x033f
            java.util.ArrayList<android.view.View> r4 = r0.K
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.n(r4, r2, r12, r11)
            int r3 = r3 + 1
            goto L_0x032e
        L_0x033f:
            java.util.ArrayList<android.view.View> r1 = r0.K
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int[] iArr = this.M;
        char a10 = u0.a(this);
        char c10 = a10 ^ 1;
        int i19 = 0;
        if (s(this.f1012d)) {
            q(this.f1012d, i10, 0, i11, this.f1024v);
            i14 = i(this.f1012d) + this.f1012d.getMeasuredWidth();
            i13 = Math.max(0, j(this.f1012d) + this.f1012d.getMeasuredHeight());
            i12 = View.combineMeasuredStates(0, this.f1012d.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (s(this.f1017o)) {
            q(this.f1017o, i10, 0, i11, this.f1024v);
            i14 = i(this.f1017o) + this.f1017o.getMeasuredWidth();
            i13 = Math.max(i13, j(this.f1017o) + this.f1017o.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f1017o.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i14) + 0;
        iArr[a10] = Math.max(0, currentContentInsetStart - i14);
        if (s(this.f1006a)) {
            q(this.f1006a, i10, max, i11, this.f1024v);
            i15 = i(this.f1006a) + this.f1006a.getMeasuredWidth();
            i13 = Math.max(i13, j(this.f1006a) + this.f1006a.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f1006a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i15);
        if (s(this.f1018p)) {
            max2 += p(this.f1018p, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, j(this.f1018p) + this.f1018p.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f1018p.getMeasuredState());
        }
        if (s(this.f1014e)) {
            max2 += p(this.f1014e, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, j(this.f1014e) + this.f1014e.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f1014e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((LayoutParams) childAt.getLayoutParams()).f1029b == 0 && s(childAt)) {
                max2 += p(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, j(childAt) + childAt.getMeasuredHeight());
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i21 = this.f1027y + this.f1028z;
        int i22 = this.f1025w + this.f1026x;
        if (s(this.f1008b)) {
            p(this.f1008b, i10, max2 + i22, i11, i21, iArr);
            int i23 = i(this.f1008b) + this.f1008b.getMeasuredWidth();
            i16 = j(this.f1008b) + this.f1008b.getMeasuredHeight();
            i18 = View.combineMeasuredStates(i12, this.f1008b.getMeasuredState());
            i17 = i23;
        } else {
            i16 = 0;
            i18 = i12;
            i17 = 0;
        }
        if (s(this.f1010c)) {
            i17 = Math.max(i17, p(this.f1010c, i10, max2 + i22, i11, i16 + i21, iArr));
            i16 += j(this.f1010c) + this.f1010c.getMeasuredHeight();
            i18 = View.combineMeasuredStates(i18, this.f1010c.getMeasuredState());
        } else {
            int i24 = i18;
        }
        int max3 = Math.max(i13, i16);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i17, getSuggestedMinimumWidth()), i10, -16777216 & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (this.W) {
            int childCount2 = getChildCount();
            int i25 = 0;
            while (true) {
                if (i25 >= childCount2) {
                    z10 = true;
                    break;
                }
                View childAt2 = getChildAt(i25);
                if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i25++;
            }
        }
        z10 = false;
        if (!z10) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.f fVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        ActionMenuView actionMenuView = this.f1006a;
        if (actionMenuView != null) {
            fVar = actionMenuView.f766w;
        } else {
            fVar = null;
        }
        int i10 = savedState.f1030c;
        if (!(i10 == 0 || this.T == null || fVar == null || (findItem = fVar.findItem(i10)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1031d) {
            removeCallbacks(this.f1013d0);
            post(this.f1013d0);
        }
    }

    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.A == null) {
            this.A = new f0();
        }
        f0 f0Var = this.A;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != f0Var.f1101g) {
            f0Var.f1101g = z10;
            if (!f0Var.f1102h) {
                f0Var.f1095a = f0Var.f1099e;
                f0Var.f1096b = f0Var.f1100f;
            } else if (z10) {
                int i11 = f0Var.f1098d;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = f0Var.f1099e;
                }
                f0Var.f1095a = i11;
                int i12 = f0Var.f1097c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = f0Var.f1100f;
                }
                f0Var.f1096b = i12;
            } else {
                int i13 = f0Var.f1097c;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = f0Var.f1099e;
                }
                f0Var.f1095a = i13;
                int i14 = f0Var.f1098d;
                if (i14 == Integer.MIN_VALUE) {
                    i14 = f0Var.f1100f;
                }
                f0Var.f1096b = i14;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r1 != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar$SavedState r0 = new androidx.appcompat.widget.Toolbar$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.Toolbar$f r1 = r4.T
            if (r1 == 0) goto L_0x0015
            androidx.appcompat.view.menu.h r1 = r1.f1037b
            if (r1 == 0) goto L_0x0015
            int r1 = r1.f642a
            r0.f1030c = r1
        L_0x0015:
            androidx.appcompat.widget.ActionMenuView r1 = r4.f1006a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002b
            androidx.appcompat.widget.ActionMenuPresenter r1 = r1.A
            if (r1 == 0) goto L_0x0027
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x0027
            r1 = r2
            goto L_0x0028
        L_0x0027:
            r1 = r3
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = r3
        L_0x002c:
            r0.f1031d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = false;
        }
        if (!this.I) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    public final int p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void r(FragmentManager.c cVar) {
        i iVar = this.N;
        iVar.f16324b.add(cVar);
        iVar.f16323a.run();
    }

    public final boolean s(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f1011c0 != z10) {
            this.f1011c0 = z10;
            t();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(h.a.a(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.W = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.C) {
            this.C = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.B) {
            this.B = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i10, int i11) {
        if (this.A == null) {
            this.A = new f0();
        }
        f0 f0Var = this.A;
        f0Var.f1102h = false;
        if (i10 != Integer.MIN_VALUE) {
            f0Var.f1099e = i10;
            f0Var.f1095a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            f0Var.f1100f = i11;
            f0Var.f1096b = i11;
        }
    }

    public void setContentInsetsRelative(int i10, int i11) {
        if (this.A == null) {
            this.A = new f0();
        }
        this.A.a(i10, i11);
    }

    public void setLogo(int i10) {
        setLogo(h.a.a(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setMenu(androidx.appcompat.view.menu.f fVar, ActionMenuPresenter actionMenuPresenter) {
        if (fVar != null || this.f1006a != null) {
            e();
            androidx.appcompat.view.menu.f fVar2 = this.f1006a.f766w;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    fVar2.r(this.S);
                    fVar2.r(this.T);
                }
                if (this.T == null) {
                    this.T = new f();
                }
                actionMenuPresenter.f755y = true;
                if (fVar != null) {
                    fVar.b(actionMenuPresenter, this.f1019q);
                    fVar.b(this.T, this.f1019q);
                } else {
                    actionMenuPresenter.h(this.f1019q, (androidx.appcompat.view.menu.f) null);
                    this.T.h(this.f1019q, (androidx.appcompat.view.menu.f) null);
                    actionMenuPresenter.d(true);
                    this.T.d(true);
                }
                this.f1006a.setPopupTheme(this.f1020r);
                this.f1006a.setPresenter(actionMenuPresenter);
                this.S = actionMenuPresenter;
                t();
            }
        }
    }

    public void setMenuCallbacks(j.a aVar, f.a aVar2) {
        this.U = aVar;
        this.V = aVar2;
        ActionMenuView actionMenuView = this.f1006a;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(h.a.a(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f1012d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(g gVar) {
        this.P = gVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f1006a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1020r != i10) {
            this.f1020r = i10;
            if (i10 == 0) {
                this.f1019q = getContext();
            } else {
                this.f1019q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextAppearance(Context context, int i10) {
        this.f1022t = i10;
        AppCompatTextView appCompatTextView = this.f1010c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i10);
        }
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMargin(int i10, int i11, int i12, int i13) {
        this.f1025w = i10;
        this.f1027y = i11;
        this.f1026x = i12;
        this.f1028z = i13;
        requestLayout();
    }

    public void setTitleMarginBottom(int i10) {
        this.f1028z = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1026x = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1025w = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1027y = i10;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i10) {
        this.f1021s = i10;
        AppCompatTextView appCompatTextView = this.f1008b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i10);
        }
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            f fVar = this.T;
            boolean z11 = false;
            if (fVar == null || fVar.f1037b == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && a10 != null) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (d0.g.b(this) && this.f1011c0) {
                    z11 = true;
                }
            }
            if (z11 && this.f1009b0 == null) {
                if (this.f1007a0 == null) {
                    this.f1007a0 = e.b(new d.h(this, 1));
                }
                e.c(a10, this.f1007a0);
                this.f1009b0 = a10;
            } else if (!z11 && (onBackInvokedDispatcher = this.f1009b0) != null) {
                e.d(onBackInvokedDispatcher, this.f1007a0);
                this.f1009b0 = null;
            }
        }
    }

    public final void x(FragmentManager.c cVar) {
        i iVar = this.N;
        iVar.f16324b.remove(cVar);
        if (((i.a) iVar.f16325c.remove(cVar)) == null) {
            iVar.f16323a.run();
            return;
        }
        throw null;
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b  reason: collision with root package name */
        public int f1029b = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams() {
            this.f309a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1029b = layoutParams.f1029b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.f1017o;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1017o.setImageDrawable(drawable);
            return;
        }
        AppCompatImageButton appCompatImageButton = this.f1017o;
        if (appCompatImageButton != null) {
            appCompatImageButton.setImageDrawable(this.f1015f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1014e == null) {
                this.f1014e = new AppCompatImageView(getContext());
            }
            if (!m(this.f1014e)) {
                b(this.f1014e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f1014e;
            if (appCompatImageView != null && m(appCompatImageView)) {
                removeView(this.f1014e);
                this.L.remove(this.f1014e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1014e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1014e == null) {
            this.f1014e = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f1014e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        AppCompatImageButton appCompatImageButton = this.f1012d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            q0.a(this.f1012d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f1012d)) {
                b(this.f1012d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f1012d;
            if (appCompatImageButton != null && m(appCompatImageButton)) {
                removeView(this.f1012d);
                this.L.remove(this.f1012d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f1012d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1010c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1010c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1010c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1022t;
                if (i10 != 0) {
                    this.f1010c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.f1010c.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1010c)) {
                b(this.f1010c, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f1010c;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.f1010c);
                this.L.remove(this.f1010c);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1010c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.F = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        AppCompatTextView appCompatTextView = this.f1010c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1008b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1008b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1008b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1021s;
                if (i10 != 0) {
                    this.f1008b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.f1008b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1008b)) {
                b(this.f1008b, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f1008b;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.f1008b);
                this.L.remove(this.f1008b);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1008b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.E = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        AppCompatTextView appCompatTextView = this.f1008b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f1030c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1031d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f1030c = parcel.readInt();
            this.f1031d = parcel.readInt() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeInt(this.f1030c);
            parcel.writeInt(this.f1031d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.D = 8388627;
        this.K = new ArrayList<>();
        this.L = new ArrayList<>();
        this.M = new int[2];
        this.N = new i(new d.d(this, 3));
        this.O = new ArrayList<>();
        this.Q = new a();
        this.f1013d0 = new b();
        Context context2 = getContext();
        int[] iArr = R$styleable.Toolbar;
        n0 m10 = n0.m(context2, attributeSet, iArr, i10);
        d0.n(this, context, iArr, attributeSet, m10.f1157b, i10);
        this.f1021s = m10.i(R$styleable.Toolbar_titleTextAppearance, 0);
        this.f1022t = m10.i(R$styleable.Toolbar_subtitleTextAppearance, 0);
        this.D = m10.f1157b.getInteger(R$styleable.Toolbar_android_gravity, this.D);
        this.f1023u = m10.f1157b.getInteger(R$styleable.Toolbar_buttonGravity, 48);
        int c10 = m10.c(R$styleable.Toolbar_titleMargin, 0);
        int i11 = R$styleable.Toolbar_titleMargins;
        c10 = m10.l(i11) ? m10.c(i11, c10) : c10;
        this.f1028z = c10;
        this.f1027y = c10;
        this.f1026x = c10;
        this.f1025w = c10;
        int c11 = m10.c(R$styleable.Toolbar_titleMarginStart, -1);
        if (c11 >= 0) {
            this.f1025w = c11;
        }
        int c12 = m10.c(R$styleable.Toolbar_titleMarginEnd, -1);
        if (c12 >= 0) {
            this.f1026x = c12;
        }
        int c13 = m10.c(R$styleable.Toolbar_titleMarginTop, -1);
        if (c13 >= 0) {
            this.f1027y = c13;
        }
        int c14 = m10.c(R$styleable.Toolbar_titleMarginBottom, -1);
        if (c14 >= 0) {
            this.f1028z = c14;
        }
        this.f1024v = m10.d(R$styleable.Toolbar_maxButtonHeight, -1);
        int c15 = m10.c(R$styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int c16 = m10.c(R$styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int d10 = m10.d(R$styleable.Toolbar_contentInsetLeft, 0);
        int d11 = m10.d(R$styleable.Toolbar_contentInsetRight, 0);
        if (this.A == null) {
            this.A = new f0();
        }
        f0 f0Var = this.A;
        f0Var.f1102h = false;
        if (d10 != Integer.MIN_VALUE) {
            f0Var.f1099e = d10;
            f0Var.f1095a = d10;
        }
        if (d11 != Integer.MIN_VALUE) {
            f0Var.f1100f = d11;
            f0Var.f1096b = d11;
        }
        if (!(c15 == Integer.MIN_VALUE && c16 == Integer.MIN_VALUE)) {
            f0Var.a(c15, c16);
        }
        this.B = m10.c(R$styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.C = m10.c(R$styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1015f = m10.e(R$styleable.Toolbar_collapseIcon);
        this.f1016n = m10.k(R$styleable.Toolbar_collapseContentDescription);
        CharSequence k10 = m10.k(R$styleable.Toolbar_title);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m10.k(R$styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(k11)) {
            setSubtitle(k11);
        }
        this.f1019q = getContext();
        setPopupTheme(m10.i(R$styleable.Toolbar_popupTheme, 0));
        Drawable e10 = m10.e(R$styleable.Toolbar_navigationIcon);
        if (e10 != null) {
            setNavigationIcon(e10);
        }
        CharSequence k12 = m10.k(R$styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(k12)) {
            setNavigationContentDescription(k12);
        }
        Drawable e11 = m10.e(R$styleable.Toolbar_logo);
        if (e11 != null) {
            setLogo(e11);
        }
        CharSequence k13 = m10.k(R$styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(k13)) {
            setLogoDescription(k13);
        }
        int i12 = R$styleable.Toolbar_titleTextColor;
        if (m10.l(i12)) {
            setTitleTextColor(m10.b(i12));
        }
        int i13 = R$styleable.Toolbar_subtitleTextColor;
        if (m10.l(i13)) {
            setSubtitleTextColor(m10.b(i13));
        }
        int i14 = R$styleable.Toolbar_menu;
        if (m10.l(i14)) {
            k(m10.i(i14, 0));
        }
        m10.n();
    }
}
