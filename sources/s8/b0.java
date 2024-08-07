package s8;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public abstract class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TaskCompletionSource f14661a;

    public b0() {
        this.f14661a = null;
    }

    public b0(TaskCompletionSource taskCompletionSource) {
        this.f14661a = taskCompletionSource;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f14661a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f14661a;
    }

    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }
}
