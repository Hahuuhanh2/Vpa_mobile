package ef;

import android.view.View;
import ek.i;
import java.io.Serializable;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: BaseAdapter.kt */
public final class e extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d<Serializable, d2.l> f9448a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9449b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d<Serializable, d2.l> dVar, int i10) {
        super(1);
        this.f9448a = dVar;
        this.f9449b = i10;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        d<Serializable, d2.l> dVar = this.f9448a;
        dVar.z((Serializable) dVar.f9444f.get(this.f9449b));
        return i.f20112a;
    }
}
