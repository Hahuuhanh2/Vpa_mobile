package m6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import i6.c;
import m6.o;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13161a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f13162b;

    public /* synthetic */ m(o oVar, int i10) {
        this.f13161a = i10;
        this.f13162b = oVar;
    }

    public final Object apply(Object obj) {
        switch (this.f13161a) {
            case 0:
                o oVar = this.f13162b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                oVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + oVar.f13166b.a()).execute();
                return null;
            default:
                o oVar2 = this.f13162b;
                Cursor cursor = (Cursor) obj;
                oVar2.getClass();
                while (cursor.moveToNext()) {
                    int i10 = cursor.getInt(0);
                    oVar2.d((long) i10, c.a.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                return null;
        }
    }
}
