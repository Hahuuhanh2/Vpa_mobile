package m6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import f0.b0;
import java.util.Arrays;
import java.util.List;

/* compiled from: SchemaManager */
public final class s extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    public static final String f13174c;

    /* renamed from: d  reason: collision with root package name */
    public static int f13175d = 5;

    /* renamed from: e  reason: collision with root package name */
    public static final List<a> f13176e = Arrays.asList(new a[]{new p(0), new q(0), new r(), new p(1), new q(1)});

    /* renamed from: a  reason: collision with root package name */
    public final int f13177a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13178b = false;

    /* compiled from: SchemaManager */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder q10 = android.support.v4.media.a.q("INSERT INTO global_log_event_state VALUES (");
        q10.append(System.currentTimeMillis());
        q10.append(")");
        f13174c = q10.toString();
    }

    public s(int i10, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f13177a = i10;
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f13176e;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f13176e.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        StringBuilder u10 = b0.u("Migration from ", i10, " to ", i11, " was requested, but cannot be performed. Only ");
        u10.append(list.size());
        u10.append(" migrations are provided");
        throw new IllegalArgumentException(u10.toString());
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f13178b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i10 = this.f13177a;
        if (!this.f13178b) {
            onConfigure(sQLiteDatabase);
        }
        d(sQLiteDatabase, 0, i10);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f13178b) {
            onConfigure(sQLiteDatabase);
        }
        d(sQLiteDatabase, 0, i11);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f13178b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (!this.f13178b) {
            onConfigure(sQLiteDatabase);
        }
        d(sQLiteDatabase, i10, i11);
    }
}
