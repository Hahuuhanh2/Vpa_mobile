package w1;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import xk.e;

/* compiled from: ViewGroup.kt */
public final class j0 implements e<View> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16326a;

    public j0(ViewGroup viewGroup) {
        this.f16326a = viewGroup;
    }

    public final Iterator<View> iterator() {
        return new l0(this.f16326a);
    }
}
