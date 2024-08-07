package ih;

import androidx.appcompat.widget.SearchView;
import com.vpa.daugia.module.common.ui.activity.MyDocumentActivity;
import df.b;
import java.util.Timer;
import n0.l;

/* compiled from: SearchViewExtensions.kt */
public final class e implements SearchView.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MyDocumentActivity f20571a;

    public e(MyDocumentActivity myDocumentActivity) {
        this.f20571a = myDocumentActivity;
    }

    public final void a(String str) {
        Timer n10 = l.n(b.f8966a);
        b.f8966a = n10;
        n10.schedule(new d(str, this.f20571a), 200);
    }

    public final void b() {
    }
}
