package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.http2.Http2Connection;
import sk.j;

/* compiled from: Http2Connection.kt */
public final class Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 extends Http2Connection.Listener {
    public final void b(Http2Stream http2Stream) {
        j.f(http2Stream, "stream");
        http2Stream.c(ErrorCode.REFUSED_STREAM, (IOException) null);
    }
}
