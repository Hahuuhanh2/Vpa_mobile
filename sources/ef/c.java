package ef;

import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.R$id;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.snackbar.g;
import com.ots.core.R$color;
import com.ots.core.base.BaseActivity;
import ek.i;
import k1.a;
import lf.f;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: BaseActivity.kt */
public final class c extends k implements l<f, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseActivity<d2.l> f9441a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(BaseActivity<d2.l> baseActivity) {
        super(1);
        this.f9441a = baseActivity;
    }

    public final Object invoke(Object obj) {
        String str;
        boolean c10;
        f fVar = (f) obj;
        j.f(fVar, "it");
        BaseActivity<d2.l> baseActivity = this.f9441a;
        j.f(baseActivity, "activity");
        try {
            int ordinal = fVar.ordinal();
            if (ordinal == 0) {
                str = "Đã kết nối Internet";
            } else if (ordinal != 1) {
                str = "Mất kết nối Internet";
            } else {
                str = "Kết nối Internet chậm";
            }
            Snackbar i10 = Snackbar.i(baseActivity.findViewById(16908290), str);
            ((SnackbarContentLayout) i10.f6818i.getChildAt(0)).getActionView().setTextColor(-1);
            BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = i10.f6818i;
            j.e(snackbarBaseLayout, "getView(...)");
            TextView textView = (TextView) snackbarBaseLayout.findViewById(R$id.snackbar_text);
            textView.setTextColor(-1);
            textView.setTextAlignment(4);
            textView.setGravity(1);
            BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout2 = i10.f6818i;
            j.d(snackbarBaseLayout2, "null cannot be cast to non-null type android.widget.FrameLayout");
            ViewGroup.LayoutParams layoutParams = snackbarBaseLayout2.getChildAt(0).getLayoutParams();
            j.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, -24, layoutParams2.rightMargin, -24);
            snackbarBaseLayout2.getChildAt(0).setLayoutParams(layoutParams2);
            if (fVar == f.DISCONNECTED) {
                i10.f6820k = 20000;
                i10.f6818i.setBackgroundTintList(ColorStateList.valueOf(-7829368));
                i10.j();
            } else {
                g b10 = g.b();
                BaseTransientBottomBar.c cVar = i10.f6829t;
                synchronized (b10.f6858a) {
                    c10 = b10.c(cVar);
                }
                if (c10) {
                    i10.b(3);
                }
                i10.f6818i.setBackgroundTintList(ColorStateList.valueOf(a.getColor(baseActivity, R$color.green_600)));
                i10.f6820k = 2000;
                i10.j();
            }
        } catch (Exception unused) {
        }
        this.f9441a.Q(fVar);
        return i.f20112a;
    }
}
