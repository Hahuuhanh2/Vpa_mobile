package okhttp3.internal.http;

import ll.a0;
import ll.c0;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;

/* compiled from: ExchangeCodec.kt */
public interface ExchangeCodec {

    /* compiled from: ExchangeCodec.kt */
    public static final class Companion {
        static {
            new Companion();
        }

        private Companion() {
        }
    }

    void a();

    void b(Request request);

    c0 c(Response response);

    void cancel();

    Response.Builder d(boolean z10);

    RealConnection e();

    void f();

    long g(Response response);

    a0 h(Request request, long j10);
}
