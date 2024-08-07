package kotlinx.coroutines;

import al.i1;
import java.util.concurrent.CancellationException;

/* compiled from: Timeout.kt */
public final class TimeoutCancellationException extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient i1 f20847a;

    public TimeoutCancellationException(String str, i1 i1Var) {
        super(str);
        this.f20847a = i1Var;
    }
}
