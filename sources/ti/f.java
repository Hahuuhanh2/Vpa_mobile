package ti;

import com.vpa.daugia.module.support.data.model.Categories;
import com.vpa.daugia.module.support.ui.activity.SupportActivity;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import rk.l;
import sk.e;
import sk.j;
import sk.k;
import ui.c;
import ze.f;

/* compiled from: SupportActivity.kt */
public final class f extends k implements l<ze.f<? extends ArrayList<Categories>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SupportActivity f23021a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(SupportActivity supportActivity) {
        super(1);
        this.f23021a = supportActivity;
    }

    public final Object invoke(Object obj) {
        ze.f fVar = (ze.f) obj;
        if (!(fVar instanceof f.a) && !j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            ArrayList arrayList = (ArrayList) ((f.c) fVar).f18006a;
            arrayList.add(0, new Categories((Long) null, "Câu hỏi thường gặp", (String) null, (List) null, 13, (e) null));
            SupportActivity supportActivity = this.f23021a;
            int i10 = SupportActivity.U;
            ((c) supportActivity.T.getValue()).A(arrayList);
        }
        return i.f20112a;
    }
}
