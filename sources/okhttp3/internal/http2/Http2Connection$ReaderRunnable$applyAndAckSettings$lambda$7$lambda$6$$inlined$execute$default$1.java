package okhttp3.internal.http2;

import okhttp3.internal.concurrent.Task;
import sk.r;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22423e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r f22424f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1(String str, Http2Connection http2Connection, r rVar) {
        super(str, true);
        this.f22423e = http2Connection;
        this.f22424f = rVar;
    }

    public final long a() {
        Http2Connection http2Connection = this.f22423e;
        http2Connection.f22405b.a(http2Connection, (Settings) this.f22424f.f22931a);
        return -1;
    }
}
