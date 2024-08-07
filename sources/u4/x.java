package u4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15270a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f15271b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler */
    public static final class a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((u) message.obj).b();
            return true;
        }
    }

    public final synchronized void a(u<?> uVar, boolean z10) {
        if (!this.f15270a) {
            if (!z10) {
                this.f15270a = true;
                uVar.b();
                this.f15270a = false;
            }
        }
        this.f15271b.obtainMessage(1, uVar).sendToTarget();
    }
}
