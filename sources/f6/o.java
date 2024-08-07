package f6;

import h6.b;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule_ExecutorFactory */
public final class o implements b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final o f10017a = new o();
    }

    public final Object get() {
        return new q(Executors.newSingleThreadExecutor());
    }
}
