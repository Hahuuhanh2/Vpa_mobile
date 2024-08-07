package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;
import sk.j;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$writeSynResetLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22449e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f22450f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ErrorCode f22451g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$writeSynResetLater$$inlined$execute$default$1(String str, Http2Connection http2Connection, int i10, ErrorCode errorCode) {
        super(str, true);
        this.f22449e = http2Connection;
        this.f22450f = i10;
        this.f22451g = errorCode;
    }

    public final long a() {
        try {
            Http2Connection http2Connection = this.f22449e;
            int i10 = this.f22450f;
            ErrorCode errorCode = this.f22451g;
            http2Connection.getClass();
            j.f(errorCode, "statusCode");
            http2Connection.F.v(i10, errorCode);
            return -1;
        } catch (IOException e10) {
            Http2Connection http2Connection2 = this.f22449e;
            Http2Connection.Companion companion = Http2Connection.I;
            http2Connection2.h(e10);
            return -1;
        }
    }
}
