package y6;

import android.content.Context;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f17548a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static x0 f17549b;

    /* renamed from: c  reason: collision with root package name */
    public static HandlerThread f17550c;

    public static x0 a(Context context) {
        synchronized (f17548a) {
            if (f17549b == null) {
                f17549b = new x0(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return f17549b;
    }

    public final void b(String str, String str2, n0 n0Var, boolean z10) {
        u0 u0Var = new u0(str, str2, z10);
        x0 x0Var = (x0) this;
        synchronized (x0Var.f17605d) {
            v0 v0Var = (v0) x0Var.f17605d.get(u0Var);
            if (v0Var == null) {
                String u0Var2 = u0Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + u0Var2);
            } else if (v0Var.f17595a.containsKey(n0Var)) {
                v0Var.f17595a.remove(n0Var);
                if (v0Var.f17595a.isEmpty()) {
                    x0Var.f17607f.sendMessageDelayed(x0Var.f17607f.obtainMessage(0, u0Var), x0Var.f17609h);
                }
            } else {
                String u0Var3 = u0Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + u0Var3);
            }
        }
    }

    public abstract boolean c(u0 u0Var, n0 n0Var, String str, Executor executor);
}
