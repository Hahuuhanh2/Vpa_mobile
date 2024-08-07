package okhttp3.sse;

import com.vpa.daugia.module.sse.data.api.SSERepository$initEventSource$sseEventSourceListener$1;
import ea.c;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.sse.RealEventSource;
import okhttp3.sse.EventSource;
import sk.j;

/* compiled from: EventSources.kt */
public final class EventSources$createFactory$1 implements EventSource.Factory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OkHttpClient f22631a;

    public EventSources$createFactory$1(OkHttpClient okHttpClient) {
        this.f22631a = okHttpClient;
    }

    public final RealEventSource a(Request request, SSERepository$initEventSource$sseEventSourceListener$1 sSERepository$initEventSource$sseEventSourceListener$1) {
        j.f(request, "request");
        if (request.f22106c.g("Accept") == null) {
            Request.Builder builder = new Request.Builder(request);
            builder.f22112c.a("Accept", "text/event-stream");
            request = builder.a();
        }
        RealEventSource realEventSource = new RealEventSource(request, sSERepository$initEventSource$sseEventSourceListener$1);
        OkHttpClient okHttpClient = this.f22631a;
        j.f(okHttpClient, "client");
        OkHttpClient.Builder b10 = okHttpClient.b();
        EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f21988a;
        j.f(eventListener$Companion$NONE$1, "eventListener");
        b10.f22073e = new c(eventListener$Companion$NONE$1, 29);
        RealCall a10 = new OkHttpClient(b10).a(request);
        realEventSource.f22601a = a10;
        a10.v(realEventSource);
        return realEventSource;
    }
}
