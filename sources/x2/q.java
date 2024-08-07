package x2;

import c3.b;
import c3.c;
import java.io.File;

/* compiled from: SQLiteCopyOpenHelper.kt */
public final class q implements c, c {

    /* renamed from: a  reason: collision with root package name */
    public b f16989a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16990b;

    public final b P() {
        if (!this.f16990b) {
            i(true);
            this.f16990b = true;
        }
        throw null;
    }

    public final synchronized void close() {
        throw null;
    }

    public final c d() {
        return null;
    }

    public final String getDatabaseName() {
        throw null;
    }

    public final void h(File file) {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    public final void i(boolean z10) {
        if (getDatabaseName() != null) {
            throw null;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void setWriteAheadLoggingEnabled(boolean z10) {
        throw null;
    }
}
