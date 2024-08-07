package z3;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor */
public enum b implements Executor {
    ;

    /* access modifiers changed from: public */
    b() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "DirectExecutor";
    }
}
