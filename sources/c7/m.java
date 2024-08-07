package c7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class m extends a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f4578a;

    public m(TaskCompletionSource taskCompletionSource) {
        this.f4578a = taskCompletionSource;
    }

    public final void i(Status status, ModuleInstallResponse moduleInstallResponse) {
        l0.T0(status, moduleInstallResponse, this.f4578a);
    }
}
