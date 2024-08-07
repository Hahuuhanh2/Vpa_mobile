package ah;

import android.view.View;
import com.kizitonwose.calendar.view.CalendarView;
import j$.time.YearMonth;
import sk.j;
import zd.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18958a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f18959b;

    public /* synthetic */ c(d dVar, int i10) {
        this.f18958a = i10;
        this.f18959b = dVar;
    }

    public final void onClick(View view) {
        YearMonth yearMonth;
        switch (this.f18958a) {
            case 0:
                d dVar = this.f18959b;
                j.f(dVar, "this$0");
                dVar.a();
                return;
            default:
                d dVar2 = this.f18959b;
                j.f(dVar2, "this$0");
                b t02 = dVar2.f18960i.f21334x.t0();
                if (t02 != null && (yearMonth = t02.f17980a) != null) {
                    CalendarView calendarView = dVar2.f18960i.f21334x;
                    YearMonth plusMonths = yearMonth.plusMonths(1);
                    j.e(plusMonths, "plusMonths(...)");
                    calendarView.y0(plusMonths);
                    return;
                }
                return;
        }
    }
}
