package re;

import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.List;
import qe.e;
import we.b;

/* compiled from: LocalMediaLoader */
public final class b extends b.C0217b<List<LocalMediaFolder>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f14577c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f14578d;

    public b(c cVar, ee.b bVar) {
        this.f14578d = cVar;
        this.f14577c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01d8, code lost:
        if (r1.isClosed() != false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01eb, code lost:
        if (r1.isClosed() == false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ed, code lost:
        r1.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e8 A[SYNTHETIC, Splitter:B:29:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            re.c r1 = r15.f14578d
            android.content.Context r1 = r1.f14575a
            android.content.ContentResolver r2 = r1.getContentResolver()
            android.net.Uri r3 = re.a.f14572c
            java.lang.String[] r4 = re.a.f14573d
            re.c r1 = r15.f14578d
            java.lang.String r5 = r1.a()
            java.lang.String r6 = r1.b()
            java.lang.String r7 = r1.c()
            ke.a r1 = r1.f14576b
            int r1 = r1.f12517a
            r8 = 3
            r9 = 2
            r10 = 0
            r11 = 1
            if (r1 == 0) goto L_0x0077
            java.lang.String r12 = " AND "
            java.lang.String r13 = "media_type=?"
            if (r1 == r11) goto L_0x0061
            if (r1 == r9) goto L_0x004b
            if (r1 == r8) goto L_0x0035
            r5 = r10
            goto L_0x0093
        L_0x0035:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            r1.append(r7)
            r1.append(r12)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            goto L_0x0092
        L_0x004b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            r1.append(r7)
            r1.append(r12)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            goto L_0x0092
        L_0x0061:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            r1.append(r7)
            r1.append(r12)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            goto L_0x0092
        L_0x0077:
            java.lang.String r1 = "(media_type=?"
            java.lang.String r12 = " OR "
            java.lang.String r13 = "media_type"
            java.lang.String r14 = "=? AND "
            java.lang.StringBuilder r1 = android.support.v4.media.a.r(r1, r7, r12, r13, r14)
            r1.append(r5)
            java.lang.String r5 = ") AND "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
        L_0x0092:
            r5 = r1
        L_0x0093:
            re.c r1 = r15.f14578d
            ke.a r1 = r1.f14576b
            int r1 = r1.f12517a
            r12 = 0
            if (r1 == 0) goto L_0x00bf
            if (r1 == r11) goto L_0x00b6
            if (r1 == r9) goto L_0x00ad
            if (r1 == r8) goto L_0x00a4
            r6 = r10
            goto L_0x00ce
        L_0x00a4:
            java.lang.String[] r1 = new java.lang.String[r11]
            java.lang.String r6 = java.lang.String.valueOf(r9)
            r1[r12] = r6
            goto L_0x00cd
        L_0x00ad:
            java.lang.String[] r1 = new java.lang.String[r11]
            java.lang.String r6 = java.lang.String.valueOf(r8)
            r1[r12] = r6
            goto L_0x00cd
        L_0x00b6:
            java.lang.String[] r1 = new java.lang.String[r11]
            java.lang.String r6 = java.lang.String.valueOf(r11)
            r1[r12] = r6
            goto L_0x00cd
        L_0x00bf:
            java.lang.String[] r1 = new java.lang.String[r9]
            java.lang.String r6 = java.lang.String.valueOf(r11)
            r1[r12] = r6
            java.lang.String r6 = java.lang.String.valueOf(r8)
            r1[r11] = r6
        L_0x00cd:
            r6 = r1
        L_0x00ce:
            re.c r1 = r15.f14578d
            ke.a r7 = r1.f14576b
            java.lang.String r7 = r7.F
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x00dd
            java.lang.String r1 = "date_modified DESC"
            goto L_0x00e1
        L_0x00dd:
            ke.a r1 = r1.f14576b
            java.lang.String r1 = r1.F
        L_0x00e1:
            r7 = r1
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x01e5
            com.luck.picture.lib.entity.LocalMediaFolder r2 = new com.luck.picture.lib.entity.LocalMediaFolder     // Catch:{ Exception -> 0x01d0 }
            r2.<init>()     // Catch:{ Exception -> 0x01d0 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x01d0 }
            r3.<init>()     // Catch:{ Exception -> 0x01d0 }
            int r4 = r1.getCount()     // Catch:{ Exception -> 0x01d0 }
            if (r4 <= 0) goto L_0x01e5
            r1.moveToFirst()     // Catch:{ Exception -> 0x01d0 }
        L_0x00fb:
            re.c r4 = r15.f14578d     // Catch:{ Exception -> 0x01d0 }
            com.luck.picture.lib.entity.LocalMedia r4 = r4.g(r1)     // Catch:{ Exception -> 0x01d0 }
            if (r4 != 0) goto L_0x0104
            goto L_0x012c
        L_0x0104:
            re.c r5 = r15.f14578d     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r6 = r4.f8073b     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r7 = r4.f8086v     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r10 = r4.J     // Catch:{ Exception -> 0x01d0 }
            com.luck.picture.lib.entity.LocalMediaFolder r5 = re.c.f(r5, r6, r7, r10, r0)     // Catch:{ Exception -> 0x01d0 }
            long r6 = r4.K     // Catch:{ Exception -> 0x01d0 }
            r5.f8091a = r6     // Catch:{ Exception -> 0x01d0 }
            java.util.ArrayList r6 = r5.a()     // Catch:{ Exception -> 0x01d0 }
            r6.add(r4)     // Catch:{ Exception -> 0x01d0 }
            int r6 = r5.f8095e     // Catch:{ Exception -> 0x01d0 }
            int r6 = r6 + r11
            r5.f8095e = r6     // Catch:{ Exception -> 0x01d0 }
            long r6 = r4.K     // Catch:{ Exception -> 0x01d0 }
            r5.f8091a = r6     // Catch:{ Exception -> 0x01d0 }
            r3.add(r4)     // Catch:{ Exception -> 0x01d0 }
            int r4 = r2.f8095e     // Catch:{ Exception -> 0x01d0 }
            int r4 = r4 + r11
            r2.f8095e = r4     // Catch:{ Exception -> 0x01d0 }
        L_0x012c:
            boolean r4 = r1.moveToNext()     // Catch:{ Exception -> 0x01d0 }
            if (r4 != 0) goto L_0x00fb
            re.c r4 = r15.f14578d     // Catch:{ Exception -> 0x01d0 }
            android.content.Context r5 = r4.f14575a     // Catch:{ Exception -> 0x01d0 }
            ke.a r4 = r4.f14576b     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r4 = r4.D     // Catch:{ Exception -> 0x01d0 }
            com.luck.picture.lib.entity.LocalMediaFolder r4 = re.f.b(r5, r4)     // Catch:{ Exception -> 0x01d0 }
            if (r4 == 0) goto L_0x0178
            r0.add(r4)     // Catch:{ Exception -> 0x01d0 }
            int r5 = r2.f8095e     // Catch:{ Exception -> 0x01d0 }
            int r6 = r4.f8095e     // Catch:{ Exception -> 0x01d0 }
            int r5 = r5 + r6
            r2.f8095e = r5     // Catch:{ Exception -> 0x01d0 }
            java.util.ArrayList r5 = r4.a()     // Catch:{ Exception -> 0x01d0 }
            r2.f8097n = r5     // Catch:{ Exception -> 0x01d0 }
            java.util.ArrayList r5 = r4.a()     // Catch:{ Exception -> 0x01d0 }
            r3.addAll(r12, r5)     // Catch:{ Exception -> 0x01d0 }
            int r4 = r4.f8095e     // Catch:{ Exception -> 0x01d0 }
            r5 = 60
            if (r5 <= r4) goto L_0x0178
            int r4 = r3.size()     // Catch:{ Exception -> 0x01d0 }
            if (r4 <= r5) goto L_0x0170
            java.util.List r4 = r3.subList(r12, r5)     // Catch:{ Exception -> 0x01d0 }
            v.n1 r5 = new v.n1     // Catch:{ Exception -> 0x01d0 }
            r5.<init>(r9)     // Catch:{ Exception -> 0x01d0 }
            java.util.Collections.sort(r4, r5)     // Catch:{ Exception -> 0x01d0 }
            goto L_0x0178
        L_0x0170:
            v.n1 r4 = new v.n1     // Catch:{ Exception -> 0x01d0 }
            r4.<init>(r9)     // Catch:{ Exception -> 0x01d0 }
            java.util.Collections.sort(r3, r4)     // Catch:{ Exception -> 0x01d0 }
        L_0x0178:
            int r4 = r3.size()     // Catch:{ Exception -> 0x01d0 }
            if (r4 <= 0) goto L_0x01e5
            t1.d r4 = new t1.d     // Catch:{ Exception -> 0x01d0 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x01d0 }
            java.util.Collections.sort(r0, r4)     // Catch:{ Exception -> 0x01d0 }
            r0.add(r12, r2)     // Catch:{ Exception -> 0x01d0 }
            java.lang.Object r4 = r3.get(r12)     // Catch:{ Exception -> 0x01d0 }
            com.luck.picture.lib.entity.LocalMedia r4 = (com.luck.picture.lib.entity.LocalMedia) r4     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r4 = r4.f8073b     // Catch:{ Exception -> 0x01d0 }
            r2.f8093c = r4     // Catch:{ Exception -> 0x01d0 }
            java.lang.Object r4 = r3.get(r12)     // Catch:{ Exception -> 0x01d0 }
            com.luck.picture.lib.entity.LocalMedia r4 = (com.luck.picture.lib.entity.LocalMedia) r4     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r4 = r4.f8086v     // Catch:{ Exception -> 0x01d0 }
            r2.f8094d = r4     // Catch:{ Exception -> 0x01d0 }
            re.c r4 = r15.f14578d     // Catch:{ Exception -> 0x01d0 }
            ke.a r4 = r4.f14576b     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r4 = r4.G     // Catch:{ Exception -> 0x01d0 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x01d0 }
            if (r4 == 0) goto L_0x01bf
            re.c r4 = r15.f14578d     // Catch:{ Exception -> 0x01d0 }
            ke.a r5 = r4.f14576b     // Catch:{ Exception -> 0x01d0 }
            int r5 = r5.f12517a     // Catch:{ Exception -> 0x01d0 }
            if (r5 != r8) goto L_0x01b6
            android.content.Context r4 = r4.f14575a     // Catch:{ Exception -> 0x01d0 }
            int r5 = com.luck.picture.lib.R$string.ps_all_audio     // Catch:{ Exception -> 0x01d0 }
            goto L_0x01ba
        L_0x01b6:
            android.content.Context r4 = r4.f14575a     // Catch:{ Exception -> 0x01d0 }
            int r5 = com.luck.picture.lib.R$string.ps_camera_roll     // Catch:{ Exception -> 0x01d0 }
        L_0x01ba:
            java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x01d0 }
            goto L_0x01c5
        L_0x01bf:
            re.c r4 = r15.f14578d     // Catch:{ Exception -> 0x01d0 }
            ke.a r4 = r4.f14576b     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r4 = r4.G     // Catch:{ Exception -> 0x01d0 }
        L_0x01c5:
            r2.f8092b = r4     // Catch:{ Exception -> 0x01d0 }
            r4 = -1
            r2.f8091a = r4     // Catch:{ Exception -> 0x01d0 }
            r2.f8097n = r3     // Catch:{ Exception -> 0x01d0 }
            goto L_0x01e5
        L_0x01ce:
            r0 = move-exception
            goto L_0x01db
        L_0x01d0:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x01ce }
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L_0x01f0
            goto L_0x01ed
        L_0x01db:
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L_0x01e4
            r1.close()
        L_0x01e4:
            throw r0
        L_0x01e5:
            if (r1 == 0) goto L_0x01f0
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L_0x01f0
        L_0x01ed:
            r1.close()
        L_0x01f0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.a():java.lang.Object");
    }

    public final void f(Object obj) {
        List list = (List) obj;
        we.b.a(this);
        e eVar = this.f14577c;
        if (eVar != null) {
            eVar.a(list);
        }
    }
}
