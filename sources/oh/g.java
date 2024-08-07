package oh;

import android.view.View;
import com.vpa.daugia.module.home.data.api.response.Plate;
import ek.i;
import rk.l;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: PlateAdapter.kt */
public final class g extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f21801a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Plate f21802b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(i iVar, Plate plate) {
        super(1);
        this.f21801a = iVar;
        this.f21802b = plate;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        p<? super Plate, ? super String, i> pVar = this.f21801a.f21806q;
        if (pVar != null) {
            pVar.invoke(this.f21802b, "REGISTER_AUCTION");
        }
        return i.f20112a;
    }
}
