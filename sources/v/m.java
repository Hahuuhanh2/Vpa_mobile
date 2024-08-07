package v;

import android.database.sqlite.SQLiteDatabase;
import m6.o;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements b.c, o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f15746a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15747b;

    public /* synthetic */ m(Object obj, long j10) {
        this.f15747b = obj;
        this.f15746a = j10;
    }

    public final Object apply(Object obj) {
        o oVar = (o) this.f15747b;
        long j10 = this.f15746a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        c6.b bVar = o.f13164f;
        oVar.getClass();
        String[] strArr = {String.valueOf(j10)};
        o.K(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new m6.m(oVar, 1));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public final String e(b.a aVar) {
        o oVar = (o) this.f15747b;
        long j10 = this.f15746a;
        oVar.getClass();
        oVar.i(new g(j10, aVar));
        return "waitForSessionUpdateId:" + j10;
    }
}
