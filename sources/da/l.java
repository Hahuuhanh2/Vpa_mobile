package da;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: UiExecutor */
public enum l implements Executor {
    ;
    
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f8864b = null;

    /* access modifiers changed from: public */
    static {
        f8864b = new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: public */
    l() {
    }

    public final void execute(Runnable runnable) {
        f8864b.post(runnable);
    }
}
