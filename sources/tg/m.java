package tg;

import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.base.utils.customview.TimeCounterView;
import com.ots.core.R$dimen;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import ef.d;
import ek.i;
import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kf.b;
import mg.g5;
import rk.l;
import rk.p;
import sk.j;

/* compiled from: AwaitPlateAdapter.kt */
public final class m extends d<AwaitAuction, g5> {

    /* renamed from: p  reason: collision with root package name */
    public final l<AwaitAuction, i> f22995p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f22996q;

    /* renamed from: r  reason: collision with root package name */
    public p<? super AwaitAuction, ? super String, i> f22997r;

    /* renamed from: s  reason: collision with root package name */
    public p<? super Boolean, ? super AwaitAuction, i> f22998s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(l<? super AwaitAuction, i> lVar) {
        super(lVar);
        j.f(lVar, "listener");
        this.f22995p = lVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        boolean z10;
        g5 g5Var = (g5) lVar;
        AwaitAuction awaitAuction = (AwaitAuction) serializable;
        j.f(g5Var, "binding");
        j.f(awaitAuction, "model");
        GradientTextView gradientTextView = g5Var.f21083z;
        j.e(gradientTextView, "tvMore");
        gradientTextView.setOnClickListener(new b(500, gradientTextView, new i(this, awaitAuction)));
        g5Var.v(new ug.b(awaitAuction));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (this.f22996q) {
            layoutParams.setMargins(0, 0, 0, 0);
        } else if (i10 == 0) {
            layoutParams.setMargins(y().getResources().getDimensionPixelSize(R$dimen.dp_8), 0, y().getResources().getDimensionPixelSize(R$dimen.dp_8), 0);
        } else {
            layoutParams.setMargins(0, 0, y().getResources().getDimensionPixelSize(R$dimen.dp_8), 0);
        }
        g5Var.f21082y.setLayoutParams(layoutParams);
        MaterialButton materialButton = g5Var.f21081x;
        j.e(materialButton, "btnRegister");
        materialButton.setOnClickListener(new b(500, materialButton, new j(this, awaitAuction)));
        ImageButton imageButton = g5Var.f21080w;
        j.e(imageButton, "btnCart");
        imageButton.setOnClickListener(new b(500, imageButton, new k(this, awaitAuction)));
        AppTextView appTextView = g5Var.C;
        Boolean favorited = awaitAuction.getFavorited();
        if (favorited != null) {
            z10 = favorited.booleanValue();
        } else {
            z10 = false;
        }
        appTextView.setSelected(z10);
        g5Var.C.setOnClickListener(new h(g5Var, this, awaitAuction, 0));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        Date parse = simpleDateFormat.parse(awaitAuction.getRegisterToDate());
        Calendar instance = Calendar.getInstance();
        instance.setTime(parse);
        if (instance.getTime().compareTo(Calendar.getInstance().getTime()) > 0) {
            TimeCounterView timeCounterView = g5Var.B;
            j.e(timeCounterView, "tvTime");
            timeCounterView.setVisibility(0);
            g5Var.B.m(instance.getTimeInMillis(), new l(g5Var));
            return;
        }
        g5Var.B.setText("Hết hạn đăng ký");
    }

    public final int x() {
        return C0535R$layout.item_await_plate;
    }

    public final void z(Serializable serializable) {
        AwaitAuction awaitAuction = (AwaitAuction) serializable;
        j.f(awaitAuction, "model");
        this.f22995p.invoke(awaitAuction);
    }
}
