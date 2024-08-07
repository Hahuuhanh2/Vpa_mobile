package af;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.vpa.daugia.C0535R$layout;
import d2.f;
import d2.l;
import k1.a;
import mg.n7;
import sk.j;

/* compiled from: CustomSnackBar.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final View f184a;

    public c(View view) {
        this.f184a = view;
    }

    public static void a(c cVar, String str, int i10, Context context) {
        b bVar = b.f183a;
        j.f(context, "context");
        j.f(bVar, "cancelFun");
        View inflate = View.inflate(cVar.f184a.getContext(), C0535R$layout.snackbar_custom, (ViewGroup) null);
        int i11 = n7.f21257z;
        DataBinderMapperImpl dataBinderMapperImpl = f.f8544a;
        n7 n7Var = (n7) f.a(l.g((Object) null), inflate, C0535R$layout.snackbar_custom);
        Snackbar i12 = Snackbar.i(cVar.f184a, "");
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = i12.f6818i;
        j.d(snackbarBaseLayout, "null cannot be cast to non-null type android.view.ViewGroup");
        snackbarBaseLayout.removeAllViews();
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout2 = i12.f6818i;
        j.d(snackbarBaseLayout2, "null cannot be cast to non-null type android.view.ViewGroup");
        snackbarBaseLayout2.addView(n7Var.f8554e);
        i12.f6818i.setPadding(0, 0, 0, 0);
        i12.f6818i.setElevation(0.0f);
        i12.f6818i.setBackgroundTintList(ColorStateList.valueOf(a.getColor(cVar.f184a.getContext(), 17170445)));
        if (i10 == 200) {
            n7Var.f21259x.setBackgroundColor(context.getColor(2131099831));
        } else if (i10 != 400) {
            n7Var.f21259x.setBackgroundColor(context.getColor(2131100591));
        } else {
            n7Var.f21259x.setBackgroundColor(context.getColor(2131100503));
        }
        n7Var.f21260y.setText(str);
        n7Var.f21258w.setOnClickListener(new a(0, bVar, i12));
        i12.j();
    }
}
