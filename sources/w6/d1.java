package w6;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;
import w6.h;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class d1 extends x0 {

    /* renamed from: c  reason: collision with root package name */
    public final h.a f16586c;

    public d1(h.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f16586c = aVar;
    }

    public final /* bridge */ /* synthetic */ void d(s sVar, boolean z10) {
    }

    public final boolean f(b0 b0Var) {
        n0 n0Var = (n0) b0Var.f16551f.get(this.f16586c);
        if (n0Var == null) {
            return false;
        }
        n0Var.getClass();
        throw null;
    }

    public final Feature[] g(b0 b0Var) {
        n0 n0Var = (n0) b0Var.f16551f.get(this.f16586c);
        if (n0Var == null) {
            return null;
        }
        n0Var.getClass();
        throw null;
    }

    public final void h(b0 b0Var) {
        n0 n0Var = (n0) b0Var.f16551f.remove(this.f16586c);
        if (n0Var == null) {
            this.f16673b.trySetResult(Boolean.FALSE);
        } else {
            n0Var.getClass();
            throw null;
        }
    }
}
