package d3;

import android.database.DatabaseErrorHandler;
import c3.c;
import d3.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements DatabaseErrorHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.a f8595a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.a f8596b;

    public /* synthetic */ e(c.a aVar, d.a aVar2) {
        this.f8595a = aVar;
        this.f8596b = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r1 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r4 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r4.hasNext() != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r1 = ((android.util.Pair) r4.next()).second;
        sk.j.e(r1, "p.second");
        c3.c.a.a((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        r4 = r4.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r4 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        c3.c.a.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031 A[ExcHandler: all (r2v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
      PHI: (r1v9 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r1v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:6:0x002c, B:9:0x0033, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:6:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            c3.c$a r0 = r3.f8595a
            d3.d$a r1 = r3.f8596b
            java.lang.String r2 = "$callback"
            sk.j.f(r0, r2)
            java.lang.String r0 = "$dbRef"
            sk.j.f(r1, r0)
            int r0 = d3.d.b.f8584o
            java.lang.String r0 = "dbObj"
            sk.j.e(r4, r0)
            d3.c r4 = d3.d.b.C0086b.a(r1, r4)
            java.lang.String r0 = "p.second"
            boolean r1 = r4.isOpen()
            if (r1 != 0) goto L_0x002b
            java.lang.String r4 = r4.i()
            if (r4 == 0) goto L_0x0084
            c3.c.a.a(r4)
            goto L_0x0084
        L_0x002b:
            r1 = 0
            java.util.List r1 = r4.h()     // Catch:{ SQLiteException -> 0x0033, all -> 0x0031 }
            goto L_0x0033
        L_0x0031:
            r2 = move-exception
            goto L_0x0037
        L_0x0033:
            r4.close()     // Catch:{ IOException -> 0x005e, all -> 0x0031 }
            goto L_0x005e
        L_0x0037:
            if (r1 == 0) goto L_0x0054
            java.util.Iterator r4 = r1.iterator()
        L_0x003d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r4.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.second
            sk.j.e(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            c3.c.a.a(r1)
            goto L_0x003d
        L_0x0054:
            java.lang.String r4 = r4.i()
            if (r4 == 0) goto L_0x005d
            c3.c.a.a(r4)
        L_0x005d:
            throw r2
        L_0x005e:
            if (r1 == 0) goto L_0x007b
            java.util.Iterator r4 = r1.iterator()
        L_0x0064:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0084
            java.lang.Object r1 = r4.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.second
            sk.j.e(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            c3.c.a.a(r1)
            goto L_0x0064
        L_0x007b:
            java.lang.String r4 = r4.i()
            if (r4 == 0) goto L_0x0084
            c3.c.a.a(r4)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.e.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
