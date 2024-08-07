package ti;

import com.vpa.daugia.module.support.data.model.FAQ;
import com.vpa.daugia.module.support.ui.activity.QuestionActivity;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import rk.l;
import sk.j;
import sk.k;
import ui.g;
import ze.f;

/* compiled from: QuestionActivity.kt */
public final class c extends k implements l<f<? extends ArrayList<FAQ>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f23019a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(QuestionActivity questionActivity) {
        super(1);
        this.f23019a = questionActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (!(fVar instanceof f.a) && !j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            QuestionActivity questionActivity = this.f23019a;
            int i10 = QuestionActivity.T;
            ((g) questionActivity.S.getValue()).A((List) ((f.c) fVar).f18006a);
        }
        return i.f20112a;
    }
}
