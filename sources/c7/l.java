package c7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class l extends a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f4577a;

    public l(TaskCompletionSource taskCompletionSource) {
        this.f4577a = taskCompletionSource;
    }

    public final void j(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        l0.T0(status, moduleAvailabilityResponse, this.f4577a);
    }
}
