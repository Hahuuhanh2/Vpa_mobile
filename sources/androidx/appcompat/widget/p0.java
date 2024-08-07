package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import w1.d0;
import w1.q0;
import w1.s0;

/* compiled from: ToolbarWidgetWrapper */
public final class p0 implements w {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f1180a;

    /* renamed from: b  reason: collision with root package name */
    public int f1181b;

    /* renamed from: c  reason: collision with root package name */
    public ScrollingTabContainerView f1182c;

    /* renamed from: d  reason: collision with root package name */
    public View f1183d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1184e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1185f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1186g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1187h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f1188i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1189j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1190k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f1191l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1192m;

    /* renamed from: n  reason: collision with root package name */
    public ActionMenuPresenter f1193n;

    /* renamed from: o  reason: collision with root package name */
    public int f1194o = 0;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f1195p;

    /* compiled from: ToolbarWidgetWrapper */
    public class a extends s0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1196a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1197b;

        public a(int i10) {
            this.f1197b = i10;
        }

        public final void a() {
            if (!this.f1196a) {
                p0.this.f1180a.setVisibility(this.f1197b);
            }
        }

        public final void b(View view) {
            this.f1196a = true;
        }

        public final void c() {
            p0.this.f1180a.setVisibility(0);
        }
    }

    public p0(Toolbar toolbar, boolean z10) {
        boolean z11;
        int i10;
        Drawable drawable;
        int i11 = R$string.abc_action_bar_up_description;
        this.f1180a = toolbar;
        this.f1188i = toolbar.getTitle();
        this.f1189j = toolbar.getSubtitle();
        if (this.f1188i != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f1187h = z11;
        this.f1186g = toolbar.getNavigationIcon();
        String str = null;
        n0 m10 = n0.m(toolbar.getContext(), (AttributeSet) null, R$styleable.ActionBar, R$attr.actionBarStyle);
        this.f1195p = m10.e(R$styleable.ActionBar_homeAsUpIndicator);
        if (z10) {
            CharSequence k10 = m10.k(R$styleable.ActionBar_title);
            if (!TextUtils.isEmpty(k10)) {
                this.f1187h = true;
                this.f1188i = k10;
                if ((this.f1181b & 8) != 0) {
                    this.f1180a.setTitle(k10);
                    if (this.f1187h) {
                        d0.p(this.f1180a.getRootView(), k10);
                    }
                }
            }
            CharSequence k11 = m10.k(R$styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(k11)) {
                this.f1189j = k11;
                if ((this.f1181b & 8) != 0) {
                    this.f1180a.setSubtitle(k11);
                }
            }
            Drawable e10 = m10.e(R$styleable.ActionBar_logo);
            if (e10 != null) {
                this.f1185f = e10;
                s();
            }
            Drawable e11 = m10.e(R$styleable.ActionBar_icon);
            if (e11 != null) {
                setIcon(e11);
            }
            if (this.f1186g == null && (drawable = this.f1195p) != null) {
                this.f1186g = drawable;
                if ((this.f1181b & 4) != 0) {
                    this.f1180a.setNavigationIcon(drawable);
                } else {
                    this.f1180a.setNavigationIcon((Drawable) null);
                }
            }
            i(m10.h(R$styleable.ActionBar_displayOptions, 0));
            int i12 = m10.i(R$styleable.ActionBar_customNavigationLayout, 0);
            if (i12 != 0) {
                View inflate = LayoutInflater.from(this.f1180a.getContext()).inflate(i12, this.f1180a, false);
                View view = this.f1183d;
                if (!(view == null || (this.f1181b & 16) == 0)) {
                    this.f1180a.removeView(view);
                }
                this.f1183d = inflate;
                if (!(inflate == null || (this.f1181b & 16) == 0)) {
                    this.f1180a.addView(inflate);
                }
                i(this.f1181b | 16);
            }
            int layoutDimension = m10.f1157b.getLayoutDimension(R$styleable.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1180a.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.f1180a.setLayoutParams(layoutParams);
            }
            int c10 = m10.c(R$styleable.ActionBar_contentInsetStart, -1);
            int c11 = m10.c(R$styleable.ActionBar_contentInsetEnd, -1);
            if (c10 >= 0 || c11 >= 0) {
                this.f1180a.setContentInsetsRelative(Math.max(c10, 0), Math.max(c11, 0));
            }
            int i13 = m10.i(R$styleable.ActionBar_titleTextStyle, 0);
            if (i13 != 0) {
                Toolbar toolbar2 = this.f1180a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), i13);
            }
            int i14 = m10.i(R$styleable.ActionBar_subtitleTextStyle, 0);
            if (i14 != 0) {
                Toolbar toolbar3 = this.f1180a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), i14);
            }
            int i15 = m10.i(R$styleable.ActionBar_popupTheme, 0);
            if (i15 != 0) {
                this.f1180a.setPopupTheme(i15);
            }
        } else {
            if (this.f1180a.getNavigationIcon() != null) {
                i10 = 15;
                this.f1195p = this.f1180a.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f1181b = i10;
        }
        m10.n();
        if (i11 != this.f1194o) {
            this.f1194o = i11;
            if (TextUtils.isEmpty(this.f1180a.getNavigationContentDescription())) {
                int i16 = this.f1194o;
                this.f1190k = i16 != 0 ? getContext().getString(i16) : str;
                r();
            }
        }
        this.f1190k = this.f1180a.getNavigationContentDescription();
        this.f1180a.setNavigationOnClickListener(new o0(this));
    }

    public final boolean a() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1180a.f1006a;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.A;
            if (actionMenuPresenter == null || !actionMenuPresenter.j()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f1180a;
        if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f1006a) == null || !actionMenuView.f769z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1180a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1006a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.widget.ActionMenuPresenter r0 = r0.A
            if (r0 == 0) goto L_0x001e
            androidx.appcompat.widget.ActionMenuPresenter$c r3 = r0.C
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.j()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.c():boolean");
    }

    public final void collapseActionView() {
        h hVar;
        Toolbar.f fVar = this.f1180a.T;
        if (fVar == null) {
            hVar = null;
        } else {
            hVar = fVar.f1037b;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    public final boolean d() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1180a.f1006a;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.A;
            if (actionMenuPresenter == null || !actionMenuPresenter.b()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1180a.f1006a;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.A;
            if (actionMenuPresenter == null || !actionMenuPresenter.o()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f1180a.f1006a;
        if (actionMenuView != null && (actionMenuPresenter = actionMenuView.A) != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar = actionMenuPresenter.B;
            if (aVar != null && aVar.b()) {
                aVar.f678j.dismiss();
            }
        }
    }

    public final void g() {
    }

    public final Context getContext() {
        return this.f1180a.getContext();
    }

    public final CharSequence getTitle() {
        return this.f1180a.getTitle();
    }

    public final boolean h() {
        Toolbar.f fVar = this.f1180a.T;
        if (fVar == null || fVar.f1037b == null) {
            return false;
        }
        return true;
    }

    public final void i(int i10) {
        View view;
        int i11 = this.f1181b ^ i10;
        this.f1181b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    r();
                }
                if ((this.f1181b & 4) != 0) {
                    Toolbar toolbar = this.f1180a;
                    Drawable drawable = this.f1186g;
                    if (drawable == null) {
                        drawable = this.f1195p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    this.f1180a.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                s();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1180a.setTitle(this.f1188i);
                    this.f1180a.setSubtitle(this.f1189j);
                } else {
                    this.f1180a.setTitle((CharSequence) null);
                    this.f1180a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f1183d) != null) {
                if ((i10 & 16) != 0) {
                    this.f1180a.addView(view);
                } else {
                    this.f1180a.removeView(view);
                }
            }
        }
    }

    public final void j() {
        Toolbar toolbar;
        ScrollingTabContainerView scrollingTabContainerView = this.f1182c;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getParent() == (toolbar = this.f1180a)) {
            toolbar.removeView(this.f1182c);
        }
        this.f1182c = null;
    }

    public final void k(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = h.a.a(getContext(), i10);
        } else {
            drawable = null;
        }
        this.f1185f = drawable;
        s();
    }

    public final void l() {
    }

    public final q0 m(int i10, long j10) {
        float f10;
        q0 a10 = d0.a(this.f1180a);
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        a10.a(f10);
        a10.c(j10);
        a10.d(new a(i10));
        return a10;
    }

    public final int n() {
        return this.f1181b;
    }

    public final void o() {
    }

    public final void p() {
    }

    public final void q(boolean z10) {
        this.f1180a.setCollapsible(z10);
    }

    public final void r() {
        if ((this.f1181b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1190k)) {
            this.f1180a.setNavigationContentDescription(this.f1194o);
        } else {
            this.f1180a.setNavigationContentDescription(this.f1190k);
        }
    }

    public final void s() {
        Drawable drawable;
        int i10 = this.f1181b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f1185f;
            if (drawable == null) {
                drawable = this.f1184e;
            }
        } else {
            drawable = this.f1184e;
        }
        this.f1180a.setLogo(drawable);
    }

    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? h.a.a(getContext(), i10) : null);
    }

    public final void setMenu(Menu menu, j.a aVar) {
        if (this.f1193n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1180a.getContext());
            this.f1193n = actionMenuPresenter;
            actionMenuPresenter.f570p = R$id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter2 = this.f1193n;
        actionMenuPresenter2.f566e = aVar;
        this.f1180a.setMenu((f) menu, actionMenuPresenter2);
    }

    public final void setMenuPrepared() {
        this.f1192m = true;
    }

    public final void setVisibility(int i10) {
        this.f1180a.setVisibility(i10);
    }

    public final void setWindowCallback(Window.Callback callback) {
        this.f1191l = callback;
    }

    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f1187h) {
            this.f1188i = charSequence;
            if ((this.f1181b & 8) != 0) {
                this.f1180a.setTitle(charSequence);
                if (this.f1187h) {
                    d0.p(this.f1180a.getRootView(), charSequence);
                }
            }
        }
    }

    public final void setIcon(Drawable drawable) {
        this.f1184e = drawable;
        s();
    }
}
