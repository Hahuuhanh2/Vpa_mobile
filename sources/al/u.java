package al;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
public class u {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f19093b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f19094a;

    public u(Throwable th2, boolean z10) {
        this.f19094a = th2;
        this._handled = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f19094a + ']';
    }
}
