package okhttp3.internal.http2;

import android.support.v4.media.a;
import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.platform.Platform;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22425e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Http2Stream f22426f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1(String str, Http2Connection http2Connection, Http2Stream http2Stream) {
        super(str, true);
        this.f22425e = http2Connection;
        this.f22426f = http2Stream;
    }

    public final long a() {
        try {
            this.f22425e.f22405b.b(this.f22426f);
            return -1;
        } catch (IOException e10) {
            Platform.f22562a.getClass();
            Platform platform = Platform.f22563b;
            StringBuilder q10 = a.q("Http2Connection.Listener failure for ");
            q10.append(this.f22425e.f22407d);
            String sb2 = q10.toString();
            platform.getClass();
            Platform.i(4, sb2, e10);
            try {
                this.f22426f.c(ErrorCode.PROTOCOL_ERROR, e10);
                return -1;
            } catch (IOException unused) {
                return -1;
            }
        }
    }
}
