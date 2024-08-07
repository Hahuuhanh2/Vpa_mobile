package okhttp3;

import java.io.Closeable;
import ll.c0;
import ll.d0;
import ll.f;
import ll.j;
import ll.s;
import sk.j;

/* compiled from: MultipartReader.kt */
public final class MultipartReader implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22049a;

    /* compiled from: MultipartReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: MultipartReader.kt */
    public static final class Part implements Closeable {
        public final void close() {
            throw null;
        }
    }

    /* compiled from: MultipartReader.kt */
    public final class PartSource implements c0 {
        public final long J0(f fVar, long j10) {
            j.f(fVar, "sink");
            throw null;
        }

        public final void close() {
            throw null;
        }

        public final d0 f() {
            return null;
        }
    }

    static {
        new Companion(0);
        ll.j jVar = ll.j.f20882d;
        s.a.b(j.a.b("\r\n"), j.a.b("--"), j.a.b(" "), j.a.b("\t"));
    }

    public final void close() {
        if (!this.f22049a) {
            this.f22049a = true;
            throw null;
        }
    }
}
