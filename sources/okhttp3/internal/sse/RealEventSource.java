package okhttp3.internal.sse;

import com.vpa.daugia.module.sse.data.api.SSERepository$initEventSource$sseEventSourceListener$1;
import java.io.IOException;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.sse.ServerSentEventReader;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import sk.j;

/* compiled from: RealEventSource.kt */
public final class RealEventSource implements EventSource, ServerSentEventReader.Callback, Callback {

    /* renamed from: a  reason: collision with root package name */
    public RealCall f22601a;

    /* renamed from: b  reason: collision with root package name */
    public final EventSourceListener f22602b;

    public RealEventSource(Request request, SSERepository$initEventSource$sseEventSourceListener$1 sSERepository$initEventSource$sseEventSourceListener$1) {
        this.f22602b = sSERepository$initEventSource$sseEventSourceListener$1;
    }

    public final void a(String str, String str2, String str3) {
        this.f22602b.onEvent(this, str, str2, str3);
    }

    public final void b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        p3.l0.u(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(okhttp3.internal.connection.RealCall r7, okhttp3.Response r8) {
        /*
            r6 = this;
            java.lang.String r7 = "call"
            boolean r0 = r8.i()     // Catch:{ all -> 0x009b }
            r1 = 0
            if (r0 != 0) goto L_0x0013
            okhttp3.sse.EventSourceListener r7 = r6.f22602b     // Catch:{ all -> 0x009b }
            r7.onFailure(r6, r1, r8)     // Catch:{ all -> 0x009b }
            p3.l0.u(r8, r1)
            goto L_0x0096
        L_0x0013:
            okhttp3.ResponseBody r0 = r8.f22130n     // Catch:{ all -> 0x009b }
            sk.j.c(r0)     // Catch:{ all -> 0x009b }
            okhttp3.MediaType r2 = r0.h()     // Catch:{ all -> 0x009b }
            r3 = 0
            if (r2 == 0) goto L_0x0034
            java.lang.String r4 = r2.f22030b     // Catch:{ all -> 0x009b }
            java.lang.String r5 = "text"
            boolean r4 = sk.j.a(r4, r5)     // Catch:{ all -> 0x009b }
            if (r4 == 0) goto L_0x0034
            java.lang.String r2 = r2.f22031c     // Catch:{ all -> 0x009b }
            java.lang.String r4 = "event-stream"
            boolean r2 = sk.j.a(r2, r4)     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0034
            r3 = 1
        L_0x0034:
            if (r3 != 0) goto L_0x0059
            okhttp3.sse.EventSourceListener r7 = r6.f22602b     // Catch:{ all -> 0x009b }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r3.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r4 = "Invalid content-type: "
            r3.append(r4)     // Catch:{ all -> 0x009b }
            okhttp3.MediaType r0 = r0.h()     // Catch:{ all -> 0x009b }
            r3.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x009b }
            r2.<init>(r0)     // Catch:{ all -> 0x009b }
            r7.onFailure(r6, r2, r8)     // Catch:{ all -> 0x009b }
            p3.l0.u(r8, r1)
            goto L_0x0096
        L_0x0059:
            okhttp3.internal.connection.RealCall r2 = r6.f22601a     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0097
            r2.l()     // Catch:{ all -> 0x009b }
            okhttp3.Response$Builder r7 = new okhttp3.Response$Builder     // Catch:{ all -> 0x009b }
            r7.<init>(r8)     // Catch:{ all -> 0x009b }
            okhttp3.ResponseBody$Companion$asResponseBody$1 r2 = okhttp3.internal.Util.f22173c     // Catch:{ all -> 0x009b }
            r7.f22144g = r2     // Catch:{ all -> 0x009b }
            okhttp3.Response r7 = r7.a()     // Catch:{ all -> 0x009b }
            okhttp3.internal.sse.ServerSentEventReader r2 = new okhttp3.internal.sse.ServerSentEventReader     // Catch:{ all -> 0x009b }
            ll.i r0 = r0.i()     // Catch:{ all -> 0x009b }
            r2.<init>(r0, r6)     // Catch:{ all -> 0x009b }
            okhttp3.sse.EventSourceListener r0 = r6.f22602b     // Catch:{ Exception -> 0x008d }
            r0.onOpen(r6, r7)     // Catch:{ Exception -> 0x008d }
        L_0x007b:
            boolean r0 = r2.a()     // Catch:{ Exception -> 0x008d }
            if (r0 == 0) goto L_0x0082
            goto L_0x007b
        L_0x0082:
            okhttp3.sse.EventSourceListener r7 = r6.f22602b     // Catch:{ all -> 0x009b }
            r7.onClosed(r6)     // Catch:{ all -> 0x009b }
            ek.i r7 = ek.i.f20112a     // Catch:{ all -> 0x009b }
            p3.l0.u(r8, r1)
            goto L_0x0096
        L_0x008d:
            r0 = move-exception
            okhttp3.sse.EventSourceListener r2 = r6.f22602b     // Catch:{ all -> 0x009b }
            r2.onFailure(r6, r0, r7)     // Catch:{ all -> 0x009b }
            p3.l0.u(r8, r1)
        L_0x0096:
            return
        L_0x0097:
            sk.j.l(r7)     // Catch:{ all -> 0x009b }
            throw r1     // Catch:{ all -> 0x009b }
        L_0x009b:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            p3.l0.u(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.sse.RealEventSource.c(okhttp3.internal.connection.RealCall, okhttp3.Response):void");
    }

    public final void f(RealCall realCall, IOException iOException) {
        j.f(realCall, "call");
        this.f22602b.onFailure(this, iOException, (Response) null);
    }
}
