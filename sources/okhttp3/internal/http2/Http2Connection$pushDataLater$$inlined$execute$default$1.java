package okhttp3.internal.http2;

import ll.f;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$pushDataLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22433e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f22434f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f22435g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f22436h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushDataLater$$inlined$execute$default$1(String str, Http2Connection http2Connection, int i10, f fVar, int i11, boolean z10) {
        super(str, true);
        this.f22433e = http2Connection;
        this.f22434f = i10;
        this.f22435g = fVar;
        this.f22436h = i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r4 = this;
            okhttp3.internal.http2.Http2Connection r0 = r4.f22433e     // Catch:{ IOException -> 0x0036 }
            okhttp3.internal.http2.PushObserver r0 = r0.f22415s     // Catch:{ IOException -> 0x0036 }
            ll.f r1 = r4.f22435g     // Catch:{ IOException -> 0x0036 }
            int r2 = r4.f22436h     // Catch:{ IOException -> 0x0036 }
            okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel r0 = (okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel) r0     // Catch:{ IOException -> 0x0036 }
            r0.getClass()     // Catch:{ IOException -> 0x0036 }
            java.lang.String r0 = "source"
            sk.j.f(r1, r0)     // Catch:{ IOException -> 0x0036 }
            long r2 = (long) r2     // Catch:{ IOException -> 0x0036 }
            r1.skip(r2)     // Catch:{ IOException -> 0x0036 }
            okhttp3.internal.http2.Http2Connection r0 = r4.f22433e     // Catch:{ IOException -> 0x0036 }
            okhttp3.internal.http2.Http2Writer r0 = r0.F     // Catch:{ IOException -> 0x0036 }
            int r1 = r4.f22434f     // Catch:{ IOException -> 0x0036 }
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0036 }
            r0.v(r1, r2)     // Catch:{ IOException -> 0x0036 }
            okhttp3.internal.http2.Http2Connection r0 = r4.f22433e     // Catch:{ IOException -> 0x0036 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0036 }
            okhttp3.internal.http2.Http2Connection r1 = r4.f22433e     // Catch:{ all -> 0x0033 }
            java.util.LinkedHashSet r1 = r1.H     // Catch:{ all -> 0x0033 }
            int r2 = r4.f22434f     // Catch:{ all -> 0x0033 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0033 }
            r1.remove(r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0036 }
            goto L_0x0036
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0036 }
            throw r1     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1.a():long");
    }
}
