package w6;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import f0.b0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class a1 extends e1 {

    /* renamed from: b  reason: collision with root package name */
    public final a f16540b;

    public a1(int i10, a aVar) {
        super(i10);
        if (aVar != null) {
            this.f16540b = aVar;
            return;
        }
        throw new NullPointerException("Null methods are not runnable.");
    }

    public final void a(Status status) {
        try {
            this.f16540b.setFailedResult(status);
        } catch (IllegalStateException unused) {
        }
    }

    public final void b(RuntimeException runtimeException) {
        try {
            this.f16540b.setFailedResult(new Status(10, b0.s(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), (PendingIntent) null, (ConnectionResult) null));
        } catch (IllegalStateException unused) {
        }
    }

    public final void c(b0 b0Var) {
        try {
            this.f16540b.run(b0Var.f16547b);
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    public final void d(s sVar, boolean z10) {
        a aVar = this.f16540b;
        sVar.f16654a.put(aVar, Boolean.valueOf(z10));
        aVar.addStatusListener(new q(sVar, aVar));
    }
}
