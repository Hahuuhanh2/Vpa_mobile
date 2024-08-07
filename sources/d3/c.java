package d3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import c3.a;
import c3.b;
import c3.e;
import c3.f;
import java.util.List;
import rk.r;
import sk.j;
import sk.k;

/* compiled from: FrameworkSQLiteDatabase.kt */
public final class c implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f8572b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f8573c = new String[0];

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteDatabase f8574a;

    /* compiled from: FrameworkSQLiteDatabase.kt */
    public static final class a extends k implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f8575a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(4);
            this.f8575a = eVar;
        }

        public final SQLiteCursor g(Object obj, Object obj2, Object obj3, Object obj4) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
            e eVar = this.f8575a;
            j.c(sQLiteQuery);
            eVar.d(new f(sQLiteQuery));
            return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        j.f(sQLiteDatabase, "delegate");
        this.f8574a = sQLiteDatabase;
    }

    public final Cursor H0(e eVar, CancellationSignal cancellationSignal) {
        SQLiteDatabase sQLiteDatabase = this.f8574a;
        String h10 = eVar.h();
        String[] strArr = f8573c;
        j.c(cancellationSignal);
        a aVar = new a(eVar);
        j.f(sQLiteDatabase, "sQLiteDatabase");
        j.f(h10, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, h10, strArr, (String) null, cancellationSignal);
        j.e(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    public final void I() {
        this.f8574a.setTransactionSuccessful();
    }

    public final void J() {
        this.f8574a.beginTransactionNonExclusive();
    }

    public final void X() {
        this.f8574a.endTransaction();
    }

    public final void close() {
        this.f8574a.close();
    }

    public final void d(String str, Object[] objArr) {
        j.f(str, "sql");
        j.f(objArr, "bindArgs");
        this.f8574a.execSQL(str, objArr);
    }

    public final List<Pair<String, String>> h() {
        return this.f8574a.getAttachedDbs();
    }

    public final String i() {
        return this.f8574a.getPath();
    }

    public final boolean isOpen() {
        return this.f8574a.isOpen();
    }

    public final Cursor j(e eVar) {
        Cursor rawQueryWithFactory = this.f8574a.rawQueryWithFactory(new b(new a(eVar)), eVar.h(), f8573c, (String) null);
        j.e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final void k() {
        this.f8574a.beginTransaction();
    }

    public final void o(String str) {
        j.f(str, "sql");
        this.f8574a.execSQL(str);
    }

    public final Cursor q(String str) {
        j.f(str, "query");
        return j(new c3.a(str));
    }

    public final boolean q0() {
        return this.f8574a.inTransaction();
    }

    public final int s(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        boolean z10;
        int i11;
        String str3;
        j.f(str, "table");
        j.f(contentValues, "values");
        int i12 = 0;
        if (contentValues.size() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int size = contentValues.size();
            if (objArr == null) {
                i11 = size;
            } else {
                i11 = objArr.length + size;
            }
            Object[] objArr2 = new Object[i11];
            StringBuilder q10 = android.support.v4.media.a.q("UPDATE ");
            q10.append(f8572b[i10]);
            q10.append(str);
            q10.append(" SET ");
            for (String next : contentValues.keySet()) {
                if (i12 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                q10.append(str3);
                q10.append(next);
                objArr2[i12] = contentValues.get(next);
                q10.append("=?");
                i12++;
            }
            if (objArr != null) {
                for (int i13 = size; i13 < i11; i13++) {
                    objArr2[i13] = objArr[i13 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                q10.append(" WHERE ");
                q10.append(str2);
            }
            String sb2 = q10.toString();
            j.e(sb2, "StringBuilder().apply(builderAction).toString()");
            f u10 = u(sb2);
            a.C0049a.a(u10, objArr2);
            return ((g) u10).t();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    public final f u(String str) {
        j.f(str, "sql");
        SQLiteStatement compileStatement = this.f8574a.compileStatement(str);
        j.e(compileStatement, "delegate.compileStatement(sql)");
        return new g(compileStatement);
    }

    public final boolean y0() {
        SQLiteDatabase sQLiteDatabase = this.f8574a;
        j.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }
}
