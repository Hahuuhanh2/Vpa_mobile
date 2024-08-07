package d3;

import android.database.sqlite.SQLiteStatement;
import c3.f;

/* compiled from: FrameworkSQLiteStatement.kt */
public final class g extends f implements f {

    /* renamed from: b  reason: collision with root package name */
    public final SQLiteStatement f8598b;

    public g(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f8598b = sQLiteStatement;
    }

    public final long L0() {
        return this.f8598b.executeInsert();
    }

    public final int t() {
        return this.f8598b.executeUpdateDelete();
    }
}
