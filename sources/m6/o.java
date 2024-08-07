package m6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import c0.i0;
import c0.r;
import ea.c;
import f6.n;
import f6.s;
import i6.a;
import i6.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kh.h;
import l6.i;
import n6.a;
import r0.f;
import v.f0;
import v.g0;
import v.m;

/* compiled from: SQLiteEventStore */
public final class o implements d, n6.a, c {

    /* renamed from: f  reason: collision with root package name */
    public static final c6.b f13164f = new c6.b("proto");

    /* renamed from: a  reason: collision with root package name */
    public final s f13165a;

    /* renamed from: b  reason: collision with root package name */
    public final o6.a f13166b;

    /* renamed from: c  reason: collision with root package name */
    public final o6.a f13167c;

    /* renamed from: d  reason: collision with root package name */
    public final e f13168d;

    /* renamed from: e  reason: collision with root package name */
    public final dk.a<String> f13169e;

    /* compiled from: SQLiteEventStore */
    public interface a<T, U> {
        U apply(T t10);
    }

    /* compiled from: SQLiteEventStore */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f13170a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13171b;

        public b(String str, String str2) {
            this.f13170a = str;
            this.f13171b = str2;
        }
    }

    public o(o6.a aVar, o6.a aVar2, e eVar, s sVar, dk.a<String> aVar3) {
        this.f13165a = sVar;
        this.f13166b = aVar;
        this.f13167c = aVar2;
        this.f13168d = eVar;
        this.f13169e = aVar3;
    }

    public static String E(Iterable<j> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<j> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> T K(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long v(SQLiteDatabase sQLiteDatabase, s sVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{sVar.b(), String.valueOf(p6.a.a(sVar.d()))}));
        if (sVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(sVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) K(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), new i0(3));
    }

    public final Object B(c cVar, h hVar) {
        long a10 = this.f13167c.a();
        while (true) {
            try {
                switch (cVar.f9329a) {
                    case 13:
                        return ((s) cVar.f9330b).getWritableDatabase();
                    default:
                        ((SQLiteDatabase) cVar.f9330b).beginTransaction();
                        return null;
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f13167c.a() >= ((long) this.f13168d.a()) + a10) {
                    return hVar.apply(e10);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public final Iterable<s> C() {
        return (Iterable) x(new g0(4));
    }

    public final b C0(s sVar, n nVar) {
        Object[] objArr = {sVar.d(), nVar.g(), sVar.b()};
        if (Log.isLoggable(j6.a.b("SQLiteEventStore"), 3)) {
            String.format("Storing event with priority=%s, name=%s for destination %s", objArr);
        }
        long longValue = ((Long) x(new k(0, this, nVar, sVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new b(longValue, sVar, nVar);
    }

    public final void D0(Iterable<j> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder q10 = android.support.v4.media.a.q("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            q10.append(E(iterable));
            x(new f(this, q10.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    public final void I0(long j10, s sVar) {
        x(new l(j10, sVar));
    }

    public final void close() {
        this.f13165a.close();
    }

    public final void d(long j10, c.a aVar, String str) {
        x(new i((Object) str, j10, (Object) aVar));
    }

    public final int e() {
        return ((Integer) x(new m(this, this.f13166b.a() - this.f13168d.b()))).intValue();
    }

    public final <T> T h(a.C0164a<T> aVar) {
        SQLiteDatabase s10 = s();
        B(new ea.c(s10, 14), new h(8));
        try {
            T d10 = aVar.d();
            s10.setTransactionSuccessful();
            return d10;
        } finally {
            s10.endTransaction();
        }
    }

    public final long h0(s sVar) {
        return ((Long) K(s().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(p6.a.a(sVar.d()))}), new g0(5))).longValue();
    }

    public final void i() {
        x(new m(this, 0));
    }

    public final void m(Iterable<j> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder q10 = android.support.v4.media.a.q("DELETE FROM events WHERE _id in ");
            q10.append(E(iterable));
            s().compileStatement(q10.toString()).execute();
        }
    }

    public final i6.a q() {
        int i10 = i6.a.f11160e;
        a.C0123a aVar = new a.C0123a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase s10 = s();
        s10.beginTransaction();
        try {
            i6.a aVar2 = (i6.a) K(s10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new k(2, this, hashMap, aVar));
            s10.setTransactionSuccessful();
            return aVar2;
        } finally {
            s10.endTransaction();
        }
    }

    public final SQLiteDatabase s() {
        s sVar = this.f13165a;
        Objects.requireNonNull(sVar);
        return (SQLiteDatabase) B(new ea.c(sVar, 13), new h(7));
    }

    public final <T> T x(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase s10 = s();
        s10.beginTransaction();
        try {
            T apply = aVar.apply(s10);
            s10.setTransactionSuccessful();
            return apply;
        } finally {
            s10.endTransaction();
        }
    }

    public final boolean x0(s sVar) {
        return ((Boolean) x(new r(6, this, sVar))).booleanValue();
    }

    public final ArrayList z(SQLiteDatabase sQLiteDatabase, s sVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long v2 = v(sQLiteDatabase, sVar);
        if (v2 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        K(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{v2.toString()}, (String) null, (String) null, (String) null, String.valueOf(i10)), new k(1, this, arrayList, sVar));
        return arrayList;
    }

    public final Iterable<j> z0(s sVar) {
        return (Iterable) x(new f0(4, this, sVar));
    }
}
