package kotlinx.coroutines;

import al.i1;
import java.util.concurrent.CancellationException;
import sk.j;

/* compiled from: Exceptions.kt */
public final class JobCancellationException extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient i1 f20846a;

    public JobCancellationException(String str, Throwable th2, i1 i1Var) {
        super(str);
        this.f20846a = i1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!j.a(jobCancellationException.getMessage(), getMessage()) || !j.a(jobCancellationException.f20846a, this.f20846a) || !j.a(jobCancellationException.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i10;
        String message = getMessage();
        j.c(message);
        int hashCode = (this.f20846a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i10 = cause.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f20846a;
    }
}
