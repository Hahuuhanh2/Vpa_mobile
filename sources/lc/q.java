package lc;

import java.util.concurrent.Executor;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public enum q implements Executor {
    ;

    /* access modifiers changed from: public */
    q() {
    }

    public final void execute(Runnable runnable) {
        g.a().f12912a.post(runnable);
    }
}
