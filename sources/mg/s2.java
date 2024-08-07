package mg;

import android.view.View;
import android.widget.ImageButton;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import d2.l;

/* compiled from: DialogLoseAuctionBinding */
public abstract class s2 extends l {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f21346y = 0;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f21347w;

    /* renamed from: x  reason: collision with root package name */
    public BiddingRoomId f21348x;

    public s2(Object obj, View view, ImageButton imageButton) {
        super(0, view, obj);
        this.f21347w = imageButton;
    }

    public abstract void v(BiddingRoomId biddingRoomId);
}
