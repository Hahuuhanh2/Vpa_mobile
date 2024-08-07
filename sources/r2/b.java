package r2;

import al.d0;
import al.g0;
import ik.f;
import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* compiled from: ViewModel.kt */
public final class b implements Closeable, d0 {

    /* renamed from: a  reason: collision with root package name */
    public final f f14466a;

    public b(f fVar) {
        this.f14466a = fVar;
    }

    public final void close() {
        g0.x(this.f14466a, (CancellationException) null);
    }

    public final f s() {
        return this.f14466a;
    }
}
