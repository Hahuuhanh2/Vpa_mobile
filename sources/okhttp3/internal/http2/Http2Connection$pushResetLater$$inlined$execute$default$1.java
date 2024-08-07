package okhttp3.internal.http2;

import ek.i;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.PushObserver;
import sk.j;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$pushResetLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22443e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f22444f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ErrorCode f22445g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushResetLater$$inlined$execute$default$1(String str, Http2Connection http2Connection, int i10, ErrorCode errorCode) {
        super(str, true);
        this.f22443e = http2Connection;
        this.f22444f = i10;
        this.f22445g = errorCode;
    }

    public final long a() {
        PushObserver pushObserver = this.f22443e.f22415s;
        ErrorCode errorCode = this.f22445g;
        ((PushObserver.Companion.PushObserverCancel) pushObserver).getClass();
        j.f(errorCode, "errorCode");
        synchronized (this.f22443e) {
            this.f22443e.H.remove(Integer.valueOf(this.f22444f));
            i iVar = i.f20112a;
        }
        return -1;
    }
}
