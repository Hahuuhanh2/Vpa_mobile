package y6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class w0 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f17604a;

    public /* synthetic */ w0(x0 x0Var) {
        this.f17604a = x0Var;
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f17604a.f17605d) {
                try {
                    u0 u0Var = (u0) message.obj;
                    v0 v0Var = (v0) this.f17604a.f17605d.get(u0Var);
                    if (v0Var != null && v0Var.f17595a.isEmpty()) {
                        if (v0Var.f17597c) {
                            v0Var.f17601g.f17607f.removeMessages(1, v0Var.f17599e);
                            x0 x0Var = v0Var.f17601g;
                            x0Var.f17608g.b(x0Var.f17606e, v0Var);
                            v0Var.f17597c = false;
                            v0Var.f17596b = 2;
                        }
                        this.f17604a.f17605d.remove(u0Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.f17604a.f17605d) {
                u0 u0Var2 = (u0) message.obj;
                v0 v0Var2 = (v0) this.f17604a.f17605d.get(u0Var2);
                if (v0Var2 != null && v0Var2.f17596b == 3) {
                    String.valueOf(u0Var2);
                    new Exception();
                    ComponentName componentName = v0Var2.f17600f;
                    if (componentName == null) {
                        u0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = u0Var2.f17592b;
                        j.f(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    v0Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
