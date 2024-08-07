package mj;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import g.a;
import io.github.g00fy2.quickie.QRScannerActivity;
import io.github.g00fy2.quickie.config.ParcelableScannerConfig;
import nj.b;
import sk.j;

/* compiled from: ScanCustomCode.kt */
public final class m extends a<b, e> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        b bVar = (b) obj;
        j.f(componentActivity, "context");
        j.f(bVar, "input");
        Intent intent = new Intent(componentActivity, QRScannerActivity.class);
        intent.putExtra("quickie-config", new ParcelableScannerConfig(bVar.f21725a, bVar.f21726b, bVar.f21727c, bVar.f21728d, bVar.f21729e, bVar.f21730f, bVar.f21731g, bVar.f21732h));
        return intent;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: oj.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: oj.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: oj.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: oj.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: oj.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: oj.a$a} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v1, types: [oj.a] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r5v45, types: [oj.a$d] */
    /* JADX WARNING: type inference failed for: r5v46, types: [oj.a$i] */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: type inference failed for: r5v47, types: [oj.a$c] */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e6, code lost:
        if (r3 == null) goto L_0x02eb;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(android.content.Intent r25, int r26) {
        /*
            r24 = this;
            r0 = r25
            r1 = r26
            r2 = -1
            r3 = 2
            if (r1 == r2) goto L_0x0046
            if (r1 == 0) goto L_0x0042
            if (r1 == r3) goto L_0x003e
            r2 = 3
            if (r1 == r2) goto L_0x0021
            mj.e$a r0 = new mj.e$a
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unknown activity result code "
            java.lang.String r1 = android.support.v4.media.a.m(r3, r1)
            r2.<init>(r1)
            r0.<init>(r2)
            goto L_0x02f5
        L_0x0021:
            mj.e$a r1 = new mj.e$a
            if (r0 == 0) goto L_0x0031
            java.lang.Class<java.lang.Exception> r2 = java.lang.Exception.class
            java.lang.String r3 = "quickie-exception"
            java.lang.Object r0 = k1.b.a(r0, r3, r2)
            java.lang.Exception r0 = (java.lang.Exception) r0
            if (r0 != 0) goto L_0x0038
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Could retrieve root exception"
            r0.<init>(r2)
        L_0x0038:
            r1.<init>(r0)
            r0 = r1
            goto L_0x02f5
        L_0x003e:
            mj.e$b r0 = mj.e.b.f21558a
            goto L_0x02f5
        L_0x0042:
            mj.e$d r0 = mj.e.d.f21560a
            goto L_0x02f5
        L_0x0046:
            mj.e$c r1 = new mj.e$c
            r2 = 0
            if (r0 == 0) goto L_0x0052
            java.lang.String r4 = "quickie-bytes"
            byte[] r4 = r0.getByteArrayExtra(r4)
            goto L_0x0053
        L_0x0052:
            r4 = r2
        L_0x0053:
            if (r0 == 0) goto L_0x005d
            java.lang.String r5 = "quickie-value"
            java.lang.String r5 = r0.getStringExtra(r5)
            r15 = r5
            goto L_0x005e
        L_0x005d:
            r15 = r2
        L_0x005e:
            if (r0 == 0) goto L_0x02e9
            android.os.Bundle r5 = r25.getExtras()
            if (r5 == 0) goto L_0x0072
            r6 = 0
            java.lang.String r7 = "quickie-type"
            int r5 = r5.getInt(r7, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0073
        L_0x0072:
            r5 = r2
        L_0x0073:
            r6 = 1
            r7 = 10
            java.lang.String r8 = "quickie-parcelable"
            if (r5 != 0) goto L_0x007c
            goto L_0x017e
        L_0x007c:
            int r9 = r5.intValue()
            if (r9 != r6) goto L_0x017e
            java.lang.Class<io.github.g00fy2.quickie.content.ContactInfoParcelable> r3 = io.github.g00fy2.quickie.content.ContactInfoParcelable.class
            java.lang.Object r0 = k1.b.a(r0, r8, r3)
            io.github.g00fy2.quickie.content.ContactInfoParcelable r0 = (io.github.g00fy2.quickie.content.ContactInfoParcelable) r0
            if (r0 == 0) goto L_0x01b5
            java.util.List<io.github.g00fy2.quickie.content.AddressParcelable> r2 = r0.f20745a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = fk.j.H0(r2)
            r3.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x009b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00c7
            java.lang.Object r5 = r2.next()
            io.github.g00fy2.quickie.content.AddressParcelable r5 = (io.github.g00fy2.quickie.content.AddressParcelable) r5
            java.util.List<java.lang.String> r6 = r5.f20729a
            lk.b r7 = oj.a.b.C0296a.C0297a.f21849c
            int r5 = r5.f20730b
            if (r5 < 0) goto L_0x00ba
            int r8 = j7.a.I(r7)
            if (r5 > r8) goto L_0x00ba
            java.lang.Object r5 = r7.get(r5)
            goto L_0x00bc
        L_0x00ba:
            oj.a$b$a$a r5 = oj.a.b.C0296a.C0297a.UNKNOWN
        L_0x00bc:
            oj.a$b$a$a r5 = (oj.a.b.C0296a.C0297a) r5
            oj.a$b$a r7 = new oj.a$b$a
            r7.<init>(r6, r5)
            r3.add(r7)
            goto L_0x009b
        L_0x00c7:
            java.util.List<io.github.g00fy2.quickie.content.EmailParcelable> r2 = r0.f20746b
            java.util.ArrayList r12 = new java.util.ArrayList
            int r5 = fk.j.H0(r2)
            r12.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x00d6:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x010a
            java.lang.Object r5 = r2.next()
            io.github.g00fy2.quickie.content.EmailParcelable r5 = (io.github.g00fy2.quickie.content.EmailParcelable) r5
            java.lang.String r8 = r5.f20752a
            java.lang.String r9 = r5.f20753b
            java.lang.String r10 = r5.f20754c
            lk.b r6 = oj.a.c.C0299a.f21865c
            int r5 = r5.f20755d
            if (r5 < 0) goto L_0x00f9
            int r7 = j7.a.I(r6)
            if (r5 > r7) goto L_0x00f9
            java.lang.Object r5 = r6.get(r5)
            goto L_0x00fb
        L_0x00f9:
            oj.a$c$a r5 = oj.a.c.C0299a.UNKNOWN
        L_0x00fb:
            r11 = r5
            oj.a$c$a r11 = (oj.a.c.C0299a) r11
            oj.a$c r13 = new oj.a$c
            r5 = r13
            r6 = r4
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.add(r13)
            goto L_0x00d6
        L_0x010a:
            io.github.g00fy2.quickie.content.PersonNameParcelable r2 = r0.f20747c
            oj.a$b$b r10 = new oj.a$b$b
            java.lang.String r5 = r2.f20758a
            java.lang.String r6 = r2.f20759b
            java.lang.String r7 = r2.f20760c
            java.lang.String r8 = r2.f20761d
            java.lang.String r9 = r2.f20762e
            java.lang.String r11 = r2.f20763f
            java.lang.String r2 = r2.f20764n
            r16 = r10
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r11
            r23 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r11 = r0.f20748d
            java.util.List<io.github.g00fy2.quickie.content.PhoneParcelable> r2 = r0.f20749e
            java.util.ArrayList r13 = new java.util.ArrayList
            int r5 = fk.j.H0(r2)
            r13.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x0140:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x016c
            java.lang.Object r5 = r2.next()
            io.github.g00fy2.quickie.content.PhoneParcelable r5 = (io.github.g00fy2.quickie.content.PhoneParcelable) r5
            java.lang.String r6 = r5.f20765a
            lk.b r7 = oj.a.e.C0300a.f21876c
            int r5 = r5.f20766b
            if (r5 < 0) goto L_0x015f
            int r8 = j7.a.I(r7)
            if (r5 > r8) goto L_0x015f
            java.lang.Object r5 = r7.get(r5)
            goto L_0x0161
        L_0x015f:
            oj.a$e$a r5 = oj.a.e.C0300a.UNKNOWN
        L_0x0161:
            oj.a$e$a r5 = (oj.a.e.C0300a) r5
            oj.a$e r7 = new oj.a$e
            r7.<init>(r4, r15, r6, r5)
            r13.add(r7)
            goto L_0x0140
        L_0x016c:
            java.lang.String r2 = r0.f20750f
            java.util.List<java.lang.String> r14 = r0.f20751n
            oj.a$b r0 = new oj.a$b
            r5 = r0
            r6 = r4
            r7 = r15
            r8 = r3
            r9 = r12
            r12 = r13
            r13 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = r0
            goto L_0x01b5
        L_0x017e:
            if (r5 != 0) goto L_0x0181
            goto L_0x01b9
        L_0x0181:
            int r6 = r5.intValue()
            if (r6 != r3) goto L_0x01b9
            java.lang.Class<io.github.g00fy2.quickie.content.EmailParcelable> r3 = io.github.g00fy2.quickie.content.EmailParcelable.class
            java.lang.Object r0 = k1.b.a(r0, r8, r3)
            io.github.g00fy2.quickie.content.EmailParcelable r0 = (io.github.g00fy2.quickie.content.EmailParcelable) r0
            if (r0 == 0) goto L_0x01b5
            java.lang.String r8 = r0.f20752a
            java.lang.String r9 = r0.f20753b
            java.lang.String r10 = r0.f20754c
            lk.b r2 = oj.a.c.C0299a.f21865c
            int r0 = r0.f20755d
            if (r0 < 0) goto L_0x01a8
            int r3 = j7.a.I(r2)
            if (r0 > r3) goto L_0x01a8
            java.lang.Object r0 = r2.get(r0)
            goto L_0x01aa
        L_0x01a8:
            oj.a$c$a r0 = oj.a.c.C0299a.UNKNOWN
        L_0x01aa:
            r11 = r0
            oj.a$c$a r11 = (oj.a.c.C0299a) r11
            oj.a$c r2 = new oj.a$c
            r5 = r2
            r6 = r4
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x01b5:
            r26 = r1
            goto L_0x02e5
        L_0x01b9:
            r3 = 4
            if (r5 != 0) goto L_0x01bd
            goto L_0x01ed
        L_0x01bd:
            int r6 = r5.intValue()
            if (r6 != r3) goto L_0x01ed
            java.lang.Class<io.github.g00fy2.quickie.content.PhoneParcelable> r3 = io.github.g00fy2.quickie.content.PhoneParcelable.class
            java.lang.Object r0 = k1.b.a(r0, r8, r3)
            io.github.g00fy2.quickie.content.PhoneParcelable r0 = (io.github.g00fy2.quickie.content.PhoneParcelable) r0
            if (r0 == 0) goto L_0x01b5
            java.lang.String r2 = r0.f20765a
            lk.b r3 = oj.a.e.C0300a.f21876c
            int r0 = r0.f20766b
            if (r0 < 0) goto L_0x01e0
            int r5 = j7.a.I(r3)
            if (r0 > r5) goto L_0x01e0
            java.lang.Object r0 = r3.get(r0)
            goto L_0x01e2
        L_0x01e0:
            oj.a$e$a r0 = oj.a.e.C0300a.UNKNOWN
        L_0x01e2:
            oj.a$e$a r0 = (oj.a.e.C0300a) r0
            oj.a$e r3 = new oj.a$e
            r3.<init>(r4, r15, r2, r0)
            r26 = r1
            goto L_0x02e6
        L_0x01ed:
            r3 = 6
            if (r5 != 0) goto L_0x01f1
            goto L_0x020b
        L_0x01f1:
            int r6 = r5.intValue()
            if (r6 != r3) goto L_0x020b
            java.lang.Class<io.github.g00fy2.quickie.content.SmsParcelable> r3 = io.github.g00fy2.quickie.content.SmsParcelable.class
            java.lang.Object r0 = k1.b.a(r0, r8, r3)
            io.github.g00fy2.quickie.content.SmsParcelable r0 = (io.github.g00fy2.quickie.content.SmsParcelable) r0
            if (r0 == 0) goto L_0x01b5
            oj.a$g r2 = new oj.a$g
            java.lang.String r3 = r0.f20767a
            java.lang.String r0 = r0.f20768b
            r2.<init>(r4, r15, r3, r0)
            goto L_0x01b5
        L_0x020b:
            r3 = 8
            if (r5 != 0) goto L_0x0210
            goto L_0x022a
        L_0x0210:
            int r6 = r5.intValue()
            if (r6 != r3) goto L_0x022a
            java.lang.Class<io.github.g00fy2.quickie.content.UrlBookmarkParcelable> r3 = io.github.g00fy2.quickie.content.UrlBookmarkParcelable.class
            java.lang.Object r0 = k1.b.a(r0, r8, r3)
            io.github.g00fy2.quickie.content.UrlBookmarkParcelable r0 = (io.github.g00fy2.quickie.content.UrlBookmarkParcelable) r0
            if (r0 == 0) goto L_0x01b5
            oj.a$h r2 = new oj.a$h
            java.lang.String r3 = r0.f20769a
            java.lang.String r0 = r0.f20770b
            r2.<init>(r4, r15, r3, r0)
            goto L_0x01b5
        L_0x022a:
            r3 = 9
            if (r5 != 0) goto L_0x022f
            goto L_0x024f
        L_0x022f:
            int r6 = r5.intValue()
            if (r6 != r3) goto L_0x024f
            java.lang.Class<io.github.g00fy2.quickie.content.WifiParcelable> r3 = io.github.g00fy2.quickie.content.WifiParcelable.class
            java.lang.Object r0 = k1.b.a(r0, r8, r3)
            io.github.g00fy2.quickie.content.WifiParcelable r0 = (io.github.g00fy2.quickie.content.WifiParcelable) r0
            if (r0 == 0) goto L_0x01b5
            oj.a$i r2 = new oj.a$i
            int r8 = r0.f20771a
            java.lang.String r9 = r0.f20772b
            java.lang.String r10 = r0.f20773c
            r5 = r2
            r6 = r4
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x01b5
        L_0x024f:
            if (r5 != 0) goto L_0x0252
            goto L_0x0270
        L_0x0252:
            int r3 = r5.intValue()
            if (r3 != r7) goto L_0x0270
            java.lang.Class<io.github.g00fy2.quickie.content.GeoPointParcelable> r3 = io.github.g00fy2.quickie.content.GeoPointParcelable.class
            java.lang.Object r0 = k1.b.a(r0, r8, r3)
            io.github.g00fy2.quickie.content.GeoPointParcelable r0 = (io.github.g00fy2.quickie.content.GeoPointParcelable) r0
            if (r0 == 0) goto L_0x01b5
            oj.a$d r2 = new oj.a$d
            double r8 = r0.f20756a
            double r10 = r0.f20757b
            r5 = r2
            r6 = r4
            r7 = r15
            r5.<init>(r6, r7, r8, r10)
            goto L_0x01b5
        L_0x0270:
            r3 = 11
            if (r5 != 0) goto L_0x0276
            goto L_0x01b5
        L_0x0276:
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x01b5
            java.lang.Class<io.github.g00fy2.quickie.content.CalendarEventParcelable> r3 = io.github.g00fy2.quickie.content.CalendarEventParcelable.class
            java.lang.Object r0 = k1.b.a(r0, r8, r3)
            io.github.g00fy2.quickie.content.CalendarEventParcelable r0 = (io.github.g00fy2.quickie.content.CalendarEventParcelable) r0
            if (r0 == 0) goto L_0x01b5
            oj.a$a r3 = new oj.a$a
            java.lang.String r8 = r0.f20738a
            io.github.g00fy2.quickie.content.CalendarDateTimeParcelable r2 = r0.f20739b
            oj.a$a$a r9 = new oj.a$a$a
            int r5 = r2.f20731a
            int r6 = r2.f20732b
            int r7 = r2.f20733c
            int r10 = r2.f20734d
            int r11 = r2.f20735e
            int r12 = r2.f20736f
            boolean r2 = r2.f20737n
            r16 = r9
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r10 = r0.f20740c
            java.lang.String r11 = r0.f20741d
            io.github.g00fy2.quickie.content.CalendarDateTimeParcelable r2 = r0.f20742e
            oj.a$a$a r12 = new oj.a$a$a
            int r5 = r2.f20731a
            int r6 = r2.f20732b
            int r7 = r2.f20733c
            int r13 = r2.f20734d
            int r14 = r2.f20735e
            r26 = r1
            int r1 = r2.f20736f
            boolean r2 = r2.f20737n
            r16 = r12
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r14
            r22 = r1
            r23 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r13 = r0.f20743f
            java.lang.String r14 = r0.f20744n
            r5 = r3
            r6 = r4
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x02e6
        L_0x02e5:
            r3 = r2
        L_0x02e6:
            if (r3 != 0) goto L_0x02f0
            goto L_0x02eb
        L_0x02e9:
            r26 = r1
        L_0x02eb:
            oj.a$f r3 = new oj.a$f
            r3.<init>(r4, r15)
        L_0x02f0:
            r0 = r26
            r0.<init>(r3)
        L_0x02f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.m.c(android.content.Intent, int):java.lang.Object");
    }
}
