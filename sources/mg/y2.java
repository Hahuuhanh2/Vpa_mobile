package mg;

import android.view.View;
import android.widget.ImageButton;
import com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE;
import d2.l;

/* compiled from: DialogStopAuctionBinding */
public abstract class y2 extends l {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f21491y = 0;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f21492w;

    /* renamed from: x  reason: collision with root package name */
    public CancelRoomSSE f21493x;

    public y2(Object obj, View view, ImageButton imageButton) {
        super(0, view, obj);
        this.f21492w = imageButton;
    }

    public abstract void v(CancelRoomSSE cancelRoomSSE);
}
