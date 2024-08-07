package fb;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import i1.p;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CommonNotificationBuilder */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f10126a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: CommonNotificationBuilder */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final p f10127a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10128b;

        public a(p pVar, String str) {
            this.f10127a = pVar;
            this.f10128b = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x025f A[SYNTHETIC, Splitter:B:109:0x025f] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0270 A[SYNTHETIC, Splitter:B:114:0x0270] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0308 A[SYNTHETIC, Splitter:B:150:0x0308] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static fb.e.a a(android.content.Context r13, fb.r r14) {
        /*
            android.content.pm.PackageManager r0 = r13.getPackageManager()
            java.lang.String r1 = r13.getPackageName()
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r0 == 0) goto L_0x0019
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0015:
            r0 = move-exception
            r0.toString()
        L_0x0019:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
        L_0x001b:
            java.lang.String r1 = "gcm.n.android_channel_id"
            java.lang.String r1 = r14.i(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 0
            r5 = 0
            if (r2 >= r3) goto L_0x002a
            goto L_0x008e
        L_0x002a:
            android.content.pm.PackageManager r2 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.String r6 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r6, r5)     // Catch:{ NameNotFoundException -> 0x008e }
            int r2 = r2.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x008e }
            if (r2 >= r3) goto L_0x003b
            goto L_0x008e
        L_0x003b:
            java.lang.Class<android.app.NotificationManager> r2 = android.app.NotificationManager.class
            java.lang.Object r2 = r13.getSystemService(r2)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0050
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r1)
            if (r3 == 0) goto L_0x0050
            goto L_0x008f
        L_0x0050:
            java.lang.String r1 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r1 = r0.getString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0063
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r1)
            if (r3 == 0) goto L_0x0063
            goto L_0x008f
        L_0x0063:
            java.lang.String r1 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r1)
            if (r3 != 0) goto L_0x008f
            android.content.res.Resources r3 = r13.getResources()
            java.lang.String r6 = r13.getPackageName()
            java.lang.String r7 = "fcm_fallback_notification_channel_label"
            java.lang.String r8 = "string"
            int r3 = r3.getIdentifier(r7, r8, r6)
            if (r3 != 0) goto L_0x0080
            java.lang.String r3 = "Misc"
            goto L_0x0084
        L_0x0080:
            java.lang.String r3 = r13.getString(r3)
        L_0x0084:
            android.app.NotificationChannel r6 = new android.app.NotificationChannel
            r7 = 3
            r6.<init>(r1, r3, r7)
            r2.createNotificationChannel(r6)
            goto L_0x008f
        L_0x008e:
            r1 = r4
        L_0x008f:
            java.lang.String r2 = r13.getPackageName()
            android.content.res.Resources r3 = r13.getResources()
            android.content.pm.PackageManager r6 = r13.getPackageManager()
            i1.p r7 = new i1.p
            r7.<init>(r13, r1)
            java.lang.String r1 = "gcm.n.title"
            java.lang.String r1 = r14.h(r3, r2, r1)
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 != 0) goto L_0x00b2
            java.lang.CharSequence r1 = i1.p.b(r1)
            r7.f10974e = r1
        L_0x00b2:
            java.lang.String r1 = "gcm.n.body"
            java.lang.String r1 = r14.h(r3, r2, r1)
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 != 0) goto L_0x00d2
            java.lang.CharSequence r8 = i1.p.b(r1)
            r7.f10975f = r8
            i1.o r8 = new i1.o
            r8.<init>()
            java.lang.CharSequence r1 = i1.p.b(r1)
            r8.f10969b = r1
            r7.f(r8)
        L_0x00d2:
            java.lang.String r1 = "gcm.n.icon"
            java.lang.String r1 = r14.i(r1)
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 != 0) goto L_0x00fc
            java.lang.String r8 = "drawable"
            int r8 = r3.getIdentifier(r1, r8, r2)
            if (r8 == 0) goto L_0x00ed
            boolean r9 = b(r3, r8)
            if (r9 == 0) goto L_0x00ed
            goto L_0x0121
        L_0x00ed:
            java.lang.String r8 = "mipmap"
            int r8 = r3.getIdentifier(r1, r8, r2)
            if (r8 == 0) goto L_0x00fc
            boolean r1 = b(r3, r8)
            if (r1 == 0) goto L_0x00fc
            goto L_0x0121
        L_0x00fc:
            java.lang.String r1 = "com.google.firebase.messaging.default_notification_icon"
            int r1 = r0.getInt(r1, r5)
            if (r1 == 0) goto L_0x010a
            boolean r8 = b(r3, r1)
            if (r8 != 0) goto L_0x0115
        L_0x010a:
            android.content.pm.ApplicationInfo r8 = r6.getApplicationInfo(r2, r5)     // Catch:{ NameNotFoundException -> 0x0111 }
            int r1 = r8.icon     // Catch:{ NameNotFoundException -> 0x0111 }
            goto L_0x0115
        L_0x0111:
            r8 = move-exception
            r8.toString()
        L_0x0115:
            if (r1 == 0) goto L_0x011d
            boolean r8 = b(r3, r1)
            if (r8 != 0) goto L_0x0120
        L_0x011d:
            r1 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x0120:
            r8 = r1
        L_0x0121:
            android.app.Notification r1 = r7.f10992w
            r1.icon = r8
            java.lang.String r1 = "gcm.n.sound2"
            java.lang.String r1 = r14.i(r1)
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto L_0x0137
            java.lang.String r1 = "gcm.n.sound"
            java.lang.String r1 = r14.i(r1)
        L_0x0137:
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            r9 = 2
            if (r8 == 0) goto L_0x0140
            r1 = r4
            goto L_0x0172
        L_0x0140:
            java.lang.String r8 = "default"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x016e
            java.lang.String r8 = "raw"
            int r3 = r3.getIdentifier(r1, r8, r2)
            if (r3 == 0) goto L_0x016e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "android.resource://"
            r3.append(r8)
            r3.append(r2)
            java.lang.String r8 = "/raw/"
            r3.append(r8)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L_0x0172
        L_0x016e:
            android.net.Uri r1 = android.media.RingtoneManager.getDefaultUri(r9)
        L_0x0172:
            if (r1 == 0) goto L_0x0177
            r7.e(r1)
        L_0x0177:
            java.lang.String r1 = "gcm.n.click_action"
            java.lang.String r1 = r14.i(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0191
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r1)
            r3.setPackage(r2)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r1)
            goto L_0x01a9
        L_0x0191:
            android.net.Uri r1 = r14.e()
            if (r1 == 0) goto L_0x01a5
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r3.<init>(r6)
            r3.setPackage(r2)
            r3.setData(r1)
            goto L_0x01a9
        L_0x01a5:
            android.content.Intent r3 = r6.getLaunchIntentForPackage(r2)
        L_0x01a9:
            r1 = 1140850688(0x44000000, float:512.0)
            java.lang.String r2 = "google.c.a.e"
            r6 = 1
            if (r3 != 0) goto L_0x01b2
            r3 = r4
            goto L_0x0212
        L_0x01b2:
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r8)
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r10 = r14.f10163a
            r8.<init>(r10)
            android.os.Bundle r10 = r14.f10163a
            java.util.Set r10 = r10.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x01c8:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01f6
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "google.c."
            boolean r12 = r11.startsWith(r12)
            if (r12 != 0) goto L_0x01ef
            java.lang.String r12 = "gcm.n."
            boolean r12 = r11.startsWith(r12)
            if (r12 != 0) goto L_0x01ef
            java.lang.String r12 = "gcm.notification."
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x01ed
            goto L_0x01ef
        L_0x01ed:
            r12 = r5
            goto L_0x01f0
        L_0x01ef:
            r12 = r6
        L_0x01f0:
            if (r12 == 0) goto L_0x01c8
            r8.remove(r11)
            goto L_0x01c8
        L_0x01f6:
            r3.putExtras(r8)
            boolean r8 = r14.a(r2)
            if (r8 == 0) goto L_0x0208
            android.os.Bundle r8 = r14.l()
            java.lang.String r10 = "gcm.n.analytics_data"
            r3.putExtra(r10, r8)
        L_0x0208:
            java.util.concurrent.atomic.AtomicInteger r8 = f10126a
            int r8 = r8.incrementAndGet()
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r13, r8, r3, r1)
        L_0x0212:
            r7.f10976g = r3
            boolean r2 = r14.a(r2)
            if (r2 != 0) goto L_0x021c
            r1 = r4
            goto L_0x024d
        L_0x021c:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r2.<init>(r3)
            android.os.Bundle r3 = r14.l()
            android.content.Intent r2 = r2.putExtras(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = f10126a
            int r3 = r3.incrementAndGet()
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r10 = "com.google.firebase.MESSAGING_EVENT"
            r8.<init>(r10)
            android.content.ComponentName r10 = new android.content.ComponentName
            java.lang.String r11 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            r10.<init>(r13, r11)
            android.content.Intent r8 = r8.setComponent(r10)
            java.lang.String r10 = "wrapped_intent"
            android.content.Intent r2 = r8.putExtra(r10, r2)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r13, r3, r2, r1)
        L_0x024d:
            if (r1 == 0) goto L_0x0253
            android.app.Notification r2 = r7.f10992w
            r2.deleteIntent = r1
        L_0x0253:
            java.lang.String r1 = "gcm.n.color"
            java.lang.String r1 = r14.i(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0268
            int r1 = android.graphics.Color.parseColor(r1)     // Catch:{ IllegalArgumentException -> 0x0268 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0268 }
            goto L_0x027a
        L_0x0268:
            java.lang.String r1 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r0.getInt(r1, r5)
            if (r0 == 0) goto L_0x0279
            int r13 = k1.a.getColor(r13, r0)     // Catch:{ NotFoundException -> 0x0279 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NotFoundException -> 0x0279 }
            goto L_0x027a
        L_0x0279:
            r13 = r4
        L_0x027a:
            if (r13 == 0) goto L_0x0282
            int r13 = r13.intValue()
            r7.f10987r = r13
        L_0x0282:
            java.lang.String r13 = "gcm.n.sticky"
            boolean r13 = r14.a(r13)
            r13 = r13 ^ r6
            r0 = 16
            r7.c(r0, r13)
            java.lang.String r13 = "gcm.n.local_only"
            boolean r13 = r14.a(r13)
            r7.f10985p = r13
            java.lang.String r13 = "gcm.n.ticker"
            java.lang.String r13 = r14.i(r13)
            if (r13 == 0) goto L_0x02a6
            android.app.Notification r0 = r7.f10992w
            java.lang.CharSequence r13 = i1.p.b(r13)
            r0.tickerText = r13
        L_0x02a6:
            java.lang.String r13 = "gcm.n.notification_priority"
            java.lang.Integer r13 = r14.b(r13)
            r0 = -2
            if (r13 != 0) goto L_0x02b0
            goto L_0x02bc
        L_0x02b0:
            int r1 = r13.intValue()
            if (r1 < r0) goto L_0x02bc
            int r1 = r13.intValue()
            if (r1 <= r9) goto L_0x02bd
        L_0x02bc:
            r13 = r4
        L_0x02bd:
            if (r13 == 0) goto L_0x02c5
            int r13 = r13.intValue()
            r7.f10981l = r13
        L_0x02c5:
            java.lang.String r13 = "gcm.n.visibility"
            java.lang.Integer r13 = r14.b(r13)
            if (r13 != 0) goto L_0x02ce
            goto L_0x02db
        L_0x02ce:
            int r1 = r13.intValue()
            r2 = -1
            if (r1 < r2) goto L_0x02db
            int r1 = r13.intValue()
            if (r1 <= r6) goto L_0x02dc
        L_0x02db:
            r13 = r4
        L_0x02dc:
            if (r13 == 0) goto L_0x02e4
            int r13 = r13.intValue()
            r7.f10988s = r13
        L_0x02e4:
            java.lang.String r13 = "gcm.n.notification_count"
            java.lang.Integer r13 = r14.b(r13)
            if (r13 != 0) goto L_0x02ed
            goto L_0x02f3
        L_0x02ed:
            int r1 = r13.intValue()
            if (r1 >= 0) goto L_0x02f4
        L_0x02f3:
            r13 = r4
        L_0x02f4:
            if (r13 == 0) goto L_0x02fc
            int r13 = r13.intValue()
            r7.f10980k = r13
        L_0x02fc:
            java.lang.String r13 = "gcm.n.event_time"
            java.lang.String r1 = r14.i(r13)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0314
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0311 }
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0311 }
            goto L_0x0314
        L_0x0311:
            fb.r.m(r13)
        L_0x0314:
            if (r4 == 0) goto L_0x0320
            r7.f10982m = r6
            long r1 = r4.longValue()
            android.app.Notification r13 = r7.f10992w
            r13.when = r1
        L_0x0320:
            long[] r13 = r14.j()
            if (r13 == 0) goto L_0x032a
            android.app.Notification r1 = r7.f10992w
            r1.vibrate = r13
        L_0x032a:
            int[] r13 = r14.d()
            if (r13 == 0) goto L_0x0349
            r1 = r13[r5]
            r2 = r13[r6]
            r13 = r13[r9]
            android.app.Notification r3 = r7.f10992w
            r3.ledARGB = r1
            r3.ledOnMS = r2
            r3.ledOffMS = r13
            if (r2 == 0) goto L_0x0343
            if (r13 == 0) goto L_0x0343
            r5 = r6
        L_0x0343:
            int r13 = r3.flags
            r13 = r13 & r0
            r13 = r13 | r5
            r3.flags = r13
        L_0x0349:
            java.lang.String r13 = "gcm.n.default_sound"
            boolean r13 = r14.a(r13)
            java.lang.String r0 = "gcm.n.default_vibrate_timings"
            boolean r0 = r14.a(r0)
            if (r0 == 0) goto L_0x0359
            r13 = r13 | 2
        L_0x0359:
            java.lang.String r0 = "gcm.n.default_light_settings"
            boolean r0 = r14.a(r0)
            if (r0 == 0) goto L_0x0363
            r13 = r13 | 4
        L_0x0363:
            android.app.Notification r0 = r7.f10992w
            r0.defaults = r13
            r13 = r13 & 4
            if (r13 == 0) goto L_0x0370
            int r13 = r0.flags
            r13 = r13 | r6
            r0.flags = r13
        L_0x0370:
            fb.e$a r13 = new fb.e$a
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r14 = r14.i(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x037f
            goto L_0x0390
        L_0x037f:
            java.lang.String r14 = "FCM-Notification:"
            java.lang.StringBuilder r14 = android.support.v4.media.a.q(r14)
            long r0 = android.os.SystemClock.uptimeMillis()
            r14.append(r0)
            java.lang.String r14 = r14.toString()
        L_0x0390:
            r13.<init>(r7, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.e.a(android.content.Context, fb.r):fb.e$a");
    }

    @TargetApi(26)
    public static boolean b(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(i10, (Resources.Theme) null) instanceof AdaptiveIconDrawable) {
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
