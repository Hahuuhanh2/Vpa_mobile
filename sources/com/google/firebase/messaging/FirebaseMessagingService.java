package com.google.firebase.messaging;

import android.content.Intent;
import fb.v;
import java.util.ArrayDeque;

public class FirebaseMessagingService extends EnhancedIntentService {

    /* renamed from: n  reason: collision with root package name */
    public static final ArrayDeque f7601n = new ArrayDeque(10);

    public final Intent b(Intent intent) {
        return (Intent) v.a().f10171d.poll();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Intent r27) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            java.lang.String r2 = r27.getAction()
            java.lang.String r3 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r3 = r3.equals(r2)
            java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            if (r3 != 0) goto L_0x0031
            boolean r3 = r4.equals(r2)
            if (r3 == 0) goto L_0x0019
            goto L_0x0031
        L_0x0019:
            java.lang.String r3 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = "token"
            java.lang.String r0 = r0.getStringExtra(r2)
            r1.f(r0)
            goto L_0x02ce
        L_0x002c:
            r27.getAction()
            goto L_0x02ce
        L_0x0031:
            java.lang.String r2 = "google.message_id"
            java.lang.String r3 = r0.getStringExtra(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            r6 = 0
            r7 = 1
            r8 = 3
            if (r5 == 0) goto L_0x0041
            goto L_0x005e
        L_0x0041:
            java.util.ArrayDeque r5 = f7601n
            boolean r9 = r5.contains(r3)
            if (r9 == 0) goto L_0x0050
            java.lang.String r3 = "FirebaseMessaging"
            android.util.Log.isLoggable(r3, r8)
            r3 = r7
            goto L_0x005f
        L_0x0050:
            int r9 = r5.size()
            r10 = 10
            if (r9 < r10) goto L_0x005b
            r5.remove()
        L_0x005b:
            r5.add(r3)
        L_0x005e:
            r3 = r6
        L_0x005f:
            if (r3 != 0) goto L_0x02ce
            java.lang.String r3 = "message_type"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r5 = "gcm"
            if (r3 != 0) goto L_0x006c
            r3 = r5
        L_0x006c:
            r9 = -1
            int r10 = r3.hashCode()
            r11 = 2
            switch(r10) {
                case -2062414158: goto L_0x0095;
                case 102161: goto L_0x008c;
                case 814694033: goto L_0x0081;
                case 814800675: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x009f
        L_0x0076:
            java.lang.String r5 = "send_event"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x007f
            goto L_0x009f
        L_0x007f:
            r9 = r8
            goto L_0x009f
        L_0x0081:
            java.lang.String r5 = "send_error"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x008a
            goto L_0x009f
        L_0x008a:
            r9 = r11
            goto L_0x009f
        L_0x008c:
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0093
            goto L_0x009f
        L_0x0093:
            r9 = r7
            goto L_0x009f
        L_0x0095:
            java.lang.String r5 = "deleted_messages"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r9 = r6
        L_0x009f:
            java.lang.String r3 = "message_id"
            if (r9 == r7) goto L_0x00c4
            if (r9 == r11) goto L_0x00ae
            if (r9 == r8) goto L_0x00a9
            goto L_0x02ce
        L_0x00a9:
            r0.getStringExtra(r2)
            goto L_0x02ce
        L_0x00ae:
            java.lang.String r2 = r0.getStringExtra(r2)
            if (r2 != 0) goto L_0x00b7
            r0.getStringExtra(r3)
        L_0x00b7:
            com.google.firebase.messaging.SendException r2 = new com.google.firebase.messaging.SendException
            java.lang.String r3 = "error"
            java.lang.String r0 = r0.getStringExtra(r3)
            r2.<init>(r0)
            goto L_0x02ce
        L_0x00c4:
            boolean r5 = fb.p.b(r27)
            if (r5 == 0) goto L_0x00d3
            android.os.Bundle r5 = r27.getExtras()
            java.lang.String r8 = "_nr"
            fb.p.a(r5, r8)
        L_0x00d3:
            java.lang.String r5 = r27.getAction()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00de
            goto L_0x0122
        L_0x00de:
            java.lang.String r4 = "delivery_metrics_exported_to_big_query_enabled"
            m9.d.d()     // Catch:{ IllegalStateException -> 0x0122 }
            m9.d r5 = m9.d.d()
            r5.a()
            android.content.Context r5 = r5.f13218a
            java.lang.String r8 = "com.google.firebase.messaging"
            android.content.SharedPreferences r8 = r5.getSharedPreferences(r8, r6)
            java.lang.String r9 = "export_to_big_query"
            boolean r10 = r8.contains(r9)
            if (r10 == 0) goto L_0x00ff
            boolean r4 = r8.getBoolean(r9, r6)
            goto L_0x0123
        L_0x00ff:
            android.content.pm.PackageManager r8 = r5.getPackageManager()     // Catch:{  }
            if (r8 == 0) goto L_0x0122
            java.lang.String r5 = r5.getPackageName()     // Catch:{  }
            r9 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r8.getApplicationInfo(r5, r9)     // Catch:{  }
            if (r5 == 0) goto L_0x0122
            android.os.Bundle r8 = r5.metaData     // Catch:{  }
            if (r8 == 0) goto L_0x0122
            boolean r8 = r8.containsKey(r4)     // Catch:{  }
            if (r8 == 0) goto L_0x0122
            android.os.Bundle r5 = r5.metaData     // Catch:{  }
            boolean r4 = r5.getBoolean(r4, r6)     // Catch:{  }
            goto L_0x0123
        L_0x0122:
            r4 = r6
        L_0x0123:
            if (r4 == 0) goto L_0x0278
            gb.a$a r23 = gb.a.C0112a.MESSAGE_DELIVERED
            c6.g r4 = com.google.firebase.messaging.FirebaseMessaging.f7584n
            if (r4 != 0) goto L_0x012d
            goto L_0x0278
        L_0x012d:
            android.os.Bundle r5 = r27.getExtras()
            if (r5 != 0) goto L_0x0135
            android.os.Bundle r5 = android.os.Bundle.EMPTY
        L_0x0135:
            java.lang.String r8 = ""
            java.lang.String r9 = "google.ttl"
            java.lang.Object r9 = r5.get(r9)
            boolean r10 = r9 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x0148
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r6 = r9.intValue()
            goto L_0x0157
        L_0x0148:
            boolean r10 = r9 instanceof java.lang.String
            if (r10 == 0) goto L_0x0157
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0154 }
            int r6 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0154 }
            goto L_0x0157
        L_0x0154:
            java.util.Objects.toString(r9)
        L_0x0157:
            r21 = r6
            java.lang.String r6 = "google.to"
            java.lang.String r6 = r5.getString(r6)
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 != 0) goto L_0x0168
        L_0x0165:
            r16 = r6
            goto L_0x0181
        L_0x0168:
            m9.d r6 = m9.d.d()     // Catch:{ ExecutionException -> 0x0271, InterruptedException -> 0x026f }
            java.lang.Object r9 = ab.b.f143m     // Catch:{ ExecutionException -> 0x0271, InterruptedException -> 0x026f }
            java.lang.Class<ab.c> r9 = ab.c.class
            java.lang.Object r6 = r6.b(r9)     // Catch:{ ExecutionException -> 0x0271, InterruptedException -> 0x026f }
            ab.b r6 = (ab.b) r6     // Catch:{ ExecutionException -> 0x0271, InterruptedException -> 0x026f }
            com.google.android.gms.tasks.Task r6 = r6.getId()     // Catch:{ ExecutionException -> 0x0271, InterruptedException -> 0x026f }
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6)     // Catch:{ ExecutionException -> 0x0271, InterruptedException -> 0x026f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ExecutionException -> 0x0271, InterruptedException -> 0x026f }
            goto L_0x0165
        L_0x0181:
            m9.d r6 = m9.d.d()
            r6.a()
            android.content.Context r6 = r6.f13218a
            java.lang.String r19 = r6.getPackageName()
            gb.a$c r18 = gb.a.c.ANDROID
            boolean r6 = fb.r.k(r5)
            if (r6 == 0) goto L_0x0199
            gb.a$b r6 = gb.a.b.DISPLAY_NOTIFICATION
            goto L_0x019b
        L_0x0199:
            gb.a$b r6 = gb.a.b.DATA_MESSAGE
        L_0x019b:
            r17 = r6
            java.lang.String r2 = r5.getString(r2)
            if (r2 != 0) goto L_0x01a7
            java.lang.String r2 = r5.getString(r3)
        L_0x01a7:
            if (r2 == 0) goto L_0x01ab
            r15 = r2
            goto L_0x01ac
        L_0x01ab:
            r15 = r8
        L_0x01ac:
            java.lang.String r2 = "from"
            java.lang.String r2 = r5.getString(r2)
            if (r2 == 0) goto L_0x01bd
            java.lang.String r3 = "/topics/"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x01bd
            goto L_0x01be
        L_0x01bd:
            r2 = 0
        L_0x01be:
            if (r2 == 0) goto L_0x01c3
            r22 = r2
            goto L_0x01c5
        L_0x01c3:
            r22 = r8
        L_0x01c5:
            java.lang.String r2 = "collapse_key"
            java.lang.String r2 = r5.getString(r2)
            if (r2 == 0) goto L_0x01d0
            r20 = r2
            goto L_0x01d2
        L_0x01d0:
            r20 = r8
        L_0x01d2:
            java.lang.String r2 = "google.c.a.m_l"
            java.lang.String r2 = r5.getString(r2)
            if (r2 == 0) goto L_0x01dd
            r24 = r2
            goto L_0x01df
        L_0x01dd:
            r24 = r8
        L_0x01df:
            java.lang.String r2 = "google.c.a.c_l"
            java.lang.String r2 = r5.getString(r2)
            if (r2 == 0) goto L_0x01ea
            r25 = r2
            goto L_0x01ec
        L_0x01ea:
            r25 = r8
        L_0x01ec:
            java.lang.String r2 = "google.c.sender.id"
            boolean r3 = r5.containsKey(r2)
            r8 = 0
            if (r3 == 0) goto L_0x01ff
            java.lang.String r2 = r5.getString(r2)     // Catch:{ NumberFormatException -> 0x01ff }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x01ff }
            goto L_0x023e
        L_0x01ff:
            m9.d r2 = m9.d.d()
            r2.a()
            m9.e r3 = r2.f13220c
            java.lang.String r3 = r3.f13235e
            if (r3 == 0) goto L_0x0211
            long r2 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0211 }
            goto L_0x023e
        L_0x0211:
            r2.a()
            m9.e r2 = r2.f13220c
            java.lang.String r2 = r2.f13232b
            java.lang.String r3 = "1:"
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L_0x0225
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x023d }
            goto L_0x023e
        L_0x0225:
            java.lang.String r3 = ":"
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            if (r3 >= r11) goto L_0x022f
            goto L_0x023d
        L_0x022f:
            r2 = r2[r7]
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0238
            goto L_0x023d
        L_0x0238:
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x023d }
            goto L_0x023e
        L_0x023d:
            r2 = r8
        L_0x023e:
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0244
            r13 = r2
            goto L_0x0245
        L_0x0244:
            r13 = r8
        L_0x0245:
            gb.a r2 = new gb.a
            r12 = r2
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r3 = "FCM_CLIENT_EVENT_LOGGING"
            java.lang.String r5 = "proto"
            c6.b r6 = new c6.b     // Catch:{ RuntimeException -> 0x0278 }
            r6.<init>(r5)     // Catch:{ RuntimeException -> 0x0278 }
            kh.h r5 = new kh.h     // Catch:{ RuntimeException -> 0x0278 }
            r7 = 29
            r5.<init>(r7)     // Catch:{ RuntimeException -> 0x0278 }
            f6.u r3 = r4.a(r3, r6, r5)     // Catch:{ RuntimeException -> 0x0278 }
            gb.b r4 = new gb.b     // Catch:{ RuntimeException -> 0x0278 }
            r4.<init>(r2)     // Catch:{ RuntimeException -> 0x0278 }
            c6.a r2 = new c6.a     // Catch:{ RuntimeException -> 0x0278 }
            c6.d r5 = c6.d.DEFAULT     // Catch:{ RuntimeException -> 0x0278 }
            r2.<init>(r4, r5)     // Catch:{ RuntimeException -> 0x0278 }
            r3.a(r2)     // Catch:{ RuntimeException -> 0x0278 }
            goto L_0x0278
        L_0x026f:
            r0 = move-exception
            goto L_0x0272
        L_0x0271:
            r0 = move-exception
        L_0x0272:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x0278:
            android.os.Bundle r2 = r27.getExtras()
            if (r2 != 0) goto L_0x0283
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x0283:
            java.lang.String r3 = "androidx.content.wakelockid"
            r2.remove(r3)
            boolean r3 = fb.r.k(r2)
            if (r3 == 0) goto L_0x02c6
            fb.r r3 = new fb.r
            r3.<init>(r2)
            i7.a r4 = new i7.a
            java.lang.String r5 = "Firebase-Messaging-Network-Io"
            r4.<init>(r5)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor(r4)
            fb.g r5 = new fb.g
            r5.<init>(r1, r3, r4)
            boolean r3 = r5.a()     // Catch:{ all -> 0x02c0 }
            if (r3 == 0) goto L_0x02ad
            r4.shutdown()
            goto L_0x02ce
        L_0x02ad:
            r4.shutdown()
            boolean r3 = fb.p.b(r27)
            if (r3 == 0) goto L_0x02c6
            android.os.Bundle r0 = r27.getExtras()
            java.lang.String r3 = "_nf"
            fb.p.a(r0, r3)
            goto L_0x02c6
        L_0x02c0:
            r0 = move-exception
            r2 = r0
            r4.shutdown()
            throw r2
        L_0x02c6:
            com.google.firebase.messaging.RemoteMessage r0 = new com.google.firebase.messaging.RemoteMessage
            r0.<init>(r2)
            r1.e(r0)
        L_0x02ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }

    public void e(RemoteMessage remoteMessage) {
    }

    public void f(String str) {
    }
}
