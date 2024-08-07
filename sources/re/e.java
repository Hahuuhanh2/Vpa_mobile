package re;

import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.List;
import we.b;

/* compiled from: LocalMediaPageLoader */
public final class e extends b.C0217b<List<LocalMediaFolder>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ qe.e f14584c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f14585d;

    public e(d dVar, ee.b bVar) {
        this.f14585d = dVar;
        this.f14584c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x040c, code lost:
        if (r2.isClosed() == false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x041f, code lost:
        if (r2.isClosed() == false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0421, code lost:
        r2.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017b A[SYNTHETIC, Splitter:B:45:0x017b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r19 = this;
            r1 = r19
            re.d r0 = r1.f14585d
            android.content.Context r0 = r0.f14575a
            android.content.ContentResolver r2 = r0.getContentResolver()
            android.net.Uri r3 = re.a.f14572c
            re.d r0 = r1.f14585d
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x0017
            java.lang.String[] r0 = re.a.f14573d
            goto L_0x0019
        L_0x0017:
            java.lang.String[] r0 = re.a.f14574e
        L_0x0019:
            r4 = r0
            re.d r0 = r1.f14585d
            java.lang.String r5 = r0.a()
            java.lang.String r6 = r0.b()
            java.lang.String r7 = r0.c()
            ke.a r8 = r0.f14576b
            int r8 = r8.f12517a
            java.lang.String r9 = " GROUP BY (bucket_id"
            java.lang.String r10 = ")"
            java.lang.String r11 = ") AND "
            java.lang.String r12 = "=?"
            java.lang.String r13 = "media_type"
            java.lang.String r14 = "("
            if (r8 == 0) goto L_0x0101
            java.lang.String r15 = " AND "
            r16 = r4
            r4 = 1
            if (r8 == r4) goto L_0x00c5
            r4 = 2
            if (r8 == r4) goto L_0x0088
            r4 = 3
            if (r8 == r4) goto L_0x004a
            r0 = 0
            goto L_0x0129
        L_0x004a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x006a
            r4.append(r13)
            r4.append(r12)
            r4.append(r7)
            r4.append(r15)
            r4.append(r5)
            java.lang.String r0 = r4.toString()
            goto L_0x0129
        L_0x006a:
            r4.append(r14)
            r4.append(r13)
            r4.append(r12)
            r4.append(r7)
            r4.append(r11)
            r4.append(r5)
            r4.append(r10)
            r4.append(r9)
            java.lang.String r0 = r4.toString()
            goto L_0x0129
        L_0x0088:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x00a8
            r4.append(r13)
            r4.append(r12)
            r4.append(r7)
            r4.append(r15)
            r4.append(r5)
            java.lang.String r0 = r4.toString()
            goto L_0x0129
        L_0x00a8:
            r4.append(r14)
            r4.append(r13)
            r4.append(r12)
            r4.append(r7)
            r4.append(r11)
            r4.append(r5)
            r4.append(r10)
            r4.append(r9)
            java.lang.String r0 = r4.toString()
            goto L_0x0129
        L_0x00c5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x00e4
            r4.append(r13)
            r4.append(r12)
            r4.append(r7)
            r4.append(r15)
            r4.append(r6)
            java.lang.String r0 = r4.toString()
            goto L_0x0129
        L_0x00e4:
            r4.append(r14)
            r4.append(r13)
            r4.append(r12)
            r4.append(r7)
            r4.append(r11)
            r4.append(r6)
            r4.append(r10)
            r4.append(r9)
            java.lang.String r0 = r4.toString()
            goto L_0x0129
        L_0x0101:
            r16 = r4
            java.lang.String r4 = " OR "
            java.lang.StringBuilder r4 = android.support.v4.media.a.r(r14, r13, r12, r7, r4)
            r4.append(r13)
            java.lang.String r7 = "=? AND "
            r4.append(r7)
            r4.append(r5)
            r4.append(r11)
            r4.append(r6)
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = r4.toString()
            goto L_0x0129
        L_0x0125:
            java.lang.String r0 = android.support.v4.media.a.o(r4, r10, r9)
        L_0x0129:
            r5 = r0
            re.d r0 = r1.f14585d
            ke.a r0 = r0.f14576b
            int r0 = r0.f12517a
            r4 = 0
            if (r0 == 0) goto L_0x015a
            r6 = 1
            if (r0 == r6) goto L_0x0151
            r7 = 2
            if (r0 == r7) goto L_0x0147
            r8 = 3
            if (r0 == r8) goto L_0x013e
            r0 = 0
            goto L_0x016c
        L_0x013e:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.String r6 = java.lang.String.valueOf(r7)
            r0[r4] = r6
            goto L_0x016c
        L_0x0147:
            r0 = 3
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6[r4] = r0
            goto L_0x016b
        L_0x0151:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0[r4] = r6
            goto L_0x016c
        L_0x015a:
            r0 = 1
            r6 = 2
            r7 = 3
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r8 = java.lang.String.valueOf(r0)
            r6[r4] = r8
            java.lang.String r4 = java.lang.String.valueOf(r7)
            r6[r0] = r4
        L_0x016b:
            r0 = r6
        L_0x016c:
            r6 = r0
            re.d r0 = r1.f14585d
            java.lang.String r7 = r0.j()
            r4 = r16
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x0419
            int r0 = r2.getCount()     // Catch:{ Exception -> 0x03ff }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x03ff }
            r3.<init>()     // Catch:{ Exception -> 0x03ff }
            if (r0 <= 0) goto L_0x0419
            re.d r0 = r1.f14585d     // Catch:{ Exception -> 0x03ff }
            boolean r0 = r0.k()     // Catch:{ Exception -> 0x03ff }
            java.lang.String r4 = "bucket_id"
            java.lang.String r5 = "bucket_display_name"
            java.lang.String r6 = "_id"
            java.lang.String r7 = "_data"
            java.lang.String r8 = "mime_type"
            if (r0 == 0) goto L_0x026e
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r0.<init>()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r9.<init>()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
        L_0x01a2:
            boolean r10 = r2.moveToNext()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            if (r10 == 0) goto L_0x024b
            re.d r10 = r1.f14585d     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            ke.a r10 = r10.f14576b     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r10.getClass()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            int r10 = r2.getColumnIndexOrThrow(r4)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            long r10 = r2.getLong(r10)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.Object r12 = r0.get(r12)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r13 = 1
            if (r12 != 0) goto L_0x01ca
            java.lang.Long r12 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x03ff }
            goto L_0x01d3
        L_0x01ca:
            long r15 = r12.longValue()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            long r15 = r15 + r13
            java.lang.Long r12 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
        L_0x01d3:
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r0.put(r13, r12)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            boolean r12 = r9.contains(r12)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            if (r12 == 0) goto L_0x01e5
            goto L_0x01a2
        L_0x01e5:
            com.luck.picture.lib.entity.LocalMediaFolder r12 = new com.luck.picture.lib.entity.LocalMediaFolder     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r12.<init>()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r12.f8091a = r10     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            int r13 = r2.getColumnIndexOrThrow(r5)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.String r13 = r2.getString(r13)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            int r14 = r2.getColumnIndexOrThrow(r8)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.String r14 = r2.getString(r14)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.Long r15 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            boolean r15 = r0.containsKey(r15)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            if (r15 != 0) goto L_0x020b
            r17 = r4
            r18 = r5
            goto L_0x0243
        L_0x020b:
            java.lang.Long r15 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.Object r15 = r0.get(r15)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            long r15 = r15.longValue()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            int r1 = r2.getColumnIndexOrThrow(r6)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r17 = r4
            r18 = r5
            long r4 = r2.getLong(r1)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r12.f8092b = r13     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.Long r1 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            int r1 = j7.a.A0(r1)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r12.f8095e = r1     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.String r1 = xe.g.f(r4, r14)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r12.f8093c = r1     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r12.f8094d = r14     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r3.add(r12)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.Long r1 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r9.add(r1)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
        L_0x0243:
            r1 = r19
            r4 = r17
            r5 = r18
            goto L_0x01a2
        L_0x024b:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r4 = 0
        L_0x0250:
            boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            if (r5 == 0) goto L_0x02be
            java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            com.luck.picture.lib.entity.LocalMediaFolder r5 = (com.luck.picture.lib.entity.LocalMediaFolder) r5     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            long r9 = r5.f8091a     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.Object r9 = r0.get(r9)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            int r9 = j7.a.A0(r9)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r5.f8095e = r9     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            int r4 = r4 + r9
            goto L_0x0250
        L_0x026e:
            r17 = r4
            r18 = r5
            r2.moveToFirst()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r0 = 0
        L_0x0276:
            int r1 = r2.getColumnIndexOrThrow(r7)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.String r1 = r2.getString(r1)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r4 = r18
            int r5 = r2.getColumnIndexOrThrow(r4)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            int r9 = r2.getColumnIndexOrThrow(r8)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.String r9 = r2.getString(r9)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r10 = r17
            int r11 = r2.getColumnIndexOrThrow(r10)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            long r11 = r2.getLong(r11)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            java.lang.String r13 = "count"
            int r13 = r2.getColumnIndexOrThrow(r13)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            int r13 = r2.getInt(r13)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            com.luck.picture.lib.entity.LocalMediaFolder r14 = new com.luck.picture.lib.entity.LocalMediaFolder     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r14.<init>()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r14.f8091a = r11     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r14.f8093c = r1     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r14.f8092b = r5     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r14.f8094d = r9     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r14.f8095e = r13     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r3.add(r14)     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            int r0 = r0 + r13
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            if (r1 != 0) goto L_0x03ed
            r4 = r0
        L_0x02be:
            com.luck.picture.lib.entity.LocalMediaFolder r0 = new com.luck.picture.lib.entity.LocalMediaFolder     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r0.<init>()     // Catch:{ Exception -> 0x03f9, all -> 0x03f5 }
            r1 = r19
            re.d r5 = r1.f14585d     // Catch:{ Exception -> 0x03ff }
            android.content.Context r9 = r5.f14575a     // Catch:{ Exception -> 0x03ff }
            ke.a r5 = r5.f14576b     // Catch:{ Exception -> 0x03ff }
            java.lang.String r5 = r5.D     // Catch:{ Exception -> 0x03ff }
            com.luck.picture.lib.entity.LocalMediaFolder r5 = re.f.b(r9, r5)     // Catch:{ Exception -> 0x03ff }
            if (r5 == 0) goto L_0x0358
            r3.add(r5)     // Catch:{ Exception -> 0x03ff }
            java.lang.String r9 = r5.f8093c     // Catch:{ Exception -> 0x03ff }
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x03ff }
            r10.<init>(r9)     // Catch:{ Exception -> 0x03ff }
            long r9 = r10.lastModified()     // Catch:{ Exception -> 0x03ff }
            int r11 = r5.f8095e     // Catch:{ Exception -> 0x03ff }
            int r4 = r4 + r11
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x03ff }
            r11.<init>()     // Catch:{ Exception -> 0x03ff }
            r0.f8097n = r11     // Catch:{ Exception -> 0x03ff }
            boolean r11 = r2.moveToFirst()     // Catch:{ Exception -> 0x03ff }
            if (r11 == 0) goto L_0x038d
            boolean r11 = xe.i.a()     // Catch:{ Exception -> 0x03ff }
            if (r11 == 0) goto L_0x030c
            int r6 = r2.getColumnIndexOrThrow(r6)     // Catch:{ Exception -> 0x03ff }
            long r6 = r2.getLong(r6)     // Catch:{ Exception -> 0x03ff }
            int r11 = r2.getColumnIndexOrThrow(r8)     // Catch:{ Exception -> 0x03ff }
            java.lang.String r11 = r2.getString(r11)     // Catch:{ Exception -> 0x03ff }
            java.lang.String r6 = xe.g.f(r6, r11)     // Catch:{ Exception -> 0x03ff }
            goto L_0x0314
        L_0x030c:
            int r6 = r2.getColumnIndexOrThrow(r7)     // Catch:{ Exception -> 0x03ff }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ Exception -> 0x03ff }
        L_0x0314:
            r0.f8093c = r6     // Catch:{ Exception -> 0x03ff }
            int r6 = r2.getColumnIndexOrThrow(r8)     // Catch:{ Exception -> 0x03ff }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ Exception -> 0x03ff }
            r0.f8094d = r6     // Catch:{ Exception -> 0x03ff }
            java.lang.String r6 = r0.f8093c     // Catch:{ Exception -> 0x03ff }
            boolean r6 = j7.a.S(r6)     // Catch:{ Exception -> 0x03ff }
            if (r6 == 0) goto L_0x0340
            re.d r6 = r1.f14585d     // Catch:{ Exception -> 0x03ff }
            android.content.Context r6 = r6.f14575a     // Catch:{ Exception -> 0x03ff }
            java.lang.String r7 = r0.f8093c     // Catch:{ Exception -> 0x03ff }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x03ff }
            java.lang.String r6 = xe.h.d(r6, r7)     // Catch:{ Exception -> 0x03ff }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x03ff }
            r7.<init>(r6)     // Catch:{ Exception -> 0x03ff }
            long r6 = r7.lastModified()     // Catch:{ Exception -> 0x03ff }
            goto L_0x034b
        L_0x0340:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x03ff }
            java.lang.String r7 = r0.f8093c     // Catch:{ Exception -> 0x03ff }
            r6.<init>(r7)     // Catch:{ Exception -> 0x03ff }
            long r6 = r6.lastModified()     // Catch:{ Exception -> 0x03ff }
        L_0x034b:
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x038d
            java.lang.String r6 = r5.f8093c     // Catch:{ Exception -> 0x03ff }
            r0.f8093c = r6     // Catch:{ Exception -> 0x03ff }
            java.lang.String r5 = r5.f8094d     // Catch:{ Exception -> 0x03ff }
            r0.f8094d = r5     // Catch:{ Exception -> 0x03ff }
            goto L_0x038d
        L_0x0358:
            boolean r5 = r2.moveToFirst()     // Catch:{ Exception -> 0x03ff }
            if (r5 == 0) goto L_0x038d
            boolean r5 = xe.i.a()     // Catch:{ Exception -> 0x03ff }
            if (r5 == 0) goto L_0x0379
            int r5 = r2.getColumnIndexOrThrow(r6)     // Catch:{ Exception -> 0x03ff }
            long r5 = r2.getLong(r5)     // Catch:{ Exception -> 0x03ff }
            int r7 = r2.getColumnIndexOrThrow(r8)     // Catch:{ Exception -> 0x03ff }
            java.lang.String r7 = r2.getString(r7)     // Catch:{ Exception -> 0x03ff }
            java.lang.String r5 = xe.g.f(r5, r7)     // Catch:{ Exception -> 0x03ff }
            goto L_0x0381
        L_0x0379:
            int r5 = r2.getColumnIndexOrThrow(r7)     // Catch:{ Exception -> 0x03ff }
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x03ff }
        L_0x0381:
            r0.f8093c = r5     // Catch:{ Exception -> 0x03ff }
            int r5 = r2.getColumnIndexOrThrow(r8)     // Catch:{ Exception -> 0x03ff }
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x03ff }
            r0.f8094d = r5     // Catch:{ Exception -> 0x03ff }
        L_0x038d:
            if (r4 != 0) goto L_0x0396
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x0429
            goto L_0x03e9
        L_0x0396:
            t1.d r5 = new t1.d     // Catch:{ Exception -> 0x03ff }
            r6 = 3
            r5.<init>(r6)     // Catch:{ Exception -> 0x03ff }
            java.util.Collections.sort(r3, r5)     // Catch:{ Exception -> 0x03ff }
            r0.f8095e = r4     // Catch:{ Exception -> 0x03ff }
            r4 = -1
            r0.f8091a = r4     // Catch:{ Exception -> 0x03ff }
            re.d r4 = r1.f14585d     // Catch:{ Exception -> 0x03ff }
            ke.a r4 = r4.f14576b     // Catch:{ Exception -> 0x03ff }
            java.lang.String r4 = r4.G     // Catch:{ Exception -> 0x03ff }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x03ff }
            if (r4 == 0) goto L_0x03c8
            re.d r4 = r1.f14585d     // Catch:{ Exception -> 0x03ff }
            ke.a r5 = r4.f14576b     // Catch:{ Exception -> 0x03ff }
            int r5 = r5.f12517a     // Catch:{ Exception -> 0x03ff }
            r6 = 3
            if (r5 != r6) goto L_0x03bf
            android.content.Context r4 = r4.f14575a     // Catch:{ Exception -> 0x03ff }
            int r5 = com.luck.picture.lib.R$string.ps_all_audio     // Catch:{ Exception -> 0x03ff }
            goto L_0x03c3
        L_0x03bf:
            android.content.Context r4 = r4.f14575a     // Catch:{ Exception -> 0x03ff }
            int r5 = com.luck.picture.lib.R$string.ps_camera_roll     // Catch:{ Exception -> 0x03ff }
        L_0x03c3:
            java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x03ff }
            goto L_0x03ce
        L_0x03c8:
            re.d r4 = r1.f14585d     // Catch:{ Exception -> 0x03ff }
            ke.a r4 = r4.f14576b     // Catch:{ Exception -> 0x03ff }
            java.lang.String r4 = r4.G     // Catch:{ Exception -> 0x03ff }
        L_0x03ce:
            r0.f8092b = r4     // Catch:{ Exception -> 0x03ff }
            r4 = 0
            r3.add(r4, r0)     // Catch:{ Exception -> 0x03ff }
            re.d r0 = r1.f14585d     // Catch:{ Exception -> 0x03ff }
            ke.a r4 = r0.f14576b     // Catch:{ Exception -> 0x03ff }
            boolean r5 = r4.N     // Catch:{ Exception -> 0x03ff }
            if (r5 == 0) goto L_0x03e3
            int r4 = r4.f12517a     // Catch:{ Exception -> 0x03ff }
            if (r4 != 0) goto L_0x03e3
            re.d.f(r0, r3)     // Catch:{ Exception -> 0x03ff }
        L_0x03e3:
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x0429
        L_0x03e9:
            r2.close()
            goto L_0x0429
        L_0x03ed:
            r1 = r19
            r18 = r4
            r17 = r10
            goto L_0x0276
        L_0x03f5:
            r0 = move-exception
            r1 = r19
            goto L_0x040f
        L_0x03f9:
            r0 = move-exception
            r1 = r19
            goto L_0x0400
        L_0x03fd:
            r0 = move-exception
            goto L_0x040f
        L_0x03ff:
            r0 = move-exception
        L_0x0400:
            r0.printStackTrace()     // Catch:{ all -> 0x03fd }
            android.net.Uri r3 = re.a.f14572c     // Catch:{ all -> 0x03fd }
            r0.getMessage()     // Catch:{ all -> 0x03fd }
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x0424
            goto L_0x0421
        L_0x040f:
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x0418
            r2.close()
        L_0x0418:
            throw r0
        L_0x0419:
            if (r2 == 0) goto L_0x0424
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x0424
        L_0x0421:
            r2.close()
        L_0x0424:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0429:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: re.e.a():java.lang.Object");
    }

    public final void f(Object obj) {
        List list = (List) obj;
        b.a(this);
        qe.e eVar = this.f14584c;
        if (eVar != null) {
            eVar.a(list);
        }
    }
}
