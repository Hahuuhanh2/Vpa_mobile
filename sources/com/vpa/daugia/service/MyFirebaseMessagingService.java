package com.vpa.daugia.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import ck.a;
import com.google.firebase.messaging.RemoteMessage;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0537R$mipmap;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.data.model.LastNotification;
import com.vpa.daugia.ui.MainActivity;
import i1.p;
import i1.r;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kf.e;
import lg.b;
import p3.l0;
import sk.j;
import tk.c;
import v0.h;

/* compiled from: MyFirebaseMessagingService.kt */
public final class MyFirebaseMessagingService extends Hilt_MyFirebaseMessagingService {

    /* renamed from: r  reason: collision with root package name */
    public b f19910r;

    /* compiled from: MyFirebaseMessagingService.kt */
    public static final class MyWorker extends Worker {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MyWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            j.f(context, "appContext");
            j.f(workerParameters, "workerParams");
        }

        public final d.a.c f() {
            return new d.a.c();
        }
    }

    static {
        new a();
    }

    public final void e(RemoteMessage remoteMessage) {
        String str;
        boolean z10;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Map<String, String> P0 = remoteMessage.P0();
        j.e(P0, "getData(...)");
        if (!((h) P0).isEmpty()) {
            Objects.toString(remoteMessage.P0());
            int i10 = kf.h.f12560a;
            Intent intent = new Intent("BROADCAST_MAIN");
            intent.putExtra("ACTION_BROADCAST", "NOTIFICATION");
            u2.a.a(this).c(intent);
            e.h(this);
        }
        j.e(remoteMessage.P0(), "getData(...)");
        Intent intent2 = new Intent(this, MainActivity.class);
        RemoteMessage.a Q0 = remoteMessage.Q0();
        String str7 = null;
        if (Q0 != null) {
            str = Q0.f7607c;
        } else {
            str = null;
        }
        if (str == null || yk.h.H0(str)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            LastNotification lastNotification = new LastNotification((String) null, (String) null, (String) null, (String) null, 15, (sk.e) null);
            RemoteMessage.a Q02 = remoteMessage.Q0();
            if (Q02 != null) {
                str2 = Q02.f7607c;
            } else {
                str2 = null;
            }
            lastNotification.setClickAction(str2);
            lastNotification.setValue("");
            RemoteMessage.a Q03 = remoteMessage.Q0();
            if (Q03 != null) {
                str3 = Q03.f7605a;
            } else {
                str3 = null;
            }
            lastNotification.setTitle(str3);
            RemoteMessage.a Q04 = remoteMessage.Q0();
            if (Q04 != null) {
                str4 = Q04.f7606b;
            } else {
                str4 = null;
            }
            lastNotification.setBody(str4);
            b bVar = this.f19910r;
            if (bVar != null) {
                bVar.j(lastNotification, "LAST_NOTIFICATION");
                RemoteMessage.a Q05 = remoteMessage.Q0();
                if (Q05 != null) {
                    str5 = Q05.f7605a;
                } else {
                    str5 = null;
                }
                intent2.putExtra("title", str5);
                RemoteMessage.a Q06 = remoteMessage.Q0();
                if (Q06 != null) {
                    str6 = Q06.f7606b;
                } else {
                    str6 = null;
                }
                intent2.putExtra("body", str6);
                RemoteMessage.a Q07 = remoteMessage.Q0();
                if (Q07 != null) {
                    str7 = Q07.f7607c;
                }
                intent2.putExtra("click_action", str7);
                intent2.putExtra("VALUE", "");
            } else {
                j.l("sharedPrefsHelper");
                throw null;
            }
        }
        String string = getString(C0540R$string.default_notification_channel_id);
        j.e(string, "getString(...)");
        RemoteViews remoteViews = new RemoteViews(getPackageName(), C0535R$layout.notification_small);
        RemoteViews remoteViews2 = new RemoteViews(getPackageName(), C0535R$layout.notification_large);
        RemoteMessage.a Q08 = remoteMessage.Q0();
        j.c(Q08);
        remoteViews2.setTextViewText(C0533R$id.notification_large_title, Q08.f7605a);
        RemoteMessage.a Q09 = remoteMessage.Q0();
        j.c(Q09);
        remoteViews2.setTextViewText(C0533R$id.notification_large_message, Q09.f7606b);
        remoteViews.setImageViewResource(C0533R$id.notification_img, C0531R$drawable.ic_logo);
        Object systemService = getSystemService("notification");
        j.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        intent2.setFlags(268468224);
        Context applicationContext = getApplicationContext();
        vk.h hVar = new vk.h(0, 1000);
        c.a aVar = c.f23024a;
        j.f(aVar, "random");
        try {
            PendingIntent activity = PendingIntent.getActivity(applicationContext, l0.m0(aVar, hVar), intent2, 67108864);
            j.e(activity, "getActivity(...)");
            p pVar = new p(this, string);
            pVar.f10992w.icon = C0537R$mipmap.ic_launcher;
            pVar.c(16, true);
            pVar.f10987r = 0;
            Notification notification = pVar.f10992w;
            notification.ledARGB = 0;
            notification.ledOnMS = 1000;
            notification.ledOffMS = 300;
            notification.flags = (notification.flags & -2) | 1;
            pVar.c(16, true);
            pVar.f10984o = p.b("Thông báo");
            RemoteMessage.a Q010 = remoteMessage.Q0();
            j.c(Q010);
            pVar.f10975f = p.b(Q010.f7606b);
            RemoteMessage.a Q011 = remoteMessage.Q0();
            j.c(Q011);
            pVar.f10979j = p.b(Q011.f7606b);
            RemoteMessage.a Q012 = remoteMessage.Q0();
            j.c(Q012);
            pVar.f10974e = p.b(Q012.f7605a);
            pVar.f10989t = remoteViews2;
            pVar.e(RingtoneManager.getDefaultUri(2));
            Notification notification2 = pVar.f10992w;
            notification2.icon = C0537R$mipmap.ic_launcher;
            pVar.f10981l = 2;
            notification2.defaults = -1;
            notification2.flags |= 1;
            pVar.f10977h = activity;
            pVar.c(128, true);
            pVar.f10976g = activity;
            RemoteMessage.a Q013 = remoteMessage.Q0();
            j.c(Q013);
            pVar.f10992w.tickerText = p.b(Q013.f7605a);
            pVar.f10992w.vibrate = new long[]{100, 200, 300, 400, 500};
            pVar.f(new r());
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(string, "Thông báo VPA", 4);
                notificationChannel.setShowBadge(true);
                notificationChannel.canShowBadge();
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(0);
                notificationChannel.enableVibration(true);
                notificationChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500});
                notificationManager.createNotificationChannel(notificationChannel);
            }
            vk.h hVar2 = new vk.h(0, 1000);
            j.f(aVar, "random");
            try {
                notificationManager.notify(l0.m0(aVar, hVar2), pVar.a());
                RemoteMessage.a Q014 = remoteMessage.Q0();
                j.c(Q014);
                if (j.a(Q014.f7607c, "OPEN_NOTIFICATION")) {
                    Intent intent3 = new Intent("BROADCAST_MAIN");
                    intent3.putExtra("NOTIFICATION", "NOTIFICATION");
                    intent3.putExtra("NOTIFICATION_DATA", new bc.h().i(remoteMessage.P0()));
                    u2.a.a(this).c(intent3);
                    e.h(this);
                }
            } catch (IllegalArgumentException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        } catch (IllegalArgumentException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    public final void f(String str) {
        j.f(str, "token");
        int i10 = kf.h.f12560a;
        b bVar = this.f19910r;
        if (bVar != null) {
            bVar.f20850a.edit().putString("FCM_TOKEN", str).apply();
        } else {
            j.l("sharedPrefsHelper");
            throw null;
        }
    }
}
