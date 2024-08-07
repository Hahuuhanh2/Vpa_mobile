package ri;

import com.vpa.daugia.module.sse.data.model.SSEEventData;
import com.vpa.daugia.module.sse.data.model.STATUS;
import ek.i;
import java.util.Objects;
import rk.l;
import sk.k;

/* compiled from: DemoSSEActivity.kt */
public final class a extends k implements l<SSEEventData, i> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22795a = new a();

    public a() {
        super(1);
    }

    public final Object invoke(Object obj) {
        SSEEventData sSEEventData = (SSEEventData) obj;
        Objects.toString(sSEEventData.getStatus());
        sSEEventData.getStatus();
        STATUS status = STATUS.SUCCESS;
        return i.f20112a;
    }
}
