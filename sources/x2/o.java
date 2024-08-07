package x2;

import c3.c;
import sk.j;

/* compiled from: RoomOpenHelper.kt */
public final class o extends c.a {

    /* renamed from: b  reason: collision with root package name */
    public b f16973b;

    /* renamed from: c  reason: collision with root package name */
    public final a f16974c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16975d;

    /* renamed from: e  reason: collision with root package name */
    public final String f16976e;

    /* compiled from: RoomOpenHelper.kt */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f16977a;

        public a(int i10) {
            this.f16977a = i10;
        }

        public abstract void a(d3.c cVar);

        public abstract void b(d3.c cVar);

        public abstract void c(d3.c cVar);

        public abstract void d(d3.c cVar);

        public abstract void e();

        public abstract void f(d3.c cVar);

        public abstract b g(d3.c cVar);
    }

    /* compiled from: RoomOpenHelper.kt */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16978a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16979b;

        public b(String str, boolean z10) {
            this.f16978a = z10;
            this.f16979b = str;
        }
    }

    public o(b bVar, a aVar, String str, String str2) {
        super(aVar.f16977a);
        this.f16973b = bVar;
        this.f16974c = aVar;
        this.f16975d = str;
        this.f16976e = str2;
    }

    public final void b(d3.c cVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        p3.l0.u(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(d3.c r4) {
        /*
            r3 = this;
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r0 = r4.q(r0)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0048 }
            r2 = 0
            if (r1 == 0) goto L_0x0014
            int r1 = r0.getInt(r2)     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0014
            r2 = 1
        L_0x0014:
            r1 = 0
            p3.l0.u(r0, r1)
            x2.o$a r0 = r3.f16974c
            r0.a(r4)
            if (r2 != 0) goto L_0x003f
            x2.o$a r0 = r3.f16974c
            x2.o$b r0 = r0.g(r4)
            boolean r1 = r0.f16978a
            if (r1 == 0) goto L_0x002a
            goto L_0x003f
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            java.lang.String r0 = r0.f16979b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L_0x003f:
            r3.g(r4)
            x2.o$a r0 = r3.f16974c
            r0.c(r4)
            return
        L_0x0048:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            p3.l0.u(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.o.c(d3.c):void");
    }

    public final void d(d3.c cVar, int i10, int i11) {
        f(cVar, i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        p3.l0.u(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
        p3.l0.u(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(d3.c r5) {
        /*
            r4 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r5.q(r0)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x009a }
            r2 = 0
            if (r1 == 0) goto L_0x0015
            int r1 = r0.getInt(r2)     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = r2
        L_0x0016:
            r3 = 0
            p3.l0.u(r0, r3)
            if (r1 == 0) goto L_0x006b
            c3.a r0 = new c3.a
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r0 = r5.j(r0)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = r0.getString(r2)     // Catch:{ all -> 0x0064 }
            goto L_0x0033
        L_0x0032:
            r1 = r3
        L_0x0033:
            p3.l0.u(r0, r3)
            java.lang.String r0 = r4.f16975d
            boolean r0 = sk.j.a(r0, r1)
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = r4.f16976e
            boolean r0 = sk.j.a(r0, r1)
            if (r0 == 0) goto L_0x0047
            goto L_0x007d
        L_0x0047:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
            java.lang.String r2 = r4.f16975d
            r0.append(r2)
            java.lang.String r2 = ", found: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0064:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            p3.l0.u(r0, r5)
            throw r1
        L_0x006b:
            x2.o$a r0 = r4.f16974c
            x2.o$b r0 = r0.g(r5)
            boolean r1 = r0.f16978a
            if (r1 == 0) goto L_0x0085
            x2.o$a r0 = r4.f16974c
            r0.e()
            r4.g(r5)
        L_0x007d:
            x2.o$a r0 = r4.f16974c
            r0.d(r5)
            r4.f16973b = r3
            return
        L_0x0085:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            java.lang.String r0 = r0.f16979b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L_0x009a:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x009c }
        L_0x009c:
            r1 = move-exception
            p3.l0.u(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.o.e(d3.c):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r10 <= r15) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        if (r10 < r5) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0075 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(d3.c r13, int r14, int r15) {
        /*
            r12 = this;
            x2.b r0 = r12.f16973b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00ce
            x2.n$c r0 = r0.f16887d
            r0.getClass()
            if (r14 != r15) goto L_0x0011
            fk.r r0 = fk.r.f20213a
            goto L_0x008b
        L_0x0011:
            if (r15 <= r14) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r2
        L_0x0016:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r14
        L_0x001c:
            if (r3 == 0) goto L_0x0021
            if (r5 >= r15) goto L_0x0025
            goto L_0x0023
        L_0x0021:
            if (r5 <= r15) goto L_0x0025
        L_0x0023:
            r6 = r1
            goto L_0x0026
        L_0x0025:
            r6 = r2
        L_0x0026:
            if (r6 == 0) goto L_0x008a
            java.util.LinkedHashMap r6 = r0.f16972a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r7)
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            r7 = 0
            if (r6 != 0) goto L_0x0038
            goto L_0x0088
        L_0x0038:
            if (r3 == 0) goto L_0x003f
            java.util.NavigableSet r8 = r6.descendingKeySet()
            goto L_0x0043
        L_0x003f:
            java.util.Set r8 = r6.keySet()
        L_0x0043:
            java.util.Iterator r8 = r8.iterator()
        L_0x0047:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0085
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.String r10 = "targetVersion"
            if (r3 == 0) goto L_0x0065
            int r11 = r5 + 1
            sk.j.e(r9, r10)
            int r10 = r9.intValue()
            if (r11 > r10) goto L_0x0072
            if (r10 > r15) goto L_0x0072
            goto L_0x0070
        L_0x0065:
            sk.j.e(r9, r10)
            int r10 = r9.intValue()
            if (r15 > r10) goto L_0x0072
            if (r10 >= r5) goto L_0x0072
        L_0x0070:
            r10 = r1
            goto L_0x0073
        L_0x0072:
            r10 = r2
        L_0x0073:
            if (r10 == 0) goto L_0x0047
            java.lang.Object r5 = r6.get(r9)
            sk.j.c(r5)
            r4.add(r5)
            int r5 = r9.intValue()
            r6 = r1
            goto L_0x0086
        L_0x0085:
            r6 = r2
        L_0x0086:
            if (r6 != 0) goto L_0x001c
        L_0x0088:
            r0 = r7
            goto L_0x008b
        L_0x008a:
            r0 = r4
        L_0x008b:
            if (r0 == 0) goto L_0x00ce
            x2.o$a r2 = r12.f16974c
            r2.f(r13)
            java.util.Iterator r0 = r0.iterator()
        L_0x0096:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00a6
            java.lang.Object r2 = r0.next()
            y2.b r2 = (y2.b) r2
            r2.a(r13)
            goto L_0x0096
        L_0x00a6:
            x2.o$a r0 = r12.f16974c
            x2.o$b r0 = r0.g(r13)
            boolean r2 = r0.f16978a
            if (r2 == 0) goto L_0x00b9
            x2.o$a r0 = r12.f16974c
            r0.e()
            r12.g(r13)
            goto L_0x00cf
        L_0x00b9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Migration didn't properly handle: "
            java.lang.StringBuilder r14 = android.support.v4.media.a.q(r14)
            java.lang.String r15 = r0.f16979b
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x00ce:
            r1 = r2
        L_0x00cf:
            if (r1 != 0) goto L_0x010a
            x2.b r0 = r12.f16973b
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r0.a(r14, r15)
            if (r0 != 0) goto L_0x00e6
            x2.o$a r14 = r12.f16974c
            r14.b(r13)
            x2.o$a r14 = r12.f16974c
            r14.a(r13)
            goto L_0x010a
        L_0x00e6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = " to "
            r0.append(r14)
            r0.append(r15)
            java.lang.String r14 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            throw r13
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.o.f(d3.c, int, int):void");
    }

    public final void g(d3.c cVar) {
        cVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f16975d;
        j.f(str, "hash");
        cVar.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }
}
