package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.y;
import m.d;

/* compiled from: StandardMenuPopup */
public final class l extends d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int C = R$layout.abc_popup_menu_item_layout;
    public int A = 0;
    public boolean B;

    /* renamed from: b  reason: collision with root package name */
    public final Context f682b;

    /* renamed from: c  reason: collision with root package name */
    public final f f683c;

    /* renamed from: d  reason: collision with root package name */
    public final e f684d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f685e;

    /* renamed from: f  reason: collision with root package name */
    public final int f686f;

    /* renamed from: n  reason: collision with root package name */
    public final int f687n;

    /* renamed from: o  reason: collision with root package name */
    public final int f688o;

    /* renamed from: p  reason: collision with root package name */
    public final MenuPopupWindow f689p;

    /* renamed from: q  reason: collision with root package name */
    public final a f690q = new a();

    /* renamed from: r  reason: collision with root package name */
    public final b f691r = new b();

    /* renamed from: s  reason: collision with root package name */
    public PopupWindow.OnDismissListener f692s;

    /* renamed from: t  reason: collision with root package name */
    public View f693t;

    /* renamed from: u  reason: collision with root package name */
    public View f694u;

    /* renamed from: v  reason: collision with root package name */
    public j.a f695v;

    /* renamed from: w  reason: collision with root package name */
    public ViewTreeObserver f696w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f697x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f698y;

    /* renamed from: z  reason: collision with root package name */
    public int f699z;

    /* compiled from: StandardMenuPopup */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            if (l.this.a()) {
                l lVar = l.this;
                if (!lVar.f689p.F) {
                    View view = lVar.f694u;
                    if (view == null || !view.isShown()) {
                        l.this.dismiss();
                    } else {
                        l.this.f689p.b();
                    }
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f696w;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f696w = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f696w.removeGlobalOnLayoutListener(lVar.f690q);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(int i10, int i11, Context context, View view, f fVar, boolean z10) {
        this.f682b = context;
        this.f683c = fVar;
        this.f685e = z10;
        this.f684d = new e(fVar, LayoutInflater.from(context), z10, C);
        this.f687n = i10;
        this.f688o = i11;
        Resources resources = context.getResources();
        this.f686f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.f693t = view;
        this.f689p = new MenuPopupWindow(context, i10, i11);
        fVar.b(this, context);
    }

    public final boolean a() {
        if (this.f697x || !this.f689p.a()) {
            return false;
        }
        return true;
    }

    public final void b() {
        View view;
        boolean z10;
        Rect rect;
        boolean z11 = true;
        if (!a()) {
            if (this.f697x || (view = this.f693t) == null) {
                z11 = false;
            } else {
                this.f694u = view;
                this.f689p.G.setOnDismissListener(this);
                MenuPopupWindow menuPopupWindow = this.f689p;
                menuPopupWindow.f907w = this;
                menuPopupWindow.F = true;
                menuPopupWindow.G.setFocusable(true);
                View view2 = this.f694u;
                if (this.f696w == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f696w = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f690q);
                }
                view2.addOnAttachStateChangeListener(this.f691r);
                MenuPopupWindow menuPopupWindow2 = this.f689p;
                menuPopupWindow2.f906v = view2;
                menuPopupWindow2.f903s = this.A;
                if (!this.f698y) {
                    this.f699z = d.o(this.f684d, this.f682b, this.f686f);
                    this.f698y = true;
                }
                this.f689p.r(this.f699z);
                this.f689p.G.setInputMethodMode(2);
                MenuPopupWindow menuPopupWindow3 = this.f689p;
                Rect rect2 = this.f13033a;
                if (rect2 != null) {
                    menuPopupWindow3.getClass();
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                menuPopupWindow3.E = rect;
                this.f689p.b();
                y yVar = this.f689p.f894c;
                yVar.setOnKeyListener(this);
                if (this.B && this.f683c.f627m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f682b).inflate(R$layout.abc_popup_menu_header_item_layout, yVar, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f683c.f627m);
                    }
                    frameLayout.setEnabled(false);
                    yVar.addHeaderView(frameLayout, (Object) null, false);
                }
                this.f689p.p(this.f684d);
                this.f689p.b();
            }
        }
        if (!z11) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void c(f fVar, boolean z10) {
        if (fVar == this.f683c) {
            dismiss();
            j.a aVar = this.f695v;
            if (aVar != null) {
                aVar.c(fVar, z10);
            }
        }
    }

    public final void d(boolean z10) {
        this.f698y = false;
        e eVar = this.f684d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    public final void dismiss() {
        if (a()) {
            this.f689p.dismiss();
        }
    }

    public final boolean e() {
        return false;
    }

    public final void f(j.a aVar) {
        this.f695v = aVar;
    }

    public final void i(Parcelable parcelable) {
    }

    public final y j() {
        return this.f689p.f894c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(androidx.appcompat.view.menu.m r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            android.content.Context r5 = r9.f682b
            android.view.View r6 = r9.f694u
            boolean r8 = r9.f685e
            int r3 = r9.f687n
            int r4 = r9.f688o
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.j$a r2 = r9.f695v
            r0.f677i = r2
            m.d r3 = r0.f678j
            if (r3 == 0) goto L_0x0023
            r3.f(r2)
        L_0x0023:
            boolean r2 = m.d.w(r10)
            r0.f676h = r2
            m.d r3 = r0.f678j
            if (r3 == 0) goto L_0x0030
            r3.q(r2)
        L_0x0030:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f692s
            r0.f679k = r2
            r2 = 0
            r9.f692s = r2
            androidx.appcompat.view.menu.f r2 = r9.f683c
            r2.c(r1)
            androidx.appcompat.widget.MenuPopupWindow r2 = r9.f689p
            int r3 = r2.f897f
            int r2 = r2.o()
            int r4 = r9.A
            android.view.View r5 = r9.f693t
            java.util.WeakHashMap<android.view.View, w1.q0> r6 = w1.d0.f16298a
            int r5 = w1.d0.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005e
            android.view.View r4 = r9.f693t
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            android.view.View r4 = r0.f674f
            if (r4 != 0) goto L_0x006c
            r0 = r1
            goto L_0x0070
        L_0x006c:
            r0.d(r3, r2, r5, r5)
        L_0x006f:
            r0 = r5
        L_0x0070:
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.j$a r0 = r9.f695v
            if (r0 == 0) goto L_0x0079
            r0.d(r10)
        L_0x0079:
            return r5
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.k(androidx.appcompat.view.menu.m):boolean");
    }

    public final Parcelable l() {
        return null;
    }

    public final void n(f fVar) {
    }

    public final void onDismiss() {
        this.f697x = true;
        this.f683c.c(true);
        ViewTreeObserver viewTreeObserver = this.f696w;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f696w = this.f694u.getViewTreeObserver();
            }
            this.f696w.removeGlobalOnLayoutListener(this.f690q);
            this.f696w = null;
        }
        this.f694u.removeOnAttachStateChangeListener(this.f691r);
        PopupWindow.OnDismissListener onDismissListener = this.f692s;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(View view) {
        this.f693t = view;
    }

    public final void q(boolean z10) {
        this.f684d.f610c = z10;
    }

    public final void r(int i10) {
        this.A = i10;
    }

    public final void s(int i10) {
        this.f689p.f897f = i10;
    }

    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f692s = onDismissListener;
    }

    public final void u(boolean z10) {
        this.B = z10;
    }

    public final void v(int i10) {
        this.f689p.l(i10);
    }
}
