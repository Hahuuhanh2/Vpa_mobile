package sg;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.search.h;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import d2.f;
import ek.i;
import kf.e;
import mg.n1;
import mg.n7;
import rk.l;
import sk.j;
import sk.k;
import w1.d0;
import w1.w0;

/* compiled from: SessionAuctionActivity.kt */
public final class a0 extends k implements l<Boolean, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionAuctionActivity f22867a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(SessionAuctionActivity sessionAuctionActivity) {
        super(1);
        this.f22867a = sessionAuctionActivity;
    }

    public final Object invoke(Object obj) {
        int i10;
        Boolean bool = (Boolean) obj;
        j.c(bool);
        if (bool.booleanValue()) {
            e.h(this.f22867a);
            View view = ((n1) this.f22867a.M()).f8554e;
            j.e(view, "getRoot(...)");
            LayoutInflater from = LayoutInflater.from(view.getContext());
            int i11 = n7.f21257z;
            DataBinderMapperImpl dataBinderMapperImpl = f.f8544a;
            n1.e eVar = null;
            n7 n7Var = (n7) d2.l.l(from, C0535R$layout.snackbar_custom, (ViewGroup) null, (Object) null);
            j.e(n7Var, "inflate(...)");
            n7Var.f21260y.setText("Đã có người trả giá cao hơn bạn!");
            Snackbar i12 = Snackbar.i(view, "");
            BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = i12.f6818i;
            j.d(snackbarBaseLayout, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
            Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbarBaseLayout;
            ((TextView) snackbarLayout.findViewById(2131362630)).setVisibility(4);
            ((TextView) snackbarLayout.findViewById(2131362629)).setVisibility(4);
            snackbarLayout.addView(n7Var.f8554e, 0);
            snackbarLayout.setBackgroundResource(2131100623);
            n7Var.f21258w.setOnClickListener(new h(i12, 10));
            ViewGroup.LayoutParams layoutParams = i12.f6818i.getLayoutParams();
            j.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 48;
            w0 a10 = d0.j.a(view);
            if (a10 != null) {
                eVar = a10.a(7);
            }
            if (eVar != null) {
                i10 = eVar.f13428b;
            } else {
                i10 = 0;
            }
            Context context = view.getContext();
            j.e(context, "getContext(...)");
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843499});
            j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
            obtainStyledAttributes.recycle();
            if (i10 <= 0) {
                i10 = dimension;
            }
            layoutParams2.setMargins(0, i10, 0, 0);
            i12.f6818i.setLayoutParams(layoutParams2);
            i12.j();
        }
        return i.f20112a;
    }
}
