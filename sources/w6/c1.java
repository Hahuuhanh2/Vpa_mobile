package w6;

import a.a;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class c1 extends h0 {

    /* renamed from: b  reason: collision with root package name */
    public final o f16562b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource f16563c;

    /* renamed from: d  reason: collision with root package name */
    public final n f16564d;

    public c1(int i10, o oVar, TaskCompletionSource taskCompletionSource, n nVar) {
        super(i10);
        this.f16563c = taskCompletionSource;
        this.f16562b = oVar;
        this.f16564d = nVar;
        if (i10 == 2 && oVar.f16637b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        TaskCompletionSource taskCompletionSource = this.f16563c;
        ((a) this.f16564d).getClass();
        taskCompletionSource.trySetException(l0.V(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.f16563c.trySetException(runtimeException);
    }

    public final void c(b0 b0Var) {
        try {
            o oVar = this.f16562b;
            ((v0) oVar).f16668d.f16639a.accept(b0Var.f16547b, this.f16563c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(e1.e(e11));
        } catch (RuntimeException e12) {
            this.f16563c.trySetException(e12);
        }
    }

    public final void d(s sVar, boolean z10) {
        TaskCompletionSource taskCompletionSource = this.f16563c;
        sVar.f16655b.put(taskCompletionSource, Boolean.valueOf(z10));
        taskCompletionSource.getTask().addOnCompleteListener(new r(sVar, taskCompletionSource));
    }

    public final boolean f(b0 b0Var) {
        return this.f16562b.f16637b;
    }

    public final Feature[] g(b0 b0Var) {
        return this.f16562b.f16636a;
    }
}
