package okhttp3.sse;

import com.vpa.daugia.module.sse.data.api.SSERepository$initEventSource$sseEventSourceListener$1;
import okhttp3.Request;
import okhttp3.internal.sse.RealEventSource;

/* compiled from: EventSource.kt */
public interface EventSource {

    /* compiled from: EventSource.kt */
    public interface Factory {
        RealEventSource a(Request request, SSERepository$initEventSource$sseEventSourceListener$1 sSERepository$initEventSource$sseEventSourceListener$1);
    }
}
