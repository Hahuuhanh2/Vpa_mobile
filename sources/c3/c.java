package c3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.File;
import sk.j;
import yk.h;

/* compiled from: SupportSQLiteOpenHelper.kt */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.kt */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4555a;

        public a(int i10) {
            this.f4555a = i10;
        }

        public static void a(String str) {
            int i10;
            boolean z10;
            if (!h.G0(str, ":memory:")) {
                boolean z11 = true;
                int length = str.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length) {
                    if (!z12) {
                        i10 = i11;
                    } else {
                        i10 = length;
                    }
                    if (j.h(str.charAt(i10), 32) <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z12) {
                        if (!z10) {
                            z12 = true;
                        } else {
                            i11++;
                        }
                    } else if (!z10) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i11, length + 1).toString().length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    try {
                        SQLiteDatabase.deleteDatabase(new File(str));
                    } catch (Exception unused) {
                    }
                }
            }
        }

        public abstract void b(d3.c cVar);

        public abstract void c(d3.c cVar);

        public abstract void d(d3.c cVar, int i10, int i11);

        public abstract void e(d3.c cVar);

        public abstract void f(d3.c cVar, int i10, int i11);
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f4556a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4557b;

        /* renamed from: c  reason: collision with root package name */
        public final a f4558c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4559d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f4560e;

        public b(Context context, String str, a aVar, boolean z10, boolean z11) {
            j.f(context, "context");
            this.f4556a = context;
            this.f4557b = str;
            this.f4558c = aVar;
            this.f4559d = z10;
            this.f4560e = z11;
        }
    }

    /* renamed from: c3.c$c  reason: collision with other inner class name */
    /* compiled from: SupportSQLiteOpenHelper.kt */
    public interface C0050c {
        c c(b bVar);
    }

    b P();

    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
