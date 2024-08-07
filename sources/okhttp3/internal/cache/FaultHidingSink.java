package okhttp3.internal.cache;

import java.io.IOException;
import ll.f;
import ll.l;
import sk.j;

/* compiled from: FaultHidingSink.kt */
public class FaultHidingSink extends l {

    /* renamed from: b  reason: collision with root package name */
    public boolean f22190b;

    public FaultHidingSink() {
        throw null;
    }

    public final void Q(f fVar, long j10) {
        j.f(fVar, "source");
        if (this.f22190b) {
            fVar.skip(j10);
            return;
        }
        try {
            super.Q(fVar, j10);
        } catch (IOException unused) {
            this.f22190b = true;
            throw null;
        }
    }

    public final void close() {
        if (!this.f22190b) {
            try {
                super.close();
            } catch (IOException unused) {
                this.f22190b = true;
                throw null;
            }
        }
    }

    public final void flush() {
        if (!this.f22190b) {
            try {
                super.flush();
            } catch (IOException unused) {
                this.f22190b = true;
                throw null;
            }
        }
    }
}
