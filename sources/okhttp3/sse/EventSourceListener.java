package okhttp3.sse;

import okhttp3.Response;
import sk.j;

/* compiled from: EventSourceListener.kt */
public abstract class EventSourceListener {
    public void onClosed(EventSource eventSource) {
        j.f(eventSource, "eventSource");
    }

    public void onEvent(EventSource eventSource, String str, String str2, String str3) {
        j.f(eventSource, "eventSource");
        j.f(str3, "data");
    }

    public void onFailure(EventSource eventSource, Throwable th2, Response response) {
        j.f(eventSource, "eventSource");
    }

    public void onOpen(EventSource eventSource, Response response) {
        j.f(eventSource, "eventSource");
        j.f(response, "response");
    }
}
