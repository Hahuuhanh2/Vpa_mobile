package ti;

import al.r0;
import android.content.Intent;
import com.vpa.daugia.module.support.data.model.Categories;
import com.vpa.daugia.module.support.data.model.TopArticle;
import com.vpa.daugia.module.support.ui.SupportViewModel;
import com.vpa.daugia.module.support.ui.activity.QuestionActivity;
import com.vpa.daugia.module.support.ui.activity.SupportActivity;
import ek.i;
import ik.d;
import java.util.List;
import p3.l0;
import rk.p;
import si.a;
import sk.k;

/* compiled from: SupportActivity.kt */
public final class e extends k implements p<Categories, Integer, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SupportActivity f23020a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(SupportActivity supportActivity) {
        super(2);
        this.f23020a = supportActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        Long l10;
        List<TopArticle> topArticles;
        TopArticle topArticle;
        Categories categories = (Categories) obj;
        Integer num = (Integer) obj2;
        if (num != null && num.intValue() == 0) {
            this.f23020a.startActivity(new Intent(this.f23020a, QuestionActivity.class));
        } else {
            SupportActivity supportActivity = this.f23020a;
            if (categories == null || (str = categories.getCategoryTitle()) == null) {
                str = "";
            }
            supportActivity.S = str;
            SupportViewModel supportViewModel = (SupportViewModel) this.f23020a.R.getValue();
            if (categories == null || (topArticles = categories.getTopArticles()) == null || (topArticle = (TopArticle) fk.p.N0(topArticles)) == null) {
                l10 = null;
            } else {
                l10 = topArticle.getId();
            }
            l0.j0(l0.d0(supportViewModel), r0.f19085b, new a(supportViewModel, l10, (d<? super a>) null), 2);
        }
        return i.f20112a;
    }
}
