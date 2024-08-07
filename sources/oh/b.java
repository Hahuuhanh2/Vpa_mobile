package oh;

import android.view.View;
import com.vpa.daugia.module.home.data.api.response.Plate;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AnnouncementPlateAdapter.kt */
public final class b extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f21792a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Plate f21793b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar, Plate plate) {
        super(1);
        this.f21792a = cVar;
        this.f21793b = plate;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        l<? super Plate, i> lVar = this.f21792a.f21795q;
        if (lVar != null) {
            lVar.invoke(this.f21793b);
        }
        return i.f20112a;
    }
}
