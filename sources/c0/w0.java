package c0;

import androidx.camera.core.b;
import androidx.camera.core.d;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SingleCloseImageProxy */
public final class w0 extends b {

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f4365d = new AtomicBoolean(false);

    public w0(d dVar) {
        super(dVar);
    }

    public final void close() {
        if (!this.f4365d.getAndSet(true)) {
            super.close();
        }
    }
}
