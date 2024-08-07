package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22452e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f22453f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f22454g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1(String str, Http2Connection http2Connection, int i10, long j10) {
        super(str, true);
        this.f22452e = http2Connection;
        this.f22453f = i10;
        this.f22454g = j10;
    }

    public final long a() {
        try {
            this.f22452e.F.x(this.f22453f, this.f22454g);
            return -1;
        } catch (IOException e10) {
            Http2Connection http2Connection = this.f22452e;
            Http2Connection.Companion companion = Http2Connection.I;
            http2Connection.h(e10);
            return -1;
        }
    }
}
