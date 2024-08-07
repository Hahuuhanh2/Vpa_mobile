package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22427e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f22428f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f22429g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1(String str, Http2Connection http2Connection, int i10, int i11) {
        super(str, true);
        this.f22427e = http2Connection;
        this.f22428f = i10;
        this.f22429g = i11;
    }

    public final long a() {
        Http2Connection http2Connection = this.f22427e;
        int i10 = this.f22428f;
        int i11 = this.f22429g;
        http2Connection.getClass();
        try {
            http2Connection.F.s(true, i10, i11);
            return -1;
        } catch (IOException e10) {
            http2Connection.h(e10);
            return -1;
        }
    }
}
