package w6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class x0 extends h0 {

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource f16673b;

    public x0(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f16673b = taskCompletionSource;
    }

    public final void a(Status status) {
        this.f16673b.trySetException(new ApiException(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.f16673b.trySetException(runtimeException);
    }

    public final void c(b0 b0Var) {
        try {
            h(b0Var);
        } catch (DeadObjectException e10) {
            a(e1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(e1.e(e11));
        } catch (RuntimeException e12) {
            this.f16673b.trySetException(e12);
        }
    }

    public abstract void h(b0 b0Var);
}
