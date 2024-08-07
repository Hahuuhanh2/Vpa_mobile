package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.Flushable;
import yk.c;

/* compiled from: DiskLruCache.kt */
public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f22187a = 0;

    /* compiled from: DiskLruCache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class Editor {
        public Editor() {
            throw null;
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class Entry {
        public Entry() {
            throw null;
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class Snapshot implements Closeable {
        public final void close() {
            throw null;
        }
    }

    static {
        new Companion(0);
        new c("[a-z0-9_-]{1,120}");
    }

    public final synchronized void close() {
    }

    public final synchronized void flush() {
    }
}
