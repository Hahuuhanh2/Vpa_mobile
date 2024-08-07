package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.n0;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.i;
import com.google.android.material.internal.j;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import l.f;
import l8.h;
import l8.m;
import l8.r;
import w1.d0;
import w1.q0;
import w1.w0;

public class NavigationView extends ScrimInsetsFrameLayout implements f8.b {
    public static final int[] B = {16842912};
    public static final int[] C = {-16842910};
    public static final int D = R$style.Widget_Design_NavigationView;
    public final a A;

    /* renamed from: o  reason: collision with root package name */
    public final i f6585o;

    /* renamed from: p  reason: collision with root package name */
    public final j f6586p;

    /* renamed from: q  reason: collision with root package name */
    public final int f6587q;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f6588r;

    /* renamed from: s  reason: collision with root package name */
    public f f6589s;

    /* renamed from: t  reason: collision with root package name */
    public f f6590t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6591u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6592v;

    /* renamed from: w  reason: collision with root package name */
    public int f6593w;

    /* renamed from: x  reason: collision with root package name */
    public final r f6594x;

    /* renamed from: y  reason: collision with root package name */
    public final f8.i f6595y;

    /* renamed from: z  reason: collision with root package name */
    public final f8.c f6596z;

    public class a extends DrawerLayout.f {
        public a() {
        }

        public final void c(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                f8.c cVar = navigationView.f6596z;
                Objects.requireNonNull(cVar);
                view.post(new d.i(cVar, 16));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r2 = r0.f6596z;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(android.view.View r2) {
            /*
                r1 = this;
                com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                if (r2 != r0) goto L_0x000f
                f8.c r2 = r0.f6596z
                f8.c$a r0 = r2.f10046a
                if (r0 == 0) goto L_0x000f
                android.view.View r2 = r2.f10048c
                r0.c(r2)
            L_0x000f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.a.d(android.view.View):void");
        }
    }

    public class b implements f.a {
        public b() {
        }

        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            NavigationView.this.getClass();
            return false;
        }

        public final void b(androidx.appcompat.view.menu.f fVar) {
        }
    }

    public interface c {
        boolean a();
    }

    public NavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f6589s == null) {
            this.f6589s = new l.f(getContext());
        }
        return this.f6589s;
    }

    public final void a(d.b bVar) {
        boolean z10;
        Pair<DrawerLayout, DrawerLayout.LayoutParams> i10 = i();
        f8.i iVar = this.f6595y;
        int i11 = ((DrawerLayout.LayoutParams) i10.second).f2358a;
        d.b bVar2 = iVar.f10045f;
        iVar.f10045f = bVar;
        if (bVar2 != null) {
            if (bVar.f8421d == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            iVar.c(i11, bVar.f8420c, z10);
        }
    }

    public final void b() {
        Pair<DrawerLayout, DrawerLayout.LayoutParams> i10 = i();
        DrawerLayout drawerLayout = (DrawerLayout) i10.first;
        f8.i iVar = this.f6595y;
        d.b bVar = iVar.f10045f;
        iVar.f10045f = null;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.b(this, true);
            return;
        }
        int i11 = ((DrawerLayout.LayoutParams) i10.second).f2358a;
        int i12 = c.f6604a;
        this.f6595y.b(bVar, i11, new b(drawerLayout, this), new a(drawerLayout, 0));
    }

    public final void c(d.b bVar) {
        i();
        this.f6595y.f10045f = bVar;
    }

    public final void d() {
        i();
        this.f6595y.a();
    }

    public final void dispatchDraw(Canvas canvas) {
        r rVar = this.f6594x;
        ea.c cVar = new ea.c(this, 15);
        if (!rVar.b() || rVar.f12892e.isEmpty()) {
            cVar.h(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(rVar.f12892e);
        cVar.h(canvas);
        canvas.restore();
    }

    public final void e(w0 w0Var) {
        j jVar = this.f6586p;
        jVar.getClass();
        int e10 = w0Var.e();
        if (jVar.G != e10) {
            jVar.G = e10;
            jVar.a();
        }
        NavigationMenuView navigationMenuView = jVar.f6444a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, w0Var.b());
        d0.b(jVar.f6445b, w0Var);
    }

    public final ColorStateList g(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = k1.a.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R$attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = C;
        return new ColorStateList(new int[][]{iArr, B, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public f8.i getBackHelper() {
        return this.f6595y;
    }

    public MenuItem getCheckedItem() {
        return this.f6586p.f6448e.f6465e;
    }

    public int getDividerInsetEnd() {
        return this.f6586p.A;
    }

    public int getDividerInsetStart() {
        return this.f6586p.f6462z;
    }

    public int getHeaderCount() {
        return this.f6586p.f6445b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f6586p.f6456t;
    }

    public int getItemHorizontalPadding() {
        return this.f6586p.f6458v;
    }

    public int getItemIconPadding() {
        return this.f6586p.f6460x;
    }

    public ColorStateList getItemIconTintList() {
        return this.f6586p.f6455s;
    }

    public int getItemMaxLines() {
        return this.f6586p.F;
    }

    public ColorStateList getItemTextColor() {
        return this.f6586p.f6454r;
    }

    public int getItemVerticalPadding() {
        return this.f6586p.f6459w;
    }

    public Menu getMenu() {
        return this.f6585o;
    }

    public int getSubheaderInsetEnd() {
        return this.f6586p.C;
    }

    public int getSubheaderInsetStart() {
        return this.f6586p.B;
    }

    public final InsetDrawable h(n0 n0Var, ColorStateList colorStateList) {
        h hVar = new h(new m(m.a(getContext(), n0Var.i(R$styleable.NavigationView_itemShapeAppearance, 0), n0Var.i(R$styleable.NavigationView_itemShapeAppearanceOverlay, 0))));
        hVar.n(colorStateList);
        return new InsetDrawable(hVar, n0Var.d(R$styleable.NavigationView_itemShapeInsetStart, 0), n0Var.d(R$styleable.NavigationView_itemShapeInsetTop, 0), n0Var.d(R$styleable.NavigationView_itemShapeInsetEnd, 0), n0Var.d(R$styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    public final Pair<DrawerLayout, DrawerLayout.LayoutParams> i() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        m9.b.W(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            if (this.f6596z.f10046a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                a aVar = this.A;
                if (aVar == null) {
                    drawerLayout.getClass();
                } else {
                    ArrayList arrayList = drawerLayout.A;
                    if (arrayList != null) {
                        arrayList.remove(aVar);
                    }
                }
                a aVar2 = this.A;
                if (aVar2 != null) {
                    if (drawerLayout.A == null) {
                        drawerLayout.A = new ArrayList();
                    }
                    drawerLayout.A.add(aVar2);
                }
                if (DrawerLayout.k(this)) {
                    this.f6596z.a(true);
                }
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f6590t);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            a aVar = this.A;
            if (aVar == null) {
                drawerLayout.getClass();
                return;
            }
            ArrayList arrayList = drawerLayout.A;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f6587q), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f6587q, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        this.f6585o.t(savedState.f6597c);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f6597c = bundle;
        this.f6585o.v(bundle);
        return savedState;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        boolean z10;
        super.onSizeChanged(i10, i11, i12, i13);
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams) && this.f6593w > 0 && (getBackground() instanceof h)) {
            int i14 = ((DrawerLayout.LayoutParams) getLayoutParams()).f2358a;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (Gravity.getAbsoluteGravity(i14, d0.e.d(this)) == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            h hVar = (h) getBackground();
            m mVar = hVar.f12778a.f12798a;
            mVar.getClass();
            m.a aVar = new m.a(mVar);
            aVar.b((float) this.f6593w);
            if (z10) {
                aVar.e(0.0f);
                aVar.c(0.0f);
            } else {
                aVar.f(0.0f);
                aVar.d(0.0f);
            }
            m mVar2 = new m(aVar);
            hVar.setShapeAppearanceModel(mVar2);
            r rVar = this.f6594x;
            rVar.f12890c = mVar2;
            rVar.c();
            rVar.a(this);
            r rVar2 = this.f6594x;
            rVar2.f12891d = new RectF(0.0f, 0.0f, (float) i10, (float) i11);
            rVar2.c();
            rVar2.a(this);
            r rVar3 = this.f6594x;
            rVar3.f12889b = true;
            rVar3.a(this);
        }
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f6592v = z10;
    }

    public void setCheckedItem(int i10) {
        MenuItem findItem = this.f6585o.findItem(i10);
        if (findItem != null) {
            this.f6586p.f6448e.u((androidx.appcompat.view.menu.h) findItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        j jVar = this.f6586p;
        jVar.A = i10;
        jVar.d(false);
    }

    public void setDividerInsetStart(int i10) {
        j jVar = this.f6586p;
        jVar.f6462z = i10;
        jVar.d(false);
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        m9.b.U(this, f10);
    }

    public void setForceCompatClippingEnabled(boolean z10) {
        r rVar = this.f6594x;
        if (z10 != rVar.f12888a) {
            rVar.f12888a = z10;
            rVar.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        j jVar = this.f6586p;
        jVar.f6456t = drawable;
        jVar.d(false);
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(k1.a.getDrawable(getContext(), i10));
    }

    public void setItemHorizontalPadding(int i10) {
        j jVar = this.f6586p;
        jVar.f6458v = i10;
        jVar.d(false);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        j jVar = this.f6586p;
        jVar.f6458v = getResources().getDimensionPixelSize(i10);
        jVar.d(false);
    }

    public void setItemIconPadding(int i10) {
        j jVar = this.f6586p;
        jVar.f6460x = i10;
        jVar.d(false);
    }

    public void setItemIconPaddingResource(int i10) {
        j jVar = this.f6586p;
        jVar.f6460x = getResources().getDimensionPixelSize(i10);
        jVar.d(false);
    }

    public void setItemIconSize(int i10) {
        j jVar = this.f6586p;
        if (jVar.f6461y != i10) {
            jVar.f6461y = i10;
            jVar.D = true;
            jVar.d(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        j jVar = this.f6586p;
        jVar.f6455s = colorStateList;
        jVar.d(false);
    }

    public void setItemMaxLines(int i10) {
        j jVar = this.f6586p;
        jVar.F = i10;
        jVar.d(false);
    }

    public void setItemTextAppearance(int i10) {
        j jVar = this.f6586p;
        jVar.f6452p = i10;
        jVar.d(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        j jVar = this.f6586p;
        jVar.f6453q = z10;
        jVar.d(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        j jVar = this.f6586p;
        jVar.f6454r = colorStateList;
        jVar.d(false);
    }

    public void setItemVerticalPadding(int i10) {
        j jVar = this.f6586p;
        jVar.f6459w = i10;
        jVar.d(false);
    }

    public void setItemVerticalPaddingResource(int i10) {
        j jVar = this.f6586p;
        jVar.f6459w = getResources().getDimensionPixelSize(i10);
        jVar.d(false);
    }

    public void setNavigationItemSelectedListener(c cVar) {
    }

    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        j jVar = this.f6586p;
        if (jVar != null) {
            jVar.I = i10;
            NavigationMenuView navigationMenuView = jVar.f6444a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i10);
            }
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        j jVar = this.f6586p;
        jVar.C = i10;
        jVar.d(false);
    }

    public void setSubheaderInsetStart(int i10) {
        j jVar = this.f6586p;
        jVar.B = i10;
        jVar.d(false);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f6591u = z10;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Bundle f6597c;

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
            this.f6597c = parcel.readBundle(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeBundle(this.f6597c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R$attr.navigationViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = D
            r1 = r17
            android.content.Context r1 = p8.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.internal.j r10 = new com.google.android.material.internal.j
            r10.<init>()
            r0.f6586p = r10
            r11 = 2
            int[] r1 = new int[r11]
            r0.f6588r = r1
            r12 = 1
            r0.f6591u = r12
            r0.f6592v = r12
            r13 = 0
            r0.f6593w = r13
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L_0x0031
            l8.t r1 = new l8.t
            r1.<init>(r0)
            goto L_0x0036
        L_0x0031:
            l8.s r1 = new l8.s
            r1.<init>(r0)
        L_0x0036:
            r0.f6594x = r1
            f8.i r1 = new f8.i
            r1.<init>(r0)
            r0.f6595y = r1
            f8.c r1 = new f8.c
            r1.<init>(r0)
            r0.f6596z = r1
            com.google.android.material.navigation.NavigationView$a r1 = new com.google.android.material.navigation.NavigationView$a
            r1.<init>()
            r0.A = r1
            android.content.Context r14 = r16.getContext()
            com.google.android.material.internal.i r15 = new com.google.android.material.internal.i
            r15.<init>(r14)
            r0.f6585o = r15
            int[] r3 = com.google.android.material.R$styleable.NavigationView
            int[] r6 = new int[r13]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            androidx.appcompat.widget.n0 r1 = com.google.android.material.internal.u.e(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.R$styleable.NavigationView_android_background
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0077
            android.graphics.drawable.Drawable r2 = r1.e(r2)
            java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
            w1.d0.d.q(r0, r2)
        L_0x0077:
            int r2 = com.google.android.material.R$styleable.NavigationView_drawerLayoutCornerSize
            int r2 = r1.d(r2, r13)
            r0.f6593w = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            android.content.res.ColorStateList r3 = b8.b.d(r2)
            if (r2 == 0) goto L_0x008b
            if (r3 == 0) goto L_0x00a6
        L_0x008b:
            l8.m$a r2 = l8.m.c(r14, r7, r8, r9)
            l8.m r4 = new l8.m
            r4.<init>(r2)
            l8.h r2 = new l8.h
            r2.<init>((l8.m) r4)
            if (r3 == 0) goto L_0x009e
            r2.n(r3)
        L_0x009e:
            r2.k(r14)
            java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
            w1.d0.d.q(r0, r2)
        L_0x00a6:
            int r2 = com.google.android.material.R$styleable.NavigationView_elevation
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x00b6
            int r2 = r1.d(r2, r13)
            float r2 = (float) r2
            r0.setElevation(r2)
        L_0x00b6:
            int r2 = com.google.android.material.R$styleable.NavigationView_android_fitsSystemWindows
            boolean r2 = r1.a(r2, r13)
            r0.setFitsSystemWindows(r2)
            int r2 = com.google.android.material.R$styleable.NavigationView_android_maxWidth
            int r2 = r1.d(r2, r13)
            r0.f6587q = r2
            int r2 = com.google.android.material.R$styleable.NavigationView_subheaderColor
            boolean r3 = r1.l(r2)
            r4 = 0
            if (r3 == 0) goto L_0x00d5
            android.content.res.ColorStateList r2 = r1.b(r2)
            goto L_0x00d6
        L_0x00d5:
            r2 = r4
        L_0x00d6:
            int r3 = com.google.android.material.R$styleable.NavigationView_subheaderTextAppearance
            boolean r5 = r1.l(r3)
            if (r5 == 0) goto L_0x00e3
            int r3 = r1.i(r3, r13)
            goto L_0x00e4
        L_0x00e3:
            r3 = r13
        L_0x00e4:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r3 != 0) goto L_0x00ef
            if (r2 != 0) goto L_0x00ef
            android.content.res.ColorStateList r2 = r0.g(r5)
        L_0x00ef:
            int r6 = com.google.android.material.R$styleable.NavigationView_itemIconTint
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x00fc
            android.content.res.ColorStateList r5 = r1.b(r6)
            goto L_0x0100
        L_0x00fc:
            android.content.res.ColorStateList r5 = r0.g(r5)
        L_0x0100:
            int r6 = com.google.android.material.R$styleable.NavigationView_itemTextAppearance
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x010d
            int r6 = r1.i(r6, r13)
            goto L_0x010e
        L_0x010d:
            r6 = r13
        L_0x010e:
            int r7 = com.google.android.material.R$styleable.NavigationView_itemTextAppearanceActiveBoldEnabled
            boolean r7 = r1.a(r7, r12)
            int r8 = com.google.android.material.R$styleable.NavigationView_itemIconSize
            boolean r9 = r1.l(r8)
            if (r9 == 0) goto L_0x0123
            int r8 = r1.d(r8, r13)
            r0.setItemIconSize(r8)
        L_0x0123:
            int r8 = com.google.android.material.R$styleable.NavigationView_itemTextColor
            boolean r9 = r1.l(r8)
            if (r9 == 0) goto L_0x0130
            android.content.res.ColorStateList r8 = r1.b(r8)
            goto L_0x0131
        L_0x0130:
            r8 = r4
        L_0x0131:
            if (r6 != 0) goto L_0x013c
            if (r8 != 0) goto L_0x013c
            r8 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r8 = r0.g(r8)
        L_0x013c:
            int r9 = com.google.android.material.R$styleable.NavigationView_itemBackground
            android.graphics.drawable.Drawable r9 = r1.e(r9)
            if (r9 != 0) goto L_0x0184
            int r11 = com.google.android.material.R$styleable.NavigationView_itemShapeAppearance
            boolean r11 = r1.l(r11)
            if (r11 != 0) goto L_0x0157
            int r11 = com.google.android.material.R$styleable.NavigationView_itemShapeAppearanceOverlay
            boolean r11 = r1.l(r11)
            if (r11 == 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r11 = r13
            goto L_0x0158
        L_0x0157:
            r11 = r12
        L_0x0158:
            if (r11 == 0) goto L_0x0184
            android.content.Context r9 = r16.getContext()
            int r11 = com.google.android.material.R$styleable.NavigationView_itemShapeFillColor
            android.content.res.ColorStateList r9 = i8.c.b(r9, r1, r11)
            android.graphics.drawable.InsetDrawable r9 = r0.h(r1, r9)
            int r11 = com.google.android.material.R$styleable.NavigationView_itemRippleColor
            android.content.res.ColorStateList r11 = i8.c.b(r14, r1, r11)
            if (r11 == 0) goto L_0x0184
            android.graphics.drawable.InsetDrawable r12 = r0.h(r1, r4)
            android.graphics.drawable.RippleDrawable r13 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r11 = j8.a.c(r11)
            r13.<init>(r11, r4, r12)
            r10.f6457u = r13
            r4 = 0
            r10.d(r4)
            goto L_0x0185
        L_0x0184:
            r4 = r13
        L_0x0185:
            int r11 = com.google.android.material.R$styleable.NavigationView_itemHorizontalPadding
            boolean r12 = r1.l(r11)
            if (r12 == 0) goto L_0x0194
            int r11 = r1.d(r11, r4)
            r0.setItemHorizontalPadding(r11)
        L_0x0194:
            int r11 = com.google.android.material.R$styleable.NavigationView_itemVerticalPadding
            boolean r12 = r1.l(r11)
            if (r12 == 0) goto L_0x01a3
            int r11 = r1.d(r11, r4)
            r0.setItemVerticalPadding(r11)
        L_0x01a3:
            int r11 = com.google.android.material.R$styleable.NavigationView_dividerInsetStart
            int r11 = r1.d(r11, r4)
            r0.setDividerInsetStart(r11)
            int r11 = com.google.android.material.R$styleable.NavigationView_dividerInsetEnd
            int r11 = r1.d(r11, r4)
            r0.setDividerInsetEnd(r11)
            int r11 = com.google.android.material.R$styleable.NavigationView_subheaderInsetStart
            int r11 = r1.d(r11, r4)
            r0.setSubheaderInsetStart(r11)
            int r11 = com.google.android.material.R$styleable.NavigationView_subheaderInsetEnd
            int r11 = r1.d(r11, r4)
            r0.setSubheaderInsetEnd(r11)
            int r11 = com.google.android.material.R$styleable.NavigationView_topInsetScrimEnabled
            boolean r12 = r0.f6591u
            boolean r11 = r1.a(r11, r12)
            r0.setTopInsetScrimEnabled(r11)
            int r11 = com.google.android.material.R$styleable.NavigationView_bottomInsetScrimEnabled
            boolean r12 = r0.f6592v
            boolean r11 = r1.a(r11, r12)
            r0.setBottomInsetScrimEnabled(r11)
            int r11 = com.google.android.material.R$styleable.NavigationView_itemIconPadding
            int r11 = r1.d(r11, r4)
            int r12 = com.google.android.material.R$styleable.NavigationView_itemMaxLines
            r13 = 1
            int r12 = r1.h(r12, r13)
            r0.setItemMaxLines(r12)
            com.google.android.material.navigation.NavigationView$b r12 = new com.google.android.material.navigation.NavigationView$b
            r12.<init>()
            r15.f619e = r12
            r10.f6447d = r13
            r10.h(r14, r15)
            if (r3 == 0) goto L_0x0200
            r10.f6450n = r3
            r10.d(r4)
        L_0x0200:
            r10.f6451o = r2
            r10.d(r4)
            r10.f6455s = r5
            r10.d(r4)
            int r2 = r16.getOverScrollMode()
            r10.I = r2
            com.google.android.material.internal.NavigationMenuView r3 = r10.f6444a
            if (r3 == 0) goto L_0x0217
            r3.setOverScrollMode(r2)
        L_0x0217:
            if (r6 == 0) goto L_0x0220
            r10.f6452p = r6
            r2 = 0
            r10.d(r2)
            goto L_0x0221
        L_0x0220:
            r2 = 0
        L_0x0221:
            r10.f6453q = r7
            r10.d(r2)
            r10.f6454r = r8
            r10.d(r2)
            r10.f6456t = r9
            r10.d(r2)
            r10.f6460x = r11
            r10.d(r2)
            android.content.Context r2 = r15.f615a
            r15.b(r10, r2)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f6444a
            if (r2 != 0) goto L_0x0286
            android.view.LayoutInflater r2 = r10.f6449f
            int r3 = com.google.android.material.R$layout.design_navigation_menu
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r0, r4)
            com.google.android.material.internal.NavigationMenuView r2 = (com.google.android.material.internal.NavigationMenuView) r2
            r10.f6444a = r2
            com.google.android.material.internal.j$h r3 = new com.google.android.material.internal.j$h
            com.google.android.material.internal.NavigationMenuView r4 = r10.f6444a
            r3.<init>(r4)
            r2.setAccessibilityDelegateCompat(r3)
            com.google.android.material.internal.j$c r2 = r10.f6448e
            if (r2 != 0) goto L_0x0260
            com.google.android.material.internal.j$c r2 = new com.google.android.material.internal.j$c
            r2.<init>()
            r10.f6448e = r2
        L_0x0260:
            int r2 = r10.I
            r3 = -1
            if (r2 == r3) goto L_0x026a
            com.google.android.material.internal.NavigationMenuView r3 = r10.f6444a
            r3.setOverScrollMode(r2)
        L_0x026a:
            android.view.LayoutInflater r2 = r10.f6449f
            int r3 = com.google.android.material.R$layout.design_navigation_item_header
            com.google.android.material.internal.NavigationMenuView r4 = r10.f6444a
            r5 = 0
            android.view.View r2 = r2.inflate(r3, r4, r5)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r10.f6445b = r2
            java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
            r3 = 2
            w1.d0.d.s(r2, r3)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f6444a
            com.google.android.material.internal.j$c r3 = r10.f6448e
            r2.setAdapter(r3)
        L_0x0286:
            com.google.android.material.internal.NavigationMenuView r2 = r10.f6444a
            r0.addView(r2)
            int r2 = com.google.android.material.R$styleable.NavigationView_menu
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x02b1
            r3 = 0
            int r2 = r1.i(r2, r3)
            com.google.android.material.internal.j$c r3 = r10.f6448e
            if (r3 == 0) goto L_0x029f
            r4 = 1
            r3.f6466f = r4
        L_0x029f:
            android.view.MenuInflater r3 = r16.getMenuInflater()
            r3.inflate(r2, r15)
            com.google.android.material.internal.j$c r2 = r10.f6448e
            r3 = 0
            if (r2 == 0) goto L_0x02ad
            r2.f6466f = r3
        L_0x02ad:
            r10.d(r3)
            goto L_0x02b2
        L_0x02b1:
            r3 = 0
        L_0x02b2:
            int r2 = com.google.android.material.R$styleable.NavigationView_headerLayout
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x02d4
            int r2 = r1.i(r2, r3)
            android.view.LayoutInflater r4 = r10.f6449f
            android.widget.LinearLayout r5 = r10.f6445b
            android.view.View r2 = r4.inflate(r2, r5, r3)
            android.widget.LinearLayout r4 = r10.f6445b
            r4.addView(r2)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f6444a
            int r4 = r2.getPaddingBottom()
            r2.setPadding(r3, r3, r3, r4)
        L_0x02d4:
            r1.n()
            com.google.android.material.navigation.f r1 = new com.google.android.material.navigation.f
            r1.<init>(r0)
            r0.f6590t = r1
            android.view.ViewTreeObserver r1 = r16.getViewTreeObserver()
            com.google.android.material.navigation.f r2 = r0.f6590t
            r1.addOnGlobalLayoutListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f6585o.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f6586p.f6448e.u((androidx.appcompat.view.menu.h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
