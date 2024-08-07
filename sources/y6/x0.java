package y6;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import g7.a;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class x0 extends d {

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f17605d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Context f17606e;

    /* renamed from: f  reason: collision with root package name */
    public volatile zzi f17607f;

    /* renamed from: g  reason: collision with root package name */
    public final a f17608g;

    /* renamed from: h  reason: collision with root package name */
    public final long f17609h;

    /* renamed from: i  reason: collision with root package name */
    public final long f17610i;

    /* renamed from: j  reason: collision with root package name */
    public volatile Executor f17611j;

    public x0(Context context, Looper looper) {
        w0 w0Var = new w0(this);
        this.f17606e = context.getApplicationContext();
        this.f17607f = new zzi(looper, w0Var);
        this.f17608g = a.a();
        this.f17609h = 5000;
        this.f17610i = 300000;
        this.f17611j = null;
    }

    public final boolean c(u0 u0Var, n0 n0Var, String str, Executor executor) {
        boolean z10;
        synchronized (this.f17605d) {
            try {
                v0 v0Var = (v0) this.f17605d.get(u0Var);
                if (executor == null) {
                    executor = this.f17611j;
                }
                if (v0Var == null) {
                    v0Var = new v0(this, u0Var);
                    v0Var.f17595a.put(n0Var, n0Var);
                    v0Var.a(str, executor);
                    this.f17605d.put(u0Var, v0Var);
                } else {
                    this.f17607f.removeMessages(0, u0Var);
                    if (!v0Var.f17595a.containsKey(n0Var)) {
                        v0Var.f17595a.put(n0Var, n0Var);
                        int i10 = v0Var.f17596b;
                        if (i10 == 1) {
                            n0Var.onServiceConnected(v0Var.f17600f, v0Var.f17598d);
                        } else if (i10 == 2) {
                            v0Var.a(str, executor);
                        }
                    } else {
                        String u0Var2 = u0Var.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + u0Var2);
                    }
                }
                z10 = v0Var.f17597c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
