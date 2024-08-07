package com.vpa.daugia.module.sse.data.api;

import com.vpa.daugia.module.sse.data.model.SSEEventData;
import com.vpa.daugia.module.sse.data.model.STATUS;
import ek.i;
import kf.h;
import okhttp3.Response;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import sk.e;
import sk.j;

/* compiled from: SSERepository.kt */
public final class SSERepository$initEventSource$sseEventSourceListener$1 extends EventSourceListener {
    public final /* synthetic */ SSERepository this$0;

    public SSERepository$initEventSource$sseEventSourceListener$1(SSERepository sSERepository) {
        this.this$0 = sSERepository;
    }

    public void onClosed(EventSource eventSource) {
        j.f(eventSource, "eventSource");
        super.onClosed(eventSource);
        this.this$0.getSseEventsFlow().b(new SSEEventData(STATUS.CLOSED, (String) null, 2, (e) null));
    }

    public void onEvent(EventSource eventSource, String str, String str2, String str3) {
        boolean z10;
        j.f(eventSource, "eventSource");
        j.f(str3, "data");
        super.onEvent(eventSource, str, str2, str3);
        if (str3.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.this$0.getSseEventsFlow().b(new SSEEventData(STATUS.SUCCESS, str3));
        }
    }

    public void onFailure(EventSource eventSource, Throwable th2, Response response) {
        j.f(eventSource, "eventSource");
        super.onFailure(eventSource, th2, response);
        if (th2 != null) {
            th2.printStackTrace();
        }
        if (th2 != null) {
            th2.printStackTrace();
            i iVar = i.f20112a;
        }
        int i10 = h.f12560a;
        this.this$0.getSseEventsFlow().b(new SSEEventData(STATUS.ERROR, (String) null));
    }

    public void onOpen(EventSource eventSource, Response response) {
        j.f(eventSource, "eventSource");
        j.f(response, "response");
        super.onOpen(eventSource, response);
        this.this$0.getSseEventsFlow().b(new SSEEventData(STATUS.OPEN, (String) null, 2, (e) null));
    }
}
