package ah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.textfield.b;
import com.ots.core.R$color;
import com.vpa.daugia.C0535R$layout;
import ef.f;
import ff.a;
import fk.h;
import fk.p;
import fk.r;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.YearMonth;
import j$.time.format.TextStyle;
import j$.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import mg.r7;
import rk.l;
import sk.j;
import sk.k;
import v.v;
import w1.l0;

/* compiled from: DialogTimePicker.kt */
public final class d extends f.a<d> {

    /* renamed from: i  reason: collision with root package name */
    public r7 f18960i;

    /* renamed from: j  reason: collision with root package name */
    public h f18961j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashSet f18962k = new LinkedHashSet();

    /* renamed from: l  reason: collision with root package name */
    public final LocalDate f18963l;

    /* compiled from: DialogTimePicker.kt */
    public static final class a extends k implements l<View, TextView> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18964a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            View view = (View) obj;
            j.f(view, "it");
            return (TextView) view;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, LocalDate localDate) {
        super(context);
        boolean z10;
        boolean z11;
        r rVar;
        j.f(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = r7.D;
        DataBinderMapperImpl dataBinderMapperImpl = d2.f.f8544a;
        r7 r7Var = (r7) d2.l.l(from, C0535R$layout.time_picker, (ViewGroup) null, (Object) null);
        j.e(r7Var, "inflate(...)");
        this.f18960i = r7Var;
        this.f18963l = localDate;
        DayOfWeek firstDayOfWeek = WeekFields.of(Locale.getDefault()).getFirstDayOfWeek();
        j.e(firstDayOfWeek, "getFirstDayOfWeek(...)");
        int ordinal = 7 - firstDayOfWeek.ordinal();
        DayOfWeek[] values = DayOfWeek.values();
        List w02 = h.w0(ordinal, values);
        if (ordinal >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int length = values.length - ordinal;
            length = length < 0 ? 0 : length;
            if (length >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (length == 0) {
                    rVar = r.f20213a;
                } else if (length >= values.length) {
                    rVar = h.z0(values);
                } else if (length == 1) {
                    rVar = j7.a.c0(values[0]);
                } else {
                    ArrayList arrayList = new ArrayList(length);
                    int i11 = 0;
                    for (DayOfWeek add : values) {
                        arrayList.add(add);
                        i11++;
                        if (i11 == length) {
                            rVar = arrayList;
                            break;
                        }
                    }
                    rVar = arrayList;
                }
                ArrayList U0 = p.U0(rVar, w02);
                LinearLayout linearLayout = (LinearLayout) this.f18960i.B.f17753b;
                j.e(linearLayout, "getRoot(...)");
                a aVar = a.f18964a;
                j.f(aVar, "transform");
                l0 l0Var = new l0(linearLayout);
                int i12 = 0;
                while (l0Var.hasNext()) {
                    Object invoke = aVar.invoke(l0Var.next());
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        TextView textView = (TextView) invoke;
                        DayOfWeek dayOfWeek = (DayOfWeek) U0.get(i12);
                        j.f(dayOfWeek, "<this>");
                        String displayName = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
                        j.e(displayName, "let(...)");
                        textView.setText(displayName);
                        Context context2 = textView.getContext();
                        j.e(context2, "getContext(...)");
                        textView.setTextColor(k1.a.getColor(context2, R$color.dark_300));
                        i12 = i13;
                    } else {
                        j7.a.x0();
                        throw null;
                    }
                }
                YearMonth now = YearMonth.now();
                YearMonth minusMonths = now.minusMonths(1000);
                YearMonth plusMonths = now.plusMonths(10000);
                j.c(minusMonths);
                j.c(plusMonths);
                this.f18960i.f21334x.setDayBinder(new e(this));
                this.f18960i.f21334x.setMonthScrollListener(new f(this));
                this.f18960i.f21334x.setup(minusMonths, plusMonths, (DayOfWeek) p.M0(U0));
                this.f18960i.f21334x.y0(now);
                this.f18960i.f21336z.setOnClickListener(new c(this, 0));
                this.f18960i.f21333w.setOnClickListener(new com.google.android.material.search.h(this, 20));
                this.f18960i.f21335y.setOnClickListener(new b(this, 16));
                this.f18960i.A.setOnClickListener(new c(this, 1));
                ff.a.f10210a.getClass();
                a.C0107a aVar2 = a.C0107a.f10211a;
                c();
                f(17);
                d(false);
                e(this.f18960i.f8554e);
                return;
            }
            throw new IllegalArgumentException(v.d("Requested element count ", length, " is less than zero.").toString());
        }
        throw new IllegalArgumentException(v.d("Requested element count ", ordinal, " is less than zero.").toString());
    }
}
