package okhttp3.internal.concurrent;

import ek.i;
import okhttp3.internal.http2.Http2Connection;
import rk.a;

/* compiled from: TaskQueue.kt */
public final class TaskQueue$execute$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a<i> f22202e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, Http2Connection.ReaderRunnable readerRunnable) {
        super(str, true);
        this.f22202e = readerRunnable;
    }

    public final long a() {
        this.f22202e.invoke();
        return -1;
    }
}
