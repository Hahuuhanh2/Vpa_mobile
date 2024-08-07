package androidx.appcompat.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R$color;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.u0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k1.a;
import w1.d0;
import w1.q;
import w1.q0;
import w1.w0;

/* compiled from: AppCompatDelegateImpl */
public final class g implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f437a;

    public g(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f437a = appCompatDelegateImpl;
    }

    public final w0 g(View view, w0 w0Var) {
        boolean z10;
        View view2;
        w0 w0Var2;
        int i10;
        int i11;
        boolean z11;
        int i12;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i13;
        int e10 = w0Var.e();
        AppCompatDelegateImpl appCompatDelegateImpl = this.f437a;
        appCompatDelegateImpl.getClass();
        int e11 = w0Var.e();
        ActionBarContextView actionBarContextView = appCompatDelegateImpl.C;
        int i14 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.C.getLayoutParams();
            boolean z12 = true;
            if (appCompatDelegateImpl.C.isShown()) {
                if (appCompatDelegateImpl.f367k0 == null) {
                    appCompatDelegateImpl.f367k0 = new Rect();
                    appCompatDelegateImpl.f368l0 = new Rect();
                }
                Rect rect = appCompatDelegateImpl.f367k0;
                Rect rect2 = appCompatDelegateImpl.f368l0;
                rect.set(w0Var.c(), w0Var.e(), w0Var.d(), w0Var.b());
                ViewGroup viewGroup = appCompatDelegateImpl.I;
                Method method = u0.f1235a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, new Object[]{rect, rect2});
                    } catch (Exception unused) {
                    }
                }
                int i15 = rect.top;
                int i16 = rect.left;
                int i17 = rect.right;
                ViewGroup viewGroup2 = appCompatDelegateImpl.I;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                w0 a10 = d0.j.a(viewGroup2);
                if (a10 == null) {
                    i10 = 0;
                } else {
                    i10 = a10.c();
                }
                if (a10 == null) {
                    i11 = 0;
                } else {
                    i11 = a10.d();
                }
                if (marginLayoutParams2.topMargin == i15 && marginLayoutParams2.leftMargin == i16 && marginLayoutParams2.rightMargin == i17) {
                    z11 = false;
                } else {
                    marginLayoutParams2.topMargin = i15;
                    marginLayoutParams2.leftMargin = i16;
                    marginLayoutParams2.rightMargin = i17;
                    z11 = true;
                }
                if (i15 <= 0 || appCompatDelegateImpl.K != null) {
                    View view3 = appCompatDelegateImpl.K;
                    if (!(view3 == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams()).height == (i13 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11))) {
                        marginLayoutParams.height = i13;
                        marginLayoutParams.leftMargin = i10;
                        marginLayoutParams.rightMargin = i11;
                        appCompatDelegateImpl.K.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view4 = new View(appCompatDelegateImpl.f373r);
                    appCompatDelegateImpl.K = view4;
                    view4.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i10;
                    layoutParams.rightMargin = i11;
                    appCompatDelegateImpl.I.addView(appCompatDelegateImpl.K, -1, layoutParams);
                }
                View view5 = appCompatDelegateImpl.K;
                if (view5 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && view5.getVisibility() != 0) {
                    View view6 = appCompatDelegateImpl.K;
                    if ((d0.d.g(view6) & 8192) == 0) {
                        z12 = false;
                    }
                    if (z12) {
                        i12 = a.getColor(appCompatDelegateImpl.f373r, R$color.abc_decor_view_status_guard_light);
                    } else {
                        i12 = a.getColor(appCompatDelegateImpl.f373r, R$color.abc_decor_view_status_guard);
                    }
                    view6.setBackgroundColor(i12);
                }
                if (!appCompatDelegateImpl.P && z10) {
                    e11 = 0;
                }
                z12 = z11;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z10 = false;
            } else {
                z12 = false;
                z10 = false;
            }
            if (z12) {
                appCompatDelegateImpl.C.setLayoutParams(marginLayoutParams2);
            }
        }
        View view7 = appCompatDelegateImpl.K;
        if (view7 != null) {
            if (z10) {
                i14 = 0;
            }
            view7.setVisibility(i14);
        }
        if (e10 != e11) {
            w0Var2 = w0Var.g(w0Var.c(), e11, w0Var.d(), w0Var.b());
            view2 = view;
        } else {
            view2 = view;
            w0Var2 = w0Var;
        }
        return d0.j(view2, w0Var2);
    }
}
