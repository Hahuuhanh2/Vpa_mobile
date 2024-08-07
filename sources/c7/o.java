package c7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.l0;
import w6.e;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class o extends e.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f4583a;

    public o(TaskCompletionSource taskCompletionSource) {
        this.f4583a = taskCompletionSource;
    }

    public final void onResult(Status status) {
        l0.T0(status, Boolean.TRUE, this.f4583a);
    }
}
