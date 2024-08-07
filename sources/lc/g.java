package lc;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import w6.l0;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f12910b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static g f12911c;

    /* renamed from: a  reason: collision with root package name */
    public final zza f12912a;

    public g(Looper looper) {
        this.f12912a = new zza(looper);
    }

    public static g a() {
        g gVar;
        synchronized (f12910b) {
            if (f12911c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f12911c = new g(handlerThread.getLooper());
            }
            gVar = f12911c;
        }
        return gVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        q.f12936a.execute(new l0(2, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
