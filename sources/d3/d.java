package d3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import c3.c;
import ek.g;
import java.io.File;
import java.util.UUID;
import n0.l;
import sk.j;
import sk.k;

/* compiled from: FrameworkSQLiteOpenHelper.kt */
public final class d implements c3.c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8576a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8577b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a f8578c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8579d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8580e;

    /* renamed from: f  reason: collision with root package name */
    public final g f8581f = j7.a.b0(new c(this));

    /* renamed from: n  reason: collision with root package name */
    public boolean f8582n;

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public c f8583a = null;
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class b extends SQLiteOpenHelper {

        /* renamed from: o  reason: collision with root package name */
        public static final /* synthetic */ int f8584o = 0;

        /* renamed from: a  reason: collision with root package name */
        public final Context f8585a;

        /* renamed from: b  reason: collision with root package name */
        public final a f8586b;

        /* renamed from: c  reason: collision with root package name */
        public final c.a f8587c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f8588d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f8589e;

        /* renamed from: f  reason: collision with root package name */
        public final e3.a f8590f;

        /* renamed from: n  reason: collision with root package name */
        public boolean f8591n;

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        public static final class a extends RuntimeException {

            /* renamed from: a  reason: collision with root package name */
            public final int f8592a;

            /* renamed from: b  reason: collision with root package name */
            public final Throwable f8593b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(int i10, Throwable th2) {
                super(th2);
                l.o(i10, "callbackName");
                this.f8592a = i10;
                this.f8593b = th2;
            }

            public final Throwable getCause() {
                return this.f8593b;
            }
        }

        /* renamed from: d3.d$b$b  reason: collision with other inner class name */
        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        public static final class C0086b {
            public static c a(a aVar, SQLiteDatabase sQLiteDatabase) {
                j.f(aVar, "refHolder");
                j.f(sQLiteDatabase, "sqLiteDatabase");
                c cVar = aVar.f8583a;
                if (cVar != null && j.a(cVar.f8574a, sQLiteDatabase)) {
                    return cVar;
                }
                c cVar2 = new c(sQLiteDatabase);
                aVar.f8583a = cVar2;
                return cVar2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, a aVar, c.a aVar2, boolean z10) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar2.f4555a, new e(aVar2, aVar));
            j.f(context, "context");
            j.f(aVar2, "callback");
            this.f8585a = context;
            this.f8586b = aVar;
            this.f8587c = aVar2;
            this.f8588d = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                j.e(str, "randomUUID().toString()");
            }
            this.f8590f = new e3.a(str, context.getCacheDir(), false);
        }

        public final void close() {
            try {
                e3.a aVar = this.f8590f;
                aVar.a(aVar.f9090a);
                super.close();
                this.f8586b.f8583a = null;
                this.f8591n = false;
            } finally {
                this.f8590f.b();
            }
        }

        public final c3.b d(boolean z10) {
            boolean z11;
            try {
                e3.a aVar = this.f8590f;
                if (this.f8591n || getDatabaseName() == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                aVar.a(z11);
                this.f8589e = false;
                SQLiteDatabase q10 = q(z10);
                if (this.f8589e) {
                    close();
                    return d(z10);
                }
                c h10 = h(q10);
                this.f8590f.b();
                return h10;
            } finally {
                this.f8590f.b();
            }
        }

        public final c h(SQLiteDatabase sQLiteDatabase) {
            j.f(sQLiteDatabase, "sqLiteDatabase");
            return C0086b.a(this.f8586b, sQLiteDatabase);
        }

        public final SQLiteDatabase i(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                j.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            j.e(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            j.f(sQLiteDatabase, "db");
            if (!this.f8589e && this.f8587c.f4555a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                this.f8587c.b(h(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new a(1, th2);
            }
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            j.f(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f8587c.c(h(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new a(2, th2);
            }
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            j.f(sQLiteDatabase, "db");
            this.f8589e = true;
            try {
                this.f8587c.d(h(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(4, th2);
            }
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            j.f(sQLiteDatabase, "db");
            if (!this.f8589e) {
                try {
                    this.f8587c.e(h(sQLiteDatabase));
                } catch (Throwable th2) {
                    throw new a(5, th2);
                }
            }
            this.f8591n = true;
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            j.f(sQLiteDatabase, "sqLiteDatabase");
            this.f8589e = true;
            try {
                this.f8587c.f(h(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(3, th2);
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:12|11|13|14|15|16|17) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.database.sqlite.SQLiteDatabase q(boolean r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getDatabaseName()
                boolean r1 = r4.f8591n
                if (r0 == 0) goto L_0x0022
                if (r1 != 0) goto L_0x0022
                android.content.Context r1 = r4.f8585a
                java.io.File r1 = r1.getDatabasePath(r0)
                java.io.File r1 = r1.getParentFile()
                if (r1 == 0) goto L_0x0022
                r1.mkdirs()
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L_0x0022
                r1.toString()
            L_0x0022:
                android.database.sqlite.SQLiteDatabase r5 = r4.i(r5)     // Catch:{ all -> 0x0027 }
                return r5
            L_0x0027:
                super.close()
                r1 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x002f }
            L_0x002f:
                android.database.sqlite.SQLiteDatabase r5 = r4.i(r5)     // Catch:{ all -> 0x0034 }
                return r5
            L_0x0034:
                r1 = move-exception
                super.close()
                boolean r2 = r1 instanceof d3.d.b.a
                if (r2 == 0) goto L_0x0058
                d3.d$b$a r1 = (d3.d.b.a) r1
                java.lang.Throwable r2 = r1.f8593b
                int r1 = r1.f8592a
                int r1 = v.v.g(r1)
                if (r1 == 0) goto L_0x0057
                r3 = 1
                if (r1 == r3) goto L_0x0057
                r3 = 2
                if (r1 == r3) goto L_0x0057
                r3 = 3
                if (r1 == r3) goto L_0x0057
                boolean r1 = r2 instanceof android.database.sqlite.SQLiteException
                if (r1 == 0) goto L_0x0056
                goto L_0x0062
            L_0x0056:
                throw r2
            L_0x0057:
                throw r2
            L_0x0058:
                boolean r2 = r1 instanceof android.database.sqlite.SQLiteException
                if (r2 == 0) goto L_0x0071
                if (r0 == 0) goto L_0x0070
                boolean r2 = r4.f8588d
                if (r2 == 0) goto L_0x0070
            L_0x0062:
                android.content.Context r1 = r4.f8585a
                r1.deleteDatabase(r0)
                android.database.sqlite.SQLiteDatabase r5 = r4.i(r5)     // Catch:{ a -> 0x006c }
                return r5
            L_0x006c:
                r5 = move-exception
                java.lang.Throwable r5 = r5.f8593b
                throw r5
            L_0x0070:
                throw r1
            L_0x0071:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d3.d.b.q(boolean):android.database.sqlite.SQLiteDatabase");
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class c extends k implements rk.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f8594a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar) {
            super(0);
            this.f8594a = dVar;
        }

        public final Object invoke() {
            b bVar;
            d dVar = this.f8594a;
            if (dVar.f8577b == null || !dVar.f8579d) {
                d dVar2 = this.f8594a;
                bVar = new b(dVar2.f8576a, dVar2.f8577b, new a(), dVar2.f8578c, dVar2.f8580e);
            } else {
                Context context = this.f8594a.f8576a;
                j.f(context, "context");
                File noBackupFilesDir = context.getNoBackupFilesDir();
                j.e(noBackupFilesDir, "context.noBackupFilesDir");
                File file = new File(noBackupFilesDir, this.f8594a.f8577b);
                Context context2 = this.f8594a.f8576a;
                String absolutePath = file.getAbsolutePath();
                a aVar = new a();
                d dVar3 = this.f8594a;
                bVar = new b(context2, absolutePath, aVar, dVar3.f8578c, dVar3.f8580e);
            }
            bVar.setWriteAheadLoggingEnabled(this.f8594a.f8582n);
            return bVar;
        }
    }

    public d(Context context, String str, c.a aVar, boolean z10, boolean z11) {
        j.f(context, "context");
        j.f(aVar, "callback");
        this.f8576a = context;
        this.f8577b = str;
        this.f8578c = aVar;
        this.f8579d = z10;
        this.f8580e = z11;
    }

    public final c3.b P() {
        return ((b) this.f8581f.getValue()).d(true);
    }

    public final void close() {
        boolean z10;
        if (this.f8581f.f20107b != m9.b.f13209u) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((b) this.f8581f.getValue()).close();
        }
    }

    public final String getDatabaseName() {
        return this.f8577b;
    }

    public final void setWriteAheadLoggingEnabled(boolean z10) {
        boolean z11;
        if (this.f8581f.f20107b != m9.b.f13209u) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            b bVar = (b) this.f8581f.getValue();
            j.f(bVar, "sQLiteOpenHelper");
            bVar.setWriteAheadLoggingEnabled(z10);
        }
        this.f8582n = z10;
    }
}
