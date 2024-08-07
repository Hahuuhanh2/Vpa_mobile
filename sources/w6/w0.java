package w6;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import v6.c;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class w0 extends zau {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y0 f16671a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w0(y0 y0Var, Looper looper) {
        super(looper);
        this.f16671a = y0Var;
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            c cVar = (c) message.obj;
            synchronized (this.f16671a.f16678c) {
                y0 y0Var = this.f16671a.f16676a;
                j.f(y0Var);
                if (cVar == null) {
                    y0Var.b(new Status(13, "Transform returned null", (PendingIntent) null, (ConnectionResult) null));
                } else if (cVar instanceof s0) {
                    s0 s0Var = (s0) cVar;
                    y0Var.b((Status) null);
                } else {
                    synchronized (y0Var.f16678c) {
                        y0Var.f16677b = cVar;
                        y0Var.c();
                    }
                }
            }
        } else if (i10 == 1) {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage()));
            throw runtimeException;
        }
    }
}
