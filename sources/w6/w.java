package w6;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class w implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16669a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f16670b;

    public /* synthetic */ w(zau zau) {
        this.f16670b = zau;
    }

    public final void execute(Runnable runnable) {
        switch (this.f16669a) {
            case 0:
                this.f16670b.post(runnable);
                return;
            default:
                this.f16670b.post(runnable);
                return;
        }
    }

    public w(Looper looper) {
        this.f16670b = new zzi(looper);
    }
}
