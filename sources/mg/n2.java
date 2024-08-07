package mg;

import android.view.View;
import android.widget.TextView;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import d2.l;

/* compiled from: DialogCongratulationBinding */
public abstract class n2 extends l {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f21245y = 0;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f21246w;

    /* renamed from: x  reason: collision with root package name */
    public BiddingRoomId f21247x;

    public n2(Object obj, View view, TextView textView) {
        super(0, view, obj);
        this.f21246w = textView;
    }

    public abstract void v(BiddingRoomId biddingRoomId);
}
