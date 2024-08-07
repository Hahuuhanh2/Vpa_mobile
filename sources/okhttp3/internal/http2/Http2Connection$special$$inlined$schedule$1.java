package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$special$$inlined$schedule$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22447e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f22448f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$special$$inlined$schedule$1(String str, Http2Connection http2Connection, long j10) {
        super(str, true);
        this.f22447e = http2Connection;
        this.f22448f = j10;
    }

    public final long a() {
        Http2Connection http2Connection;
        boolean z10;
        synchronized (this.f22447e) {
            http2Connection = this.f22447e;
            long j10 = http2Connection.f22417u;
            long j11 = http2Connection.f22416t;
            if (j10 < j11) {
                z10 = true;
            } else {
                http2Connection.f22416t = j11 + 1;
                z10 = false;
            }
        }
        if (z10) {
            http2Connection.h((IOException) null);
            return -1;
        }
        try {
            http2Connection.F.s(false, 1, 0);
        } catch (IOException e10) {
            http2Connection.h(e10);
        }
        return this.f22448f;
    }
}
