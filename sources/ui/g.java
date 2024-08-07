package ui;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.support.data.model.FAQ;
import com.vpa.daugia.module.support.ui.activity.a;
import ef.d;
import ek.i;
import java.io.Serializable;
import kf.b;
import mg.u6;
import rk.l;
import sk.j;
import sk.q;

/* compiled from: FAQAdapter.kt */
public final class g extends d<FAQ, u6> {

    /* renamed from: p  reason: collision with root package name */
    public final l<FAQ, i> f23080p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(a aVar) {
        super(aVar);
        j.f(aVar, "listener");
        this.f23080p = aVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        u6 u6Var = (u6) lVar;
        FAQ faq = (FAQ) serializable;
        j.f(u6Var, "binding");
        j.f(faq, "model");
        u6Var.v(new h(faq));
        q qVar = new q();
        LinearLayout linearLayout = u6Var.f21386w;
        j.e(linearLayout, "itemView");
        linearLayout.setOnClickListener(new b(200, linearLayout, new e(u6Var, qVar, u6Var)));
        ImageView imageView = u6Var.f21387x;
        j.e(imageView, "ivArrow");
        imageView.setOnClickListener(new b(200, imageView, new f(u6Var, qVar, u6Var)));
    }

    public final int x() {
        return C0535R$layout.item_question;
    }

    public final void z(Serializable serializable) {
        FAQ faq = (FAQ) serializable;
        j.f(faq, "model");
        this.f23080p.invoke(faq);
    }
}
