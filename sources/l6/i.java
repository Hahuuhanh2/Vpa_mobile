package l6;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import c0.i0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.b;
import f6.s;
import i6.c;
import java.util.HashMap;
import java.util.Map;
import m6.o;
import n6.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements a.C0164a, o.a, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f12740a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12741b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f12742c;

    public /* synthetic */ i(b bVar, long j10, HashMap hashMap) {
        this.f12741b = bVar;
        this.f12740a = j10;
        this.f12742c = hashMap;
    }

    public /* synthetic */ i(Object obj, long j10, Object obj2) {
        this.f12741b = obj;
        this.f12742c = obj2;
        this.f12740a = j10;
    }

    public final Object apply(Object obj) {
        String str = (String) this.f12741b;
        c.a aVar = (c.a) this.f12742c;
        long j10 = this.f12740a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        c6.b bVar = o.f13164f;
        if (!((Boolean) o.K(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.f11180a)}), new i0(4))).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(aVar.f11180a));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.f11180a)});
        }
        return null;
    }

    public final Object d() {
        j jVar = (j) this.f12741b;
        long j10 = this.f12740a;
        jVar.f12745c.I0(jVar.f12749g.a() + j10, (s) this.f12742c);
        return null;
    }

    public final Object then(Task task) {
        int[] iArr = b.f7686j;
        return ((b) this.f12741b).b(this.f12740a, task, (Map) this.f12742c);
    }
}
