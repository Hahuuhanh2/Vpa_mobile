package ah;

import android.widget.TextView;
import ek.i;
import j$.time.Month;
import j$.time.YearMonth;
import j$.time.format.TextStyle;
import java.util.Locale;
import rk.l;
import sk.j;
import sk.k;
import zd.b;

/* compiled from: DialogTimePicker.kt */
public final class f extends k implements l<b, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f18966a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d dVar) {
        super(1);
        this.f18966a = dVar;
    }

    public final Object invoke(Object obj) {
        YearMonth yearMonth;
        j.f((b) obj, "it");
        d dVar = this.f18966a;
        b t02 = dVar.f18960i.f21334x.t0();
        if (!(t02 == null || (yearMonth = t02.f17980a) == null)) {
            TextView textView = dVar.f18960i.C;
            StringBuilder sb2 = new StringBuilder();
            Month month = yearMonth.getMonth();
            j.e(month, "getMonth(...)");
            String displayName = month.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            j.e(displayName, "getDisplayName(...)");
            sb2.append(displayName);
            sb2.append(' ');
            sb2.append(yearMonth.getYear());
            textView.setText(sb2.toString());
        }
        return i.f20112a;
    }
}
