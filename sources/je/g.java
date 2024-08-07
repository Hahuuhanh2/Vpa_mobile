package je;

import android.content.Intent;
import com.luck.picture.lib.entity.LocalMedia;
import we.b;

/* compiled from: PictureCommonFragment */
public final class g extends b.C0217b<LocalMedia> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Intent f11871c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f11872d;

    public g(h hVar, Intent intent) {
        this.f11872d = hVar;
        this.f11871c = intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r8 = this;
            je.h r0 = r8.f11872d
            android.content.Intent r1 = r8.f11871c
            r0.getClass()
            r2 = 3
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x000d
            goto L_0x0044
        L_0x000d:
            java.lang.String r5 = "output"
            android.os.Parcelable r5 = r1.getParcelableExtra(r5)
            android.net.Uri r5 = (android.net.Uri) r5
            ke.a r6 = r0.f11878i0
            java.lang.String r6 = r6.E
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0033
            boolean r7 = j7.a.S(r6)
            if (r7 != 0) goto L_0x0033
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            boolean r6 = r7.exists()
            if (r6 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r6 = 0
            goto L_0x0034
        L_0x0033:
            r6 = r3
        L_0x0034:
            ke.a r0 = r0.f11878i0
            int r0 = r0.f12517a
            if (r0 == r2) goto L_0x003c
            if (r6 != 0) goto L_0x0042
        L_0x003c:
            if (r5 != 0) goto L_0x0042
            android.net.Uri r5 = r1.getData()
        L_0x0042:
            if (r5 != 0) goto L_0x0046
        L_0x0044:
            r0 = r4
            goto L_0x0059
        L_0x0046:
            java.lang.String r0 = r5.toString()
            boolean r0 = j7.a.S(r0)
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r5.toString()
            goto L_0x0059
        L_0x0055:
            java.lang.String r0 = r5.getPath()
        L_0x0059:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0065
            je.h r1 = r8.f11872d
            ke.a r1 = r1.f11878i0
            r1.E = r0
        L_0x0065:
            je.h r0 = r8.f11872d
            ke.a r0 = r0.f11878i0
            java.lang.String r0 = r0.E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0073
            goto L_0x0117
        L_0x0073:
            je.h r0 = r8.f11872d
            ke.a r1 = r0.f11878i0
            int r4 = r1.f12517a
            if (r4 != r2) goto L_0x010b
            java.lang.String r1 = r1.C     // Catch:{ FileNotFoundException -> 0x0107 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ FileNotFoundException -> 0x0107 }
            if (r1 != 0) goto L_0x010b
            ke.a r1 = r0.f11878i0     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r1 = r1.E     // Catch:{ FileNotFoundException -> 0x0107 }
            boolean r1 = j7.a.S(r1)     // Catch:{ FileNotFoundException -> 0x0107 }
            if (r1 == 0) goto L_0x009e
            android.content.Context r1 = r0.p0()     // Catch:{ FileNotFoundException -> 0x0107 }
            ke.a r2 = r0.f11878i0     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r2 = r2.E     // Catch:{ FileNotFoundException -> 0x0107 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ FileNotFoundException -> 0x0107 }
            java.io.InputStream r1 = m9.b.N(r1, r2)     // Catch:{ FileNotFoundException -> 0x0107 }
            goto L_0x00a7
        L_0x009e:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0107 }
            ke.a r2 = r0.f11878i0     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r2 = r2.E     // Catch:{ FileNotFoundException -> 0x0107 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0107 }
        L_0x00a7:
            ke.a r2 = r0.f11878i0     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r2 = r2.A     // Catch:{ FileNotFoundException -> 0x0107 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x00b5
            r2 = r4
            goto L_0x00d6
        L_0x00b5:
            ke.a r2 = r0.f11878i0     // Catch:{ FileNotFoundException -> 0x0107 }
            r2.getClass()     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0107 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0107 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ FileNotFoundException -> 0x0107 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r5 = "_"
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0107 }
            ke.a r5 = r0.f11878i0     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r5 = r5.A     // Catch:{ FileNotFoundException -> 0x0107 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0107 }
        L_0x00d6:
            android.content.Context r5 = r0.p0()     // Catch:{ FileNotFoundException -> 0x0107 }
            ke.a r6 = r0.f11878i0     // Catch:{ FileNotFoundException -> 0x0107 }
            int r7 = r6.f12517a     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r6 = r6.C     // Catch:{ FileNotFoundException -> 0x0107 }
            java.io.File r2 = xe.h.b(r5, r7, r2, r4, r6)     // Catch:{ FileNotFoundException -> 0x0107 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r5 = r2.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0107 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0107 }
            boolean r1 = xe.h.f(r1, r4)     // Catch:{ FileNotFoundException -> 0x0107 }
            if (r1 == 0) goto L_0x010b
            android.content.Context r1 = r0.p0()     // Catch:{ FileNotFoundException -> 0x0107 }
            ke.a r4 = r0.f11878i0     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r4 = r4.E     // Catch:{ FileNotFoundException -> 0x0107 }
            xe.g.b(r1, r4)     // Catch:{ FileNotFoundException -> 0x0107 }
            ke.a r0 = r0.f11878i0     // Catch:{ FileNotFoundException -> 0x0107 }
            java.lang.String r1 = r2.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0107 }
            r0.E = r1     // Catch:{ FileNotFoundException -> 0x0107 }
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            r0.printStackTrace()
        L_0x010b:
            je.h r0 = r8.f11872d
            ke.a r1 = r0.f11878i0
            java.lang.String r1 = r1.E
            com.luck.picture.lib.entity.LocalMedia r4 = r0.i0(r1)
            r4.f8088x = r3
        L_0x0117:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: je.g.a():java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e3, code lost:
        if (r4 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        if (r4 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ee, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
        r1 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r15) {
        /*
            r14 = this;
            com.luck.picture.lib.entity.LocalMedia r15 = (com.luck.picture.lib.entity.LocalMedia) r15
            we.b.a(r14)
            if (r15 == 0) goto L_0x0121
            je.h r0 = r14.f11872d
            int r1 = je.h.f11873n0
            androidx.fragment.app.FragmentActivity r1 = r0.m()
            boolean r1 = j7.a.T(r1)
            if (r1 == 0) goto L_0x0017
            goto L_0x011c
        L_0x0017:
            boolean r1 = xe.i.a()
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r15.f8086v
            boolean r1 = j7.a.Z(r1)
            if (r1 == 0) goto L_0x011c
            java.lang.String r1 = r15.f8073b
            boolean r1 = j7.a.S(r1)
            if (r1 == 0) goto L_0x011c
            je.j r1 = new je.j
            androidx.fragment.app.FragmentActivity r0 = r0.m()
            java.lang.String r2 = r15.f8074c
            r1.<init>(r0, r2)
            goto L_0x011c
        L_0x003a:
            java.lang.String r1 = r15.f8073b
            boolean r1 = j7.a.S(r1)
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = r15.f8074c
            goto L_0x0047
        L_0x0045:
            java.lang.String r1 = r15.f8073b
        L_0x0047:
            je.j r2 = new je.j
            androidx.fragment.app.FragmentActivity r3 = r0.m()
            r2.<init>(r3, r1)
            java.lang.String r2 = r15.f8086v
            boolean r2 = j7.a.Y(r2)
            if (r2 == 0) goto L_0x011c
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            android.content.Context r1 = r0.p0()
            java.lang.String r2 = r2.getParent()
            java.lang.String r3 = "%"
            r4 = 0
            r5 = -1
            r6 = 1
            r7 = 0
            java.lang.String r11 = "_data like ?"
            java.lang.String[] r12 = new java.lang.String[r6]     // Catch:{ Exception -> 0x00e8 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e8 }
            r8.<init>()     // Catch:{ Exception -> 0x00e8 }
            r8.append(r3)     // Catch:{ Exception -> 0x00e8 }
            r8.append(r2)     // Catch:{ Exception -> 0x00e8 }
            r8.append(r3)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r2 = r8.toString()     // Catch:{ Exception -> 0x00e8 }
            r12[r7] = r2     // Catch:{ Exception -> 0x00e8 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00e8 }
            r3 = 30
            if (r2 < r3) goto L_0x008b
            r2 = r6
            goto L_0x008c
        L_0x008b:
            r2 = r7
        L_0x008c:
            if (r2 == 0) goto L_0x00a3
            java.lang.String r2 = "_id DESC"
            android.os.Bundle r2 = xe.g.a(r11, r12, r6, r7, r2)     // Catch:{ Exception -> 0x00e8 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ Exception -> 0x00e8 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x00e8 }
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00e8 }
            android.database.Cursor r1 = r1.query(r3, (java.lang.String[]) null, r2, (android.os.CancellationSignal) null)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00b4
        L_0x00a3:
            java.lang.String r13 = "_id DESC limit 1 offset 0"
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ Exception -> 0x00e8 }
            android.content.ContentResolver r8 = r1.getContentResolver()     // Catch:{ Exception -> 0x00e8 }
            android.net.Uri r9 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00e8 }
            r10 = 0
            android.database.Cursor r1 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00e8 }
        L_0x00b4:
            r4 = r1
            if (r4 == 0) goto L_0x00e3
            int r1 = r4.getCount()     // Catch:{ Exception -> 0x00e8 }
            if (r1 <= 0) goto L_0x00e3
            boolean r1 = r4.moveToFirst()     // Catch:{ Exception -> 0x00e8 }
            if (r1 == 0) goto L_0x00e3
            java.lang.String r1 = "_id"
            int r1 = r4.getColumnIndex(r1)     // Catch:{ Exception -> 0x00e8 }
            int r1 = r4.getInt(r1)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r2 = "date_added"
            int r2 = r4.getColumnIndex(r2)     // Catch:{ Exception -> 0x00e8 }
            long r2 = r4.getLong(r2)     // Catch:{ Exception -> 0x00e8 }
            int r2 = xe.b.a(r2)     // Catch:{ Exception -> 0x00e8 }
            if (r2 > r6) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            r4.close()
            goto L_0x00f2
        L_0x00e3:
            if (r4 == 0) goto L_0x00f1
            goto L_0x00ee
        L_0x00e6:
            r15 = move-exception
            goto L_0x0116
        L_0x00e8:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x00e6 }
            if (r4 == 0) goto L_0x00f1
        L_0x00ee:
            r4.close()
        L_0x00f1:
            r1 = r5
        L_0x00f2:
            if (r1 == r5) goto L_0x011c
            android.content.Context r0 = r0.p0()
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Exception -> 0x0111 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x0111 }
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0111 }
            java.lang.String r3 = "_id=?"
            java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ Exception -> 0x0111 }
            long r5 = (long) r1     // Catch:{ Exception -> 0x0111 }
            java.lang.String r1 = java.lang.Long.toString(r5)     // Catch:{ Exception -> 0x0111 }
            r4[r7] = r1     // Catch:{ Exception -> 0x0111 }
            r0.delete(r2, r3, r4)     // Catch:{ Exception -> 0x0111 }
            goto L_0x011c
        L_0x0111:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x011c
        L_0x0116:
            if (r4 == 0) goto L_0x011b
            r4.close()
        L_0x011b:
            throw r15
        L_0x011c:
            je.h r0 = r14.f11872d
            r0.m0(r15)
        L_0x0121:
            je.h r15 = r14.f11872d
            ke.a r15 = r15.f11878i0
            java.lang.String r0 = ""
            r15.E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je.g.f(java.lang.Object):void");
    }
}
