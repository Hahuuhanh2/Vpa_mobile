package t6;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ArrayDeque;
import lc.i;
import w6.b0;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14852a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14853b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f14852a = i10;
        this.f14853b = obj;
    }

    public final void run() {
        switch (this.f14852a) {
            case 0:
                ((m) this.f14853b).a(2, "Service disconnected");
                return;
            case 1:
                ((TaskCompletionSource) this.f14853b).trySetException(new IOException("TIMEOUT"));
                return;
            case 2:
                ((b0) this.f14853b).f();
                return;
            default:
                i.f12916b.set(new ArrayDeque());
                ((Runnable) this.f14853b).run();
                return;
        }
    }
}
