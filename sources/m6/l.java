package m6;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import f6.s;
import m6.o;
import p6.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f13159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f13160b;

    public /* synthetic */ l(long j10, s sVar) {
        this.f13159a = j10;
        this.f13160b = sVar;
    }

    public final Object apply(Object obj) {
        long j10 = this.f13159a;
        s sVar = this.f13160b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(a.a(sVar.d()))}) < 1) {
            contentValues.put("backend_name", sVar.b());
            contentValues.put("priority", Integer.valueOf(a.a(sVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
