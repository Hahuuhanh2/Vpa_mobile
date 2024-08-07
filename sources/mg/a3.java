package mg;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import d2.l;

/* compiled from: DialogWinAuctionBinding */
public abstract class a3 extends l {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f20940z = 0;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f20941w;

    /* renamed from: x  reason: collision with root package name */
    public final Button f20942x;

    /* renamed from: y  reason: collision with root package name */
    public BiddingRoomId f20943y;

    public a3(Object obj, View view, ImageButton imageButton, Button button) {
        super(0, view, obj);
        this.f20941w = imageButton;
        this.f20942x = button;
    }

    public abstract void v(BiddingRoomId biddingRoomId);
}
