package com.luck.picture.lib.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.a;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$string;
import i1.p;
import ke.b;

public class ForegroundService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8128a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f8129b = false;

    static {
        StringBuilder q10 = a.q("com.luck.picture.lib.");
        q10.append(ForegroundService.class.getName());
        f8128a = q10.toString();
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        String str;
        super.onCreate();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (i12 >= 26) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            NotificationChannel notificationChannel = new NotificationChannel(f8128a, "com.luck.picture.lib", i10);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.canBypassDnd();
            notificationChannel.setBypassDnd(true);
            notificationChannel.setLockscreenVisibility(0);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
        }
        if (b.a().b().f12517a == 3) {
            i11 = R$string.ps_use_sound;
        } else {
            i11 = R$string.ps_use_camera;
        }
        String string = getString(i11);
        p pVar = new p(this, f8128a);
        pVar.f10992w.icon = R$drawable.ps_ic_trans_1px;
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.loadLabel(getPackageManager()).toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            str = "";
        }
        pVar.f10974e = p.b(str);
        pVar.f10975f = p.b(string);
        pVar.c(2, true);
        startForeground(1, pVar.a());
    }

    public final void onDestroy() {
        f8129b = false;
        stopForeground(true);
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        f8129b = true;
        return super.onStartCommand(intent, i10, i11);
    }
}
