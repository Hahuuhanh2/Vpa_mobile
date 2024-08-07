package re;

import android.content.Context;
import android.text.TextUtils;
import com.luck.picture.lib.entity.LocalMedia;
import f0.b0;
import java.util.ArrayList;
import we.b;
import xe.i;

/* compiled from: LocalMediaPageLoader */
public final class d extends a {

    /* compiled from: LocalMediaPageLoader */
    public class a extends b.C0217b<oe.a> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f14579c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f14580d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f14581e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a.a f14582f;

        public a(long j10, int i10, int i11, a.a aVar) {
            this.f14579c = j10;
            this.f14580d = i10;
            this.f14581e = i11;
            this.f14582f = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01cc, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0251, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0252, code lost:
            r1 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0255, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0256, code lost:
            r1 = r27;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x0264 A[Catch:{ Exception -> 0x029d, all -> 0x029a }] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x0284 A[Catch:{ Exception -> 0x029d, all -> 0x029a }] */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x028d A[Catch:{ Exception -> 0x029d, all -> 0x029a }] */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x028f A[Catch:{ Exception -> 0x029d, all -> 0x029a }] */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x02cd  */
        /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0237 A[Catch:{ Exception -> 0x0255, all -> 0x0251 }] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x023a A[Catch:{ Exception -> 0x0255, all -> 0x0251 }] */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0248 A[LOOP:0: B:23:0x00ac->B:94:0x0248, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0251 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:21:0x00a9] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a() {
            /*
                r27 = this;
                r1 = r27
                java.lang.String r2 = "image/*"
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                r4 = 30
                r5 = 0
                r6 = 1
                if (r0 < r4) goto L_0x000e
                r0 = r6
                goto L_0x000f
            L_0x000e:
                r0 = r5
            L_0x000f:
                r4 = -1
                if (r0 == 0) goto L_0x0043
                re.d r0 = re.d.this     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                long r7 = r1.f14579c     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String r0 = r0.g(r7)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                re.d r7 = re.d.this     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                long r8 = r1.f14579c     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String[] r7 = r7.h(r8)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                int r8 = r1.f14580d     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                int r9 = r1.f14581e     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                int r9 = r9 - r6
                int r9 = r9 * r8
                re.d r10 = re.d.this     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String r10 = r10.j()     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                android.os.Bundle r0 = xe.g.a(r0, r7, r8, r9, r10)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                re.d r7 = re.d.this     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                android.content.Context r7 = r7.f14575a     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                android.net.Uri r8 = re.a.f14572c     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String[] r9 = re.a.f14573d     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                android.database.Cursor r0 = r7.query(r8, r9, r0, (android.os.CancellationSignal) null)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                goto L_0x009a
            L_0x0043:
                int r0 = r1.f14581e     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                if (r0 != r4) goto L_0x004f
                re.d r0 = re.d.this     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String r0 = r0.j()     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
            L_0x004d:
                r12 = r0
                goto L_0x007a
            L_0x004f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                r0.<init>()     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                re.d r7 = re.d.this     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String r7 = r7.j()     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                r0.append(r7)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String r7 = " limit "
                r0.append(r7)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                int r7 = r1.f14580d     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                r0.append(r7)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String r7 = " offset "
                r0.append(r7)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                int r7 = r1.f14581e     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                int r7 = r7 - r6
                int r8 = r1.f14580d     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                int r7 = r7 * r8
                r0.append(r7)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                goto L_0x004d
            L_0x007a:
                re.d r0 = re.d.this     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                android.content.Context r0 = r0.f14575a     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                android.content.ContentResolver r7 = r0.getContentResolver()     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                android.net.Uri r8 = re.a.f14572c     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String[] r9 = re.a.f14573d     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                re.d r0 = re.d.this     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                long r10 = r1.f14579c     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String r10 = r0.g(r10)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                re.d r0 = re.d.this     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                long r13 = r1.f14579c     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                java.lang.String[] r11 = r0.h(r13)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
                android.database.Cursor r0 = r7.query(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x02b3, all -> 0x02b1 }
            L_0x009a:
                r7 = r0
                if (r7 == 0) goto L_0x02a0
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                r8.<init>()     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                int r0 = r7.getCount()     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                r9 = 2
                if (r0 <= 0) goto L_0x0259
                r7.moveToFirst()     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
            L_0x00ac:
                re.d r10 = re.d.this     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r10.getClass()     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                java.lang.String[] r0 = re.a.f14573d     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r11 = r0[r5]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r11 = r7.getColumnIndexOrThrow(r11)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r12 = r0[r6]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r12 = r7.getColumnIndexOrThrow(r12)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r13 = r0[r9]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r13 = r7.getColumnIndexOrThrow(r13)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r14 = 3
                r14 = r0[r14]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r14 = r7.getColumnIndexOrThrow(r14)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r15 = 4
                r15 = r0[r15]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r15 = r7.getColumnIndexOrThrow(r15)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r16 = 5
                r3 = r0[r16]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r3 = r7.getColumnIndexOrThrow(r3)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r16 = 6
                r5 = r0[r16]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r5 = r7.getColumnIndexOrThrow(r5)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r16 = 7
                r9 = r0[r16]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r9 = r7.getColumnIndexOrThrow(r9)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r16 = 8
                r6 = r0[r16]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r6 = r7.getColumnIndexOrThrow(r6)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r16 = 9
                r4 = r0[r16]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r4 = r7.getColumnIndexOrThrow(r4)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r16 = 10
                r1 = r0[r16]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r1 = r7.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r16 = 11
                r0 = r0[r16]     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r16 = r8
                r17 = r9
                long r8 = r7.getLong(r11)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                java.lang.String r11 = r7.getString(r13)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                java.lang.String r12 = r7.getString(r12)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                boolean r13 = xe.i.a()     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r13 == 0) goto L_0x0126
                java.lang.String r13 = xe.g.f(r8, r11)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                goto L_0x0127
            L_0x0126:
                r13 = r12
            L_0x0127:
                boolean r18 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r18 == 0) goto L_0x012f
                java.lang.String r11 = "image/jpeg"
            L_0x012f:
                r18 = r13
                ke.a r13 = r10.f14576b     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r13.getClass()     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                boolean r13 = r11.endsWith(r2)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r13 == 0) goto L_0x014c
                java.lang.String r11 = xe.g.e(r12)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                ke.a r13 = r10.f14576b     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r13.getClass()     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                boolean r13 = j7.a.W(r11)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r13 == 0) goto L_0x014c
                goto L_0x0152
            L_0x014c:
                boolean r13 = r11.endsWith(r2)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r13 == 0) goto L_0x0157
            L_0x0152:
                r20 = r2
            L_0x0154:
                r1 = 0
                goto L_0x0235
            L_0x0157:
                ke.a r13 = r10.f14576b     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                boolean r13 = r13.f12533p     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r13 != 0) goto L_0x0166
                java.lang.String r13 = "image/webp"
                boolean r13 = r11.startsWith(r13)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r13 == 0) goto L_0x0166
                goto L_0x0152
            L_0x0166:
                ke.a r13 = r10.f14576b     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                boolean r13 = r13.f12534q     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r13 != 0) goto L_0x0173
                boolean r13 = j7.a.V(r11)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r13 == 0) goto L_0x0173
                goto L_0x0152
            L_0x0173:
                int r13 = r7.getInt(r14)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r19 = r7.getInt(r15)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r0 = r7.getInt(r0)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r20 = r2
                r2 = 90
                if (r0 == r2) goto L_0x0189
                r2 = 270(0x10e, float:3.78E-43)
                if (r0 != r2) goto L_0x0191
            L_0x0189:
                int r13 = r7.getInt(r15)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r19 = r7.getInt(r14)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
            L_0x0191:
                r2 = r19
                long r14 = r7.getLong(r3)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r19 = r2
                long r2 = r7.getLong(r5)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r0 = r17
                java.lang.String r5 = r7.getString(r0)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                java.lang.String r0 = r7.getString(r6)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r6 = r5
                long r4 = r7.getLong(r4)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r21 = r4
                long r4 = r7.getLong(r1)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r1 == 0) goto L_0x01d7
                java.lang.String r1 = ""
                java.lang.String r0 = "/"
                int r0 = r12.lastIndexOf(r0)     // Catch:{ Exception -> 0x01ce, all -> 0x0251 }
                r17 = r1
                r1 = -1
                if (r0 == r1) goto L_0x01d5
                int r0 = r0 + 1
                java.lang.String r0 = r12.substring(r0)     // Catch:{ Exception -> 0x01cc, all -> 0x0251 }
                goto L_0x01d7
            L_0x01cc:
                r0 = move-exception
                goto L_0x01d2
            L_0x01ce:
                r0 = move-exception
                r17 = r1
                r1 = -1
            L_0x01d2:
                r0.printStackTrace()     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
            L_0x01d5:
                r0 = r17
            L_0x01d7:
                ke.a r1 = r10.f14576b     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                boolean r1 = r1.R     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r23 = 0
                if (r1 == 0) goto L_0x01eb
                int r1 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
                if (r1 <= 0) goto L_0x01eb
                r25 = 1024(0x400, double:5.06E-321)
                int r1 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
                if (r1 >= 0) goto L_0x01eb
            L_0x01e9:
                goto L_0x0154
            L_0x01eb:
                boolean r1 = j7.a.Z(r11)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r1 != 0) goto L_0x01f7
                boolean r1 = j7.a.U(r11)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r1 == 0) goto L_0x020c
            L_0x01f7:
                ke.a r1 = r10.f14576b     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.getClass()     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                ke.a r1 = r10.f14576b     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.getClass()     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                ke.a r1 = r10.f14576b     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                boolean r1 = r1.R     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                if (r1 == 0) goto L_0x020c
                int r1 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
                if (r1 > 0) goto L_0x020c
                goto L_0x01e9
            L_0x020c:
                com.luck.picture.lib.entity.LocalMedia r1 = new com.luck.picture.lib.entity.LocalMedia     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.<init>()     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.f8072a = r8     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r8 = r21
                r1.K = r8     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r8 = r18
                r1.f8073b = r8     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.f8074c = r12     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.I = r0     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.J = r6     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.f8081q = r14     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                ke.a r0 = r10.f14576b     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                int r0 = r0.f12517a     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.f8087w = r0     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.f8086v = r11     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.f8090z = r13     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r6 = r19
                r1.A = r6     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.G = r2     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1.L = r4     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
            L_0x0235:
                if (r1 != 0) goto L_0x023a
                r2 = r16
                goto L_0x023f
            L_0x023a:
                r2 = r16
                r2.add(r1)     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
            L_0x023f:
                boolean r0 = r7.moveToNext()     // Catch:{ Exception -> 0x0255, all -> 0x0251 }
                r1 = r27
                if (r0 != 0) goto L_0x0248
                goto L_0x025c
            L_0x0248:
                r8 = r2
                r2 = r20
                r4 = -1
                r5 = 0
                r6 = 1
                r9 = 2
                goto L_0x00ac
            L_0x0251:
                r0 = move-exception
                r1 = r27
                goto L_0x029b
            L_0x0255:
                r0 = move-exception
                r1 = r27
                goto L_0x029e
            L_0x0259:
                r2 = r8
                r1 = r27
            L_0x025c:
                long r3 = r1.f14579c     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                r5 = -1
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 != 0) goto L_0x0284
                int r0 = r1.f14581e     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                r3 = 1
                if (r0 != r3) goto L_0x0285
                re.d r0 = re.d.this     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                android.content.Context r4 = r0.f14575a     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                ke.a r0 = r0.f14576b     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                java.lang.String r0 = r0.D     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                java.util.ArrayList r0 = re.f.a(r4, r0)     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                if (r0 == 0) goto L_0x0285
                r2.addAll(r0)     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                v.n1 r0 = new v.n1     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                r4 = 2
                r0.<init>(r4)     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                java.util.Collections.sort(r2, r0)     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                goto L_0x0285
            L_0x0284:
                r3 = 1
            L_0x0285:
                oe.a r0 = new oe.a     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                int r4 = r7.getCount()     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                if (r4 <= 0) goto L_0x028f
                r5 = r3
                goto L_0x0290
            L_0x028f:
                r5 = 0
            L_0x0290:
                r0.<init>(r2, r5)     // Catch:{ Exception -> 0x029d, all -> 0x029a }
                boolean r2 = r7.isClosed()
                if (r2 != 0) goto L_0x02d1
                goto L_0x02ce
            L_0x029a:
                r0 = move-exception
            L_0x029b:
                r3 = r7
                goto L_0x02d3
            L_0x029d:
                r0 = move-exception
            L_0x029e:
                r3 = r7
                goto L_0x02b8
            L_0x02a0:
                if (r7 == 0) goto L_0x02ab
                boolean r0 = r7.isClosed()
                if (r0 != 0) goto L_0x02ab
                r7.close()
            L_0x02ab:
                oe.a r0 = new oe.a
                r0.<init>()
                goto L_0x02d1
            L_0x02b1:
                r0 = move-exception
                goto L_0x02b5
            L_0x02b3:
                r0 = move-exception
                goto L_0x02b7
            L_0x02b5:
                r3 = 0
                goto L_0x02d3
            L_0x02b7:
                r3 = 0
            L_0x02b8:
                r0.printStackTrace()     // Catch:{ all -> 0x02d2 }
                android.net.Uri r2 = re.a.f14572c     // Catch:{ all -> 0x02d2 }
                r0.getMessage()     // Catch:{ all -> 0x02d2 }
                oe.a r0 = new oe.a     // Catch:{ all -> 0x02d2 }
                r0.<init>()     // Catch:{ all -> 0x02d2 }
                if (r3 == 0) goto L_0x02d1
                boolean r2 = r3.isClosed()
                if (r2 != 0) goto L_0x02d1
                r7 = r3
            L_0x02ce:
                r7.close()
            L_0x02d1:
                return r0
            L_0x02d2:
                r0 = move-exception
            L_0x02d3:
                if (r3 == 0) goto L_0x02de
                boolean r2 = r3.isClosed()
                if (r2 != 0) goto L_0x02de
                r3.close()
            L_0x02de:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: re.d.a.a():java.lang.Object");
        }

        public final void f(Object obj) {
            oe.a aVar = (oe.a) obj;
            b.a(this);
            a.a aVar2 = this.f14582f;
            if (aVar2 != null) {
                ArrayList<LocalMedia> arrayList = aVar.f13866b;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                aVar2.g(arrayList, aVar.f13865a);
            }
        }
    }

    public d(Context context, ke.a aVar) {
        super(context, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b5, code lost:
        if (r6.isClosed() == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        if (r6.isClosed() == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c7, code lost:
        if (r6.isClosed() == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d8, code lost:
        if (r6.isClosed() == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00da, code lost:
        r6.close();
        r8 = r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(re.d r19, java.util.ArrayList r20) {
        /*
            r1 = r19
            r19.getClass()
            r2 = 0
            r3 = r2
        L_0x0007:
            int r0 = r20.size()
            if (r3 >= r0) goto L_0x00f8
            r4 = r20
            java.lang.Object r0 = r4.get(r3)
            r5 = r0
            com.luck.picture.lib.entity.LocalMediaFolder r5 = (com.luck.picture.lib.entity.LocalMediaFolder) r5
            if (r5 != 0) goto L_0x001a
            goto L_0x00e6
        L_0x001a:
            long r6 = r5.f8091a
            r8 = 0
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            r9 = 30
            r10 = 1
            if (r0 < r9) goto L_0x0026
            r0 = r10
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            java.lang.String r9 = "_data"
            java.lang.String r11 = "mime_type"
            java.lang.String r12 = "_id"
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r1.g(r6)     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            java.lang.String[] r6 = r1.h(r6)     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            java.lang.String r7 = r19.j()     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            android.os.Bundle r0 = xe.g.a(r0, r6, r10, r2, r7)     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            android.content.Context r6 = r1.f14575a     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            android.net.Uri r7 = re.a.f14572c     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            java.lang.String[] r10 = new java.lang.String[]{r12, r11, r9}     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            android.database.Cursor r0 = r6.query(r7, r10, r0, (android.os.CancellationSignal) null)     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
        L_0x004f:
            r6 = r0
            goto L_0x007f
        L_0x0051:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            r0.<init>()     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            java.lang.String r10 = r19.j()     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            r0.append(r10)     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            java.lang.String r10 = " limit 1 offset 0"
            r0.append(r10)     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            java.lang.String r18 = r0.toString()     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            android.content.Context r0 = r1.f14575a     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            android.content.ContentResolver r13 = r0.getContentResolver()     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            android.net.Uri r14 = re.a.f14572c     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            java.lang.String[] r15 = new java.lang.String[]{r12, r11, r9}     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            java.lang.String r16 = r1.g(r6)     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            java.lang.String[] r17 = r1.h(r6)     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            android.database.Cursor r0 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00ca, all -> 0x00cc }
            goto L_0x004f
        L_0x007f:
            if (r6 == 0) goto L_0x00c1
            int r0 = r6.getCount()     // Catch:{ Exception -> 0x00bf }
            if (r0 <= 0) goto L_0x00c1
            boolean r0 = r6.moveToFirst()     // Catch:{ Exception -> 0x00bf }
            if (r0 == 0) goto L_0x00b8
            int r0 = r6.getColumnIndexOrThrow(r12)     // Catch:{ Exception -> 0x00bf }
            long r12 = r6.getLong(r0)     // Catch:{ Exception -> 0x00bf }
            int r0 = r6.getColumnIndexOrThrow(r11)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception -> 0x00bf }
            boolean r7 = xe.i.a()     // Catch:{ Exception -> 0x00bf }
            if (r7 == 0) goto L_0x00a8
            java.lang.String r0 = xe.g.f(r12, r0)     // Catch:{ Exception -> 0x00bf }
            goto L_0x00b0
        L_0x00a8:
            int r0 = r6.getColumnIndexOrThrow(r9)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception -> 0x00bf }
        L_0x00b0:
            r8 = r0
            boolean r0 = r6.isClosed()
            if (r0 != 0) goto L_0x00dd
            goto L_0x00da
        L_0x00b8:
            boolean r0 = r6.isClosed()
            if (r0 != 0) goto L_0x00dd
            goto L_0x00da
        L_0x00bf:
            r0 = move-exception
            goto L_0x00cf
        L_0x00c1:
            if (r6 == 0) goto L_0x00dd
            boolean r0 = r6.isClosed()
            if (r0 != 0) goto L_0x00dd
            goto L_0x00da
        L_0x00ca:
            r0 = move-exception
            goto L_0x00ce
        L_0x00cc:
            r0 = move-exception
            goto L_0x00ec
        L_0x00ce:
            r6 = r8
        L_0x00cf:
            r0.printStackTrace()     // Catch:{ all -> 0x00ea }
            if (r6 == 0) goto L_0x00dd
            boolean r0 = r6.isClosed()
            if (r0 != 0) goto L_0x00dd
        L_0x00da:
            r6.close()
        L_0x00dd:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r5.f8093c = r8
        L_0x00e6:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x00ea:
            r0 = move-exception
            r8 = r6
        L_0x00ec:
            if (r8 == 0) goto L_0x00f7
            boolean r1 = r8.isClosed()
            if (r1 != 0) goto L_0x00f7
            r8.close()
        L_0x00f7:
            throw r0
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: re.d.f(re.d, java.util.ArrayList):void");
    }

    public static String[] i(int i10, long j10) {
        if (j10 == -1) {
            return new String[]{String.valueOf(i10)};
        }
        return new String[]{String.valueOf(i10), j7.a.E0(Long.valueOf(j10))};
    }

    public final void d(ee.b bVar) {
        b.b(new e(this, bVar));
    }

    public final void e(long j10, int i10, int i11, a.a aVar) {
        b.b(new a(j10, i11, i10, aVar));
    }

    public final String g(long j10) {
        String a10 = a();
        String b10 = b();
        String c10 = c();
        int i10 = this.f14576b.f12517a;
        if (i10 == 0) {
            StringBuilder r10 = android.support.v4.media.a.r("(", "media_type", "=?", c10, " OR ");
            r10.append("media_type");
            r10.append("=? AND ");
            r10.append(a10);
            r10.append(") AND ");
            if (j10 == -1) {
                r10.append(b10);
                return r10.toString();
            }
            r10.append("bucket_id");
            r10.append("=? AND ");
            r10.append(b10);
            return r10.toString();
        } else if (i10 == 1) {
            StringBuilder w9 = b0.w("(", "media_type", "=?");
            if (j10 == -1) {
                w9.append(c10);
                w9.append(") AND ");
                w9.append(b10);
                return w9.toString();
            }
            w9.append(c10);
            w9.append(") AND ");
            w9.append("bucket_id");
            w9.append("=? AND ");
            w9.append(b10);
            return w9.toString();
        } else if (i10 == 2) {
            StringBuilder r11 = android.support.v4.media.a.r("(", "media_type", "=?", c10, " AND ");
            r11.append(a10);
            r11.append(") AND ");
            if (j10 == -1) {
                r11.append(b10);
                return r11.toString();
            }
            r11.append("bucket_id");
            r11.append("=? AND ");
            r11.append(b10);
            return r11.toString();
        } else if (i10 != 3) {
            return null;
        } else {
            StringBuilder r12 = android.support.v4.media.a.r("(", "media_type", "=?", c10, " AND ");
            r12.append(a10);
            r12.append(") AND ");
            if (j10 == -1) {
                r12.append(b10);
                return r12.toString();
            }
            r12.append("bucket_id");
            r12.append("=? AND ");
            r12.append(b10);
            return r12.toString();
        }
    }

    public final String[] h(long j10) {
        int i10 = this.f14576b.f12517a;
        if (i10 != 0) {
            if (i10 == 1) {
                return i(1, j10);
            }
            if (i10 == 2) {
                return i(3, j10);
            }
            if (i10 != 3) {
                return null;
            }
            return i(2, j10);
        } else if (j10 == -1) {
            return new String[]{String.valueOf(1), String.valueOf(3)};
        } else {
            return new String[]{String.valueOf(1), String.valueOf(3), j7.a.E0(Long.valueOf(j10))};
        }
    }

    public final String j() {
        if (TextUtils.isEmpty(this.f14576b.F)) {
            return "date_modified DESC";
        }
        return this.f14576b.F;
    }

    public final boolean k() {
        if (i.a()) {
            return true;
        }
        this.f14576b.getClass();
        return false;
    }
}
