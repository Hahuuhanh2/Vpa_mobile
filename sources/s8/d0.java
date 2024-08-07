package s8;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final /* synthetic */ class d0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f14666a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f14667b;

    public /* synthetic */ d0(e eVar, TaskCompletionSource taskCompletionSource) {
        this.f14666a = eVar;
        this.f14667b = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        e eVar = this.f14666a;
        TaskCompletionSource taskCompletionSource = this.f14667b;
        synchronized (eVar.f14674f) {
            eVar.f14673e.remove(taskCompletionSource);
        }
    }
}
