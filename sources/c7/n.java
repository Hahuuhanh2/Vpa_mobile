package c7;

import b7.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;
import p3.l0;
import w6.h;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class n extends a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4579a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f4580b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f4581c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p f4582d;

    public n(p pVar, AtomicReference atomicReference, TaskCompletionSource taskCompletionSource, a aVar) {
        this.f4582d = pVar;
        this.f4579a = atomicReference;
        this.f4580b = taskCompletionSource;
        this.f4581c = aVar;
    }

    public final void i(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f4579a.set(moduleInstallResponse);
        }
        l0.T0(status, (Object) null, this.f4580b);
        if (!status.P0() || (moduleInstallResponse != null && moduleInstallResponse.f5445b)) {
            p pVar = this.f4582d;
            a aVar = this.f4581c;
            String simpleName = a.class.getSimpleName();
            j.g(aVar, "Listener must not be null");
            j.d("Listener type must not be empty", simpleName);
            pVar.doUnregisterEventListener(new h.a(aVar, simpleName), 27306);
        }
    }
}
