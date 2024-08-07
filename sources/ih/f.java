package ih;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.vpa.daugia.module.common.data.model.MyDocument;
import com.vpa.daugia.module.common.data.model.WinningAnnounce;
import com.vpa.daugia.module.common.ui.activity.MyDocumentActivity;
import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import ek.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mg.i0;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: MyDocumentActivity.kt */
public final class f extends k implements l<ze.f<? extends ArrayList<MyDocument>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MyDocumentActivity f20572a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(MyDocumentActivity myDocumentActivity) {
        super(1);
        this.f20572a = myDocumentActivity;
    }

    public final Object invoke(Object obj) {
        Bundle extras;
        String string;
        Long l10;
        Object obj2;
        ze.f fVar = (ze.f) obj;
        if (fVar instanceof f.a) {
            this.f20572a.O().dismiss();
            View view = ((i0) this.f20572a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f20572a.O().dismiss();
            if (((i0) this.f20572a.M()).f21104y.getOnLoadMore()) {
                this.f20572a.T().t((List) ((f.c) fVar).f18006a);
                ((i0) this.f20572a.M()).f21104y.setOnLoadMore(false);
            } else {
                this.f20572a.T().A((List) ((f.c) fVar).f18006a);
            }
            ((i0) this.f20572a.M()).f21104y.b(this.f20572a.T().f9444f);
            MyDocumentActivity myDocumentActivity = this.f20572a;
            if (!(!myDocumentActivity.T || (extras = myDocumentActivity.getIntent().getExtras()) == null || (string = extras.getString("DATA_PLATE")) == null)) {
                MyDocumentActivity myDocumentActivity2 = this.f20572a;
                Iterator it = ((Iterable) ((f.c) fVar).f18006a).iterator();
                while (true) {
                    l10 = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (j.a(((MyDocument) obj2).getLicensePlate(), string)) {
                        break;
                    }
                }
                MyDocument myDocument = (MyDocument) obj2;
                if (myDocument != null) {
                    Intent intent = new Intent(myDocumentActivity2, AuctionReportActivity.class);
                    WinningAnnounce winningAnnounce = myDocument.getWinningAnnounce();
                    if (winningAnnounce != null) {
                        l10 = winningAnnounce.getDocumentId();
                    }
                    intent.putExtra("DATA_DOCUMENT", l10);
                    myDocumentActivity2.startActivity(intent);
                    myDocumentActivity2.T = false;
                }
            }
        }
        return i.f20112a;
    }
}
