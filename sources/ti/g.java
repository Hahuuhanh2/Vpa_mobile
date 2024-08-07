package ti;

import android.content.Intent;
import com.vpa.daugia.module.common.ui.activity.WebViewActivity;
import com.vpa.daugia.module.support.data.model.Article;
import com.vpa.daugia.module.support.ui.activity.SupportActivity;
import ek.i;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: SupportActivity.kt */
public final class g extends k implements l<f<? extends Article>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SupportActivity f23022a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(SupportActivity supportActivity) {
        super(1);
        this.f23022a = supportActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (!(fVar instanceof f.a) && !j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            Intent intent = new Intent(this.f23022a, WebViewActivity.class);
            intent.putExtra("WEB_LINK", ((Article) ((f.c) fVar).f18006a).getArticleContent());
            intent.putExtra("WEB_TITLE", this.f23022a.S);
            this.f23022a.startActivity(intent);
        }
        return i.f20112a;
    }
}
