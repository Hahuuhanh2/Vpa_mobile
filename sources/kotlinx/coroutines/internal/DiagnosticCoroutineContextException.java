package kotlinx.coroutines.internal;

import ik.f;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final transient f f20849a;

    public DiagnosticCoroutineContextException(f fVar) {
        this.f20849a = fVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final String getLocalizedMessage() {
        return this.f20849a.toString();
    }
}
