package da;

import java.util.concurrent.Executor;

/* compiled from: FirebaseExecutors */
public enum j implements Executor {
    ;

    /* access modifiers changed from: public */
    j() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
