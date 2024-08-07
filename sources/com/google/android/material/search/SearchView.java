package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$style;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.e;
import com.google.android.material.internal.n;
import com.google.android.material.internal.v;
import com.google.android.material.internal.x;
import d.d;
import d.h;
import f8.c;
import f8.g;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import o1.a;
import w1.d0;
import w1.q0;
import w1.w0;

public class SearchView extends FrameLayout implements CoordinatorLayout.b, f8.b {
    public static final int K = R$style.Widget_Material3_SearchView;
    public SearchBar A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final int F;
    public boolean G;
    public boolean H;
    public b I;
    public HashMap J;

    /* renamed from: a  reason: collision with root package name */
    public final View f6661a;

    /* renamed from: b  reason: collision with root package name */
    public final ClippableRoundedCornerLayout f6662b;

    /* renamed from: c  reason: collision with root package name */
    public final View f6663c;

    /* renamed from: d  reason: collision with root package name */
    public final View f6664d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f6665e;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f6666f;

    /* renamed from: n  reason: collision with root package name */
    public final MaterialToolbar f6667n;

    /* renamed from: o  reason: collision with root package name */
    public final Toolbar f6668o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f6669p;

    /* renamed from: q  reason: collision with root package name */
    public final EditText f6670q;

    /* renamed from: r  reason: collision with root package name */
    public final ImageButton f6671r;

    /* renamed from: s  reason: collision with root package name */
    public final View f6672s;

    /* renamed from: t  reason: collision with root package name */
    public final TouchObserverFrameLayout f6673t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f6674u;

    /* renamed from: v  reason: collision with root package name */
    public final o f6675v;

    /* renamed from: w  reason: collision with root package name */
    public final c f6676w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f6677x;

    /* renamed from: y  reason: collision with root package name */
    public final c8.a f6678y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashSet f6679z;

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z10;
            SearchView searchView = (SearchView) view;
            if (searchView.A != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (view2 instanceof SearchBar)) {
                searchView.setupWithSearchBar((SearchBar) view2);
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public interface a {
        void a();
    }

    public enum b {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static /* synthetic */ void e(SearchView searchView, w0 w0Var) {
        boolean z10;
        searchView.getClass();
        int e10 = w0Var.e();
        searchView.setUpStatusBarSpacer(e10);
        if (!searchView.H) {
            if (e10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            searchView.setStatusBarSpacerEnabledInternal(z10);
        }
    }

    private Window getActivityWindow() {
        Activity activity;
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
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.A;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        return getResources().getDimension(R$dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        int i10;
        View view = this.f6664d;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        c8.a aVar = this.f6678y;
        if (aVar != null && this.f6663c != null) {
            this.f6663c.setBackgroundColor(aVar.a(this.F, f10));
        }
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            this.f6665e.addView(LayoutInflater.from(getContext()).inflate(i10, this.f6665e, false));
            this.f6665e.setVisibility(0);
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        if (this.f6664d.getLayoutParams().height != i10) {
            this.f6664d.getLayoutParams().height = i10;
            this.f6664d.requestLayout();
        }
    }

    public final void a(d.b bVar) {
        boolean z10;
        if (!h() && this.A != null && Build.VERSION.SDK_INT >= 34) {
            o oVar = this.f6675v;
            oVar.getClass();
            if (bVar.f8420c > 0.0f) {
                g gVar = oVar.f6720m;
                SearchBar searchBar = oVar.f6722o;
                float cornerSize = searchBar.getCornerSize();
                d.b bVar2 = gVar.f10045f;
                gVar.f10045f = bVar;
                if (bVar2 != null) {
                    if (searchBar.getVisibility() != 4) {
                        searchBar.setVisibility(4);
                    }
                    int i10 = 1;
                    if (bVar.f8421d == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f10 = bVar.f8420c;
                    float f11 = bVar.f8419b;
                    float interpolation = gVar.f10040a.getInterpolation(f10);
                    float width = (float) gVar.f10041b.getWidth();
                    float height = (float) gVar.f10041b.getHeight();
                    if (width > 0.0f && height > 0.0f) {
                        LinearInterpolator linearInterpolator = t7.b.f14885a;
                        float f12 = (-0.100000024f * interpolation) + 1.0f;
                        float max = ((Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - gVar.f10056g) - 0.0f) * interpolation) + 0.0f;
                        if (!z10) {
                            i10 = -1;
                        }
                        float min = Math.min(Math.max(0.0f, ((height - (f12 * height)) / 2.0f) - gVar.f10056g), gVar.f10057h);
                        float f13 = f11 - gVar.f10058i;
                        float abs = ((min - 0.0f) * (Math.abs(f13) / height)) + 0.0f;
                        gVar.f10041b.setScaleX(f12);
                        gVar.f10041b.setScaleY(f12);
                        gVar.f10041b.setTranslationX(max * ((float) i10));
                        gVar.f10041b.setTranslationY(abs * Math.signum(f13));
                        V v2 = gVar.f10041b;
                        if (v2 instanceof ClippableRoundedCornerLayout) {
                            ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) v2;
                            float b10 = (float) gVar.b();
                            clippableRoundedCornerLayout.a((float) clippableRoundedCornerLayout.getLeft(), (float) clippableRoundedCornerLayout.getTop(), (float) clippableRoundedCornerLayout.getRight(), (float) clippableRoundedCornerLayout.getBottom(), android.support.v4.media.a.e(cornerSize, b10, interpolation, b10));
                        }
                    }
                }
                AnimatorSet animatorSet = oVar.f6721n;
                if (animatorSet == null) {
                    if (oVar.f6708a.g()) {
                        oVar.f6708a.f();
                    }
                    if (oVar.f6708a.C) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        oVar.b(animatorSet2);
                        animatorSet2.setDuration(250);
                        animatorSet2.setInterpolator(n.a(false, t7.b.f14886b));
                        oVar.f6721n = animatorSet2;
                        animatorSet2.start();
                        oVar.f6721n.pause();
                        return;
                    }
                    return;
                }
                animatorSet.setCurrentPlayTime((long) (bVar.f8420c * ((float) animatorSet.getDuration())));
            }
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f6674u) {
            this.f6673t.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public final void b() {
        if (!h()) {
            o oVar = this.f6675v;
            g gVar = oVar.f6720m;
            d.b bVar = gVar.f10045f;
            gVar.f10045f = null;
            if (Build.VERSION.SDK_INT >= 34 && this.A != null && bVar != null) {
                long e10 = oVar.j().getTotalDuration();
                g gVar2 = oVar.f6720m;
                AnimatorSet a10 = gVar2.a(oVar.f6722o);
                a10.setDuration(e10);
                a10.start();
                gVar2.f10058i = 0.0f;
                gVar2.f10059j = null;
                gVar2.f10060k = null;
                if (oVar.f6721n != null) {
                    oVar.c(false).start();
                    oVar.f6721n.resume();
                }
                oVar.f6721n = null;
            } else if (!this.I.equals(b.HIDDEN) && !this.I.equals(b.HIDING)) {
                this.f6675v.j();
            }
        }
    }

    public final void c(d.b bVar) {
        if (!h() && this.A != null) {
            o oVar = this.f6675v;
            g gVar = oVar.f6720m;
            SearchBar searchBar = oVar.f6722o;
            gVar.f10045f = bVar;
            float f10 = bVar.f8419b;
            V v2 = gVar.f10041b;
            gVar.f10059j = new Rect(v2.getLeft(), v2.getTop() + 0, v2.getRight(), v2.getBottom() + 0);
            if (searchBar != null) {
                gVar.f10060k = x.a(gVar.f10041b, searchBar);
            }
            gVar.f10058i = f10;
        }
    }

    public final void d() {
        if (!h() && this.A != null && Build.VERSION.SDK_INT >= 34) {
            o oVar = this.f6675v;
            g gVar = oVar.f6720m;
            SearchBar searchBar = oVar.f6722o;
            d.b bVar = gVar.f10045f;
            gVar.f10045f = null;
            if (bVar != null) {
                AnimatorSet a10 = gVar.a(searchBar);
                V v2 = gVar.f10041b;
                if (v2 instanceof ClippableRoundedCornerLayout) {
                    ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) v2;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{clippableRoundedCornerLayout.getCornerRadius(), (float) gVar.b()});
                    ofFloat.addUpdateListener(new w7.a(clippableRoundedCornerLayout, 1));
                    a10.playTogether(new Animator[]{ofFloat});
                }
                a10.setDuration((long) gVar.f10044e);
                a10.start();
                gVar.f10058i = 0.0f;
                gVar.f10059j = null;
                gVar.f10060k = null;
            }
            AnimatorSet animatorSet = oVar.f6721n;
            if (animatorSet != null) {
                animatorSet.reverse();
            }
            oVar.f6721n = null;
        }
    }

    public final void f() {
        this.f6670q.post(new g(this, 1));
    }

    public final boolean g() {
        if (this.B == 48) {
            return true;
        }
        return false;
    }

    public g getBackHelper() {
        return this.f6675v.f6720m;
    }

    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    public b getCurrentTransitionState() {
        return this.I;
    }

    public int getDefaultNavigationIconResource() {
        return R$drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.f6670q;
    }

    public CharSequence getHint() {
        return this.f6670q.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f6669p;
    }

    public CharSequence getSearchPrefixText() {
        return this.f6669p.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.B;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f6670q.getText();
    }

    public Toolbar getToolbar() {
        return this.f6667n;
    }

    public final boolean h() {
        if (this.I.equals(b.HIDDEN) || this.I.equals(b.HIDING)) {
            return true;
        }
        return false;
    }

    public final void i() {
        if (this.E) {
            this.f6670q.postDelayed(new d(this, 25), 100);
        }
    }

    public final void j(b bVar, boolean z10) {
        if (!this.I.equals(bVar)) {
            if (z10) {
                if (bVar == b.SHOWN) {
                    setModalForAccessibility(true);
                } else if (bVar == b.HIDDEN) {
                    setModalForAccessibility(false);
                }
            }
            this.I = bVar;
            for (a a10 : new LinkedHashSet(this.f6679z)) {
                a10.a();
            }
            m(bVar);
        }
    }

    public final void k() {
        if (!this.I.equals(b.SHOWN)) {
            b bVar = this.I;
            b bVar2 = b.SHOWING;
            if (!bVar.equals(bVar2)) {
                o oVar = this.f6675v;
                if (oVar.f6722o != null) {
                    if (oVar.f6708a.g()) {
                        oVar.f6708a.i();
                    }
                    oVar.f6708a.setTransitionState(bVar2);
                    Menu menu = oVar.f6714g.getMenu();
                    if (menu != null) {
                        menu.clear();
                    }
                    if (oVar.f6722o.getMenuResId() == -1 || !oVar.f6708a.D) {
                        oVar.f6714g.setVisibility(8);
                    } else {
                        oVar.f6714g.k(oVar.f6722o.getMenuResId());
                        ActionMenuView a10 = v.a(oVar.f6714g);
                        if (a10 != null) {
                            for (int i10 = 0; i10 < a10.getChildCount(); i10++) {
                                View childAt = a10.getChildAt(i10);
                                childAt.setClickable(false);
                                childAt.setFocusable(false);
                                childAt.setFocusableInTouchMode(false);
                            }
                        }
                        oVar.f6714g.setVisibility(0);
                    }
                    oVar.f6716i.setText(oVar.f6722o.getText());
                    EditText editText = oVar.f6716i;
                    editText.setSelection(editText.getText().length());
                    oVar.f6710c.setVisibility(4);
                    oVar.f6710c.post(new h(oVar, 21));
                    return;
                }
                if (oVar.f6708a.g()) {
                    SearchView searchView = oVar.f6708a;
                    Objects.requireNonNull(searchView);
                    searchView.postDelayed(new g(searchView, 2), 150);
                }
                oVar.f6710c.setVisibility(4);
                oVar.f6710c.post(new d(oVar, 26));
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    public final void l(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f6662b.getId()) != null) {
                    l((ViewGroup) childAt, z10);
                } else if (!z10) {
                    HashMap hashMap = this.J;
                    if (hashMap != null && hashMap.containsKey(childAt)) {
                        int intValue = ((Integer) this.J.get(childAt)).intValue();
                        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                        d0.d.s(childAt, intValue);
                    }
                } else {
                    this.J.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                    d0.d.s(childAt, 4);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r2 = r1.f6676w;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(com.google.android.material.search.SearchView.b r2) {
        /*
            r1 = this;
            com.google.android.material.search.SearchBar r0 = r1.A
            if (r0 == 0) goto L_0x002a
            boolean r0 = r1.f6677x
            if (r0 == 0) goto L_0x002a
            com.google.android.material.search.SearchView$b r0 = com.google.android.material.search.SearchView.b.SHOWN
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            f8.c r2 = r1.f6676w
            r0 = 0
            r2.a(r0)
            goto L_0x002a
        L_0x0017:
            com.google.android.material.search.SearchView$b r0 = com.google.android.material.search.SearchView.b.HIDDEN
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x002a
            f8.c r2 = r1.f6676w
            f8.c$a r0 = r2.f10046a
            if (r0 == 0) goto L_0x002a
            android.view.View r2 = r2.f10048c
            r0.c(r2)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchView.m(com.google.android.material.search.SearchView$b):void");
    }

    public final void n() {
        int i10;
        ImageButton b10 = v.b(this.f6667n);
        if (b10 != null) {
            if (this.f6662b.getVisibility() == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            Drawable d10 = o1.a.d(b10.getDrawable());
            if (d10 instanceof i.d) {
                ((i.d) d10).setProgress((float) i10);
            }
            if (d10 instanceof e) {
                ((e) d10).a((float) i10);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9.b.W(this);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.B = activityWindow.getAttributes().softInputMode;
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        boolean z10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        setText((CharSequence) savedState.f6680c);
        if (savedState.f6681d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setVisible(z10);
    }

    public final Parcelable onSaveInstanceState() {
        String str;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        if (text == null) {
            str = null;
        } else {
            str = text.toString();
        }
        savedState.f6680c = str;
        savedState.f6681d = this.f6662b.getVisibility();
        return savedState;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.C = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.E = z10;
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(CharSequence charSequence) {
        this.f6670q.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.D = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.J = new HashMap(viewGroup.getChildCount());
        }
        l(viewGroup, z10);
        if (!z10) {
            this.J = null;
        }
    }

    public void setOnMenuItemClickListener(Toolbar.g gVar) {
        this.f6667n.setOnMenuItemClickListener(gVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        int i10;
        this.f6669p.setText(charSequence);
        TextView textView = this.f6669p;
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.H = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f6670q.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f6667n.setTouchscreenBlocksFocus(z10);
    }

    public void setTransitionState(b bVar) {
        j(bVar, true);
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.G = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11;
        int i10;
        b bVar;
        boolean z12 = true;
        if (this.f6662b.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f6662b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i10);
        n();
        if (z10) {
            bVar = b.SHOWN;
        } else {
            bVar = b.HIDDEN;
        }
        if (z11 == z10) {
            z12 = false;
        }
        j(bVar, z12);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.A = searchBar;
        this.f6675v.k(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new e(this, 1));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new g(this, 0));
                    this.f6670q.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.f6667n;
        if (materialToolbar != null && !(o1.a.d(materialToolbar.getNavigationIcon()) instanceof i.d)) {
            int defaultNavigationIconResource = getDefaultNavigationIconResource();
            if (this.A == null) {
                this.f6667n.setNavigationIcon(defaultNavigationIconResource);
            } else {
                Drawable mutate = h.a.a(getContext(), defaultNavigationIconResource).mutate();
                if (this.f6667n.getNavigationIconTint() != null) {
                    a.b.g(mutate, this.f6667n.getNavigationIconTint().intValue());
                }
                this.f6667n.setNavigationIcon(new e(this.A.getNavigationIcon(), mutate));
                n();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        m(getCurrentTransitionState());
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialSearchViewStyle);
    }

    public void setHint(int i10) {
        this.f6670q.setHint(i10);
    }

    public void setText(int i10) {
        this.f6670q.setText(i10);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public String f6680c;

        /* renamed from: d  reason: collision with root package name */
        public int f6681d;

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
            this.f6680c = parcel.readString();
            this.f6681d = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeString(this.f6680c);
            parcel.writeInt(this.f6681d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchView(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r4 = r19
            int r5 = K
            r1 = r17
            android.content.Context r1 = p8.a.a(r1, r2, r4, r5)
            r0.<init>(r1, r2, r4)
            f8.c r1 = new f8.c
            r1.<init>(r0)
            r0.f6676w = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f6679z = r1
            r1 = 16
            r0.B = r1
            com.google.android.material.search.SearchView$b r1 = com.google.android.material.search.SearchView.b.HIDDEN
            r0.I = r1
            android.content.Context r7 = r16.getContext()
            int[] r3 = com.google.android.material.R$styleable.SearchView
            r8 = 0
            int[] r6 = new int[r8]
            r1 = r7
            android.content.res.TypedArray r1 = com.google.android.material.internal.u.d(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.R$styleable.SearchView_backgroundTint
            int r2 = r1.getColor(r2, r8)
            r0.F = r2
            int r2 = com.google.android.material.R$styleable.SearchView_headerLayout
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            int r4 = com.google.android.material.R$styleable.SearchView_android_textAppearance
            int r4 = r1.getResourceId(r4, r3)
            int r5 = com.google.android.material.R$styleable.SearchView_android_text
            java.lang.String r5 = r1.getString(r5)
            int r6 = com.google.android.material.R$styleable.SearchView_android_hint
            java.lang.String r6 = r1.getString(r6)
            int r9 = com.google.android.material.R$styleable.SearchView_searchPrefixText
            java.lang.String r9 = r1.getString(r9)
            int r10 = com.google.android.material.R$styleable.SearchView_useDrawerArrowDrawable
            boolean r10 = r1.getBoolean(r10, r8)
            int r11 = com.google.android.material.R$styleable.SearchView_animateNavigationIcon
            r12 = 1
            boolean r11 = r1.getBoolean(r11, r12)
            r0.C = r11
            int r11 = com.google.android.material.R$styleable.SearchView_animateMenuItems
            boolean r11 = r1.getBoolean(r11, r12)
            r0.D = r11
            int r11 = com.google.android.material.R$styleable.SearchView_hideNavigationIcon
            boolean r11 = r1.getBoolean(r11, r8)
            int r13 = com.google.android.material.R$styleable.SearchView_autoShowKeyboard
            boolean r13 = r1.getBoolean(r13, r12)
            r0.E = r13
            int r13 = com.google.android.material.R$styleable.SearchView_backHandlingEnabled
            boolean r13 = r1.getBoolean(r13, r12)
            r0.f6677x = r13
            r1.recycle()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            int r13 = com.google.android.material.R$layout.mtrl_search_view
            r1.inflate(r13, r0)
            r0.f6674u = r12
            int r1 = com.google.android.material.R$id.open_search_view_scrim
            android.view.View r1 = r0.findViewById(r1)
            r0.f6661a = r1
            int r1 = com.google.android.material.R$id.open_search_view_root
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.internal.ClippableRoundedCornerLayout r1 = (com.google.android.material.internal.ClippableRoundedCornerLayout) r1
            r0.f6662b = r1
            int r12 = com.google.android.material.R$id.open_search_view_background
            android.view.View r12 = r0.findViewById(r12)
            r0.f6663c = r12
            int r12 = com.google.android.material.R$id.open_search_view_status_bar_spacer
            android.view.View r12 = r0.findViewById(r12)
            r0.f6664d = r12
            int r13 = com.google.android.material.R$id.open_search_view_header_container
            android.view.View r13 = r0.findViewById(r13)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r0.f6665e = r13
            int r13 = com.google.android.material.R$id.open_search_view_toolbar_container
            android.view.View r13 = r0.findViewById(r13)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r0.f6666f = r13
            int r13 = com.google.android.material.R$id.open_search_view_toolbar
            android.view.View r13 = r0.findViewById(r13)
            com.google.android.material.appbar.MaterialToolbar r13 = (com.google.android.material.appbar.MaterialToolbar) r13
            r0.f6667n = r13
            int r14 = com.google.android.material.R$id.open_search_view_dummy_toolbar
            android.view.View r14 = r0.findViewById(r14)
            androidx.appcompat.widget.Toolbar r14 = (androidx.appcompat.widget.Toolbar) r14
            r0.f6668o = r14
            int r14 = com.google.android.material.R$id.open_search_view_search_prefix
            android.view.View r14 = r0.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0.f6669p = r14
            int r14 = com.google.android.material.R$id.open_search_view_edit_text
            android.view.View r14 = r0.findViewById(r14)
            android.widget.EditText r14 = (android.widget.EditText) r14
            r0.f6670q = r14
            int r15 = com.google.android.material.R$id.open_search_view_clear_button
            android.view.View r15 = r0.findViewById(r15)
            android.widget.ImageButton r15 = (android.widget.ImageButton) r15
            r0.f6671r = r15
            int r8 = com.google.android.material.R$id.open_search_view_divider
            android.view.View r8 = r0.findViewById(r8)
            r0.f6672s = r8
            int r3 = com.google.android.material.R$id.open_search_view_content_container
            android.view.View r3 = r0.findViewById(r3)
            com.google.android.material.internal.TouchObserverFrameLayout r3 = (com.google.android.material.internal.TouchObserverFrameLayout) r3
            r0.f6673t = r3
            r19 = r12
            com.google.android.material.search.o r12 = new com.google.android.material.search.o
            r12.<init>(r0)
            r0.f6675v = r12
            c8.a r12 = new c8.a
            r12.<init>(r7)
            r0.f6678y = r12
            com.google.android.material.search.d r7 = new com.google.android.material.search.d
            r7.<init>()
            r1.setOnTouchListener(r7)
            float r1 = r16.getOverlayElevation()
            r0.setUpBackgroundViewElevationOverlay(r1)
            r0.setUpHeaderLayout(r2)
            r0.setSearchPrefixText(r9)
            r1 = -1
            if (r4 == r1) goto L_0x013c
            r14.setTextAppearance(r4)
        L_0x013c:
            r14.setText(r5)
            r14.setHint(r6)
            if (r11 == 0) goto L_0x0149
            r1 = 0
            r13.setNavigationIcon(r1)
            goto L_0x0176
        L_0x0149:
            com.google.android.material.search.e r1 = new com.google.android.material.search.e
            r2 = 0
            r1.<init>(r0, r2)
            r13.setNavigationOnClickListener(r1)
            if (r10 == 0) goto L_0x0176
            i.d r1 = new i.d
            android.content.Context r2 = r16.getContext()
            r1.<init>(r2)
            int r2 = com.google.android.material.R$attr.colorOnSurface
            int r2 = m9.b.A(r2, r0)
            android.graphics.Paint r4 = r1.f10881a
            int r4 = r4.getColor()
            if (r2 == r4) goto L_0x0173
            android.graphics.Paint r4 = r1.f10881a
            r4.setColor(r2)
            r1.invalidateSelf()
        L_0x0173:
            r13.setNavigationIcon(r1)
        L_0x0176:
            com.google.android.material.search.h r1 = new com.google.android.material.search.h
            r2 = 0
            r1.<init>(r0, r2)
            r15.setOnClickListener(r1)
            com.google.android.material.search.i r1 = new com.google.android.material.search.i
            r1.<init>(r0)
            r14.addTextChangedListener(r1)
            com.google.android.material.search.c r1 = new com.google.android.material.search.c
            r1.<init>(r0, r2)
            r3.setOnTouchListener(r1)
            ea.c r1 = new ea.c
            r2 = 17
            r1.<init>(r0, r2)
            com.google.android.material.internal.x.b(r13, r1)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.leftMargin
            int r3 = r1.rightMargin
            com.google.android.material.search.f r4 = new com.google.android.material.search.f
            r4.<init>(r1, r2, r3)
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            w1.d0.i.u(r8, r4)
            int r1 = r16.getStatusBarHeight()
            r0.setUpStatusBarSpacer(r1)
            ca.a r1 = new ca.a
            r2 = 13
            r1.<init>(r0, r2)
            r2 = r19
            w1.d0.i.u(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
