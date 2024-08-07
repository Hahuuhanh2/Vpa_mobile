package al;

import android.support.v4.media.a;
import ek.i;
import java.util.concurrent.Future;
import rk.l;

/* compiled from: Future.kt */
public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19038a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f19039b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f19038a = i10;
        this.f19039b = obj;
    }

    public final void h(Throwable th2) {
        switch (this.f19038a) {
            case 0:
                if (th2 != null) {
                    ((Future) this.f19039b).cancel(false);
                    return;
                }
                return;
            default:
                ((l) this.f19039b).invoke(th2);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f19038a) {
            case 0:
                h((Throwable) obj);
                return i.f20112a;
            default:
                h((Throwable) obj);
                return i.f20112a;
        }
    }

    public final String toString() {
        switch (this.f19038a) {
            case 0:
                StringBuilder q10 = a.q("CancelFutureOnCancel[");
                q10.append((Future) this.f19039b);
                q10.append(']');
                return q10.toString();
            default:
                StringBuilder q11 = a.q("InvokeOnCancel[");
                q11.append(((l) this.f19039b).getClass().getSimpleName());
                q11.append('@');
                q11.append(g0.T(this));
                q11.append(']');
                return q11.toString();
        }
    }
}
