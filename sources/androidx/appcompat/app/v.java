package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$bool;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.a;
import l.g;
import w1.d0;
import w1.o0;
import w1.q0;
import w1.s0;
import w1.t0;

/* compiled from: WindowDecorActionBar */
public final class v extends ActionBar implements ActionBarOverlayLayout.d {
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    /* renamed from: z  reason: collision with root package name */
    public static final AccelerateInterpolator f497z = new AccelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f498a;

    /* renamed from: b  reason: collision with root package name */
    public Context f499b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f500c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f501d;

    /* renamed from: e  reason: collision with root package name */
    public w f502e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f503f;

    /* renamed from: g  reason: collision with root package name */
    public View f504g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f505h;

    /* renamed from: i  reason: collision with root package name */
    public d f506i;

    /* renamed from: j  reason: collision with root package name */
    public d f507j;

    /* renamed from: k  reason: collision with root package name */
    public a.C0154a f508k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f509l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ActionBar.a> f510m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public boolean f511n;

    /* renamed from: o  reason: collision with root package name */
    public int f512o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f513p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f514q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f515r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f516s = true;

    /* renamed from: t  reason: collision with root package name */
    public g f517t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f518u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f519v;

    /* renamed from: w  reason: collision with root package name */
    public final a f520w = new a();

    /* renamed from: x  reason: collision with root package name */
    public final b f521x = new b();

    /* renamed from: y  reason: collision with root package name */
    public final c f522y = new c();

    /* compiled from: WindowDecorActionBar */
    public class a extends s0 {
        public a() {
        }

        public final void a() {
            View view;
            v vVar = v.this;
            if (vVar.f513p && (view = vVar.f504g) != null) {
                view.setTranslationY(0.0f);
                v.this.f501d.setTranslationY(0.0f);
            }
            v.this.f501d.setVisibility(8);
            v.this.f501d.setTransitioning(false);
            v vVar2 = v.this;
            vVar2.f517t = null;
            a.C0154a aVar = vVar2.f508k;
            if (aVar != null) {
                aVar.a(vVar2.f507j);
                vVar2.f507j = null;
                vVar2.f508k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = v.this.f500c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class b extends s0 {
        public b() {
        }

        public final void a() {
            v vVar = v.this;
            vVar.f517t = null;
            vVar.f501d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class c implements t0 {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class d extends l.a implements f.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f526c;

        /* renamed from: d  reason: collision with root package name */
        public final f f527d;

        /* renamed from: e  reason: collision with root package name */
        public a.C0154a f528e;

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<View> f529f;

        public d(Context context, AppCompatDelegateImpl.d dVar) {
            this.f526c = context;
            this.f528e = dVar;
            f fVar = new f(context);
            fVar.f626l = 1;
            this.f527d = fVar;
            fVar.f619e = this;
        }

        public final boolean a(f fVar, MenuItem menuItem) {
            a.C0154a aVar = this.f528e;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        public final void b(f fVar) {
            if (this.f528e != null) {
                i();
                ActionMenuPresenter actionMenuPresenter = v.this.f503f.f1046d;
                if (actionMenuPresenter != null) {
                    actionMenuPresenter.o();
                }
            }
        }

        public final void c() {
            v vVar = v.this;
            if (vVar.f506i == this) {
                if (!(!vVar.f514q)) {
                    vVar.f507j = this;
                    vVar.f508k = this.f528e;
                } else {
                    this.f528e.a(this);
                }
                this.f528e = null;
                v.this.r(false);
                ActionBarContextView actionBarContextView = v.this.f503f;
                if (actionBarContextView.f715r == null) {
                    actionBarContextView.h();
                }
                v vVar2 = v.this;
                vVar2.f500c.setHideOnContentScrollEnabled(vVar2.f519v);
                v.this.f506i = null;
            }
        }

        public final View d() {
            WeakReference<View> weakReference = this.f529f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final f e() {
            return this.f527d;
        }

        public final MenuInflater f() {
            return new l.f(this.f526c);
        }

        public final CharSequence g() {
            return v.this.f503f.getSubtitle();
        }

        public final CharSequence h() {
            return v.this.f503f.getTitle();
        }

        public final void i() {
            if (v.this.f506i == this) {
                this.f527d.y();
                try {
                    this.f528e.c(this, this.f527d);
                } finally {
                    this.f527d.x();
                }
            }
        }

        public final boolean j() {
            return v.this.f503f.f723z;
        }

        public final void k(View view) {
            v.this.f503f.setCustomView(view);
            this.f529f = new WeakReference<>(view);
        }

        public final void l(int i10) {
            m(v.this.f498a.getResources().getString(i10));
        }

        public final void m(CharSequence charSequence) {
            v.this.f503f.setSubtitle(charSequence);
        }

        public final void n(int i10) {
            o(v.this.f498a.getResources().getString(i10));
        }

        public final void o(CharSequence charSequence) {
            v.this.f503f.setTitle(charSequence);
        }

        public final void p(boolean z10) {
            this.f12564b = z10;
            v.this.f503f.setTitleOptional(z10);
        }
    }

    public v(Activity activity, boolean z10) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        s(decorView);
        if (!z10) {
            this.f504g = decorView.findViewById(16908290);
        }
    }

    public final boolean b() {
        w wVar = this.f502e;
        if (wVar == null || !wVar.h()) {
            return false;
        }
        this.f502e.collapseActionView();
        return true;
    }

    public final void c(boolean z10) {
        if (z10 != this.f509l) {
            this.f509l = z10;
            int size = this.f510m.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f510m.get(i10).a();
            }
        }
    }

    public final int d() {
        return this.f502e.n();
    }

    public final Context e() {
        if (this.f499b == null) {
            TypedValue typedValue = new TypedValue();
            this.f498a.getTheme().resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f499b = new ContextThemeWrapper(this.f498a, i10);
            } else {
                this.f499b = this.f498a;
            }
        }
        return this.f499b;
    }

    public final void g() {
        t(this.f498a.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs));
    }

    public final boolean i(int i10, KeyEvent keyEvent) {
        f fVar;
        int i11;
        d dVar = this.f506i;
        if (dVar == null || (fVar = dVar.f527d) == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        fVar.setQwertyMode(z10);
        return fVar.performShortcut(i10, keyEvent, 0);
    }

    public final void l(ColorDrawable colorDrawable) {
        this.f501d.setPrimaryBackground(colorDrawable);
    }

    public final void m(boolean z10) {
        int i10;
        if (!this.f505h) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            int n10 = this.f502e.n();
            this.f505h = true;
            this.f502e.i((i10 & 4) | (-5 & n10));
        }
    }

    public final void n() {
        this.f502e.i((this.f502e.n() & -3) | 2);
    }

    public final void o(boolean z10) {
        g gVar;
        this.f518u = z10;
        if (!z10 && (gVar = this.f517t) != null) {
            gVar.a();
        }
    }

    public final void p(CharSequence charSequence) {
        this.f502e.setWindowTitle(charSequence);
    }

    public final l.a q(AppCompatDelegateImpl.d dVar) {
        d dVar2 = this.f506i;
        if (dVar2 != null) {
            dVar2.c();
        }
        this.f500c.setHideOnContentScrollEnabled(false);
        this.f503f.h();
        d dVar3 = new d(this.f503f.getContext(), dVar);
        dVar3.f527d.y();
        try {
            if (!dVar3.f528e.d(dVar3, dVar3.f527d)) {
                return null;
            }
            this.f506i = dVar3;
            dVar3.i();
            this.f503f.f(dVar3);
            r(true);
            return dVar3;
        } finally {
            dVar3.f527d.x();
        }
    }

    public final void r(boolean z10) {
        q0 q0Var;
        q0 q0Var2;
        long j10;
        if (z10) {
            if (!this.f515r) {
                this.f515r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f500c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                u(false);
            }
        } else if (this.f515r) {
            this.f515r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f500c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            u(false);
        }
        ActionBarContainer actionBarContainer = this.f501d;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.g.c(actionBarContainer)) {
            if (z10) {
                q0Var = this.f502e.m(4, 100);
                q0Var2 = this.f503f.e(0, 200);
            } else {
                q0Var2 = this.f502e.m(0, 200);
                q0Var = this.f503f.e(8, 100);
            }
            g gVar = new g();
            gVar.f12618a.add(q0Var);
            View view = q0Var.f16349a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = q0Var2.f16349a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            gVar.f12618a.add(q0Var2);
            gVar.b();
        } else if (z10) {
            this.f502e.setVisibility(4);
            this.f503f.setVisibility(0);
        } else {
            this.f502e.setVisibility(0);
            this.f503f.setVisibility(8);
        }
    }

    public final void s(View view) {
        w wVar;
        boolean z10;
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R$id.decor_content_parent);
        this.f500c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R$id.action_bar);
        if (findViewById instanceof w) {
            wVar = (w) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wVar = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder q10 = android.support.v4.media.a.q("Can't make a decor toolbar out of ");
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            q10.append(str);
            throw new IllegalStateException(q10.toString());
        }
        this.f502e = wVar;
        this.f503f = (ActionBarContextView) view.findViewById(R$id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R$id.action_bar_container);
        this.f501d = actionBarContainer;
        w wVar2 = this.f502e;
        if (wVar2 == null || this.f503f == null || actionBarContainer == null) {
            throw new IllegalStateException(v.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f498a = wVar2.getContext();
        if ((this.f502e.n() & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f505h = true;
        }
        Context context = this.f498a;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f502e.g();
        t(context.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f498a.obtainStyledAttributes((AttributeSet) null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(R$styleable.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f500c;
            if (actionBarOverlayLayout2.f732o) {
                this.f519v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f501d;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.i.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void t(boolean z10) {
        this.f511n = z10;
        if (!z10) {
            this.f502e.j();
            this.f501d.setTabContainer((ScrollingTabContainerView) null);
        } else {
            this.f501d.setTabContainer((ScrollingTabContainerView) null);
            this.f502e.j();
        }
        this.f502e.l();
        w wVar = this.f502e;
        boolean z11 = this.f511n;
        wVar.q(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f500c;
        boolean z12 = this.f511n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void u(boolean z10) {
        boolean z11;
        View view;
        View view2;
        View view3;
        boolean z12 = this.f514q;
        if (!this.f515r && z12) {
            z11 = false;
        } else {
            z11 = true;
        }
        o0 o0Var = null;
        if (z11) {
            if (!this.f516s) {
                this.f516s = true;
                g gVar = this.f517t;
                if (gVar != null) {
                    gVar.a();
                }
                this.f501d.setVisibility(0);
                if (this.f512o != 0 || (!this.f518u && !z10)) {
                    this.f501d.setAlpha(1.0f);
                    this.f501d.setTranslationY(0.0f);
                    if (this.f513p && (view2 = this.f504g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f521x.a();
                } else {
                    this.f501d.setTranslationY(0.0f);
                    float f10 = (float) (-this.f501d.getHeight());
                    if (z10) {
                        int[] iArr = {0, 0};
                        this.f501d.getLocationInWindow(iArr);
                        f10 -= (float) iArr[1];
                    }
                    this.f501d.setTranslationY(f10);
                    g gVar2 = new g();
                    q0 a10 = d0.a(this.f501d);
                    a10.e(0.0f);
                    c cVar = this.f522y;
                    View view4 = a10.f16349a.get();
                    if (view4 != null) {
                        if (cVar != null) {
                            o0Var = new o0(cVar, view4);
                        }
                        q0.a.a(view4.animate(), o0Var);
                    }
                    if (!gVar2.f12622e) {
                        gVar2.f12618a.add(a10);
                    }
                    if (this.f513p && (view3 = this.f504g) != null) {
                        view3.setTranslationY(f10);
                        q0 a11 = d0.a(this.f504g);
                        a11.e(0.0f);
                        if (!gVar2.f12622e) {
                            gVar2.f12618a.add(a11);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = A;
                    boolean z13 = gVar2.f12622e;
                    if (!z13) {
                        gVar2.f12620c = decelerateInterpolator;
                    }
                    if (!z13) {
                        gVar2.f12619b = 250;
                    }
                    b bVar = this.f521x;
                    if (!z13) {
                        gVar2.f12621d = bVar;
                    }
                    this.f517t = gVar2;
                    gVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f500c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f516s) {
            this.f516s = false;
            g gVar3 = this.f517t;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.f512o != 0 || (!this.f518u && !z10)) {
                this.f520w.a();
                return;
            }
            this.f501d.setAlpha(1.0f);
            this.f501d.setTransitioning(true);
            g gVar4 = new g();
            float f11 = (float) (-this.f501d.getHeight());
            if (z10) {
                int[] iArr2 = {0, 0};
                this.f501d.getLocationInWindow(iArr2);
                f11 -= (float) iArr2[1];
            }
            q0 a12 = d0.a(this.f501d);
            a12.e(f11);
            c cVar2 = this.f522y;
            View view5 = a12.f16349a.get();
            if (view5 != null) {
                if (cVar2 != null) {
                    o0Var = new o0(cVar2, view5);
                }
                q0.a.a(view5.animate(), o0Var);
            }
            if (!gVar4.f12622e) {
                gVar4.f12618a.add(a12);
            }
            if (this.f513p && (view = this.f504g) != null) {
                q0 a13 = d0.a(view);
                a13.e(f11);
                if (!gVar4.f12622e) {
                    gVar4.f12618a.add(a13);
                }
            }
            AccelerateInterpolator accelerateInterpolator = f497z;
            boolean z14 = gVar4.f12622e;
            if (!z14) {
                gVar4.f12620c = accelerateInterpolator;
            }
            if (!z14) {
                gVar4.f12619b = 250;
            }
            a aVar = this.f520w;
            if (!z14) {
                gVar4.f12621d = aVar;
            }
            this.f517t = gVar4;
            gVar4.b();
        }
    }

    public v(Dialog dialog) {
        new ArrayList();
        s(dialog.getWindow().getDecorView());
    }
}
