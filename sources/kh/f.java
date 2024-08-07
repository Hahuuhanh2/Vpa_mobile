package kh;

import android.support.v4.media.a;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.history.HistoryViewModel;
import com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity;
import ef.n;
import ek.i;
import java.text.SimpleDateFormat;
import java.util.Locale;
import mg.e;
import rk.l;
import sk.j;
import sk.k;
import v1.c;

/* compiled from: AuctionHistoryActivity.kt */
public final class f extends k implements l<c<Long, Long>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionHistoryActivity f20818a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(AuctionHistoryActivity auctionHistoryActivity) {
        super(1);
        this.f20818a = auctionHistoryActivity;
    }

    public final Object invoke(Object obj) {
        c<Long, Long> cVar = (c) obj;
        AuctionHistoryActivity auctionHistoryActivity = this.f20818a;
        auctionHistoryActivity.S = cVar;
        auctionHistoryActivity.U().f19638f = new n<>((Object) null);
        HistoryViewModel U = this.f20818a.U();
        String obj2 = ((e) this.f20818a.M()).f21033z.getQuery().toString();
        F f10 = cVar.f16012a;
        j.e(f10, "first");
        Long valueOf = Long.valueOf(kf.e.i(((Number) f10).longValue()));
        S s10 = cVar.f16013b;
        j.e(s10, "second");
        long j10 = (long) 68400000;
        U.d(obj2, valueOf, Long.valueOf(kf.e.i(((Number) s10).longValue()) + j10));
        ((e) this.f20818a.M()).f21030w.setImageResource(C0531R$drawable.ic_calendar_vpa_on);
        AppTextView appTextView = ((e) this.f20818a.M()).B;
        StringBuilder q10 = a.q("Từ ");
        F f11 = cVar.f16012a;
        j.e(f11, "first");
        String h10 = n0.l.h(kf.e.i(((Number) f11).longValue()), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()));
        String str = "";
        if (h10 == null) {
            h10 = str;
        }
        q10.append(h10);
        q10.append(" Đến ");
        S s11 = cVar.f16013b;
        j.e(s11, "second");
        String h11 = n0.l.h(kf.e.i(((Number) s11).longValue()) + j10, new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()));
        if (h11 != null) {
            str = h11;
        }
        q10.append(str);
        appTextView.setText(q10.toString());
        return i.f20112a;
    }
}
