package d;

import android.content.res.Resources;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: EdgeToEdge.kt */
public final class b0 extends k implements l<Resources, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f8422a = new b0();

    public b0() {
        super(1);
    }

    public final Object invoke(Object obj) {
        boolean z10;
        Resources resources = (Resources) obj;
        j.f(resources, "resources");
        if ((resources.getConfiguration().uiMode & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
