package ah;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import be.d;
import com.ots.core.R$color;
import com.vpa.daugia.C0531R$drawable;
import j$.time.LocalDate;
import m9.b;
import sk.j;
import zd.a;
import zd.c;

/* compiled from: DialogTimePicker.kt */
public final class e implements d<g> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f18965a;

    public e(d dVar) {
        this.f18965a = dVar;
    }

    public final void a(b bVar, Object obj) {
        boolean z10;
        g gVar = (g) bVar;
        a aVar = (a) obj;
        j.f(aVar, "data");
        gVar.K = aVar;
        d dVar = this.f18965a;
        LocalDate localDate = aVar.f17978a;
        TextView textView = gVar.L;
        c cVar = aVar.f17979b;
        c cVar2 = c.MonthDate;
        if (cVar == cVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.getClass();
        textView.setText(String.valueOf(localDate.getDayOfMonth()));
        if (!z10) {
            Context context = textView.getContext();
            j.e(context, "getContext(...)");
            textView.setTextColor(k1.a.getColor(context, R$color.dark_300));
            textView.setBackground((Drawable) null);
        } else if (dVar.f18962k.contains(localDate)) {
            Context context2 = textView.getContext();
            j.e(context2, "getContext(...)");
            textView.setTextColor(k1.a.getColor(context2, 2131100626));
            textView.setBackgroundResource(C0531R$drawable.bg_date_clicked);
        } else if (j.a(dVar.f18963l, localDate)) {
            Context context3 = textView.getContext();
            j.e(context3, "getContext(...)");
            textView.setTextColor(k1.a.getColor(context3, 2131100626));
            if (!dVar.f18962k.isEmpty()) {
                textView.setBackground((Drawable) null);
            } else {
                textView.setBackgroundResource(C0531R$drawable.bg_date_clicked);
            }
        } else {
            Context context4 = textView.getContext();
            j.e(context4, "getContext(...)");
            textView.setTextColor(k1.a.getColor(context4, 2131100626));
            textView.setBackground((Drawable) null);
        }
        if (aVar.f17979b == cVar2) {
            gVar.L.setVisibility(0);
        } else {
            gVar.L.setVisibility(4);
        }
    }

    public final g b(View view) {
        return new g(this.f18965a, view);
    }
}
