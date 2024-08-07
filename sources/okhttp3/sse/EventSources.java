package okhttp3.sse;

import okhttp3.OkHttpClient;
import okhttp3.sse.EventSource;

/* compiled from: EventSources.kt */
public final class EventSources {
    static {
        new EventSources();
    }

    private EventSources() {
    }

    public static final EventSource.Factory a(OkHttpClient okHttpClient) {
        return new EventSources$createFactory$1(okHttpClient);
    }
}
