package kotlinx.coroutines.flow.internal;

import dl.f;
import java.util.concurrent.CancellationException;

/* compiled from: FlowExceptions.kt */
public final class AbortFlowException extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient f<?> f20848a;

    public AbortFlowException(f<?> fVar) {
        super("Flow was aborted, no more elements needed");
        this.f20848a = fVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
