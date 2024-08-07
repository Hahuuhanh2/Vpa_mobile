package okhttp3.internal.cache2;

import ll.c0;
import ll.d0;
import ll.f;
import ll.j;
import sk.j;

/* compiled from: Relay.kt */
public final class Relay {

    /* compiled from: Relay.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: Relay.kt */
    public final class RelaySource implements c0 {
        public final long J0(f fVar, long j10) {
            j.f(fVar, "sink");
            throw new IllegalStateException("Check failed.".toString());
        }

        public final void close() {
        }

        public final d0 f() {
            return null;
        }
    }

    static {
        new Companion(0);
        ll.j jVar = ll.j.f20882d;
        j.a.b("OkHttp cache v1\n");
        j.a.b("OkHttp DIRTY :(\n");
    }
}
