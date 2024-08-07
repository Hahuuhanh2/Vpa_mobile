package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$sendDegradedPingLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22446e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$sendDegradedPingLater$$inlined$execute$default$1(String str, Http2Connection http2Connection) {
        super(str, true);
        this.f22446e = http2Connection;
    }

    public final long a() {
        Http2Connection http2Connection = this.f22446e;
        http2Connection.getClass();
        try {
            http2Connection.F.s(false, 2, 0);
            return -1;
        } catch (IOException e10) {
            http2Connection.h(e10);
            return -1;
        }
    }
}
