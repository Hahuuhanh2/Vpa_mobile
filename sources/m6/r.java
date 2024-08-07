package m6;

import android.database.sqlite.SQLiteDatabase;
import m6.s;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements s.a {
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
