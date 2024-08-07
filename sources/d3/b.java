package d3;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import d3.c;
import rk.r;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f8571a;

    public /* synthetic */ b(c.a aVar) {
        this.f8571a = aVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        r rVar = this.f8571a;
        j.f(rVar, "$tmp0");
        return rVar.g(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
