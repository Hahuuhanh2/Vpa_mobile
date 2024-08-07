package ih;

import android.support.v4.media.a;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.common.ui.CommonViewModel;
import com.vpa.daugia.module.common.ui.activity.MyDocumentActivity;
import ef.n;
import ek.i;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kf.e;
import mg.i0;
import rk.l;
import sk.j;
import sk.k;
import v1.c;

/* compiled from: MyDocumentActivity.kt */
public final class g extends k implements l<c<Long, Long>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MyDocumentActivity f20573a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(MyDocumentActivity myDocumentActivity) {
        super(1);
        this.f20573a = myDocumentActivity;
    }

    public final Object invoke(Object obj) {
        c<Long, Long> cVar = (c) obj;
        MyDocumentActivity myDocumentActivity = this.f20573a;
        int i10 = MyDocumentActivity.V;
        myDocumentActivity.U().f19618e = new n<>((Object) null);
        MyDocumentActivity myDocumentActivity2 = this.f20573a;
        myDocumentActivity2.S = cVar;
        CommonViewModel U = myDocumentActivity2.U();
        String obj2 = ((i0) this.f20573a.M()).f21105z.getQuery().toString();
        F f10 = cVar.f16012a;
        j.e(f10, "first");
        Long valueOf = Long.valueOf(e.i(((Number) f10).longValue()));
        S s10 = cVar.f16013b;
        j.e(s10, "second");
        long j10 = (long) 68400000;
        U.d(obj2, valueOf, Long.valueOf(e.i(((Number) s10).longValue()) + j10));
        ((i0) this.f20573a.M()).f21102w.setImageResource(C0531R$drawable.ic_calendar_vpa_on);
        AppTextView appTextView = ((i0) this.f20573a.M()).B;
        StringBuilder q10 = a.q("Từ ");
        F f11 = cVar.f16012a;
        j.e(f11, "first");
        String h10 = n0.l.h(e.i(((Number) f11).longValue()), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()));
        String str = "";
        if (h10 == null) {
            h10 = str;
        }
        q10.append(h10);
        q10.append(" Đến ");
        S s11 = cVar.f16013b;
        j.e(s11, "second");
        String h11 = n0.l.h(e.i(((Number) s11).longValue()) + j10, new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()));
        if (h11 != null) {
            str = h11;
        }
        q10.append(str);
        appTextView.setText(q10.toString());
        return i.f20112a;
    }
}
