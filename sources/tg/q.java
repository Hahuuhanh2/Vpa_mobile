package tg;

import android.os.CountDownTimer;
import com.google.android.material.button.MaterialButton;
import com.ots.base.utils.customview.TimeCounterView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.data.model.p003enum.StatusRoomAuction;
import ef.d;
import ek.i;
import java.io.Serializable;
import java.util.Calendar;
import kf.b;
import mg.a7;
import rk.l;
import sk.j;
import ug.f;
import wg.a;

/* compiled from: RoomAuctionAdapter.kt */
public final class q extends d<PriceTable, a7> {

    /* renamed from: p  reason: collision with root package name */
    public final l<PriceTable, i> f23005p;

    /* renamed from: q  reason: collision with root package name */
    public l<? super PriceTable, i> f23006q;

    /* renamed from: r  reason: collision with root package name */
    public l<? super PriceTable, i> f23007r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(a aVar) {
        super(aVar);
        j.f(aVar, "listener");
        this.f23005p = aVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        long j10;
        a7 a7Var = (a7) lVar;
        PriceTable priceTable = (PriceTable) serializable;
        j.f(a7Var, "binding");
        j.f(priceTable, "model");
        a7Var.v(new f(priceTable, (Long) null));
        a7Var.B.setOnClickListener(new d(1, this, priceTable));
        MaterialButton materialButton = a7Var.f20960w;
        j.e(materialButton, "btnJoin");
        materialButton.setOnClickListener(new b(500, materialButton, new o(this, priceTable)));
        a7Var.f20963z.setOnClickListener(new e(a7Var, this, priceTable, 1));
        Long startAuction = priceTable.getStartAuction();
        long j11 = 0;
        if (startAuction != null) {
            j10 = startAuction.longValue();
        } else {
            j10 = 0;
        }
        if (j10 > Calendar.getInstance().getTimeInMillis()) {
            Integer status = priceTable.getStatus();
            int value = StatusRoomAuction.WAITING.getValue();
            if (status != null && status.intValue() == value) {
                TimeCounterView timeCounterView = a7Var.f20962y;
                Long startAuction2 = priceTable.getStartAuction();
                if (startAuction2 != null) {
                    j11 = startAuction2.longValue();
                }
                timeCounterView.m(j11, new p(a7Var, this, priceTable));
                return;
            }
            CountDownTimer countDownTimer = a7Var.f20962y.f8269o;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                return;
            }
            return;
        }
        a7Var.f20962y.setText("Tham gia đấu giá");
        CountDownTimer countDownTimer2 = a7Var.f20962y.f8269o;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
    }

    public final int x() {
        return C0535R$layout.item_room_auction;
    }

    public final void z(Serializable serializable) {
        PriceTable priceTable = (PriceTable) serializable;
        j.f(priceTable, "model");
        l<? super PriceTable, i> lVar = this.f23006q;
        if (lVar != null) {
            lVar.invoke(priceTable);
        }
    }
}
