package oh;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.home.data.model.News;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.g6;
import qh.b;
import rk.l;
import sk.j;

/* compiled from: NewsAdapter.kt */
public final class e extends d<News, g6> {

    /* renamed from: p  reason: collision with root package name */
    public final l<News, i> f21798p;

    public e(com.vpa.daugia.module.home.ui.e eVar) {
        super(eVar);
        this.f21798p = eVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        g6 g6Var = (g6) lVar;
        News news = (News) serializable;
        j.f(g6Var, "binding");
        j.f(news, "model");
        g6Var.v(new b(news));
    }

    public final int x() {
        return C0535R$layout.item_news_home;
    }

    public final void z(Serializable serializable) {
        News news = (News) serializable;
        j.f(news, "model");
        this.f21798p.invoke(news);
    }
}
