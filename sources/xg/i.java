package xg;

import android.os.CountDownTimer;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import rk.a;
import sg.c0;

/* compiled from: AuctionRoomViewModel.kt */
public final class i extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionRoomViewModel f23473a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a<ek.i> f23474b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(AuctionRoomViewModel auctionRoomViewModel, c0 c0Var, long j10) {
        super(j10, 1000);
        this.f23473a = auctionRoomViewModel;
        this.f23474b = c0Var;
    }

    public final void onFinish() {
        this.f23473a.f19451z.g("");
        this.f23474b.invoke();
    }

    public final void onTick(long j10) {
        this.f23473a.f19451z.g(AuctionRoomViewModel.d(j10).toString());
    }
}
