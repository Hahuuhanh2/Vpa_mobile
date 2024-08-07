package okhttp3.internal.http2;

import java.util.List;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$pushHeadersLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22437e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f22438f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f22439g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushHeadersLater$$inlined$execute$default$1(String str, Http2Connection http2Connection, int i10, List list, boolean z10) {
        super(str, true);
        this.f22437e = http2Connection;
        this.f22438f = i10;
        this.f22439g = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r3 = this;
            okhttp3.internal.http2.Http2Connection r0 = r3.f22437e
            okhttp3.internal.http2.PushObserver r0 = r0.f22415s
            java.util.List r1 = r3.f22439g
            okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel r0 = (okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel) r0
            r0.getClass()
            java.lang.String r0 = "responseHeaders"
            sk.j.f(r1, r0)
            okhttp3.internal.http2.Http2Connection r0 = r3.f22437e     // Catch:{ IOException -> 0x0030 }
            okhttp3.internal.http2.Http2Writer r0 = r0.F     // Catch:{ IOException -> 0x0030 }
            int r1 = r3.f22438f     // Catch:{ IOException -> 0x0030 }
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0030 }
            r0.v(r1, r2)     // Catch:{ IOException -> 0x0030 }
            okhttp3.internal.http2.Http2Connection r0 = r3.f22437e     // Catch:{ IOException -> 0x0030 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0030 }
            okhttp3.internal.http2.Http2Connection r1 = r3.f22437e     // Catch:{ all -> 0x002d }
            java.util.LinkedHashSet r1 = r1.H     // Catch:{ all -> 0x002d }
            int r2 = r3.f22438f     // Catch:{ all -> 0x002d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x002d }
            r1.remove(r2)     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0030 }
            goto L_0x0030
        L_0x002d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0030 }
            throw r1     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1.a():long");
    }
}
