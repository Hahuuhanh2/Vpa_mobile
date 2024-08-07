package d3;

import android.database.sqlite.SQLiteProgram;
import c3.d;
import sk.j;

/* compiled from: FrameworkSQLiteProgram.kt */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteProgram f8597a;

    public f(SQLiteProgram sQLiteProgram) {
        j.f(sQLiteProgram, "delegate");
        this.f8597a = sQLiteProgram;
    }

    public final void H(int i10, long j10) {
        this.f8597a.bindLong(i10, j10);
    }

    public final void M(int i10, byte[] bArr) {
        this.f8597a.bindBlob(i10, bArr);
    }

    public final void close() {
        this.f8597a.close();
    }

    public final void m0(int i10) {
        this.f8597a.bindNull(i10);
    }

    public final void p(int i10, String str) {
        j.f(str, "value");
        this.f8597a.bindString(i10, str);
    }

    public final void w(int i10, double d10) {
        this.f8597a.bindDouble(i10, d10);
    }
}
