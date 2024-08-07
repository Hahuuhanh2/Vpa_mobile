package ze;

import ek.e;
import f0.b0;
import fk.h;
import java.util.Map;
import sk.j;
import y4.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17999a;

    public /* synthetic */ c(String str) {
        this.f17999a = str;
    }

    public final Map b() {
        String str = this.f17999a;
        j.f(str, "$token");
        return h.u0(new e("Authorization", b0.r("Bearer ", str)), new e("Csrf", "MTcwOTEwMzU4NzI4MQ=="), new e("App", "Mobile"));
    }
}
