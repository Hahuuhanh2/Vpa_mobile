package ui;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.support.data.model.Categories;
import com.vpa.daugia.module.support.ui.activity.b;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.i5;
import rk.l;
import rk.p;
import sk.j;

/* compiled from: CategoryAdapter.kt */
public final class c extends d<Categories, i5> {

    /* renamed from: p  reason: collision with root package name */
    public final l<Categories, i> f23070p;

    /* renamed from: q  reason: collision with root package name */
    public p<? super Categories, ? super Integer, i> f23071q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(bVar);
        j.f(bVar, "listener");
        this.f23070p = bVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        i5 i5Var = (i5) lVar;
        Categories categories = (Categories) serializable;
        j.f(i5Var, "binding");
        j.f(categories, "model");
        this.f9446o = false;
        i5Var.v(new d(categories, i10));
        LinearLayout linearLayout = i5Var.f21117w;
        j.e(linearLayout, "itemView");
        linearLayout.setOnClickListener(new kf.b(500, linearLayout, new a(this, categories, i10)));
        ImageView imageView = i5Var.f21118x;
        j.e(imageView, "ivNext");
        imageView.setOnClickListener(new kf.b(500, imageView, new b(this, categories, i10)));
    }

    public final int x() {
        return C0535R$layout.item_category;
    }
}
